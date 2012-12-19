
//#######################
// Integer

struct kermeta_standard__Object* kermeta_standard__Integer___container(int self) {
	return NULL;
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

