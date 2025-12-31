package paymentProcessing;

public interface PaymentProcessor<T> {
    void process(T details);
}
