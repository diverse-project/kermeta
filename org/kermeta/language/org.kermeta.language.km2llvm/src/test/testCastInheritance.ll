; ModuleID = 'lib_std.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i64, i32, [20 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.kermeta_io__StdIO = type {}
%struct.kermeta_standard__Object = type { %struct.kermeta_standard__Object* }
%struct.kermeta_standard__String = type opaque

@.str = private unnamed_addr constant [3 x i8] c"%s\00", align 1
@stderr = external global %struct._IO_FILE*
@.str1 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@SINGLETON_kermeta_io__StdIO = common global %struct.kermeta_io__StdIO zeroinitializer, align 1

define i8* @kermeta_standard__String___plus(i8* %s, i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca i8*, align 8
  %res = alloca i8*, align 8
  store i8* %s, i8** %1, align 8
  store i8* %self, i8** %2, align 8
  %3 = load i8** %1, align 8
  %4 = call i64 @strlen(i8* %3) nounwind readonly
  %5 = load i8** %2, align 8
  %6 = call i64 @strlen(i8* %5) nounwind readonly
  %7 = add i64 %4, %6
  %8 = add i64 %7, 1
  %9 = call noalias i8* @calloc(i64 %8, i64 8) nounwind
  store i8* %9, i8** %res, align 8
  %10 = load i8** %res, align 8
  %11 = load i8** %2, align 8
  %12 = call i8* @strcat(i8* %10, i8* %11) nounwind
  %13 = load i8** %res, align 8
  %14 = load i8** %1, align 8
  %15 = call i8* @strcat(i8* %13, i8* %14) nounwind
  %16 = load i8** %res, align 8
  ret i8* %16
}

declare noalias i8* @calloc(i64, i64) nounwind

declare i64 @strlen(i8*) nounwind readonly

declare i8* @strcat(i8*, i8*) nounwind

define void @kermeta_standard__String___equals(%struct.kermeta_standard__Object* %o, i8* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__Object*, align 8
  %2 = alloca i8*, align 8
  store %struct.kermeta_standard__Object* %o, %struct.kermeta_standard__Object** %1, align 8
  store i8* %self, i8** %2, align 8
  ret void
}

define i8* @kermeta_standard__String___toString(i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %self, i8** %1, align 8
  %2 = load i8** %1, align 8
  ret i8* %2
}

define void @kermeta_standard__String___hashcode(i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %self, i8** %1, align 8
  ret void
}

define i32 @kermeta_standard__String___compareTo(i8* %s, i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca i8*, align 8
  store i8* %s, i8** %1, align 8
  store i8* %self, i8** %2, align 8
  %3 = load i8** %2, align 8
  %4 = load i8** %1, align 8
  %5 = call i32 @strcmp(i8* %3, i8* %4) nounwind readonly
  ret i32 %5
}

declare i32 @strcmp(i8*, i8*) nounwind readonly

define i32 @kermeta_standard__String___indexOf(i8* %s, i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca i8*, align 8
  %found = alloca i8*, align 8
  %res = alloca i32, align 4
  store i8* %s, i8** %1, align 8
  store i8* %self, i8** %2, align 8
  %3 = load i8** %2, align 8
  %4 = load i8** %1, align 8
  %5 = call i8* @strstr(i8* %3, i8* %4) nounwind readonly
  store i8* %5, i8** %found, align 8
  %6 = load i8** %found, align 8
  %7 = icmp eq i8* %6, null
  br i1 %7, label %8, label %9

; <label>:8                                       ; preds = %0
  store i32 -1, i32* %res, align 4
  br label %16

; <label>:9                                       ; preds = %0
  %10 = load i8** %found, align 8
  %11 = load i8** %2, align 8
  %12 = ptrtoint i8* %10 to i64
  %13 = ptrtoint i8* %11 to i64
  %14 = sub i64 %12, %13
  %15 = trunc i64 %14 to i32
  store i32 %15, i32* %res, align 4
  br label %16

; <label>:16                                      ; preds = %9, %8
  %17 = load i32* %res, align 4
  ret i32 %17
}

