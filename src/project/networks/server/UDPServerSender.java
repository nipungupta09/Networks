package project.networks.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerSender {

	public static void send(DatagramPacket receivePacket, DatagramSocket serverSocket) throws Exception {
		byte[] sendData = new String(receivePacket.getData()).getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
		serverSocket.send(sendPacket);
	}
}
