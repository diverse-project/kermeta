
//#######################
// Object

struct kermeta_standard__Object {
	void** vtable;
	struct kermeta_standard__Object* llvm_container;
};


struct kermeta_standard__Object* kermeta_standard__Object___container(struct kermeta_standard__Object* self) {
	return self->llvm_container;
}


struct kermeta_standard__Object* create_kermeta_standard__Object() {
	return malloc(sizeof(struct kermeta_standard__Object));
}



bool kermeta_standard__Object___isVoid(struct kermeta_standard__Object* self) {
	return false;
}


char* kermeta_standard__Object___toString(struct kermeta_standard__Object* self) {
	return NULL;
}

