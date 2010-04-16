package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestkomposeflowComposer extends TestCompiloCases{
	@Test
	public void testkomposeflowComposer() {
		process(this.getClass().getResource("/kompose").getPath()
				+ "/flowComposer");
	}
}