package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class tests075_PropertyEqualityUsingEnummain extends TestCompiloCases{
	@Test
	public void testtests075_PropertyEqualityUsingEnummain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/075_PropertyEqualityUsingEnum.main");
	}
}