package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests010_testLoopmain extends TestCompiloCases{
	@Test
	public void testtests010_testLoopmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/010_testLoop.main");
	}
}