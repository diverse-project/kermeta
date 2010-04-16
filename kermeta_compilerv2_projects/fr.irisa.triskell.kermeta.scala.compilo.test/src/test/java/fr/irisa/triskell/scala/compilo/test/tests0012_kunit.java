package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests0012_kunit extends TestCompiloCases{
	@Test
	public void testtests0012_kunit() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/0012_kunit");
	}
}