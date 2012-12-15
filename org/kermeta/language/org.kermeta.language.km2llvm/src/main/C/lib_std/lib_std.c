//clang -S -emit-llvm lib_std.c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


//#######################
// Object

struct kermeta_standard__Object {
};
//TODO



//#######################
// String
struct kermeta_standard__String {
	char* _str;
};

struct kermeta_standard__String* create_kermeta_standard__String() {
	struct kermeta_standard__String* res = malloc(sizeof(struct kermeta_standard__String*));
	return res;
}

void delete_kermeta_standard__String(struct kermeta_standard__String* s) {
	free(s->_str);
	free(s);
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



//#######################
// FileIO

//TODO


//#######################
// Stdio
void kermeta___io__Stdio_writeln(struct kermeta_standard__String* o) {
	puts(o->_str);
}

void kermeta___io__Stdio_write(struct kermeta_standard__String* o) {
	printf("%s", o->_str);
}

void kermeta___io__Stdio_errorln(struct kermeta_standard__String* o) {
	fprintf(stderr, "%s\n", o->_str);
}

void kermeta___io__Stdio_error(struct kermeta_standard__String* o) {
	fprintf(stderr, "%s", o->_str);
}

struct kermeta_standard__String* kermeta___io__Stdio_read(struct kermeta_standard__String* o) {
	//TODO
	return NULL;
}

