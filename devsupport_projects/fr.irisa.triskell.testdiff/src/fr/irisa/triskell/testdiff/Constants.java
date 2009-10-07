package fr.irisa.triskell.testdiff;

public interface Constants {

	// our DOM structure elements
	public static final String TEST_STATUS = "status";  // no status in Ant/JUnit
	public static final String ATTR_STATUS_PASSED = "haspassed";   // no status in Ant/JUnit
	public static final String ATTR_STATUS_FAILURE = "hasfailed";  // no status in Ant/JUnit
	public static final String ATTR_STATUS_ERROR = "haserror";     // no status in Ant/JUnit
	public static final String ATTR_STATUS_IGNORED = "isignored";  // no status in Ant/JUnit
	public static final String ATTR_STATUS_UNKNOWN = "unknown";    // no status in Ant/JUnit
	
	// XML attributes conforming with Ant/JUnit DTD (see XMLConstants.java in Ant source).
	public static final String TESTS_ROOT = "testsuites";  // no event on suites so the root must be a testsuite
	public static final String TEST = "testcase";
	public static final String SUITE = "testsuite";
	public static final String FAILURE = "failure";
	public static final String ERROR = "error";
	public static final String ATTR_NAME = "name";
	public static final String ATTR_CLASS_NAME = "classname";
	public static final String ATTR_METHOD_NAME = "methodname";
	public static final String ATTR_TESTS_COUNT = "tests";
	public static final String ATTR_IGNORED_COUNT = "ignored";
	public static final String ATTR_FAILURES_COUNT = "failures";
	public static final String ATTR_ERRORS_COUNT = "errors";
	public static final String ATTR_TEST_DURATION = "time";
	public static final String ATTR_TOTAL_DURATION = "time";
	public static final String ATTR_FAILURE_TYPE = "type";
	public static final String ATTR_FAILURE_MESSAGE = "message";
	public static final String ATTR_ERROR_TYPE = "type";
	public static final String ATTR_ERROR_MESSAGE = "message";
	
	// attributes for DIFF
	static public final String DIFF_ROOT = "root";
	static public final String DIFF_SUITE_ELEMENT = "suite_element";
	static public final String DIFF_TEST_ELEMENT = "test_element";
	static public final String ATTR_CHANGE = "change";
	static public final String ATTR_CHANGE_UNCHANGED = "always_exists";
	static public final String ATTR_CHANGE_ADDED = "added";
	static public final String ATTR_CHANGE_REMOVED = "removed";
	static public final String ATTR_OLD_STATUS = "old_status";
	static public final String ATTR_CURRENT_STATUS = "current_status";
	static public final String ATTR_REGRESSION_STATUS = "regression_status";
	static public final String ATTR_OLD_DIR = "old_dir";
	static public final String ATTR_CURRENT_DIR = "current_dir";
	public static final String ATTR_DIFF_DATE = "diff_date";
	static public final String ATTR_TESTS_NUM = "tests_number";
	static public final String ATTR_ENHANCEMENT_NUM = "enhancements_number";
	static public final String ATTR_REGRESSIONS_NUM = "regressions_number";
	static public final String ATTR_ADDED_SUITES_NUM = "added_suites_number";
	static public final String ATTR_REMOVED_SUITES_NUM = "removed_suites_number";
	
	// general elements
	static public final String OPENEMBEDD_TESTS_ID = "org.openembedd.tests";
}
