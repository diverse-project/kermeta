
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

	str = malloc(sizeof(char)*lgth);
	snprintf(str, sizeof(str), "%d", self);

	return str;	
}

