package org.kermeta.language.compiler.aspects

import org.slf4j.{Logger,LoggerFactory}

trait LogAspect {
 
	//val log1 = LoggerFactory.getLogger(this.getClass())
	def log = LoggerFactory.getLogger(this.getClass())
}
