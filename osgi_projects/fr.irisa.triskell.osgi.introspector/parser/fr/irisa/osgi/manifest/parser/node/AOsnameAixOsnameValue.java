/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AOsnameAixOsnameValue extends POsnameValue
{
    private TOsnameAix _osnameAix_;

    public AOsnameAixOsnameValue()
    {
        // Constructor
    }

    public AOsnameAixOsnameValue(
        @SuppressWarnings("hiding") TOsnameAix _osnameAix_)
    {
        // Constructor
        setOsnameAix(_osnameAix_);

    }

    @Override
    public Object clone()
    {
        return new AOsnameAixOsnameValue(
            cloneNode(this._osnameAix_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOsnameAixOsnameValue(this);
    }

    public TOsnameAix getOsnameAix()
    {
        return this._osnameAix_;
    }

    public void setOsnameAix(TOsnameAix node)
    {
        if(this._osnameAix_ != null)
        {
            this._osnameAix_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._osnameAix_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._osnameAix_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._osnameAix_ == child)
        {
            this._osnameAix_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._osnameAix_ == oldChild)
        {
            setOsnameAix((TOsnameAix) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
