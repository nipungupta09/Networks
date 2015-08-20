package project.networks.util;

/**
 * @author Nikhil
 * 
 * short drf
 * 	data offset (4 bits)
 * 	reserved (3 bits)
 * 	flags (9 bits): NS, CWR, ECE, URG, ACK, PSH, RST, SYN, FIN
 */
public class TCPHeader {
	short src_port;
	short dst_port;
	int seq_num;
	int ack_num;
	short drf;
	short window_size;
	short checksum;
	short urgent_pointer;
	
	public TCPHeader (short src_port_, short dst_port_, int seq_num_, int ack_num_,
			short drf_, short window_size_, short checksum_,
			short urgent_pointer_) {
		src_port = src_port_;
		dst_port = dst_port_;
		seq_num = seq_num_;
		ack_num = ack_num_;
		drf = drf_;
		window_size = window_size_;
		checksum = checksum_;
		urgent_pointer = urgent_pointer_;
	}
	
	public short getSrc_port() {
		return src_port;
	}

	public void setSrc_port(short src_port) {
		this.src_port = src_port;
	}

	public short getDst_port() {
		return dst_port;
	}

	public void setDst_port(short dst_port) {
		this.dst_port = dst_port;
	}

	public int getSeq_num() {
		return seq_num;
	}

	public void setSeq_num(int seq_num) {
		this.seq_num = seq_num;
	}

	public int getAck_num() {
		return ack_num;
	}

	public void setAck_num(int ack_num) {
		this.ack_num = ack_num;
	}

	public short getDrf() {
		return drf;
	}

	public void setDrf(short drf) {
		this.drf = drf;
	}

	public short getWindow_size() {
		return window_size;
	}

	public void setWindow_size(short window_size) {
		this.window_size = window_size;
	}

	public short getChecksum() {
		return checksum;
	}

	public void setChecksum(short checksum) {
		this.checksum = checksum;
	}

	public short getUrgent_pointer() {
		return urgent_pointer;
	}

	public void setUrgent_pointer(short urgent_pointer) {
		this.urgent_pointer = urgent_pointer;
	}

}
