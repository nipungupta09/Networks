package project.networks.util;

/**
 * @author Nipun Gupta
 * @since 19-Aug-2015
 */
public class TCB {
	
	
	/**
	 * TCP Session with 4-tuple
	 */
	String localIP;
	int localPort;
	String remoteIP;
	int remotePort;
	
	/**
	 * Buffers
	 */
	byte[] sendBuffer;
	byte[] receiveBuffer;
	
	/**
	 * State of connection
	 */
	ConnectionState currentState;
	int RTT;
	int cwnd;

}
