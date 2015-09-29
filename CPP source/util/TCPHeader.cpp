#include "TCPHeader.h"

TCPHeader::TCPHeader(short src_port_, short dst_port_, int seq_num_, int ack_num_,
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

short TCPHeader::getSrc_port() {
	return src_port;
}

void TCPHeader::setSrc_port(short src_port) {
	this.src_port = src_port;
}

short TCPHeader::getDst_port() {
	return dst_port;
}

void TCPHeader::setDst_port(short dst_port) {
	this.dst_port = dst_port;
}

int TCPHeader::getSeq_num() {
	return seq_num;
}

void TCPHeader::setSeq_num(int seq_num) {
	this.seq_num = seq_num;
}

int TCPHeader::getAck_num() {
	return ack_num;
}

void TCPHeader::setAck_num(int ack_num) {
	this.ack_num = ack_num;
}

short TCPHeader::getDrf() {
	return drf;
}

void TCPHeader::setDrf(short drf) {
	this.drf = drf;
}

short TCPHeader::getWindow_size() {
	return window_size;
}

void TCPHeader::setWindow_size(short window_size) {
	this.window_size = window_size;
}

short TCPHeader::getChecksum() {
	return checksum;
}

void TCPHeader::setChecksum(short checksum) {
	this.checksum = checksum;
}

short TCPHeader::getUrgent_pointer() {
	return urgent_pointer;
}

void TCPHeader::setUrgent_pointer(short urgent_pointer) {
	this.urgent_pointer = urgent_pointer;
}