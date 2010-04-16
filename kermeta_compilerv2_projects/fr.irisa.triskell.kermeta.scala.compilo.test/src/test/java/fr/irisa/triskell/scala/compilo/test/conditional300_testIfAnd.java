package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class conditional300_testIfAnd extends TestCompiloCases{
	@Test
	public void testconditional300_testIfAnd() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/300_testIfAnd");
	}
}