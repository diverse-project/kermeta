package org.eclipse.emf.emfatic.core.generator.ecore;

import org.eclipse.emf.emfatic.core.lang.gen.ast.EmfaticASTNode;
import org.eclipse.emf.emfatic.core.lang.gen.ast.EmfaticASTNodeVisitor;


public class TokenTextBlankSep extends EmfaticASTNodeVisitor
{

    public TokenTextBlankSep()
    {
        _buf = new StringBuffer();
    }

    public static String Get(EmfaticASTNode node)
    {
        TokenTextBlankSep tt = new TokenTextBlankSep();
        tt.visit(node);
        return tt._buf.toString();
    }

    public boolean beginVisit(EmfaticASTNode node)
    {
        String text = node.getText();
        if(text != null) {
        	String sepPre = "";
        	String sepPost = ""; 
        	String prevText = _buf.toString() +  text; 
        	if (prevText.endsWith("extends")
        			|| prevText.endsWith("super")) {
				sepPost = " ";
			} 
        	if (text.equals("extends") || text.equals("super") ) {
        		sepPre = " ";
			}
            _buf.append(sepPre + text + sepPost);
        }
        return true;
    }

    private StringBuffer _buf;
    
   
}
