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
        int debitMinusCredit = company.applyDeals(deals);
        System.out.println("Компания " + company.getTitle() + " после применения сделок оказалась в плюсе на момент старта уплаты налогов на " + debitMinusCredit + " руб.");
    }
}
