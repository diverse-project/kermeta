# File:      unixVariables.sh
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


# Change PROTEGE_DIR and ENGINE if necessary

PROTEGE_DIR="$HOME/Protege"
# Valid values: Native or Subprocess
# Native engine doesn't work well with Linux
ENGINE=Subprocess
#ENGINE=Native
# Normally doesn't need to be set: autodetected
JAVA_BIN=

# don't touch this
if [ -z "$JAVA_BIN" ]; then
    JAVA_PROG=`which java 2> /dev/null` 

    if [ -z "$JAVA_PROG" -o ! -x "$JAVA_PROG" ]; then
       echo "** Java executable could not be found on your system"
       echo "** Please set the variable JAVA_BIN to the Java binary directory"
    else
	JAVA_BIN=`dirname "$JAVA_PROG"`
	echo "** Using Java executable in $JAVA_BIN"
	$JAVA_BIN/java -version
	echo "** Please make sure that your Java version is 1.4.2 or newer"
    fi
fi

# Don't change this!
JARS=$PROTEGE_DIR/protege.jar:$PROTEGE_DIR/looks.jar:$PROTEGE_DIR/unicode_panel.jar:$PROTEGE_DIR/driver.jar:$PROTEGE_DIR/driver1.jar:$PROTEGE_DIR/driver2.jar
