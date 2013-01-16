	.file	"opt.ll"
	.text
	.globl	kermeta_standard__Object___container
	.align	16, 0x90
	.type	kermeta_standard__Object___container,@function
kermeta_standard__Object___container:   # @kermeta_standard__Object___container
	.cfi_startproc
# BB#0:
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
	jmp	free                    # TAILCALL
.Ltmp1:
	.size	delete_kermeta_standard__String, .Ltmp1-delete_kermeta_standard__String
	.cfi_endproc

	.globl	kermeta_standard__String___container
	.align	16, 0x90
	.type	kermeta_standard__String___container,@function
kermeta_standard__String___container:   # @kermeta_standard__String___container
	.cfi_startproc
# BB#0:
	xorl	%eax, %eax
	ret
.Ltmp2:
	.size	kermeta_standard__String___container, .Ltmp2-kermeta_standard__String___container
	.cfi_endproc

	.globl	kermeta_standard__String___plus
	.align	16, 0x90
	.type	kermeta_standard__String___plus,@function
kermeta_standard__String___plus:        # @kermeta_standard__String___plus
	.cfi_startproc
# BB#0:
	pushq	%r15
.Ltmp7:
	.cfi_def_cfa_offset 16
	pushq	%r14
.Ltmp8:
	.cfi_def_cfa_offset 24
	pushq	%rbx
.Ltmp9:
	.cfi_def_cfa_offset 32
.Ltmp10:
	.cfi_offset %rbx, -32
.Ltmp11:
	.cfi_offset %r14, -24
.Ltmp12:
	.cfi_offset %r15, -16
	movq	%rsi, %r15
	movq	%rdi, %r14
	callq	strlen
	movq	%rax, %rbx
	movq	%r15, %rdi
	callq	strlen
	leaq	1(%rbx,%rax), %rdi
	movl	$1, %esi
	callq	calloc
	movq	%rax, %rbx
	movq	%rbx, %rdi
	movq	%r15, %rsi
	callq	strcat
	movq	%rbx, %rdi
	movq	%r14, %rsi
	callq	strcat
	movq	%rbx, %rax
	popq	%rbx
	popq	%r14
	popq	%r15
	ret
.Ltmp13:
	.size	kermeta_standard__String___plus, .Ltmp13-kermeta_standard__String___plus
	.cfi_endproc

	.globl	kermeta_standard__String___equals
	.align	16, 0x90
	.type	kermeta_standard__String___equals,@function
kermeta_standard__String___equals:      # @kermeta_standard__String___equals
	.cfi_startproc
# BB#0:
	ret
.Ltmp14:
	.size	kermeta_standard__String___equals, .Ltmp14-kermeta_standard__String___equals
	.cfi_endproc

	.globl	kermeta_standard__String___toString
	.align	16, 0x90
	.type	kermeta_standard__String___toString,@function
kermeta_standard__String___toString:    # @kermeta_standard__String___toString
	.cfi_startproc
# BB#0:
	movq	%rdi, %rax
	ret
.Ltmp15:
	.size	kermeta_standard__String___toString, .Ltmp15-kermeta_standard__String___toString
	.cfi_endproc

	.globl	kermeta_standard__String___hashcode
	.align	16, 0x90
	.type	kermeta_standard__String___hashcode,@function
kermeta_standard__String___hashcode:    # @kermeta_standard__String___hashcode
	.cfi_startproc
# BB#0:
	ret
.Ltmp16:
	.size	kermeta_standard__String___hashcode, .Ltmp16-kermeta_standard__String___hashcode
	.cfi_endproc

	.globl	kermeta_standard__String___compareTo
	.align	16, 0x90
	.type	kermeta_standard__String___compareTo,@function
kermeta_standard__String___compareTo:   # @kermeta_standard__String___compareTo
	.cfi_startproc
# BB#0:
	movq	%rdi, %rax
	movq	%rsi, %rdi
	movq	%rax, %rsi
	jmp	strcmp                  # TAILCALL
.Ltmp17:
	.size	kermeta_standard__String___compareTo, .Ltmp17-kermeta_standard__String___compareTo
	.cfi_endproc

	.globl	kermeta_standard__String___indexOf
	.align	16, 0x90
	.type	kermeta_standard__String___indexOf,@function
