; ModuleID = 'testCastInheritance.ll'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i64, i32, [20 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.kermeta_io__StdIO = type {}
%struct.kermeta_standard__Object = type { %struct.kermeta_standard__Object* }
%pkgFoo__B = type { i8**, %pkgFoo__A* }
%pkgFoo__A = type { i8** }
%pkgFoo__C = type { i8**, %pkgFoo__B* }
%pkgFoo__D = type { i8**, %pkgFoo__C* }
%pkgFoo__Main = type { i8** }

@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str2 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str3 = private unnamed_addr constant [3 x i8] c"%s\00", align 1
@stderr = external global %struct._IO_FILE*
@.str4 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@SINGLETON_kermeta_io__StdIO = common global %struct.kermeta_io__StdIO zeroinitializer, align 1
@s0 = private unnamed_addr constant [7 x i8] c"B.foo!\00"
@s1 = private unnamed_addr constant [7 x i8] c"C.foo!\00"
@s2 = private unnamed_addr constant [6 x i8] c"C.bar\00"
@s3 = private unnamed_addr constant [7 x i8] c"D.foo!\00"
@s4 = private unnamed_addr constant [13 x i8] c"Hello World!\00"
@s6 = private unnamed_addr constant [8 x i8] c"ifElse!\00"
@"pkgFoo__B##dynBind" = global [1 x i8*] [i8* bitcast (void (%pkgFoo__B*)* @pkgFoo__B___foo1 to i8*)]
@"kermeta_io__StdIO##dynBind" = global [1 x i8*] [i8* bitcast (void (i8*, %struct.kermeta_io__StdIO*)* @kermeta_io__StdIO___writeln to i8*)]
@"pkgFoo__C##dynBind" = global [2 x i8*] [i8* bitcast (void (%pkgFoo__C*)* @pkgFoo__C___bar2 to i8*), i8* bitcast (void (%pkgFoo__C*)* @pkgFoo__C___foo3 to i8*)]
@"pkgFoo__D##dynBind" = global [2 x i8*] [i8* bitcast (void (%pkgFoo__C*)* @pkgFoo__C___bar2 to i8*), i8* bitcast (void (%pkgFoo__D*)* @pkgFoo__D___foo4 to i8*)]
@"pkgFoo__Main##dynBind" = global [1 x i8*] [i8* bitcast (void (%pkgFoo__Main*)* @pkgFoo__Main___main5 to i8*)]

define %struct.kermeta_standard__Object* @kermeta_standard__Object___container(%struct.kermeta_standard__Object* nocapture %self) nounwind uwtable readonly {
  %1 = getelementptr inbounds %struct.kermeta_standard__Object* %self, i64 0, i32 0
  %2 = load %struct.kermeta_standard__Object** %1, align 8
  ret %struct.kermeta_standard__Object* %2
}

define void @delete_kermeta_standard__String(i8* nocapture %s) nounwind uwtable {
  tail call void @free(i8* %s) nounwind
  ret void
}

declare void @free(i8* nocapture) nounwind

define noalias %struct.kermeta_standard__Object* @kermeta_standard__String___container(i8* nocapture %self) nounwind uwtable readnone {
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__String___plus(i8* nocapture %s, i8* nocapture %self) nounwind uwtable {
  %1 = tail call i64 @strlen(i8* %s) nounwind readonly
  %2 = tail call i64 @strlen(i8* %self) nounwind readonly
  %3 = add i64 %1, 1
  %4 = add i64 %3, %2
  %5 = tail call noalias i8* @calloc(i64 %4, i64 1) nounwind
  %6 = tail call i8* @strcat(i8* %5, i8* %self) nounwind
  %7 = tail call i8* @strcat(i8* %5, i8* %s) nounwind
  ret i8* %5
}

declare noalias i8* @calloc(i64, i64) nounwind

declare i64 @strlen(i8* nocapture) nounwind readonly

declare i8* @strcat(i8*, i8* nocapture) nounwind

define void @kermeta_standard__String___equals(%struct.kermeta_standard__Object* nocapture %o, i8* nocapture %self) nounwind uwtable readnone {
  ret void
}

define i8* @kermeta_standard__String___toString(i8* %self) nounwind uwtable readnone {
  ret i8* %self
}

define void @kermeta_standard__String___hashcode(i8* nocapture %self) nounwind uwtable readnone {
  ret void
}

define i32 @kermeta_standard__String___compareTo(i8* nocapture %s, i8* nocapture %self) nounwind uwtable readonly {
  %1 = tail call i32 @strcmp(i8* %self, i8* %s) nounwind readonly
  ret i32 %1
}

declare i32 @strcmp(i8* nocapture, i8* nocapture) nounwind readonly

define i32 @kermeta_standard__String___indexOf(i8* nocapture %s, i8* %self) nounwind uwtable readonly {
  %1 = tail call i8* @strstr(i8* %self, i8* %s) nounwind readonly
  %2 = icmp eq i8* %1, null
  br i1 %2, label %8, label %3

; <label>:3                                       ; preds = %0
  %4 = ptrtoint i8* %1 to i64
  %5 = ptrtoint i8* %self to i64
  %6 = sub i64 %4, %5
  %7 = trunc i64 %6 to i32
  br label %8

; <label>:8                                       ; preds = %0, %3
  %res.0 = phi i32 [ %7, %3 ], [ -1, %0 ]
  ret i32 %res.0
}

declare i8* @strstr(i8*, i8* nocapture) nounwind readonly

define signext i8 @kermeta_standard__String___charAt(i32 %index, i8* nocapture %self) nounwind uwtable readonly {
  %1 = icmp slt i32 %index, 0
  br i1 %1, label %9, label %2

; <label>:2                                       ; preds = %0
  %3 = sext i32 %index to i64
  %4 = tail call i64 @strlen(i8* %self) nounwind readonly
  %5 = icmp ult i64 %3, %4
  br i1 %5, label %6, label %9

; <label>:6                                       ; preds = %2
  %7 = getelementptr inbounds i8* %self, i64 %3
  %8 = load i8* %7, align 1
  br label %9

; <label>:9                                       ; preds = %2, %0, %6
  %10 = phi i8 [ %8, %6 ], [ 0, %2 ], [ 0, %0 ]
  ret i8 %10
}

define noalias %struct.kermeta_standard__Object* @kermeta_standard__Integer___container(i32 %self) nounwind uwtable readnone {
  ret %struct.kermeta_standard__Object* null
}

define noalias i8* @kermeta_standard__Integer___toString(i32 %self) nounwind uwtable {
  %self.lobit = lshr i32 %self, 31
  %1 = icmp eq i32 %self, 0
  br i1 %1, label %2, label %4

; <label>:2                                       ; preds = %0
  %3 = add nsw i32 %self.lobit, 1
  br label %13

; <label>:4                                       ; preds = %0
  %ispos = icmp sgt i32 %self, -1
  %neg = sub i32 0, %self
  %5 = select i1 %ispos, i32 %self, i32 %neg
  %6 = sitofp i32 %5 to double
  %7 = tail call double @log10(double %6) nounwind
  %8 = tail call double @floor(double %7) nounwind readnone
  %9 = fadd double %8, 1.000000e+00
  %10 = sitofp i32 %self.lobit to double
  %11 = fadd double %10, %9
  %12 = fptosi double %11 to i32
  br label %13

; <label>:13                                      ; preds = %4, %2
  %lgth.0 = phi i32 [ %3, %2 ], [ %12, %4 ]
  %14 = sext i32 %lgth.0 to i64
  %15 = tail call noalias i8* @malloc(i64 %14) nounwind
  %16 = tail call i32 (i8*, i64, i8*, ...)* @snprintf(i8* %15, i64 8, i8* getelementptr inbounds ([3 x i8]* @.str, i64 0, i64 0), i32 %self) nounwind
  ret i8* %15
}

declare double @floor(double) nounwind readnone

declare double @log10(double) nounwind

declare noalias i8* @malloc(i64) nounwind

declare i32 @snprintf(i8* nocapture, i64, i8* nocapture, ...) nounwind

define noalias %struct.kermeta_standard__Object* @kermeta_standard__Boolean___container(i8 zeroext %self) nounwind uwtable readnone {
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__Boolean___toString(i8 zeroext %self) nounwind uwtable {
  %1 = icmp eq i8 %self, 0
  br i1 %1, label %5, label %2

; <label>:2                                       ; preds = %0
  %3 = tail call noalias i8* @malloc(i64 4) nounwind
  %4 = bitcast i8* %3 to i32*
  store i32 1702195828, i32* %4, align 1
  br label %7

; <label>:5                                       ; preds = %0
  %6 = tail call noalias i8* @malloc(i64 5) nounwind
  tail call void @llvm.memcpy.p0i8.p0i8.i64(i8* %6, i8* getelementptr inbounds ([6 x i8]* @.str2, i64 0, i64 0), i64 5, i32 1, i1 false)
  br label %7

; <label>:7                                       ; preds = %5, %2
  %str.0 = phi i8* [ %3, %2 ], [ %6, %5 ]
  ret i8* %str.0
}

define void @kermeta_io__StdIO___writeln(i8* nocapture %o, %struct.kermeta_io__StdIO* nocapture %self) nounwind uwtable {
  %1 = tail call i32 @puts(i8* %o) nounwind
  ret void
}

declare i32 @puts(i8* nocapture) nounwind

define void @kermeta_io__StdIO___write(i8* %o, %struct.kermeta_io__StdIO* nocapture %self) nounwind uwtable {
  %1 = tail call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.str3, i64 0, i64 0), i8* %o) nounwind
  ret void
}

declare i32 @printf(i8* nocapture, ...) nounwind

define void @kermeta_io__StdIO___errorln(i8* %o, %struct.kermeta_io__StdIO* nocapture %self) nounwind uwtable {
  %1 = load %struct._IO_FILE** @stderr, align 8
  %2 = tail call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %1, i8* getelementptr inbounds ([4 x i8]* @.str4, i64 0, i64 0), i8* %o) nounwind
  ret void
}

