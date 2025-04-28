public class CreditAccount extends Account {
    public CreditAccount(long limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= limit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
