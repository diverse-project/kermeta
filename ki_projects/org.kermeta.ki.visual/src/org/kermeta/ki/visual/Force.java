package org.kermeta.ki.visual;

public class Force {	
	protected double x;
	
	protected double y;
	
	
	public Force() {
		x = 0.;
		y = 0.;
	}
	
	public Force(final double x2, final double y2) {
		x = x2;
		y = y2;
	}
	
	
	public Force addForces(final Force f) {
		return new Force(x + f.x, y + f.y);
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	
	public void setX(final double x2) { x = x2; }
	public void setY(final double y2) { y = y2; }
	
	@Override
	public String toString() {
		return super.toString() + "[" + x + ", " + y + "]";
	}
}
