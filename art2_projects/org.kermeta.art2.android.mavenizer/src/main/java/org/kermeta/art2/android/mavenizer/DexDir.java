/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.android.mavenizer;

/**
 *
 * @author ffouquet
 */
public class DexDir {

    public static void main(String[] args) {
        System.out.println("Android mavenizer");
        if (args.length == 5) {
            try {
                String adbPath = args[0];
                String dxPath = args[1];
                String aaptPath = args[2];
                String path = args[3];
                String dir = args[4];

                
                DexUploadMojo mojo = new DexUploadMojo(adbPath, dxPath, aaptPath, path,dir);
                mojo.exec();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Uncorrect parameter");
        }
    }
}
