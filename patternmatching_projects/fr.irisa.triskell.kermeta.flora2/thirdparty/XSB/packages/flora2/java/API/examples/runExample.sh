# File:      runExamples.sh
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
#! /bin/sh

. ../../unixVariables.sh
. ../../flora_settings.sh

. ${1}/floraVariables.sh

${JAVA_BIN}/java -DPROLOGDIR=${PROLOGDIR} -DFLORA_FILE=${FLORA_FILE} -DFLORADIR=${FLORADIR} -Djava.library.path=${PROLOGDIR} -DENGINE=${ENGINE} -classpath ${CLASSPATH}:..:../../interprolog.jar:fooExample:flogicbasicsExample ${1}


