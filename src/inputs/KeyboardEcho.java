package inputs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardEcho {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your text: ");
            String s = br.readLine();
            System.out.println("Text you entered: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
