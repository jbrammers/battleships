package ServerClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ThreadRunner implements Runnable {
    protected Socket clientSocket;

    public ThreadRunner(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            // Opens data streams and sends a message to the client saying connection was established
            InputStream input = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();
            out.write(("Connection made at " + System.currentTimeMillis()).getBytes());

            // Prints current thread and iterator and waits 5000ms between each
            for (int i = 5; i > 0; i--) {
                System.out.println(Thread.currentThread() + " " + i);
                Thread.sleep(5000);
            }

            // Once a thread has iterated through it will print that it is closing and then end
            System.out.println(Thread.currentThread() + " closed.");
            out.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
