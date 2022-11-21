import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Ovn1Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 6543)) {
            handleClient(socket);
        }
        catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private static void handleClient(Socket client) throws IOException {
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        int number = ThreadLocalRandom.current().nextInt(10000);
        dos.writeInt(number);
        dos.flush();

        int numberFromServer = dis.readInt();

        if (number < numberFromServer) {
            System.out.println("Tjohoo!");
        }

        System.out.println(number + " " + numberFromServer);
    }
}
