; ModuleID = 'lib_std.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i64, i32, [20 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.kermeta_standard__String = type { %struct.kermeta_standard__Object, i8* }
%struct.kermeta_standard__Object = type { %struct.kermeta_standard__Object* }

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

define void @kermeta___io__StdIO_writeln(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct.kermeta_standard__String** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__String* %2, i32 0, i32 1
  %4 = load i8** %3, align 8
  %5 = call i32 @puts(i8* %4)
  ret void
}

declare i32 @puts(i8*)

define void @kermeta___io__StdIO_write(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct.kermeta_standard__String** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__String* %2, i32 0, i32 1
  %4 = load i8** %3, align 8
  %5 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i8* %4)
  ret void
}

declare i32 @printf(i8*, ...)

define void @kermeta___io__StdIO_errorln(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct._IO_FILE** @stderr, align 8
  %3 = load %struct.kermeta_standard__String** %1, align 8
  %4 = getelementptr inbounds %struct.kermeta_standard__String* %3, i32 0, i32 1
  %5 = load i8** %4, align 8
  %6 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %2, i8* getelementptr inbounds ([4 x i8]* @.str1, i32 0, i32 0), i8* %5)
  ret void
}

declare i32 @fprintf(%struct._IO_FILE*, i8*, ...)

define void @kermeta___io__StdIO_error(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  %2 = load %struct._IO_FILE** @stderr, align 8
  %3 = load %struct.kermeta_standard__String** %1, align 8
  %4 = getelementptr inbounds %struct.kermeta_standard__String* %3, i32 0, i32 1
  %5 = load i8** %4, align 8
  %6 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %2, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i8* %5)
  ret void
}

define %struct.kermeta_standard__String* @kermeta___io__StdIO_read(%struct.kermeta_standard__String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__String*, align 8
  store %struct.kermeta_standard__String* %o, %struct.kermeta_standard__String** %1, align 8
  ret %struct.kermeta_standard__String* null
}
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
define i32 @main(){
call void @"pkgFoo__Main___main1"()
ret i32 0
}
define internal void @"pkgFoo__Main___main1"(){
call void @"kermeta_io__StdIO___writeln"(%"2")
ret void
}
