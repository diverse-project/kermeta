package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests005_testExternPackageCall extends TestCompiloCases{
	@Test
	public void testtests005_testExternPackageCall() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testExternPackageCall");
	}
}