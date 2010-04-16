package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class perfsHelloWorld extends TestCompiloCases{
	@Test
	public void testperfsHelloWorld() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/HelloWorld");
	}
}