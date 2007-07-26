@echo off
REM File:      buildExample.bat
REM
REM Author(s): Aditi Pandit
REM
REM Contact:   flora-users@lists.sourceforge.net
REM 
REM Copyright (C) The Research Foundation of SUNY, 2005
REM 
REM FLORA-2 is free software; you can redistribute it and/or modify it under the
REM terms of the GNU Library General Public License as published by the Free
REM Software Foundation; either version 2 of the License, or (at your option)
REM any later version.
REM
REM FLORA-2 is distributed in the hope that it will be useful, but WITHOUT ANY
REM WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
REM FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License for
REM more details.
REM
REM
REM You should have received a copy of the GNU Library General Public License
REM along with FLORA-2; if not, write to the Free Software Foundation,
REM Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
REM
REM
REM

echo ==============================
echo Building javaInterfaceCode

CALL ..\..\windowsVariables.bat
CALL ..\..\flora_settings.bat

CALL %1%\floraVariables.bat


CALL ..\..\..\runflora.bat -e "_load('%FLORA_FILE%'>>example),_load(javaAPI),%%%%write('%FLORA_CLASS%',example,'%JAVA_FILE%'),_halt."

echo Compiling files
%JAVA_BIN%\javac -classpath ..;..\..\interprolog.jar %1%\*.java

REM Local Variables:
REM coding-system-for-write:  iso-2022-7bit-dos
REM End:
