package com.obmachevsky.taxes;

public class SimTaxSystemIncome extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max(debit / 100 * 6, 0);
    }
}
