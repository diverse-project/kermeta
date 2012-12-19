
//#######################
// String

void delete_kermeta_standard__String(char* s) {
	free(s);
}


struct kermeta_standard__Object* kermeta_standard__String___container(const char* const self) {
	return NULL;
}


char* kermeta_standard__String___plus(const char* const s, const char* const self) {
	char* res = calloc(strlen(s)+strlen(self)+1, sizeof(char*));
	strcat(res, self);
	strcat(res, s);
	return res;
}


void kermeta_standard__String___equals(const struct kermeta_standard__Object* const o, const char* const self) {
	//TODO
}


char* kermeta_standard__String___toString(char* self) {
	return self;
}


void kermeta_standard__String___hashcode(const char* const self) {
	//TODO
}


int kermeta_standard__String___compareTo(const char* const s, const char* const self) {
	return strcmp(self, s);
}


int kermeta_standard__String___indexOf(char* s, char* self) {
	char* found = strstr(self, s);
	int res;
	if(found==NULL) res = -1;
	else res = found - self;
	return res;
}


char kermeta_standard__String___charAt(int index, char* self) {
	return index<0||index>=strlen(self) ? 0 : self[index];
}

