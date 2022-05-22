public abstract class Account {
    protected int accountID;

    public Account() {
    }

    public Account(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public abstract double calculateSales();

    @Override
    public String toString() {

        return ("Account#:" + accountID + "\n");
    }
}