import java.io.*;
import java.net.*;
import java.util.*;

public class DataServer {
    public static void main(String[] args) throws IOException {
        try (Scanner input = new Scanner(System.in);
                ServerSocket s = new ServerSocket(6543);
                Socket client = s.accept()) {

            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());

            for (int i = 0; i < 5; i++) {
                System.out.println(dis.readInt());

                System.out.println("Tyckte du det var ett bra tal?");
                input.nextLine();
            }

            dos.writeInt(9);
            dos.writeInt(8);
            dos.writeInt(7);
            dos.writeInt(6);
            dos.writeInt(5);
            dos.flush();
        }
    }
}
