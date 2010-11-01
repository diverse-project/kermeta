/* $Id: $
 * Project    : org.kermeta.art2.ui.editor
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 nov. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */

package org.kermeta.art2.ui.editor.command;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;

public class RefreshLibCommand implements Command {

	public void setKernel(Art2UIKernel kernel) {
		this.kernel = kernel;
	}

	private Art2UIKernel kernel;

	//TODO factorize loading model cause it's actually a double with execute() LoadNewLibCommand
	@Override
	public void execute(Object p) {
		// System.out.println("Refresh Lib asked !!!");
		// read the path of registered lib inside an object
		List<String> libs = kernel.getUifactory().getRegisteredLib();
		// load all ART2-INF.. in lib
		for (String url : libs) {
			JarFile jar;
			try {
				File f = new File(url);
				jar = new JarFile(f);
				JarEntry entry = jar.getJarEntry("ART2-INF/art2Lib.art2");
				if (entry != null) {
					String path = convertStreamToFile(jar.getInputStream(entry));
					// kernel.getEditorPanel().loadLib(path);
					// System.out.println(path);

					// Load
					ContainerRoot nroot = Art2XmiHelper.load(path);

					// Merge
					kernel.getModelHandler().merge(nroot);

					// CREATE TEMP FILE FROM ACTUAL MODEL
					File tempFile = File.createTempFile("art2editorTemp",
							".art2");
					Art2XmiHelper.save(URI.createFileURI(
							tempFile.getAbsolutePath()).toString(), kernel
							.getModelHandler().getActualModel());

					// LOAD MODEL
					LoadModelCommand loadCmd = new LoadModelCommand();
					loadCmd.setKernel(kernel);
					loadCmd.execute(URI.createFileURI(
							tempFile.getAbsolutePath()).toString());

					/*
					 * kernel.getEditorPanel().getPalette().clear(); for
					 * (org.kermeta.art2.TypeLibrary ctl :
					 * kernel.getModelHandler().getActualModel().getLibraries())
					 * { for (org.kermeta.art2.TypeDefinition ct :
					 * ctl.getSubTypes()) { if (ct instanceof ComponentType) {
					 * ComponentTypePanel ctp =
					 * kernel.getUifactory().createComponentTypeUI
					 * ((ComponentType) ct);
					 * kernel.getEditorPanel().getPalette()
					 * .addTypeDefinitionPanel(ctp, ctl.getName()); } if (ct
					 * instanceof ChannelType) { ChannelTypePanel ctp =
					 * kernel.getUifactory().createChannelTypeUI((ChannelType)
					 * ct);
					 * kernel.getEditorPanel().getPalette().addTypeDefinitionPanel
					 * (ctp, ctl.getName()); } } }
					 * kernel.getEditorPanel().doLayout();
					 * kernel.getEditorPanel().repaint();
					 * kernel.getEditorPanel().revalidate();
					 */

				}
			} catch (IOException ex) {
				Logger.getLogger(LoadNewLibCommand.class.getName()).log(
						Level.SEVERE, null, ex);
			}

		}
		// load all model according to libs

		//
	}

	//TODO create a helper class to handle this behaviour to avoid double with LoadNewLibCommand
	private String convertStreamToFile(InputStream inputStream)
			throws IOException {
		Random rand = new Random();
		File temp = File.createTempFile("art2loaderLib" + rand.nextInt(),
				".xmi");
		// Delete temp file when program exits.
		temp.deleteOnExit();
		OutputStream out = new FileOutputStream(temp);
		int read = 0;
		byte[] bytes = new byte[1024];
		while ((read = inputStream.read(bytes)) != -1) {
			out.write(bytes, 0, read);
		}
		inputStream.close();
		out.flush();
		out.close();

		return URI.createFileURI(temp.getAbsolutePath()).toString();
	}
}
