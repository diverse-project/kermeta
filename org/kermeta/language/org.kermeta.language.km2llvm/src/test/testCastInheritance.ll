; ModuleID = 'lib_std.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i64, i32, [20 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.kermeta_io__StdIO = type {}
%struct.kermeta_standard__Object = type { %struct.kermeta_standard__Object* }

@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str1 = private unnamed_addr constant [5 x i8] c"true\00", align 1
@.str2 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str3 = private unnamed_addr constant [3 x i8] c"%s\00", align 1
@stderr = external global %struct._IO_FILE*
@.str4 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@SINGLETON_kermeta_io__StdIO = common global %struct.kermeta_io__StdIO zeroinitializer, align 1

define %struct.kermeta_standard__Object* @kermeta_standard__Object___container(%struct.kermeta_standard__Object* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__Object*, align 8
  store %struct.kermeta_standard__Object* %self, %struct.kermeta_standard__Object** %1, align 8
  %2 = load %struct.kermeta_standard__Object** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__Object* %2, i32 0, i32 0
  %4 = load %struct.kermeta_standard__Object** %3, align 8
  ret %struct.kermeta_standard__Object* %4
}

define void @delete_kermeta_standard__String(i8* %s) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %s, i8** %1, align 8
  %2 = load i8** %1, align 8
  call void @free(i8* %2) nounwind
  ret void
}

declare void @free(i8*) nounwind

define %struct.kermeta_standard__Object* @kermeta_standard__String___container(i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %self, i8** %1, align 8
  ret %struct.kermeta_standard__Object* null
}

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
  %9 = call noalias i8* @calloc(i64 %8, i64 1) nounwind
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

define %struct.kermeta_standard__Object* @kermeta_standard__Integer___container(i32 %self) nounwind uwtable {
  %1 = alloca i32, align 4
  store i32 %self, i32* %1, align 4
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__Integer___toString(i32 %self) nounwind uwtable {
  %1 = alloca i32, align 4
  %lgth = alloca i32, align 4
  %str = alloca i8*, align 8
  store i32 %self, i32* %1, align 4
  %2 = load i32* %1, align 4
  %3 = icmp slt i32 %2, 0
  %4 = select i1 %3, i32 1, i32 0
  store i32 %4, i32* %lgth, align 4
  %5 = load i32* %1, align 4
  %6 = icmp eq i32 %5, 0
  br i1 %6, label %7, label %10

; <label>:7                                       ; preds = %0
  %8 = load i32* %lgth, align 4
  %9 = add nsw i32 %8, 1
  store i32 %9, i32* %lgth, align 4
  br label %21

; <label>:10                                      ; preds = %0
  %11 = load i32* %1, align 4
  %12 = call i32 @abs(i32 %11) nounwind readnone
  %13 = sitofp i32 %12 to double
  %14 = call double @log10(double %13) nounwind
  %15 = call double @floor(double %14) nounwind readnone
  %16 = fadd double %15, 1.000000e+00
  %17 = load i32* %lgth, align 4
  %18 = sitofp i32 %17 to double
  %19 = fadd double %18, %16
  %20 = fptosi double %19 to i32
  store i32 %20, i32* %lgth, align 4
  br label %21

; <label>:21                                      ; preds = %10, %7
  %22 = load i32* %lgth, align 4
  %23 = sext i32 %22 to i64
  %24 = mul i64 1, %23
  %25 = call noalias i8* @malloc(i64 %24) nounwind
  store i8* %25, i8** %str, align 8
  %26 = load i8** %str, align 8
  %27 = load i32* %1, align 4
  %28 = call i32 (i8*, i64, i8*, ...)* @snprintf(i8* %26, i64 8, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32 %27) nounwind
  %29 = load i8** %str, align 8
  ret i8* %29
}

declare double @floor(double) nounwind readnone

declare double @log10(double) nounwind

declare i32 @abs(i32) nounwind readnone

declare noalias i8* @malloc(i64) nounwind

declare i32 @snprintf(i8*, i64, i8*, ...) nounwind

define %struct.kermeta_standard__Object* @kermeta_standard__Boolean___container(i8 zeroext %self) nounwind uwtable {
  %1 = alloca i8, align 1
  store i8 %self, i8* %1, align 1
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__Boolean___toString(i8 zeroext %self) nounwind uwtable {
  %1 = alloca i8, align 1
  %str = alloca i8*, align 8
  store i8 %self, i8* %1, align 1
  %2 = load i8* %1, align 1
  %3 = icmp ne i8 %2, 0
  br i1 %3, label %4, label %8

; <label>:4                                       ; preds = %0
  %5 = call noalias i8* @malloc(i64 4) nounwind
  store i8* %5, i8** %str, align 8
  %6 = load i8** %str, align 8
  %7 = call i8* @strncpy(i8* %6, i8* getelementptr inbounds ([5 x i8]* @.str1, i32 0, i32 0), i64 4) nounwind
  br label %12

; <label>:8                                       ; preds = %0
  %9 = call noalias i8* @malloc(i64 5) nounwind
  store i8* %9, i8** %str, align 8
  %10 = load i8** %str, align 8
  %11 = call i8* @strncpy(i8* %10, i8* getelementptr inbounds ([6 x i8]* @.str2, i32 0, i32 0), i64 5) nounwind
  br label %12

; <label>:12                                      ; preds = %8, %4
  %13 = load i8** %str, align 8
  ret i8* %13
}

declare i8* @strncpy(i8*, i8*, i64) nounwind

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
  %4 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.str3, i32 0, i32 0), i8* %3)
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
  %5 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %3, i8* getelementptr inbounds ([4 x i8]* @.str4, i32 0, i32 0), i8* %4)
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
  %5 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %3, i8* getelementptr inbounds ([3 x i8]* @.str3, i32 0, i32 0), i8* %4)
  ret void
}

