package org.kermeta.kompose.creative.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SpecializeWizardPage extends WizardPage {
	
	private Text plugin_name;

	private Text composer_name;
	
	private Text plugin_package;
	
	private Text model_name;
	
	private Text main_package;
	
	private SpecializerIntermediateDataContainer data;

	private ISelection selection;
	
	public SpecializeWizardPage(ISelection selection,SpecializerIntermediateDataContainer data){
		super("Kompose Specialization wizard");
		setTitle("New Kompose Specialization");
		setDescription("This wizard creates a new plugin project extending the kompose framework, ready to be specialized.");
		this.selection = selection;
		this.data=data;
	}
	
	protected SpecializeWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}


	
	public void createControl(Composite parent) {
		int ncol = 4;
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = ncol;
		layout.verticalSpacing = 9;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Plug-in project name:");

		this.plugin_name = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		plugin_name.setLayoutData(gd);
		plugin_name.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged_name(plugin_name);
				data.setPlugin_name(plugin_name.getText());
			}
		});
		createLine(container, ncol);
		label = new Label(container, SWT.NULL);
		label.setText("&Plug-in package name:");
		
		this.plugin_package = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		plugin_package.setLayoutData(gd);
		plugin_package.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged_package(plugin_package);
				data.setPackage_name(plugin_package.getText());
			}
		});
		createLine(container, ncol);
		label = new Label(container, SWT.NULL);
		label.setText("&Kompose specialized composer name:");
		
		this.composer_name = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		composer_name.setLayoutData(gd);
		composer_name.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged_name(composer_name);
				data.setComposer_name(composer_name.getText());
			}
		});
		createLine(container, ncol);
		label = new Label(container, SWT.NULL);
		label.setText("&Model name:");
		
		this.model_name = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		model_name.setLayoutData(gd);
		model_name.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged_name(model_name);
				data.setModel_name(model_name.getText());
			}
		});
		
		createLine(container, ncol);
		label = new Label(container, SWT.NULL);
		label.setText("&Model main package:");
		
		this.main_package = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		main_package.setLayoutData(gd);
		main_package.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged_name(main_package);
				data.setMainKmtPackage(main_package.getText());
			}
		});
		
		initialize();
		setControl(container);
	}
	private void initialize() {
		this.composer_name.setText("foor_bar_specialization");
		this.plugin_name.setText("org.foo.bar.specialization");
		this.plugin_package.setText("org.foo.bar.specialization");
		this.main_package.setText("fooPackage");
		this.model_name.setText("FooBarModel");
	}
	
	private void dialogChanged_name(Text text) {
		String stext=text.getText();
		if(stext.length()==0){
			updateStatus("A name must be specified");
		}
		else if(stext.contains(" ")){
			updateStatus("names can't contains spaces");	
		}
		/*else if(stext.contains(".")){
			updateStatus("names can't be qualified");	
		}*/
		//else if(!stext.matches("^([a-zA-Z])+((_)|[a-zA-Z]|[0-9])*$")){
		else if(!stext.matches("^([a-zA-Z])+((_)|[a-zA-Z]|[0-9])*((\\.){1}((_)|[a-zA-Z]|[0-9])+)*$")){
			updateStatus("invalid name");
		}
		else{
			updateStatus(null);
		}
	}
	private void dialogChanged_package(Text text) {
		String stext=text.getText();
		if(stext.length()==0){
			updateStatus("A package must be specified");
		}
		else if(stext.contains(" ")){
			updateStatus("package name can't contains spaces");	
		}
		else if(!stext.matches("^([a-zA-Z])+((_)|[a-zA-Z]|[0-9])*((\\.){1}((_)|[a-zA-Z]|[0-9])+)*$")){
			updateStatus("invalid package name");
		}
		else{
			updateStatus(null);
		}
	}
	private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

}
