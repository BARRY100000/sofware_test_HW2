package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/day_of_week_data.csv", numLinesToSkip = 1)
    void testGetDayOfWeekCsvFileSource(int month, int day, String expectedDayOfWeek) {
        // 使用 CSV 檔案中的資料來測試 getDayOfWeek 方法
        // 將預期的星期幾與計算得到的星期幾進行比對
        assertEquals(expectedDayOfWeek, DayOfWeek.getDayOfWeek(month, day));
    }
}
