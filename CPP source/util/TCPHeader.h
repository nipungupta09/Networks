#ifndef TCPHEADER_H
#define TCPHEADER_H

using namespace std;

class TCPHeader {
private:
	short src_port;
	short dst_port;
	int seq_num;
	int ack_num;
	short drf;
	short window_size;
	short checksum;
	short urgent_pointer;

public:
	TCPHeader (short, short, int, int, short, short, short, short);

	short getSrc_port();
	void setSrc_port(short);
	short getDst_port();
	void setDst_port(short);
	int getSeq_num();
	void setSeq_num(int);
	int getAck_num();
	void setAck_num(int);
	short getDrf();
	void setDrf(short);
	short getWindow_size();
	void setWindow_size(short);
	short getChecksum();
	void setChecksum(short);
	short getUrgent_pointer();
	void setUrgent_pointer(short);
};

#endif /* TCPHEADER_H */