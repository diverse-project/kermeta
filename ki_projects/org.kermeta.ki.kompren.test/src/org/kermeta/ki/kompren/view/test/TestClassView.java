package org.kermeta.ki.kompren.view.test;

import org.junit.Before;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.test.TestIEntityView;
import org.kermeta.ki.kompren.view.ClassView;
import org.kermeta.ki.kompren.view.InheritanceView;

public class TestClassView extends TestIEntityView {
	@Override
	@Before
	public void setUp() {
		view = new ClassView("name");
		entity2 = new ClassView("class2");
		relation = new InheritanceView((IEntityView) view, entity2);
		super.setUp();
	}
}
