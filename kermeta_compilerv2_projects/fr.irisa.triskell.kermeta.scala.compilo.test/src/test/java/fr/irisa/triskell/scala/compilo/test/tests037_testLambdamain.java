package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests037_testLambdamain extends TestCompiloCases{
	@Test
	public void testtests037_testLambdamain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/037_testLambda.main");
	}
}