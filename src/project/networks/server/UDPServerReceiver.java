package project.networks.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerReceiver {

	public static final int SERVER_PORT = 9876;
	
	public static void main(String[] args) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(SERVER_PORT);
		byte[] receiveData = new byte[1024];
		
		while(true) {
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			UDPServerSender.send(receivePacket, serverSocket);
		}		
	}

}
