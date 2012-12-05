	.file	"sample.ll"
	.text
	.globl	f
	.align	16, 0x90
	.type	f,@function
f:                                      # @f
	.cfi_startproc
# BB#0:                                 # %entry
	ret
.Ltmp0:
	.size	f, .Ltmp0-f
	.cfi_endproc


	.section	".note.GNU-stack","",@progbits
