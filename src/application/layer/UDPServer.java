package application.layer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	
	public static final int PORT = 9876;
	
	public static void main(String[] args) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(PORT);
		
		byte[] receiveData = new byte[1024];
		byte[] sendData = new byte[1024];
		while(true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			String receiveString = new String(receivePacket.getData());
			System.out.println("RECEIVED: " + receiveString);
			
			sendData = receiveString.toUpperCase().getBytes();
			System.out.println("SENDING BACK TO CLIENT: " + new String(sendData));
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
			serverSocket.send(sendPacket);
		}
		
	}

}
