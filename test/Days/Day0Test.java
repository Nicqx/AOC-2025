package Days;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.Assert;
import utility.FileReader;

import static Days.Day0.findLastPosition;

@DisplayName("Testing the Day0 class")
class Day0Test {
    @ParameterizedTest
    @ValueSource(strings = {"input1:0"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D0/" + files.split(":")[0];
        String text = new FileReader(inputFile).fileReaderString();
        Assert.assertEquals(findLastPosition(text), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"input10:1", "input11:5"})
//    void checkSecondPart(String files) {
//        String inputFile = "test-resources/D0/" + files.split(":")[0];
//        String text = new FileReader(inputFile).fileReaderString();
//        Assert.assertEquals(findFirstBasementCoord(text), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"input:74:1795"})
//    void checkOriginalInput(String files) {
//        String inputFile = "resources/D0/" + files.split(":")[0];
//        String text = new FileReader(inputFile).fileReaderString();
//        Assert.assertEquals(findLastPosition(text), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
//        Assert.assertEquals(findFirstBasementCoord(text), Integer.parseInt(files.split(":")[2]), "Expected result is not correct");
//    }
}