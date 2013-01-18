package org.kermeta.compilo.scala.visitor.impl

import org.kermeta.compilo.scala.visitor._
import org.kermeta.compilo.scala._
import java.util.concurrent.Future

class VisitorAsync extends IVisitorAsync with LogAspect {

  var initValue: IVisitable = _
  var visitorValue: IVisitor = _

  def init(init: IVisitable, visitor: IVisitor) {
    initValue = init
    visitorValue = visitor
  }

  def run {
    try {
      visitorValue.init()
      initValue.accept(visitorValue)
      visitorValue.close()
    } catch {
      case e: Throwable =>
        log.error("Problem in async visitor " + visitorValue + " : " + e.getMessage(), e)
        println("Problem in async visitor " + visitorValue + " : " + e.getMessage() + ", " + e.toString())
      case _ =>
    }
  }
}

object VisitorAsyncUtility {

  def runAfter(init: IVisitable, visitor: IVisitor) {
    var runnable = new VisitorAsync
    runnable.init(init, visitor)
    Util.threadExecutor.execute(runnable)
  }

  def runAfterCallback(init: IVisitable, visitor: IVisitor) = {
    var runnable = new VisitorAsync
    runnable.init(init, visitor)
    Util.threadExecutor.submit(runnable)
  }

}