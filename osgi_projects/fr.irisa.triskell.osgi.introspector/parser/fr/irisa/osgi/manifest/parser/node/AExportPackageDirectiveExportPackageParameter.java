/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AExportPackageDirectiveExportPackageParameter extends PExportPackageParameter
{
    private TSemicolon _semicolon_;
    private PExportPackageDirective _exportPackageDirective_;

    public AExportPackageDirectiveExportPackageParameter()
    {
        // Constructor
    }

    public AExportPackageDirectiveExportPackageParameter(
        @SuppressWarnings("hiding") TSemicolon _semicolon_,
        @SuppressWarnings("hiding") PExportPackageDirective _exportPackageDirective_)
    {
        // Constructor
        setSemicolon(_semicolon_);

        setExportPackageDirective(_exportPackageDirective_);

    }

    @Override
    public Object clone()
    {
        return new AExportPackageDirectiveExportPackageParameter(
            cloneNode(this._semicolon_),
            cloneNode(this._exportPackageDirective_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExportPackageDirectiveExportPackageParameter(this);
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    public PExportPackageDirective getExportPackageDirective()
    {
        return this._exportPackageDirective_;
    }

    public void setExportPackageDirective(PExportPackageDirective node)
    {
        if(this._exportPackageDirective_ != null)
        {
            this._exportPackageDirective_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exportPackageDirective_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._semicolon_)
            + toString(this._exportPackageDirective_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        if(this._exportPackageDirective_ == child)
        {
            this._exportPackageDirective_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        if(this._exportPackageDirective_ == oldChild)
        {
            setExportPackageDirective((PExportPackageDirective) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
