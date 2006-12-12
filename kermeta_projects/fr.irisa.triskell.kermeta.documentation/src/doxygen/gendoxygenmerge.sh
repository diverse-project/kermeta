#!/bin/bash
# This script generate doxygen documentation for the main kermeta projects
# located on the current Eclipse workspace inside which this script is
# included.

# test : is doxygen located in PATH?

# Set the directory in which the doxygen documentation will be
# generated.
export builddir=../../build/doxygen
if ! [ -d $builddir ] 
then
    echo "create a build/doxygen directory"
    mkdir $builddir
fi

doxygen -s ./doxyfiles/all_doxyfile
# Create output dir if does not exist
if ! [ -d $builddir/all ]
then
    mkdir $builddir/all
fi
# Then, we "manually" copy the images used for the style sheet of the
# gen docs.  This also update the style sheet in each doxygenerated directory
/bin/bash updatecss.sh $builddir ./doxyfiles/all_doxyfile
