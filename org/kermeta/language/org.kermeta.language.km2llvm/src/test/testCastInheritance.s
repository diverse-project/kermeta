	.file	"testCastInheritance.ll"
	.text
	.globl	create_kermeta_standard__String
	.align	16, 0x90
	.type	create_kermeta_standard__String,@function
create_kermeta_standard__String:        # @create_kermeta_standard__String
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp1:
	.cfi_def_cfa_offset 16
	movl	$8, %edi
	callq	malloc
	movq	%rax, (%rsp)
	popq	%rdx
	ret
.Ltmp2:
	.size	create_kermeta_standard__String, .Ltmp2-create_kermeta_standard__String
	.cfi_endproc

	.globl	delete_kermeta_standard__String
	.align	16, 0x90
	.type	delete_kermeta_standard__String,@function
delete_kermeta_standard__String:        # @delete_kermeta_standard__String
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp4:
	.cfi_def_cfa_offset 16
	movq	%rdi, (%rsp)
	movq	(%rdi), %rdi
	callq	free
	movq	(%rsp), %rdi
	callq	free
	popq	%rax
	ret
.Ltmp5:
	.size	delete_kermeta_standard__String, .Ltmp5-delete_kermeta_standard__String
	.cfi_endproc

	.globl	kermeta_standard__String___plus
	.align	16, 0x90
	.type	kermeta_standard__String___plus,@function
kermeta_standard__String___plus:        # @kermeta_standard__String___plus
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	%rsi, -16(%rsp)
	ret
.Ltmp6:
	.size	kermeta_standard__String___plus, .Ltmp6-kermeta_standard__String___plus
	.cfi_endproc

	.globl	kermeta_standard__String___equals
	.align	16, 0x90
	.type	kermeta_standard__String___equals,@function
kermeta_standard__String___equals:      # @kermeta_standard__String___equals
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	%rsi, -16(%rsp)
	ret
.Ltmp7:
	.size	kermeta_standard__String___equals, .Ltmp7-kermeta_standard__String___equals
	.cfi_endproc

	.globl	kermeta_standard__String___toString
	.align	16, 0x90
	.type	kermeta_standard__String___toString,@function
kermeta_standard__String___toString:    # @kermeta_standard__String___toString
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	ret
.Ltmp8:
	.size	kermeta_standard__String___toString, .Ltmp8-kermeta_standard__String___toString
	.cfi_endproc

	.globl	kermeta_standard__String___hashcode
	.align	16, 0x90
	.type	kermeta_standard__String___hashcode,@function
kermeta_standard__String___hashcode:    # @kermeta_standard__String___hashcode
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	ret
.Ltmp9:
	.size	kermeta_standard__String___hashcode, .Ltmp9-kermeta_standard__String___hashcode
	.cfi_endproc

	.globl	kermeta_standard__String___compareTo
	.align	16, 0x90
	.type	kermeta_standard__String___compareTo,@function
kermeta_standard__String___compareTo:   # @kermeta_standard__String___compareTo
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	%rsi, -16(%rsp)
	ret
.Ltmp10:
	.size	kermeta_standard__String___compareTo, .Ltmp10-kermeta_standard__String___compareTo
	.cfi_endproc

	.globl	kermeta_standard__String___indexOf
	.align	16, 0x90
	.type	kermeta_standard__String___indexOf,@function
kermeta_standard__String___indexOf:     # @kermeta_standard__String___indexOf
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	%rsi, -16(%rsp)
	ret
.Ltmp11:
	.size	kermeta_standard__String___indexOf, .Ltmp11-kermeta_standard__String___indexOf
	.cfi_endproc

	.globl	kermeta_standard__String___charAt
	.align	16, 0x90
	.type	kermeta_standard__String___charAt,@function
kermeta_standard__String___charAt:      # @kermeta_standard__String___charAt
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	ret
.Ltmp12:
	.size	kermeta_standard__String___charAt, .Ltmp12-kermeta_standard__String___charAt
	.cfi_endproc

	.globl	kermeta___io__Stdio_writeln
	.align	16, 0x90
	.type	kermeta___io__Stdio_writeln,@function
