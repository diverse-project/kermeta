	.file	"testCastInheritance.ll"
	.text
	.align	16, 0x90
	.type	create_pkgFoo_A,@function
create_pkgFoo_A:                        # @create_pkgFoo_A
	.cfi_startproc
# BB#0:
	leaq	-8(%rsp), %rax
	ret
.Ltmp0:
	.size	create_pkgFoo_A, .Ltmp0-create_pkgFoo_A
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo_B,@function
create_pkgFoo_B:                        # @create_pkgFoo_B
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp2:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo_A
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp3:
	.size	create_pkgFoo_B, .Ltmp3-create_pkgFoo_B
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo_C,@function
create_pkgFoo_C:                        # @create_pkgFoo_C
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp5:
	.cfi_def_cfa_offset 32
	callq	create_pkgFoo_B
	movq	%rax, 8(%rsp)
	leaq	8(%rsp), %rax
	addq	$24, %rsp
	ret
.Ltmp6:
	.size	create_pkgFoo_C, .Ltmp6-create_pkgFoo_C
	.cfi_endproc

	.align	16, 0x90
	.type	create_pkgFoo_D,@function
create_pkgFoo_D:                        # @create_pkgFoo_D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp8:
	.cfi_def_cfa_offset 16
	callq	create_pkgFoo_C
	movq	%rax, (%rsp)
	leaq	(%rsp), %rax
	popq	%rdx
	ret
.Ltmp9:
	.size	create_pkgFoo_D, .Ltmp9-create_pkgFoo_D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_A_pkgFoo_B,@function
cast_pkgFoo_A_pkgFoo_B:                 # @cast_pkgFoo_A_pkgFoo_B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp10:
	.size	cast_pkgFoo_A_pkgFoo_B, .Ltmp10-cast_pkgFoo_A_pkgFoo_B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_A_pkgFoo_C,@function
cast_pkgFoo_A_pkgFoo_C:                 # @cast_pkgFoo_A_pkgFoo_C
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp12:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo_A_pkgFoo_B
	movq	%rax, %rdi
	callq	cast_pkgFoo_B_pkgFoo_C
	popq	%rdx
	ret
.Ltmp13:
	.size	cast_pkgFoo_A_pkgFoo_C, .Ltmp13-cast_pkgFoo_A_pkgFoo_C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_A_pkgFoo_D,@function
cast_pkgFoo_A_pkgFoo_D:                 # @cast_pkgFoo_A_pkgFoo_D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp15:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo_A_pkgFoo_B
	movq	%rax, %rdi
	callq	cast_pkgFoo_B_pkgFoo_C
	movq	%rax, %rdi
	callq	cast_pkgFoo_C_pkgFoo_D
	popq	%rdx
	ret
.Ltmp16:
	.size	cast_pkgFoo_A_pkgFoo_D, .Ltmp16-cast_pkgFoo_A_pkgFoo_D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_B_pkgFoo_A,@function
cast_pkgFoo_B_pkgFoo_A:                 # @cast_pkgFoo_B_pkgFoo_A
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp17:
	.size	cast_pkgFoo_B_pkgFoo_A, .Ltmp17-cast_pkgFoo_B_pkgFoo_A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_B_pkgFoo_C,@function
cast_pkgFoo_B_pkgFoo_C:                 # @cast_pkgFoo_B_pkgFoo_C
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp18:
	.size	cast_pkgFoo_B_pkgFoo_C, .Ltmp18-cast_pkgFoo_B_pkgFoo_C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_B_pkgFoo_D,@function
cast_pkgFoo_B_pkgFoo_D:                 # @cast_pkgFoo_B_pkgFoo_D
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp20:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo_B_pkgFoo_C
	movq	%rax, %rdi
	callq	cast_pkgFoo_C_pkgFoo_D
	popq	%rdx
	ret
.Ltmp21:
	.size	cast_pkgFoo_B_pkgFoo_D, .Ltmp21-cast_pkgFoo_B_pkgFoo_D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_C_pkgFoo_B,@function
cast_pkgFoo_C_pkgFoo_B:                 # @cast_pkgFoo_C_pkgFoo_B
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp22:
	.size	cast_pkgFoo_C_pkgFoo_B, .Ltmp22-cast_pkgFoo_C_pkgFoo_B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_C_pkgFoo_A,@function
cast_pkgFoo_C_pkgFoo_A:                 # @cast_pkgFoo_C_pkgFoo_A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp24:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo_C_pkgFoo_B
	movq	%rax, %rdi
	callq	cast_pkgFoo_B_pkgFoo_A
	popq	%rdx
	ret
.Ltmp25:
	.size	cast_pkgFoo_C_pkgFoo_A, .Ltmp25-cast_pkgFoo_C_pkgFoo_A
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_C_pkgFoo_D,@function
cast_pkgFoo_C_pkgFoo_D:                 # @cast_pkgFoo_C_pkgFoo_D
	.cfi_startproc
# BB#0:
	movq	8(%rdi), %rax
	ret
.Ltmp26:
	.size	cast_pkgFoo_C_pkgFoo_D, .Ltmp26-cast_pkgFoo_C_pkgFoo_D
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_D_pkgFoo_C,@function
cast_pkgFoo_D_pkgFoo_C:                 # @cast_pkgFoo_D_pkgFoo_C
	.cfi_startproc
# BB#0:
	movq	(%rdi), %rax
	ret
.Ltmp27:
	.size	cast_pkgFoo_D_pkgFoo_C, .Ltmp27-cast_pkgFoo_D_pkgFoo_C
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_D_pkgFoo_B,@function
cast_pkgFoo_D_pkgFoo_B:                 # @cast_pkgFoo_D_pkgFoo_B
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp29:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo_D_pkgFoo_C
	movq	%rax, %rdi
	callq	cast_pkgFoo_C_pkgFoo_B
	popq	%rdx
	ret
.Ltmp30:
	.size	cast_pkgFoo_D_pkgFoo_B, .Ltmp30-cast_pkgFoo_D_pkgFoo_B
	.cfi_endproc

	.align	16, 0x90
	.type	cast_pkgFoo_D_pkgFoo_A,@function
cast_pkgFoo_D_pkgFoo_A:                 # @cast_pkgFoo_D_pkgFoo_A
	.cfi_startproc
# BB#0:
	pushq	%rax
.Ltmp32:
	.cfi_def_cfa_offset 16
	callq	cast_pkgFoo_D_pkgFoo_C
	movq	%rax, %rdi
	callq	cast_pkgFoo_C_pkgFoo_B
	movq	%rax, %rdi
	callq	cast_pkgFoo_B_pkgFoo_A
	popq	%rdx
	ret
.Ltmp33:
	.size	cast_pkgFoo_D_pkgFoo_A, .Ltmp33-cast_pkgFoo_D_pkgFoo_A
	.cfi_endproc


	.section	".note.GNU-stack","",@progbits
