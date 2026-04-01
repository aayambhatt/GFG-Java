package java_reborn.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] rollNo = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 values to be filled in array: ");

        for(int i = 0 ; i < rollNo.length ; i++){
            rollNo[i] = input.nextInt();
        }

        System.out.println("Array you made: " + Arrays.toString(rollNo));

        int max = MIN_VALUE;
        int min = MAX_VALUE;
        int sum = 0;

        for(int j : rollNo){
            sum += j;

            if(j>max){
                max = j;
            }

            if(j<min){
                min = j;
            }

        }


        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);


    }
}