kermeta___io__Stdio_writeln:            # @kermeta___io__Stdio_writeln
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp14:
	.cfi_def_cfa_offset 16
	movq	%rdi, (%rsp)
	movq	(%rdi), %rdi
	callq	puts
	popq	%rax
	ret
.Ltmp15:
	.size	kermeta___io__Stdio_writeln, .Ltmp15-kermeta___io__Stdio_writeln
	.cfi_endproc

	.globl	kermeta___io__Stdio_write
	.align	16, 0x90
	.type	kermeta___io__Stdio_write,@function
kermeta___io__Stdio_write:              # @kermeta___io__Stdio_write
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp17:
	.cfi_def_cfa_offset 16
	movq	%rdi, (%rsp)
	movq	(%rdi), %rsi
	movl	$.L.str, %edi
	xorb	%al, %al
	callq	printf
	popq	%rax
	ret
.Ltmp18:
	.size	kermeta___io__Stdio_write, .Ltmp18-kermeta___io__Stdio_write
	.cfi_endproc

	.globl	kermeta___io__Stdio_errorln
	.align	16, 0x90
	.type	kermeta___io__Stdio_errorln,@function
kermeta___io__Stdio_errorln:            # @kermeta___io__Stdio_errorln
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp20:
	.cfi_def_cfa_offset 16
	movq	%rdi, (%rsp)
	movq	(%rdi), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str1, %esi
	xorb	%al, %al
	callq	fprintf
	popq	%rax
	ret
.Ltmp21:
	.size	kermeta___io__Stdio_errorln, .Ltmp21-kermeta___io__Stdio_errorln
	.cfi_endproc

	.globl	kermeta___io__Stdio_error
	.align	16, 0x90
	.type	kermeta___io__Stdio_error,@function
kermeta___io__Stdio_error:              # @kermeta___io__Stdio_error
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp23:
	.cfi_def_cfa_offset 16
	movq	%rdi, (%rsp)
	movq	(%rdi), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str, %esi
	xorb	%al, %al
	callq	fprintf
	popq	%rax
	ret
.Ltmp24:
	.size	kermeta___io__Stdio_error, .Ltmp24-kermeta___io__Stdio_error
	.cfi_endproc

	.globl	kermeta___io__Stdio_read
	.align	16, 0x90
	.type	kermeta___io__Stdio_read,@function
kermeta___io__Stdio_read:               # @kermeta___io__Stdio_read
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	xorl	%eax, %eax
	ret
.Ltmp25:
	.size	kermeta___io__Stdio_read, .Ltmp25-kermeta___io__Stdio_read
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__A,@function
create_pkgFoo__A:                       # @create_pkgFoo__A
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp26:
	.size	create_pkgFoo__A, .Ltmp26-create_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__B,@function
create_pkgFoo__B:                       # @create_pkgFoo__B
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp28:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__A
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp29:
	.size	create_pkgFoo__B, .Ltmp29-create_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__C,@function
create_pkgFoo__C:                       # @create_pkgFoo__C
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp31:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__B
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp32:
	.size	create_pkgFoo__C, .Ltmp32-create_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__D,@function
create_pkgFoo__D:                       # @create_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp34:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__C
	movq	%rax, (%rsp)
	leaq	(%rsp), %rax
	popq	%rdx
	ret
.Ltmp35:
	.size	create_pkgFoo__D, .Ltmp35-create_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__Main,@function
create_pkgFoo__Main:                    # @create_pkgFoo__Main
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp36:
	.size	create_pkgFoo__Main, .Ltmp36-create_pkgFoo__Main
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__B,@function
cast_pkgFoo__A_pkgFoo__B:               # @cast_pkgFoo__A_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp37:
	.size	cast_pkgFoo__A_pkgFoo__B, .Ltmp37-cast_pkgFoo__A_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__C,@function
