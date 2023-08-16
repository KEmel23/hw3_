public class BackAccount {
    private double amount;

    public double getAmount() {
        return amount;

    }
    public void depozit(double sum){
        this.amount= sum;
    }
    public void withDraw (int sum) throws LimitException{
       if (sum > amount){
           throw new LimitException("Нельзя снять", getAmount());
       }
       this.amount -= sum;
    }

}

