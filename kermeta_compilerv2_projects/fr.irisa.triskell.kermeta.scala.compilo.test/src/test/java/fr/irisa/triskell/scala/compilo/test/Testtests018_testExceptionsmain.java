package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests018_testExceptionsmain extends TestCompiloCases{
	@Test
	public void testtests018_testExceptionsmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/018_testExceptions.main");
	}
}