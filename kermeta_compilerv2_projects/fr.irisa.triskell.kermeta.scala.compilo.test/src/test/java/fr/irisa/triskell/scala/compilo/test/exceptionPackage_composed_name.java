package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class exceptionPackage_composed_name extends TestCompiloCases{
	@Test
	public void testexceptionPackage_composed_name() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Package_composed_name");
	}
}