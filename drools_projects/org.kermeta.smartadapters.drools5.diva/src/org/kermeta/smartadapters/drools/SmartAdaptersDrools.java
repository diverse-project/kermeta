package org.kermeta.smartadapters.drools;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.kermeta.smartadapters.drools.utils.AspectComparator;
import org.osgi.framework.BundleContext;

import service.arf.ARF;
import service.arf.InputHandle;
import service.arf.ModelHandle;
import service.arf.model.Loader;
import service.arf.question.QuestionHandle;
import service.arf.question.Result;
import service.arf.reasoner.ReasonerHandle;
import arf.question.URIResult;
import diva.reasoning.IReasoning;
import diva_configuration.Aspect;
import diva_configuration.Configuration;
import diva_configuration.Diva_configurationPackage;
import diva_configuration.SuitableConfigurations;
import eu.diva.divastudio.services.runtime.CausalLink;
import eu.diva.divastudio.services.runtime.IWeaver;
import eu.diva.osgi.component.DiVAComponentOSGi;
import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;

public class SmartAdaptersDrools implements DiVAComponentOSGi, IWeaver, ActionListener, KeyListener{

	private static Logger logger = Logger.getLogger(SmartAdaptersDrools.class.getName());
	
	private org.eclipse.emf.ecore.resource.Resource resource;
	private long start;

	CausalLink link;
	IReasoning reasoner;
	ARF arf;

	public void setLink(CausalLink link) {
		this.link = link;
	}

	public void setReasoner(IReasoning reasoner) {
		this.reasoner = reasoner;
	}

	public void setArf(ARF arf) {
		this.arf = arf;
	}


	private JFrame     frame;
	private JTextField screen;
	private JButton    submit;
	private JPanel     top, center, left;
	private JPanel     bottom;

	private String baseModelURI;
	private String dsplFile;
	private String droolsRepository;
	private String aspectsRepository;
	private String configurationsRepository;
	private String smartAdapters;
	
	
	private List<String> droolsFiles = new LinkedList<String>();
	private List<String> aspectsFiles = new LinkedList<String>();
	private List<String> configsFiles = new LinkedList<String>();


	public SmartAdaptersDrools(){
		droolsFiles = new LinkedList<String>();
		aspectsFiles = new LinkedList<String>();
		configsFiles = new LinkedList<String>();
	}



	art.System loadArtModel(String uri){

		ResourceSetImpl rs = new ResourceSetImpl(); 

		//EcorePackageImpl.init();
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry f = rs.getResourceFactoryRegistry();

		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		//f.get

		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());


		rs.getPackageRegistry().put(art.ArtPackage.eNS_URI, art.ArtPackage.eINSTANCE);

		URI uri1  = URI.createURI(uri);//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
		resource = rs.getResource(uri1,true);

