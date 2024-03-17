package gr.aueb.cf.ch25;

import java.io.*;
import java.net.Socket;

public class ConcurrentServerFileReader extends Thread {
    private final Socket socketFd;
    private final String filePath;
    // Server creates a copy/fork of itself
    public ConcurrentServerFileReader(Socket sockFd, String filePath) {
        this.socketFd = sockFd;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (
                BufferedReader fr = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socketFd.getOutputStream()))
        ) {
            String line;
            while ((line = fr.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