declare i8* @strstr(i8*, i8*) nounwind readonly

define signext i8 @kermeta_standard__String___charAt(i32 %index, i8* %self) nounwind uwtable {
  %1 = alloca i32, align 4
  %2 = alloca i8*, align 8
  store i32 %index, i32* %1, align 4
  store i8* %self, i8** %2, align 8
  %3 = load i32* %1, align 4
  %4 = icmp slt i32 %3, 0
  br i1 %4, label %11, label %5

; <label>:5                                       ; preds = %0
  %6 = load i32* %1, align 4
  %7 = sext i32 %6 to i64
  %8 = load i8** %2, align 8
  %9 = call i64 @strlen(i8* %8) nounwind readonly
  %10 = icmp uge i64 %7, %9
  br i1 %10, label %11, label %12

; <label>:11                                      ; preds = %5, %0
  br label %19

; <label>:12                                      ; preds = %5
  %13 = load i32* %1, align 4
  %14 = sext i32 %13 to i64
  %15 = load i8** %2, align 8
  %16 = getelementptr inbounds i8* %15, i64 %14
  %17 = load i8* %16
  %18 = sext i8 %17 to i32
  br label %19

; <label>:19                                      ; preds = %12, %11
  %20 = phi i32 [ 0, %11 ], [ %18, %12 ]
  %21 = trunc i32 %20 to i8
  ret i8 %21
}

define void @kermeta_io__StdIO___writeln(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load i8** %1, align 8
  %4 = call i32 @puts(i8* %3)
  ret void
}

declare i32 @puts(i8*)

define void @kermeta_io__StdIO___write(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load i8** %1, align 8
  %4 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i8* %3)
  ret void
}

declare i32 @printf(i8*, ...)

define void @kermeta_io__StdIO___errorln(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load %struct._IO_FILE** @stderr, align 8
  %4 = load i8** %1, align 8
  %5 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %3, i8* getelementptr inbounds ([4 x i8]* @.str1, i32 0, i32 0), i8* %4)
  ret void
}

declare i32 @fprintf(%struct._IO_FILE*, i8*, ...)

define void @kermeta__o__StdIO___error(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load %struct._IO_FILE** @stderr, align 8
  %4 = load i8** %1, align 8
  %5 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %3, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i8* %4)
  ret void
}

