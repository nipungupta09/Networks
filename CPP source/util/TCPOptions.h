#ifndef TCPOPTIONS_H
#define TCPOPTIONS_H

using namespace std;

class TCPOptions {
private:
	int *options;

public:
	TCPOptions(int*);
};

#endif /* TCPOPTIONS_H */