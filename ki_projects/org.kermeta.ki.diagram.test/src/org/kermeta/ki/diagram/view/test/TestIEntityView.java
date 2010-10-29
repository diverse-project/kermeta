package org.kermeta.ki.diagram.view.test;

import org.junit.Before;
import org.junit.Test;
import org.kermeta.ki.diagram.view.interfaces.IAnchor;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public abstract class TestIEntityView extends TestIComponentView {

	protected IEntityView entity;
	
	protected IEntityView entity2;
	
	protected IRelationView relation;
	
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		entity = (IEntityView) view;
	}
	
	
	@SuppressWarnings("null")
	public void anchorRelationSettings(double x1, double x2, double y1, double y2, boolean atEnd) {
		entity.move(x1, y1);
		entity2.move(x2, y2);
		
		for(IAnchor anchor : entity.getAnchors())
			anchor.setFree(true);
		for(IAnchor anchor : entity2.getAnchors())
			anchor.setFree(true);
		
		entity.anchorRelation(relation, entity2, atEnd);
		IAnchor anchorUsed = null;
		
		for(int i=0, size=entity.getAnchors().size(); i<size && anchorUsed==null; i++)
			if(!entity.getAnchors().get(i).isFree())
				anchorUsed = entity.getAnchors().get(i);
		
		assertNotNull(anchorUsed);
		assertEquals(atEnd ? relation.getPointTarget() : relation.getPointSource(), anchorUsed.getPosition());
	}
	
	
	@Test
	public void testAnchorRelation_SamePosition() {
		try {
			anchorRelationSettings(0, 0, 0, 0, true);
			fail();
		}catch(IllegalArgumentException ex) { /* ok */ }
		
		try {
			anchorRelationSettings(Double.NaN, Double.NaN, Double.NaN, Double.NaN, true);
			fail();
		}catch(IllegalArgumentException ex) { /* ok */ }
	}
	
	
	@Test
	public void testAnchorRelation_onTheSameHoziontalLine_Left2Right_atEnd() {
		anchorRelationSettings(200, 300+entity.getWidth(), 200, 200, true);
	}
	
	
	@Test
	public void testAnchorRelation_onTheSameHoziontalLine_Left2Right_atSource() {
		anchorRelationSettings(200, 300+entity.getWidth(), 200, 200, false);
	}
	
	
	@Test
	public void testAnchorRelation_onTheSameHoziontalLine_Right2Left_atEnd() {
		anchorRelationSettings(300+entity2.getWidth(), 200, 200, 200, true);
	}
	
	
	@Test
	public void testAnchorRelation_onTheSameHoziontalLine_Right2Left_atSource() {
		anchorRelationSettings(300+entity2.getWidth(), 200, 200, 200, false);
	}
	
	
	@Test
	public void testName() {
		assertNotNull(entity.getName());
		
		String name = "mynameEntity";
		
		entity.setName(name);
		assertEquals(name, entity.getName());
		name = "";
		entity.setName(name);
		assertEquals(name, entity.getName());
		name = "dfi jh sd";
		entity.setName(name);
		assertEquals(name, entity.getName());
		entity.setName(null);
		assertEquals(name, entity.getName());
	}
}
