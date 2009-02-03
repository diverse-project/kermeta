$Id: readme.txt,v 1.3 2009-02-03 10:36:30 cfaucher Exp $

Authors: cfaucher
Creation date: 2008-01-09

This plugin contains JET templates from the plugin: "org.eclipse.emf.codegen.ecore"
Feel free to check the differences between them for keeping EMF compatibility.

Important note: just the customized templates should be added in this plugin.

IMPORTANT SINCE EMF2.5: the plugin containing JET Templates: "org.kermeta.compiler.generator.emftemplates/templates/model/AdapterFactoryClass.javajet" could be removed when the EMF bug #253717 will be fixed (https://bugs.eclipse.org/bugs/show_bug.cgi?id=253717).
It seems this bug is now fixed and the fix will be available since EMF2.5. 2 lines in the source code must be modified in order to support the none use of the plugin "org.kermeta.compiler.generator.emftemplates".
Thus go into the Java Class "org.kermeta.compiler/src/org/kermeta/compiler/Compiler.java", method "setGenModelParameters(GenModel)" and search the line with this fixme: "FIXME Compiler-DynamicTemplates-EMF".