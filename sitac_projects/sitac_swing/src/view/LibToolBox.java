package view;

import java.awt.Dimension;
import java.awt.event.MouseMotionListener;

import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import control.Ctrl;
import control.MoyenControl;

public class LibToolBox extends ToolBox implements InternalFrameListener {
	private JInternalFrame frame1;
	private JInternalFrame frame2;
	private JInternalFrame frame3;
	private ShapesLibrary shapes;
	private JDesktopPane desk;
	private final static int DIM = 200;

	public LibToolBox(Ctrl c, MoyenControl moyenCtrl) {
		frame1 = new JInternalFrame("Engines", false, false, false, true);
		frame2 = new JInternalFrame("Shapes", false, false, false, true);
		frame3 = new JInternalFrame("Tools", false, false, false, true);
		desk = new JDesktopPane();
		desk.setDesktopManager(new ImmovableDesktopManager());

		JPanel symbols = new SymbolsLibrary(moyenCtrl);
		symbols.setPreferredSize(new Dimension(DIM, 10*DIM));
		JScrollPane scroll = new JScrollPane(symbols,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame1.getContentPane().add(scroll);
		frame1.setBounds(0, 0, DIM, DIM);
		frame1.setVisible(true);
		frame1.addInternalFrameListener(this);

		shapes = new ShapesLibrary(c);
		shapes.setPreferredSize(new Dimension(DIM, DIM));
		scroll = new JScrollPane(shapes,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame2.getContentPane().add(scroll);
		frame2.setBounds(0, DIM, DIM, DIM);
		frame2.setVisible(true);
		frame2.addInternalFrameListener(this);

		JPanel remove = new RemoveLibrary(c);
		remove.setPreferredSize(new Dimension(DIM, DIM));
		scroll = new JScrollPane(remove,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame3.getContentPane().add(scroll);
		frame3.setBounds(0, 2 * DIM, DIM, DIM);
		frame3.setVisible(true);
		frame3.addInternalFrameListener(this);

		BasicInternalFrameUI ui = (BasicInternalFrameUI) frame1.getUI();
		JComponent north = ui.getNorthPane();
		MouseMotionListener[] actions = (MouseMotionListener[]) north
				.getListeners(MouseMotionListener.class);
		for (int i = 0; i < actions.length; i++) {
			frame1.removeMouseMotionListener(actions[i]);
		}
		desk.add(frame1);
		desk.add(frame2);
		desk.add(frame3);
		desk.setSize(660, 200);
	}

	public JDesktopPane getDesk() {
		return desk;
	}
	
	public void setDrawLineState(boolean b)
	{
		shapes.setLineBtnSelected(b);
	}
	
	public void setDrawZoneState(boolean b)
	{
		shapes.setZoneBtnSelected(b);
	}

	@Override
	public void internalFrameActivated(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameClosed(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameClosing(InternalFrameEvent e) {
	}

	@Override
	public void internalFrameDeactivated(InternalFrameEvent e) {
	}

	/**Resize the other internal frames when a frame is deiconified**/
	@Override
	public void internalFrameDeiconified(InternalFrameEvent e) {
		JInternalFrame f = (JInternalFrame) e.getSource();
		if (f.equals(frame1)) {
			if (!frame2.isIcon() && !frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM);
				frame2.setBounds(0, DIM, DIM, DIM);
				frame3.setBounds(0, 2 * DIM, DIM, DIM);
			} else if (!frame2.isIcon() && frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM * 3 / 2);
				frame2.setBounds(0, DIM * 3 / 2, DIM, DIM * 3 / 2);
			} else if (frame2.isIcon() && !frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM * 3 / 2);
				frame3.setBounds(0, DIM * 3 / 2, DIM, DIM * 3 / 2);
			} else {
				frame1.setBounds(0, 0, DIM, DIM * 3);
			}
		} else if (f.equals(frame2)) {
			if (!frame1.isIcon() && !frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM);
				frame2.setBounds(0, DIM, DIM, DIM);
				frame3.setBounds(0, 2 * DIM, DIM, DIM);
			} else if (!frame1.isIcon() && frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM * 3 / 2);
				frame2.setBounds(0, DIM * 3 / 2, DIM, DIM * 3 / 2);
			} else if (frame1.isIcon() && !frame3.isIcon()) {
				frame2.setBounds(0, 0, DIM, DIM * 3 / 2);
				frame3.setBounds(0, DIM * 3 / 2, DIM, DIM * 3 / 2);
			} else {
				frame2.setBounds(0, 0, DIM, DIM * 3);
			}

		} else {
			if (!frame1.isIcon() && !frame2.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM);
				frame2.setBounds(0, DIM, DIM, DIM);
				frame3.setBounds(0, 2 * DIM, DIM, DIM);
			} else if (!frame1.isIcon() && frame2.isIcon()) {
				frame1.setBounds(0, 0, DIM, DIM * 3 / 2);
				frame3.setBounds(0, DIM * 3 / 2, DIM, DIM * 3 / 2);
			} else if (frame1.isIcon() && !frame2.isIcon()) {
				frame2.setBounds(0, 0, DIM, DIM * 3 / 2);
				frame3.setBounds(0, DIM * 3 / 2, DIM, DIM * 3 / 2);
			} else {
				frame3.setBounds(0, 0, DIM, DIM * 3);
			}
		}
	}

	/**Resize the other frames when an internal frame is iconified**/
	@Override
	public void internalFrameIconified(InternalFrameEvent e) {
		JInternalFrame f = (JInternalFrame) e.getSource();
		double h = f.getSize().getHeight();
		if (f.equals(frame1)) {
			if (!frame2.isIcon() && !frame3.isIcon()) {
				frame2.setBounds(0, 0, DIM, (int) h / 2 + DIM);
				frame3.setBounds(0, DIM + (int) h / 2, DIM, (int) h / 2 + DIM);
			} else if (!frame2.isIcon() && frame3.isIcon()) {
				frame2.setBounds(0, 0, DIM, 3 * DIM);
			} else if (frame2.isIcon() && !frame3.isIcon()) {
				frame3.setBounds(0, 0, DIM, 3 * DIM);
			}
		} else if (f.equals(frame2)) {
			if (!frame1.isIcon() && !frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, (int) h / 2 + DIM);
				frame3.setBounds(0, DIM + (int) h / 2, DIM, (int) h / 2 + DIM);
			} else if (!frame1.isIcon() && frame3.isIcon()) {
				frame1.setBounds(0, 0, DIM, 3 * DIM);
			} else if (frame1.isIcon() && !frame3.isIcon()) {
				frame3.setBounds(0, 0, DIM, 3 * DIM);
			}
		} else {
			if (!frame1.isIcon() && !frame2.isIcon()) {
				frame1.setBounds(0, 0, DIM, (int) h / 2 + DIM);
				frame2.setBounds(0, DIM + (int) h / 2, DIM, (int) h / 2 + DIM);
			} else if (!frame1.isIcon() && frame2.isIcon()) {
				frame1.setBounds(0, 0, DIM, 3 * DIM);
			} else if (frame1.isIcon() && !frame2.isIcon()) {
				frame2.setBounds(0, 0, DIM, 3 * DIM);
			}
		}
	}

	@Override
	public void internalFrameOpened(InternalFrameEvent e) {
	}

	private static class ImmovableDesktopManager extends DefaultDesktopManager {

		@Override
		public void dragFrame(JComponent f, int x, int y) {
		}
	}
}
