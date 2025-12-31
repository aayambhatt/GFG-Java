package paymentProcessing;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor<Integer> payByAmount = (amount) -> {
            if (amount == null || amount <= 0) {
                throw new InvalidPaymentException("Amount must be greater than zero");
            }
            System.out.println("₹" + amount + " received via cash");
        };

        PaymentProcessor<String> payByUPI = (upiId) -> {
            if (upiId == null || upiId.trim().isEmpty()) {
                throw new InvalidPaymentException("Invalid UPI ID");
            }
            System.out.println("UPI ID " + upiId + " received payment");
        };

        PaymentService.executePayment(payByAmount, 500);
        PaymentService.executePayment(payByAmount, -10);

        PaymentService.executePayment(payByUPI, "abc@upi");
        PaymentService.executePayment(payByUPI, " ");
    }
}
