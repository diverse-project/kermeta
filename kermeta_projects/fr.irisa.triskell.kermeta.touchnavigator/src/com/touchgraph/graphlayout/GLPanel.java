/*
 * TouchGraph LLC. Apache-Style Software License
 *
 *
 * Copyright (c) 2001-2002 Alexander Shapiro. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by 
 *        TouchGraph LLC (http://www.touchgraph.com/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "TouchGraph" or "TouchGraph LLC" must not be used to endorse 
 *    or promote products derived from this software without prior written 
 *    permission.  For written permission, please contact 
 *    alex@touchgraph.com
 *
 * 5. Products derived from this software may not be called "TouchGraph",
 *    nor may "TouchGraph" appear in their name, without prior written
 *    permission of alex@touchgraph.com.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL TOUCHGRAPH OR ITS CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR 
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * ====================================================================
 *
 */

package com.touchgraph.graphlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;

import com.touchgraph.graphlayout.interaction.GLEditUI;
import com.touchgraph.graphlayout.interaction.GLNavigateUI;
import com.touchgraph.graphlayout.interaction.HVScroll;
import com.touchgraph.graphlayout.interaction.HyperScroll;
import com.touchgraph.graphlayout.interaction.LocalityScroll;
import com.touchgraph.graphlayout.interaction.RotateScroll;
import com.touchgraph.graphlayout.interaction.TGUIManager;
import com.touchgraph.graphlayout.interaction.ZoomScroll;

/** GLPanel contains code for adding scrollbars and interfaces to the TGPanel
  * The "GL" prefix indicates that this class is GraphLayout specific, and
  * will probably need to be rewritten for other applications.
  *
  * @author   Alexander Shapiro
  * @version  1.21  $Id: GLPanel.java,v 1.5 2006-01-27 19:41:22 dvojtise Exp $
  */
