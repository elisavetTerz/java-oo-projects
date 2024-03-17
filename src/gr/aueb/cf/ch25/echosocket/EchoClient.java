package gr.aueb.cf.ch25.echosocket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try {
            InetAddress servAddr = InetAddress.getByName("127.0.0.1");
            final int servPort = 7;
            Socket sockfd = new Socket(servAddr, servPort);
            PrintWriter outfd = new PrintWriter(
                    sockfd.getOutputStream(), true);
            BufferedReader infd = new BufferedReader(
                    new InputStreamReader(sockfd.getInputStream()));

            File file = new File("/Users/elisavet/Downloads/socketFile.txt");
            Scanner in = new Scanner(file);
            String userInput = null;
            do {
                userInput = in.nextLine();
                outfd.println(userInput);
                outfd.flush();
                System.out.println("Echo from Server: " + infd.readLine());
            } while (!userInput.equals("BYE"));

            sockfd.close();
            in.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
