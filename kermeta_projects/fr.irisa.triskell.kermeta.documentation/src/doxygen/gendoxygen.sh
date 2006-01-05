#!/bin/bash
# This script generate doxygen documentation for the main kermeta projects
# located on the current Eclipse workspace inside which this script is
# included.

# test : is doxygen located in PATH?

# Set the list of directories in which the doxygen documentation will be
# generated.
set list=""
for doxyf in doxyfiles/*
do
    echo "found doxyfile : $doxyf"
    if [ $doxyf != all_doxyfile ] then # ignore the "all" case
    list="$list $doxyf"
    fi
done

# Create build directory if it does not exist
set builddir=../../build/doxygen

# for each file specified, execute doxygen

for file in $list
do
    echo "generating doc for $file"
    folder=`basename $file _doxyfile`
    if [ -d $folder ]
    then
        echo "good : file $folder exists"
        doxygen -s $file
    else
       echo "$builddir/$folder does not exist : creating one"
       mkdir $builddir/$folder # to do : check the rights.
    fi
done

# Then, we "manually" copy the images used for the style sheet of the
# gen docs.  This also update the style sheet in each doxygenerated directory
/bin/bash updatecss.sh ../../build/doxygen/ ./doxyfiles/
