package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TestprunermetamodelPruner extends TestCompiloCases{
	@Test
	public void testprunermetamodelPruner() {
		process(this.getClass().getResource("/pruner").getPath()
				+ "/metamodelPruner");
	}
}