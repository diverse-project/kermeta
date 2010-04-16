package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testexception000TestClass extends TestCompiloCases{
	@Test
	public void testexception000TestClass() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/000TestClass");
	}
}