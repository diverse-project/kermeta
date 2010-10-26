package org.kermeta.ki.diagram.view.test;

import java.awt.geom.PathIterator;

import junit.framework.TestCase;

import org.junit.Test;
import org.kermeta.ki.diagram.view.interfaces.IView;

public abstract class TestIView extends TestCase {
	
	protected IView view;
	
	@Test
	public void testNotNullBoundView() {
		assertNotNull(view.getBoundPath());
	}
	
	@Test
	public void testNotNullPath() {
		assertNotNull(view.getPath());
	}
	
	@Test
	public void testValidPath() {
		PathIterator pi = view.getPath().getPathIterator(null);
		
		assertFalse(pi.isDone());
		assertTrue(pi.currentSegment(new double[6])==PathIterator.SEG_MOVETO);
	}
	
	@Test
	public void testValidBoundPath() {
		PathIterator pi = view.getBoundPath().getPathIterator(null);
		
		assertFalse(pi.isDone());
		assertTrue(pi.currentSegment(new double[6])==PathIterator.SEG_MOVETO);
	}
}
