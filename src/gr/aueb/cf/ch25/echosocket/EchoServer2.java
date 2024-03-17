
package gr.aueb.cf.ch25.echosocket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 extends Thread {
    ServerSocket servfd;
    final int serverPort = 7;

    @Override
    public void run() {
        try {
            servfd = new ServerSocket();
            servfd.bind(new InetSocketAddress("127.0.0.1", serverPort), 3);
            System.out.println("Echo Server is ready for accepting connections ..");
            while (true) {
                Socket connectedfd = servfd.accept();

                PrintWriter outfd = new PrintWriter(connectedfd.getOutputStream(), true);
                BufferedReader infd = new BufferedReader(new InputStreamReader(connectedfd.getInputStream()));
                System.out.printf("Client connected on port " + serverPort + ". Servicing requests.");
                String inputLine;
                do {
                    inputLine = infd.readLine();
                    outfd.println(inputLine);
                } while (!inputLine.equals("BYE"));
                connectedfd.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class EchoServ {
        public static void main(String[] args) {
            EchoServer2 es = new EchoServer2();
            es.start();
        }
    }
}


