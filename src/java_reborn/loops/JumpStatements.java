package java_reborn.loops;

public class JumpStatements {
    public static void main(String[] args) {
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(i);
            if(i==5){
                break;
            }
//            System.out.println(i);
        }

        // whether number is prime or not
        int b = 9;
        //2,3,4,5...8
        for(int i = 2 ; i<b ; i++){
            if(b % i ==0){
                System.out.println("Not a prime number");
                break;
            }

        }
    }
}
