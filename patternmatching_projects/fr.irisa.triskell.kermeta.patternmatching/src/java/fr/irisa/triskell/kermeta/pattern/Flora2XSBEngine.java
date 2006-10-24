/* $Id: Flora2XSBEngine.java,v 1.1 2006-10-24 12:27:26 rodrigotex Exp $
 * Project : Kermeta (First iteration)
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 4, 2005
 * Author : rodrigo.tex
 * Description : describe here file content
 * TODO : 
 *  - write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.pattern;

import net.sourceforge.flora.javaAPI.src.FloraSession;
import net.sourceforge.flora.javaAPI.src.FloraObject;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.basetypes.Iterator;
import fr.irisa.triskell.kermeta.runtime.basetypes.Map;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
 

import java.util.Properties;

import java.lang.String;
/**
 * Implementation of input and output methods (see io.kmt)
 */
public class Flora2XSBEngine {

    private static FloraSession session;
    
    private static FloraSession getSession() {        
        RuntimeMemory rm;
        if (session == null ){            
            java.lang.String configBin = System.getenv("XSB_BIN_DIRECTORY");
            java.lang.String floraDir = System.getenv("FLORA_DIRECTORY");            
            java.lang.String javaLibPath = System.getProperty("java.library.path");                           

            System.setProperty("FLORADIR", floraDir);
            System.setProperty("PROLOGDIR", configBin);
            System.setProperty("ENGINE", "Subprocess");
            //System.setProperty("ENGINE", "Native");            
            System.setProperty("java.library.path", javaLibPath +";"+configBin);               
            session = new FloraSession();             
        }    
        return session;
    }
    
    // Implementation of method write called as :
    // extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.write(output)
    public static RuntimeObject executeCommand (RuntimeObject self, RuntimeObject command) {
            java.lang.String strCommand = java.lang.String.valueOf( command.getData().get("StringValue"));
           
            getSession().ExecuteCommand(strCommand);
            return self.getFactory().getMemory().voidINSTANCE;
    } 

    // Implementation of method writeln called as :
    // extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
    public static RuntimeObject executeQueryCommand(RuntimeObject self, RuntimeObject command) {
        java.lang.String strQuery = java.lang.String.valueOf( command.getData().get("StringValue"));
        java.util.Iterator ite = getSession().ExecuteQuery(strQuery);
        java.util.List<RuntimeObject> list = new java.util.ArrayList<RuntimeObject>(); 
        while (ite.hasNext()) {
            FloraObject obj = (FloraObject) ite.next();
            RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
            fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(result, obj.toString());
            list.add(result);
        }
        RuntimeObject iteresult = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
        Iterator.setValue(iteresult, list.iterator());    
        return iteresult;
    }
    
