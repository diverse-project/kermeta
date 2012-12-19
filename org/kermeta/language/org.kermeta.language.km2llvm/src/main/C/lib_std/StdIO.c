
//#######################
// StdIO

struct kermeta_io__StdIO { };

// The singleton.
const struct kermeta_io__StdIO SINGLETON_kermeta_io__StdIO;


void kermeta_io__StdIO___writeln(char* o, struct kermeta_io__StdIO* self) {
	puts(o);
}

void kermeta_io__StdIO___write(char* o, struct kermeta_io__StdIO* self) {
	printf("%s", o);
}

void kermeta_io__StdIO___errorln(char* o, struct kermeta_io__StdIO* self) {
	fprintf(stderr, "%s\n", o);
}

void kermeta__o__StdIO___error(char* o, struct kermeta_io__StdIO* self) {
	fprintf(stderr, "%s", o);
}

char* kermeta___io__StdIO_read(char* o, struct kermeta_io__StdIO* self) {
	//TODO
	return NULL;
}


// Operations from Object
struct kermeta_standard__Object* kermeta_io__StdIO___container(struct kermeta_io__StdIO* self) {
	return NULL;
}

