

//#######################
// StdIO
void kermeta_io__StdIO___writeln(struct kermeta_standard__String* o) {
	puts(o->llvm_str);
}

void kermeta_io__StdIO___write(struct kermeta_standard__String* o) {
	printf("%s", o->llvm_str);
}

void kermeta_io__StdIO___errorln(struct kermeta_standard__String* o) {
	fprintf(stderr, "%s\n", o->llvm_str);
}

void kermeta__o__StdIO___error(struct kermeta_standard__String* o) {
	fprintf(stderr, "%s", o->llvm_str);
}

struct kermeta_standard__String* kermeta___io__StdIO_read(struct kermeta_standard__String* o) {
	//TODO
	return NULL;
}

