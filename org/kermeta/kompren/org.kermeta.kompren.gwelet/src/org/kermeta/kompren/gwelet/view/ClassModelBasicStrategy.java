package org.kermeta.kompren.gwelet.view;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.kermeta.kompren.diagram.layout.ILayoutStrategy;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

public class ClassModelBasicStrategy implements ILayoutStrategy {
	/** The diagram to layout. */
	protected IModelView diagram;


	public ClassModelBasicStrategy(final IModelView diagram) {
		super();

		setDiagram(diagram);
	}


	@Override
	public void updateLayout() {
		if(diagram==null)
			return ;

		Map<IEntityView, IEntityView> hashMap 	= new IdentityHashMap<IEntityView, IEntityView>();
		List<List<List<IEntityView>>> forest 	= new ArrayList<List<List<IEntityView>>>();
		List<List<IEntityView>> levels;

		for(IEntityView entity : diagram.getEntities())
			if(entity.isVisible())
				hashMap.put(entity, entity);

		List<IEntityView> roots = diagram.getRootEntities();

		while(!roots.isEmpty()) {
			if(hashMap.get(roots.get(0))!=null) {
				levels = new ArrayList<List<IEntityView>>();

				setLevels(roots.get(0), levels, hashMap);
				forest.add(levels);
			}
			roots.remove(0);
		}

		setMetamodelPosition(forest);
		diagram.recentre();
		diagram.relayoutRelations();
		diagram.updatePreferredSize();
		diagram.refresh();
	}



	protected void setMetamodelPosition(final List<List<List<IEntityView>>> forest) {
		Point2D pointMax = new Point2D.Double();

		for(List<List<IEntityView>> subForest : forest)
			if(!subForest.isEmpty())
				setPositions(subForest, 0, pointMax.getX()+110, pointMax);
	}



	protected Rectangle2D setPositions(final List<List<IEntityView>> subForest, final int level, final double x, final Point2D pointMax) {
		Rectangle2D bounds = setLevelPositions(subForest.get(level), x, 0);

		if(subForest.size()>level+1) {
			Rectangle2D rec = setPositions(subForest, level+1, x, pointMax);
			final double gapX = rec.getCenterX()-bounds.getCenterX();
			final double gapY = bounds.getMinY() - rec.getMinY() + bounds.getHeight() + 110;

			for(IEntityView entity : subForest.get(level))
				diagram.translateEntity(entity, gapX, -gapY);

			bounds.setFrame(bounds.getX()+gapX, bounds.getY()-gapY, bounds.getWidth(), bounds.getHeight());
		}

		if(bounds.getMaxX()>pointMax.getX())
			pointMax.setLocation(bounds.getMaxX(), pointMax.getY());

		if(bounds.getMaxY()>pointMax.getY())
			pointMax.setLocation(pointMax.getX(), bounds.getMaxY());

		return bounds;
	}



	protected Rectangle2D setLevelPositions(final List<IEntityView> level, final double x, final double y) {
		Dimension dim 	= new Dimension(0, 0);
		final int size 	= level.size();
		int i			= 0;
		Dimension entityDim;
		IEntityView entity;
		double x2 = x;
		final double gapClass = 110;

		while(i<size) {
			entity    = level.get(i);
			entityDim = entity.getPreferredSize();

			if(entityDim.height>dim.height)
				dim.height = entityDim.height;

			diagram.moveEntity(entity, x2+entityDim.width/2., y+entityDim.height/2.);

			x2 += entityDim.width;
			dim.width += entityDim.width;

			if(i+1<size) {
				dim.width 	+= gapClass;
				x2 			+= gapClass;
			}

			i++;
		}

		return new Rectangle2D.Double(x, y, dim.width, dim.height);
	}



	@Override
	public void setDiagram(final IModelView diagram) {
		this.diagram = diagram;
	}

	@Override
	public IModelView getDiagram() {
		return diagram;
	}



	protected void setLevels(final IEntityView root, final List<List<IEntityView>> levels, final Map<IEntityView, IEntityView> hashMap) {
		if(levels.isEmpty())
			levels.add(new ArrayList<IEntityView>());

		hashMap.remove(root);
		levels.get(0).add(root);
		setLevels(root, levels, 1, hashMap);
	}



	protected void setLevels(final IEntityView entity, final List<List<IEntityView>> levels, final int level, final Map<IEntityView, IEntityView> hashMap) {
		List<IEntityView> subClasses = getDirectSubClasses(entity);

		for(IEntityView subClass : subClasses) {
			if(hashMap.get(subClass)!=null) {
				hashMap.remove(subClass);

				if(levels.size()-1<level)
					levels.add(new ArrayList<IEntityView>());

				levels.get(level).add(subClass);
				setLevels(subClass, levels, level+1, hashMap);
			}
		}
	}



	public List<IEntityView> getDirectSubClasses(final IEntityView entity) {
		if(diagram==null)
			return null;

		List<IEntityView> sub = new ArrayList<IEntityView>();

		for(IRelationView link : diagram.getRelations())
			if(link instanceof InheritanceView && link.getEntityTar()==entity)
				sub.add(link.getEntitySrc());

		return sub;
	}

}
