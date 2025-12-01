package Days;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.Assert;
import utility.FileReader;

import java.util.ArrayList;


@DisplayName("Testing the Day1 class")
public class Day1Test {
    @ParameterizedTest
    @ValueSource(strings = {"input1:3"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D1/" + files.split(":")[0];
        ArrayList<String> text = new FileReader(inputFile).fileReaderArrayList();
        Day1.Rotator rotator = new Day1.Rotator();
        Assert.assertEquals(rotator.method(text, "old"), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"input1:6"})
    void checkSecondPart(String files) {
        String inputFile = "test-resources/D1/" + files.split(":")[0];
        ArrayList<String> text = new FileReader(inputFile).fileReaderArrayList();
        Day1.Rotator rotator = new Day1.Rotator();
        Assert.assertEquals(rotator.method(text, "new"), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"input:1165:6496"})
    void checkOriginalInput(String files) {
        String inputFile = "resources/D1/" + files.split(":")[0];
        ArrayList<String> text = new FileReader(inputFile).fileReaderArrayList();
        Day1.Rotator rotator = new Day1.Rotator();
        Assert.assertEquals(rotator.method(text, "old"), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
        rotator = new Day1.Rotator();
        Assert.assertEquals(rotator.method(text, "new"), Integer.parseInt(files.split(":")[2]), "Expected result is not correct");
    }
}
