#! /bin/sh
# File:      buildExample.sh
#
# Author(s): Aditi Pandit
#
# Contact:   flora-users@lists.sourceforge.net
# 
# Copyright (C) The Research Foundation of SUNY, 2005
# 
# FLORA-2 is free software; you can redistribute it and/or modify it under the
# terms of the GNU Library General Public License as published by the Free
# Software Foundation; either version 2 of the License, or (at your option)
# any later version.
#
# FLORA-2 is distributed in the hope that it will be useful, but WITHOUT ANY
# WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
# FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License for
# more details.
#
#
# You should have received a copy of the GNU Library General Public License
# along with FLORA-2; if not, write to the Free Software Foundation,
# Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
#
#

if test ! -d "${1}" -o "$1" = "" ; then
    echo
    echo "**** Argument 1 must be a directory containing the example to build"
    echo
    exit 1
fi
. ../../unixVariables.sh
. ../../flora_settings.sh

. ${1}/floraVariables.sh

../../../runflora -e "_load('${FLORA_FILE}'>>example),_load(javaAPI),%write(${FLORA_CLASS},example,'${JAVA_FILE}'),_halt." 
 
# add -Xlint after convertion to Java 1.5
${JAVA_BIN}/javac -deprecation -Xlint:unchecked -Xlint -classpath ..:../../interprolog.jar ${1}/*.java 
