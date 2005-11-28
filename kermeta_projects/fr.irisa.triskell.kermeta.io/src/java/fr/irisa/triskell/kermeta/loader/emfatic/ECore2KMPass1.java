/*
 * Created on 10 févr. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package fr.irisa.triskell.kermeta.loader.emfatic;


import com.ibm.eclipse.emfatic.core.ast.ImportStmt;
import com.ibm.eclipse.emfatic.core.ast.QualifiedIDContainer;
import com.ibm.eclipse.emfatic.core.ast.StringLiteralOrQualifiedID;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author franck
 *
 * PASS 1 : import dependancies
 */
public class ECore2KMPass1 extends ECore2KMPass {
	
    /**
     * @param builder
     */
    public ECore2KMPass1(KermetaUnit builder) {
        super(builder);
    }
    
    public boolean beginVisit(ImportStmt importStmt) {
		StringLiteralOrQualifiedID node = importStmt.getUri();
		if (node instanceof QualifiedIDContainer) {
			builder.traceImportedUnits.put(
					builder.importModelFromID(qualifiedIDAsString(((QualifiedIDContainer)node).getQualifiedID())),
					node);
		}
		else {
			builder.traceImportedUnits.put(
					builder.importModelFromURI(node.getText()),
					node);
		}
		return false;
	}
}
