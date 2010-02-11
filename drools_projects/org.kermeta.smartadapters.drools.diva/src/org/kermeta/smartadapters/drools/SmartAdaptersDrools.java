package org.kermeta.smartadapters.drools;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.kermeta.smartadapters.drools.utils.TreeIterable;
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


	private org.eclipse.emf.ecore.resource.Resource resource;
	private KnowledgeBase kbase;
	private long start;
	private long end;



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


	private String dsplFile;
	private String droolsRepository;
	private String aspectsRepository;
	private List<String> droolsFiles = new LinkedList<String>();
	private List<String> aspectsFiles = new LinkedList<String>();


	/*	public static void main(String[] args) {

		SmartAdaptersDrools t = new SmartAdaptersDrools();
		t.run();
	}

	public void run(){
		this.loadArtModel("file:/C:/NOSAVE/workspaces/divaStudio/DroolsGenerator/base/thales.base.art");
		this.init();
		start = java.lang.System.currentTimeMillis();
		this.process("1.drl");
		this.process("2.drl");
		this.process("3.drl");
		this.process("4.drl");
		this.process("5.drl");
		this.process("6.drl");
		end = java.lang.System.currentTimeMillis();
		java.lang.System.err.println("Execution time was "+(end-start)+" ms.");

		this.saveArtModel("file:/C:/NOSAVE/workspaces/divaStudio/DroolsGenerator/base/thales.base1.art",this.resource);

	}
	 */	
	void init(){

		kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		kbuilder.add( ResourceFactory.newClassPathResource( "init.drl", getClass() ),
				ResourceType.DRL );

		if ( kbuilder.hasErrors() ) {
			java.lang.System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.getKnowledgePackages().clear();
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
		ksession.execute("");


	}

	void process(String drl){
		//KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		kbuilder.add( ResourceFactory.newClassPathResource( drl, getClass() ),
				ResourceType.DRL );

		if ( kbuilder.hasErrors() ) {
			java.lang.System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.getKnowledgePackages().clear();
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );



		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();

		java.util.List<HashMap<String,EObject>> globalList = new java.util.ArrayList<HashMap<String,EObject>>( );
		ksession.setGlobal("list", globalList);
		java.util.Map<?,?> uniqueobjects = new java.util.HashMap();
		ksession.setGlobal("uniqueobjects", uniqueobjects);

		ksession.execute(new TreeIterable<EObject>(resource.getAllContents()));
		java.lang.System.err.println("Nombre de résultat trouvé "  + globalList.size());	
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
		initDroolsFiles();
		initAspectFiles();
		init();
		initUiComponents();
		layoutComponents();
	}

	private void initAspectFiles() {
		File aspectsFiles = new File(aspectsRepository);
		for(File f : aspectsFiles.listFiles()){
			if(f.getAbsolutePath().endsWith(".smART")){
				this.aspectsFiles.add(f.getAbsolutePath());
			}
		}	
	}

	private void initDroolsFiles() {
		File droolsFiles = new File(droolsRepository);
		for(File f : droolsFiles.listFiles()){
			if(f.getAbsolutePath().endsWith(".drl")){
				this.droolsFiles.add(f.getAbsolutePath());
			}
		}
	}

	private void initConfig(){
		String divaModel = System.getProperty("diva.model");
		File divaFile = null;
		if(divaModel != null){
			divaFile = new File(divaModel);
			dsplFile = "file://" + divaFile.getAbsolutePath();
		}
		else {
			System.err.println("Cannot find the DiVA model. Plese check the diva.model property in your launch configuration.");
		}

		String droolsRep = System.getProperty("aspects.drools.repository");
		File droolsFile = null;
		if(droolsRep != null){
			droolsFile = new File(droolsRep);
			droolsRepository = "file://"+droolsFile.getAbsolutePath();
		}
		else {
			System.err.println("Cannot find the Drools repository (containing the compiled aspect). Plese check the aspects.drools.repository property in your launch configuration.");
		}

		String aspectsRep = System.getProperty("aspects.repository");
		File aspectsFile = null;
		if(aspectsRep != null){
			aspectsFile = new File(droolsRep);
			aspectsRepository = "file://"+aspectsFile.getAbsolutePath();
		}
		else {
			System.err.println("Cannot find the aspect models repository. Plese check the aspects.repository property in your launch configuration.");
		}
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub

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

		
		//TODO: replace by a sorted collection, so that aspects will be automatically ordered according to their priorities
		List<String> droolsAspectsToWeave = new LinkedList<String>();
		if (bestConf != null) {
			for(Aspect a : bestConf.getAspect()){
				boolean existsDrools = false;
				for(String drl : droolsFiles){
					if (drl.contains(a.getName().replace(" ", ""))){
						droolsAspectsToWeave.add(drl);
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
				for(String drl : droolsAspectsToWeave){
					this.process(drl);
				}
			}
			
			//reuse the existing drl file if it exists
			//otherwise, generate the drl file associated to the the aspect
			
		}
		else{
			System.err.println("Cannot find the best configuration");
		}


		//apply the aspects in the right weaving order
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

		System.out.println("Loading Suitable Configurations by URI: " + modelURI);

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
		System.out.println("Suitable Configurations loaded from URI: " + confs);

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
			String contextFile = "file://" + text;
			String confURI = getBestConfiguration(dsplFile, contextFile, simpleInterface);

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
