package project.networks.connection;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClientReceiver {

	public static byte[] receive(DatagramSocket clientSocket) throws Exception {
		byte[] receiveData = new byte[1024];
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		return receivePacket.getData();
	}
}
