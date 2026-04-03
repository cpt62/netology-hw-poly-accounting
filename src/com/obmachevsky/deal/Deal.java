package com.obmachevsky.deal;

public class Deal {
    private String comment;
    private int creditChange;
    private int debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return comment;
    }

    public int getPrice() {
        return creditChange == 0 ? debitChange : creditChange;

    }
}


