package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.print("Type Number: ");
                String line = br.readLine();

                try{
                    int num = Integer.parseInt(line);
                    System.out.println("Number you typed: " + num);
                    break;

                } catch (NumberFormatException e){
                    System.out.println("Enter a valid number!");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
