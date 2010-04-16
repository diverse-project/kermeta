package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Testtests022_InvWithMultipleInheritance extends TestCompiloCases{
	@Test
	public void testtests022_InvWithMultipleInheritance() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/022_InvWithMultipleInheritance");
	}
}