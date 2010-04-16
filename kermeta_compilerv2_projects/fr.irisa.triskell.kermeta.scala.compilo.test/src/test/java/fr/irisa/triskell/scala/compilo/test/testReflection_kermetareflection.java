package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testReflection_kermetareflection extends TestCompiloCases{
	@Test
	public void testtestReflection_kermetareflection() {
		process(this.getClass().getResource("/testReflection/kermeta").getPath()
				+ "/reflection");
	}
}