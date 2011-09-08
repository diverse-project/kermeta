package k2.exceptions

object KerRichFactory {
 def createException : Exception = { new Throwable with Exception }
 def createConstraintViolatedInvException : ConstraintViolatedInv = { new Throwable("ConstraintViolatedInvException") with ConstraintViolatedInv  }
 def createNotImplementedException : NotImplementedException = { new Throwable("NotImplementedException") with NotImplementedException  }
  def createCallOnVoidTarget:CallOnVoidTarget= {new Throwable("CallOnVoidTarget") with CallOnVoidTarget }
}

 