    // Implementation of method writeln called as :
    // extern fr::irisa::triskell::kermeta::runtime::basetypes::Io.writeln(output)
    public static RuntimeObject executeQueryCommand(RuntimeObject self, RuntimeObject command, RuntimeObject vars) {
        fr.irisa.triskell.kermeta.language.structure.Class clsString = 
//          (fr.irisa.triskell.kermeta.language.structure.Class)
          //self.getFactory().createObjectFromClassName("kermeta::standard::String").getMetaclass().getData().get("kcoreObject");
                   createParametrizedClass(self, "kermeta::standard::String", null);             
      
        fr.irisa.triskell.kermeta.language.structure.Class[] hashVariables = {clsString, clsString };
        fr.irisa.triskell.kermeta.language.structure.Class clsHashOfStrings =          
          createParametrizedClass(self, "kermeta::utils::Hashtable", hashVariables);
      
        java.util.List list = new java.util.ArrayList();

        java.lang.String strQuery = java.lang.String.valueOf( command.getData().get("StringValue"));
        java.util.Vector<java.lang.String> vectorParams = new java.util.Vector<java.lang.String>();
        
        java.util.ArrayList varlist = Collection.getArrayList(vars);
        java.util.Iterator iteVars = varlist.iterator();
        while ( iteVars.hasNext()){
            String str = java.lang.String.valueOf( ((RuntimeObject) iteVars.next()).getData().get("StringValue"));
            vectorParams.add( str);
            System.out.println("parameters= "+ str);            
        }

        System.out.println("######################################");               
        System.out.println("query = "+ strQuery);        
        java.util.Iterator ite = getSession().ExecuteQuery(strQuery, vectorParams); 
        while (ite.hasNext()) {
            System.out.println("######################################");               
            System.out.println("The query has responses ");            
            java.util.HashMap hash = (java.util.HashMap) ite.next();
            RuntimeObject hashKermeta = createRuntimeObject(self, clsHashOfStrings);
            
            java.util.Iterator iteKeys = hash.keySet().iterator();
            while (iteKeys.hasNext()) {
               java.lang.String varName = (java.lang.String) iteKeys.next();
               FloraObject value = (FloraObject) hash.get(varName);
               System.out.println("######################################");               
               System.out.println("I found "+ varName+" = "+ value.toString());
               RuntimeObject keyKermeta = self.getFactory().createObjectFromClassName("kermeta::standard::String");
               fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(keyKermeta, varName);
               RuntimeObject valKermeta = self.getFactory().createObjectFromClassName("kermeta::standard::String");
               fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(valKermeta, value.toString());               
                
               Map.put(hashKermeta, keyKermeta, valKermeta);               
            }
            list.add(hashKermeta);
        } 
       
        
        fr.irisa.triskell.kermeta.language.structure.Class[] iteVariables = {clsHashOfStrings};
        fr.irisa.triskell.kermeta.language.structure.Class clsIteratorOfHash =          
            createParametrizedClass(self, "kermeta::standard::Iterator", iteVariables);       
        
        RuntimeObject iteresult = createRuntimeObject(self, clsIteratorOfHash);
        Iterator.setValue(iteresult, list.iterator());    
        return iteresult;
    }
    
    
    public static RuntimeObject close (RuntimeObject self) {
      close();
      return self.getFactory().getMemory().voidINSTANCE;    
    }
    
    private static void close () {
        if (session != null) session.close();
        session = null;    
      }           
    
    private static RuntimeObject createRuntimeObject(RuntimeObject self, fr.irisa.triskell.kermeta.language.structure.Class classOfObject) {
        return self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass( classOfObject));        
    }  

    private static fr.irisa.triskell.kermeta.language.structure.Class createParametrizedClass(RuntimeObject self, String className) {
        return createParametrizedClass(self, className, null);        
    }
    
    private static fr.irisa.triskell.kermeta.language.structure.Class createParametrizedClass(RuntimeObject self, String className,
            fr.irisa.triskell.kermeta.language.structure.Class[] variableTypes) {
        // creating a class
        fr.irisa.triskell.kermeta.language.structure.Class it_class = self
                .getFactory().getMemory().getUnit().struct_factory.createClass();
        // setting class definition accoarding Classname
        it_class.setTypeDefinition((ClassDefinition) self.getFactory().getMemory().getUnit().typeDefinitionLookup(className));
        if (variableTypes != null && variableTypes.length > 0) {
            for (int i = 0; i < variableTypes.length; i++) {
                TypeVariableBinding binding = self.getFactory().getMemory()
                    .getUnit().struct_factory.createTypeVariableBinding();
                binding.setVariable((TypeVariable) it_class.getTypeDefinition()
                        .getTypeParameter().get(i));

                binding.setType( variableTypes[i]);
                it_class.getTypeParamBinding().add(binding);                
            }
        } 
        return it_class;
    }
    
    public static void main( java.lang.String[] args){
        System.out.println("Inicio");
        getSession();        
        System.out.println("exec sdf command");
          getSession().ExecuteCommand("insert{ A : B}.");
          Flora2XSBEngine.close();          
          //System.out.println("Fim");
      }    

} 
 