declare i32 @fprintf(%struct._IO_FILE* nocapture, i8* nocapture, ...) nounwind

define void @kermeta__o__StdIO___error(i8* %o, %struct.kermeta_io__StdIO* nocapture %self) nounwind uwtable {
  %1 = load %struct._IO_FILE** @stderr, align 8
  %fputs = tail call i32 @fputs(i8* %o, %struct._IO_FILE* %1)
  ret void
}

define noalias i8* @kermeta___io__StdIO_read(i8* nocapture %o, %struct.kermeta_io__StdIO* nocapture %self) nounwind uwtable readnone {
  ret i8* null
}

define noalias %struct.kermeta_standard__Object* @kermeta_io__StdIO___container(%struct.kermeta_io__StdIO* nocapture %self) nounwind uwtable readnone {
  ret %struct.kermeta_standard__Object* null
}

define internal void @pkgFoo__B___foo1(%pkgFoo__B* nocapture %self) {
  %"2" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"3" = bitcast i8* %"2" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"3"(i8* getelementptr inbounds ([7 x i8]* @s0, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  ret void
}

define internal void @pkgFoo__C___foo3(%pkgFoo__C* nocapture %self) {
  %"2" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"3" = bitcast i8* %"2" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"3"(i8* getelementptr inbounds ([7 x i8]* @s1, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  ret void
}

define internal void @pkgFoo__C___bar2(%pkgFoo__C* nocapture %self) {
  %"2" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"3" = bitcast i8* %"2" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"3"(i8* getelementptr inbounds ([6 x i8]* @s2, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  ret void
}

define internal void @pkgFoo__D___foo4(%pkgFoo__D* nocapture %self) {
  %"2.i" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"3.i" = bitcast i8* %"2.i" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"3.i"(i8* getelementptr inbounds ([7 x i8]* @s1, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  %"3" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"4" = bitcast i8* %"3" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"4"(i8* getelementptr inbounds ([7 x i8]* @s3, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  ret void
}

define i32 @main() {
  %"2.i1" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"3.i2" = bitcast i8* %"2.i1" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"3.i2"(i8* getelementptr inbounds ([13 x i8]* @s4, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  %"2.i.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i" = bitcast i8* %"2.i.i" to %pkgFoo__D*
  %"2.i.i.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i.i" = bitcast i8* %"2.i.i.i" to %pkgFoo__C*
  %"2.i.i.i.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i.i.i" = bitcast i8* %"2.i.i.i.i" to %pkgFoo__B*
  %"2.i.i.i.i.i" = tail call noalias i8* @malloc(i64 8) nounwind
  %"3.i.i.i.i.i" = bitcast i8* %"2.i.i.i.i.i" to %pkgFoo__A*
  %"6.i.i.i.i" = getelementptr i8* %"2.i.i.i.i", i64 8
  %1 = bitcast i8* %"6.i.i.i.i" to %pkgFoo__A**
  store %pkgFoo__A* %"3.i.i.i.i.i", %pkgFoo__A** %1, align 8
  %"7.i.i.i.i" = bitcast i8* %"2.i.i.i.i" to i8***
  store i8** getelementptr inbounds ([1 x i8*]* @"pkgFoo__B##dynBind", i64 0, i64 0), i8*** %"7.i.i.i.i", align 8
  %"6.i.i.i" = getelementptr i8* %"2.i.i.i", i64 8
  %2 = bitcast i8* %"6.i.i.i" to %pkgFoo__B**
  store %pkgFoo__B* %"3.i.i.i.i", %pkgFoo__B** %2, align 8
  %"7.i.i.i" = bitcast i8* %"2.i.i.i" to i8***
  store i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__C##dynBind", i64 0, i64 0), i8*** %"7.i.i.i", align 8
  %"6.i.i" = getelementptr i8* %"2.i.i", i64 8
  %3 = bitcast i8* %"6.i.i" to %pkgFoo__C**
  store %pkgFoo__C* %"3.i.i.i", %pkgFoo__C** %3, align 8
  %"7.i.i" = bitcast i8* %"2.i.i" to i8***
  store i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__D##dynBind", i64 0, i64 0), i8*** %"7.i.i", align 8
  %"8.i" = load i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__D##dynBind", i64 0, i64 1), align 8
  %"9.i" = bitcast i8* %"8.i" to void (%pkgFoo__D*)*
  tail call void %"9.i"(%pkgFoo__D* %"3.i.i")
  %"22.i" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"23.i" = bitcast i8* %"22.i" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"23.i"(i8* getelementptr inbounds ([8 x i8]* @s6, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  %"6.idx.val.i" = load %pkgFoo__C** %3, align 8
  %"56.i" = load i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__C##dynBind", i64 0, i64 0), align 8
  %"57.i" = bitcast i8* %"56.i" to void (%pkgFoo__C*)*
  tail call void %"57.i"(%pkgFoo__C* %"6.idx.val.i")
  %"2.i.i.i5.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i.i6.i" = bitcast i8* %"2.i.i.i5.i" to %pkgFoo__B*
  %"2.i.i.i.i7.i" = tail call noalias i8* @malloc(i64 8) nounwind
  %"3.i.i.i.i8.i" = bitcast i8* %"2.i.i.i.i7.i" to %pkgFoo__A*
  %"6.i.i.i9.i" = getelementptr i8* %"2.i.i.i5.i", i64 8
  %4 = bitcast i8* %"6.i.i.i9.i" to %pkgFoo__A**
  store %pkgFoo__A* %"3.i.i.i.i8.i", %pkgFoo__A** %4, align 8
  %"7.i.i.i10.i" = bitcast i8* %"2.i.i.i5.i" to i8***
  store i8** getelementptr inbounds ([1 x i8*]* @"pkgFoo__B##dynBind", i64 0, i64 0), i8*** %"7.i.i.i10.i", align 8
  %"63.i" = load i8** getelementptr inbounds ([1 x i8*]* @"pkgFoo__B##dynBind", i64 0, i64 0), align 8
  %"64.i" = bitcast i8* %"63.i" to void (%pkgFoo__B*)*
  tail call void %"64.i"(%pkgFoo__B* %"3.i.i.i6.i")
  ret i32 0
}

define internal void @pkgFoo__Main___main5(%pkgFoo__Main* nocapture %self) {
llvmlabel15:
  %"2" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"3" = bitcast i8* %"2" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"3"(i8* getelementptr inbounds ([13 x i8]* @s4, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  %"2.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i" = bitcast i8* %"2.i" to %pkgFoo__D*
  %"2.i.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i" = bitcast i8* %"2.i.i" to %pkgFoo__C*
  %"2.i.i.i" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i.i" = bitcast i8* %"2.i.i.i" to %pkgFoo__B*
  %"2.i.i.i.i" = tail call noalias i8* @malloc(i64 8) nounwind
  %"3.i.i.i.i" = bitcast i8* %"2.i.i.i.i" to %pkgFoo__A*
  %"6.i.i.i" = getelementptr i8* %"2.i.i.i", i64 8
  %0 = bitcast i8* %"6.i.i.i" to %pkgFoo__A**
  store %pkgFoo__A* %"3.i.i.i.i", %pkgFoo__A** %0, align 8
  %"7.i.i.i" = bitcast i8* %"2.i.i.i" to i8***
  store i8** getelementptr inbounds ([1 x i8*]* @"pkgFoo__B##dynBind", i64 0, i64 0), i8*** %"7.i.i.i", align 8
  %"6.i.i" = getelementptr i8* %"2.i.i", i64 8
  %1 = bitcast i8* %"6.i.i" to %pkgFoo__B**
  store %pkgFoo__B* %"3.i.i.i", %pkgFoo__B** %1, align 8
  %"7.i.i" = bitcast i8* %"2.i.i" to i8***
  store i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__C##dynBind", i64 0, i64 0), i8*** %"7.i.i", align 8
  %"6.i" = getelementptr i8* %"2.i", i64 8
  %2 = bitcast i8* %"6.i" to %pkgFoo__C**
  store %pkgFoo__C* %"3.i.i", %pkgFoo__C** %2, align 8
  %"7.i" = bitcast i8* %"2.i" to i8***
  store i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__D##dynBind", i64 0, i64 0), i8*** %"7.i", align 8
  %"8" = load i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__D##dynBind", i64 0, i64 1), align 8
  %"9" = bitcast i8* %"8" to void (%pkgFoo__D*)*
  tail call void %"9"(%pkgFoo__D* %"3.i")
  %"22" = load i8** getelementptr inbounds ([1 x i8*]* @"kermeta_io__StdIO##dynBind", i64 0, i64 0), align 8
  %"23" = bitcast i8* %"22" to void (i8*, %struct.kermeta_io__StdIO*)*
  tail call void %"23"(i8* getelementptr inbounds ([8 x i8]* @s6, i64 0, i64 0), %struct.kermeta_io__StdIO* @SINGLETON_kermeta_io__StdIO)
  %"6.idx.val" = load %pkgFoo__C** %2, align 8
  %"56" = load i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__C##dynBind", i64 0, i64 0), align 8
  %"57" = bitcast i8* %"56" to void (%pkgFoo__C*)*
  tail call void %"57"(%pkgFoo__C* %"6.idx.val")
  %"2.i.i3" = tail call noalias i8* @malloc(i64 16) nounwind
  %"2.i.i.i5" = tail call noalias i8* @malloc(i64 16) nounwind
  %"3.i.i.i6" = bitcast i8* %"2.i.i.i5" to %pkgFoo__B*
  %"2.i.i.i.i7" = tail call noalias i8* @malloc(i64 8) nounwind
  %"3.i.i.i.i8" = bitcast i8* %"2.i.i.i.i7" to %pkgFoo__A*
  %"6.i.i.i9" = getelementptr i8* %"2.i.i.i5", i64 8
  %3 = bitcast i8* %"6.i.i.i9" to %pkgFoo__A**
  store %pkgFoo__A* %"3.i.i.i.i8", %pkgFoo__A** %3, align 8
  %"7.i.i.i10" = bitcast i8* %"2.i.i.i5" to i8***
  store i8** getelementptr inbounds ([1 x i8*]* @"pkgFoo__B##dynBind", i64 0, i64 0), i8*** %"7.i.i.i10", align 8
  %"6.i.i11" = getelementptr i8* %"2.i.i3", i64 8
  %4 = bitcast i8* %"6.i.i11" to %pkgFoo__B**
  store %pkgFoo__B* %"3.i.i.i6", %pkgFoo__B** %4, align 8
  %"7.i.i12" = bitcast i8* %"2.i.i3" to i8***
  store i8** getelementptr inbounds ([2 x i8*]* @"pkgFoo__C##dynBind", i64 0, i64 0), i8*** %"7.i.i12", align 8
  %"63" = load i8** getelementptr inbounds ([1 x i8*]* @"pkgFoo__B##dynBind", i64 0, i64 0), align 8
  %"64" = bitcast i8* %"63" to void (%pkgFoo__B*)*
  tail call void %"64"(%pkgFoo__B* %"3.i.i.i6")
  ret void
}

declare void @llvm.memcpy.p0i8.p0i8.i64(i8* nocapture, i8* nocapture, i64, i32, i1) nounwind

declare i32 @fputs(i8* nocapture, %struct._IO_FILE* nocapture) nounwind
