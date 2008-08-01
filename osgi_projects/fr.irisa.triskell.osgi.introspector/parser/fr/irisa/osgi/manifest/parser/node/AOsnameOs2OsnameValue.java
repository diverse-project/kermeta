/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AOsnameOs2OsnameValue extends POsnameValue
{
    private TOsnameOs2 _osnameOs2_;

    public AOsnameOs2OsnameValue()
    {
        // Constructor
    }

    public AOsnameOs2OsnameValue(
        @SuppressWarnings("hiding") TOsnameOs2 _osnameOs2_)
    {
        // Constructor
        setOsnameOs2(_osnameOs2_);

    }

    @Override
    public Object clone()
    {
        return new AOsnameOs2OsnameValue(
            cloneNode(this._osnameOs2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOsnameOs2OsnameValue(this);
    }

    public TOsnameOs2 getOsnameOs2()
    {
        return this._osnameOs2_;
    }

    public void setOsnameOs2(TOsnameOs2 node)
    {
        if(this._osnameOs2_ != null)
        {
            this._osnameOs2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._osnameOs2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._osnameOs2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._osnameOs2_ == child)
        {
            this._osnameOs2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._osnameOs2_ == oldChild)
        {
            setOsnameOs2((TOsnameOs2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
