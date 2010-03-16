package org.kermeta.compiler;

import java.util.ArrayList;
import java.util.Collection;

import org.kermeta.compiler.service.CompilerService;

public class CompilerServiceImpl implements CompilerService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CompilerServiceImpl()
				.compile(
						"/home/barais/workspaces/kermetacvs1009/org.kermeta.compilerv2/000HelloWorld.km",
						"/home/barais/workspaces/kermetacvs1009/org.kermeta.compilerv2/kermetaCompiler.properties",
						"projectName", "className", "operationName",
						new ArrayList<String>(), "args");

	}

	@Override
	public void compile(String kmuri, String propertiesfile,
			String projectName, String classqname, String operationName,
			Collection<String> classpath, String args) {

		// Step 1 Generate Scala
		//try {
			fr.irisa.triskell.kermeta.compilo.scala.Main.init(propertiesfile,
					projectName, classqname, operationName, classpath, args);
			String[] arg = new String[2];
			arg[0] = "-i";
			arg[1] = kmuri;
			//arg[2] = "-nocompile";
			fr.irisa.triskell.kermeta.compilo.scala.Main.main(arg);

			// Step 2 Generate pom.xml

			/*StringTemplateGroup group = new StringTemplateGroup("mygroup");
			StringTemplate st = group.getInstanceOf("templates/pom");
			Properties ps = new Properties();
			
			
			ps.load(new FileInputStream(new File(propertiesfile)));

			String pomuri = ps.getProperty("output.target.folder") + "/pom.xml";
			File pom = new File(pomuri);
			PrintWriter pw = new PrintWriter(pom);
			pw.write(st.toString());
			pw.flush();
			pw.close();*/

			// Step 3 Run maven

			// java -classpath
			// /usr/share/maven2/lib/maven-debian-uber.jar:/usr/share/maven2/boot/classworlds.jar
			// org.apache.maven.cli.compat.CompatibleMain -f
			// ~/NetBeansProjects/fr.irisa.triskell.kermeta.scala.compilo/pom.xml
			// scala:compile package
			/*String[] arg1 = new String[6];
			arg1[0] = "-f";
			arg1[1] = pomuri;
			arg1[2] = "-q";
			arg1[3] = "scala:compile";
			arg1[4] = "package";
			arg1[5] = "scala:run";

			
			org.codehaus.classworlds.ClassWorld classWorld = new org.codehaus.classworlds.ClassWorld( "plexus.core", Thread.currentThread().getContextClassLoader() );
			org.apache.maven.cli.compat.CompatibleMain.main( arg1, classWorld );

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
