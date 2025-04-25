package taxes;

public class TaxUSNDebitMinusCredit extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int)(0.15 * ((debit >= credit) ? (debit - credit) : 0));
    }
}
