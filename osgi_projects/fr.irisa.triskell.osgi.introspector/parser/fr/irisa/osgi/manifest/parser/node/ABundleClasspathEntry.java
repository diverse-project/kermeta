/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABundleClasspathEntry extends PBundleClasspathEntry
{
    private TBundleClasspath _bundleClasspath_;
    private PBundleClasspathEntryValue _bundleClasspathEntryValue_;

    public ABundleClasspathEntry()
    {
        // Constructor
    }

    public ABundleClasspathEntry(
        @SuppressWarnings("hiding") TBundleClasspath _bundleClasspath_,
        @SuppressWarnings("hiding") PBundleClasspathEntryValue _bundleClasspathEntryValue_)
    {
        // Constructor
        setBundleClasspath(_bundleClasspath_);

        setBundleClasspathEntryValue(_bundleClasspathEntryValue_);

    }

    @Override
    public Object clone()
    {
        return new ABundleClasspathEntry(
            cloneNode(this._bundleClasspath_),
            cloneNode(this._bundleClasspathEntryValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABundleClasspathEntry(this);
    }

    public TBundleClasspath getBundleClasspath()
    {
        return this._bundleClasspath_;
    }

    public void setBundleClasspath(TBundleClasspath node)
    {
        if(this._bundleClasspath_ != null)
        {
            this._bundleClasspath_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bundleClasspath_ = node;
    }

    public PBundleClasspathEntryValue getBundleClasspathEntryValue()
    {
        return this._bundleClasspathEntryValue_;
    }

    public void setBundleClasspathEntryValue(PBundleClasspathEntryValue node)
    {
        if(this._bundleClasspathEntryValue_ != null)
        {
            this._bundleClasspathEntryValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bundleClasspathEntryValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bundleClasspath_)
            + toString(this._bundleClasspathEntryValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bundleClasspath_ == child)
        {
            this._bundleClasspath_ = null;
            return;
        }

        if(this._bundleClasspathEntryValue_ == child)
        {
            this._bundleClasspathEntryValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bundleClasspath_ == oldChild)
        {
            setBundleClasspath((TBundleClasspath) newChild);
            return;
        }

        if(this._bundleClasspathEntryValue_ == oldChild)
        {
            setBundleClasspathEntryValue((PBundleClasspathEntryValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
