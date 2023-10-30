package org.example;

public class Currency {

    private double amount;
    private String symbol;

    public Currency(double amount, String symbol) {
        this.amount = amount;
        this.symbol = symbol;
    }

    public Currency add(Currency other) {
        if (this.symbol.equals("US") && other.symbol.equals("NT")) {
            // 將其他貨幣從新台幣轉換為美元並四捨五入至最接近的整數
            double otherAmount = Math.round(other.amount / 30.0);
            double totalAmount = this.amount + otherAmount;
            return new Currency(totalAmount, "US");
        } else if (this.symbol.equals("NT") && other.symbol.equals("US")) {
            // 將其他貨幣從美元轉換為新台幣
            double otherAmount = other.amount * 30.0;
            double totalAmount = this.amount + otherAmount;
            return new Currency(totalAmount, "NT");
        } else {
            // 兩種貨幣相同，無需轉換
            double totalAmount = this.amount + other.amount;
            return new Currency(totalAmount, this.symbol);
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.format("%.1f, %s", amount, symbol);
    }
}
