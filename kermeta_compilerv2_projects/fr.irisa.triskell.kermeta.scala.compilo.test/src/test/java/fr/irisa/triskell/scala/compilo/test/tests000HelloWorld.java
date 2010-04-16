package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests000HelloWorld extends TestCompiloCases{
	@Test
	public void testtests000HelloWorld() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/000HelloWorld");
	}
}