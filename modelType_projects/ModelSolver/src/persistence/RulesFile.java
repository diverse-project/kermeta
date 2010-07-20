package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Antonio de Almeida Souza Neto
 */

import org.eclipse.emf.ecore.*;

public class RulesFile {
	
	private ArrayList<String> fileContents = new ArrayList<String>();
	
	public ArrayList<String> readFile(String fileName) {
		
		String line = "";
        StringBuffer sb = new StringBuffer();

        try{
                FileReader reader = new FileReader(fileName);
                BufferedReader bufReader = new BufferedReader(reader);

            while (line != null ){
                        line = bufReader.readLine();
                        if (line != null){
                                sb = new StringBuffer(line);
                                fileContents.add(sb.toString());
                        }
            }

            bufReader.close();
            reader.close();
        }
        catch (IOException e) {
            System.out.print("Error reading file " + e.getMessage());
        }
        return fileContents;
    }
	
	public EPackage createInitialSolution(String fileName){
		EPackage epackage = EcoreFactory.eINSTANCE.createEPackage();
		String line;
		boolean inRule = false;
		boolean firstElement = true;
		ENamedElement eobject = EcoreFactory.eINSTANCE.createEClass();
		ENamedElement eContainer = EcoreFactory.eINSTANCE.createEClass();
		
		readFile(fileName);
		
		for (int i = 0; i< fileContents.size() ; i++) {
			line = fileContents.get(i);
			
			if(line.indexOf("rule")==0){
				inRule = true;
				continue;
			}
			if(line.indexOf("then")==0){
				epackage.getEClassifiers().add((EClassifier)eobject);
				inRule = false;
				firstElement = true;
				continue;
			}
			if(!inRule){
				continue;
			}
			//it's a rule element
			if(inRule && line.contains("$var") && !line.contains("EPackage")){
				if(line.contains("EClass")){
					eContainer = EcoreFactory.eINSTANCE.createEClass();
					
					if(line.contains("name")){
						line = line.substring(line.indexOf("==") + 4);
						eContainer.setName(line.substring(0, line.indexOf("\"") ) );
						
					}
					if(!firstElement ){
						if(line.contains("EStructuralFeatures") || line.contains("EAllAttributes") ){
							((EClass)eContainer).getEStructuralFeatures().add((EStructuralFeature)eobject);
						}else if (line.contains("EAllOperations")){
							((EClass)eContainer).getEOperations().add((EOperation)eobject);
						}
					}

				}
				else if(line.contains("EReference")){
					eContainer = EcoreFactory.eINSTANCE.createEReference();
					
					if(line.contains("name")){
						line = line.substring(line.indexOf("==") + 4);
						eContainer.setName(line.substring(0, line.indexOf("\"") ) );
					}
					if(!firstElement ){
						((EReference)eContainer).setEType((EClass)eobject);
						
					}
					
				}
				else if(line.contains("EAttribute")){
					eContainer = EcoreFactory.eINSTANCE.createEAttribute();
					
					if(line.contains("name")){
						line = line.substring(line.indexOf("==") + 4);
						eContainer.setName(line.substring(0, line.indexOf("\"") ) );
					}
					if(!firstElement ){
						((EAttribute)eContainer).setEType((EDataType)eobject);
					}
				}
				else if(line.contains("EOperation")){
					eContainer = EcoreFactory.eINSTANCE.createEOperation();
					
					if(line.contains("name")){
						line = line.substring(line.indexOf("==") + 4);
						eContainer.setName(line.substring(0, line.indexOf("\"") ) );
					}
					if(!firstElement ){
						((EOperation)eContainer).setEType((EClassifier)eobject);
					}
				}
				else if(line.contains("EDataType")){
					eContainer = EcoreFactory.eINSTANCE.createEDataType();
					
					if(line.contains("name")){
						line = line.substring(line.indexOf("==") + 4);
						eContainer.setName(line.substring(0, line.indexOf("\"") ) );
					}
				}
				
				eobject = eContainer;
				firstElement = false;
			}
			
			
		}

		epackage.setName("Model");
		
		return epackage;
	}
	
}
