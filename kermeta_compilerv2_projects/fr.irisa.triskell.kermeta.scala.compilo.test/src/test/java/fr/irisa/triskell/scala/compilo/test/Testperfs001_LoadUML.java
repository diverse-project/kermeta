package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testperfs001_LoadUML extends TestCompiloCases{
	@Test
	public void testperfs001_LoadUML() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/001_LoadUML");
	}
}