/* $Id: DeleteASTNodes.java,v 1.2 2008-02-14 07:12:48 uid21732 Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPrettyPrinter.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Author : zdrey
 * Description :
 *  The 7th pass to convert a KMT to KM, which consist to adding the commments 
 * in the code as annotation of the kermeta model elements
 * 
 * History :
 * 		06/06/05 Removed almost everything.
 * 		Now only @ and "/**" prefixed annotations are stored as tags.
 * 		TODO : now, visit all the annotable elements :
 * 		subPackageDecl, classDecl, enumDecl, parameters (?), enumLiteral, 
 * 		fAssignment (i.e any Expression?), blocks (when empty), require/using?
 */
package org.kermeta.io.loader.kmt;


import java.util.Map;

import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.IKMTLoadingAction;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.loader.datas.KMTLoadingDatas;


/**
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation).
 * How does it work :
 * 	- each grammar rule (see kermeta.ast) that is a sequence containing a annotationLst list 
 * corresponds to a model element that is "allowed" to contain Tags (Tag kermeta elements). So, for 
 * such model elements, we implement a specific visit() method. 
 */
public class DeleteASTNodes implements ILoadingAction, IKMTLoadingAction  {
    
	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		performAction( (KMTLoadingDatas) datas, options );
	}

	public void performAction(KMTLoadingDatas datas, Map<?, ?> options) {
		datas.getKermetaUnit().setNeedASTTraces(false);
	}
	
}