		art.System s = (art.System) resource.getContents().get(0);
		return s;


	}

	void saveArtModel(String uri, Resource r){
		ResourceSetImpl rs = new ResourceSetImpl(); 

		//EcorePackageImpl.init();
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry f = rs.getResourceFactoryRegistry();

		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		//f.get

		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());


		rs.getPackageRegistry().put(art.ArtPackage.eNS_URI, art.ArtPackage.eINSTANCE);

		URI uri1  = URI.createURI(uri);//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));

		r.setURI(uri1);

		try {
			r.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private BundleContext context;

	@Override
	public BundleContext getContext() {
		return context;
	}

	@Override
	public void setContext(BundleContext context) {
		this.context = context;
	}

	private String instanceName;

	@Override
	public String getInstanceName() {
		return instanceName;
	}

	@Override
	public void setInstanceName(String name) {
		this.instanceName = name;
	}

	@Override
	public void start() {		
		initConfig();
		initConfigurations();
		initDroolsFiles();
		initAspectFiles();
		initUiComponents();
		layoutComponents();
	}

	private void initConfigurations() {
		//System.out.println("initConfigurations "+configurationsRepository);
		File configsFiles = new File(configurationsRepository);
		//System.out.println("configsFiles "+configsFiles.getAbsolutePath());
		if(configsFiles.listFiles() != null){
			for(File f : configsFiles.listFiles()){
				//System.out.println("f = "+f.getAbsolutePath());
				if(f.getAbsolutePath().endsWith(".art")){
					this.configsFiles.add(f.getAbsolutePath());
				}
			}	
		}
	}	

	private void initAspectFiles() {
		File aspectsFiles = new File(aspectsRepository);
		if(aspectsFiles.listFiles() != null){
			for(File f : aspectsFiles.listFiles()){
				if(f.getAbsolutePath().endsWith(".smART")){
					this.aspectsFiles.add(f.getAbsolutePath());
				}
			}	
		}
	}

	private void initDroolsFiles() {
		File droolsFiles = new File(droolsRepository);
		if(droolsFiles.listFiles() != null){
			for(File f : droolsFiles.listFiles()){
				if(f.getAbsolutePath().endsWith(".drl")){
					this.droolsFiles.add(f.getAbsolutePath());
				}
			}
		}
	}

	private void initConfig(){
		String property = System.getProperty("diva.model");
		File file = null;
		if(property != null){
			file = new File(property);
			dsplFile = "file://" + file.getAbsolutePath();
		}
		else {
			logger.warn("Cannot find the DiVA model. Please check the diva.model property in your launch configuration.");
		}

		property = System.getProperty("smartadapters");
		//System.out.println("property smartadapters= "+property);
		if(property != null){
			file = new File(property);
			//System.out.println("file = "+file.getAbsolutePath());
			smartAdapters = file.getAbsolutePath();
		}
		else {
			logger.warn("Cannot find the Drools repository (containing the compiled aspect). Please check the aspects.drools.repository property in your launch configuration.");
		}
		
		property = System.getProperty("aspects.drools.repository");
		//System.out.println("property aspects.drools.repository= "+property);
		if(property != null){
			file = new File(property);
			//System.out.println("file = "+file.getAbsolutePath());
			droolsRepository = file.getAbsolutePath();
		}
		else {
			logger.warn("Cannot find the Drools repository (containing the compiled aspect). Please check the aspects.drools.repository property in your launch configuration.");
		}

		property = System.getProperty("aspects.repository");
		if(property != null){
			file = new File(property);
			aspectsRepository = "file://"+file.getAbsolutePath();
		}
		else {
			logger.warn("Cannot find the aspect models repository. Please check the aspects.repository property in your launch configuration.");
		}

		property = System.getProperty("model.base");
		//System.out.println("property model.base= "+property);
		if(property != null){
			file = new File(property);
			System.out.println("file = "+file.getAbsolutePath());
			baseModelURI = "file://"+file.getAbsolutePath();
		}
		else {
			logger.warn("Cannot find the base model. Please check the model.base property in your launch configuration.");
		}

		property = System.getProperty("configurations.folder");
		//System.out.println("property = "+property);
		if(property != null){
			file = new File(property);
			System.out.println("file = "+file.getAbsolutePath());
			configurationsRepository = file.getAbsolutePath();
		}
		else {
			logger.warn("Cannot find the configurations repository. Please check the configurations.folder property in your launch configuration.");
		}
	}


	@Override
	public void stop() {

	}

	public void produceConfiguration(String confURI) {
		SuitableConfigurations confs = loadConfModel(confURI);
		produceConfiguration(confs);
	}

	public void produceConfiguration(SuitableConfigurations confs) {
		int maxScore = Integer.MIN_VALUE;
		Configuration bestConf = null;

		for (Configuration c : confs.getConfigurations()) {
			if (maxScore < c.getScore()) {
				bestConf = c;
				maxScore = c.getScore();
			}
		}

		SortedSet<String> droolsAspectsToWeave = new TreeSet<String>(new AspectComparator());
		if (bestConf != null) {

			boolean existsConfig = false;


			List<String> aspectNames = new LinkedList<String>();
			for (Aspect a : bestConf.getAspect()) {
				aspectNames.add(a.getName().replace(" ", ""));
			}

			/*
			 * We find the pre-generated architectural model which (only) contains a
			 * sub-set of the variant selected in the configuration
			 */
			for (String file : configsFiles) {
				file = file.replace("\\","/");

				String name = file.substring(file.lastIndexOf("/")+1, file.length()).split(".art")[0];
				//String name = file.split("/")[1].split(".art")[0];
				List<String> aspects = new LinkedList<String>();

				for (String s : name.split("_")) {
					//logger.warn(s);
					aspects.add(s);
				}

				if (aspectNames.containsAll(aspects)) {
					link.reconfigureByModelURI(file);
					existsConfig = true;
					break;
				}
			}




			if(!existsConfig) {

				for(Aspect a : bestConf.getAspect()){
					boolean existsDrools = false;
					//System.out.println("droolsFiles.size = "+droolsFiles.size());
					for(String drl : droolsFiles){
						//System.out.println("drl = "+drl);
						//System.out.println("aspect = "+a.getName().replace(" ", ""));
						if (drl.contains(a.getName().replace(" ", ""))){
							droolsAspectsToWeave.add(drl);
							//System.out.println("addind Drools aspect += "+drl);
							existsDrools = true;
						}
					}

					if(!existsDrools){
						for(String aspect : aspectsFiles){
							if (aspect.contains(a.getName().replace(" ", ""))){
								String droolsAspect = generateDrools(aspect);
								droolsAspectsToWeave.add(droolsAspect);
							}
						}	
					}
				}

				String cmd = "java -jar "+smartAdapters + " " + baseModelURI + " " + baseModelURI.replace(".art", "_woven.art");
				
				for(String drl : droolsAspectsToWeave){
					File drlFile = new File(drl);
					cmd += " "+drlFile.getAbsolutePath();
				}

				logger.info("Weaving...");
				//System.out.println(cmd);
				Process process;
				start = System.currentTimeMillis();
				try {
					process = Runtime.getRuntime().exec(cmd);
					process.waitFor();
					process.destroy();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				logger.info("Weaving "+droolsAspectsToWeave.size()+" aspects in "+(System.currentTimeMillis()-start)+" ms (including Drools initialization ~2s)");
				

				//System.out.println("link.reconfigureByModelURI("+baseModelURI.replace(".art", "_woven.art")+")");
				link.reconfigureByModelURI(baseModelURI.replace(".art", "_woven.art").replace("file://", ""));
				//link.reconfigureInMemory((art.System)resource.getContents().get(0));
			}
		}
		else{
			logger.warn("Cannot find the best configuration");
		}
	}


	/**
	 * 
	 * @param aspect : the path to an aspect model
	 * @return the path to the drools file
	 */
	private String generateDrools(String aspect) {
		File droolFile = new File(aspect.split(".smART")[0]+".drl");
		//TODO
		droolsFiles.add(droolFile.getAbsolutePath());
		return null;
	}

	public SuitableConfigurations loadConfModel(String modelURI) {
		SuitableConfigurations confs;

		//System.out.println("Loading Suitable Configurations by URI: " + modelURI);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		EMFRegistryHelper.safeRegisterPackages(EPackage.Registry.INSTANCE, Diva_configurationPackage.eINSTANCE);
		// System.out.println("registered: "+EMFRegistryHelper.isRegistered("http://art"));

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("art", new XMIResourceFactoryImpl() {
			public Resource createResource(URI uri) {
				XMIResource xmiResource = new XMIResourceImpl(uri);
				return xmiResource;
			}
		});

		ResourceSet rs = new ResourceSetImpl();

		URI ecoreFileURI = URI.createFileURI(modelURI);
		// System.out.println(ecoreFileURI.path());

		Resource res = rs.getResource(ecoreFileURI, true);
		confs = (SuitableConfigurations) res.getContents().get(0);
		//System.out.println("Suitable Configurations loaded from URI: " + confs);

		return confs;
	}

	private String getBestConfiguration(String model_uri, String context_uri, boolean simpleInterface) {
		if (simpleInterface) {
			String configuration_uri = "";
			configuration_uri = reasoner.getBestConfigurations(model_uri, context_uri);
			return configuration_uri;
		}
		else {
			String configuration_uri = "";
			try {
				ReasonerHandle reasoner = new arf.reasoner.ReasonerHandle("Alloy SAT Reasoner");
				Loader loader = new arf.model.util.Loader();
				ModelHandle model = new arf.ModelHandle(loader, model_uri);
				InputHandle input = new arf.InputHandle(loader, context_uri, null);
				QuestionHandle question = new arf.question.QuestionHandle(service.arf.ARF.QUESTIONS.GET_BEST_VALID_CONFIGURATIONS);
				arf.setReasoner(reasoner);
				arf.setModel(model);
				arf.setInput(input);
				Result result = arf.ask(question);
				if (result instanceof URIResult) {
					List<String> answer = ((URIResult) result).getAnswerAsURI();
					if (answer.isEmpty() == false) {
						configuration_uri = answer.get(0);
					}
				}
			}
			finally {
				arf.setInput(null);
				arf.setModel(null);
				arf.setReasoner(null);
			}
			return configuration_uri;
		}
	}	


	private void initUiComponents() {
		frame = new JFrame("Context Evolution Console");
		screen = new JTextField(30);
		submit = new JButton("change context");

		top = new JPanel();
		left = new JPanel();
		center = new JPanel();
		bottom = new JPanel();

		screen.setEnabled(true);
		screen.setEditable(true);
		submit.addActionListener(this);
		screen.addKeyListener(this);
		// forceRebuild.setText("Force Rebuild");
		// forceRebuild.setSelected(false);
		JLabel spacer = new JLabel(" ");
		spacer.setOpaque(false);
		spacer.setPreferredSize(new Dimension(100, 50));
		left.add(spacer);
	}

	private void layoutComponents() {

		top.add(screen);
		// top.add(forceRebuild);
		bottom.add(submit);

		center.setLayout(new BorderLayout());
		center.add(top, BorderLayout.NORTH);
		center.add(bottom, BorderLayout.SOUTH);

		frame.getContentPane().setLayout(new BorderLayout());
		frame.add(center, BorderLayout.CENTER);
		frame.add(left, BorderLayout.WEST);

		frame.setPreferredSize(new Dimension(900, 100));
		frame.pack();

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == submit) {
			dsplFile = dsplFile.replace("\\", "/");
			String text = screen.getText();
			text = text.replace("\\", "/");

			boolean simpleInterface = false;
			String contextFile = (text.startsWith("file:")) ? text : "file://" + text;
			
			long start = System.currentTimeMillis();
			
			logger.info("Reasoning...");
			
			String confURI = getBestConfiguration(dsplFile, contextFile, simpleInterface);
			
			logger.info("Reasoning time: "+(System.currentTimeMillis()-start)+" ms");

			produceConfiguration(confURI.replace("file://", ""));
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			submit.doClick(200);
		}
	}

	public void keyReleased(KeyEvent e) {

	}

	public void keyTyped(KeyEvent e) {

	}	
}
