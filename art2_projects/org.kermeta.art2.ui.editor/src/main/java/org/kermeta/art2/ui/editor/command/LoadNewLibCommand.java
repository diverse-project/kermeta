/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import org.eclipse.emf.common.util.URI;
import org.kermeta.art2.ChannelType;
import org.kermeta.art2.ComponentType;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ChannelTypePanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;

/**
 *
 * @author ffouquet
 */
public class LoadNewLibCommand implements Command {

    private JFileChooser filechooser = new JFileChooser();

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }
    private Art2UIKernel kernel;

    @Override
    public void execute(Object p) {
        filechooser.showOpenDialog(kernel.getModelPanel());
        if (filechooser.getSelectedFile() != null) {
            JarFile jar;
            try {

                jar = new JarFile(filechooser.getSelectedFile().getAbsoluteFile()); //new JarFile(filechooser.getSelectedFile().getAbsoluteFile().toURI().toString());
                kernel.getUifactory().registerLib(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println("lib should have been registered "+filechooser.getSelectedFile().getAbsolutePath());
                JarEntry entry = jar.getJarEntry("ART2-INF/art2Lib.art2");
                if (entry != null) {
                    String path = convertStreamToFile(jar.getInputStream(entry));
                    //kernel.getEditorPanel().loadLib(path);
                    //System.out.println(path);

                    //Load
                    ContainerRoot nroot = Art2XmiHelper.load(path);

                    //Merge
                    kernel.getModelHandler().merge(nroot);

                    //CREATE TEMP FILE FROM ACTUAL MODEL
                    File tempFile = File.createTempFile("art2editorTemp", ".art2");
                    Art2XmiHelper.save(URI.createFileURI(tempFile.getAbsolutePath()).toString(),kernel.getModelHandler().getActualModel());

                    //LOAD MODEL
                    LoadModelCommand loadCmd = new LoadModelCommand();
                    loadCmd.setKernel(kernel);
                    loadCmd.execute(URI.createFileURI(tempFile.getAbsolutePath()).toString());


                    /*
                    kernel.getEditorPanel().getPalette().clear();
                    for (org.kermeta.art2.TypeLibrary ctl : kernel.getModelHandler().getActualModel().getLibraries()) {
                        for (org.kermeta.art2.TypeDefinition ct : ctl.getSubTypes()) {
                            if (ct instanceof ComponentType) {
                                ComponentTypePanel ctp = kernel.getUifactory().createComponentTypeUI((ComponentType) ct);
                                kernel.getEditorPanel().getPalette().addTypeDefinitionPanel(ctp, ctl.getName());
                            }
                            if (ct instanceof ChannelType) {
                                ChannelTypePanel ctp = kernel.getUifactory().createChannelTypeUI((ChannelType) ct);
                                kernel.getEditorPanel().getPalette().addTypeDefinitionPanel(ctp, ctl.getName());
                            }
                        }
                    }
                    kernel.getEditorPanel().doLayout();
                    kernel.getEditorPanel().repaint();
                    kernel.getEditorPanel().revalidate();
*/


                }
            } catch (IOException ex) {
                Logger.getLogger(LoadNewLibCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String convertStreamToFile(InputStream inputStream) throws IOException {
        Random rand = new Random();
        File temp = File.createTempFile("art2loaderLib" + rand.nextInt(), ".xmi");
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
