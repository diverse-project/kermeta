package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class teststoto extends TestCompiloCases{
	@Test
	public void testteststoto() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/toto");
	}
}