
all:  flora2.pdf flora-packages.pdf

flora2.dvi: flora2.tex
	@echo
	@echo Compiling flora2.tex
	latex flora2
	@echo
	@echo Making bibliography...
	bibtex flora2
	@echo
	@echo Making index...
	makeindex flora2
	@echo
	@echo Recompiling...
	latex flora2
	latex flora2

flora2.pdf: flora2.dvi
	@echo
	@echo Making pdf for flora2
	dvipdf flora2

flora-packages.dvi: flora-packages.tex flora-persistence.tex flora-flrxml.tex flora-protege.tex
	@echo
	@echo Compiling flora-packages.tex
	latex flora-packages
	latex flora-packages
	makeindex flora-packages

flora-packages.pdf: flora-packages.dvi
	@echo
	@echo Making pdf for flora-packages
	dvipdf flora-packages

clean:
	/bin/rm -f  *.bak *~ .*~ .#*
	/bin/rm -f  *.aux *.bbl *.blg *.dvi *.idx *.ilg *.ind *.log \
			*.out *.pdf *.ps *.toc
