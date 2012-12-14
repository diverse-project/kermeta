//clang -S -emit-llvm lib_std.c
#include <stdio.h>
#include <string.h>

//#######################
// String
struct kermeta___standard_String {
	char* _str;
};


//#######################
// Stdio
void kermeta___io__Stdio_writeln(struct kermeta___standard_String* o) {
	puts(o->_str);
}
