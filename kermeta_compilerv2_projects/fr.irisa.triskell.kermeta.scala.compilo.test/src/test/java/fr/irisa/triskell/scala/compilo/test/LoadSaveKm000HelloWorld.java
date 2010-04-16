package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class LoadSaveKm000HelloWorld extends TestCompiloCases{
	@Test
	public void testLoadSaveKm000HelloWorld() {
		process(this.getClass().getResource("/LoadSaveKm").getPath()
				+ "/000HelloWorld");
	}
}