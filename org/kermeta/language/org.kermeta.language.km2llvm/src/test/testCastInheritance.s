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
	shlq	$3, %rdi
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

	.globl	minus
	.align	16, 0x90
	.type	minus,@function
minus:                                  # @minus
	.cfi_startproc
# BB#0:
	movl	%edi, -4(%rsp)
	movl	%esi, -8(%rsp)
	addl	-4(%rsp), %esi
	movl	%esi, %eax
	ret
.Ltmp30:
	.size	minus, .Ltmp30-minus
	.cfi_endproc

	.globl	mult
	.align	16, 0x90
	.type	mult,@function
mult:                                   # @mult
	.cfi_startproc
# BB#0:
	movl	%edi, -4(%rsp)
	movl	%esi, -8(%rsp)
	imull	-4(%rsp), %esi
	movl	%esi, %eax
	ret
.Ltmp31:
	.size	mult, .Ltmp31-mult
	.cfi_endproc

	.globl	div2
	.align	16, 0x90
	.type	div2,@function
div2:                                   # @div2
	.cfi_startproc
# BB#0:
	movl	%edi, -4(%rsp)
	movl	%esi, -8(%rsp)
	movl	%esi, %eax
	cltd
	idivl	-4(%rsp)
	ret
.Ltmp32:
	.size	div2, .Ltmp32-div2
	.cfi_endproc

	.globl	mod
	.align	16, 0x90
	.type	mod,@function
mod:                                    # @mod
	.cfi_startproc
# BB#0:
	movl	%edi, -4(%rsp)
	movl	%esi, -8(%rsp)
	movl	%esi, %eax
	cltd
	idivl	-4(%rsp)
	movl	%edx, %eax
	ret
.Ltmp33:
	.size	mod, .Ltmp33-mod
	.cfi_endproc

	.globl	uminus
	.align	16, 0x90
	.type	uminus,@function
uminus:                                 # @uminus
	.cfi_startproc
# BB#0:
	movl	%edi, -4(%rsp)
	negl	%edi
	movl	%edi, %eax
	ret
.Ltmp34:
	.size	uminus, .Ltmp34-uminus
	.cfi_endproc

	.globl	kermeta_io__StdIO___writeln
	.align	16, 0x90
	.type	kermeta_io__StdIO___writeln,@function
kermeta_io__StdIO___writeln:            # @kermeta_io__StdIO___writeln
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp36:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdi
	callq	puts
	addq	$24, %rsp
	ret
.Ltmp37:
	.size	kermeta_io__StdIO___writeln, .Ltmp37-kermeta_io__StdIO___writeln
	.cfi_endproc

	.globl	kermeta_io__StdIO___write
	.align	16, 0x90
	.type	kermeta_io__StdIO___write,@function
kermeta_io__StdIO___write:              # @kermeta_io__StdIO___write
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp39:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rsi
	movl	$.L.str1, %edi
	xorb	%al, %al
	callq	printf
	addq	$24, %rsp
	ret
.Ltmp40:
	.size	kermeta_io__StdIO___write, .Ltmp40-kermeta_io__StdIO___write
	.cfi_endproc

	.globl	kermeta_io__StdIO___errorln
	.align	16, 0x90
	.type	kermeta_io__StdIO___errorln,@function
kermeta_io__StdIO___errorln:            # @kermeta_io__StdIO___errorln
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp42:
	.cfi_def_cfa_offset 32
	movq	%rdi, 16(%rsp)
	movq	%rsi, 8(%rsp)
	movq	16(%rsp), %rdx
	movq	stderr(%rip), %rdi
	movl	$.L.str2, %esi
	xorb	%al, %al
	callq	fprintf
	addq	$24, %rsp
	ret
.Ltmp43:
	.size	kermeta_io__StdIO___errorln, .Ltmp43-kermeta_io__StdIO___errorln
	.cfi_endproc

	.globl	kermeta__o__StdIO___error
	.align	16, 0x90
	.type	kermeta__o__StdIO___error,@function
kermeta__o__StdIO___error:              # @kermeta__o__StdIO___error
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp45:
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
.Ltmp46:
	.size	kermeta__o__StdIO___error, .Ltmp46-kermeta__o__StdIO___error
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
.Ltmp47:
	.size	kermeta___io__StdIO_read, .Ltmp47-kermeta___io__StdIO_read
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
.Ltmp48:
	.size	kermeta_io__StdIO___container, .Ltmp48-kermeta_io__StdIO___container
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__A,@function
create_pkgFoo__A:                       # @create_pkgFoo__A
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp49:
	.size	create_pkgFoo__A, .Ltmp49-create_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__B,@function
