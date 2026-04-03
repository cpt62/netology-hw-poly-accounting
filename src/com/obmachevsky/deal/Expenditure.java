package com.obmachevsky.deal;

public class Expenditure extends Deal{
    private String nameOfExpenditure;
    private int price;

    public Expenditure(String nameOfExpenditure, int price) {
        super(nameOfExpenditure, price, 0);
    }

    public String getNameOfExpenditure() {
        return nameOfExpenditure;
    }

    public int getPrice() {
        return price;
    }
}
