package paymentProcessing;

public class PaymentService {

    public static void executePayment(PaymentProcessor processor, PaymentRequest request) {
        try {
            processor.process(request);
            System.out.println("Payment successful\n");
        } catch (InvalidPaymentException e) {
            System.out.println("Payment failed: " + e.getMessage() + "\n");
        }
    }
}
