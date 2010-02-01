package fr.irisa.triskell.embedded

import java.io.File;

object EmbettedScalaCompiler {
	
	def compile(srcPATH : String, outputPATH : String, cleanOutput : Boolean, jars : List[String]) : Int = {
		/* Cleaning step */
		if(cleanOutput){
			InternalCompilerHelper.deleteDirRecursive(new File(outputPATH))
			new File(outputPATH).mkdir
		}
		/* Src files collect step */
		var listSrcFiles = InternalCompilerHelper.listFile(new File(srcPATH))
		/* Build class path */
		
		var classpath : StringBuilder = new StringBuilder("."+File.pathSeparator)
		
		classpath.append("/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.compilo/target/classes:/home/barais/.m2/repository/org/scala-lang/scala-library/2.8.0.r18462-b20090811081019/scala-library-2.8.0.r18462-b20090811081019.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.model/1.3.0/kermeta.model-1.3.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf/2.5.0/kermeta.emf-2.5.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf.common/2.5.0/kermeta.emf.common-2.5.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf.ecore/2.5.0/kermeta.emf.ecore-2.5.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf.ecore.xmi/2.5.0/kermeta.emf.ecore.xmi-2.5.0.jar:/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.framework/target/classes:/home/barais/.m2/repository/org/scala-lang/scala-library/2.8.0.Beta1-RC1/scala-library-2.8.0.Beta1-RC1.jar:/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.loader/target/classes:/home/barais/.m2/repository/org/slf4j/slf4j-log4j12/1.5.9.RC1/slf4j-log4j12-1.5.9.RC1.jar:/home/barais/.m2/repository/org/slf4j/slf4j-api/1.5.9.RC1/slf4j-api-1.5.9.RC1.jar:/home/barais/.m2/repository/log4j/log4j/1.2.15/log4j-1.2.15.jar:/home/barais/.m2/repository/org/antlr/stringtemplate/3.2.1/stringtemplate-3.2.1.jar:/home/barais/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/home/barais/.m2/repository/org/scala-lang/scala-compiler/2.8.0.r18462-b20090811081019/scala-compiler-2.8.0.r18462-b20090811081019.jar")
		//classpath.append("/opt/eclipse/configuration/org.eclipse.osgi/bundles/275/1/.cp/lib/scala-library.jar:/opt/eclipse/configuration/org.eclipse.osgi/bundles/275/1/.cp/lib/scala-dbc.jar:/opt/eclipse/configuration/org.eclipse.osgi/bundles/275/1/.cp/lib/scala-swing.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.model/1.3.0/kermeta.model-1.3.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf/2.5.0/kermeta.emf-2.5.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf.common/2.5.0/kermeta.emf.common-2.5.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf.ecore/2.5.0/kermeta.emf.ecore-2.5.0.jar:/home/barais/.m2/repository/fr/irisa/triskell/kermeta.emf.ecore.xmi/2.5.0/kermeta.emf.ecore.xmi-2.5.0.jar:/home/barais/workspaces/kermetaCompilerRuntime2/fr.irisa.triskell.kermeta.scala.framework/target/classes:/home/barais/.m2/repository/org/slf4j/slf4j-log4j12/1.5.9.RC1/slf4j-log4j12-1.5.9.RC1.jar:/home/barais/.m2/repository/org/slf4j/slf4j-api/1.5.9.RC1/slf4j-api-1.5.9.RC1.jar:/home/barais/.m2/repository/log4j/log4j/1.2.15/log4j-1.2.15.jar:/home/barais/.m2/repository/org/antlr/stringtemplate/3.2.1/stringtemplate-3.2.1.jar:/home/barais/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar")
			//for(path <- jars) { println(path) ; if (!(path.contains("scala") && path.contains(".m2")) ) classpath.append(path+File.pathSeparator) }
		println(classpath)
		var compilParams = List( "-d",outputPATH,"-classpath",classpath.toString) ++ listSrcFiles
 		System.setProperty("scala.home", "");
		System.setProperty("user.home", "/home/barais");

		/* Compilation step */
		scala.tools.nsc.Main.process(compilParams.toArray)
		return if (scala.tools.nsc.Main.reporter.hasErrors) 1 else 0
	}  
	 

}
