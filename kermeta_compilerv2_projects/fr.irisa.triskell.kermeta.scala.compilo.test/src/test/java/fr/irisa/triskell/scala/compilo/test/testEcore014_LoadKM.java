package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testEcore014_LoadKM extends TestCompiloCases{
	@Test
	public void testtestEcore014_LoadKM() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/014_LoadKM");
	}
}