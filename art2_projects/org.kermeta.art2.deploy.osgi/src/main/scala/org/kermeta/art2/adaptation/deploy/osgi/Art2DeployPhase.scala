/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi

import org.kermeta.art2.adaptation.deploy.osgi.command.PrimitiveCommand
import org.slf4j.LoggerFactory

class Art2DeployPhase {

  var logger = LoggerFactory.getLogger(this.getClass);

  var executed : List[PrimitiveCommand] = List()

  def rollback={
    executed.reverse.foreach(c=>{
        try{
          c.undo
        } catch {
          case _ @ e => logger.error("ART2 PHase ROLLBACK !!!! DEPLOYERROR="+e);
        }
      })
    executed = List()
  }

  def phase(cmds: List[PrimitiveCommand],desc:String,autostart:Boolean):Boolean = {
    logger.info(desc+"="+cmds.size)
    var intermediate = cmds.forall(c=> {
        try{ c.execute } catch {
          case _ @ e => logger.error("ART2 DEPLOY ERROR=",e);false
        }
      })

    if(intermediate && autostart){
      intermediate = cmds.forall(c=> {
          try{
            c.getLastExecutionBundle match {
              case None => false
              case Some(b) => b.start;true
            }
          } catch {
            case _ @ e => logger.error("ART2 START ERROR="+e);false
          }
        })
    }
    if(!intermediate){
      cmds.foreach(c=>{
          try{
            c.undo
          } catch {
            case _ @ e => logger.error("ART2 PHase ROLLBACK !!!! DEPLOYERROR="+e);
          }
        })
    }
    executed = executed ++ cmds
    logger.info("Result : "+intermediate)
    intermediate
  }

}
