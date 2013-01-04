
//#######################
// Boolean
// unsigned char is used as a boolean to get an i1 in llvm. Bool, from stdbool.h, represents a bool as a char (i8).

struct kermeta_standard__Object* kermeta_standard__Boolean___container(unsigned char self) {
	return NULL;
}


char* kermeta_standard__Boolean___toString(unsigned char self) {
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

