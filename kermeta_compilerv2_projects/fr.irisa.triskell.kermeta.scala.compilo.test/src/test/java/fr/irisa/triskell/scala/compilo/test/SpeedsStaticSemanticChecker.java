package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class SpeedsStaticSemanticChecker extends TestCompiloCases{
	@Test
	public void testSpeedsStaticSemanticChecker() {
		process(this.getClass().getResource("/Speeds").getPath()
				+ "/StaticSemanticChecker");
	}
}