public class GLPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1138926175560529484L;
	public String zoomLabel = "Zoom"; // label for zoom menu item
    public String rotateLabel = "Rotate"; // label for rotate menu item
    public String localityLabel = "Locality"; // label for locality menu item
    public String hyperLabel = "Hyperbolic"; // label for locality menu item

    public HVScroll hvScroll;
    public ZoomScroll zoomScroll;
    public HyperScroll hyperScroll; // unused
    public RotateScroll rotateScroll;
    public LocalityScroll localityScroll;
    public JPopupMenu glPopup;
    public Hashtable<String,JScrollBar> scrollBarHash; //= new Hashtable();

    protected TGPanel tgPanel;
    protected TGLensSet tgLensSet;
    protected TGUIManager tgUIManager;

    protected Color defaultColor = Color.lightGray;

  // ............


   /** Default constructor.
     */
    public GLPanel() {
        scrollBarHash = new Hashtable<String,JScrollBar>();
        tgLensSet = new TGLensSet();
        tgPanel = new TGPanel();
        hvScroll = new HVScroll(tgPanel, tgLensSet);
        zoomScroll = new ZoomScroll(tgPanel);
        hyperScroll = new HyperScroll(tgPanel);
        rotateScroll = new RotateScroll(tgPanel);
        localityScroll = new LocalityScroll(tgPanel);
        initialize();
    }


   /** Constructor with a Color to be used for UI background.
     */
    public GLPanel( Color color ) {
        defaultColor = color;
        this.setBackground(color);
        scrollBarHash = new Hashtable<String,JScrollBar>();
        tgLensSet = new TGLensSet();
        tgPanel = new TGPanel();
        tgPanel.setBackground(color);
        hvScroll = new HVScroll(tgPanel, tgLensSet);
      //hvScroll.getHorizontalSB().setBackground(Color.orange);
      //hvScroll.getVerticalSB().setBackground(Color.cyan);
        zoomScroll = new ZoomScroll(tgPanel);
      //zoomScroll.getZoomSB().setBackground(Color.green);
        hyperScroll = new HyperScroll(tgPanel);
        rotateScroll = new RotateScroll(tgPanel);
      //rotateScroll.getRotateSB().setBackground(Color.blue);
        localityScroll = new LocalityScroll(tgPanel);
      //localityScroll.getLocalitySB().setBackground(Color.red);
        initialize();
    }


   /** Initialize panel, lens, and establish a random graph as a demonstration.
     */
    public void initialize() {
        buildPanel();
        buildLens();
        tgPanel.setLensSet(tgLensSet);
        addUIs();
      //tgPanel.addNode();  //Add a starting node.
        try {

        	//new RandomGraphBuilder(tgPanel).buildGraph();
        	//new KermetaClassGraphBuilder(tgPanel).buildGraph();
            randomGraph();
        } catch ( TGException tge ) {
            System.err.println(tge.getMessage());
            tge.printStackTrace(System.err);
        }
        tgPanel.setSelect(tgPanel.getGES().getFirstNode()); //Select first node, so hiding works
        setVisible(true);
    }

    /** Return the TGPanel used with this GLPanel. */
    public TGPanel getTGPanel() {
        return tgPanel;
    }

  // navigation .................

    /** Return the HVScroll used with this GLPanel. */
    public HVScroll getHVScroll()
    {
        return hvScroll;
    }

    /** Return the HyperScroll used with this GLPanel. */
    public HyperScroll getHyperScroll()
    {
        return hyperScroll;
    }

    /** Sets the horizontal offset to p.x, and the vertical offset to p.y
      * given a Point <tt>p<tt>. 
      */
    public void setOffset( Point p ) {
        hvScroll.setOffset(p);
    };

    /** Return the horizontal and vertical offset position as a Point. */
    public Point getOffset() {
        return hvScroll.getOffset();
    };

  // rotation ...................

    /** Return the RotateScroll used with this GLPanel. */
    public RotateScroll getRotateScroll()
    {
        return rotateScroll;
    }

    /** Set the rotation angle of this GLPanel (allowable values between 0 to 359). */
     public void setRotationAngle( int angle ) {
        rotateScroll.setRotationAngle(angle);
    }

    /** Return the rotation angle of this GLPanel. */
    public int getRotationAngle() {
        return rotateScroll.getRotationAngle();
    }

  // locality ...................

    /** Return the LocalityScroll used with this GLPanel. */
    public LocalityScroll getLocalityScroll()
    {
        return localityScroll;
    }

    /** Set the locality radius of this TGScrollPane  
      * (allowable values between 0 to 4, or LocalityUtils.INFINITE_LOCALITY_RADIUS). 
      */
    public void setLocalityRadius( int radius ) {
        localityScroll.setLocalityRadius(radius);
    }

    /** Return the locality radius of this GLPanel. */
    public int getLocalityRadius() {
        return localityScroll.getLocalityRadius();
    }

  // zoom .......................

    /** Return the ZoomScroll used with this GLPanel. */
    public ZoomScroll getZoomScroll() 
    {
        return zoomScroll;
    }

    /** Set the zoom value of this GLPanel (allowable values between -100 to 100). */
    public void setZoomValue( int zoomValue ) {
        zoomScroll.setZoomValue(zoomValue);
    }

    /** Return the zoom value of this GLPanel. */
    public int getZoomValue() {
        return zoomScroll.getZoomValue();
    }

  // ....

    public JPopupMenu getGLPopup() 
    {
        return glPopup;
    }

    public void buildLens() {
        tgLensSet.addLens(hvScroll.getLens());
        tgLensSet.addLens(zoomScroll.getLens());
        tgLensSet.addLens(hyperScroll.getLens());
        tgLensSet.addLens(rotateScroll.getLens());
        tgLensSet.addLens(tgPanel.getAdjustOriginLens());
    }

    public void buildPanel() {
        final JScrollBar horizontalSB = hvScroll.getHorizontalSB();
        final JScrollBar verticalSB = hvScroll.getVerticalSB();
        final JScrollBar zoomSB = zoomScroll.getZoomSB();
        final JScrollBar rotateSB = rotateScroll.getRotateSB();
        final JScrollBar localitySB = localityScroll.getLocalitySB();
        final JScrollBar hyperSB = hyperScroll.getHyperSB();

        setLayout(new BorderLayout());

        JPanel scrollPanel = new JPanel();
        scrollPanel.setBackground(defaultColor);
        scrollPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        JPanel modeSelectPanel = new JPanel();
        modeSelectPanel.setBackground(defaultColor);
        modeSelectPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));

        AbstractAction navigateAction = new AbstractAction("Navigate") {
			private static final long serialVersionUID = 8877654792448159227L;

			public void actionPerformed(ActionEvent e) {
                tgUIManager.activate("Navigate");
            }
        };

        AbstractAction editAction = new AbstractAction("Edit") {            
			private static final long serialVersionUID = 1983114094148831716L;

			public void actionPerformed(ActionEvent e) {
                tgUIManager.activate("Edit");
            }
        };

        JRadioButton rbNavigate = new JRadioButton(navigateAction);
        rbNavigate.setBackground(defaultColor);
        rbNavigate.setSelected(true);
        JRadioButton rbEdit = new JRadioButton(editAction);
        rbEdit.setBackground(defaultColor);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbNavigate);
        bg.add(rbEdit);

        modeSelectPanel.add(rbNavigate);
        modeSelectPanel.add(rbEdit);

        final JPanel topPanel = new JPanel();
        topPanel.setBackground(defaultColor);
        topPanel.setLayout(new GridBagLayout());
        c.gridy=0; c.fill=GridBagConstraints.HORIZONTAL;
        /*
        c.gridx=0;c.weightx=0;
        topPanel.add(new Label("Zoom",Label.RIGHT), c);
        c.gridx=1;c.weightx=0.5;
        topPanel.add(zoomSB,c);
        c.gridx=2;c.weightx=0;
        topPanel.add(new Label("Locality",Label.RIGHT), c);
        c.gridx=3;c.weightx=0.5;
        topPanel.add(localitySB,c);
        */
        c.gridx=0;c.weightx=0;c.insets = new Insets(0,10,0,10);
        topPanel.add(modeSelectPanel,c);
        c.insets=new Insets(0,0,0,0);
        c.gridx=1;c.weightx=1;

        scrollBarHash.put(zoomLabel, zoomSB);
        scrollBarHash.put(rotateLabel, rotateSB);
        scrollBarHash.put(localityLabel, localitySB);
        scrollBarHash.put(hyperLabel, hyperSB);

        JPanel scrollselect = scrollSelectPanel(new String[] {zoomLabel, rotateLabel, localityLabel, hyperLabel});
        scrollselect.setBackground(defaultColor);
        topPanel.add(scrollselect,c);

        add(topPanel, BorderLayout.NORTH);

        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 1;
        c.gridx = 0; c.gridy = 1; c.weightx = 1; c.weighty = 1;
        scrollPanel.add(tgPanel,c);

        c.gridx = 1; c.gridy = 1; c.weightx = 0; c.weighty = 0;
        scrollPanel.add(verticalSB,c);

        c.gridx = 0; c.gridy = 2;
        scrollPanel.add(horizontalSB,c);

        add(scrollPanel,BorderLayout.CENTER);

        glPopup = new JPopupMenu();
        glPopup.setBackground(defaultColor);

        JMenuItem menuItem = new JMenuItem("Toggle Controls");
        ActionListener toggleControlsAction = new ActionListener() {
                boolean controlsVisible = true;
                public void actionPerformed(ActionEvent e) {
                    controlsVisible = !controlsVisible;
                    horizontalSB.setVisible(controlsVisible);
                    verticalSB.setVisible(controlsVisible);
                    topPanel.setVisible(controlsVisible);
                }
            };
        menuItem.addActionListener(toggleControlsAction);
        glPopup.add(menuItem);
    }

    protected JPanel scrollSelectPanel(String[] scrollBarNames) {
        final JComboBox scrollCombo = new JComboBox(scrollBarNames);
        scrollCombo.setBackground(defaultColor);
        scrollCombo.setPreferredSize(new Dimension(80,20));
        scrollCombo.setSelectedIndex(0);
        final JScrollBar initialSB = (JScrollBar) scrollBarHash.get(scrollBarNames[0]);
        scrollCombo.addActionListener(new ActionListener() {
            JScrollBar currentSB = initialSB;
            public void actionPerformed(ActionEvent e) {
                JScrollBar selectedSB = (JScrollBar) scrollBarHash.get(
                        (String) scrollCombo.getSelectedItem());
                if (currentSB!=null) currentSB.setVisible(false);
                Enumeration enumeration = scrollBarHash.elements();
                while(enumeration.hasMoreElements()){
                	((JScrollBar)enumeration.nextElement()).setVisible(false);
                }
                if (selectedSB!=null) selectedSB.setVisible(true);
                currentSB = selectedSB;
            }
        });

        final JPanel sbp = new JPanel(new GridBagLayout());
        sbp.setBackground(defaultColor);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0; c.gridy = 0; c.weightx= 0;
        sbp.add(scrollCombo,c);
        c.gridx = 1; c.gridy = 0; c.weightx = 1; c.insets=new Insets(0,10,0,17);
        c.fill=GridBagConstraints.HORIZONTAL;
        for (int i = 0;i<scrollBarNames.length;i++) {
            JScrollBar sb = (JScrollBar) scrollBarHash.get(scrollBarNames[i]);
              if(sb==null) continue;
             /*sb.setVisible(false);

              if(i==0) {
            	  sb.setVisible(true);
              }*/
              //sb.setMinimumSize(new Dimension(200,17));
              sbp.add(sb,c);
        }
        
        return sbp;
    }

    public void addUIs() {
        tgUIManager = new TGUIManager();
        GLEditUI editUI = new GLEditUI(this);
        GLNavigateUI navigateUI = new GLNavigateUI(this);
        tgUIManager.addUI(editUI,"Edit");
        tgUIManager.addUI(navigateUI,"Navigate");
        tgUIManager.activate("Navigate");
    }

    public void randomGraph() throws TGException {
        Node n1= tgPanel.addNode();
        n1.setType(0);
        for ( int i=0; i<249; i++ ) {
            Node r = tgPanel.getGES().getRandomNode();
            Node n = tgPanel.addNode();
            n.setType(0);
            if (tgPanel.findEdge(r,n)==null) tgPanel.addEdge(r,n,Edge.DEFAULT_LENGTH);
            if (i%2==0) {
                r = tgPanel.getGES().getRandomNode();
                if (tgPanel.findEdge(r,n)==null) tgPanel.addEdge(r,n,Edge.DEFAULT_LENGTH);
            }
        }
        tgPanel.setLocale(n1,2);
    }    

    public static void main(String[] args) {

        JFrame frame;
        frame = new JFrame("Graph Layout");
        GLPanel glPanel = new GLPanel();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        frame.getContentPane().add("Center", glPanel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

} // end com.touchgraph.graphlayout.GLPanel
