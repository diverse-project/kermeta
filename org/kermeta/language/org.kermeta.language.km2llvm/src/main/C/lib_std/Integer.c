
//#######################
// Integer

struct kermeta_standard__Object* kermeta_standard__Integer___container(int self) {
	return NULL;
}

char* kermeta_standard__Integer___toString(int self) {
	int lgth = self<0 ? 1 : 0;
	char* str;

	if(self==0)
		lgth++;
	else
		lgth += floor(log10(abs(self))) + 1;

	str = malloc(sizeof(char*)*lgth);
	snprintf(str, sizeof(str), "%d", self);

	return str;	
}


int minus(int i, int self) {
	return self+i;
}


int mult(int i, int self) {
	return self*i;
}


// Because div is already defined into stdlib.h.
int div2(int i, int self) {
	return (int)(self/i);
}


int mod(int i, int self) {
	return self%i;
}


int uminus(int self) {
	return self*-1;
}

