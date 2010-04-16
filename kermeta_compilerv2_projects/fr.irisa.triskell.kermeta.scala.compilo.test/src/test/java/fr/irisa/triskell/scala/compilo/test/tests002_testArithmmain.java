package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests002_testArithmmain extends TestCompiloCases{
	@Test
	public void testtests002_testArithmmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/002_testArithm.main");
	}
}