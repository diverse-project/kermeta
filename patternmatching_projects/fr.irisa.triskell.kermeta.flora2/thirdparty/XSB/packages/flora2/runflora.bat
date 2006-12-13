@echo OFF
@set FLORADIR="'%ECLIPSE_HOME%\XSB\packages\flora2"
@set PROLOG=%ECLIPSE_HOME%\XSB\config\x86-pc-windows\bin\xsb
@set PROLOGOPTIONS="-m 100000 -c 20000"
@%PROLOG% %PROLOGOPTIONS% -e "asserta(library_directory(%FLORADIR%)). [flora2]. flora_shell." %1 %2 %3 %4 %5 %6 %7
