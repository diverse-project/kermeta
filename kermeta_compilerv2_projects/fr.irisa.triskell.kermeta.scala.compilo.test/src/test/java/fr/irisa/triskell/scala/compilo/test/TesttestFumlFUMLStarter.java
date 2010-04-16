package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TesttestFumlFUMLStarter extends TestCompiloCases{
	@Test
	public void testtestFumlFUMLStarter() {
		process(this.getClass().getResource("/testFuml").getPath()
				+ "/FUMLStarter");
	}
}