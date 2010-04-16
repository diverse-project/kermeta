package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests003_testOpCallmain extends TestCompiloCases{
	@Test
	public void testtests003_testOpCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/003_testOpCall.main");
	}
}