define i8* @kermeta___io__StdIO_read(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  ret i8* null
}

define %struct.kermeta_standard__Object* @kermeta_io__StdIO___container(%struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_io__StdIO*, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %1, align 8
  ret %struct.kermeta_standard__Object* null
}
@"s0" = private unnamed_addr constant [7 x i8] c"B.foo!\00"
@"s1" = private unnamed_addr constant [7 x i8] c"C.foo!\00"
@"s2" = private unnamed_addr constant [6 x i8] c"C.bar\00"
@"s3" = private unnamed_addr constant [7 x i8] c"D.foo!\00"
@"s4" = private unnamed_addr constant [13 x i8] c"Hello World!\00"
@"s5" = private unnamed_addr constant [8 x i8] c"ifthen!\00"
@"s6" = private unnamed_addr constant [8 x i8] c"ifElse!\00"
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
%"00" = getelementptr %"pkgFoo__B"* %r, i32 0, i32 0
store %"pkgFoo__A"* %"0", %"pkgFoo__A"** %"00"
ret %"pkgFoo__B"* %r
}
define internal %"pkgFoo__C"* @"create_pkgFoo__C"(){
%r = alloca %"pkgFoo__C"
%"0" = call %"pkgFoo__B"* @"create_pkgFoo__B"()
%"00" = getelementptr %"pkgFoo__C"* %r, i32 0, i32 0
store %"pkgFoo__B"* %"0", %"pkgFoo__B"** %"00"
ret %"pkgFoo__C"* %r
}
define internal %"pkgFoo__D"* @"create_pkgFoo__D"(){
%r = alloca %"pkgFoo__D"
%"0" = call %"pkgFoo__C"* @"create_pkgFoo__C"()
%"00" = getelementptr %"pkgFoo__D"* %r, i32 0, i32 0
store %"pkgFoo__C"* %"0", %"pkgFoo__C"** %"00"
ret %"pkgFoo__D"* %r
}
define internal %"pkgFoo__Main"* @"create_pkgFoo__Main"(){
%r = alloca %"pkgFoo__Main"
ret %"pkgFoo__Main"* %r
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__A"* %"self", i32 0, i32 0
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
%"0" = getelementptr %"pkgFoo__B"* %"self", i32 0, i32 0
%"1" = load %"pkgFoo__A"** %"0"
ret %"pkgFoo__A"* %"1"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__B"* %"self", i32 0, i32 1
%"1" = load %"pkgFoo__C"** %"0"
ret %"pkgFoo__C"* %"1"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__B_pkgFoo__D"(%"pkgFoo__B"* %"self") readonly{
%"v0" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self")
%"v1" = call %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"v0")
ret %"pkgFoo__D"* %"v1"
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__C"* %"self", i32 0, i32 0
%"1" = load %"pkgFoo__B"** %"0"
ret %"pkgFoo__B"* %"1"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__C_pkgFoo__A"(%"pkgFoo__C"* %"self") readonly{
%"v0" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self")
%"v1" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"v0")
ret %"pkgFoo__A"* %"v1"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__C"* %"self", i32 0, i32 1
%"1" = load %"pkgFoo__D"** %"0"
ret %"pkgFoo__D"* %"1"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo__D"* %"self", i32 0, i32 0
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
%"1" = getelementptr [7 x i8]* @"s0", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define internal void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"self"){
%"1" = getelementptr [7 x i8]* @"s1", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define internal void @"pkgFoo__C___bar3"(%"pkgFoo__C"* %"self"){
%"1" = getelementptr [6 x i8]* @"s2", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define internal void @"pkgFoo__D___foo4"(%"pkgFoo__D"* %"self"){
%"1" = call %"pkgFoo__C"* @cast_pkgFoo__D_pkgFoo__C(%"pkgFoo__D"* %"self")
call void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"1")
%"2" = getelementptr [7 x i8]* @"s3", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"2", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
ret void
}
define i32 @main(){
%1 = call %"pkgFoo__Main"* @"create_pkgFoo__Main"()
call void @"pkgFoo__Main___main5"(%"pkgFoo__Main"*  %1)
ret i32 0
}
define internal void @"pkgFoo__Main___main5"(%"pkgFoo__Main"* %"self"){
%"1" = getelementptr [13 x i8]* @"s4", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"1", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
%"d" = alloca %"pkgFoo__D"*
%"2" = call %"pkgFoo__D"* @"create_pkgFoo__D"()
store %"pkgFoo__D"* %"2", %"pkgFoo__D"** %"d"
%"3" = load %"pkgFoo__D"** %"d"
call void @"pkgFoo__D___foo4"(%"pkgFoo__D"* %"3")
%"4" = icmp eq i1 false, true
br i1 %"4", label %llvmlabel5, label %llvmlabel7
llvmlabel5:
%"8" = getelementptr [8 x i8]* @"s5", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"8", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
br label %llvmlabel6
llvmlabel7:
%"9" = getelementptr [8 x i8]* @"s6", i32 0, i32 0
call void @kermeta_io__StdIO___writeln(i8* %"9", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
br label %llvmlabel6
llvmlabel6:
%"i" = alloca i1
store i1 false, i1* %"i"
br label %llvmlabel10
llvmlabel10:
%"13" = load i1* %"i"
%"14" = icmp eq i1 %"13", false
br i1 %"14", label %llvmlabel12, label %llvmlabel11
llvmlabel11:
%"15" = load i1* %"i"
%"16" = zext i1 %"15" to i8
%"17" = call i8* @kermeta_standard__Boolean___toString(i8 %"16")
call void @kermeta_io__StdIO___writeln(i8* %"17", %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
%"18" = load i1* %"i"
store i1 false, i1* %"i"
br label %llvmlabel10
llvmlabel12:
%"22" = load %"pkgFoo__D"** %"d"
%"23" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"22")
call void @"pkgFoo__C___bar3"(%"pkgFoo__C"* %"23")
%"b" = alloca %"pkgFoo__B"*
%"24" = call %"pkgFoo__D"* @"create_pkgFoo__D"()
%"25" = call %"pkgFoo__B"* @"cast_pkgFoo__D_pkgFoo__B"(%"pkgFoo__D"* %"24")
store %"pkgFoo__B"* %"25", %"pkgFoo__B"** %"b"
ret void
}
