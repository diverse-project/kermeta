# Make file for Microsoft NMAKE

!IF EXISTS (..\.prolog_path_wind) 
!INCLUDE ..\.prolog_path_wind
!ENDIF

OBJEXT = .xwam
PROLOGEXT = .P

ALLOBJS = flrxml_aux$(PROLOGEXT) javaAPI$(PROLOGEXT) \
	  persistentmodules$(PROLOGEXT) 

OPTIONS=[optimize]

.SUFFIXES: $(PROLOGEXT) .flr

ALL: $(ALLOBJS)


flrxml_aux$(PROLOGEXT):
	$(PROLOG) -e "asserta(library_directory('..')). ['..\\flora2']. import bootstrap_flora/0 from flora2. bootstrap_flora. import (flCompile)/1 from flora2. flCompile(%|fF >> flrxml). halt."

.flr$(PROLOGEXT):
	$(PROLOG) -e "asserta(library_directory('..')). ['..\\flora2']. import bootstrap_flora/0 from flora2. bootstrap_flora. import (flCompile)/1 from flora2. flCompile(%|fF). halt."


CLEAN:
	-@erase *~
	-@erase *$(OBJEXT)
	-@erase *$(PROLOGEXT)
	-@erase *.fdb
	-@erase *.fld
	-@erase *.bak
	-@erase .#*
