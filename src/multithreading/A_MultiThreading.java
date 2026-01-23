package multithreading;

public class A_MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started");

        for(int i = 1 ; i<=5 ; i++){
            System.out.println("Working: " + i);
            Thread.sleep(1000);
        }

        System.out.println("End");
    }

}
