package Day5;


import java.util.Scanner;

class Check{
    boolean func(int x){
        if(x%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}


public class EvenOdd {
    public static void main(String[] args) {
        Check obj = new Check();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num = input.nextInt();

        System.out.println("Check results: " + obj.func(num));


    }
}
