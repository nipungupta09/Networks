#ifndef TCPOPTIONS_H
#define TCPOPTIONS_H

using namespace std;

class TCPOptions {
private:
	int *options;

public:
	TCPOptions(int*);

	int* getOptions();
	void setOptions(int*);
};

#endif /* TCPOPTIONS_H */