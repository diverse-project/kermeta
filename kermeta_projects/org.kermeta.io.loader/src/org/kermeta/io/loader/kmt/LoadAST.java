

/*$Id: LoadAST.java,v 1.3 2008-02-18 08:49:00 ftanguy Exp $
* Project : org.kermeta.io.loader
* File : 	LoadAST.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.kmt;

import java.io.IOException;
import java.util.Map;

import org.kermeta.io.loader.action.KMTLoadingAction;
import org.kermeta.io.loader.datas.KMTLoadingDatas;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.modelhelper.ASTHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;

public class LoadAST extends KMTLoadingAction {

	public void performAction(KMTLoadingDatas datas, Map<?, ?> options) {
		try {
			CompUnit ast;
			String content = null;
			if ( options != null && options.containsKey("content") ) {
				content = (String) options.get("content");
				// This option can only be used once because it is only for the first file.
				options.remove("content");
			}
			if ( content != null )
				ast = ASTHelper.parseString( content );
			else
				ast = ASTHelper.parse( datas.getKermetaUnit().getUri() );
			datas.ast = ast;
		} catch (RecognitionException e) {
			//e.printStackTrace();
			datas.getKermetaUnit().parsingError(e);
		} catch (TokenStreamException e) {
			//e.printStackTrace();
			datas.getKermetaUnit().parsingError(e);
		} catch (IOException e) {
			//e.printStackTrace();
			datas.getKermetaUnit().error("File " + datas.getKermetaUnit().getUri() + " does not exist.");
		}
	}

}


