package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests068_testVariableInitmain extends TestCompiloCases{
	@Test
	public void testtests068_testVariableInitmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/068_testVariableInit.main");
	}
}