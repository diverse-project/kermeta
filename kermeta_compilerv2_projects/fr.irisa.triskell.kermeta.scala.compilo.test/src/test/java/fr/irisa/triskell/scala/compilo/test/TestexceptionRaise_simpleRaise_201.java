package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestexceptionRaise_simpleRaise_201 extends TestCompiloCases{
	@Test
	public void testexceptionRaise_simpleRaise_201() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Raise_simpleRaise_201");
	}
}