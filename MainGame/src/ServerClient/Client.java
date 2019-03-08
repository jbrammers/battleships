package ServerClient;

import GUI.MessengerController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private static int portNumber = 3000;
    private static boolean connected = true;

    public static void main(String args[]) throws InterruptedException {
        try {
            // Open connection on port number, throws exception if not found
            Socket client = new Socket("localhost", portNumber);
            client.setKeepAlive(true);

            // Prints connection established message
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

            // Output client
            PrintWriter output = new PrintWriter(
                    client.getOutputStream(), true);

            ActionListener sendMessage = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.println(MessengerController.getMostRecentMessage());
                }
            };
            // TODO add an action listener for the messenger here
            ActionListener recieveMessage = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String receivedMessage = input.readLine();
                        MessengerController.printReceivedMessage(receivedMessage);
                    }
                    catch(IOException o) {
                        o.printStackTrace();
                    }
                }
            };



            // Listens for inputs whilst open
            while (!client.isClosed()) {
                String nextLine = input.readLine();
                if (nextLine == null) {Thread.sleep(4000);}
                else if (nextLine.startsWith("CLIENT_CLOSE")) {
                    System.out.println("Closing service");
                    connected = false;
                    input.close();
                    client.close();
                }
                else {
                    System.out.println(nextLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