kermeta_standard__String___indexOf:     # @kermeta_standard__String___indexOf
	.cfi_startproc
# BB#0:
	pushq	%rbx
.Ltmp20:
	.cfi_def_cfa_offset 16
.Ltmp21:
	.cfi_offset %rbx, -16
	movq	%rsi, %rbx
	movq	%rdi, %rax
	movq	%rbx, %rdi
	movq	%rax, %rsi
	callq	strstr
	movl	$-1, %ecx
	testq	%rax, %rax
	je	.LBB8_2
# BB#1:
	subl	%ebx, %eax
	movl	%eax, %ecx
.LBB8_2:
	movl	%ecx, %eax
	popq	%rbx
	ret
.Ltmp22:
	.size	kermeta_standard__String___indexOf, .Ltmp22-kermeta_standard__String___indexOf
	.cfi_endproc

	.globl	kermeta_standard__String___charAt
	.align	16, 0x90
	.type	kermeta_standard__String___charAt,@function
kermeta_standard__String___charAt:      # @kermeta_standard__String___charAt
	.cfi_startproc
# BB#0:
	pushq	%r14
.Ltmp26:
	.cfi_def_cfa_offset 16
	pushq	%rbx
.Ltmp27:
	.cfi_def_cfa_offset 24
	pushq	%rax
.Ltmp28:
	.cfi_def_cfa_offset 32
.Ltmp29:
	.cfi_offset %rbx, -24
.Ltmp30:
	.cfi_offset %r14, -16
	movq	%rsi, %r14
	xorb	%cl, %cl
	testl	%edi, %edi
	js	.LBB9_3
# BB#1:
	movslq	%edi, %rbx
	movq	%r14, %rdi
	callq	strlen
	xorb	%cl, %cl
	cmpq	%rax, %rbx
	jae	.LBB9_3
# BB#2:
	movb	(%r14,%rbx), %cl
.LBB9_3:
	movsbl	%cl, %eax
	addq	$8, %rsp
	popq	%rbx
	popq	%r14
	ret
.Ltmp31:
	.size	kermeta_standard__String___charAt, .Ltmp31-kermeta_standard__String___charAt
	.cfi_endproc

	.globl	kermeta_standard__Integer___container
	.align	16, 0x90
	.type	kermeta_standard__Integer___container,@function
kermeta_standard__Integer___container:  # @kermeta_standard__Integer___container
	.cfi_startproc
# BB#0:
	xorl	%eax, %eax
	ret
.Ltmp32:
	.size	kermeta_standard__Integer___container, .Ltmp32-kermeta_standard__Integer___container
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
	pushq	%rbp
.Ltmp37:
	.cfi_def_cfa_offset 16
	pushq	%r14
.Ltmp38:
	.cfi_def_cfa_offset 24
	pushq	%rbx
.Ltmp39:
	.cfi_def_cfa_offset 32
.Ltmp40:
	.cfi_offset %rbx, -32
.Ltmp41:
	.cfi_offset %r14, -24
.Ltmp42:
	.cfi_offset %rbp, -16
	movl	%edi, %ebx
	movl	%ebx, %ebp
	shrl	$31, %ebp
	testl	%ebx, %ebx
	je	.LBB11_1
# BB#2:
	movl	%ebx, %eax
	sarl	$31, %eax
	leal	(%rbx,%rax), %ecx
	xorl	%eax, %ecx
	cvtsi2sd	%ecx, %xmm0
	callq	log10
	roundsd	$1, %xmm0, %xmm0
	addsd	.LCPI11_0(%rip), %xmm0
	cvtsi2sd	%ebp, %xmm1
	addsd	%xmm0, %xmm1
	cvttsd2si	%xmm1, %ebp
	jmp	.LBB11_3
.LBB11_1:
	incl	%ebp
.LBB11_3:
	movslq	%ebp, %rdi
	callq	malloc
	movq	%rax, %r14
	movq	%r14, %rdi
	movl	$8, %esi
	movl	$.L.str, %edx
	movl	%ebx, %ecx
	xorb	%al, %al
	callq	snprintf
	movq	%r14, %rax
	popq	%rbx
	popq	%r14
	popq	%rbp
	ret
