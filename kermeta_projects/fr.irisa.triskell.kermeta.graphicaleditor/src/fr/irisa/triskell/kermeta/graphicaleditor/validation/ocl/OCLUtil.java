/* $Id: OCLUtil.java,v 1.1 2006-03-29 08:55:38 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : OCLUtil.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Mar 16, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
/**
 * This package contains code relative to OCL constraint checking. It is not definitive.
 */
package fr.irisa.triskell.kermeta.graphicaleditor.validation.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * @author zdrey
 *
 */
public class OCLUtil {
	
	
	/**
	 * 
	 * @param checked Rules that we want to check
	 */
	private void checkAction(Object[] checked, EObject pmodel)
	{
		EObject model = EcoreUtil.copy(pmodel);
		//IService checkerService = ServicesManager.getInstance().getService("org.topcased.service.oclchecker.checkService");
/*		boolean result = true;
		Model resultModel = resultFactory.createModel();
		ModelInformation information = resultFactory.createModelInformation();
		information.setModelContent(model);
		resultModel.setInformation(information);
		
		for(int ite=0; ite<checked.length; ite++)
		{
			Query query = (Query) checked[ite];
			OclExpression rule = query.getExpression();
						
			Constraint ruleConstraint = (Constraint) rule.eContainer();
			EClass ruleContext = (EClass) ruleConstraint.getConstrainedElement().get(0);
			EPackage rulePackage = ruleContext.getEPackage();
			
			
			
			HashMap parameters = new HashMap();
			parameters.put("Model", model);
			parameters.put("OCLRule", rule);
			try
			{
				Map resultMap = (Map) checkerService.serviceRun(parameters);
				java.util.List resultList = (java.util.List) resultMap.get("rejected");
				
				// If the rule was executed with no error, it is added to the resultModel
				// Retrieve or create the package
				Package rulePackageModel = null;
				java.util.List existingPackages = resultModel.getContextPackages();
				for(int i=0; i< existingPackages.size(); i++)
				{
					Package tempPackage = (Package) existingPackages.get(i);
					if(tempPackage.getPackageReference().equals(rulePackage))
					{
						rulePackageModel = tempPackage;
					}
				}
				if(rulePackageModel == null)
				{
					rulePackageModel = resultFactory.createPackage();
					rulePackageModel.setPackageReference(rulePackage);
					existingPackages.add(rulePackageModel);
				}
				
				// Retrieve or create the context
				Context ruleContextModel = null;
				java.util.List existingContexts = rulePackageModel.getContext();
				for(int i=0; i< existingContexts.size(); i++)
				{
					Context tempContext = (Context) existingContexts.get(i);
					if(tempContext.getContextClass().equals(ruleContext))
					{
						ruleContextModel = tempContext;
					}
				}
				if(ruleContextModel == null)
				{
					ruleContextModel = resultFactory.createContext();
					ruleContextModel.setContextClass(ruleContext);
					existingContexts.add(ruleContextModel);
				}
				
				// Create the rule
				Rule ruleModel = resultFactory.createRule();
				ruleModel.setRuleText(query.queryText());
				ruleContextModel.getRules().add(ruleModel);
				
				// Create and add the rejected items to the rule
				for(int i=0; i < resultList.size(); i++)
				{
					Item rejectedItem = resultFactory.createItem();
					rejectedItem.setReference((EObject) resultList.get(i));
					rejectedItem.setValue(EcoreUtil.copy((EObject) resultList.get(i)));
					ruleModel.getRejectedItems().add(rejectedItem);
				}
				// Compute the global result with the current result
				result = result && (resultList.size() == 0);
				
				// Create and add the selected items to the rule
				resultList = (java.util.List) resultMap.get("selected");
				for(int i=0; i < resultList.size(); i++)
				{
					Item selectedItem = resultFactory.createItem();
					selectedItem.setReference((EObject) resultList.get(i));
					selectedItem.setValue(EcoreUtil.copy((EObject) resultList.get(i)));
					ruleModel.getSelectedItems().add(selectedItem);
				}
			}
			catch(NullPointerException ex)
			{
				CorePlugin.log("Cannot compute the result of the rule : " + query.queryText(), IStatus.WARNING);
			}
		}
		CheckResultDialog resultDialog = new CheckResultDialog(getShell(), resultModel, result, true);
		resultDialog.open();*/
	}


}
