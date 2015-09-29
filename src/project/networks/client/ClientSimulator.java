package project.networks.client;

import project.networks.connection.UDPClientSender;

public class ClientSimulator {
	
	private static final String SERVER_IP_ADDRESS = "localhost";
	private static final int SERVER_PORT = 9876;
	
	public static void main(String[] args) throws Exception {
		String dummyData = "Dummy Data";
		byte[] receiveData = UDPClientSender.send(dummyData.getBytes(), SERVER_IP_ADDRESS, SERVER_PORT);
		System.out.println("ACK received from server: " + new String(receiveData));
		
//		String dummyData = "Dummy Data";
//		for(int i=0; i<5000; i++)
//			dummyData = dummyData + "Dummy Data";
//		byte[] data = dummyData.getBytes();
//		System.out.println(data.length);
//		DatagramSocket clientSocket = new DatagramSocket();
//		DatagramPacket sendPacket = new DatagramPacket(data, data.length, InetAddress.getByName(SERVER_IP_ADDRESS), SERVER_PORT);
//		long t1 = System.nanoTime();
//		for(int i=0; i<100000; i++)
//			clientSocket.send(sendPacket);
//		System.out.println(System.nanoTime()-t1);
//		clientSocket.close();
		
	}

}
