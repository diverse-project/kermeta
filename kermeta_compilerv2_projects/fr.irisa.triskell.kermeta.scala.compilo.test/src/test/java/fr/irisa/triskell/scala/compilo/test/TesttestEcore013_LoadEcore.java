package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TesttestEcore013_LoadEcore extends TestCompiloCases{
	@Test
	public void testtestEcore013_LoadEcore() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/013_LoadEcore");
	}
}