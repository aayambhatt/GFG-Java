package Day6;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number here: ");
        int x = input.nextInt();

        if(x>=18 && x<30){
            System.out.println("You are eligible to take part");
        } else if (x>=30) {
            System.out.println("You are too old to participate");

        }
        else {
            System.out.println("You are under the age criteria");
        }
    }

}
