package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class prunermetamodelPruner extends TestCompiloCases{
	@Test
	public void testprunermetamodelPruner() {
		process(this.getClass().getResource("/pruner").getPath()
				+ "/metamodelPruner");
	}
}