; ModuleID = 'lib_std.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct.kermeta___standard_String = type { i8* }

define void @kermeta___io__Stdio_writeln(%struct.kermeta___standard_String* %o) nounwind uwtable {
  %1 = alloca %struct.kermeta___standard_String*, align 8
  store %struct.kermeta___standard_String* %o, %struct.kermeta___standard_String** %1, align 8
  %2 = load %struct.kermeta___standard_String** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta___standard_String* %2, i32 0, i32 0
  %4 = load i8** %3, align 8
  %5 = call i32 @puts(i8* %4)
  ret void
}

declare i32 @puts(i8*)
