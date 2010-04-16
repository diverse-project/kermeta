package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests017_testSuperFeaturesCallsmain extends TestCompiloCases{
	@Test
	public void testtests017_testSuperFeaturesCallsmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/017_testSuperFeaturesCalls.main");
	}
}