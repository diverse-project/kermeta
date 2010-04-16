package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestprunerTestCollection extends TestCompiloCases{
	@Test
	public void testprunerTestCollection() {
		process(this.getClass().getResource("/pruner").getPath()
				+ "/TestCollection");
	}
}