create_pkgFoo__B:                       # @create_pkgFoo__B
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp51:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__A
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp52:
	.size	create_pkgFoo__B, .Ltmp52-create_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__C,@function
create_pkgFoo__C:                       # @create_pkgFoo__C
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp54:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo__B
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp55:
	.size	create_pkgFoo__C, .Ltmp55-create_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__D,@function
create_pkgFoo__D:                       # @create_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp57:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__C
	movq	%rax, (%rsp)
	leaq	(%rsp), %rax
	popq	%rdx
	ret
.Ltmp58:
	.size	create_pkgFoo__D, .Ltmp58-create_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo__Main,@function
create_pkgFoo__Main:                    # @create_pkgFoo__Main
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp59:
	.size	create_pkgFoo__Main, .Ltmp59-create_pkgFoo__Main
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__B,@function
cast_pkgFoo__A_pkgFoo__B:               # @cast_pkgFoo__A_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp60:
	.size	cast_pkgFoo__A_pkgFoo__B, .Ltmp60-cast_pkgFoo__A_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__C,@function
cast_pkgFoo__A_pkgFoo__C:               # @cast_pkgFoo__A_pkgFoo__C
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp62:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__A_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__C
	popq	%rdx
	ret
.Ltmp63:
	.size	cast_pkgFoo__A_pkgFoo__C, .Ltmp63-cast_pkgFoo__A_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__A_pkgFoo__D,@function
cast_pkgFoo__A_pkgFoo__D:               # @cast_pkgFoo__A_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp65:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__A_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__D
	popq	%rdx
	ret
.Ltmp66:
	.size	cast_pkgFoo__A_pkgFoo__D, .Ltmp66-cast_pkgFoo__A_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__A,@function
cast_pkgFoo__B_pkgFoo__A:               # @cast_pkgFoo__B_pkgFoo__A
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp67:
	.size	cast_pkgFoo__B_pkgFoo__A, .Ltmp67-cast_pkgFoo__B_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__C,@function
cast_pkgFoo__B_pkgFoo__C:               # @cast_pkgFoo__B_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp68:
	.size	cast_pkgFoo__B_pkgFoo__C, .Ltmp68-cast_pkgFoo__B_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__B_pkgFoo__D,@function
cast_pkgFoo__B_pkgFoo__D:               # @cast_pkgFoo__B_pkgFoo__D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp70:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__B_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__D
	popq	%rdx
	ret
.Ltmp71:
	.size	cast_pkgFoo__B_pkgFoo__D, .Ltmp71-cast_pkgFoo__B_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__B,@function
cast_pkgFoo__C_pkgFoo__B:               # @cast_pkgFoo__C_pkgFoo__B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp72:
	.size	cast_pkgFoo__C_pkgFoo__B, .Ltmp72-cast_pkgFoo__C_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__A,@function
cast_pkgFoo__C_pkgFoo__A:               # @cast_pkgFoo__C_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp74:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp75:
	.size	cast_pkgFoo__C_pkgFoo__A, .Ltmp75-cast_pkgFoo__C_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__C_pkgFoo__D,@function
cast_pkgFoo__C_pkgFoo__D:               # @cast_pkgFoo__C_pkgFoo__D
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp76:
	.size	cast_pkgFoo__C_pkgFoo__D, .Ltmp76-cast_pkgFoo__C_pkgFoo__D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__C,@function
cast_pkgFoo__D_pkgFoo__C:               # @cast_pkgFoo__D_pkgFoo__C
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp77:
	.size	cast_pkgFoo__D_pkgFoo__C, .Ltmp77-cast_pkgFoo__D_pkgFoo__C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__B,@function
cast_pkgFoo__D_pkgFoo__B:               # @cast_pkgFoo__D_pkgFoo__B
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp79:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	popq	%rdx
	ret
.Ltmp80:
	.size	cast_pkgFoo__D_pkgFoo__B, .Ltmp80-cast_pkgFoo__D_pkgFoo__B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo__D_pkgFoo__A,@function
