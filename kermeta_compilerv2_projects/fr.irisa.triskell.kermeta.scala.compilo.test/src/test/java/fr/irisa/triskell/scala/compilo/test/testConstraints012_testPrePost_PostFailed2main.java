package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testConstraints012_testPrePost_PostFailed2main extends TestCompiloCases{
	@Test
	public void testtestConstraints012_testPrePost_PostFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/012_testPrePost_PostFailed2.main");
	}
}