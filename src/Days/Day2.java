package Days;

import utility.FileReader;

import java.util.ArrayList;

public class Day2 {
    public Day2() {
        String text = new FileReader("resources/D2/input").fileReaderString();
        System.out.println("D3/1 - sum of invalid IDs: " + sumArray(processing(text)));
//        System.out.println("D2/2 - Santa enters to the basement at: " + findFirstBasementCoord(text));
    }

    static public long sumArray(ArrayList<Long> in) {
        long result = 0;
        for (long integer : in) {
            result += integer;
        }
        return result;
    }

    static public ArrayList<Long> processing(String text) {
        ArrayList<Long> result = new ArrayList<>();
        for (String i : text.split(",")) {
            result.addAll(invalidIDs(i));
        }
        return result;
    }


    static ArrayList<Long> invalidIDs(String value) {
        ArrayList<Long> result = new ArrayList<>();
        long min = Long.parseLong(value.split("-")[0]);
        long max = Long.parseLong(value.split("-")[1]);
        for (long i = min; i <= max; i++) {
            if (validate(i)) {
                result.add(i);
            }
        }

        return result;
    }

    static boolean validate(long num) {
        boolean result = false;
        String strNum = String.valueOf(num);
        if (strNum.length() % 2 == 1) {
            return false;
        } else {
            int half = strNum.length() / 2;
            if (strNum.substring(0, half).equals(strNum.substring(half))) {
                return true;
            }
        }
        return result;
    }

}
