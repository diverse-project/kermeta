package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class Art2DroolsMatcherArt2DROOLSPatternFramework extends TestCompiloCases{
	@Test
	public void testArt2DroolsMatcherArt2DROOLSPatternFramework() {
		process(this.getClass().getResource("/Art2DroolsMatcher").getPath()
				+ "/Art2DROOLSPatternFramework");
	}
}