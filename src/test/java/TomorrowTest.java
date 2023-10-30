import org.example.Tomorrow;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class TomorrowTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/Tomorrow_data.csv", numLinesToSkip = 1)
    void testGetNextDayCsvFileSource(String date, String expectedNextDay) {
        // 驗證 getNextDay 方法的預期隔天日期與計算結果是否相符
        Assertions.assertEquals(expectedNextDay, Tomorrow.getNextDay(date));
    }
}
