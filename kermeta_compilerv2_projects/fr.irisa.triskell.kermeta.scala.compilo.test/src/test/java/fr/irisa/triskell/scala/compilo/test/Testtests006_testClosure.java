package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests006_testClosure extends TestCompiloCases{
	@Test
	public void testtests006_testClosure() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/006_testClosure");
	}
}