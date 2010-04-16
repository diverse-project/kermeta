package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests005_testOpPkgCallmain extends TestCompiloCases{
	@Test
	public void testtests005_testOpPkgCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testOpPkgCall.main");
	}
}