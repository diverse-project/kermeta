package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests004_testOpOpCallmain extends TestCompiloCases{
	@Test
	public void testtests004_testOpOpCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/004_testOpOpCall.main");
	}
}