.Ltmp43:
	.size	kermeta_standard__Integer___toString, .Ltmp43-kermeta_standard__Integer___toString
	.cfi_endproc

	.globl	kermeta_standard__Boolean___container
	.align	16, 0x90
	.type	kermeta_standard__Boolean___container,@function
kermeta_standard__Boolean___container:  # @kermeta_standard__Boolean___container
	.cfi_startproc
# BB#0:
	xorl	%eax, %eax
	ret
.Ltmp44:
	.size	kermeta_standard__Boolean___container, .Ltmp44-kermeta_standard__Boolean___container
	.cfi_endproc

	.globl	kermeta_standard__Boolean___toString
	.align	16, 0x90
	.type	kermeta_standard__Boolean___toString,@function
kermeta_standard__Boolean___toString:   # @kermeta_standard__Boolean___toString
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp46:
	.cfi_def_cfa_offset 16
	testb	%dil, %dil
	je	.LBB13_2
# BB#1:
	movl	$4, %edi
	callq	malloc
	movl	$1702195828, (%rax)     # imm = 0x65757274
	popq	%rdx
	ret
.LBB13_2:
	movl	$5, %edi
	callq	malloc
	movb	$101, 4(%rax)
	movl	$1936482662, (%rax)     # imm = 0x736C6166
	popq	%rdx
	ret
.Ltmp47:
	.size	kermeta_standard__Boolean___toString, .Ltmp47-kermeta_standard__Boolean___toString
	.cfi_endproc

	.globl	kermeta_io__StdIO___writeln
	.align	16, 0x90
	.type	kermeta_io__StdIO___writeln,@function
kermeta_io__StdIO___writeln:            # @kermeta_io__StdIO___writeln
	.cfi_startproc
# BB#0:
	jmp	puts                    # TAILCALL
.Ltmp48:
	.size	kermeta_io__StdIO___writeln, .Ltmp48-kermeta_io__StdIO___writeln
	.cfi_endproc

	.globl	kermeta_io__StdIO___write
	.align	16, 0x90
	.type	kermeta_io__StdIO___write,@function
kermeta_io__StdIO___write:              # @kermeta_io__StdIO___write
	.cfi_startproc
# BB#0:
	movq	%rdi, %rcx
	xorb	%al, %al
	movl	$.L.str3, %edi
	movq	%rcx, %rsi
	jmp	printf                  # TAILCALL
.Ltmp49:
	.size	kermeta_io__StdIO___write, .Ltmp49-kermeta_io__StdIO___write
	.cfi_endproc

	.globl	kermeta_io__StdIO___errorln
	.align	16, 0x90
	.type	kermeta_io__StdIO___errorln,@function
kermeta_io__StdIO___errorln:            # @kermeta_io__StdIO___errorln
	.cfi_startproc
# BB#0:
	movq	%rdi, %rcx
	movq	stderr(%rip), %rdi
	xorb	%al, %al
	movl	$.L.str4, %esi
	movq	%rcx, %rdx
	jmp	fprintf                 # TAILCALL
.Ltmp50:
	.size	kermeta_io__StdIO___errorln, .Ltmp50-kermeta_io__StdIO___errorln
	.cfi_endproc

	.globl	kermeta__o__StdIO___error
	.align	16, 0x90
	.type	kermeta__o__StdIO___error,@function
kermeta__o__StdIO___error:              # @kermeta__o__StdIO___error
	.cfi_startproc
# BB#0:
	movq	stderr(%rip), %rsi
	jmp	fputs                   # TAILCALL
.Ltmp51:
	.size	kermeta__o__StdIO___error, .Ltmp51-kermeta__o__StdIO___error
	.cfi_endproc

	.globl	kermeta___io__StdIO_read
	.align	16, 0x90
	.type	kermeta___io__StdIO_read,@function
kermeta___io__StdIO_read:               # @kermeta___io__StdIO_read
	.cfi_startproc
# BB#0:
	xorl	%eax, %eax
	ret
.Ltmp52:
	.size	kermeta___io__StdIO_read, .Ltmp52-kermeta___io__StdIO_read
	.cfi_endproc

	.globl	kermeta_io__StdIO___container
	.align	16, 0x90
	.type	kermeta_io__StdIO___container,@function
