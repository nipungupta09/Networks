package project.networks.client;

import project.networks.connection.UDPClientSender;

public class ClientSimulator {
	
	private static final String SERVER_IP_ADDRESS = "localhost";
	private static final int SERVER_PORT = 9876;
	
	public static void main(String[] args) throws Exception {
		String dummyData = "Dummy Data";
		byte[] receiveData = UDPClientSender.send(dummyData.getBytes(), SERVER_IP_ADDRESS, SERVER_PORT);
		System.out.println("ACK received from server: " + new String(receiveData));
	}

}
