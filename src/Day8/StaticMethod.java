package Day8;

public class StaticMethod {
    public static void greet(){
        System.out.println("Hello User!");
    }

    public static void main(String[] args) {
        // Calling method directly
        greet();

        // Using class name
        StaticMethod.greet();
    }
}
