package kermeta.exceptions
object RichFactory {
 def createException : Exception = { new Throwable with Exception }
 
}

 