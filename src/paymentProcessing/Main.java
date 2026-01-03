package paymentProcessing;

public class Main {
    public static void main(String[] args) {
        // Lambda for credit card payments
        PaymentProcessor creditCardProcessor = (request) -> {
            if (request.getAmount() <= 0) {
                throw new InvalidPaymentException("Amount must be greater than zero");
            }
            if (request.getPaymentMethod() == null || request.getPaymentMethod().trim().isEmpty()) {
                throw new InvalidPaymentException("Payment method missing");
            }
            System.out.println("Credit Card Payment for user: " + request.getUserId() +
                    ", amount: " + request.getAmount() +
                    ", method: " + request.getPaymentMethod());
        };

        // Lambda for UPI payments
        PaymentProcessor upiProcessor = (request) -> {
            if (request.getAmount() <= 0) {
                throw new InvalidPaymentException("Amount must be greater than zero");
            }
            if (request.getPaymentMethod() == null || request.getPaymentMethod().trim().isEmpty()) {
                throw new InvalidPaymentException("Payment method missing");
            }
            System.out.println("UPI Payment for user: " + request.getUserId() +
                    ", amount: " + request.getAmount() +
                    ", UPI ID: " + request.getPaymentMethod());
        };

        // Execute payments
        PaymentRequest creditPayment = new PaymentRequest("Aayam", 500, "Visa-1234");
        PaymentRequest upiPayment = new PaymentRequest("Aaryan", 1000, "HSBC12345IX");

        PaymentService.executePayment(creditCardProcessor, creditPayment);
        PaymentService.executePayment(upiProcessor, upiPayment);

        // Example of failing payment
        PaymentRequest invalidPayment = new PaymentRequest("Rohit", -100, "");
        PaymentService.executePayment(creditCardProcessor, invalidPayment);
    }
}
