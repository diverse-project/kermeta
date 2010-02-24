package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;


public class EventManagerWrapper implements MouseListener, KeyListener, MouseMotionListener, MouseWheelListener, ActionListener {

	public static final String MOUSE_PRESSED 		= "MOUSE_PRESSED";
	
	public static final String MOUSE_RELEASED 		= "MOUSE_RELEASED";
	
	public static final String MOUSE_ENTERED 		= "MOUSE_ENTERED";
	
	public static final String MOUSE_CLICKED 		= "MOUSE_CLICKED";
	
	public static final String MOUSE_MOVED 			= "MOUSE_MOVED";
	
	public static final String MOUSE_DRAGGED 		= "MOUSE_DRAGGED";
	
	public static final String MOUSE_EXITED 		= "MOUSE_EXITED";
	
	public static final String MOUSE_WHEEL_MOVED 	= "MOUSE_WHEEL_MOVED";
	
	public static final String KEY_PRESSED 			= "KEY_PRESSED";
	
	public static final String KEY_RELEASED 		= "KEY_RELEASED";
	
	public static final String KEY_TYPED 			= "KEY_TYPED";
	
	public static final String ACTION_PERFORMED		= "ACTION_PERFORMED";
	
	public static final String EXIT_EVENT			= "EXIT_EVENT";
	
	
	protected List<EventWrapper> events;
	
//	public static final int ID_MOUSE = 0;
//	
//	public static final int ID_KB 	 = 1;
	
	public static final EventManagerWrapper MANAGER = new EventManagerWrapper();
	
	
//	protected Vector<EventHandler> handlers;
	
	
	public EventManagerWrapper() {
		super();
		
		events = new ArrayList<EventWrapper>();
//		handlers = new Vector<EventHandler>();
	}
	

	
	public static RuntimeObject getExitEventString(RuntimeObject self) {
		return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(EXIT_EVENT, self.getFactory());
	}
	
	
	public static RuntimeObject sleep(RuntimeObject self) {
		try {
			int size = MANAGER.events.size();
			int sleep =  size==0 ? 20 : (20/size);
			
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return self;
	}
	
	
	public static RuntimeObject initialise(RuntimeObject self) {
		self.setUserData(MANAGER);
		
		return self;
	}
	
	
	
	public static RuntimeObject isWaiting(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof EventManagerWrapper)
			return ((EventManagerWrapper)obj).isEmpty() ? self.getFactory().getMemory().falseINSTANCE : self.getFactory().getMemory().trueINSTANCE;
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject getTopEvent(RuntimeObject self) {
		RuntimeObject ro = self.getFactory().createObjectFromClassName("kermeta::ki::malai::interaction::event::Event");
		ro.setUserData(MANAGER.getTopEvent());
		
		return ro;
	}
	
	
	
	
	public boolean isEmpty() {
		synchronized(events) {
			return events.isEmpty(); 
		}
	}
	
	
	
	public EventWrapper getTopEvent() {
		if(isEmpty())
			return null;
		
		synchronized(events) { 
			return events.remove(0);
		}
	}
	
	
	
	public void attachTo(JComponent comp) {
		if(comp!=null) {
			comp.addMouseListener(this);
			comp.addMouseMotionListener(this);
			comp.addMouseWheelListener(this);
			comp.addKeyListener(this);
			
			if(comp instanceof AbstractButton)
				((AbstractButton)comp).addActionListener(this);
		}
	}
	
	
	public void detachForm(JComponent comp) {
		if(comp!=null) {
			comp.removeMouseListener(this);
			comp.removeMouseMotionListener(this);
			comp.removeMouseWheelListener(this);
			comp.removeKeyListener(this);
			
			if(comp instanceof AbstractButton)
				((AbstractButton)comp).removeActionListener(this);
		}
	}
	
	
	
	public void attachTo(Component comp) {
		if(comp!=null) {
			comp.addMouseListener(this);
			comp.addMouseMotionListener(this);
			comp.addMouseWheelListener(this);
			comp.addKeyListener(this);
		}
	}
	
	
	
	public void detachForm(Component comp) {
		if(comp!=null) {
			comp.removeMouseListener(this);
			comp.removeMouseMotionListener(this);
			comp.removeMouseWheelListener(this);
			comp.removeKeyListener(this);
		}
	}
	
	

	public void mouseClicked(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(MOUSE_CLICKED, e));
		}
	}

	
	
	public void mouseEntered(MouseEvent e) {
//		synchronized(events) {
//			events.add(new EventWrapper(MOUSE_ENTERED, e));
//		}
	}

	
	
	public void mouseExited(MouseEvent e) {
//		synchronized(events) {
//			events.add(new EventWrapper(MOUSE_EXITED, e));
//		}
	}

	
	
	public void mousePressed(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(MOUSE_PRESSED, e));
		}
//		JOptionPane.showMessageDialog(null, "press");
//		Object src = e.getSource();
//		
//		for(EventHandler handler : handlers)
//			if(handler.matches(src))
//				handler.onPressure(e.getButton(), e.getPoint(), ID_MOUSE);
	}


	
	public void mouseReleased(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(MOUSE_RELEASED, e));
		}
//		Object src = e.getSource();
//		
//		for(EventHandler handler : handlers)
//			if(handler.matches(src))
//			handler.onRelease(e.getButton(), e.getPoint(), ID_MOUSE);		
	}

	
	public void keyPressed(KeyEvent e) {
		events.add(new EventWrapper(KEY_PRESSED, e));
//		Object src = e.getSource();
//		
//		for(EventHandler handler : handlers)
//			if(handler.matches(src))
//			handler.onKeyPressure(e.getKeyCode(), ID_KB);		
	}

	
	public void keyReleased(KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(KEY_RELEASED, e));
		}
//		Object src = e.getSource();
//		
//		for(EventHandler handler : handlers)
//			if(handler.matches(src))
//			handler.onKeyRelease(e.getKeyCode(), ID_KB);
	}

	
	public void keyTyped(KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(KEY_TYPED, e));
		}
	}

	
	public void mouseDragged(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(MOUSE_DRAGGED, e));
		}
//		Object src = e.getSource();
//		
//		for(EventHandler handler : handlers)
//			if(handler.matches(src))
//			handler.onMove(e.getButton(), e.getPoint(), true, ID_MOUSE);			
	}

	
	public void mouseMoved(MouseEvent e) {
//		synchronized(events) {
//			events.add(new EventWrapper(MOUSE_MOVED, e));
//		}
//		Object src = e.getSource();
//		
//		for(EventHandler handler : handlers)
//			if(handler.matches(src))
//			handler.onMove(e.getButton(), e.getPoint(), false, ID_MOUSE);			
	}

	
	public void mouseWheelMoved(MouseWheelEvent e) {
		synchronized(events) {		
			events.add(new EventWrapper(MOUSE_WHEEL_MOVED, e));
		}
	}


	public void actionPerformed(ActionEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(ACTION_PERFORMED, e));
		}
//		Object src = e.getSource();
//		
//		if(src instanceof AbstractButton) {
//			AbstractButton ab = (AbstractButton)e.getSource();
//			
//    		for(EventHandler handler : handlers)
//    			if(handler.matches(src))
//    				handler.onButtonPressed(ab);
//		}
//		else if(src instanceof JTextComponent) {
//			JTextComponent tc = (JTextComponent)e.getSource();
//			
//    		for(EventHandler handler : handlers)
//    			if(handler.matches(src))
//    				handler.onTextChanged(tc);
//		}
	}



	public void onExitEvent() {
		synchronized(events) {
			events.add(new EventWrapper(EXIT_EVENT, null));
		}
	}
}
