package tests.fr.irisa.triskell.osgi.introspector;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorUtil;
import junit.framework.TestCase;

public class OSGiIntrospectorUtilTests extends TestCase {

	public void testRemoveEOLBlank() {
		File tmpFile;
		try {
			String contentWithoutEOLBlank = "In english, we say : The cat is black.\nIn French, we say : Le chat est noir.";
			tmpFile = File.createTempFile("removeEOLBlank", "tmp");
			BufferedWriter write = new BufferedWriter(new FileWriter(tmpFile));
			write.write(contentWithoutEOLBlank);
			write.flush();
			write.close();		
			
			assertEquals(contentWithoutEOLBlank, OSGiIntrospectorUtil.removeEOLBlank(tmpFile));
			tmpFile.delete();
			
			String contentWithEOLBlank = "In english, we say :\n The cat is black.\nIn French, we say :\n Le chat est noir.";
			tmpFile = File.createTempFile("removeEOLBlank", "tmp");
			write = new BufferedWriter(new FileWriter(tmpFile));
			write.write(contentWithEOLBlank);
			write.flush();
			write.close();
			
			String result = OSGiIntrospectorUtil.removeEOLBlank(tmpFile);
			assertEquals(contentWithoutEOLBlank, result);
			assertFalse(contentWithEOLBlank.equals(result));
			tmpFile.delete();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testAddEntriesFromJar() {
		fail("Not yet implemented");
	}

	public void testListAllEntriesIntoJarFile() {
		fail("Not yet implemented");
	}

	public void testLog() {
		fail("Not yet implemented");
	}

	public void testGetContext() {
		fail("Not yet implemented");
	}

	public void testSetContext() {
		fail("Not yet implemented");
	}

	public void testGetLogger() {
		fail("Not yet implemented");
	}

	public void testSetLogger() {
		fail("Not yet implemented");
	}

	public void testSaveModel() {
		fail("Not yet implemented");
	}

	public void testDisplayLog() {
		fail("Not yet implemented");
	}

	public void testSaveLog() {
		fail("Not yet implemented");
	}

}
