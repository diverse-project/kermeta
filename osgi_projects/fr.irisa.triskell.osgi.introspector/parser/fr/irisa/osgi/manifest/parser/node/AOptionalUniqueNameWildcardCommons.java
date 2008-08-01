/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AOptionalUniqueNameWildcardCommons extends PUniqueNameWildcardCommons
{
    private TOptional _optional_;

    public AOptionalUniqueNameWildcardCommons()
    {
        // Constructor
    }

    public AOptionalUniqueNameWildcardCommons(
        @SuppressWarnings("hiding") TOptional _optional_)
    {
        // Constructor
        setOptional(_optional_);

    }

    @Override
    public Object clone()
    {
        return new AOptionalUniqueNameWildcardCommons(
            cloneNode(this._optional_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOptionalUniqueNameWildcardCommons(this);
    }

    public TOptional getOptional()
    {
        return this._optional_;
    }

    public void setOptional(TOptional node)
    {
        if(this._optional_ != null)
        {
            this._optional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optional_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._optional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._optional_ == child)
        {
            this._optional_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._optional_ == oldChild)
        {
            setOptional((TOptional) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
