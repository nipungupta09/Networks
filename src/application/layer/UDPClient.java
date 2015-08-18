package application.layer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	
	public static final String IP_ADDRESS = "192.168.0.106";
	public static final int PORT = 9876;
	public static final String DATA = "This is data from client.";

	public static void main(String[] args) throws Exception {
		DatagramSocket clientSocket = new DatagramSocket();
		
		byte[] sendData = new byte[1024];
		sendData = DATA.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(IP_ADDRESS), PORT);
		System.out.println("FROM CLIENT: " + new String(sendPacket.getData()));
		clientSocket.send(sendPacket);
		
		byte[] receiveData = new byte[1024];
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		String receiveString = new String(receivePacket.getData());
		System.out.println("FROM SERVER: " + receiveString);
		
		clientSocket.close();
				
	}

}
