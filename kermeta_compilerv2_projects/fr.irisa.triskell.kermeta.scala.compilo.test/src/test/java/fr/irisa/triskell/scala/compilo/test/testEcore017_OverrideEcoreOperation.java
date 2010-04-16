package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testEcore017_OverrideEcoreOperation extends TestCompiloCases{
	@Test
	public void testtestEcore017_OverrideEcoreOperation() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/017_OverrideEcoreOperation");
	}
}