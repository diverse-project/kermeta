#!/bin/tcsh
source /usr/local/env/envjava1.5
#set ant environnment
source /udd/triskell/bin/multiplatform/apache-ant-1.7.0/env_ant.sh
#source /net/usr/local/env/envant
#setenv ANT_HOME /udd/triskell/bin/multiplatform/apache-ant-1.5.4
set path=( $ANT_HOME/bin $path )
#setenv PATH "$PATH:$ANT_HOME/bin" 

setenv ECLIPSE_HOME /local/daily_build/eclipse3.4_with_topcased/eclipse
setenv BUILD_WORKSPACE $WORKSPACE/buildworkspace
setenv EQUINOX_JAR org.eclipse.equinox.launcher_1.0.101.R34x_v20080819.jar
setenv REPORTDIR $WORKSPACE/unittestreports


echo "--------------------------------"
echo " Launch interpreter tests "
echo "--------------------------------"

echo "Enforce uri.map using the file from the test plugin"
cp $WORKSPACE/hudson_scripts/test_Kermeta_interpreter/uri.map $WORKSPACE/src/plugins/fr.irisa.triskell.kermeta.io

cd $WORKSPACE/src/plugins/fr.irisa.triskell.kermeta.tests/
pwd

setenv CLASSPATH  $ANT_HOME/lib/junit.jar:$ANT_HOME/lib/optional.jar
#echo "CLASSPATH = $CLASSPATH"
#which ant
mkdir -p test/junit/reports
ant -f test/junit/test_interpreter_build.xml -Declipse.home=$ECLIPSE_HOME -Dreport.dir=$REPORTDIR -Dcobertura.dir=/udd/triskell/bin/multiplatform/cobertura-1.7/ -Ddot.or.bin=@dot -Ddot.or.buildclass=@dot
