/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public abstract class KpANTLRParserBase extends org.antlr.runtime3_2_0.Parser implements org.kermeta.kp.editor.IKpTextParser {
	
	/**
	 * the index of the last token that was handled by retrieveLayoutInformation()
	 */
	private int lastPosition2;
	
	/**
	 * a collection to store all anonymous tokens
	 */
	protected java.util.List<org.antlr.runtime3_2_0.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime3_2_0.CommonToken>();
	
	/**
	 * A collection that is filled with commands to be executed after parsing. This
	 * collection is cleared before parsing starts and returned as part of the parse
	 * result object.
	 */
	protected java.util.Collection<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>> postParseCommands;
	
	public KpANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input) {
		super(input);
	}
	
	public KpANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input, org.antlr.runtime3_2_0.RecognizerSharedState state) {
		super(input, state);
	}
	
	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, org.kermeta.kp.editor.grammar.KpSyntaxElement syntaxElement, Object object, boolean ignoreTokensAfterLastVisibleToken) {
		if (element == null) {
			return;
		}
		// null must be accepted, since the layout information that is found at the end of
		// documents (just before the EOF character) is not associated with a particular
		// syntax element.
		boolean isElementToStore = syntaxElement == null;
		isElementToStore |= syntaxElement instanceof org.kermeta.kp.editor.grammar.KpPlaceholder;
		isElementToStore |= syntaxElement instanceof org.kermeta.kp.editor.grammar.KpKeyword;
		isElementToStore |= syntaxElement instanceof org.kermeta.kp.editor.grammar.KpEnumerationTerminal;
		isElementToStore |= syntaxElement instanceof org.kermeta.kp.editor.grammar.KpBooleanTerminal;
		if (!isElementToStore) {
			return;
		}
		org.kermeta.kp.editor.mopp.KpLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		for (org.antlr.runtime3_2_0.CommonToken anonymousToken : anonymousTokens) {
			layoutInformationAdapter.addLayoutInformation(new org.kermeta.kp.editor.mopp.KpLayoutInformation(syntaxElement, object, anonymousToken.getStartIndex(), anonymousToken.getText(), null));
		}
		anonymousTokens.clear();
		int currentPos = getTokenStream().index();
		if (currentPos == 0) {
			return;
		}
		int endPos = currentPos - 1;
		if (ignoreTokensAfterLastVisibleToken) {
			for (; endPos >= this.lastPosition2; endPos--) {
				org.antlr.runtime3_2_0.Token token = getTokenStream().get(endPos);
				int _channel = token.getChannel();
				if (_channel != 99) {
					break;
				}
			}
		}
		StringBuilder hiddenTokenText = new StringBuilder();
		StringBuilder visibleTokenText = new StringBuilder();
		org.antlr.runtime3_2_0.CommonToken firstToken = null;
		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
			org.antlr.runtime3_2_0.Token token = getTokenStream().get(pos);
			if (firstToken == null) {
				firstToken = (org.antlr.runtime3_2_0.CommonToken) token;
			}
			int _channel = token.getChannel();
			if (_channel == 99) {
				hiddenTokenText.append(token.getText());
			} else {
				visibleTokenText.append(token.getText());
			}
		}
		int offset = -1;
		if (firstToken != null) {
			offset = firstToken.getStartIndex();
		}
		layoutInformationAdapter.addLayoutInformation(new org.kermeta.kp.editor.mopp.KpLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
	}
	
	protected org.kermeta.kp.editor.mopp.KpLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.kermeta.kp.editor.mopp.KpLayoutInformationAdapter) {
				return (org.kermeta.kp.editor.mopp.KpLayoutInformationAdapter) adapter;
			}
		}
		org.kermeta.kp.editor.mopp.KpLayoutInformationAdapter newAdapter = new org.kermeta.kp.editor.mopp.KpLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType container, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		final int position;
		if (reference.isMany()) {
			position = ((java.util.List<?>) container.eGet(reference)).size();
		} else {
			position = -1;
		}
		
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.registerContextDependentProxy(factory, container, reference, id, proxy, position);
				return true;
			}
		});
	}
	
}
