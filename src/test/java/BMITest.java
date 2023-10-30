import org.example.BMI;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class BMITest {
    @ParameterizedTest
    @CsvFileSource(resources = "/BMI_data.csv", numLinesToSkip = 1)
    void testCalculateBMICsvFileSource(double height, double weight, double expectedBMI) {
        // 驗證計算出來的 BMI 與預期的 BMI 相符
        Assertions.assertEquals(expectedBMI, BMI.calculateBMI(height, weight), 0.01);
    }
}
