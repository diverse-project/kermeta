#/bin/sh
echo "ART2 Starting..."
bootpath=/system/framework/services.jar:/system/framework/ext.jar:/system/framework/framework.jar:/system/framework/core.jar:/data/framework/art2.android.scala.library-2.8.0.jar:/data/framework/art2.android.scala.collection-2.8.0.jar
echo $bootpath
/system/bin/dalvikvm -Xbootclasspath:$bootpath -classpath bin/felix.jar org.apache.felix.main.Main
