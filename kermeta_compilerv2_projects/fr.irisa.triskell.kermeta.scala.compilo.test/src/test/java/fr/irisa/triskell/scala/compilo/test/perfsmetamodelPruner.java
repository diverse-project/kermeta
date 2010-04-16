package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class perfsmetamodelPruner extends TestCompiloCases{
	@Test
	public void testperfsmetamodelPruner() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/metamodelPruner");
	}
}