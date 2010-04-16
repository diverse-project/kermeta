package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class TesttestGreg_TransfoMetadomoArt_kermetaMetadomo2Art extends TestCompiloCases{
	@Test
	public void testtestGreg_TransfoMetadomoArt_kermetaMetadomo2Art() {
		process(this.getClass().getResource("/testGreg/TransfoMetadomoArt/kermeta").getPath()
				+ "/Metadomo2Art");
	}
}