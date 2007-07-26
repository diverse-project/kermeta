@echo off
REM File:      windowsVariables.bat
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

REM Change JAVA_BIN, ENGINE, and PROTEGE_DIR, if necessary
set JAVA_BIN="C:\Program Files\Java\jdk1.5.0_07\bin"
REM Valid values: Native or Subprocess
REM set ENGINE=Subprocess
set ENGINE=Native
set PROTEGE_DIR="C:\Program Files\Protege_3.1"


REM Don't change this!
set JARS="%PROTEGE_DIR%\protege.jar";"%PROTEGE_DIR%\looks.jar";"%PROTEGE_DIR%\unicode_panel.jar";"%PROTEGE_DIR%\driver.jar";"%PROTEGE_DIR%\driver1.jar";"%PROTEGE_DIR%\driver2.jar"
