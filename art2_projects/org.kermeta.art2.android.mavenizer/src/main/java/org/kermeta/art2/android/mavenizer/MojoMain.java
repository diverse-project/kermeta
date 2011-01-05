package org.kermeta.art2.android.mavenizer;

/**
 * Hello world!
 *
 */
public class MojoMain {

    public static void main(String[] args) {
        System.out.println("Android mavenizer");
        if (args.length == 6) {
            try {
                String dxPath = args[0];
                String aaptPath = args[1];
                String groupId = args[2];
                String jarDirPath = args[3];
                String deployPath = args[4];
                String deployId = args[5];

                Mojo mojo = new Mojo(jarDirPath, dxPath, aaptPath, groupId, deployPath, deployId);
                mojo.exec();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Uncorrect parameter");
        }
    }
}
