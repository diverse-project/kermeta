/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AExportPackageEntry extends PExportPackageEntry
{
    private TExportPackage _exportPackage_;
    private PExportPackageEntryValue1 _exportPackageEntryValue1_;

    public AExportPackageEntry()
    {
        // Constructor
    }

    public AExportPackageEntry(
        @SuppressWarnings("hiding") TExportPackage _exportPackage_,
        @SuppressWarnings("hiding") PExportPackageEntryValue1 _exportPackageEntryValue1_)
    {
        // Constructor
        setExportPackage(_exportPackage_);

        setExportPackageEntryValue1(_exportPackageEntryValue1_);

    }

    @Override
    public Object clone()
    {
        return new AExportPackageEntry(
            cloneNode(this._exportPackage_),
            cloneNode(this._exportPackageEntryValue1_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExportPackageEntry(this);
    }

    public TExportPackage getExportPackage()
    {
        return this._exportPackage_;
    }

    public void setExportPackage(TExportPackage node)
    {
        if(this._exportPackage_ != null)
        {
            this._exportPackage_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exportPackage_ = node;
    }

    public PExportPackageEntryValue1 getExportPackageEntryValue1()
    {
        return this._exportPackageEntryValue1_;
    }

    public void setExportPackageEntryValue1(PExportPackageEntryValue1 node)
    {
        if(this._exportPackageEntryValue1_ != null)
        {
            this._exportPackageEntryValue1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exportPackageEntryValue1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exportPackage_)
            + toString(this._exportPackageEntryValue1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exportPackage_ == child)
        {
            this._exportPackage_ = null;
            return;
        }

        if(this._exportPackageEntryValue1_ == child)
        {
            this._exportPackageEntryValue1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exportPackage_ == oldChild)
        {
            setExportPackage((TExportPackage) newChild);
            return;
        }

        if(this._exportPackageEntryValue1_ == oldChild)
        {
            setExportPackageEntryValue1((PExportPackageEntryValue1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
