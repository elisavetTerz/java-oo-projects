package gr.aueb.cf.ch25.fileReaderServerApp;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int serverPort = 12345;


        try (Socket socket = new Socket(serverAddress, serverPort);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String filePath = "/Users/elisavet/Desktop/something.txt";
            out.println(filePath);

            // Receive file contents from server
            String fileContent = in.readLine();
            System.out.println("File content received from server: " + fileContent);

            // Print file content to terminal
            System.out.println("Contents of the file:");
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

