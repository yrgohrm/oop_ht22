import java.io.*;
import java.net.*;

public class Ovn1Server {
    public static void main(String[] args) {
        try (ServerSocket ssock = new ServerSocket(6543); 
                Socket client = ssock.accept()) {
            handleClient(client);
        }
        catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private static void handleClient(Socket client) throws IOException {
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        int number = dis.readInt();
        dos.writeInt(number+1);
        dos.flush();
        System.out.println(number);
    }
}
