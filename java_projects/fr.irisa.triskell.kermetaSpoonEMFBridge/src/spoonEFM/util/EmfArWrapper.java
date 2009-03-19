package spoonEFM.util;

import java.io.IOException;
import java.util.List;

import publicInterfaces.Instance;
import publicInterfaces.Model;
import publicInterfaces.Repository;
import publicInterfaces.RepositoryFactory;
import exceptions.InstanceException;
import exceptions.InternalErrorException;
import exceptions.InvalidMetaClassNameException;
import exceptions.MalformedModelException;

public class EmfArWrapper {
	protected Model model;

	protected Repository repository;

	protected Instance instance;

	/*
	 * public EmfArWrapper(String modelName, String extension, Class pack,
	 * boolean loadInstance){ if (loadInstance)
	 * this.LoadExistingInstance(modelName,extension,pack); else
	 * this.createnewInstance(modelName,extension,pack); }
	 */

	public Instance getInstance() {
		return instance;
	}

	public void createnewInstance(String modelName, String extension,
			Class Package) {
		repository = RepositoryFactory.INSTANCE.getRepository();
		model = null;
		try {
			// m = rep.getModel(new File("resources//Ecore.ecore"));
			model = repository.getModel(Package);
		} catch (MalformedModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InternalErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.setExtension(extension);
		instance = model.createInstance(modelName);
		instance.setPath(".");

	}

	public void LoadExistingInstance(String modelName, String extension,
			Class Package) {
		repository = RepositoryFactory.INSTANCE.getRepository();
		model = null;
		try {
			// m = rep.getModel(new File("resources//Ecore.ecore"));
			model = repository.getModel(Package);
		} catch (MalformedModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InternalErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.setExtension(extension);
		instance = model.loadInstance(modelName);

	}

	protected void saveModel() {
		try {

			this.trace();
			instance.save();

		} catch (InstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InternalErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void saveModel(String newName) {

		this.instance.setName(newName);
		this.saveModel();
	}

	public void printObjectType() {
		List c = null;
/*		int total = this.getInstance().getNumberOfObjects();
		for (int i = 0; i< total; i++){
			try {
				if ((this.getInstance().getObject(i) instanceof EClass)
						|| (this.getInstance().getObject(i) instanceof EPackage)
						|| (this.getInstance().getObject(i) instanceof EDataType)
						|| (this.getInstance().getObject(i) instanceof EOperation)
						|| (this.getInstance().getObject(i) instanceof EParameter)
						|| (this.getInstance().getObject(i) instanceof EAnnotation)
						|| (this.getInstance().getObject(i) instanceof EReference)
						|| (this.getInstance().getObject(i) instanceof EAttribute))
					System.out.print("");
				else
					System.out.println(this.getInstance().getObject(i).getClass());					

			} catch (GraphException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}*/
	}
	
	public void trace() {
		List c = null;
		List p = null;
		List dt = null;
		List op = null;
		List pa = null;
		List ann = null;
		List ref = null;
		List att = null;

		try {
			c = this.getInstance().getAllInstanceOf(
					this.getInstance().getModel().getClassForName("EClass"));
			p = this.getInstance().getAllInstanceOf(
					this.getInstance().getModel().getClassForName("EPackage"));
			dt = this.getInstance().getAllInstanceOf(
					this.getInstance().getModel().getClassForName("EDataType"));
			op = this.getInstance()
					.getAllInstanceOf(
							this.getInstance().getModel().getClassForName(
									"EOperation"));
			pa = this.getInstance()
					.getAllInstanceOf(
							this.getInstance().getModel().getClassForName(
									"EParameter"));
			ann = this.getInstance().getAllInstanceOf(
					this.getInstance().getModel()
							.getClassForName("EAnnotation"));
			ref = this.getInstance()
					.getAllInstanceOf(
							this.getInstance().getModel().getClassForName(
									"EReference"));
			att = this.getInstance()
					.getAllInstanceOf(
							this.getInstance().getModel().getClassForName(
									"EAttribute"));

			System.out.println("c : " + c.size());
			System.out.println("p : " + p.size());
			System.out.println("dt : " + dt.size());
			System.out.println("op : " + op.size());
			System.out.println("pa : " + pa.size());
			System.out.println("ann : " + ann.size());
			System.out.println("ref : " + ref.size());
			System.out.println("att : " + att.size());

			int total = c.size() + p.size() + dt.size() + op.size() + pa.size()
					+ ann.size() + ref.size() + att.size();

			System.out.println("total : " +total);

		} catch (InvalidMetaClassNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
