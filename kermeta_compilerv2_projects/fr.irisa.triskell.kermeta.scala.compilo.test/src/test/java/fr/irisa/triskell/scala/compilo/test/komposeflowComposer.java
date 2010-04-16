package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class komposeflowComposer extends TestCompiloCases{
	@Test
	public void testkomposeflowComposer() {
		process(this.getClass().getResource("/kompose").getPath()
				+ "/flowComposer");
	}
}