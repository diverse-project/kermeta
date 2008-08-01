/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AFragmentHostEntry extends PFragmentHostEntry
{
    private TFragmentHost _fragmentHost_;
    private PFragmentHostEntryValue _fragmentHostEntryValue_;

    public AFragmentHostEntry()
    {
        // Constructor
    }

    public AFragmentHostEntry(
        @SuppressWarnings("hiding") TFragmentHost _fragmentHost_,
        @SuppressWarnings("hiding") PFragmentHostEntryValue _fragmentHostEntryValue_)
    {
        // Constructor
        setFragmentHost(_fragmentHost_);

        setFragmentHostEntryValue(_fragmentHostEntryValue_);

    }

    @Override
    public Object clone()
    {
        return new AFragmentHostEntry(
            cloneNode(this._fragmentHost_),
            cloneNode(this._fragmentHostEntryValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFragmentHostEntry(this);
    }

    public TFragmentHost getFragmentHost()
    {
        return this._fragmentHost_;
    }

    public void setFragmentHost(TFragmentHost node)
    {
        if(this._fragmentHost_ != null)
        {
            this._fragmentHost_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fragmentHost_ = node;
    }

    public PFragmentHostEntryValue getFragmentHostEntryValue()
    {
        return this._fragmentHostEntryValue_;
    }

    public void setFragmentHostEntryValue(PFragmentHostEntryValue node)
    {
        if(this._fragmentHostEntryValue_ != null)
        {
            this._fragmentHostEntryValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fragmentHostEntryValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fragmentHost_)
            + toString(this._fragmentHostEntryValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fragmentHost_ == child)
        {
            this._fragmentHost_ = null;
            return;
        }

        if(this._fragmentHostEntryValue_ == child)
        {
            this._fragmentHostEntryValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fragmentHost_ == oldChild)
        {
            setFragmentHost((TFragmentHost) newChild);
            return;
        }

        if(this._fragmentHostEntryValue_ == oldChild)
        {
            setFragmentHostEntryValue((PFragmentHostEntryValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
