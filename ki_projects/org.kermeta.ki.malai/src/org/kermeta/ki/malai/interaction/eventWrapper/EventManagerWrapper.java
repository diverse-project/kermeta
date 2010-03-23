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

import org.kermeta.ki.malai.dispatcherWrapper.DispatcherWrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * Bridges the gap between a Kermeta EventManager and Java events. This class
 * listens to Java events and notify the Java DispatcherWrapper that an event occurred.
 * @author Arnaud Blouin
 *
 */
public class EventManagerWrapper implements MouseListener, KeyListener, MouseMotionListener, MouseWheelListener, ActionListener {
	/** The dispatcher to notify. */
	protected DispatcherWrapper dispatcher;
	
	/** The events produces by the UI but not yet analysed by the Kermeta EventManager. */
	protected List<EventWrapper> events;
	
	
	
	/**
	 * Initialises an EventManagerWrapper.
	 */
	public EventManagerWrapper() {
		super();
		
		events = new ArrayList<EventWrapper>();
	}
	

	
	/**
	 * Initialises a Kermeta EventManager by encapsulating this EventManagerWrapper
	 * into it.
	 * @param self The Kermeta EventManager.
	 * @param dispatcherRo A Kermeta AbstractDispatcher that contains the Java DispatcherWrapper.
	 * @return The Kermeta EventManager.
	 */
	public static RuntimeObject initialise(RuntimeObject self, RuntimeObject dispatcherRo) {
		EventManagerWrapper emw = new EventManagerWrapper();
		emw.dispatcher 			= (DispatcherWrapper) dispatcherRo.getUserData();
		self.setUserData(emw);

		return self;
	}
	
	
	/**
	 * @param self The Kermeta EventManager that encapsulates the EventManagerWrapper.
	 * @return True if the list of events is not empty.
	 */
	public static RuntimeObject isWaiting(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof EventManagerWrapper)
			return ((EventManagerWrapper)obj).isEmpty() ? self.getFactory().getMemory().falseINSTANCE : self.getFactory().getMemory().trueINSTANCE;
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta EventManager that encapsulates the EventManagerWrapper.
	 * @return The next Kermeta Event to analyse.
	 */
	public static RuntimeObject getTopEvent(RuntimeObject self) {
		// An instance of the Kermeta class Event is created.
		EventManagerWrapper emw = (EventManagerWrapper) self.getUserData();
		RuntimeObject ro = self.getFactory().createObjectFromClassName("kermeta::ki::malai::interaction::event::Event");
		// The next Java Event is encapsulating into the Kermeta Event.
		ro.setUserData(emw.getTopEvent());
		
		return ro;
	}
	
	
	
	/**
	 * @return True if the list of events is empty.
	 */
	public boolean isEmpty() {
		synchronized(events) {
			return events.isEmpty(); 
		}
	}
	
	
	
	/**
	 * Removes and returns the next event of the list.
	 * @return The next event or null.
	 */
	public EventWrapper getTopEvent() {
		if(isEmpty())
			return null;
		
		synchronized(events) { 
			return events.remove(0);
		}
	}
	
	
	
	/**
	 * Attaches the EventManager to the Java component to listen.
	 * @param comp The Java Component to listen.
	 */
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
	
	
	/**
	 * Detaches the EventManager to the Java listened component.
	 * @param comp The Java Component to detach.
	 */
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
	
	
	
	/**
	 * Attaches the EventManager to the Java component to listen.
	 * @param comp The Java Component to listen.
	 */
	public void attachTo(Component comp) {
		if(comp!=null) {
			comp.addMouseListener(this);
			comp.addMouseMotionListener(this);
			comp.addMouseWheelListener(this);
			comp.addKeyListener(this);
		}
	}
	
	
	
	/**
	 * Detaches the EventManager to the Java listened component.
	 * @param comp The Java Component to detach.
	 */
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
			events.add(new EventWrapper(EventWrapper.MOUSE_CLICKED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	
	public void mouseEntered(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_ENTERED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	
	public void mouseExited(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_EXITED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	
	public void mousePressed(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_PRESSED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}


	
	public void mouseReleased(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_RELEASED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	public void keyPressed(KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.KEY_PRESSED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	public void keyReleased(KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.KEY_RELEASED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	public void keyTyped(KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.KEY_TYPED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	public void mouseDragged(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_DRAGGED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	public void mouseMoved(MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_MOVED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	public void mouseWheelMoved(MouseWheelEvent e) {
		synchronized(events) {		
			events.add(new EventWrapper(EventWrapper.MOUSE_WHEEL_MOVED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}


	public void actionPerformed(ActionEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.ACTION_PERFORMED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}



	public void onExitEvent() {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.EXIT_EVENT, null));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}
}
