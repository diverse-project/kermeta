package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests011_testBenchmarkmain extends TestCompiloCases{
	@Test
	public void testtests011_testBenchmarkmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/011_testBenchmark.main");
	}
}