define %struct.kermeta_standard__String* @kermeta___io__StdIO_read(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  ret %struct.kermeta_standard__String* null
}
@"s0" = private unnamed_addr constant [7 x i8] c"B.foo!\00"
@"s1" = private unnamed_addr constant [7 x i8] c"C.foo!\00"
@"s2" = private unnamed_addr constant [7 x i8] c"D.foo!\00"
@"s3" = private unnamed_addr constant [13 x i8] c"Hello World!\00"
%"pkgFoo__A" = type {%"pkgFoo__B"*}
%"pkgFoo__B" = type {%"pkgFoo__A"*, %"pkgFoo__C"*}
%"pkgFoo__C" = type {%"pkgFoo__B"*, %"pkgFoo__D"*}
%"pkgFoo__D" = type {%"pkgFoo__C"*}
%"pkgFoo__Main" = type {}
define internal %"pkgFoo__A"* @"create_pkgFoo__A"(){
%r = alloca %"pkgFoo__A"
ret %"pkgFoo__A"* %r
}
define internal %"pkgFoo__B"* @"create_pkgFoo__B"(){
%r = alloca %"pkgFoo__B"
%"0" = call %"pkgFoo__A"* @"create_pkgFoo__A"()
%"00" = getelementptr %"pkgFoo__B"* %r,i32 0,i32 0
store %"pkgFoo__A"* %"0",%"pkgFoo__A"** %"00"
ret %"pkgFoo__B"* %r
}
define internal %"pkgFoo__C"* @"create_pkgFoo__C"(){
%r = alloca %"pkgFoo__C"
%"0" = call %"pkgFoo__B"* @"create_pkgFoo__B"()
%"00" = getelementptr %"pkgFoo__C"* %r,i32 0,i32 0
store %"pkgFoo__B"* %"0",%"pkgFoo__B"** %"00"
ret %"pkgFoo__C"* %r
}
define internal %"pkgFoo__D"* @"create_pkgFoo__D"(){
%r = alloca %"pkgFoo__D"
%"0" = call %"pkgFoo__C"* @"create_pkgFoo__C"()
%"00" = getelementptr %"pkgFoo__D"* %r,i32 0,i32 0
store %"pkgFoo__C"* %"0",%"pkgFoo__C"** %"00"
ret %"pkgFoo__D"* %r
}
define internal %"pkgFoo__Main"* @"create_pkgFoo__Main"(){
%r = alloca %"pkgFoo__Main"
ret %"pkgFoo__Main"* %r
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__A"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo__B"** %"0"
ret %"pkgFoo__B"* %"1"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__A_pkgFoo__C"(%"pkgFoo__A"* %"self") readonly{
%"v0" = call %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self")
%"v1" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"v0")
ret %"pkgFoo__C"* %"v1"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__A_pkgFoo__D"(%"pkgFoo__A"* %"self") readonly{
%"v0" = call %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self")
%"v1" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"v0")
%"v2" = call %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"v1")
ret %"pkgFoo__D"* %"v2"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__B"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo__A"** %"0"
ret %"pkgFoo__A"* %"1"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__B"* %"self",i32 0,i32 1
%"1" = load %"pkgFoo__C"** %"0"
ret %"pkgFoo__C"* %"1"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__B_pkgFoo__D"(%"pkgFoo__B"* %"self") readonly{
%"v0" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self")
%"v1" = call %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"v0")
ret %"pkgFoo__D"* %"v1"
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__C"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo__B"** %"0"
ret %"pkgFoo__B"* %"1"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__C_pkgFoo__A"(%"pkgFoo__C"* %"self") readonly{
%"v0" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self")
%"v1" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"v0")
ret %"pkgFoo__A"* %"v1"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__C"* %"self",i32 0,i32 1
%"1" = load %"pkgFoo__D"** %"0"
ret %"pkgFoo__D"* %"1"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__D"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo__C"** %"0"
ret %"pkgFoo__C"* %"1"
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__D_pkgFoo__B"(%"pkgFoo__D"* %"self") readonly{
%"v0" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self")
%"v1" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"v0")
ret %"pkgFoo__B"* %"v1"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__D_pkgFoo__A"(%"pkgFoo__D"* %"self") readonly{
%"v0" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self")
%"v1" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"v0")
%"v2" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"v1")
ret %"pkgFoo__A"* %"v2"
}
define internal void @"pkgFoo__B___foo1"(%"pkgFoo__B"* %"self"){
%"1" = getelementptr [7 x i8]* @"s0",i32 0,i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define internal void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"self"){
%"1" = getelementptr [7 x i8]* @"s1",i32 0,i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define internal void @"pkgFoo__D___foo3"(%"pkgFoo__D"* %"self"){
%"1" = call %"pkgFoo__C"* @cast_pkgFoo__D_pkgFoo__C(%"pkgFoo__D"* %"self")
call void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"1")
%"2" = getelementptr [7 x i8]* @"s2",i32 0,i32 0
call void @kermeta_io__StdIO___writeln(i8* %"2", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define i32 @main(){
%1 = call %"pkgFoo__Main"* @"create_pkgFoo__Main"()
call void @"pkgFoo__Main___main4"(%"pkgFoo__Main"* %1)
ret i32 0
}
define internal void @"pkgFoo__Main___main4"(%"pkgFoo__Main"* %"self"){
%"1" = getelementptr [13 x i8]* @"s3",i32 0,i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
%"d" = call %"pkgFoo__D"* @"create_pkgFoo__D"()
call void @"pkgFoo__D___foo3"(%"pkgFoo__D"* %"d")
ret void
}
