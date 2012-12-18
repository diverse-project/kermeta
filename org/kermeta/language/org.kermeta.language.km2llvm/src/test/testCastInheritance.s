	.file	"testCastInheritance.ll"
	.text
	.globl	kermeta_standard__String___plus
	.align	16, 0x90
	.type	kermeta_standard__String___plus,@function
kermeta_standard__String___plus:        # @kermeta_standard__String___plus
	.cfi_startproc
# BB#0:
	pushq	%rbx
.Ltmp2:
	.cfi_def_cfa_offset 16
	subq	$32, %rsp
.Ltmp3:
	.cfi_def_cfa_offset 48
.Ltmp4:
	.cfi_offset %rbx, -16
	movq	%rdi, 24(%rsp)
	movq	%rsi, 16(%rsp)
	movq	24(%rsp), %rdi
	callq	strlen
	movq	%rax, %rbx
	movq	16(%rsp), %rdi
	callq	strlen
	leaq	1(%rbx,%rax), %rdi
	movl	$8, %esi
	callq	calloc
	movq	%rax, 8(%rsp)
	movq	16(%rsp), %rsi
	movq	%rax, %rdi
	callq	strcat
	movq	24(%rsp), %rsi
	movq	8(%rsp), %rdi
	callq	strcat
	movq	8(%rsp), %rax
	addq	$32, %rsp
	popq	%rbx
	ret
.Ltmp5:
	.size	kermeta_standard__String___plus, .Ltmp5-kermeta_standard__String___plus
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
.Ltmp6:
	.size	kermeta_standard__String___equals, .Ltmp6-kermeta_standard__String___equals
	.cfi_endproc

	.globl	kermeta_standard__String___toString
	.align	16, 0x90
	.type	kermeta_standard__String___toString,@function
kermeta_standard__String___toString:    # @kermeta_standard__String___toString
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	%rdi, %rax
	ret
.Ltmp7:
	.size	kermeta_standard__String___toString, .Ltmp7-kermeta_standard__String___toString
	.cfi_endproc

	.globl	kermeta_standard__String___hashcode
	.align	16, 0x90
	.type	kermeta_standard__String___hashcode,@function
kermeta_standard__String___hashcode:    # @kermeta_standard__String___hashcode
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	ret
.Ltmp8:
	.size	kermeta_standard__String___hashcode, .Ltmp8-kermeta_standard__String___hashcode
	.cfi_endproc

	.globl	kermeta_standard__String___compareTo
	.align	16, 0x90
	.type	kermeta_standard__String___compareTo,@function
kermeta_standard__String___compareTo:   # @kermeta_standard__String___compareTo
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp10:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rax
	movq	%rsi, %rdi
	movq	%rax, %rsi
	callq	strcmp
	addq	$24, %rsp
	ret
.Ltmp11:
	.size	kermeta_standard__String___compareTo, .Ltmp11-kermeta_standard__String___compareTo
	.cfi_endproc

	.globl	kermeta_standard__String___indexOf
	.align	16, 0x90
	.type	kermeta_standard__String___indexOf,@function
kermeta_standard__String___indexOf:     # @kermeta_standard__String___indexOf
	.cfi_startproc
# BB#0:
	subq	$40, %rsp
.Ltmp13:
	.cfi_def_cfa_offset 48
	movq	%rdi, 32(%rsp)
	movq	%rsi, 24(%rsp)
	movq	32(%rsp), %rax
	movq	%rsi, %rdi
	movq	%rax, %rsi
	callq	strstr
	movq	%rax, 16(%rsp)
	testq	%rax, %rax
	je	.LBB5_1
# BB#2:
	movl	16(%rsp), %eax
	subl	24(%rsp), %eax
	movl	%eax, 12(%rsp)
	jmp	.LBB5_3
.LBB5_1:
	movl	$-1, 12(%rsp)
.LBB5_3:
	movl	12(%rsp), %eax
	addq	$40, %rsp
	ret
.Ltmp14:
	.size	kermeta_standard__String___indexOf, .Ltmp14-kermeta_standard__String___indexOf
	.cfi_endproc

	.globl	kermeta_standard__String___charAt
	.align	16, 0x90
	.type	kermeta_standard__String___charAt,@function
kermeta_standard__String___charAt:      # @kermeta_standard__String___charAt
	.cfi_startproc
# BB#0:
	pushq	%rbx
.Ltmp17:
	.cfi_def_cfa_offset 16
	subq	$16, %rsp
.Ltmp18:
	.cfi_def_cfa_offset 32
.Ltmp19:
	.cfi_offset %rbx, -16
	movl	%edi, 12(%rsp)
	movq	%rsi, (%rsp)
	xorl	%eax, %eax
	cmpl	$0, 12(%rsp)
	js	.LBB6_3
