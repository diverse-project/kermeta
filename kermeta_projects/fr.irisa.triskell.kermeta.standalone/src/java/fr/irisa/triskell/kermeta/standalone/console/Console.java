/*
 * @(#)Console.java 1.2 04/07/02
 *
 * Copyright (c) 1997-2004 Sun Microsystems, Inc. All Rights Reserved.
 *
 * See the file "LICENSE.txt" for information on usage and redistribution
 * of this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package fr.irisa.triskell.kermeta.standalone.console;

import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.io.PipedWriter;
import java.io.PipedReader;
import java.io.IOException;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Segment;

/**
 * General purpose GUI Console
 *
 * <ul>
 * <li>based on Swing
 * <li>command history
 * <li>emacs key bindings
 * </ul>
 */
public class Console {
    private final int defaultColumns = 80;
    private final int defaultRows = 18;

    protected JTextArea textarea;
    protected JPanel mainPanel;

    private ConsoleBuffer out;
    private PipedReader in;
    private Vector history;
    private int historyIndex = -1;
    private int mark = 0;
    private PipedWriter pipe;
    private EventHandler handler;

    /**
     * Constructor
     */
    public Console() {
    mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
	textarea = new JTextArea();
        history = new Vector();
        out = new ConsoleBuffer();
        pipe = new PipedWriter();
        in = new PipedReader();
        try {
            pipe.connect(in);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
	this.handler = new EventHandler();
        textarea.getDocument().addDocumentListener(handler);
        textarea.addKeyListener(handler);
        textarea.setLineWrap(true);
        textarea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textarea.setBackground(new Color(50,50,50));
        textarea.setForeground(new Color(25,230,25));
        textarea.setCaretColor(new Color(255,255,25));
     
	JScrollPane scroller = new JScrollPane(textarea);
	mainPanel.add(scroller, BorderLayout.CENTER);
	textarea.setRows(defaultRows);
	textarea.setColumns(defaultColumns);
    }

    /**
     * Gets the JFrame object of this GUI console
     *
     * @return a JFrame object
     */
    public JPanel getPanel(){
	return mainPanel;
    }

    /**
     * Gets the JTextArea object of this GUI console
     *
     * @return a JTextArea object
     */
    public JTextArea getTextArea(){
	return textarea;
    }
    
    /**
     * Gets the Reader from this GUI console
     */    
    public Reader getReader() {
        return in;
    }
    
    /**
     * Gets the OutputStream from this GUI console
     */    
    public Writer getWriter() {
        return out;
    }

    synchronized void write(String str) {
	textarea.insert(str, mark);
	mark += str.length();
	int pos = textarea.getDocument().getLength();
	textarea.select(pos, pos);
    }

    synchronized void enter(){
	Document doc = textarea.getDocument();
	int len = doc.getLength();
	Segment segment = new Segment();
	try {
	    doc.getText(mark, len - mark, segment);
	} catch (BadLocationException ble) {
	    ble.printStackTrace();
	}
	if (segment.count > 0) {
	    history.addElement(segment.toString());
	}
	historyIndex = history.size();
	try {
	    enter(segment.array, segment.offset, segment.count);
	    textarea.append("\n");
	    mark = doc.getLength();
	    out.flush();
	} catch (IOException ioe){
	    /* ignore */
	}
	
    }

    public void enter(String str) throws IOException {
        char[] carray = str.toCharArray();
        enter(carray, 0, carray.length);
        //System.out.println(str);
    }

    public void enter(char[] cbuf, int offset, int size) throws IOException {
	pipe.write(cbuf, offset, size);
	pipe.write("\n");
	pipe.flush();
	
	//System.out.println(String.valueOf(cbuf));
	
	//write("OK");
	
	
    }
    
    class EventHandler implements KeyListener, DocumentListener {
    
	public void keyPressed(KeyEvent e) {
	    int code = e.getKeyCode();
	    boolean control = e.isControlDown();
	    int pos = textarea.getCaretPosition();
	    if (code == KeyEvent.VK_BACK_SPACE || code == KeyEvent.VK_LEFT) {
		if (mark == pos) {
		    e.consume();
		}
	    } else if (control && code == KeyEvent.VK_A) {
		textarea.setCaretPosition(mark);
		e.consume();
	    } else if (control && code == KeyEvent.VK_E) {
		textarea.setCaretPosition(textarea.getDocument().getLength());
		e.consume();
	    } else if (control && code == KeyEvent.VK_B) {
		if (mark < pos){
		    textarea.setCaretPosition(pos - 1);
		}
		e.consume();
	    } else if (control && code == KeyEvent.VK_D) {
		Document doc = textarea.getDocument();
		if (pos < doc.getLength()){
		    try {
			doc.remove(pos, 1);
		    } catch (BadLocationException ble){
			ble.printStackTrace();
		    }
		}
		e.consume();
	    } else if (control && code == KeyEvent.VK_F) {
		if (textarea.getDocument().getLength() > pos){
		    textarea.setCaretPosition(pos + 1);
		}
		e.consume();
	    } else if (control && code == KeyEvent.VK_K) {
		Document doc = textarea.getDocument();
		try {
		    doc.remove(pos, doc.getLength() - pos);
		} catch (BadLocationException ble) {
		    ble.printStackTrace();
		}
		e.consume();
	    } else if (control && code == KeyEvent.VK_U) {
		Document doc = textarea.getDocument();
		try {
		    doc.remove(mark, doc.getLength() - mark);
		} catch (BadLocationException ble) {
		    ble.printStackTrace();
		}
		e.consume();
	    } else if (code == KeyEvent.VK_HOME || (control && code == KeyEvent.VK_A)) {
		if (pos == mark) {
		    e.consume();
		} else if (pos > mark) {
		    if (!control) {
			if (e.isShiftDown()) {
			    textarea.moveCaretPosition(mark);
			} else {
			    textarea.setCaretPosition(mark);
			}
			e.consume();
		    }
		}
	    } else if (code == KeyEvent.VK_ENTER) {
		enter();
		e.consume();
		
		
		
	    } else if (code == KeyEvent.VK_UP || (control && code == KeyEvent.VK_P)) {
		historyIndex--;
		if (historyIndex >= 0) {
		    if (historyIndex >= history.size()) {
			historyIndex = history.size() -1;
		    }
		    if (historyIndex >= 0) {
			String str = (String)history.elementAt(historyIndex);
			int len = textarea.getDocument().getLength();
			textarea.replaceRange(str, mark, len);
			int caretPos = mark + str.length();
			textarea.select(caretPos, caretPos);
		    } else {
			historyIndex++;
		    }
		} else {
		    historyIndex++;
		}
		e.consume();
	    } else if (code == KeyEvent.VK_DOWN || (control && code == KeyEvent.VK_N)) {
		int caretPos = mark;
		if (history.size() > 0) {
		    historyIndex++;
		    if (historyIndex < 0) {
			historyIndex = 0;
		    }
		    int len = textarea.getDocument().getLength();
		    if (historyIndex < history.size()) {
			String str = (String)history.elementAt(historyIndex);
			textarea.replaceRange(str, mark, len);
			caretPos = mark + str.length();
		    } else {
			historyIndex = history.size();
			textarea.replaceRange("", mark, len);
		    }
		}
		textarea.select(caretPos, caretPos);
		e.consume();
	    }
	}
 
	public void keyTyped(KeyEvent e) {
	    int keyChar = e.getKeyChar();
	    if (keyChar == KeyEvent.VK_BACK_SPACE) {
		if (mark == textarea.getCaretPosition()) {
		    e.consume();
		}
	    } else if (textarea.getCaretPosition() < mark) {
		textarea.setCaretPosition(mark);
	    }
	}
	
	public void keyReleased(KeyEvent e) {
	}

	public void insertUpdate(DocumentEvent e) {
	    synchronized (Console.this){
		int len = e.getLength();
		int off = e.getOffset();
		if (mark > off) {
		    mark += len;
		}
	    }
	}
    
	public void removeUpdate(DocumentEvent e) {
	    synchronized (Console.this){
		int len = e.getLength();
		int off = e.getOffset();
		if (mark > off) {
		    if (mark >= off + len) {
			mark -= len;
		    } else {
			mark = off;
		    }
		}
	    }
	}

	public void changedUpdate(DocumentEvent e) {
	}
    }
	
    class ConsoleBuffer extends Writer {
	private StringBuffer buf = new StringBuffer();
	    
	public synchronized void write(int ch) {
	    buf.append((char)ch);
	    if (ch == '\n') {
		flushBuffer();
	    }
	}
	    
	public synchronized void write(char[] data, int off, int len) {
	    for (int i = off; i < len; i++) {
		buf.append(data[i]);
		if (data[i] == '\n') {
		    flushBuffer();
		}
	    }
	}

	public synchronized void flush() throws IOException {
	    if (buf.length() > 0) {
		flushBuffer();
	    }
	}
	
	public void close() throws IOException {
	    flush();
	}

	public int size(){
	    return buf.length();
	}
	
	private void flushBuffer() {
	    final String str = buf.toString();
	    buf.setLength(0);
	    SwingUtilities.invokeLater(new Runnable(){
		    public void run(){
			Console.this.write(str);
		    }
		});
	}
    }
    
    
}
