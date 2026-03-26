package java_reborn.loops;

public class Loops {
    public static void main(String[] args) {
        // comma seprated version
        for (int i = 1, j = 1 ; i <= 10; i++, j+=2){
            System.out.println(i*j);
        }

        System.out.println();

        for(int i = 1 ; i<=5 ; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }


}
