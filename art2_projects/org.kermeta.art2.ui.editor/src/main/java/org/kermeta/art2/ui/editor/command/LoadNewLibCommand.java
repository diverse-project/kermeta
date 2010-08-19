/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor.command;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Random;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;
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
                jar = new JarFile(filechooser.getSelectedFile().getAbsolutePath());
                JarEntry entry = jar.getJarEntry("ART2-INF/art2Lib.art2");
                if (entry != null) {
                    String path = convertStreamToFile(jar.getInputStream(entry));
                    //kernel.getEditorPanel().loadLib(path);



                    ContainerRoot nroot = Art2XmiHelper.load(path);
                    kernel.getModelHandler().merge(nroot);
                    kernel.getEditorPanel().getPalette().clear();
                    for (org.kermeta.art2.ComponentTypeLibrary ctl : kernel.getModelHandler().getActualModel().getLibraries()) {
                        for (org.kermeta.art2.ComponentType ct : ctl.getSubComponentTypes()) {
                            ComponentTypePanel ctp = kernel.getUifactory().createComponentTypeUI(ct);
                            kernel.getEditorPanel().getPalette().addComponentTypePanel(ctp, ctl.getName());
                        }
                    }
                    kernel.getEditorPanel().doLayout();
                    kernel.getEditorPanel().repaint();
                    kernel.getEditorPanel().revalidate();



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
        return temp.getAbsolutePath();
    }
}
