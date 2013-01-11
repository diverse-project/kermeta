	.file	"testCastInheritance.ll"
	.text
	.globl	kermeta_standard__Object___container
	.align	16, 0x90
	.type	kermeta_standard__Object___container,@function
kermeta_standard__Object___container:   # @kermeta_standard__Object___container
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	movq	(%rdi), %rax
	ret
.Ltmp0:
	.size	kermeta_standard__Object___container, .Ltmp0-kermeta_standard__Object___container
	.cfi_endproc

	.globl	delete_kermeta_standard__String
	.align	16, 0x90
	.type	delete_kermeta_standard__String,@function
delete_kermeta_standard__String:        # @delete_kermeta_standard__String
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp2:
	.cfi_def_cfa_offset 16
	movq	%rdi, (%rsp)
	callq	free
	popq	%rax
	ret
.Ltmp3:
	.size	delete_kermeta_standard__String, .Ltmp3-delete_kermeta_standard__String
	.cfi_endproc

	.globl	kermeta_standard__String___container
	.align	16, 0x90
	.type	kermeta_standard__String___container,@function
kermeta_standard__String___container:   # @kermeta_standard__String___container
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	xorl	%eax, %eax
	ret
.Ltmp4:
	.size	kermeta_standard__String___container, .Ltmp4-kermeta_standard__String___container
	.cfi_endproc

	.globl	kermeta_standard__String___plus
	.align	16, 0x90
	.type	kermeta_standard__String___plus,@function
kermeta_standard__String___plus:        # @kermeta_standard__String___plus
	.cfi_startproc
# BB#0:
	pushq	%rbx
.Ltmp7:
	.cfi_def_cfa_offset 16
	subq	$32, %rsp
.Ltmp8:
	.cfi_def_cfa_offset 48
.Ltmp9:
	.cfi_offset %rbx, -16
	movq	%rdi, 24(%rsp)
	movq	%rsi, 16(%rsp)
	movq	24(%rsp), %rdi
	callq	strlen
	movq	%rax, %rbx
	movq	16(%rsp), %rdi
	callq	strlen
	leaq	1(%rbx,%rax), %rdi
	movl	$1, %esi
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
.Ltmp10:
	.size	kermeta_standard__String___plus, .Ltmp10-kermeta_standard__String___plus
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
.Ltmp11:
	.size	kermeta_standard__String___equals, .Ltmp11-kermeta_standard__String___equals
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
.Ltmp12:
	.size	kermeta_standard__String___toString, .Ltmp12-kermeta_standard__String___toString
	.cfi_endproc

	.globl	kermeta_standard__String___hashcode
	.align	16, 0x90
	.type	kermeta_standard__String___hashcode,@function
kermeta_standard__String___hashcode:    # @kermeta_standard__String___hashcode
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	ret
.Ltmp13:
	.size	kermeta_standard__String___hashcode, .Ltmp13-kermeta_standard__String___hashcode
	.cfi_endproc

	.globl	kermeta_standard__String___compareTo
	.align	16, 0x90
	.type	kermeta_standard__String___compareTo,@function
kermeta_standard__String___compareTo:   # @kermeta_standard__String___compareTo
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp15:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rax
	movq	%rsi, %rdi
	movq	%rax, %rsi
	callq	strcmp
	addq	$24, %rsp
	ret
.Ltmp16:
	.size	kermeta_standard__String___compareTo, .Ltmp16-kermeta_standard__String___compareTo
	.cfi_endproc

	.globl	kermeta_standard__String___indexOf
	.align	16, 0x90
	.type	kermeta_standard__String___indexOf,@function
kermeta_standard__String___indexOf:     # @kermeta_standard__String___indexOf
	.cfi_startproc
# BB#0:
	subq	$40, %rsp
.Ltmp18:
	.cfi_def_cfa_offset 48
	movq	%rdi, 32(%rsp)
	movq	%rsi, 24(%rsp)
	movq	32(%rsp), %rax
	movq	%rsi, %rdi
	movq	%rax, %rsi
	callq	strstr
	movq	%rax, 16(%rsp)
	testq	%rax, %rax
	je	.LBB8_1
# BB#2:
	movl	16(%rsp), %eax
	subl	24(%rsp), %eax
	movl	%eax, 12(%rsp)
	jmp	.LBB8_3
