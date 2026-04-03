package com.obmachevsky.deal;

public class Sale extends Deal {
    private String nameOfSale; // В моем примере это будет оплата услуги обучения
    private int price;

    public Sale(String nameOfService, int price) {
        super(nameOfService, 0, price);
    }

    public String getNameOfSale() {
        return nameOfSale;
    }

    public int getPrice() {
        return price;
    }
}

