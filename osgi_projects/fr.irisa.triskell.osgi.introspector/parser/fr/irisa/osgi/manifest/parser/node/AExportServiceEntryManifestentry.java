/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AExportServiceEntryManifestentry extends PManifestentry
{
    private PExportServiceEntry _exportServiceEntry_;

    public AExportServiceEntryManifestentry()
    {
        // Constructor
    }

    public AExportServiceEntryManifestentry(
        @SuppressWarnings("hiding") PExportServiceEntry _exportServiceEntry_)
    {
        // Constructor
        setExportServiceEntry(_exportServiceEntry_);

    }

    @Override
    public Object clone()
    {
        return new AExportServiceEntryManifestentry(
            cloneNode(this._exportServiceEntry_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExportServiceEntryManifestentry(this);
    }

    public PExportServiceEntry getExportServiceEntry()
    {
        return this._exportServiceEntry_;
    }

    public void setExportServiceEntry(PExportServiceEntry node)
    {
        if(this._exportServiceEntry_ != null)
        {
            this._exportServiceEntry_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exportServiceEntry_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exportServiceEntry_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exportServiceEntry_ == child)
        {
            this._exportServiceEntry_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exportServiceEntry_ == oldChild)
        {
            setExportServiceEntry((PExportServiceEntry) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
