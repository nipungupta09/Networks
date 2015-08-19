package project.networks.connection;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import project.networks.util.TCB;

public class Receiver {
	
	public static void passive_open(int port) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(port);
		TCB tcb = new TCB(port);
		
		while(true) {
			DatagramPacket udpPacket = new DatagramPacket(tcb.getReceiveBuffer(), tcb.getReceiveBuffer().length);
			serverSocket.receive(udpPacket);
		}
	}

}
