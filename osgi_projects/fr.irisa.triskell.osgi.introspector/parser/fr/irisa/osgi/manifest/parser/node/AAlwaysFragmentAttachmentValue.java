/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AAlwaysFragmentAttachmentValue extends PFragmentAttachmentValue
{
    private TAlways _always_;

    public AAlwaysFragmentAttachmentValue()
    {
        // Constructor
    }

    public AAlwaysFragmentAttachmentValue(
        @SuppressWarnings("hiding") TAlways _always_)
    {
        // Constructor
        setAlways(_always_);

    }

    @Override
    public Object clone()
    {
        return new AAlwaysFragmentAttachmentValue(
            cloneNode(this._always_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAlwaysFragmentAttachmentValue(this);
    }

    public TAlways getAlways()
    {
        return this._always_;
    }

    public void setAlways(TAlways node)
    {
        if(this._always_ != null)
        {
            this._always_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._always_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._always_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._always_ == child)
        {
            this._always_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._always_ == oldChild)
        {
            setAlways((TAlways) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
