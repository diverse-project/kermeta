package org.kermeta.ki.malai.examples.house.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class MetaUIContext extends JFrame {
	private static final long serialVersionUID = 1L;

	protected JComboBox placesList;
	
	protected JComboBox lightsList;
	
	protected JComboBox heatersList;
	
	protected JButton addB;
	
	protected JButton removeB;
	
	protected JToggleButton userGrandMaB;
	
	protected JToggleButton userNurseB;
	
	protected JToggleButton epWPB;
	
	protected JToggleButton epIphoneB;
	
	protected JToggleButton epNetbookB;
	
	protected EventManagerWrapper eventManager;
	
	
	
	public static void main(String args[]) {
		MetaUIContext meta = new MetaUIContext(new EventManagerWrapper());
		meta.setVisible(true);
	}

	
	
	
	public static RuntimeObject initialise(RuntimeObject self, RuntimeObject eventManager) {
		EventManagerWrapper emw = (EventManagerWrapper) eventManager.getUserData();
		MetaUIContext meta = new MetaUIContext(emw);

		self.setUserData(meta);
		meta.setVisible(true);
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public MetaUIContext(EventManagerWrapper emw) {
		super("Context of use");
		
		eventManager = emw;
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		int size = 300;
		Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(size, size));
		
		panel.add(createEnvPanel());
		panel.add(createUserPanel());
		panel.add(createPlatformPanel());
		getContentPane().add(panel);
		pack();
		setLocation(screenDim.width-size-50, 50);
		
     	addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				eventManager.onExitEvent();
            }}); 
	}
	
	
	
	protected JPanel createPlatformPanel() {
		JPanel panel   = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		
		epWPB 		= new JToggleButton("Workstation");
		epNetbookB 	= new JToggleButton("Netbook");
		epIphoneB 	= new JToggleButton("IPhone");
		
		bg.add(epWPB);
		bg.add(epNetbookB);
		bg.add(epIphoneB);
		epWPB.addActionListener(eventManager);
		epNetbookB.addActionListener(eventManager);
		epIphoneB.addActionListener(eventManager);
		epIphoneB.setActionCommand("AC_IHPONE");
		epNetbookB.setActionCommand("AC_NETBOOK");
		epWPB.setActionCommand("AC_WP");
		epWPB.setSelected(true);
		
		panel.setBorder(new CompoundBorder(new TitledBorder(null, "Platform", 
			  	TitledBorder.LEFT, TitledBorder.TOP), new EmptyBorder(0,0,0,0)));
		panel.setLayout(new FlowLayout());
		panel.add(epWPB);
		panel.add(epNetbookB);
		panel.add(epIphoneB);
		
		return panel;
	}
	
	
	
	protected JPanel createUserPanel() {
		JPanel panel 	= new JPanel();
		ButtonGroup bg 	= new ButtonGroup();
		
		userGrandMaB = new JToggleButton("Grandma");
		userNurseB   = new JToggleButton("Nurse");
		bg.add(userGrandMaB);
		bg.add(userNurseB);
		
		userGrandMaB.addActionListener(eventManager);
		userNurseB.addActionListener(eventManager);
		userGrandMaB.setActionCommand("AC_GRANDMA");
		userNurseB.setActionCommand("AC_NURSE");
		userGrandMaB.setSelected(true);
		
		panel.setBorder(new CompoundBorder(new TitledBorder(null, "User", 
			  	TitledBorder.LEFT, TitledBorder.TOP), new EmptyBorder(0,0,0,0)));
		panel.setLayout(new FlowLayout());
		panel.add(userGrandMaB);
		panel.add(userNurseB);
		
		return panel;
	}
	
	
	
	protected JPanel createEnvPanel() {
		JPanel panel = new JPanel();
		House house  = new House();
		Place hall	 = new Place("Hall");
		Place room1  = new Place("Room 1");
		JPanel housePanel  = new JPanel();
		JPanel placePanel  = new JPanel();
		JPanel actionPanel = new JPanel();
		
		hall.lights.add(new Light());
		hall.lights.add(new Light());
		room1.lights.add(new Light());
		house.places.add(hall);
		house.places.add(room1);
		
		LightComboBoxModel lightModel   = new LightComboBoxModel(house);
		HeaterComboBoxModel heaterModel = new HeaterComboBoxModel(house);
		
		housePanel.setLayout(new FlowLayout());
		placesList = new JComboBox(new String[] {hall.name, room1.name});
		placesList.addItemListener(lightModel);
		placesList.addItemListener(heaterModel);
		placesList.setSelectedIndex(0);
		housePanel.add(placesList);
		
		placePanel.setLayout(new FlowLayout());
		lightsList  = new JComboBox();
		lightsList.setModel(lightModel);
		heatersList = new JComboBox(hall.getHeatersId());
		heatersList.setModel(heaterModel);
		placePanel.add(lightsList);
		placePanel.add(heatersList);
		
		actionPanel.setLayout(new FlowLayout());
		addB 	= new JButton("Add");
		removeB = new JButton("Remove");
		addB.setActionCommand("AC_ADD");
		addB.setActionCommand("AC_REMOVE");
		actionPanel.add(addB);
		actionPanel.add(removeB);
		
		panel.setBorder(new CompoundBorder(new TitledBorder(null, "Environment", 
			  	TitledBorder.LEFT, TitledBorder.TOP), new EmptyBorder(0,0,0,0)));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(housePanel);
		panel.add(placePanel);
		panel.add(actionPanel);
		
		return panel;
	}
}
	