.LBB8_1:
	movl	$-1, 12(%rsp)
.LBB8_3:
	movl	12(%rsp), %eax
	addq	$40, %rsp
	ret
.Ltmp19:
	.size	kermeta_standard__String___indexOf, .Ltmp19-kermeta_standard__String___indexOf
	.cfi_endproc

	.globl	kermeta_standard__String___charAt
	.align	16, 0x90
	.type	kermeta_standard__String___charAt,@function
kermeta_standard__String___charAt:      # @kermeta_standard__String___charAt
	.cfi_startproc
# BB#0:
	pushq	%rbx
.Ltmp22:
	.cfi_def_cfa_offset 16
	subq	$16, %rsp
.Ltmp23:
	.cfi_def_cfa_offset 32
.Ltmp24:
	.cfi_offset %rbx, -16
	movl	%edi, 12(%rsp)
	movq	%rsi, (%rsp)
	xorl	%eax, %eax
	cmpl	$0, 12(%rsp)
	js	.LBB9_3
# BB#1:
	movslq	12(%rsp), %rbx
	movq	(%rsp), %rdi
	callq	strlen
	movq	%rax, %rcx
	xorl	%eax, %eax
	cmpq	%rcx, %rbx
	jae	.LBB9_3
# BB#2:
	movslq	12(%rsp), %rax
	movq	(%rsp), %rcx
	movsbl	(%rcx,%rax), %eax
.LBB9_3:
	addq	$16, %rsp
	popq	%rbx
	ret
.Ltmp25:
	.size	kermeta_standard__String___charAt, .Ltmp25-kermeta_standard__String___charAt
	.cfi_endproc

	.globl	kermeta_standard__Integer___container
	.align	16, 0x90
	.type	kermeta_standard__Integer___container,@function
kermeta_standard__Integer___container:  # @kermeta_standard__Integer___container
	.cfi_startproc
# BB#0:
	movl	%edi, -4(%rsp)
	xorl	%eax, %eax
	ret
.Ltmp26:
	.size	kermeta_standard__Integer___container, .Ltmp26-kermeta_standard__Integer___container
	.cfi_endproc

	.section	.rodata.cst8,"aM",@progbits,8
	.align	8
.LCPI11_0:
	.quad	4607182418800017408     # double 1.000000e+00
                                        #  (0x3ff0000000000000)
	.text
	.globl	kermeta_standard__Integer___toString
	.align	16, 0x90
	.type	kermeta_standard__Integer___toString,@function
kermeta_standard__Integer___toString:   # @kermeta_standard__Integer___toString
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp28:
	.cfi_def_cfa_offset 32
	movl	%edi, 20(%rsp)
	shrl	$31, %edi
	movl	%edi, 16(%rsp)
	cmpl	$0, 20(%rsp)
	je	.LBB11_1
# BB#2:
	movl	20(%rsp), %edi
	callq	abs
	cvtsi2sd	%eax, %xmm0
	callq	log10
	roundsd	$1, %xmm0, %xmm0
	addsd	.LCPI11_0(%rip), %xmm0
	cvtsi2sd	16(%rsp), %xmm1
	addsd	%xmm0, %xmm1
	cvttsd2si	%xmm1, %eax
	movl	%eax, 16(%rsp)
	jmp	.LBB11_3
.LBB11_1:
	incl	16(%rsp)
.LBB11_3:
	movslq	16(%rsp), %rdi
	callq	malloc
	movq	%rax, 8(%rsp)
	movl	20(%rsp), %ecx
	movq	%rax, %rdi
	movl	$8, %esi
	movl	$.L.str, %edx
	xorb	%al, %al
	callq	snprintf
	movq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp29:
	.size	kermeta_standard__Integer___toString, .Ltmp29-kermeta_standard__Integer___toString
	.cfi_endproc

	.globl	kermeta_standard__Boolean___container
	.align	16, 0x90
	.type	kermeta_standard__Boolean___container,@function
kermeta_standard__Boolean___container:  # @kermeta_standard__Boolean___container
	.cfi_startproc
# BB#0:
	movb	%dil, -1(%rsp)
	xorl	%eax, %eax
	ret
