package org.kermeta.kompren.diagram.view.impl;

public class Plan {
	protected Line lowestLine;

	protected Line highestLine;


	public Plan(final Line l1, final Line l2) {
		super();

		if(l1==null || l2==null)
			throw new IllegalArgumentException(l1 + " " + l2);

		if(!l1.isParallel(l2))
			throw new IllegalArgumentException(l1.getA() + " " + l2.getA());

		final boolean vertical = l1.isVerticalLine();

		if(vertical && l1.getX1()>l2.getX1() || !vertical && l1.getB()>l2.getB()) {
			lowestLine  = l2;
			highestLine = l1;
		} else {
			lowestLine  = l1;
			highestLine = l2;
		}
	}


	public boolean contains(final double x, final double y) {
		boolean contains;

		if(lowestLine.isVerticalLine())
			contains = x<=highestLine.getX1() && x>=lowestLine.getX1();
		else
			if(lowestLine.isHorizontalLine())
				contains = y<=highestLine.getY1() && y>=lowestLine.getY1();
			else
				contains = y<=highestLine.getA()*x+highestLine.getB() && y>=lowestLine.getA()*x+lowestLine.getB();

		return contains;
	}
}
