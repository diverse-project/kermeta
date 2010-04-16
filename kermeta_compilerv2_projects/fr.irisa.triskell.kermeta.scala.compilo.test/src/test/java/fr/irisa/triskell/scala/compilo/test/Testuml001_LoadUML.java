package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testuml001_LoadUML extends TestCompiloCases{
	@Test
	public void testuml001_LoadUML() {
		process(this.getClass().getResource("/uml").getPath()
				+ "/001_LoadUML");
	}
}