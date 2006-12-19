@echo OFF
@set FLORADIR="'C:/aXSB/packages/flora2'"
@set PROLOG=C:\eclipse\eclipse_3.1.2\pluginWorkpace\fr.irisa.triskell.prolog\thirdparty\XSB\config\x86-pc-windows\bin\xsb
@set PROLOGOPTIONS="-m 100000 -c 20000"
@%PROLOG% %PROLOGOPTIONS% -e "asserta(library_directory(%FLORADIR%)). import flora_configuration/2 from flrregistry. assert(flora_configuration(standalone,yes)).  assert(flora_configuration(installdir,%FLORADIR%)). [flora2]. flora_shell." %1 %2 %3 %4 %5 %6 %7
