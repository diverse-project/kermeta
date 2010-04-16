package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testreflexivityreflexivity extends TestCompiloCases{
	@Test
	public void testreflexivityreflexivity() {
		process(this.getClass().getResource("/reflexivity").getPath()
				+ "/reflexivity");
	}
}