$Id: README.txt,v 1.13 2006-11-03 11:02:42 cfaucher Exp $


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
     * create a folder "java" in the folder build

1) Run ant build on ecore_build.xml : it creates the ecore models of kermeta in build/ecore

	* kermeta.ecore : the kermeta meta model
	* kermeta_java.ecore : a version of the model to generate java classes
	
2) Generate java code using emf
	a) create kermeta.genmodel in build/ecore using eclipse wizard by loading kermeta_java.ecore 
		(the wizard name is EMF modeling framework/EMF models)
	b) In the Properties tab section "Model" of kermeta.genmodel:
		set the 'Containment proxies' to 'true'
		set the 'Model Directory' of  kermeta.genmodel to '/fr.irisa.triskell.kermeta.model/build/java'
	c) In the Properties tab section "All" of kermeta.genmodel:
		set the Kermeta package 'Base Package' to 'fr.irisa.triskell'
		set the Kermeta package 'Prefix' to 'Km'
	d) Through the Properties of kermeta.genmodel:
		set the parameter 'notify' of ParameterizedType.typeDefinition to 'true'
	e) 'Generate Model Code', 'Generate Edit Code', 'Generate Editor Code' from  kermeta.genmodel

3) Check that java source code generated in src/java compiles correctly

4) Generate the model_kermeta.jar in the dist directory that include build/class compiled classes from model_kermeta.jardesc

5) Deploy it into all the projects with deploy_jar_build.xml


History :
---------
$Log: not supported by cvs2svn $
Revision 1.12  2006/10/23 16:55:58  cfaucher
It is better to use the name kermeta.genmodel than kermeta_java.genmodel.
The value of the property : "name of the model" is automatically right (== "Kermeta")

Revision 1.11  2006/10/23 15:40:50  cfaucher
Added the "Control" option in the reflexive in order to split km model.

Revision 1.10  2006/07/28 12:20:47  cfaucher
Addition : at step 2, d) set the name of the prefix property
d) becomes e)

Revision 1.9  2006/05/04 15:40:07  jmottu
added support for constraints in kermeta

Revision 1.8  2006/03/16 10:38:58  jmottu
improvement

Revision 1.7  2006/03/03 15:22:58  dvojtise
Refactoring of Kermeta metamodel (removed the F prefix) (merge of the refactoring branch)

Revision 1.6  2005/04/18 09:03:23  dvojtise
small clarification in the procedure

Revision 1.5  2005/04/04 15:19:48  zdrey
was not perfectly clear

Revision 1.4  2005/02/18 14:57:41  zdrey
add tiny info to tell how to launch ecore_build.xml

Revision 1.3  2005/02/17 08:47:18  ffleurey
Initial revision

Revision 1.2  2005/02/16 11:29:28  ffleurey
Initial version

Revision 1.1  2005/02/16 10:29:56  ffleurey
Initial revision

