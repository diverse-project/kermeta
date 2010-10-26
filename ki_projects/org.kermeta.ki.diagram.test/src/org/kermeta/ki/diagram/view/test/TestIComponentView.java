package org.kermeta.ki.diagram.view.test;

import org.junit.Before;
import org.junit.Test;
import org.kermeta.ki.diagram.view.interfaces.IComponentView;

public abstract class TestIComponentView extends TestIView {
	protected IComponentView component;
	
	@Override
	@Before
	public void setUp() {
		component = (IComponentView) view;
	}
	
	
	@Test
	public void testPruningHideComponent() {
		component.onPruning(false);
		assertTrue(component.isVisible());
		component.onPruning(true);
		assertFalse(component.isVisible());
	}
	
	
	@Test
	public void testUnPruningShowComponent() {
		component.onPruning(true);
		component.onUnpruning();
		assertTrue(component.isVisible());
	}
	
	
	@Test
	public void testIsPruned() {
		component.onPruning(true);
		assertTrue(component.isPruned());
		component.onUnpruning();
		assertFalse(component.isPruned());
		component.onPruning(false);
		assertTrue(component.isPruned());
	}
	
	
	@Test
	public void testIsVisible() {
		assertTrue(component.isVisible());
		component.onPruning(true);
		assertFalse(component.isVisible());
		component.onUnpruning();
		assertTrue(component.isVisible());
		component.onPruning(false);
		assertTrue(component.isVisible());
	}
	
	
	@Test
	public void testLineColorNotNull() {
		assertNotNull(component.getLineColor());
		component.updateLineColor(100);
		assertNotNull(component.getLineColor());
	}
	
	
	@Test
	public void testLineColorOpacity() {
		component.updateLineColor(10);
		assertEquals(10, component.getLineColor().getAlpha());
		component.updateLineColor(200);
		assertEquals(200, component.getLineColor().getAlpha());
		try {
			component.updateLineColor(-1);
			fail();
		}catch(IllegalArgumentException e) { /* ok */ }
		try {
			component.updateLineColor(256);
			fail();
		}catch(IllegalArgumentException e) { /* ok */ }
		component.updateLineColor(0);
		assertEquals(0, component.getLineColor().getAlpha());
		component.updateLineColor(255);
		assertEquals(255, component.getLineColor().getAlpha());
	}
	
	
	@Test
	public void testIsVisibility() {
		assertEquals(component.getVisibility(), IComponentView.Visibility.STANDARD);
		component.onPruning(true);
		assertEquals(component.getVisibility(), IComponentView.Visibility.NONE);
		component.onPruning(false);
		assertEquals(component.getVisibility(), IComponentView.Visibility.GRAYED);
	}
	
	
	@Test
	public void testSetVisibility() {
		component.setVisibility(IComponentView.Visibility.STANDARD);
		assertEquals(component.getVisibility(), IComponentView.Visibility.STANDARD);
		component.setVisibility(IComponentView.Visibility.NONE);
		assertEquals(component.getVisibility(), IComponentView.Visibility.NONE);
		component.setVisibility(IComponentView.Visibility.GRAYED);
		assertEquals(component.getVisibility(), IComponentView.Visibility.GRAYED);
		component.setVisibility(null);
		assertEquals(component.getVisibility(), IComponentView.Visibility.GRAYED);
	}
	
	
	
}
