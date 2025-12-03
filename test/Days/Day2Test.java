package Days;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.Assert;
import utility.FileReader;

import static Days.Day2.processing;
import static Days.Day2.sumArray;


@DisplayName("Testing the Day2 class")
public class Day2Test {
    @ParameterizedTest
    @ValueSource(strings = {"test1:33"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test2:99"})
    void checkFirstPart2(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test3:1010"})
    void checkFirstPart3(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test4:1188511885"})
    void checkFirstPart4(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test5:222222"})
    void checkFirstPart5(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test6:0"})
    void checkFirstPart6(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test7:446446"})
    void checkFirstPart7(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test8:38593859"})
    void checkFirstPart8(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"test9:1227775554"})
    void checkFirstPart9(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"input1:35367539282"})
//    void checkSecondPart(String files) {
//        String inputFile = "test-resources/D2/" + files.split(":")[0];
//        ArrayList<String> text = new FileReader(inputFile).fileReaderArrayList();
//        Day1.Rotator rotator = new Day1.Rotator();
//        Assert.assertEquals(rotator.method(text, "new"), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"input:35367539282:6496"})
//    void checkOriginalInput(String files) {
//        String inputFile = "resources/D2/" + files.split(":")[0];
//        String text = new FileReader(inputFile).fileReaderString();
//        Assert.assertEquals(sumArray(processing(text)), Long.parseLong(files.split(":")[1]), "Expected result is not correct");
//        rotator = new Day1.Rotator();
//        Assert.assertEquals(rotator.method(text, "new"), Integer.parseInt(files.split(":")[2]), "Expected result is not correct");
//    }
}
