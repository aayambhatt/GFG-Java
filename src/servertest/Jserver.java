package servertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Jserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket client = server.accept();
        InputStream browserSentMeThis = client.getInputStream();
        System.out.println(new BufferedReader(new InputStreamReader(browserSentMeThis)).readLine());
        System.out.println("done");
        System.out.println(client.getInetAddress()); // equivalent of IPv4’s 127.0.0.1 address.
    }
}
