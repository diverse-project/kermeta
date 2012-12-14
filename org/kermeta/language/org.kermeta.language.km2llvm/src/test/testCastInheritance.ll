%"pkgFoo_A" = type {%"pkgFoo_B"*}
%"pkgFoo_B" = type {%"pkgFoo_A"*, %"pkgFoo_C"*}
%"pkgFoo_C" = type {%"pkgFoo_B"*, %"pkgFoo_D"*}
%"pkgFoo_D" = type {%"pkgFoo_C"*}
define internal %"pkgFoo_A"* @"create_pkgFoo_A"(){
%r = alloca %"pkgFoo_A"
ret %"pkgFoo_A"* %r
}
define internal %"pkgFoo_B"* @"create_pkgFoo_B"(){
%r = alloca %"pkgFoo_B"
%"0" = call %"pkgFoo_A"* @"create_pkgFoo_A"()
%"00" = getelementptr %"pkgFoo_B"* %r,i32 0,i32 0
store %"pkgFoo_A"* %"0",%"pkgFoo_A"** %"00"
ret %"pkgFoo_B"* %r
}
define internal %"pkgFoo_C"* @"create_pkgFoo_C"(){
%r = alloca %"pkgFoo_C"
%"0" = call %"pkgFoo_B"* @"create_pkgFoo_B"()
%"00" = getelementptr %"pkgFoo_C"* %r,i32 0,i32 0
store %"pkgFoo_B"* %"0",%"pkgFoo_B"** %"00"
ret %"pkgFoo_C"* %r
}
define internal %"pkgFoo_D"* @"create_pkgFoo_D"(){
%r = alloca %"pkgFoo_D"
%"0" = call %"pkgFoo_C"* @"create_pkgFoo_C"()
%"00" = getelementptr %"pkgFoo_D"* %r,i32 0,i32 0
store %"pkgFoo_C"* %"0",%"pkgFoo_C"** %"00"
ret %"pkgFoo_D"* %r
}
define internal %"pkgFoo_B"* @"cast_pkgFoo_A_pkgFoo_B"(%"pkgFoo_A"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo_A"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo_B"** %"0"
ret %"pkgFoo_B"* %"1"
}
define internal %"pkgFoo_A"* @"cast_pkgFoo_B_pkgFoo_A"(%"pkgFoo_B"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo_B"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo_A"** %"0"
ret %"pkgFoo_A"* %"1"
}
define internal %"pkgFoo_C"* @"cast_pkgFoo_B_pkgFoo_C"(%"pkgFoo_B"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo_B"* %"self",i32 0,i32 1
%"1" = load %"pkgFoo_C"** %"0"
ret %"pkgFoo_C"* %"1"
}
define internal %"pkgFoo_B"* @"cast_pkgFoo_C_pkgFoo_B"(%"pkgFoo_C"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo_C"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo_B"** %"0"
ret %"pkgFoo_B"* %"1"
}
define internal %"pkgFoo_A"* @"cast_pkgFoo_C_pkgFoo_A"(%"pkgFoo_C"* %"self") readonly{
%"v0" = call %"pkgFoo_B"* @"cast_pkgFoo_C_pkgFoo_B"(%"pkgFoo_C"* %"self")
%"v1" = call %"pkgFoo_A"* @"cast_pkgFoo_B_pkgFoo_A"(%"pkgFoo_B"* %"v0")
ret %"pkgFoo_A"* %"v1"
}
define internal %"pkgFoo_D"* @"cast_pkgFoo_C_pkgFoo_D"(%"pkgFoo_C"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo_C"* %"self",i32 0,i32 1
%"1" = load %"pkgFoo_D"** %"0"
ret %"pkgFoo_D"* %"1"
}
define internal %"pkgFoo_C"* @"cast_pkgFoo_D_pkgFoo_C"(%"pkgFoo_D"* %"self") readonly inlinehint{
%"0" = getelementptr %"pkgFoo_D"* %"self",i32 0,i32 0
%"1" = load %"pkgFoo_C"** %"0"
ret %"pkgFoo_C"* %"1"
}
define internal %"pkgFoo_B"* @"cast_pkgFoo_D_pkgFoo_B"(%"pkgFoo_D"* %"self") readonly{
%"v0" = call %"pkgFoo_C"* @"cast_pkgFoo_D_pkgFoo_C"(%"pkgFoo_D"* %"self")
%"v1" = call %"pkgFoo_B"* @"cast_pkgFoo_C_pkgFoo_B"(%"pkgFoo_C"* %"v0")
ret %"pkgFoo_B"* %"v1"
}
define internal %"pkgFoo_A"* @"cast_pkgFoo_D_pkgFoo_A"(%"pkgFoo_D"* %"self") readonly{
%"v0" = call %"pkgFoo_C"* @"cast_pkgFoo_D_pkgFoo_C"(%"pkgFoo_D"* %"self")
%"v1" = call %"pkgFoo_B"* @"cast_pkgFoo_C_pkgFoo_B"(%"pkgFoo_C"* %"v0")
%"v2" = call %"pkgFoo_A"* @"cast_pkgFoo_B_pkgFoo_A"(%"pkgFoo_B"* %"v1")
ret %"pkgFoo_A"* %"v2"
}
