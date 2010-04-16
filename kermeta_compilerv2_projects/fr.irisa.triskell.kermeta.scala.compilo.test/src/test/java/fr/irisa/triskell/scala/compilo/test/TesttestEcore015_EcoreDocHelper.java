package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TesttestEcore015_EcoreDocHelper extends TestCompiloCases{
	@Test
	public void testtestEcore015_EcoreDocHelper() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/015_EcoreDocHelper");
	}
}