.Ltmp30:
	.size	kermeta_standard__Boolean___container, .Ltmp30-kermeta_standard__Boolean___container
	.cfi_endproc

	.globl	kermeta_standard__Boolean___toString
	.align	16, 0x90
	.type	kermeta_standard__Boolean___toString,@function
kermeta_standard__Boolean___toString:   # @kermeta_standard__Boolean___toString
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp32:
	.cfi_def_cfa_offset 32
	movb	%dil, 23(%rsp)
	testb	%dil, %dil
	je	.LBB13_2
# BB#1:
	movl	$4, %edi
	callq	malloc
	movq	%rax, 8(%rsp)
	movq	%rax, %rdi
	movl	$.L.str1, %esi
	movl	$4, %edx
	jmp	.LBB13_3
.LBB13_2:
	movl	$5, %edi
	callq	malloc
	movq	%rax, 8(%rsp)
	movq	%rax, %rdi
	movl	$.L.str2, %esi
	movl	$5, %edx
.LBB13_3:
	callq	strncpy
	movq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp33:
	.size	kermeta_standard__Boolean___toString, .Ltmp33-kermeta_standard__Boolean___toString
	.cfi_endproc

	.globl	kermeta_io__StdIO___writeln
	.align	16, 0x90
	.type	kermeta_io__StdIO___writeln,@function
kermeta_io__StdIO___writeln:            # @kermeta_io__StdIO___writeln
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp35:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdi
	callq	puts
	addq	$24, %rsp
	ret
.Ltmp36:
	.size	kermeta_io__StdIO___writeln, .Ltmp36-kermeta_io__StdIO___writeln
	.cfi_endproc

	.globl	kermeta_io__StdIO___write
	.align	16, 0x90
	.type	kermeta_io__StdIO___write,@function
kermeta_io__StdIO___write:              # @kermeta_io__StdIO___write
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp38:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rsi
	movl	$.L.str3, %edi
	xorb	%al, %al
	callq	printf
	addq	$24, %rsp
	ret
.Ltmp39:
	.size	kermeta_io__StdIO___write, .Ltmp39-kermeta_io__StdIO___write
	.cfi_endproc

	.globl	kermeta_io__StdIO___errorln
	.align	16, 0x90
	.type	kermeta_io__StdIO___errorln,@function
kermeta_io__StdIO___errorln:            # @kermeta_io__StdIO___errorln
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp41:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str4, %esi
	xorb	%al, %al
	callq	fprintf
	addq	$24, %rsp
	ret
.Ltmp42:
	.size	kermeta_io__StdIO___errorln, .Ltmp42-kermeta_io__StdIO___errorln
	.cfi_endproc

	.globl	kermeta__o__StdIO___error
	.align	16, 0x90
	.type	kermeta__o__StdIO___error,@function
kermeta__o__StdIO___error:              # @kermeta__o__StdIO___error
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp44:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str3, %esi
	xorb	%al, %al
	callq	fprintf
	addq	$24, %rsp
	ret
.Ltmp45:
	.size	kermeta__o__StdIO___error, .Ltmp45-kermeta__o__StdIO___error
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
.Ltmp46:
	.size	kermeta___io__StdIO_read, .Ltmp46-kermeta___io__StdIO_read
	.cfi_endproc

	.globl	kermeta_io__StdIO___container
	.align	16, 0x90
	.type	kermeta_io__StdIO___container,@function
kermeta_io__StdIO___container:          # @kermeta_io__StdIO___container
	.cfi_startproc
# BB#0:
	movq	%rdi, -8(%rsp)
	xorl	%eax, %eax
	ret
.Ltmp47:
	.size	kermeta_io__StdIO___container, .Ltmp47-kermeta_io__StdIO___container
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__A,@function
create_pkgFoo__A:                       # @create_pkgFoo__A
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp48:
	.size	create_pkgFoo__A, .Ltmp48-create_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__B,@function
create_pkgFoo__B:                       # @create_pkgFoo__B
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp50:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__A
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp51:
	.size	create_pkgFoo__B, .Ltmp51-create_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__C,@function
create_pkgFoo__C:                       # @create_pkgFoo__C
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp53:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__B
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp54:
	.size	create_pkgFoo__C, .Ltmp54-create_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__D,@function
