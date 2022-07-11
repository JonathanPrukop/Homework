import java.io.*;

import java.util.Objects;
import java.net.*;
import java.time.*;

public class listen {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out;
        InputStream inStream;
        try (Socket sock = new Socket("172.223.89.89", 4000)) {
            OutputStream outStream = sock.getOutputStream();//retrieves the output and input stream of the socket
            out = new PrintWriter(outStream, true);
            inStream = sock.getInputStream();
        }
        BufferedReader receive = new BufferedReader(new InputStreamReader(inStream));
        String sendMessage, receiveMessage;
        do {
            sendMessage = in.readLine();
            out.println(LocalDate.now() + " " + LocalTime.now() + " Client: " + sendMessage);//sends the server a message tagged with the date, time, and the information the sender is a client
            out.flush();//emptys the out messenger for the next loop
            if ((receiveMessage = receive.readLine()) != null) {
                System.out.println(receiveMessage);
            }
        } while (!Objects.requireNonNull(receiveMessage).contains("/end") && !sendMessage.contains("/end"));//terminates the connection
        System.exit(0);
    }
}
