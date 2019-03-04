package ServerClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerThread implements Runnable {
    private int port;
    private ServerSocket serverSocket;
    private boolean running = false;
    private Thread currentThread;
    private ExecutorService threadpool = Executors.newCachedThreadPool();

    public ServerThread(int port) {
        this.port = port;
    }

    /**
     * Runs the server thread on the given port and creates a thread with this running.
     */
    @Override
    public void run() {

        // Ensures current thread is synchronized
        synchronized (this) {
            this.currentThread = Thread.currentThread();
        }

        startServer();

        while (running) {
            Socket clientSocket = null;
            try {
                clientSocket = this.serverSocket.accept();
            } catch (IOException e) {
                if (!running) {
                    System.out.println("Server is stopped");
                    return;
                }
                System.out.println("Problem accepting connection");
            }
            threadpool.execute(new ThreadRunner(clientSocket));

        }
    }

    /**
     * Used internally to start a server running on the given port.
     */
    private void startServer() {
        try {
            this.serverSocket = new ServerSocket(this.port);
            running = true;
        } catch (IOException e) {
            System.out.println("Problem starting server on port: " + this.port);
        }
    }

    /**
     * Used externally to stop the server running
     */
    public synchronized void stopServer() {
        this.running = false;
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            System.out.println("Problem stopping server.");
        }
    }




}
