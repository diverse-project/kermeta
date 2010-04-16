package fr.irisa.triskell.scala.compilo.test;
 import org.junit.Test;
	public class testGreg_TransfoMetadomoArt_kermetaArt2Metadomo extends TestCompiloCases{
	@Test
	public void testtestGreg_TransfoMetadomoArt_kermetaArt2Metadomo() {
		process(this.getClass().getResource("/testGreg/TransfoMetadomoArt/kermeta").getPath()
				+ "/Art2Metadomo");
	}
}