package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class exception0001TestException extends TestCompiloCases{
	@Test
	public void testexception0001TestException() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/0001TestException");
	}
}