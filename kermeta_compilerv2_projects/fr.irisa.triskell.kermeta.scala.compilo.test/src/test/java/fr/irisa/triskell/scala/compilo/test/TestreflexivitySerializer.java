package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestreflexivitySerializer extends TestCompiloCases{
	@Test
	public void testreflexivitySerializer() {
		process(this.getClass().getResource("/reflexivity").getPath()
				+ "/Serializer");
	}
}