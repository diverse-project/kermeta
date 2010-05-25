This directory contains a customized version of the UMLProfile2Ecore transformation 
devoted the transformation of the official MARTE profile into an Ecore so that kermeta 
can load and check constraints on MARTE compliant models. 

This transformation worked with the UML profile for MARTE beta1 (MARTE.profile.uml, MARTE_Library.library.uml)
retrieved on April 29th on the CEA Papyrus Website : https://speedy.supelec.fr/Papyrus/svn/Papyrus/ 
Please keep those versions somewhere in the project for debug purposes in cases future versions fail to be translated

Following is the procedure on how to use it:

0) This step is not part of the transformation itself but rather a hack required to adapt the bogus UML profiles that used unique identifiers and hence that only work
on the installation of the profile creators (may work on your installation by pure coincidence).
If you get an exception like : kermeta exception : [kermeta::exceptions::UnregisteredMetamodelException : 3855]
fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException: kermeta exception : [kermeta::exceptions::UnregisteredMetamodelException : 3855]
not able to retrieve the package qualified name from the nsURI of EPackage http://MARTE.MARTE_Foundations/schemas/NFPs/_olhekBBjEd20zIwSLfjspA/11
ie. it complains about a package whose name is compose of a unique ID which is not installed on your configuration.
you can verify that the file is really bogus, because when you open it using the uml tree editor the root package contains many element 
that should not be represented at this level (typically, Unit elements)
Then you need to fix the file to conform to your current MARTE installation. (To Be Continued...)

1) Translate MARTE library. Edit UMLProfile2Ecore.kmt and set the correct path for MARTE_Library.library.uml. The second argument correspond to the name of the ecore file to create :
example : main("platform:/resource/org.kermeta.uml2.profile.marte/model/uml/MARTE.profile.uml", 
				"platform:/resource/org.kermeta.uml2.profile.marte/model/ecore/MARTE.profile.ecore",true)
Be sure that no library is set (trace.isLibNeeded(false)) 

2) Translate the profile itself. Similarly set the good paths of the UML and ecore files. You also have to specify the name of the file created in step 1 as a library
example :	trace.isLibNeeded(true)
			trace.initLibrary("platform:/resource/org.kermeta.uml2.profile.marte/model/ecore/MARTE_Library.library.ecore")
			
3) The generated ecore files rely on the "plugin" versions of UML.ecore and Ecore.ecore (it is not possible for the transformation 
to do otherwise).  This situation can be annoying if your kermeta program require UML and Ecore via NsURIs of the form : 
"http://..../UML" or "http://..../Ecore" because types will clashes and the program won't typecheck. This can be simply be changed
by editing the ecore files vi the textual editor and replacing all "platform:/plugin..." by the good NsURIs. 
Future improvements of this MDK will include an automated way to do this...

4) The log is verbose and not always accurate (debug info). If you want disable it set:
trace.initializeLog(false) -> concerns core of the transformation (Profile.kmt) info about UML elements are converted
log.enableLog(false) -> concerns the main program (file loading, passes...) 

For now, MARTE well-formedness rules are defined on the  UMLMARTE.ecore which corresponds to a hacked and non-generated version of the profile. 
Future improvement will include to update all the constraints (wfr package) so that they require the generated one 
(which can also be a good test of the conversion)

Known issues :

 

Enjoy !

Gilles Perrouin.           