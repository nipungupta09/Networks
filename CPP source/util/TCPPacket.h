#ifndef TCPPACKET_H
#define TCPPACKET_H

#include "TCPHeader.h"
#include "TCPOptions.h"

using namespace std;

class TCPPacket {
private:
	TCPHeader *tcpHeader;
	TCPOptions *tcpOptions;

public:
	TCPPacket(TCPHeader*, TCPOptions*);

	TCPHeader* getTCPHeader();
	void setTCPHeader(TCPHeader*);
	TCPOptions* getTCPOptions();
	void setTCPOptions(TCPOptions*);
};

#endif /* TCPPACKET_H */