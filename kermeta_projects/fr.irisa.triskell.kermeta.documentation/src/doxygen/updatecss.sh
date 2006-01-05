#!/bin/bash
# argument : 
# $1 : the base directory that contains the generated docs (normally, ../build/doxygen/)
# $2 : the concerned doxyfile or the directory that contained the concerned
# doxyfiles (e.g : ./doxyfiles/all -- ./doxyfiles/ for all the doxyfiles)
list=""
for doxyf in $2
do
    echo "found doxyfile : $doxyf"
    list="$list `basename $doxyf _doxyfile`"
done

for folder in $list
do
    echo "copying css and images into $1/$folder/html"
    cp ./style/doxygen.css $1/$folder/html/
    cp ./style/*.png $1/$folder/html/
    cp ./style/*.gif $1/$folder/html/
done