kermeta_io__StdIO___container:          # @kermeta_io__StdIO___container
	.cfi_startproc
# BB#0:
	xorl	%eax, %eax
	ret
.Ltmp53:
	.size	kermeta_io__StdIO___container, .Ltmp53-kermeta_io__StdIO___container
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__B___foo1,@function
pkgFoo__B___foo1:                       # @pkgFoo__B___foo1
	.cfi_startproc
# BB#0:
	movq	kermeta_io__StdIO_23__23_dynBind(%rip), %rax
	movl	$.Ls0, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	jmpq	*%rax  # TAILCALL
.Ltmp54:
	.size	pkgFoo__B___foo1, .Ltmp54-pkgFoo__B___foo1
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__C___foo3,@function
pkgFoo__C___foo3:                       # @pkgFoo__C___foo3
	.cfi_startproc
# BB#0:
	movq	kermeta_io__StdIO_23__23_dynBind(%rip), %rax
	movl	$.Ls1, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	jmpq	*%rax  # TAILCALL
.Ltmp55:
	.size	pkgFoo__C___foo3, .Ltmp55-pkgFoo__C___foo3
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__C___bar2,@function
pkgFoo__C___bar2:                       # @pkgFoo__C___bar2
	.cfi_startproc
# BB#0:
	movq	kermeta_io__StdIO_23__23_dynBind(%rip), %rax
	movl	$.Ls2, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	jmpq	*%rax  # TAILCALL
.Ltmp56:
	.size	pkgFoo__C___bar2, .Ltmp56-pkgFoo__C___bar2
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__D___foo4,@function
pkgFoo__D___foo4:                       # @pkgFoo__D___foo4
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp58:
	.cfi_def_cfa_offset 16
	movl	$.Ls1, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	*kermeta_io__StdIO_23__23_dynBind(%rip)
	movq	kermeta_io__StdIO_23__23_dynBind(%rip), %rax
	movl	$.Ls3, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	popq	%rdx
	jmpq	*%rax  # TAILCALL
.Ltmp59:
	.size	pkgFoo__D___foo4, .Ltmp59-pkgFoo__D___foo4
	.cfi_endproc

	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# BB#0:
	pushq	%r15
.Ltmp64:
	.cfi_def_cfa_offset 16
	pushq	%r14
.Ltmp65:
	.cfi_def_cfa_offset 24
	pushq	%rbx
.Ltmp66:
	.cfi_def_cfa_offset 32
.Ltmp67:
	.cfi_offset %rbx, -32
.Ltmp68:
	.cfi_offset %r14, -24
.Ltmp69:
	.cfi_offset %r15, -16
	movl	$.Ls4, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	*kermeta_io__StdIO_23__23_dynBind(%rip)
	movl	$16, %edi
	callq	malloc
	movq	%rax, %r14
	movl	$16, %edi
	callq	malloc
	movq	%rax, %r15
	movl	$16, %edi
	callq	malloc
	movq	%rax, %rbx
	movl	$8, %edi
	callq	malloc
	movq	%rax, 8(%rbx)
	movq	$pkgFoo__B_23__23_dynBind, (%rbx)
	movq	%rbx, 8(%r15)
	movq	$pkgFoo__C_23__23_dynBind, (%r15)
	movq	%r15, 8(%r14)
	movq	$pkgFoo__D_23__23_dynBind, (%r14)
	movq	%r14, %rdi
	callq	*pkgFoo__D_23__23_dynBind+8(%rip)
	movl	$.Ls6, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	*kermeta_io__StdIO_23__23_dynBind(%rip)
	movq	8(%r14), %rdi
	callq	*pkgFoo__C_23__23_dynBind(%rip)
	movl	$16, %edi
	callq	malloc
	movq	%rax, %rbx
	movl	$8, %edi
	callq	malloc
	movq	%rax, 8(%rbx)
	movq	$pkgFoo__B_23__23_dynBind, (%rbx)
	movq	%rbx, %rdi
	callq	*pkgFoo__B_23__23_dynBind(%rip)
	xorl	%eax, %eax
	popq	%rbx
	popq	%r14
	popq	%r15
	ret
.Ltmp70:
	.size	main, .Ltmp70-main
	.cfi_endproc

	.align	16, 0x90
	.type	pkgFoo__Main___main5,@function
