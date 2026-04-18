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

                BufferedReader br = new BufferedReader(new InputStreamReader(browserSentMeThis));
                String firstLine = br.readLine();
                System.out.println(firstLine);
                String[] parts = firstLine.split(" ");
                String path = parts[1];

                if(path.equals("/about")){
                   sendResponse(client, "200 OK", "<h1>About</h1>");
                }

                else if(path.equals("/")) {
                    sendResponse(client, "200 OK", "<h1>Home</h1>");
                }

                else {
                    sendResponse(client, "404 Not Found", "<h1>Not Found</h1>");
                }
                System.out.println("done");
                System.out.println(client.getInetAddress()); // equivalent of IPv4’s 127.0.0.1 address.

            }
        }
        catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
    }

    static void sendResponse(Socket client, String status, String body){
        try{
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeBytes(  "HTTP/1.1 " +  status + "\r\n");
            out.writeBytes("Content-Type: text/html\r\n\r\n");
            out.writeBytes(body);

            out.flush();
            out.close();

        } catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
