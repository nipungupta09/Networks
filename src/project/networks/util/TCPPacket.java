package project.networks.util;

public class TCPPacket {
	TCPHeader tcpHeader;
	TCPOptions tcpOptions;
	
	public TCPPacket (TCPHeader tcpHeader_, TCPOptions tcpOptions_) {
		tcpHeader = tcpHeader_;
		tcpOptions = tcpOptions_;
	}
}
