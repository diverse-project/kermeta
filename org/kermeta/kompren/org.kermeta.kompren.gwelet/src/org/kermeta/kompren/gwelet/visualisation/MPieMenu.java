package org.kermeta.kompren.gwelet.visualisation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.border.Border;

import org.malai.widget.MPanel;

public class MPieMenu extends MPanel {
	private static final long serialVersionUID = 1L;

	protected static final Color BORDER_COLOR = new Color(0, 0, 0, 210);

	protected int diameter;

	protected int thicknessBorder;


	public MPieMenu() {
		super(false, true);
		diameter = 200;
		thicknessBorder = 1;

		setBounds(0, 0, diameter, diameter);
		setLayout(new PieMenuLayout());

		setBorder(new Border() {
			@Override
			public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
				Color oldColor = g.getColor();
		        int i;

		        g.setColor(BORDER_COLOR);

		        for(i = 0; i<thicknessBorder; i++)
	                g.drawOval(x+i, y+i, width-i-i-1, height-i-i-1);
		        g.setColor(oldColor);
			}


			@Override
			public boolean isBorderOpaque() {
				return true;
			}

			@Override
			public Insets getBorderInsets(final Component c) {
				return new Insets(thicknessBorder, thicknessBorder, thicknessBorder, thicknessBorder);
			}
		});
	}


	private void addActionListener(final AbstractButton but) {
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				MPieMenu.this.setVisible(false);
			}
		});
	}



	@Override
	public Component add(final Component comp, final int index) {
		if(comp instanceof AbstractButton)
			addActionListener((AbstractButton)comp);
		return super.add(comp, index);
	}


	@Override
	public void add(final Component comp, final Object constraints, final int index) {
		if(comp instanceof AbstractButton)
			addActionListener((AbstractButton)comp);
		super.add(comp, constraints, index);
	}


	@Override
	public void add(final Component comp, final Object constraints) {
		if(comp instanceof AbstractButton)
			addActionListener((AbstractButton)comp);
		super.add(comp, constraints);
	}


	@Override
	public Component add(final Component comp) {
		if(comp instanceof AbstractButton)
			addActionListener((AbstractButton)comp);
		return super.add(comp);
	}


	@Override
	public Component add(final String name, final Component comp) {
		if(comp instanceof AbstractButton)
			addActionListener((AbstractButton)comp);
		return super.add(name, comp);
	}



	@Override
	public void paint(final Graphics g) {
		final int width = getWidth();
		final int height = getHeight();
		final Graphics2D g2 = (Graphics2D) g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		g.setColor(new Color(192, 192, 192, 210));
		g.fillOval(0, 0, width, height);

		g.setColor(BORDER_COLOR);
		final int centreCircle = 6;
		final int nbComp = getComponentCount();
		final int cx = width/2;
		final int cy = height/2;

		g.fillOval(cx-centreCircle/2, cy-centreCircle/2, centreCircle, centreCircle);

		if(nbComp>1) {
			final double angle = Math.PI*2./nbComp;
			for(int i=0; i<nbComp; i++)
				g.drawLine(cx, cy, (int)(width/2.+width/2.*Math.cos(angle*(i+1.)+Math.PI/2.)), (int)(height/2.+height/2.*Math.sin(angle*(i+1.)+Math.PI/2.)));
		}

		paintBorder(g2);
		paintChildren(g2);
	}


	private class PieMenuLayout implements LayoutManager2 {
		public PieMenuLayout() {
			super();
		}

		@Override
		public void addLayoutComponent(final String name, final Component comp) {
			//
		}

		@Override
		public void removeLayoutComponent(final Component comp) {
			//
		}

		@Override
		public Dimension preferredLayoutSize(final Container parent) {
			return null;
		}

		@Override
		public Dimension minimumLayoutSize(final Container parent) {
			return null;
		}

		@Override
		public void layoutContainer(final Container parent) {
			synchronized(MPieMenu.this.getTreeLock()) {
				final int nbComp = MPieMenu.this.getComponentCount();
				final double angle = Math.PI*2./nbComp;
				final int width = getWidth();
				final int height = getHeight();
				Dimension dim;
				Component comp;

				for(int i=0; i<nbComp; i++) {
					comp = MPieMenu.this.getComponent(i);
					dim = comp.getPreferredSize();
					comp.setSize(dim);

					comp.setBounds(
						(int)(width/2.+width/3.5*Math.cos(angle*(i+1.)+Math.PI/2.+Math.PI/nbComp)-dim.getWidth()/2.),
						(int)(height/2.+height/3.5*Math.sin(angle*(i+1.)+Math.PI/2.+Math.PI/nbComp)-dim.getHeight()/2.),
						(int)dim.getWidth(), (int)dim.getHeight());
				}
			}
		}

		@Override
		public void addLayoutComponent(final Component comp, final Object constraints) {
			//
		}

		@Override
		public Dimension maximumLayoutSize(final Container target) {
			return null;
		}

		@Override
		public float getLayoutAlignmentX(final Container target) {
			return 0;
		}

		@Override
		public float getLayoutAlignmentY(final Container target) {
			return 0;
		}

		@Override
		public void invalidateLayout(final Container target) {
			//
		}
	}
}
