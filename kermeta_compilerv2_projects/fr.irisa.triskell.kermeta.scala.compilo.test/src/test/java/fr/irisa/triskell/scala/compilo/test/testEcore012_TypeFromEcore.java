package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testEcore012_TypeFromEcore extends TestCompiloCases{
	@Test
	public void testtestEcore012_TypeFromEcore() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/012_TypeFromEcore");
	}
}