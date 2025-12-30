package interfaces;

public class LamdaPlayInInterface {
    public static void main(String[] args) {
        Payment c1 = (amount) -> {
            System.out.println("Credit card payment: " + amount);
        };
        c1.pay(100);


        Payment u1 = (amount) -> {
            System.out.println("UPI payment: " + amount);
        };
        u1.pay(500);
    }
}
