%"pkg1_Cd0" = type {%"pkg1_Cd1"*, %"pkg1::pkg2_Cd2"*, %"pkg1_Cd3"*}
%"pkg1_Cd1" = type {%"pkg1_Cd0"*, %"pkg1_Cd1"*, %"pkg1::pkg2_Cd2"*, %"pkg1_Cd3"*, %"pkg1::pkg2_Cd2"*, %"pkg1::pkg2_Cd2"*}
%"pkg1_Cd3" = type {%"pkg1_Cd0"*, %"pkg1_Cd1"*, %"pkg1::pkg2_Cd2"*, %"pkg1_Cd3"*, %"pkg1::pkg2_Cd2"*}
%"pkg1::pkg2_Cd2" = type {%"pkg1_Cd1"*, %"pkg1::pkg2_Cd2"*, %"pkg1_Cd3"*}
define %"pkg1_Cd0"* @"create_pkg1_Cd0"(){
%r = alloca %"pkg1_Cd0"
ret %"pkg1_Cd0"* %r
}
define %"pkg1_Cd1"* @"create_pkg1_Cd1"(){
%r = alloca %"pkg1_Cd1"
%"0" = call %"pkg1_Cd0"* @"create_pkg1_Cd0"()
%"00" = getelementptr %"pkg1_Cd1"* %r,i32 0,i32 0
store %"pkg1_Cd0"* %"0",%"pkg1_Cd0"** %"00"
%"1" = call %"pkg1_Cd1"* @"create_pkg1_Cd1"()
%"11" = getelementptr %"pkg1_Cd1"* %r,i32 0,i32 1
store %"pkg1_Cd1"* %"1",%"pkg1_Cd1"** %"11"
%"2" = call %"pkg1::pkg2_Cd2"* @"create_pkg1::pkg2_Cd2"()
%"22" = getelementptr %"pkg1_Cd1"* %r,i32 0,i32 2
store %"pkg1::pkg2_Cd2"* %"2",%"pkg1::pkg2_Cd2"** %"22"
%"3" = call %"pkg1_Cd3"* @"create_pkg1_Cd3"()
%"33" = getelementptr %"pkg1_Cd1"* %r,i32 0,i32 3
store %"pkg1_Cd3"* %"3",%"pkg1_Cd3"** %"33"
ret %"pkg1_Cd1"* %r
}
define %"pkg1_Cd3"* @"create_pkg1_Cd3"(){
%r = alloca %"pkg1_Cd3"
%"0" = call %"pkg1_Cd0"* @"create_pkg1_Cd0"()
%"00" = getelementptr %"pkg1_Cd3"* %r,i32 0,i32 0
store %"pkg1_Cd0"* %"0",%"pkg1_Cd0"** %"00"
%"1" = call %"pkg1_Cd1"* @"create_pkg1_Cd1"()
%"11" = getelementptr %"pkg1_Cd3"* %r,i32 0,i32 1
store %"pkg1_Cd1"* %"1",%"pkg1_Cd1"** %"11"
%"2" = call %"pkg1::pkg2_Cd2"* @"create_pkg1::pkg2_Cd2"()
%"22" = getelementptr %"pkg1_Cd3"* %r,i32 0,i32 2
store %"pkg1::pkg2_Cd2"* %"2",%"pkg1::pkg2_Cd2"** %"22"
%"3" = call %"pkg1_Cd3"* @"create_pkg1_Cd3"()
%"33" = getelementptr %"pkg1_Cd3"* %r,i32 0,i32 3
store %"pkg1_Cd3"* %"3",%"pkg1_Cd3"** %"33"
ret %"pkg1_Cd3"* %r
}
define %"pkg1::pkg2_Cd2"* @"create_pkg1::pkg2_Cd2"(){
%r = alloca %"pkg1::pkg2_Cd2"
%"0" = call %"pkg1_Cd1"* @"create_pkg1_Cd1"()
%"00" = getelementptr %"pkg1::pkg2_Cd2"* %r,i32 0,i32 0
store %"pkg1_Cd1"* %"0",%"pkg1_Cd1"** %"00"
%"1" = call %"pkg1::pkg2_Cd2"* @"create_pkg1::pkg2_Cd2"()
%"11" = getelementptr %"pkg1::pkg2_Cd2"* %r,i32 0,i32 1
store %"pkg1::pkg2_Cd2"* %"1",%"pkg1::pkg2_Cd2"** %"11"
%"2" = call %"pkg1_Cd3"* @"create_pkg1_Cd3"()
%"22" = getelementptr %"pkg1::pkg2_Cd2"* %r,i32 0,i32 2
store %"pkg1_Cd3"* %"2",%"pkg1_Cd3"** %"22"
ret %"pkg1::pkg2_Cd2"* %r
}
