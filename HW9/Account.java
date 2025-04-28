public abstract class Account {
    protected long balance;
    protected long limit;

    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (balance - amount < limit) {
            return false;
        } else if (account.add(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }
}
