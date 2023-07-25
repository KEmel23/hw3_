public class LimitException extends Throwable {
    String masseng;
    private double remainingAmount;

    public LimitException(String message) {
        super(message);
        this.masseng = message;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
