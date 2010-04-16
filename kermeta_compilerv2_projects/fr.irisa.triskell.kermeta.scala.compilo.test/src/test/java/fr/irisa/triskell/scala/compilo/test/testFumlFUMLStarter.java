package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testFumlFUMLStarter extends TestCompiloCases{
	@Test
	public void testtestFumlFUMLStarter() {
		process(this.getClass().getResource("/testFuml").getPath()
				+ "/FUMLStarter");
	}
}