# BB#1:
	movslq	12(%rsp), %rbx
	movq	(%rsp), %rdi
	callq	strlen
	movq	%rax, %rcx
	xorl	%eax, %eax
	cmpq	%rcx, %rbx
	jae	.LBB6_3
# BB#2:
	movslq	12(%rsp), %rax
	movq	(%rsp), %rcx
	movsbl	(%rcx,%rax), %eax
.LBB6_3:
	addq	$16, %rsp
	popq	%rbx
	ret
.Ltmp20:
	.size	kermeta_standard__String___charAt, .Ltmp20-kermeta_standard__String___charAt
	.cfi_endproc

	.globl	kermeta_io__StdIO___writeln
	.align	16, 0x90
	.type	kermeta_io__StdIO___writeln,@function
kermeta_io__StdIO___writeln:            # @kermeta_io__StdIO___writeln
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp22:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdi
	callq	puts
	addq	$24, %rsp
	ret
.Ltmp23:
	.size	kermeta_io__StdIO___writeln, .Ltmp23-kermeta_io__StdIO___writeln
	.cfi_endproc

	.globl	kermeta_io__StdIO___write
	.align	16, 0x90
	.type	kermeta_io__StdIO___write,@function
kermeta_io__StdIO___write:              # @kermeta_io__StdIO___write
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp25:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rsi
	movl	$.L.str, %edi
	xorb	%al, %al
	callq	printf
	addq	$24, %rsp
	ret
.Ltmp26:
	.size	kermeta_io__StdIO___write, .Ltmp26-kermeta_io__StdIO___write
	.cfi_endproc

	.globl	kermeta_io__StdIO___errorln
	.align	16, 0x90
	.type	kermeta_io__StdIO___errorln,@function
kermeta_io__StdIO___errorln:            # @kermeta_io__StdIO___errorln
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp28:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str1, %esi
	xorb	%al, %al
	callq	fprintf
	addq	$24, %rsp
	ret
.Ltmp29:
	.size	kermeta_io__StdIO___errorln, .Ltmp29-kermeta_io__StdIO___errorln
	.cfi_endproc

	.globl	kermeta__o__StdIO___error
	.align	16, 0x90
	.type	kermeta__o__StdIO___error,@function
kermeta__o__StdIO___error:              # @kermeta__o__StdIO___error
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp31:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str, %esi
	xorb	%al, %al
	callq	fprintf
	addq	$24, %rsp
	ret
.Ltmp32:
	.size	kermeta__o__StdIO___error, .Ltmp32-kermeta__o__StdIO___error
	.cfi_endproc

	.globl	kermeta___io__StdIO_read
	.align	16, 0x90
	.type	kermeta___io__StdIO_read,@function
kermeta___io__StdIO_read:               # @kermeta___io__StdIO_read
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	%rsi, -16(%rsp)
	xorl	%eax, %eax
	ret
.Ltmp33:
	.size	kermeta___io__StdIO_read, .Ltmp33-kermeta___io__StdIO_read
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__A,@function
create_pkgFoo__A:                       # @create_pkgFoo__A
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp34:
	.size	create_pkgFoo__A, .Ltmp34-create_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__B,@function
create_pkgFoo__B:                       # @create_pkgFoo__B
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp36:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__A
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp37:
	.size	create_pkgFoo__B, .Ltmp37-create_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__C,@function
create_pkgFoo__C:                       # @create_pkgFoo__C
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp39:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__B
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp40:
	.size	create_pkgFoo__C, .Ltmp40-create_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__D,@function
create_pkgFoo__D:                       # @create_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp42:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__C
	movq	%rax, (%rsp)
	leaq	(%rsp), %rax
	popq	%rdx
	ret
.Ltmp43:
	.size	create_pkgFoo__D, .Ltmp43-create_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__Main,@function
create_pkgFoo__Main:                    # @create_pkgFoo__Main
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp44:
	.size	create_pkgFoo__Main, .Ltmp44-create_pkgFoo__Main
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__B,@function
cast_pkgFoo__A_pkgFoo__B:               # @cast_pkgFoo__A_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp45:
	.size	cast_pkgFoo__A_pkgFoo__B, .Ltmp45-cast_pkgFoo__A_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__C,@function
cast_pkgFoo__A_pkgFoo__C:               # @cast_pkgFoo__A_pkgFoo__C
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp47:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__A_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__C
	popq	%rdx
	ret
.Ltmp48:
	.size	cast_pkgFoo__A_pkgFoo__C, .Ltmp48-cast_pkgFoo__A_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__D,@function
cast_pkgFoo__A_pkgFoo__D:               # @cast_pkgFoo__A_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp50:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__A_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__D
	popq	%rdx
	ret
