import com.obmachevsky.deal.Deal;
import com.obmachevsky.deal.Sale;
import com.obmachevsky.taxes.TaxSystem;

class Company {
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
        System.out.println();
        System.out.printf("debit - %d, credit - %d\n", debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.", getTitle(), tax);
        System.out.println();
        debit = credit = 0;
    }

    protected int applyDeals(Deal[] deals) throws InterruptedException {
        for (Deal deal : deals) {
            shiftMoney(deal.getPrice());
            Thread.sleep(300);
        }
        int debitResult = debit, creditResult = credit;
        payTaxes();
        return debitResult - creditResult;
    }
}
