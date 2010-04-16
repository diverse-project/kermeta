package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestLoadSaveKm000HelloWorld extends TestCompiloCases{
	@Test
	public void testLoadSaveKm000HelloWorld() {
		process(this.getClass().getResource("/LoadSaveKm").getPath()
				+ "/000HelloWorld");
	}
}