abstract class HouseComboBoxModel extends DefaultComboBoxModel implements ItemListener {
	private static final long serialVersionUID = 1L;

	protected House house;
	
	
	public HouseComboBoxModel(House house) {
		super();
		
		this.house = house;
		addHouseElements(house.places.get(0));
	}
	
	
	protected abstract void addHouseElements(Place place);
	
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			String item = (String) e.getItem();
			Place place = null;
			int i = 0;
			int size = house.places.size();
			
			while(place==null && i<size) {
				if(item.equals(house.places.get(i).name))
					place = house.places.get(i);
				else
					i++;
			}

			addHouseElements(place);
		}
	}
	
	
    
	@Override
	public void setSelectedItem(Object obj) {
		if(obj instanceof HouseElement)
			super.setSelectedItem(((HouseElement)obj).id);
	}


	@Override
	public Object getElementAt(int index) {
		Object obj = super.getElementAt(index);
		return obj==null ? null : ((HouseElement)obj).id;
	}
}





class LightComboBoxModel extends HouseComboBoxModel {
	private static final long serialVersionUID = 1L;



	public LightComboBoxModel(House house) {
		super(house);
	}

	
	@Override
	protected void addHouseElements(Place place) {
		if(place!=null) {
			removeAllElements();
			for(Light light : place.lights)
				addElement(light);
		}
	}
}




class HeaterComboBoxModel extends HouseComboBoxModel {
	private static final long serialVersionUID = 1L;
	
	
	public HeaterComboBoxModel(House house) {
		super(house);
	}
	
	
	@Override
	protected void addHouseElements(Place place) {
		if(place!=null) {
			removeAllElements();
			for(Heater heater : place.heaters)
				addElement(heater);
		}
	}
}





class House {
	protected List<Place> places;
	
	public House() {
		super();
		places = new ArrayList<Place>();
	}
}




class Place {
	protected String name;
	
	protected List<Heater> heaters;
	
	protected List<Light> lights;
	
	
	public Place(String name) {
		super();
		this.name = name;
		heaters = new ArrayList<Heater>();
		lights  = new ArrayList<Light>();
	}
	
	
	
	public String[] getLightsId() {
		String[] str = new String[lights.size()];

		for(int i=0; i<str.length; i++)
				str[i] = lights.get(i).id;
		
		return str;
	}
	
	
	public String[] getHeatersId() {
		String[] str = new String[heaters.size()];
		
		for(int i=0; i<str.length; i++)
			str[i] = heaters.get(i).id;
		
		return str;
	}
}




abstract class HouseElement {
	protected String id;
	
	
	public HouseElement() {
		super();
		
		id = getLabel() + newId();
	}
	
	
	public abstract String getLabel();
	
	public abstract int newId();
}





class Heater extends HouseElement {
	private static int cpt=0;
	
	
	public Heater() {
		super();
	}
	
	
	@Override
	public int newId() {
		return cpt++;
	}
	
	
	
	@Override
	public String getLabel() {
		return "Heater ";
	}
}





class Light extends HouseElement {
	private static int cpt=0;
	
	public Light() {
		super();
	}
	
	
	@Override
	public int newId() {
		return cpt++;
	}
	
	
	
	@Override
	public String getLabel() {
		return "Light ";
	}
}
