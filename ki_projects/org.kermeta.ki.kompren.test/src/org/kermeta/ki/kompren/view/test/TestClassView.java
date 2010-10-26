package org.kermeta.ki.kompren.view.test;

import org.junit.Before;
import org.kermeta.ki.diagram.view.test.TestIEntityView;
import org.kermeta.ki.kompren.view.ClassView;

public class TestClassView extends TestIEntityView {
	@Override
	@Before
	public void setUp() {
		view = new ClassView("name");
		super.setUp();
	}
}
