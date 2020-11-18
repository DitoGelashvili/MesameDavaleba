package ge.edu.btu.chat.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket chatServerSocket = new ServerSocket(8087);
        Socket socket = chatServerSocket.accept();

        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        ServerThread serverThread = new ServerThread();
        Thread thread = new Thread(serverThread);
        thread.start();

        objectInputStream.close();
        chatServerSocket.close();
    }
}