cast_pkgFoo__A_pkgFoo__C:               # @cast_pkgFoo__A_pkgFoo__C
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp39:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__A_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__C
	popq	%rdx
	ret
.Ltmp40:
	.size	cast_pkgFoo__A_pkgFoo__C, .Ltmp40-cast_pkgFoo__A_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__D,@function
cast_pkgFoo__A_pkgFoo__D:               # @cast_pkgFoo__A_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp42:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__A_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__D
	popq	%rdx
	ret
.Ltmp43:
	.size	cast_pkgFoo__A_pkgFoo__D, .Ltmp43-cast_pkgFoo__A_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__A,@function
cast_pkgFoo__B_pkgFoo__A:               # @cast_pkgFoo__B_pkgFoo__A
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp44:
	.size	cast_pkgFoo__B_pkgFoo__A, .Ltmp44-cast_pkgFoo__B_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__C,@function
cast_pkgFoo__B_pkgFoo__C:               # @cast_pkgFoo__B_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp45:
	.size	cast_pkgFoo__B_pkgFoo__C, .Ltmp45-cast_pkgFoo__B_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__D,@function
cast_pkgFoo__B_pkgFoo__D:               # @cast_pkgFoo__B_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp47:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__B_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__D
	popq	%rdx
	ret
.Ltmp48:
	.size	cast_pkgFoo__B_pkgFoo__D, .Ltmp48-cast_pkgFoo__B_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__B,@function
cast_pkgFoo__C_pkgFoo__B:               # @cast_pkgFoo__C_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp49:
	.size	cast_pkgFoo__C_pkgFoo__B, .Ltmp49-cast_pkgFoo__C_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__A,@function
cast_pkgFoo__C_pkgFoo__A:               # @cast_pkgFoo__C_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp51:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp52:
	.size	cast_pkgFoo__C_pkgFoo__A, .Ltmp52-cast_pkgFoo__C_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__D,@function
cast_pkgFoo__C_pkgFoo__D:               # @cast_pkgFoo__C_pkgFoo__D
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp53:
	.size	cast_pkgFoo__C_pkgFoo__D, .Ltmp53-cast_pkgFoo__C_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__C,@function
cast_pkgFoo__D_pkgFoo__C:               # @cast_pkgFoo__D_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp54:
	.size	cast_pkgFoo__D_pkgFoo__C, .Ltmp54-cast_pkgFoo__D_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__B,@function
cast_pkgFoo__D_pkgFoo__B:               # @cast_pkgFoo__D_pkgFoo__B
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp56:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	popq	%rdx
	ret
.Ltmp57:
	.size	cast_pkgFoo__D_pkgFoo__B, .Ltmp57-cast_pkgFoo__D_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__A,@function
cast_pkgFoo__D_pkgFoo__A:               # @cast_pkgFoo__D_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp59:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp60:
	.size	cast_pkgFoo__D_pkgFoo__A, .Ltmp60-cast_pkgFoo__D_pkgFoo__A
	.cfi_endproc

	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp62:
	.cfi_def_cfa_offset 16
	callq	pkgFoo__Main___main1
	xorl	%eax, %eax
	popq	%rdx
	ret
.Ltmp63:
	.size	main, .Ltmp63-main
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__Main___main1,@function
pkgFoo__Main___main1:                   # @pkgFoo__Main___main1
	.cfi_startproc
# BB#0:
	ret
.Ltmp64:
	.size	pkgFoo__Main___main1, .Ltmp64-pkgFoo__Main___main1
	.cfi_endproc

	.type	.L.str,@object          # @.str
	.section	.rodata.str1.1,"aMS",@progbits,1
.L.str:
	.asciz	 "%s"
	.size	.L.str, 3

	.type	.L.str1,@object         # @.str1
.L.str1:
	.asciz	 "%s\n"
	.size	.L.str1, 4


	.section	".note.GNU-stack","",@progbits
