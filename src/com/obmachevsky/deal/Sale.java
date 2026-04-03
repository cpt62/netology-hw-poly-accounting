package com.obmachevsky.deal;

public class Sale extends Deal {
    private String nameOfSale; // В моем примере это будет оплата услуги обучения
    private int price;

    public Sale(String nameOfService, int price) {
        super(nameOfService, 0, price);
    }

    @Override
    public int getPrice() {
        int price = super.getPrice();
        System.out.printf("Продажа - %s на %d руб.\n", getComment(), price);
        return price;
    }
}

