import java.io.*;
import java.net.*;

public class DataClient {
    public static void main(String[] args) throws IOException {
        try (Socket s = new Socket("localhost", 6543);
             DataOutputStream dos = new DataOutputStream(s.getOutputStream());
             DataInputStream dis = new DataInputStream(s.getInputStream())) {


            dos.writeInt(1);
            dos.writeInt(2);
            dos.writeInt(3);
            dos.writeInt(4);
            dos.writeInt(5);
            dos.flush();

            for (int i = 0; i < 5; i++) {
                System.out.println(dis.readInt());
            }
        }
    }
}
