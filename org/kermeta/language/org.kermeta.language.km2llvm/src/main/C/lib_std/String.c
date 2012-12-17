
//#######################
// String
struct kermeta_standard__String {
	struct kermeta_standard__Object llvm_object;
	char* llvm_str;
};

struct kermeta_standard__String* create_kermeta_standard__String(char* str) {
	struct kermeta_standard__String* res = malloc(sizeof(struct kermeta_standard__String*));
	res->llvm_str = str;
	return res;
}

inline void delete_kermeta_standard__String(struct kermeta_standard__String* s) {
	free(s);
}


inline struct kermeta_standard__Object* kermeta_standard__String___container(struct kermeta_standard__String* self) {
	return self->llvm_object.llvm_container;
}


void kermeta_standard__String___plus(struct kermeta_standard__String* self, struct kermeta_standard__String* s) {
	//TODO
}


void kermeta_standard__String___equals(struct kermeta_standard__String* self, struct kermeta_standard__Object* o) {
	//TODO
}


void kermeta_standard__String___toString(struct kermeta_standard__String* self) {
	//TODO
}


void kermeta_standard__String___hashcode(struct kermeta_standard__String* self) {
	//TODO
}


void kermeta_standard__String___compareTo(struct kermeta_standard__String* self, struct kermeta_standard__String* s) {
	//TODO
}


void kermeta_standard__String___indexOf(struct kermeta_standard__String* self, struct kermeta_standard__String* s) {
	//TODO
}


void kermeta_standard__String___charAt(struct kermeta_standard__String* self) {
	//TODO
}

