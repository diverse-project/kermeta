package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class perfsAntWorldSimulator extends TestCompiloCases{
	@Test
	public void testperfsAntWorldSimulator() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/AntWorldSimulator");
	}
}