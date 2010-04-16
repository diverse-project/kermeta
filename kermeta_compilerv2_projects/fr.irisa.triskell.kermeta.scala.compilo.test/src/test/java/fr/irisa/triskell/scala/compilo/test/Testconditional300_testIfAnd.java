package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testconditional300_testIfAnd extends TestCompiloCases{
	@Test
	public void testconditional300_testIfAnd() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/300_testIfAnd");
	}
}