$Id: readme.txt,v 1.4 2009-02-16 16:00:59 cfaucher Exp $

Authors: cfaucher
Creation date: 2007-02-20

Warning: this plugin is experimental, that is not required to run Kermeta.

This plugin requires 2 other plugins: org.kermeta.compiler.generator and org.kermeta.generator.

The Generator class must be compared with org.eclipse.emf.codegen.ecore.Generator for keeping EMF compatibility.

All the test cases dedicated to the compiler are available from the plugin: org.kermeta.compiler.tests.

Important note: do not remove the dependency to: org.kermeta.framework.compiler.directives
	/org.kermeta.compiler/src/org/kermeta/compiler/Kmt2KmExporter4Compiler.java needs this plugin