/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ALanguageDirectiveNativecodeDirective extends PNativecodeDirective
{
    private PLanguageDirective _languageDirective_;

    public ALanguageDirectiveNativecodeDirective()
    {
        // Constructor
    }

    public ALanguageDirectiveNativecodeDirective(
        @SuppressWarnings("hiding") PLanguageDirective _languageDirective_)
    {
        // Constructor
        setLanguageDirective(_languageDirective_);

    }

    @Override
    public Object clone()
    {
        return new ALanguageDirectiveNativecodeDirective(
            cloneNode(this._languageDirective_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALanguageDirectiveNativecodeDirective(this);
    }

    public PLanguageDirective getLanguageDirective()
    {
        return this._languageDirective_;
    }

    public void setLanguageDirective(PLanguageDirective node)
    {
        if(this._languageDirective_ != null)
        {
            this._languageDirective_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._languageDirective_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._languageDirective_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._languageDirective_ == child)
        {
            this._languageDirective_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._languageDirective_ == oldChild)
        {
            setLanguageDirective((PLanguageDirective) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
