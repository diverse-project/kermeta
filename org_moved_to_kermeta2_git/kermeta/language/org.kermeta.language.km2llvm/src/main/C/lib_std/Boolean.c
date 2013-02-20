
//#######################
// Boolean
// Issue: no way to produce a i1 using clang. i8 are generated (unsigned char).

struct kermeta_standard__Object* kermeta_standard__Boolean___container(bool self) {
	return NULL;
}


char* kermeta_standard__Boolean___toString(bool self) {
	char* str;

	if(self) {
		str = malloc(sizeof(char)*4);
		strncpy(str, "true", 4);		
	} else {
		str = malloc(sizeof(char)*5);
		strncpy(str, "false", 5);	
	}

	return str;	
}

