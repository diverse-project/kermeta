package org.kermeta.kompren.gwelet.ui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

import sun.swing.SwingUtilities2;

public class MPieMenuButtonUI extends BasicButtonUI {

	public static final Color COLOUR = new Color(192, 192, 192, 210);
	public static final Color COLOUR_PRESSED = new Color(192, 90, 90, 150);

	public MPieMenuButtonUI() {
		super();
	}


	@Override
	public void update(final Graphics g, final JComponent c) {
//		Graphics2D g2 = (Graphics2D) g;
//		MPieMenuButton but = (MPieMenuButton) c;
//		ButtonModel model = but.getModel();

//		if(model.isRollover()) {
//			Color formerCol = g2.getColor();
//			g2.setColor(Color.YELLOW);
//			g2.fill(but.getPath());
////			g2.setColor(MPieMenu.BORDER_COLOR);
////			g2.draw(but.getPath());
//			g2.setColor(formerCol);
//		}else {
//			Color formerCol = g2.getColor();
//			g2.setColor(COLOUR);
//			g2.fill(but.getPath());
////			g2.setColor(MPieMenu.BORDER_COLOR);
////			g2.draw(but.getPath());
//			g2.setColor(formerCol);
//		}

		paint(g, c);
	}


	@Override
	protected void paintIcon(final Graphics g, final JComponent c, final Rectangle iconRect){
		MPieMenuButton b = (MPieMenuButton) c;
        Icon icon = b.getIcon();

        if(icon == null) {
           return;
        }

        double width  = b.getWidth();
        double height = b.getHeight();
        double angle = b.getAngle();
        double i = b.getPositionInMenu();
        double nbComp = b.getPieMenu().getComponentCount();
        Icon tmpIcon = null;
        ButtonModel model = b.getModel();
        int x = (int)(width/2.+width/3.2*Math.cos(angle*(i+1.)+Math.PI/2.+Math.PI/nbComp))-icon.getIconWidth()/2;
		int y = (int)(height/2.+height/3.2*Math.sin(angle*(i+1.)+Math.PI/2.+Math.PI/nbComp))-icon.getIconHeight()/2;

        Icon selectedIcon = null;

        /* the fallback icon should be based on the selected state */
        if (model.isSelected()) {
            selectedIcon = b.getSelectedIcon();
            if (selectedIcon != null) {
                icon = selectedIcon;
            }
        }

        if(!model.isEnabled()) {
            if(model.isSelected()) {
               tmpIcon = b.getDisabledSelectedIcon();
               if (tmpIcon == null) {
                   tmpIcon = selectedIcon;
               }
            }

            if (tmpIcon == null) {
                tmpIcon = b.getDisabledIcon();
            }
        } else if(model.isPressed() && model.isArmed()) {
            tmpIcon = b.getPressedIcon();
            if(tmpIcon != null) {
                // revert back to 0 offset
                clearTextShiftOffset();
            }
        } else if(b.isRolloverEnabled() && model.isRollover()) {
            if(model.isSelected()) {
               tmpIcon = b.getRolloverSelectedIcon();
               if (tmpIcon == null) {
                   tmpIcon = selectedIcon;
               }
            }

            if (tmpIcon == null) {
                tmpIcon = b.getRolloverIcon();
            }
        }

        if(tmpIcon != null) {
            icon = tmpIcon;
        }

        if(model.isPressed() && model.isArmed()) {
            icon.paintIcon(c, g, x + getTextShiftOffset(),
                    y + getTextShiftOffset());
        } else {
            icon.paintIcon(c, g, x, y);
        }

}


    @Override
	protected void paintText(final Graphics g, final JComponent c, final Rectangle textRect, final String text) {
    	MPieMenuButton b = (MPieMenuButton) c;
        ButtonModel model = b.getModel();
        FontMetrics fm = SwingUtilities2.getFontMetrics(c, g);
        int mnemIndex = b.getDisplayedMnemonicIndex();

        if(model.isEnabled())
            g.setColor(b.getForeground());
        else
            g.setColor(Color.LIGHT_GRAY);

        double width  = b.getWidth();
        double height = b.getHeight();
        double angle = b.getAngle();
        double i = b.getPositionInMenu();
        double nbComp = b.getPieMenu().getComponentCount();
        int x = (int)(width/2.+width/3.2*Math.cos(angle*(i+1.)+Math.PI/2.+Math.PI/nbComp));
		int y = (int)(height/2.+height/3.2*Math.sin(angle*(i+1.)+Math.PI/2.+Math.PI/nbComp));

        SwingUtilities2.drawStringUnderlineCharAt(c, g, text, mnemIndex, x-fm.stringWidth(text)/2, y + fm.getAscent());
    }


	@Override
	protected void paintButtonPressed(final Graphics g, final AbstractButton b) {
		Graphics2D g2 = (Graphics2D) g;
		MPieMenuButton but = (MPieMenuButton) b;
		Color formerCol = g2.getColor();
		g2.setColor(COLOUR_PRESSED);
		g2.fill(but.getPath());
		g2.setColor(formerCol);
	}


//	@Override
//	protected void paintFocus(final Graphics g, final AbstractButton b, final Rectangle viewRect, final Rectangle textRect, final Rectangle iconRect){
//		MPieMenuButton but = (MPieMenuButton) b;
//		Graphics2D g2 = (Graphics2D) g;
//		Color formerCol = g2.getColor();
//		g2.setColor(Color.PINK);
//		g2.fill(but.getPath());
//		g2.setColor(formerCol);
//	}
}
