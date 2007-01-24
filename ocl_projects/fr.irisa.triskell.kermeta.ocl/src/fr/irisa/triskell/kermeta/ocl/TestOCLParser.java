package fr.irisa.triskell.kermeta.ocl;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ocl.expressions.ExpressionsFactory;
import org.eclipse.emf.ocl.expressions.OCLExpression;
import org.eclipse.emf.ocl.expressions.impl.ExpressionsFactoryImpl;
import org.eclipse.emf.ocl.internal.parser.OCLLexer;
import org.eclipse.emf.ocl.parser.EcoreEnvironmentFactory;
import org.eclipse.emf.ocl.parser.EnvironmentFactory;
import org.eclipse.emf.ocl.parser.ParserException;

public class TestOCLParser {
	Resource resource;

	protected void saveList(EList l) {
		for (Object o1 : l) {
			EObject o = (EObject) o1;
			resource.getContents().add(o);
			this.saveList(o.eCrossReferences());
		}
	}

	public void run(String ocltext, String uri) {
		MyOCLParser parser = createParser(ocltext); //$NON-NLS-1$
		EObject constraint = null;
		try {
			constraint = parser.parse();
			System.out.println(constraint.toString());
		} catch (ParserException e) {
			e.printStackTrace();
		}

		if (constraint != null) {
			URI fileURI = URI.createFileURI(uri);
			resource = new XMIResourceFactoryImpl().createResource(fileURI);
			resource.getContents().add(constraint);
			this.saveList(constraint.eCrossReferences());
			try {
				resource.save(Collections.EMPTY_MAP);
				System.out.println("save");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static final String trivial = "package p1 \n \n context  Test inv : \n 2 > 1 endpackage";   
	public static final String speeds1 = "package p1 \n \n context Function inv: \n  self.parameter->isUnique(name) \n endpackage";
	public static final String speeds2 = "package p1 \n \n context BindingEnd inv: \n  role->isEmpty() implies port.end = binding.end \n endpackage";
	public static final String speeds3 = "package p2 \n \n " +
		"context SwitchAction inv:     let dt : DataType = self.switchExpression.type()" +
		" in    self.case.value->forAll(ex | ex.conformsTo(dt))  endpackage";
	public static final String speeds4 = "package p2 \n \n " +
		"context PinLink inv: " +
		"   self.pin->forAll( p | " + 
		"      p.oclIsKindOf(BlockPin)" + 
		"       implies" +  
		"          p.oclAsType(BlockPin).block = self.block   or " +
		"			p.oclAsType(BlockPin).block.compositeBlock = self.block   ) endpackage";
	public static final String speeds5 = "package p2 \n \n " +
		" context RecordNavigation inv:" +
		"     self.mycontext.type().oclAsType(Record).field->includes(self.field) " +
	    " endpackage";

	
	public static void main(String[] args) {
		TestOCLParser oclp = new TestOCLParser();
		//oclp.run(trivial, "essai.xmi");
		//oclp.run(speeds1, "speedsOCL1.xmi");
		//oclp.run(speeds2, "speedsOCL2.xmi");
		//oclp.run(speeds3, "speedsOCL3.xmi");
		//oclp.run(speeds4, "speedsOCL4.xmi");
		oclp.run(speeds5, "speedsOCL5.xmi");
	}

	private static MyOCLParser createParser(String text) {
		OCLLexer lexer = new OCLLexer((text).toCharArray());
		MyOCLParser result = new MyOCLParser(lexer);
		return result;
	}

}
