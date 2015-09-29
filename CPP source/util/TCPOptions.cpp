#include "TCPOptions.h"

TCPOptions::TCPOptions(int *options_) {
	options = options_;
}

int* TCPOptions::getOptions() {
	return options;
}

void TCPOptions::setOptions(int* options) {
	this.options = options;
}