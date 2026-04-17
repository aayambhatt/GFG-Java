package servertest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Jserver {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);

            while (true) {

                Socket client = server.accept(); // returns a new socket
                InputStream browserSentMeThis = client.getInputStream();
                System.out.println(new BufferedReader(new InputStreamReader(browserSentMeThis)).readLine());

                DataOutputStream out = new DataOutputStream(client.getOutputStream());
                out.writeBytes("HTTP/1.1 200 OK\r\n");
                out.writeBytes("Content-Type: text/html\r\n\r\n");
                out.writeBytes("<html><head></head><body><h1>Aayam</h1></body></html>");

                out.flush();
                out.close();

                System.out.println("done");
                System.out.println(client.getInetAddress()); // equivalent of IPv4’s 127.0.0.1 address.

            }
        }
        catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
