import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Ex1SimpleClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        try (Socket socket = new Socket("localhost", 12345);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

            while (true) {
                String data = ThreadLocalRandom.current().nextInt() % 5 == 0 ? "stop\n" : "Ping\n";
                writer.write(data);
                writer.flush();
                if ("stop".equals(data)) {
                    break;
                }

                String answer = reader.readLine();
                System.out.println("Response: " + answer);
            }
        }
    }
}
