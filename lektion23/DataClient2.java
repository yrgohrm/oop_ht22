import java.io.*;
import java.net.*;
import java.util.*;

public class DataClient2 {
    public static void main(String[] args) throws IOException {
        try (Scanner input = new Scanner(System.in);
                Socket s = new Socket("localhost", 6543);
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                DataInputStream dis = new DataInputStream(s.getInputStream())) {

            System.out.println("amount?");
            int amount = input.nextInt();

            dos.writeInt(amount);
            for (int i = 0; i < amount; i++) {
                dos.writeInt(i);
            }
            dos.flush();

            for (int i = 0; i < amount; i++) {
                System.out.println(dis.readInt());
            }
        }
    }
}
