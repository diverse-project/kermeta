# Make file for Microsoft NMAKE

ALLOBJS = flrcommon.flh \
	  flrcommon_inh.flh \
	  flrsigaxioms.flh \
          flrnoeqltrailer.flh \
          flrnoeqltrailer_inh.flh \
	  flreqltrailer.flh \
	  flreqltrailer_inh.flh \
          flrscalareql.flh \
	  flrpredeql.flh \
	  flrprednoeql.flh

!IF EXISTS (..\.prolog_path_wind) 
!INCLUDE ..\.prolog_path_wind
!ENDIF

.SUFFIXES: .flh .fli

ALL: $(ALLOBJS)

CLEAN :
	-@erase *~
	-@erase *.flh
	-@erase *.bak
	-@erase .#*

.fli.flh:
	$(PROLOG) -e "asserta(library_directory('..')). ['..\\flora2']. import bootstrap_flora/0 from flora2. bootstrap_flora. [flrwraparound]. import flWrapAround/1 from flrwraparound. flWrapAround(%|fF). halt."

