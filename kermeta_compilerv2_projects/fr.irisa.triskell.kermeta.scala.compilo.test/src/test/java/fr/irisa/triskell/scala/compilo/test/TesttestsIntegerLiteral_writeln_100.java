package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TesttestsIntegerLiteral_writeln_100 extends TestCompiloCases{
	@Test
	public void testtestsIntegerLiteral_writeln_100() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/IntegerLiteral_writeln_100");
	}
}