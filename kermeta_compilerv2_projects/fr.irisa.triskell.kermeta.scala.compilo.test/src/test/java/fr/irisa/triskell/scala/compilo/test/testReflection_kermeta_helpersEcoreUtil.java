package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testReflection_kermeta_helpersEcoreUtil extends TestCompiloCases{
	@Test
	public void testtestReflection_kermeta_helpersEcoreUtil() {
		process(this.getClass().getResource("/testReflection/kermeta/helpers").getPath()
				+ "/EcoreUtil");
	}
}