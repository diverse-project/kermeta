package org.kermeta.ki.malai.examples.canvas.concPres;

public abstract class ShapeUIFactory {
	public static ShapeUI getShapeUIInstance(String classNameKermeta) {
		ShapeUI sh = null;
		
		if("kermeta::ki::malai::examples::Rectangle".equals(classNameKermeta))
			return new RectangleUI();
		if("kermeta::ki::malai::examples::Ellipse".equals(classNameKermeta))
			return new EllipseUI();
		if("kermeta::ki::malai::examples::Polygon".equals(classNameKermeta))
			return new PolygonUI();
		
		return sh;
	}
}
