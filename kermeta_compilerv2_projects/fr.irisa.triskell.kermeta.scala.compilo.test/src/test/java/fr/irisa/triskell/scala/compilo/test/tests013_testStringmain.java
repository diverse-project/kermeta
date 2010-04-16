package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests013_testStringmain extends TestCompiloCases{
	@Test
	public void testtests013_testStringmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/013_testString.main");
	}
}