; ModuleID = 'lib_std.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i64, i32, [20 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.kermeta_standard__String = type { i8* }
%struct.kermeta_standard__Object = type {}
%struct.kermeta_standard_String = type opaque

@.str = private unnamed_addr constant [3 x i8] c"%s\00", align 1
@stderr = external global %struct._IO_FILE*
@.str1 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

define %struct.kermeta_standard__String* @create_kermeta_standard__String() nounwind uwtable {
  %res = alloca %struct.kermeta_standard__String*, align 8
  %1 = call noalias i8* @malloc(i64 8) nounwind
  %2 = bitcast i8* %1 to %struct.kermeta_standard__String*
  store %struct.kermeta_standard__String* %2, %struct.kermeta_standard__String** %res, align 8
  %3 = load %struct.kermeta_standard__String** %res, align 8
  ret %struct.kermeta_standard__String* %3
}

declare noalias i8* @malloc(i64) nounwind

define void @delete_kermeta_standard__String(%struct.kermeta_standard__String* %s) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %s, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct.kermeta_standard__String** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__String* %2, i32 0, i32 0
  %4 = load i8** %3, align 8
  call void @free(i8* %4) nounwind
  %5 = load %struct.kermeta_standard__String** %1, align 8
  %6 = bitcast %struct.kermeta_standard__String* %5 to i8*
  call void @free(i8* %6) nounwind
  ret void
}

declare void @free(i8*) nounwind

define void @kermeta_standard__String___plus(%struct.kermeta_standard__String* %self, %struct.kermeta_standard__String* %s) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  %2 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  store %struct.kermeta_standard__String* %s, %struct.kermeta_standard__String** %2, align 8
  ret void
}

define void @kermeta_standard__String___equals(%struct.kermeta_standard__String* %self, %struct.kermeta_standard__Object* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  %2 = alloca %struct.kermeta_standard__Object*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  store %struct.kermeta_standard__Object* %o, %struct.kermeta_standard__Object** %2, align 8
  ret void
}

define void @kermeta_standard__String___toString(%struct.kermeta_standard__String* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  ret void
}

define void @kermeta_standard__String___hashcode(%struct.kermeta_standard__String* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  ret void
}

define void @kermeta_standard__String___compareTo(%struct.kermeta_standard__String* %self, %struct.kermeta_standard__String* %s) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  %2 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  store %struct.kermeta_standard__String* %s, %struct.kermeta_standard__String** %2, align 8
  ret void
}

define void @kermeta_standard__String___indexOf(%struct.kermeta_standard__String* %self, %struct.kermeta_standard__String* %s) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  %2 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  store %struct.kermeta_standard__String* %s, %struct.kermeta_standard__String** %2, align 8
  ret void
}

define void @kermeta_standard__String___charAt(%struct.kermeta_standard__String* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %self, %struct.kermeta_standard__String** %1, align 8
  ret void
}

define void @kermeta___io__Stdio_writeln(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct.kermeta_standard__String** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__String* %2, i32 0, i32 0
  %4 = load i8** %3, align 8
  %5 = call i32 @puts(i8* %4)
  ret void
}

declare i32 @puts(i8*)

define void @kermeta___io__Stdio_write(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct.kermeta_standard__String** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__String* %2, i32 0, i32 0
  %4 = load i8** %3, align 8
  %5 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i8* %4)
  ret void
}

declare i32 @printf(i8*, ...)

define void @kermeta___io__Stdio_errorln(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct._IO_FILE** @stderr, align 8
  %3 = load %struct.kermeta_standard__String** %1, align 8
  %4 = getelementptr inbounds %struct.kermeta_standard__String* %3, i32 0, i32 0
  %5 = load i8** %4, align 8
  %6 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %2, i8* getelementptr inbounds ([4 x i8]* @.str1, i32 0, i32 0), i8* %5)
  ret void
}

declare i32 @fprintf(%struct._IO_FILE*, i8*, ...)

define void @kermeta___io__Stdio_error(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct._IO_FILE** @stderr, align 8
  %3 = load %struct.kermeta_standard__String** %1, align 8
  %4 = getelementptr inbounds %struct.kermeta_standard__String* %3, i32 0, i32 0
  %5 = load i8** %4, align 8
  %6 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %2, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i8* %5)
  ret void
}

define %struct.kermeta_standard_String* @kermeta___io__Stdio_read(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  ret %struct.kermeta_standard_String* null
}
