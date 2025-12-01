package Days;

import utility.FileReader;

import java.util.ArrayList;

public class Day1 {

    public Day1() {

        ArrayList<String> inputList = new FileReader("resources/D1/input").fileReaderArrayList();
        Rotator rotator = new Rotator();
        System.out.println("D1/1 - The actual password: " + rotator.method(inputList, "old"));
        rotator = new Rotator();
        System.out.println("D1/2 - The new password: " + rotator.method(inputList, "new"));
    }

    public static class Rotator {
        int poz = 50;
        int meetsZero = 0;

        private void LRotationOneStep() {
            poz--;
            if (poz < 0) {
                poz = 99;

            }
            if (poz == 0) {
                meetsZero++;
            }
        }

        private void RRotationOneStep() {
            poz++;
            if (poz > 99) {
                poz = 0;
            }
            if (poz == 0) {
                meetsZero++;
            }
        }

        private int doTheRotation(ArrayList<String> inputList, String method) {
            int result = 0;
            for (String s : inputList) {
                int val = Integer.parseInt(s.strip().substring(1));
                if ('L' == s.charAt(0)) {
                    for (int i = 0; i < val; i++) {
                        LRotationOneStep();
                    }
                } else {
                    for (int i = 0; i < val; i++) {
                        RRotationOneStep();
                    }
                }
                if (getPos() == 0 && method.equals("old")) {
                    result++;
                }
            }
            if (method.equals("old")) {
                result -= getMeetsZero();
            }
            return result;
        }

        public int method(ArrayList<String> inputList, String method) {
            return doTheRotation(inputList, method) + getMeetsZero();

        }

        private int getPos() {
            return poz;
        }

        private int getMeetsZero() {
            return meetsZero;
        }
    }


}
