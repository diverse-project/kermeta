/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AOsnameVxworksOsnameValue extends POsnameValue
{
    private TOsnameVxworks _osnameVxworks_;

    public AOsnameVxworksOsnameValue()
    {
        // Constructor
    }

    public AOsnameVxworksOsnameValue(
        @SuppressWarnings("hiding") TOsnameVxworks _osnameVxworks_)
    {
        // Constructor
        setOsnameVxworks(_osnameVxworks_);

    }

    @Override
    public Object clone()
    {
        return new AOsnameVxworksOsnameValue(
            cloneNode(this._osnameVxworks_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOsnameVxworksOsnameValue(this);
    }

    public TOsnameVxworks getOsnameVxworks()
    {
        return this._osnameVxworks_;
    }

    public void setOsnameVxworks(TOsnameVxworks node)
    {
        if(this._osnameVxworks_ != null)
        {
            this._osnameVxworks_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._osnameVxworks_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._osnameVxworks_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._osnameVxworks_ == child)
        {
            this._osnameVxworks_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._osnameVxworks_ == oldChild)
        {
            setOsnameVxworks((TOsnameVxworks) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
