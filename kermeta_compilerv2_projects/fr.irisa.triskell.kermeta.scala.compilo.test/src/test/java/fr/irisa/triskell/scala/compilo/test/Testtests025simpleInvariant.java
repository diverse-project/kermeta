package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests025simpleInvariant extends TestCompiloCases{
	@Test
	public void testtests025simpleInvariant() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/025simpleInvariant");
	}
}