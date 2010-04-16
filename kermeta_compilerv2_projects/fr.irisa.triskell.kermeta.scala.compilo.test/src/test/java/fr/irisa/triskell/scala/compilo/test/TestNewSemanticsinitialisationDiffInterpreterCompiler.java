package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestNewSemanticsinitialisationDiffInterpreterCompiler extends TestCompiloCases{
	@Test
	public void testNewSemanticsinitialisationDiffInterpreterCompiler() {
		process(this.getClass().getResource("/NewSemantics").getPath()
				+ "/initialisationDiffInterpreterCompiler");
	}
}