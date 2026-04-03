package com.obmachevsky.deal;

public class Expenditure extends Deal{
    private String nameOfExpenditure;
    private int price;

    public Expenditure(String nameOfExpenditure, int price) {
        super(nameOfExpenditure, -price, 0);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice();
        System.out.printf("Трата - %s на %d руб.\n", getComment(), Math.abs(price));
        return price;
    }

}
