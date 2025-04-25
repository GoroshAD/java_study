import taxes.*;
import deals.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Seal", new TaxUSNDebit());
        company.shiftMoney(100);
        company.shiftMoney(-10);
        company.shiftMoney(0);
        company.payTaxes();

        company.setTaxSystem(new TaxUSNDebitMinusCredit());
        company.shiftMoney(100);
        company.shiftMoney(-10);
        company.shiftMoney(0);
        company.payTaxes();

        Deal[] deals = new Deal[]{
                new Sale("box", 50),
                new Expenditure("bowling", 100),
                new Sale("mug", 200)
        };
        company.applyDeals(deals);
    }
}
