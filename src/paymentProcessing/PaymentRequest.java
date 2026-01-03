package paymentProcessing;

public class PaymentRequest {

    private String userId;
    private double amount;
    private String paymentMethod;

    // Constructor
    public PaymentRequest(String userId, double amount, String paymentMethod) {
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // Setters (optional if object is immutable)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "userId='" + userId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
