package k2.exceptions

object KerRichFactory {
  def createException : Exception = { new RichException }
  def createRuntimeError:RuntimeError={new RichRuntimeError}
  def createCallOnVoidTarget:CallOnVoidTarget= {new RichCallOnVoidTarget }
  def createTypeCastError:TypeCastError={new RichTypeCastError}
  def createNotImplementedException : NotImplementedException = { new RichNotImplementedException  }
  def createUpperBoundReachedError : UpperBoundReachedError = {new RichUpperBoundReachedError}
  def createAbstractClassInstantiationError : AbstractClassInstantiationError = {new RichAbstractClassInstantiationError}
  def createIncompatibleTypeError : IncompatibleTypeError = {new RichIncompatibleTypeError}
  def createDivisionByZero : DivisionByZero = {new RichDivisionByZero}
  def createOverflowError : OverflowError = {new RichOverflowError}
  def createVoidOperandError : VoidOperandError = {new RichVoidOperandError}
  def createStringIndexOutOfBound : StringIndexOutOfBound = {new RichStringIndexOutOfBound}
  def createStringFormatException : StringFormatException = {new RichStringFormatException}
  def createIndexOutOfBound:IndexOutOfBound={new RichIndexOutOfBound}
  def createEmptyCollection:EmptyCollection = {new RichEmptyCollection}
  def createIteratorIsOff : IteratorIsOff = {new RichIteratorIsOff}
  def createIOException : IOException = {new RichIOException}
  def createFileNotFoundException : FileNotFoundException = {new RichFileNotFoundException}
  def createConstraintViolatedException : ConstraintViolatedException = {new RichConstraintViolatedException}
  def createConstraintViolatedPre : ConstraintViolatedPre = {new RichConstraintViolatedPre}
  def createConstraintViolatedPost : ConstraintViolatedPost = {new RichConstraintViolatedPost}
  def createConstraintViolatedInv : ConstraintViolatedInv = { new  RichConstraintViolatedInv  }
  def createResourceLoadException : ResourceLoadException = {new RichResourceLoadException}
  def createResourceSaveException : ResourceSaveException = {new RichResourceSaveException}
  def createResourceMixedLevelsException : ResourceMixedLevelsException = {new RichResourceMixedLevelsException}
  def createResourceCreateException : ResourceCreateException = {new RichResourceCreateException}
  def createResourceUnconformityException : ResourceUnconformityException = {new RichResourceUnconformityException}
  def createUnregisteredMetamodelException : UnregisteredMetamodelException = {new RichUnregisteredMetamodelException}
  def createDynamicExpressionException : DynamicExpressionException = {new RichDynamicExpressionException}
  def createConstraintsDiagnostic : ConstraintsDiagnostic = {new RichConstraintsDiagnostic}
}

 