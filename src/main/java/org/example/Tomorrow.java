package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tomorrow {
    public static String getNextDay(String date) {
        // 將輸入的日期字串轉換為 LocalDate 物件，使用 ISO_LOCAL_DATE 格式
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);

        // 取得輸入日期的隔天日期
        LocalDate nextDay = localDate.plusDays(1);

        // 將隔天日期轉換為字串，使用 ISO_LOCAL_DATE 格式
        return nextDay.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