cast_pkgFoo__D_pkgFoo__A:               # @cast_pkgFoo__D_pkgFoo__A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp82:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	cast_pkgFoo__C_pkgFoo__B
	movq	%rax, %rdi
	callq	cast_pkgFoo__B_pkgFoo__A
	popq	%rdx
	ret
.Ltmp83:
	.size	cast_pkgFoo__D_pkgFoo__A, .Ltmp83-cast_pkgFoo__D_pkgFoo__A
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__B___foo1,@function
pkgFoo__B___foo1:                       # @pkgFoo__B___foo1
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp85:
	.cfi_def_cfa_offset 16
	movl	$.Ls0, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp86:
	.size	pkgFoo__B___foo1, .Ltmp86-pkgFoo__B___foo1
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__C___foo2,@function
pkgFoo__C___foo2:                       # @pkgFoo__C___foo2
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp88:
	.cfi_def_cfa_offset 16
	movl	$.Ls1, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp89:
	.size	pkgFoo__C___foo2, .Ltmp89-pkgFoo__C___foo2
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__D___foo3,@function
pkgFoo__D___foo3:                       # @pkgFoo__D___foo3
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp91:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo__D_pkgFoo__C
	movq	%rax, %rdi
	callq	pkgFoo__C___foo2
	movl	$.Ls2, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	popq	%rax
	ret
.Ltmp92:
	.size	pkgFoo__D___foo3, .Ltmp92-pkgFoo__D___foo3
	.cfi_endproc

	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp94:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo__Main
	movq	%rax, %rdi
	callq	pkgFoo__Main___main4
	xorl	%eax, %eax
	popq	%rdx
	ret
.Ltmp95:
	.size	main, .Ltmp95-main
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__Main___main4,@function
pkgFoo__Main___main4:                   # @pkgFoo__Main___main4
	.cfi_startproc
# BB#0:
	pushq	%rbp
.Ltmp99:
	.cfi_def_cfa_offset 16
.Ltmp100:
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
.Ltmp101:
	.cfi_def_cfa_register %rbp
	pushq	%rbx
	pushq	%rax
.Ltmp102:
	.cfi_offset %rbx, -24
	movl	$.Ls3, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	callq	create_pkgFoo__D
	movq	%rax, -16(%rbp)
	movq	%rax, %rdi
	callq	pkgFoo__D___foo3
	movb	$1, %al
	testb	%al, %al
	jne	.LBB44_2
# BB#1:                                 # %llvmlabel5
	movl	$.Ls4, %edi
	jmp	.LBB44_3
.LBB44_2:                               # %llvmlabel7
	movl	$.Ls5, %edi
.LBB44_3:                               # %llvmlabel7
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	movq	%rsp, %rax
	leaq	-16(%rax), %rbx
	movq	%rbx, %rsp
	movl	$0, -16(%rax)
	jmp	.LBB44_4
	.align	16, 0x90
.LBB44_5:                               # %llvmlabel11
                                        #   in Loop: Header=BB44_4 Depth=1
	movl	(%rbx), %edi
	callq	kermeta_standard__Integer___toString
	movq	%rax, %rdi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	kermeta_io__StdIO___writeln
	incl	(%rbx)
.LBB44_4:                               # %llvmlabel10
                                        # =>This Inner Loop Header: Depth=1
	cmpl	$10, (%rbx)
	je	.LBB44_5
# BB#6:                                 # %llvmlabel12
	leaq	-8(%rbp), %rsp
	popq	%rbx
	popq	%rbp
	ret
.Ltmp103:
	.size	pkgFoo__Main___main4, .Ltmp103-pkgFoo__Main___main4
	.cfi_endproc

	.type	.L.str,@object          # @.str
	.section	.rodata.str1.1,"aMS",@progbits,1
.L.str:
	.asciz	 "%d"
	.size	.L.str, 3

	.type	.L.str1,@object         # @.str1
.L.str1:
	.asciz	 "%s"
	.size	.L.str1, 3

	.type	.L.str2,@object         # @.str2
.L.str2:
	.asciz	 "%s\n"
	.size	.L.str2, 4

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

	.type	.Ls4,@object            # @s4
.Ls4:
	.asciz	 "ifthen!"
	.size	.Ls4, 8

	.type	.Ls5,@object            # @s5
.Ls5:
	.asciz	 "ifElse!"
	.size	.Ls5, 8


	.section	".note.GNU-stack","",@progbits
