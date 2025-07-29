package Day5;

public class Print {
    public static void main(String[] args) {
        // using print() all texts will be printed on same line
        System.out.print("Text1 ");
        System.out.print("Text2 ");
        System.out.print("Text3 \n");

        // using println() all texts will be printed in different lines
        System.out.println("Hello");
        System.out.println("Namaste");
        System.out.println("Hola\n");

        // printf()
        int x = 100;
        System.out.printf("Simple integer: x = %d%n%n ", x);

        double pi = 3.14159;
        String city = "Zurich";

        System.out.printf("City: %s, Pi: %.2f%n%n", city, pi);

        // System.err
        // Using print()
        System.err.print("This is an error message using print().\n");

        // Using println()
        System.err.println("This is another error message using println().");

        //Using printf()
        System.err.printf("Error code: %d, Message: %s%n", 404, "Not Found");

    }
}
