Id: README.txt,v 1.4 2005/02/18 14:57:41 zdrey Exp $


Leaders :
---------
Z. Drey
F. Fleurey

Description :
-------------
This project contains the model of the Kermeta language as ecore models.

Projets that relies on this project:
-------------------------------------

All metacore dev projects !!!


How to build this project :
---------------------------

0) Configure the project environment : 
     * in Eclipse, go to your project properties, and add a User Library. To do this,
   you only have get emf_libraries_linux.userlibraries in this_folder/conf/, and modify
   the <archive paths> where the specified plugin' jars (common.jar and so on) are installed.
     * Then, modify eclipse_dir <property> in the ecore_build.xml in this folder.

1) Run ant build on ecore_build.xml : it creates the ecore models of kermeta in build/ecore

	* kermeta.ecore : the kermeta meta model
	* kermeta_java.ecore : a version of the model to generate java classes
	
2) Generate java code using emf
	a) create kermeta.genmodel in build/ecore using eclipse wizard by loading kermeta_java.ecore
	b) set the 'Model Directory' of  kermeta.genmodel to '/fr.irisa.triskell.kermeta.model/src/java' (in Properties tab)
	c) set the Kermeta package 'Base Package' to 'fr.irisa.triskell' (in Properties tab)
	d) 'Generate model code' from  kermeta.genmodel

3) Check that java source code generated in src/java compiles correctly

4) Generate the model_kermeta.jar in the dist directory that include build/class compiled classes


History :
---------
$Log: not supported by cvs2svn $
Revision 1.4  2005/02/18 14:57:41  zdrey
add tiny info to tell how to launch ecore_build.xml

Revision 1.3  2005/02/17 08:47:18  ffleurey
Initial revision

Revision 1.2  2005/02/16 11:29:28  ffleurey
Initial version

Revision 1.1  2005/02/16 10:29:56  ffleurey
Initial revision

