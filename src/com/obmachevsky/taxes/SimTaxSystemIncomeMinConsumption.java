package com.obmachevsky.taxes;

public class SimTaxSystemIncomeMinConsumption extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int result = (debit - credit) * 15 / 100;
        return Math.max(result, 0);
    }
}
