package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TesttestEcore014_AspectOnKM extends TestCompiloCases{
	@Test
	public void testtestEcore014_AspectOnKM() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/014_AspectOnKM");
	}
}