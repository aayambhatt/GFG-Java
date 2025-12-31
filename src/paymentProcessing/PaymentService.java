package paymentProcessing;

public class PaymentService {

    // If a method has its own generic type,
    //it must be declared before the return type, type declaration
    //This method introduces a generic type called T, This method returns nothing (void)
    public static <T> void executePayment(PaymentProcessor<T> processor, T details)  {
        try {
            processor.process(details);
            System.out.println("Payment successful\n");
        } catch (InvalidPaymentException e) {
            System.out.println("Payment failed: " + e.getMessage() + "\n");
        }
    }
}
