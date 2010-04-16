package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class prunerTestCollection extends TestCompiloCases{
	@Test
	public void testprunerTestCollection() {
		process(this.getClass().getResource("/pruner").getPath()
				+ "/TestCollection");
	}
}