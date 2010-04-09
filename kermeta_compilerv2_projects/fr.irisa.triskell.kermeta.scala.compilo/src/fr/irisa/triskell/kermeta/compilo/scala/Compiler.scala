package fr.irisa.triskell.kermeta.compilo.scala

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import kermeta.utils.ReflexivityLoader
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.loader._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl.VisitorAsyncUtility
import fr.irisa.triskell.kermeta.compilo.scala.visitor.impl._
import java.util.concurrent.TimeUnit
import java.util.concurrent.Executors
import java.io.File
import java.util.concurrent.ExecutorService

class Compiler extends RichAspectImplicit with LogAspect {

    def compile(url : String){
        log.debug("Cleaning Output Step")
        Util.cleanFolder(GlobalConfiguration.outputFolder)
        /* Init Factory Step */
        var t: LoadModelHelper = new LoadModelHelper()
        BehaviorPackage.eINSTANCE.setEFactoryInstance(new RichBehaviorFactoryImpl())
        StructurePackage.eINSTANCE.setEFactoryInstance(new RichStructureFactoryImpl())
        Util.threadExecutor = Executors.newCachedThreadPool() /* Init new Thread Pool */

        /* Loading Model KM Step */
        var startTime = System.currentTimeMillis
        var v : ModelingUnit = t.loadKM(url) /* Load KM Model */

        println(GlobalConfiguration.outputFolder)
        var fi  = new File(url);
        var fo =  new File(GlobalConfiguration.outputFolder +File.separator+".."+File.separator + "resources").getCanonicalFile
        fo.mkdirs
        fo = new File(GlobalConfiguration.outputFolder  +File.separator+".."+File.separator + "resources"+File.separator +"Reflexivity.km" ).getCanonicalFile
        if (fo.exists)
            fo.delete
       
        

        fo.createNewFile
        ReflexivityLoader.copyFile(fi, fo);
        var midTime= System.currentTimeMillis() - startTime
        log.error("Loading KM model step complete in "+(midTime)+" millisecondes ")
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
        log.error("Compilation step complete in "+(endTime)+" millisecondes ")
    }

}