.Ltmp51:
	.size	cast_pkgFoo__A_pkgFoo__D, .Ltmp51-cast_pkgFoo__A_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__A,@function
cast_pkgFoo__B_pkgFoo__A:               # @cast_pkgFoo__B_pkgFoo__A
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp52:
	.size	cast_pkgFoo__B_pkgFoo__A, .Ltmp52-cast_pkgFoo__B_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__C,@function
cast_pkgFoo__B_pkgFoo__C:               # @cast_pkgFoo__B_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp53:
	.size	cast_pkgFoo__B_pkgFoo__C, .Ltmp53-cast_pkgFoo__B_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__D,@function
cast_pkgFoo__B_pkgFoo__D:               # @cast_pkgFoo__B_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp55:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__B_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__D
	popq	%rdx
	ret
.Ltmp56:
	.size	cast_pkgFoo__B_pkgFoo__D, .Ltmp56-cast_pkgFoo__B_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__B,@function
cast_pkgFoo__C_pkgFoo__B:               # @cast_pkgFoo__C_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp57:
	.size	cast_pkgFoo__C_pkgFoo__B, .Ltmp57-cast_pkgFoo__C_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__A,@function
cast_pkgFoo__C_pkgFoo__A:               # @cast_pkgFoo__C_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp59:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp60:
	.size	cast_pkgFoo__C_pkgFoo__A, .Ltmp60-cast_pkgFoo__C_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__D,@function
cast_pkgFoo__C_pkgFoo__D:               # @cast_pkgFoo__C_pkgFoo__D
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp61:
	.size	cast_pkgFoo__C_pkgFoo__D, .Ltmp61-cast_pkgFoo__C_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__C,@function
cast_pkgFoo__D_pkgFoo__C:               # @cast_pkgFoo__D_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp62:
	.size	cast_pkgFoo__D_pkgFoo__C, .Ltmp62-cast_pkgFoo__D_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__B,@function
cast_pkgFoo__D_pkgFoo__B:               # @cast_pkgFoo__D_pkgFoo__B
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp64:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	popq	%rdx
	ret
.Ltmp65:
	.size	cast_pkgFoo__D_pkgFoo__B, .Ltmp65-cast_pkgFoo__D_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__A,@function
cast_pkgFoo__D_pkgFoo__A:               # @cast_pkgFoo__D_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp67:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp68:
	.size	cast_pkgFoo__D_pkgFoo__A, .Ltmp68-cast_pkgFoo__D_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__B___foo1,@function
pkgFoo__B___foo1:                       # @pkgFoo__B___foo1
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp70:
	.cfi_def_cfa_offset 16
	movl	$.Ls0, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp71:
	.size	pkgFoo__B___foo1, .Ltmp71-pkgFoo__B___foo1
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__C___foo2,@function
pkgFoo__C___foo2:                       # @pkgFoo__C___foo2
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp73:
	.cfi_def_cfa_offset 16
	movl	$.Ls1, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp74:
	.size	pkgFoo__C___foo2, .Ltmp74-pkgFoo__C___foo2
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__D___foo3,@function
pkgFoo__D___foo3:                       # @pkgFoo__D___foo3
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp76:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	pkgFoo__C___foo2
	movl	$.Ls2, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp77:
	.size	pkgFoo__D___foo3, .Ltmp77-pkgFoo__D___foo3
	.cfi_endproc

	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp79:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__Main
	movq	%rax, %rdi
	callq	pkgFoo__Main___main4
	xorl	%eax, %eax
	popq	%rdx
	ret
.Ltmp80:
	.size	main, .Ltmp80-main
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__Main___main4,@function
pkgFoo__Main___main4:                   # @pkgFoo__Main___main4
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp82:
	.cfi_def_cfa_offset 16
	movl	$.Ls3, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	callq	create_pkgFoo__D
	movq	%rax, %rdi
	callq	pkgFoo__D___foo3
	popq	%rax
	ret
.Ltmp83:
	.size	pkgFoo__Main___main4, .Ltmp83-pkgFoo__Main___main4
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

	.type	SINGLETON_kermeta_io__StdIO,@object # @SINGLETON_kermeta_io__StdIO
	.comm	SINGLETON_kermeta_io__StdIO,1,1
	.type	.Ls0,@object            # @s0
.Ls0:
	.asciz	 "B.foo!"
	.size	.Ls0, 7

	.type	.Ls1,@object            # @s1
.Ls1:
	.asciz	 "C.foo!"
	.size	.Ls1, 7

	.type	.Ls2,@object            # @s2
.Ls2:
	.asciz	 "D.foo!"
	.size	.Ls2, 7

	.type	.Ls3,@object            # @s3
.Ls3:
	.asciz	 "Hello World!"
	.size	.Ls3, 13


	.section	".note.GNU-stack","",@progbits