create_pkgFoo__D:                       # @create_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp56:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__C
	movq	%rax, (%rsp)
	leaq	(%rsp), %rax
	popq	%rdx
	ret
.Ltmp57:
	.size	create_pkgFoo__D, .Ltmp57-create_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__Main,@function
create_pkgFoo__Main:                    # @create_pkgFoo__Main
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp58:
	.size	create_pkgFoo__Main, .Ltmp58-create_pkgFoo__Main
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__A,@function
cast_pkgFoo__B_pkgFoo__A:               # @cast_pkgFoo__B_pkgFoo__A
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp59:
	.size	cast_pkgFoo__B_pkgFoo__A, .Ltmp59-cast_pkgFoo__B_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__B,@function
cast_pkgFoo__C_pkgFoo__B:               # @cast_pkgFoo__C_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp60:
	.size	cast_pkgFoo__C_pkgFoo__B, .Ltmp60-cast_pkgFoo__C_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__A,@function
cast_pkgFoo__C_pkgFoo__A:               # @cast_pkgFoo__C_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp62:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp63:
	.size	cast_pkgFoo__C_pkgFoo__A, .Ltmp63-cast_pkgFoo__C_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__C,@function
cast_pkgFoo__D_pkgFoo__C:               # @cast_pkgFoo__D_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp64:
	.size	cast_pkgFoo__D_pkgFoo__C, .Ltmp64-cast_pkgFoo__D_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__B,@function
cast_pkgFoo__D_pkgFoo__B:               # @cast_pkgFoo__D_pkgFoo__B
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp66:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	popq	%rdx
	ret
.Ltmp67:
	.size	cast_pkgFoo__D_pkgFoo__B, .Ltmp67-cast_pkgFoo__D_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__A,@function
cast_pkgFoo__D_pkgFoo__A:               # @cast_pkgFoo__D_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp69:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp70:
	.size	cast_pkgFoo__D_pkgFoo__A, .Ltmp70-cast_pkgFoo__D_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__B___foo1,@function
pkgFoo__B___foo1:                       # @pkgFoo__B___foo1
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp72:
	.cfi_def_cfa_offset 16
	movl	$.Ls0, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp73:
	.size	pkgFoo__B___foo1, .Ltmp73-pkgFoo__B___foo1
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__C___foo2,@function
pkgFoo__C___foo2:                       # @pkgFoo__C___foo2
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp75:
	.cfi_def_cfa_offset 16
	movl	$.Ls1, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp76:
	.size	pkgFoo__C___foo2, .Ltmp76-pkgFoo__C___foo2
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__C___bar3,@function
pkgFoo__C___bar3:                       # @pkgFoo__C___bar3
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp78:
	.cfi_def_cfa_offset 16
	movl	$.Ls2, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp79:
	.size	pkgFoo__C___bar3, .Ltmp79-pkgFoo__C___bar3
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__D___foo4,@function
pkgFoo__D___foo4:                       # @pkgFoo__D___foo4
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp81:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	pkgFoo__C___foo2
	movl	$.Ls3, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp82:
	.size	pkgFoo__D___foo4, .Ltmp82-pkgFoo__D___foo4
	.cfi_endproc

	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp84:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__Main
	movq	%rax, %rdi
	callq	pkgFoo__Main___main5
	xorl	%eax, %eax
	popq	%rdx
	ret
.Ltmp85:
	.size	main, .Ltmp85-main
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__Main___main5,@function
pkgFoo__Main___main5:                   # @pkgFoo__Main___main5
	.cfi_startproc
# BB#0:
	pushq	%rbp
.Ltmp89:
	.cfi_def_cfa_offset 16
.Ltmp90:
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
.Ltmp91:
	.cfi_def_cfa_register %rbp
	pushq	%rbx
	pushq	%rax
.Ltmp92:
	.cfi_offset %rbx, -24
	movl	$.Ls4, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	callq	create_pkgFoo__D
	movq	%rax, -16(%rbp)
	movq	%rax, %rdi
	callq	pkgFoo__D___foo4
	movb	$1, %al
	testb	%al, %al
	jne	.LBB36_2
# BB#1:                                 # %llvmlabel5
	movl	$.Ls5, %edi
	jmp	.LBB36_3
.LBB36_2:                               # %llvmlabel7
	movl	$.Ls6, %edi
