package project.networks.connection;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientSender {
	
	public static byte[] send(byte[] data, String server_ip_address, int server_port) throws Exception {
		DatagramSocket clientSocket = new DatagramSocket();
		DatagramPacket sendPacket = new DatagramPacket(data, data.length, InetAddress.getByName(server_ip_address), server_port);
		clientSocket.send(sendPacket);
		byte[] receiveData = UDPClientReceiver.receive(clientSocket);
		clientSocket.close();
		return receiveData;
	}

}
