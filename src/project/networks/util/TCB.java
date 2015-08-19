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
	
	public TCB() {
		
	}
	
	public String getLocalIP() {
		return localIP;
	}
	public void setLocalIP(String localIP) {
		this.localIP = localIP;
	}
	public int getLocalPort() {
		return localPort;
	}
	public void setLocalPort(int localPort) {
		this.localPort = localPort;
	}
	public String getRemoteIP() {
		return remoteIP;
	}
	public void setRemoteIP(String remoteIP) {
		this.remoteIP = remoteIP;
	}
	public int getRemotePort() {
		return remotePort;
	}
	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}
	public byte[] getSendBuffer() {
		return sendBuffer;
	}
	public void setSendBuffer(byte[] sendBuffer) {
		this.sendBuffer = sendBuffer;
	}
	public byte[] getReceiveBuffer() {
		return receiveBuffer;
	}
	public void setReceiveBuffer(byte[] receiveBuffer) {
		this.receiveBuffer = receiveBuffer;
	}
	public ConnectionState getCurrentState() {
		return currentState;
	}
	public void setCurrentState(ConnectionState currentState) {
		this.currentState = currentState;
	}
	public int getRTT() {
		return RTT;
	}
	public void setRTT(int rTT) {
		RTT = rTT;
	}
	public int getCwnd() {
		return cwnd;
	}
	public void setCwnd(int cwnd) {
		this.cwnd = cwnd;
	}

}
