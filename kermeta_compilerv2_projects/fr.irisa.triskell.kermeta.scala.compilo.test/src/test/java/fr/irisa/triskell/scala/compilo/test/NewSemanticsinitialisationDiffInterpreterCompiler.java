package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class NewSemanticsinitialisationDiffInterpreterCompiler extends TestCompiloCases{
	@Test
	public void testNewSemanticsinitialisationDiffInterpreterCompiler() {
		process(this.getClass().getResource("/NewSemantics").getPath()
				+ "/initialisationDiffInterpreterCompiler");
	}
}