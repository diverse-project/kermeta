package kermeta.exceptions
object RichFactory {
 def createException : Exception = { new Throwable with Exception }
 def createConstraintViolatedInvException : Exception = { new Throwable with ConstraintViolatedInv  }
 
}

 