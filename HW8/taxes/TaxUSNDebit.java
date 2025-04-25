package taxes;

public class TaxUSNDebit extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int)(0.06 * debit);
    }
}
