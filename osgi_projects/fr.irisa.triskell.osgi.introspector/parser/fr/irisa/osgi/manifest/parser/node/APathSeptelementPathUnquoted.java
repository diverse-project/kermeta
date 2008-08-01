/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.*;
import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class APathSeptelementPathUnquoted extends PPathUnquoted
{
    private TDot _first_;
    private TDot _second_;
    private TPathSep _pathSep_;
    private PPathElement _pathElement_;
    private final LinkedList<PPathSuffix> _pathSuffix_ = new LinkedList<PPathSuffix>();

    public APathSeptelementPathUnquoted()
    {
        // Constructor
    }

    public APathSeptelementPathUnquoted(
        @SuppressWarnings("hiding") TDot _first_,
        @SuppressWarnings("hiding") TDot _second_,
        @SuppressWarnings("hiding") TPathSep _pathSep_,
        @SuppressWarnings("hiding") PPathElement _pathElement_,
        @SuppressWarnings("hiding") List<PPathSuffix> _pathSuffix_)
    {
        // Constructor
        setFirst(_first_);

        setSecond(_second_);

        setPathSep(_pathSep_);

        setPathElement(_pathElement_);

        setPathSuffix(_pathSuffix_);

    }

    @Override
    public Object clone()
    {
        return new APathSeptelementPathUnquoted(
            cloneNode(this._first_),
            cloneNode(this._second_),
            cloneNode(this._pathSep_),
            cloneNode(this._pathElement_),
            cloneList(this._pathSuffix_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPathSeptelementPathUnquoted(this);
    }

    public TDot getFirst()
    {
        return this._first_;
    }

    public void setFirst(TDot node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public TDot getSecond()
    {
        return this._second_;
    }

    public void setSecond(TDot node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
    }

    public TPathSep getPathSep()
    {
        return this._pathSep_;
    }

    public void setPathSep(TPathSep node)
    {
        if(this._pathSep_ != null)
        {
            this._pathSep_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pathSep_ = node;
    }

    public PPathElement getPathElement()
    {
        return this._pathElement_;
    }

    public void setPathElement(PPathElement node)
    {
        if(this._pathElement_ != null)
        {
            this._pathElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pathElement_ = node;
    }

    public LinkedList<PPathSuffix> getPathSuffix()
    {
        return this._pathSuffix_;
    }

    public void setPathSuffix(List<PPathSuffix> list)
    {
        this._pathSuffix_.clear();
        this._pathSuffix_.addAll(list);
        for(PPathSuffix e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._first_)
            + toString(this._second_)
            + toString(this._pathSep_)
            + toString(this._pathElement_)
            + toString(this._pathSuffix_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        if(this._pathSep_ == child)
        {
            this._pathSep_ = null;
            return;
        }

        if(this._pathElement_ == child)
        {
            this._pathElement_ = null;
            return;
        }

        if(this._pathSuffix_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._first_ == oldChild)
        {
            setFirst((TDot) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((TDot) newChild);
            return;
        }

        if(this._pathSep_ == oldChild)
        {
            setPathSep((TPathSep) newChild);
            return;
        }

        if(this._pathElement_ == oldChild)
        {
            setPathElement((PPathElement) newChild);
            return;
        }

        for(ListIterator<PPathSuffix> i = this._pathSuffix_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PPathSuffix) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
