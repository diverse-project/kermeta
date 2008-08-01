/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AVisibilityPrivateVisibilityValue extends PVisibilityValue
{
    private TVisibilityPrivate _visibilityPrivate_;

    public AVisibilityPrivateVisibilityValue()
    {
        // Constructor
    }

    public AVisibilityPrivateVisibilityValue(
        @SuppressWarnings("hiding") TVisibilityPrivate _visibilityPrivate_)
    {
        // Constructor
        setVisibilityPrivate(_visibilityPrivate_);

    }

    @Override
    public Object clone()
    {
        return new AVisibilityPrivateVisibilityValue(
            cloneNode(this._visibilityPrivate_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVisibilityPrivateVisibilityValue(this);
    }

    public TVisibilityPrivate getVisibilityPrivate()
    {
        return this._visibilityPrivate_;
    }

    public void setVisibilityPrivate(TVisibilityPrivate node)
    {
        if(this._visibilityPrivate_ != null)
        {
            this._visibilityPrivate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._visibilityPrivate_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._visibilityPrivate_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._visibilityPrivate_ == child)
        {
            this._visibilityPrivate_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._visibilityPrivate_ == oldChild)
        {
            setVisibilityPrivate((TVisibilityPrivate) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
