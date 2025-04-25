import taxes.TaxSystem;
import deals.Deal;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0;
        this.credit = 0;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int taxes = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxes + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            shiftMoney(deal.getDebitChange());
            shiftMoney(-deal.getCreditChange());
            System.out.println(deal.getComment());
        }

        int debitMinusCredit = debit - credit;
        payTaxes();
        return debitMinusCredit;
    }

    public String getTitle() {
        return title;
    }
}
