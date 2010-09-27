package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.Component;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.kermeta.ki.malai.dispatcherWrapper.DispatcherWrapper;

/**
 * Bridges the gap between a Kermeta EventManager and Java events. This class
 * listens to Java events and notify the Java DispatcherWrapper that an event occurred.
 * @author Arnaud Blouin
 *
 */
public class EventManagerWrapper implements MouseListener, KeyListener, MouseMotionListener, MouseWheelListener, ActionListener, ItemListener, ChangeListener {
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
	public void attachTo(final Component comp) {
		if(comp!=null) {
			comp.addMouseListener(this);
			comp.addMouseMotionListener(this);
			comp.addMouseWheelListener(this);
			comp.addKeyListener(this);

			if(comp instanceof AbstractButton)
				((AbstractButton)comp).addActionListener(this);
			
			if(comp instanceof JTextField)
				((JTextField)comp).addActionListener(this);
			
			if(comp instanceof ItemSelectable)
				((ItemSelectable)comp).addItemListener(this);
			
			if(comp instanceof JSpinner)
				((JSpinner)comp).addChangeListener(this);
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
			
			if(comp instanceof AbstractButton)
				((AbstractButton)comp).removeActionListener(this);
			
			if(comp instanceof JTextField)
				((JTextField)comp).removeActionListener(this);
			
			if(comp instanceof ItemSelectable)
				((ItemSelectable)comp).removeItemListener(this);
			
			if(comp instanceof JSpinner)
				((JSpinner)comp).removeChangeListener(this);
		}
	}
	
	

	@Override
	public void mouseClicked(final MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_CLICKED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	
	@Override
	public void mouseEntered(final MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_ENTERED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	
	@Override
	public void mouseExited(final MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_EXITED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	
	@Override
	public void mousePressed(final MouseEvent e) {
		synchronized(events) {
			if(e.getSource() instanceof JComponent)
				((JComponent)e.getSource()).grabFocus();
			
			events.add(new EventWrapper(EventWrapper.MOUSE_PRESSED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}


	
	@Override
	public void mouseReleased(final MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_RELEASED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	@Override
	public void keyPressed(final KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.KEY_PRESSED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	@Override
	public void keyReleased(final KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.KEY_RELEASED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	@Override
	public void keyTyped(final KeyEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.KEY_TYPED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	@Override
	public void mouseDragged(final MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_DRAGGED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	@Override
	public void mouseMoved(final MouseEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.MOUSE_MOVED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}

	
	@Override
	public void mouseWheelMoved(final MouseWheelEvent e) {
		synchronized(events) {		
			events.add(new EventWrapper(EventWrapper.MOUSE_WHEEL_MOVED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}


	@Override
	public void actionPerformed(final ActionEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.ACTION_PERFORMED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}



	public void onExitEvent() {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.EXIT_EVENT, null));//FIXME provokes crash while quitting the program (info is null)
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}
	
	

	@Override
	public void itemStateChanged(final ItemEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.ITEM_STATE_CHANGED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}



	@Override
	public void stateChanged(final ChangeEvent e) {
		synchronized(events) {
			events.add(new EventWrapper(EventWrapper.STATE_CHANGED, e));
		}
		synchronized(dispatcher) {
			dispatcher.notifyAll();
		}
	}
}
