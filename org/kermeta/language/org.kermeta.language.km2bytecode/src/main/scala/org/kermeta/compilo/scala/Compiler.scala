package org.kermeta.compilo.scala
 
import org.kermeta.compilo.scala.rich._
import _root_.k2.utils.ReflexivityLoader
import scala.collection.JavaConversions._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.visitor._
import org.kermeta.compilo.scala.visitor.impl.VisitorAsyncUtility
import org.kermeta.compilo.scala.visitor.impl._
import java.util.concurrent.TimeUnit
import java.util.concurrent.Executors
import java.io.File
import org.kermeta.compilo.scala.rich.RichAspectImplicit._
import org.k2.compilo.scala.loader.LoadModelHelper

class Compiler extends LogAspect {

    def compile(url : java.lang.String){
        log.debug("Cleaning Output Step")
        Util.cleanFolder(GlobalConfiguration.outputFolder)
        /* Init Factory Step */
        var t: LoadModelHelper = new LoadModelHelper()
        BehaviorPackage.eINSTANCE.setEFactoryInstance(new RichBehaviorFactoryImpl())
        StructurePackage.eINSTANCE.setEFactoryInstance(new RichStructureFactoryImpl())
        Util.threadExecutor = Executors.newCachedThreadPool() /* Init new Thread Pool */

        /* Loading Model KM Step */
        var startTime = System.currentTimeMillis
        var v : IVisitable = t.loadKM(url).asInstanceOf[IVisitable] /* Load KM Model */

        //println(GlobalConfiguration.outputFolder)
        var fi  = new File(url);
        var fo =  new File(GlobalConfiguration.outputFolder +File.separator+".."+File.separator + "resources").getCanonicalFile
        fo.mkdirs
        fo = new File(GlobalConfiguration.outputFolder  +File.separator+".."+File.separator + "resources"+File.separator +"Reflexivity.km" ).getCanonicalFile
        if (fo.exists)
            fo.delete
       
        
            
        fo.createNewFile
        ReflexivityLoader.copyFile(fi, fo);
        var midTime= System.currentTimeMillis() - startTime
        log.info("Loading KM model step complete in "+(midTime)+" millisecondes ")
        startTime = System.currentTimeMillis
        /* Target Model Aspect Generation */
        var visitorAspect = new ScalaAspectVisitor

        
        var futur = VisitorAsyncUtility.runAfterCallback(v,visitorAspect)
        /* Utility Files & Factory Generation */
        var visitorImplicitFactory = new ScalaFactoryAndImplicitVisitor
        VisitorAsyncUtility.runAfter(v,visitorImplicitFactory)

        /* Synchronisation Step */
        futur.get /* Waiting for ScalaAspectVisitor finish submit subtask before close pool ()  */
        Util.threadExecutor.shutdown /* Send ended signal to pool */
        Util.threadExecutor.awaitTermination(600,TimeUnit.SECONDS) /* Waiting for all tasks finished */
        /* End step */
        var endTime= System.currentTimeMillis() - startTime
        log.info("Compilation step complete in "+(endTime)+" millisecondes ")
        //CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)

    }

}
