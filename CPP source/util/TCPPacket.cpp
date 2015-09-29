#include "TCPPacket.h"

TCPPacket::TCPPacket(TCPHeader *tcpHeader_, TCPOptions *tcpOptions_) {
	tcpHeader = tcpHeader_;
	tcpOptions = tcpOptions_;
}

TCPHeader* getTCPHeader() {
	return tcpHeader;
}

void setTCPHeader(TCPHeader* tcpHeader) {
	this.tcpHeader = tcpHeader;
}

TCPOptions* getTCPOptions() {
	return tcpOptions;
}

void setTCPOptions(TCPOptions* tcpOptions) {
	this.tcpOptions = tcpOptions;
}