pkgFoo__Main___main5:                   # @pkgFoo__Main___main5
	.cfi_startproc
# BB#0:                                 # %llvmlabel15
	pushq	%r15
.Ltmp75:
	.cfi_def_cfa_offset 16
	pushq	%r14
.Ltmp76:
	.cfi_def_cfa_offset 24
	pushq	%rbx
.Ltmp77:
	.cfi_def_cfa_offset 32
.Ltmp78:
	.cfi_offset %rbx, -32
.Ltmp79:
	.cfi_offset %r14, -24
.Ltmp80:
	.cfi_offset %r15, -16
	movl	$.Ls4, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	*kermeta_io__StdIO_23__23_dynBind(%rip)
	movl	$16, %edi
	callq	malloc
	movq	%rax, %r14
	movl	$16, %edi
	callq	malloc
	movq	%rax, %r15
	movl	$16, %edi
	callq	malloc
	movq	%rax, %rbx
	movl	$8, %edi
	callq	malloc
	movq	%rax, 8(%rbx)
	movq	$pkgFoo__B_23__23_dynBind, (%rbx)
	movq	%rbx, 8(%r15)
	movq	$pkgFoo__C_23__23_dynBind, (%r15)
	movq	%r15, 8(%r14)
	movq	$pkgFoo__D_23__23_dynBind, (%r14)
	movq	%r14, %rdi
	callq	*pkgFoo__D_23__23_dynBind+8(%rip)
	movl	$.Ls6, %edi
	movl	$SINGLETON_kermeta_io__StdIO, %esi
	callq	*kermeta_io__StdIO_23__23_dynBind(%rip)
	movq	8(%r14), %rdi
	callq	*pkgFoo__C_23__23_dynBind(%rip)
	movl	$16, %edi
	callq	malloc
	movq	%rax, %r14
	movl	$16, %edi
	callq	malloc
	movq	%rax, %rbx
	movl	$8, %edi
	callq	malloc
	movq	%rax, 8(%rbx)
	movq	$pkgFoo__B_23__23_dynBind, (%rbx)
	movq	%rbx, 8(%r14)
	movq	$pkgFoo__C_23__23_dynBind, (%r14)
	movq	%rbx, %rdi
	popq	%rbx
	popq	%r14
	popq	%r15
	jmpq	*pkgFoo__B_23__23_dynBind(%rip)  # TAILCALL
.Ltmp81:
	.size	pkgFoo__Main___main5, .Ltmp81-pkgFoo__Main___main5
	.cfi_endproc

	.type	.L.str,@object          # @.str
	.section	.rodata.str1.1,"aMS",@progbits,1
.L.str:
	.asciz	 "%d"
	.size	.L.str, 3

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

	.type	kermeta_io__StdIO_23__23_dynBind,@object # @"kermeta_io__StdIO##dynBind"
	.globl	kermeta_io__StdIO_23__23_dynBind
	.align	8
kermeta_io__StdIO_23__23_dynBind:
	.quad	kermeta_io__StdIO___writeln
	.size	kermeta_io__StdIO_23__23_dynBind, 8

	.type	pkgFoo__C_23__23_dynBind,@object # @"pkgFoo__C##dynBind"
	.globl	pkgFoo__C_23__23_dynBind
	.align	8
pkgFoo__C_23__23_dynBind:
	.quad	pkgFoo__C___bar2
	.quad	pkgFoo__C___foo3
	.size	pkgFoo__C_23__23_dynBind, 16

	.type	pkgFoo__D_23__23_dynBind,@object # @"pkgFoo__D##dynBind"
	.globl	pkgFoo__D_23__23_dynBind
	.align	8
pkgFoo__D_23__23_dynBind:
	.quad	pkgFoo__C___bar2
	.quad	pkgFoo__D___foo4
	.size	pkgFoo__D_23__23_dynBind, 16

	.type	pkgFoo__Main_23__23_dynBind,@object # @"pkgFoo__Main##dynBind"
	.globl	pkgFoo__Main_23__23_dynBind
	.align	8
pkgFoo__Main_23__23_dynBind:
	.quad	pkgFoo__Main___main5
	.size	pkgFoo__Main_23__23_dynBind, 8


	.section	".note.GNU-stack","",@progbits
