$Id: README.txt,v 1.2 2005-02-16 11:29:28 ffleurey Exp $


Leaders :
---------
Z. Drey
F. Fleurey

Description :
-------------
This project contains the model of the Kermeta language as ecore models.


How to build this project :
---------------------------

1) Run ant build : it creates the ecore models of kermeta in build/ecore
	* kermeta.ecore : the kermeta meta model
	* kermeta_java.ecore : a version of the model to generate java classes
	
2) Generate java code using emf
	a) create kermeta.genmodel in build/ecore using eclipse wizard by loading kermeta_java.ecore
	b) set the 'Model Directory' of  kermeta.genmodel to '/fr.irisa.triskell.kermeta.model/src/java'
	c) set the Kermeta package 'Base Package' to 'fr.irisa.triskell'
	d) 'Generate model code' from  kermeta.genmodel

3) Check that java source code generated in src/java compiles correctly

4) Generate the model_kermeta.jar in the dist directory that include build/class compiled classes


History :
---------
$Log: not supported by cvs2svn $
Revision 1.1  2005/02/16 10:29:56  ffleurey
Initial revision

