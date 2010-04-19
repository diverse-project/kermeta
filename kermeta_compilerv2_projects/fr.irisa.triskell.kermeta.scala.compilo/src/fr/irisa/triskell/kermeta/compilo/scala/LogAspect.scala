package fr.irisa.triskell.kermeta.compilo.scala

import org.slf4j.{Logger,LoggerFactory}

trait LogAspect {
	//val log1 = LoggerFactory.getLogger(this.getClass())

	def log = LoggerFactory.getLogger(this.getClass())
	
}
