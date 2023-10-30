package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CurrencyTest_data.csv", numLinesToSkip = 1)
    void testAdd(double amount1, String symbol1, double amount2, String symbol2, double expectedAmount, String expectedSymbol) {  // 參數和預期值型別更改為 double
        // 創建兩個貨幣對象
        Currency currency1 = new Currency(amount1, symbol1);
        Currency currency2 = new Currency(amount2, symbol2);

        // 使用 add 方法進行貨幣相加
        Currency result = currency1.add(currency2);

        // 斷言：驗證預期的貨幣總額和貨幣符號
        assertEquals(expectedAmount, result.getAmount(), 0.1);  // 添加誤差參數以處理浮點數比較
        assertEquals(expectedSymbol, result.getSymbol());
    }
}
