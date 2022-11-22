import java.io.*;
import java.net.*;
import java.util.*;

public class DataServer2 {
    public static void main(String[] args) throws IOException {
        try (                ServerSocket s = new ServerSocket(6543);
                Socket client = s.accept()) {

            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());

            int amount = dis.readInt();

            for (int i = 0; i < amount; i++) {
                System.out.println(dis.readInt());
            }

            for (int i = 0; i < amount; i++) {
                dos.writeInt(5);
            }
            dos.flush();
        }
    }
}
