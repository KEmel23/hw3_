public class BackAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    double dipozit;
    int withDraw;

    private int withDraw() {
        return 0;
    }
    public BackAccount(double initialBalance){
        this.amount = initialBalance;
    }


    public void withdraw(double amount) {
        if (amount > amount || amount < 200000 ) {
            try {
                throw new LimitException("Превышен лимит снятия. Максимальная сумма для снятия: " + amount + " сом");
            } catch (LimitException e) {
                throw new RuntimeException(e);
            }
        }
        amount -= amount;

    }
}
