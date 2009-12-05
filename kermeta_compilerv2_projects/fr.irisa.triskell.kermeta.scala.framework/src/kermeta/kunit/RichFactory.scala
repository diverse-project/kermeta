package kermeta.kunit
object RichFactory extends  KunitImplicitConversion{
// def createMain : kermeta.kunit.Main = { new kermeta.kunit.RichMain }
 def createInvalidTestCaseNameException : kermeta.kunit.InvalidTestCaseNameException = { new kermeta.kunit.RichInvalidTestCaseNameException }
 def createInvalidParameterException : kermeta.kunit.InvalidParameterException = { new kermeta.kunit.RichInvalidParameterException }
 def createLog : kermeta.kunit.Log = { new kermeta.kunit.RichLog }
 def createFailure : kermeta.kunit.Failure = { new kermeta.kunit.RichFailure }
 def createError : kermeta.kunit.Error = { new kermeta.kunit.RichError }
 def createTestSuite : kermeta.kunit.TestSuite = { new kermeta.kunit.RichTestSuite }
 def createTestRunner : kermeta.kunit.TestRunner = { new kermeta.kunit.RichTestRunner }
 def createAssertionFailedError : kermeta.kunit.AssertionFailedError = { new kermeta.kunit.RichAssertionFailedError }
 def createAssert : kermeta.kunit.Assert = { new kermeta.kunit.RichAssert }}

