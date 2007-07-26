@echo off
REM File:      build.bat
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
echo ------------------------------

CALL ..\windowsVariables.bat
CALL ..\flora_settings.bat

del net\sourceforge\flora\javaAPI\util\*.class

del net\sourceforge\flora\javaAPI\src\*.class

echo *** The above "Could Not Find ... " warnings (if any) are normal


echo ------------------------------
echo Compiling files ...
echo ------------------------------

%JAVA_BIN%\javac -Xlint  -classpath ..;..\interprolog.jar net\sourceforge\flora\javaAPI\util\*.java net\sourceforge\flora\javaAPI\src\*.java 

echo *** If you saw a warning "The system cannot find the path specified",
echo *** change the variable JAVA_BIN in flora2\java\windowsVariables.bat
echo *** appropriately for your system.


REM Local Variables:
REM coding-system-for-write:  iso-2022-7bit-dos
REM End:
