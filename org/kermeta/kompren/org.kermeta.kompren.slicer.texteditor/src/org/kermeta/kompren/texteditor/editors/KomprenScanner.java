package org.kermeta.kompren.texteditor.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.part.FileEditorInput;
import org.kermeta.kompren.lexer.KomprenTokens.KomprenToken;
import org.kermeta.kompren.lexer.*;

public class KomprenScanner implements KomprenTokenScanner {

    private ColorManager colorManager;
    private KomprenEditor editor;
    protected boolean fileHasError;
    private List<KomprenToken> tokens = null;
    private Integer currentTokenPosition = -1;
    private KomprenToken currentToken = null;

    
    
    public KomprenScanner(final ColorManager cm, final KomprenEditor ke) {
    	super();
        colorManager = cm;
        editor = ke;
    }

    
    @Override
	public void setRange(final IDocument document, final int offset, final int length) {
        try {
            // Note: do not try to parse only this range, recheck the whole document (more reliable)
            String content = document.get(0, document.getLength());
            tokens = new ArrayList<KomprenToken>();
            KomprenLexer kl = new KomprenLexer(content);
            while(!kl.atEnd())
            	tokens.add(kl.nextToken());

            currentTokenPosition = 0;
        } catch (org.eclipse.jface.text.BadLocationException e) {
            //ignore this error. It might occur during editing when locations are outdated quickly.
        }
    }

    
    
    @Override
	public void setFileHasError(final boolean fileHasError) {
        this.fileHasError = fileHasError;
    }

    
    
    @Override
	public IToken nextToken() {
        if (currentTokenPosition >= (tokens.size() - 1))
            return org.eclipse.jface.text.rules.Token.EOF;

        currentToken = tokens.get(currentTokenPosition);
        currentTokenPosition++;
        
        if(currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.KEOF)
            return org.eclipse.jface.text.rules.Token.EOF;

        RGB color = new RGB(0, 0, 0);
        int style = org.eclipse.swt.SWT.NORMAL;
        if(currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.StringLit)
            color = new RGB(0, 0, 255);
        else if (currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.Keyword) {
            color = new RGB(128, 0, 0);
            style = SWT.BOLD;
        }
        else if (currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.Delimiter) {
            color = new RGB(64, 64, 64);
            style = SWT.UNDERLINE_SINGLE;
        }
        else if (currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.Comment ||
        		currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.MLComment) {
            color = new RGB(0, 128, 0);
            style = SWT.ITALIC;
        }
        else if (currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.KIncomplet || 
        		currentToken instanceof org.kermeta.kompren.lexer.KomprenTokens.KError) {
            color = new RGB(255, 0, 0);
            style = SWT.BOLD;
            //report error to error system (marker)
            System.err.println("Incomplete token " + currentToken.toString());
            setFileHasError(true);
        }
        //System.out.println(tokenName + "\t Offset=" + getTokenOffset() + "; Length=" + getTokenLength() + "; -> " + actualToken.toString());
        TextAttribute ta = new TextAttribute(colorManager.getColor(color), null, style);
        return new Token(ta);
    }


    @Override
	public int getTokenOffset() {
        if(currentToken==null)
            return 0;
        return currentToken.getOffset();
    }


    @Override
	public int getTokenLength() {
        if (currentToken == null)
            return 0;
        return currentToken.getLength();
    }

    
    @Override
    public void notifyFileClear() {
    	//
    }

    
    @Override
    public void notifyFileHasError() {
        // Already done by each token on error (see public IToken nextToken() method)
    }
    

    @Override
    public boolean isFileOnError() {
        return fileHasError;
    }
    
    
    @Override
	public IFile getCurrentFile() {
    	return ((FileEditorInput)editor.getEditorInput()).getFile();
    }
}
