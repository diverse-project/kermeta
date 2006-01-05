================================================================
File : README
Crea-date : 04-01-2006
Description : 
    Contains informations relative to the generation of java 
    documentation with doxygen.
    Tells how to complete this folder if a new project 
    needs to be documented.
================================================================



0. How to generate docs
================================================================

- go to the src/doxygen directory
- directly launch : gendoxygen.sh or gendoxygenmerge.sh.
  Those scripts are described in the following section.
- the docs are generated in build/doxygen directory.


1. Contents
================================================================


* doxyfiles : 
    this directory contains the list of configuration files used by
    doxygen to generate documentation.
    (each config file is called using this command : "doxygen -s <doxyfile>")


* style :
    this directory contains the files and images used to customize doxygen
    generated documentation.

* gendoxygen.sh :
    this script generates documentation for each kermeta project separately
    (using this script, each documentation project is independant on the others,
    that is, you cannot access the classes of the separate projects with this doc. generator.)
    the result is a set of directories (namely : interpreter, io, framework, runner,
    texteditor) in the ../../build/doxygen directory.))
    We only generated doc for the following projects :
        - framework
        - interpreter
        - io
        - runner
        - texteditor
    Since there is no script that automates the process yet, if you want to
    document the other projects

* gendoxygenmerge.sh :
    this scripts generates documentation for all the kermeta projects
    in the current eclipse workspace dedicated to the kermeta projects.
    Generate a directory "all" in build/doxygen folder

* updatecss.sh :
    this script is called by the above ones.
    If you want to modify a css or an image, in the style/ directory, and then
    apply the changes to your docs without re-generating completely them, then
    call this script.
