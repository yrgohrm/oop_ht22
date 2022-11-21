import java.io.*;
import java.net.*;

public class Ex1SimpleServer {
    public static void main(String[] args) throws IOException {
        // NB! This code is lacking a lot of try-with-resources for clarity
        ServerSocket server = new ServerSocket(12345);

        // the program will wait here until someone connects
        Socket connectionToClient = server.accept();

        System.out.println("accepted");

        InputStream is = connectionToClient.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        OutputStream os = connectionToClient.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));

        while (true) {
            String data = reader.readLine();
            if ("stop".equals(data)) {
                break;
            }

            System.out.println(data);
            writer.write("Pong\n");
            writer.flush();
        }
        
        connectionToClient.close();
        server.close();
    }
}