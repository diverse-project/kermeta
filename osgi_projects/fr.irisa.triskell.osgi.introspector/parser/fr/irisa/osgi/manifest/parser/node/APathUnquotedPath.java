/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class APathUnquotedPath extends PPath
{
    private PPathUnquoted _pathUnquoted_;

    public APathUnquotedPath()
    {
        // Constructor
    }

    public APathUnquotedPath(
        @SuppressWarnings("hiding") PPathUnquoted _pathUnquoted_)
    {
        // Constructor
        setPathUnquoted(_pathUnquoted_);

    }

    @Override
    public Object clone()
    {
        return new APathUnquotedPath(
            cloneNode(this._pathUnquoted_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPathUnquotedPath(this);
    }

    public PPathUnquoted getPathUnquoted()
    {
        return this._pathUnquoted_;
    }

    public void setPathUnquoted(PPathUnquoted node)
    {
        if(this._pathUnquoted_ != null)
        {
            this._pathUnquoted_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pathUnquoted_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pathUnquoted_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pathUnquoted_ == child)
        {
            this._pathUnquoted_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pathUnquoted_ == oldChild)
        {
            setPathUnquoted((PPathUnquoted) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
