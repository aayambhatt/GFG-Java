package interfaces;

/*
This is a functional interface, as there is only one abstract method, hence we don't need to have another
class implement it...we can leverage the power of lambdas
 */

public interface Payment {
    void pay(int amount);
}
