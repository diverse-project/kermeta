package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestexceptionRaise_differentExceptionTypes_202 extends TestCompiloCases{
	@Test
	public void testexceptionRaise_differentExceptionTypes_202() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Raise_differentExceptionTypes_202");
	}
}