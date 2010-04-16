package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests015_testAttributesmain extends TestCompiloCases{
	@Test
	public void testtests015_testAttributesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/015_testAttributes.main");
	}
}