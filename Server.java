import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(2000);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];

            while(true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            }



        } catch(SocketException e) {
            System.err.println(e);
        }

    }
}
