package kermeta.kunit

trait TestCase  extends junit.framework.TestCase{
 
//	var testCase : junit.framework.TestCase;
//	
//		/**
//	 * Asserts that a condition is true. If it isn't it throws
//	 * an AssertionFailedError with the given message.
//	 */
//	def assertTrue(message:String, condition:Boolean) :Any ={
//		if (!condition)
//			fail(message);
//	}
//	/**
//	 * Asserts that a condition is true. If it isn't it throws
//	 * an AssertionFailedError.
//	 */
//	def assertTrue(condition:Boolean):Any = {
//		assertTrue(null, condition);
//	}
//	/**
//	 * Asserts that a condition is false. If it isn't it throws
//	 * an AssertionFailedError with the given message.
//	 */
//	def assertFalse(message:String, condition:Boolean):Any = {
//		assertTrue(message, !condition);
//	}
//	/**
//	 * Asserts that a condition is false. If it isn't it throws
//	 * an AssertionFailedError.
//	 */
//	def assertFalse(condition:Boolean):Any = {
//		assertFalse(null, condition);
//	}
//	/**
//	 * Fails a test with the given message.
//	 */
//	def fail(message:String):Any = {
//		throw new junit.framework.AssertionFailedError(message);
//	}
//	/**
//	 * Fails a test with no message.
//	 */
//	def fail():Any = {
//		fail(null);
//	}
//	/**
//	 * Asserts that two objects are equal. If they are not
//	 * an AssertionFailedError is thrown with the given message.
//	 */
//	def assertEquals(message:String, expected:Object, actual:Object):Any = {
//		if (expected == null && actual == null)
//			return;
//		if (expected != null && expected.equals(actual))
//			return;
//		failNotEquals(message, expected, actual);
//	}
//	/**
//	 * Asserts that two objects are equal. If they are not
//	 * an AssertionFailedError is thrown.
//	 */
//	def assertEquals(expected:Object, actual:Object):Any = {
//	    assertEquals(null, expected, actual);
//	}
//	/**
//	 * Asserts that an object isn't null.
//	 */
//	def assertNotNull(obj:Object):Any = {
//		assertNotNull(null, obj);
//	}
//	/**
//	 * Asserts that an object isn't null. If it is
//	 * an AssertionFailedError is thrown with the given message.
//	 */
//	def assertNotNull(message:String, obj:Object ):Any = {
//		assertTrue(message, obj != null);
//	}
//	/**
//	 * Asserts that an object is null.
//	 */
//	def assertNull(obj:Object ):Any = {
//		assertNull(null, obj);
//	}
//	/**
//	 * Asserts that an object is null.  If it is not
//	 * an AssertionFailedError is thrown with the given message.
//	 */
//	def assertNull(message:String, obj:Object):Any = {
//		assertTrue(message, obj == null);
//	}
//	/**
//	 * Asserts that two objects refer to the same object. If they are not
//	 * an AssertionFailedError is thrown with the given message.
//	 */
//	def assertSame(message:String, expected:Object, actual:Object):Any = {
//		if (expected == actual)
//			return;
//		failNotSame(message, expected, actual);
//	}
//	/**
//	 * Asserts that two objects refer to the same object. If they are not
//	 * the same an AssertionFailedError is thrown.
//	 */
//	def assertSame(expected:Object, actual:Object):Any = {
//	    assertSame(null, expected, actual);
//	}
//	/**
//	 * Asserts that two objects do not refer to the same object. If they do
//	 * refer to the same object an AssertionFailedError is thrown with the
//	 * given message.
//	 */
//	def assertNotSame(message:String, expected:Object, actual:Object):Any = {
//		if (expected == actual)
//			failSame(message);
//	}
//	/**
//	 * Asserts that two objects do not refer to the same object. If they do
//	 * refer to the same object an AssertionFailedError is thrown.
//	 */
//	def assertNotSame(expected:Object, actual:Object):Any = {
//		assertNotSame(null, expected, actual);
//	}
//
//	def failSame(message:String):Any = {
//		var formatted:String = "";
// 		if (message != null)
// 			formatted= message+" ";
// 		fail(formatted+"expected not same");
//	}
//
//	def failNotSame(message:String, expected:Object, actual:Object):Any = {
//		var formatted:String = "";
//		if (message != null)
//			formatted= message+" ";
//		fail(formatted+"expected same:<"+expected+"> was not:<"+actual+">");
//	}
//
//	def failNotEquals(message:String, expected:Object, actual:Object):Any = {
//
//	}
//
//	def format(message:String, expected:Object, actual:Object):String ={
//		var formatted:String = "";
//		if (message != null)
//			formatted= message+" ";
//		return formatted+"expected:<"+expected+"> but was:<"+actual+">";
//	}
//	
//		/**
//	 * the name of the test case
//	 */
//	var fName:String ;
//
//	def countTestCases():Int {
//		return 1;
//	}
//	/**
//	 * Creates a default TestResult object
//	 *
//	 * @see TestResult
//	 */
//	def createResult():TestResult  {
//	    return new TestResult();
//	}
//	/**
//	 * A convenience method to run this test, collecting the results with a
//	 * default TestResult object.
//	 *
//	 * @see TestResult
//	 */
//	public TestResult run() {
//		TestResult result= createResult();
//		run(result);
//		return result;
//	}
//	/**
//	 * Runs the test case and collects the results in TestResult.
//	 */
//	public void run(TestResult result) {
//		result.run(this);
//	}
//	/**
//	 * Runs the bare test sequence.
//	 * @exception Throwable if any exception is thrown
//	 */
//	public void runBare() throws Throwable {
//		Throwable exception= null;
//		setUp();
//		try {
//			runTest();
//		} catch (Throwable running) {
//			exception= running;
//		}
//		finally {
//			try {
//				tearDown();
//			} catch (Throwable tearingDown) {
//				if (exception == null) exception= tearingDown;
//			}
//		}
//		if (exception != null) throw exception;
//	}
//	/**
//	 * Override to run the test and assert its state.
//	 * @exception Throwable if any exception is thrown
//	 */
//	protected void runTest() throws Throwable {
//		assertNotNull(fName); // Some VMs crash when calling getMethod(null,null);
//		Method runMethod= null;
//		try {
//			// use getMethod to get all public inherited
//			// methods. getDeclaredMethods returns all
//			// methods of this class but excludes the
//			// inherited ones.
//			runMethod= getClass().getMethod(fName, (Class[])null);
//		} catch (NoSuchMethodException e) {
//			fail("Method \""+fName+"\" not found");
//		}
//		if (!Modifier.isPublic(runMethod.getModifiers())) {
//			fail("Method \""+fName+"\" should be public");
//		}
//
//		try {
//			runMethod.invoke(this, (Object[])new Class[0]);
//		}
//		catch (InvocationTargetException e) {
//			e.fillInStackTrace();
//			throw e.getTargetException();
//		}
//		catch (IllegalAccessException e) {
//			e.fillInStackTrace();
//			throw e;
//		}
//	}
//	/**
//	 * Sets up the fixture, for example, open a network connection.
//	 * This method is called before a test is executed.
//	 */
//	protected void setUp() throws Exception {
//	}
//	/**
//	 * Tears down the fixture, for example, close a network connection.
//	 * This method is called after a test is executed.
//	 */
//	protected void tearDown() throws Exception {
//	}
//	/**
//	 * Returns a string representation of the test case
//	 */
//	public String toString() {
//	    return getName() + "(" + getClass().getName() + ")";
//	}
//	/**
//	 * Gets the name of a TestCase
//	 * @return returns a String
//	 */
//	public String getName() {
//		return fName;
//	}
//	/**
//	 * Sets the name of a TestCase
//	 * @param name The name to set
//	 */
//	public void setName(String name) {
//		fName= name;
//	}
	
}
