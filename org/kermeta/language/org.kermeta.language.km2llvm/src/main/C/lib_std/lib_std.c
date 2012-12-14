//clang -S -emit-llvm lib_std.c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


//#######################
// Object

struct kermeta___standard__Object {
};
//TODO



//#######################
// String
struct kermeta___standard__String {
	char* _str;
};

struct kermeta___standard__String* create_kermeta___standard_String() {
	struct kermeta___standard__String* res = malloc(sizeof(struct kermeta___standard__String*));
	return res;
}

void delete_kermeta___standard__String(struct kermeta___standard__String* s) {
	free(s->_str);
	free(s);
}


void kermeta___standard__String_plus(struct kermeta___standard__String* self, struct kermeta___standard__String* s) {
	//TODO
}


void kermeta___standard__String_equals(struct kermeta___standard__String* self, struct kermeta___standard__Object* o) {
	//TODO
}


void kermeta___standard__String_toString(struct kermeta___standard__String* self) {
	//TODO
}


void kermeta___standard__String_hashcode(struct kermeta___standard__String* self) {
	//TODO
}


void kermeta___standard__String_compareTo(struct kermeta___standard__String* self, struct kermeta___standard__String* s) {
	//TODO
}


void kermeta___standard__String_indexOf(struct kermeta___standard__String* self, struct kermeta___standard__String* s) {
	//TODO
}


void kermeta___standard__String_charAt(struct kermeta___standard__String* self) {
	//TODO
}



//#######################
// FileIO

//TODO


//#######################
// Stdio
void kermeta___io__Stdio_writeln(struct kermeta___standard__String* o) {
	puts(o->_str);
}

void kermeta___io__Stdio_write(struct kermeta___standard__String* o) {
	printf("%s", o->_str);
}

void kermeta___io__Stdio_errorln(struct kermeta___standard__String* o) {
	fprintf(stderr, "%s\n", o->_str);
}

void kermeta___io__Stdio_error(struct kermeta___standard__String* o) {
	fprintf(stderr, "%s", o->_str);
}

struct kermeta___standard_String* kermeta___io__Stdio_read(struct kermeta___standard__String* o) {
	//TODO
	return NULL;
}

