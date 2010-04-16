package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class LoadSaveKm0001LoadAndSaveKm extends TestCompiloCases{
	@Test
	public void testLoadSaveKm0001LoadAndSaveKm() {
		process(this.getClass().getResource("/LoadSaveKm").getPath()
				+ "/0001LoadAndSaveKm");
	}
}