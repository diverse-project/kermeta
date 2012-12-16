

//#######################
// StdIO
void kermeta___io__StdIO_writeln(struct kermeta_standard__String* o) {
	puts(o->llvm_str);
}

void kermeta___io__StdIO_write(struct kermeta_standard__String* o) {
	printf("%s", o->llvm_str);
}

void kermeta___io__StdIO_errorln(struct kermeta_standard__String* o) {
	fprintf(stderr, "%s\n", o->llvm_str);
}

void kermeta___io__StdIO_error(struct kermeta_standard__String* o) {
	fprintf(stderr, "%s", o->llvm_str);
}

struct kermeta_standard__String* kermeta___io__StdIO_read(struct kermeta_standard__String* o) {
	//TODO
	return NULL;
}

