package k2.exceptions

object KerRichFactory {
 def createException : Exception = { new Throwable with Exception }
 def createConstraintViolatedInvException : ConstraintViolatedInv = { new Throwable("ConstraintViolatedInv") with ConstraintViolatedInv  }
 def createNotImplementedException : NotImplementedException = { new Throwable("NotImplementedException") with NotImplementedException  }
  def createCallOnVoidTarget:CallOnVoidTarget= {new Throwable("CallOnVoidTarget") with CallOnVoidTarget }
  def createEmptyCollection:EmptyCollection = {new Throwable("EmptyCollection") with EmptyCollection}
  def createIndexOutOfBound:IndexOutOfBound={new Throwable("IndexOutOfBound") with IndexOutOfBound}
  def createRuntimeError:RuntimeError={new Throwable("RuntimeError") with RuntimeError}
}

 