/*$Id: $
* Project : fr.inria.triskell.testdiff
* File : 	ZipUtil.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 oct. 2009
* Authors : dvojtise
*/

package fr.irisa.triskell.testdiff.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class ZipUtil {
	/**
	 * Extract the readable file within a zipped file.<P>
	 * The zipped archive must embedded an unique file.
	 * 
	 * @param fullZippedFilePath  the physical directory where the file would be found
	 * @param zippedFileName the name of the archive file
	 */
	public static File unzipFile(String fullZippedFileFolderPath, String zippedFileName) throws IOException {

		URL interpreterZipUrl = new URL("file:" + fullZippedFileFolderPath + "/" + zippedFileName);

		ZipInputStream zipFileStream = new ZipInputStream(interpreterZipUrl.openStream());
		zipFileStream.getNextEntry();

		File file = new File(zippedFileName);

		OutputStream os = null;

		try {
			os = new FileOutputStream(file);

			byte[] buffer = new byte[102400];
			while (true) {
				int len = zipFileStream.read(buffer);
				if (zipFileStream.available() == 0)
					break;
				os.write(buffer, 0, len);
			}
		} finally {
			if (null != os) {
				os.close();
			}
		}

		zipFileStream.closeEntry();

		return file;
	}

	/**
	 * Extract the readable file within a zipped file.<P>
	 * The zipped archive must embedded an unique file.
	 * 
	 * @param absoluteZippedFilePath
	 */
	public static File unzipFile(String absoluteZippedFilePath) throws IOException {
		File file = new File(absoluteZippedFilePath);
		
		String fullZippedFileFolderPath = file.getParent();
		String zippedFileName = file.getName();
		
		return unzipFile(fullZippedFileFolderPath, zippedFileName);
	}
}