.LBB36_3:                               # %llvmlabel7
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	movq	%rsp, %rax
	leaq	-16(%rax), %rbx
	movq	%rbx, %rsp
	movb	$0, -16(%rax)
	jmp	.LBB36_4
	.align	16, 0x90
.LBB36_5:                               # %llvmlabel11
                                        #   in Loop: Header=BB36_4 Depth=1
	movzbl	(%rbx), %edi
	callq	kermeta_standard__Boolean___toString
	movq	%rax, %rdi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	movb	$0, (%rbx)
.LBB36_4:                               # %llvmlabel10
                                        # =>This Inner Loop Header: Depth=1
	movb	(%rbx), %al
	cmpb	$1, %al
	je	.LBB36_5
# BB#6:                                 # %llvmlabel12
	movq	-16(%rbp), %rdi
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	pkgFoo__C___bar3
	movq	%rsp, %rbx
	leaq	-16(%rbx), %rax
	movq	%rax, %rsp
	callq	create_pkgFoo__D
	movq	%rax, %rdi
	callq	cast_pkgFoo__D_pkgFoo__B
	movq	%rax, -16(%rbx)
	movq	%rax, %rdi
	callq	pkgFoo__B___foo1
	leaq	-8(%rbp), %rsp
	popq	%rbx
	popq	%rbp
	ret
.Ltmp93:
	.size	pkgFoo__Main___main5, .Ltmp93-pkgFoo__Main___main5
	.cfi_endproc

	.type	.L.str,@object          # @.str
	.section	.rodata.str1.1,"aMS",@progbits,1
.L.str:
	.asciz	 "%d"
	.size	.L.str, 3

	.type	.L.str1,@object         # @.str1
.L.str1:
	.asciz	 "true"
	.size	.L.str1, 5

	.type	.L.str2,@object         # @.str2
.L.str2:
	.asciz	 "false"
	.size	.L.str2, 6

	.type	.L.str3,@object         # @.str3
.L.str3:
	.asciz	 "%s"
	.size	.L.str3, 3

	.type	.L.str4,@object         # @.str4
.L.str4:
	.asciz	 "%s\n"
	.size	.L.str4, 4

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
	.asciz	 "C.bar"
	.size	.Ls2, 6

	.type	.Ls3,@object            # @s3
.Ls3:
	.asciz	 "D.foo!"
	.size	.Ls3, 7

	.type	.Ls4,@object            # @s4
.Ls4:
	.asciz	 "Hello World!"
	.size	.Ls4, 13

	.type	.Ls5,@object            # @s5
.Ls5:
	.asciz	 "ifthen!"
	.size	.Ls5, 8

	.type	.Ls6,@object            # @s6
.Ls6:
	.asciz	 "ifElse!"
	.size	.Ls6, 8

	.type	pkgFoo__B_23__23_dynBind,@object # @"pkgFoo__B##dynBind"
	.data
	.globl	pkgFoo__B_23__23_dynBind
	.align	8
pkgFoo__B_23__23_dynBind:
	.quad	pkgFoo__B___foo1
	.size	pkgFoo__B_23__23_dynBind, 8

	.type	pkgFoo__C_23__23_dynBind,@object # @"pkgFoo__C##dynBind"
	.globl	pkgFoo__C_23__23_dynBind
	.align	8
pkgFoo__C_23__23_dynBind:
	.quad	pkgFoo__C___bar3
	.quad	pkgFoo__C___foo2
	.size	pkgFoo__C_23__23_dynBind, 16

	.type	pkgFoo__D_23__23_dynBind,@object # @"pkgFoo__D##dynBind"
	.globl	pkgFoo__D_23__23_dynBind
	.align	8
pkgFoo__D_23__23_dynBind:
	.quad	pkgFoo__C___bar3
	.quad	pkgFoo__D___foo4
	.size	pkgFoo__D_23__23_dynBind, 16

	.type	pkgFoo__Main_23__23_dynBind,@object # @"pkgFoo__Main##dynBind"
	.globl	pkgFoo__Main_23__23_dynBind
	.align	8
pkgFoo__Main_23__23_dynBind:
	.quad	pkgFoo__Main___main5
	.size	pkgFoo__Main_23__23_dynBind, 8


	.section	".note.GNU-stack","",@progbits
