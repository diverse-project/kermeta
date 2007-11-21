

package org.eclipse.emf.emfatic.ui.editor;

import org.eclipse.emf.emfatic.core.util.EmfaticBasicTypes;
import org.eclipse.emf.emfatic.core.util.EmfaticKeywords;
import org.eclipse.gymnast.runtime.ui.editor.LDTCodeScanner;
import org.eclipse.gymnast.runtime.ui.util.LDTColorProvider;
import org.eclipse.jface.text.rules.MultiLineRule;

public class EmfaticCodeScanner extends LDTCodeScanner
{

    public EmfaticCodeScanner()
    {
    }

    public void initKeywords()
    {
        addKeywords(EmfaticKeywords.GetNormalKeywords(), LDTColorProvider.BLUE);
        addKeywords(EmfaticKeywords.GetSpecialKeywords(), LDTColorProvider.DARK_BLUE, null, 1);
        addKeywords(EmfaticBasicTypes.GetBasicTypeNames(), LDTColorProvider.DARK_GREEN);
    }

    public void initLiterals()
    {
        org.eclipse.jface.text.rules.IToken literalToken = getLiteralToken();
        addRule(new MultiLineRule("\"", "\"", literalToken, '\\'));
    }
}
