import com.obmachevsky.taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    protected Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    protected void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    protected String getTitle() {
        return title;
    }


    protected void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    protected void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.", getTitle(), tax);
        debit = credit = 0;
    }
}
