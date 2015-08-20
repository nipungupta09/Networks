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
}
