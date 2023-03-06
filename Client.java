import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        try {
            DatagramSocket client = new DatagramSocket();
            InetAddress ipAddress = InetAddress.getByName("localhost");
            int port = 2000;
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            Scanner scanner = new Scanner(System.in);
            String messaggio;

            while (true) {
                System.out.println("Inserisci un messaggio da inviare al server: ");
                messaggio = scanner.nextLine();
                sendData = messaggio.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);
                client.send(sendPacket);
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                client.receive(receivePacket);
                System.out.println("Messaggio inviato: (" + messaggio + ")");
            }

        } catch (IOException e) {
            System.err.println(e);
        }
    } 
}
