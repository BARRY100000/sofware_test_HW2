package org.example;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeek {
    public static String getDayOfWeek(int month, int day) {
        // 創建 LocalDate 物件來表示給定的日期
        LocalDate date = LocalDate.of(2021, month, day);

        // 使用該日期的 DayOfWeek 方法並指定語言環境和顯示樣式，返回星期幾的全稱
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
    }
}
