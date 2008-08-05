/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABundleCategoryEntry extends PBundleCategoryEntry
{
    private TBundleCategory _bundleCategory_;
    private PBundleCategoryEntryValue _bundleCategoryEntryValue_;

    public ABundleCategoryEntry()
    {
        // Constructor
    }

    public ABundleCategoryEntry(
        @SuppressWarnings("hiding") TBundleCategory _bundleCategory_,
        @SuppressWarnings("hiding") PBundleCategoryEntryValue _bundleCategoryEntryValue_)
    {
        // Constructor
        setBundleCategory(_bundleCategory_);

        setBundleCategoryEntryValue(_bundleCategoryEntryValue_);

    }

    @Override
    public Object clone()
    {
        return new ABundleCategoryEntry(
            cloneNode(this._bundleCategory_),
            cloneNode(this._bundleCategoryEntryValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABundleCategoryEntry(this);
    }

    public TBundleCategory getBundleCategory()
    {
        return this._bundleCategory_;
    }

    public void setBundleCategory(TBundleCategory node)
    {
        if(this._bundleCategory_ != null)
        {
            this._bundleCategory_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bundleCategory_ = node;
    }

    public PBundleCategoryEntryValue getBundleCategoryEntryValue()
    {
        return this._bundleCategoryEntryValue_;
    }

    public void setBundleCategoryEntryValue(PBundleCategoryEntryValue node)
    {
        if(this._bundleCategoryEntryValue_ != null)
        {
            this._bundleCategoryEntryValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bundleCategoryEntryValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bundleCategory_)
            + toString(this._bundleCategoryEntryValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bundleCategory_ == child)
        {
            this._bundleCategory_ = null;
            return;
        }

        if(this._bundleCategoryEntryValue_ == child)
        {
            this._bundleCategoryEntryValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bundleCategory_ == oldChild)
        {
            setBundleCategory((TBundleCategory) newChild);
            return;
        }

        if(this._bundleCategoryEntryValue_ == oldChild)
        {
            setBundleCategoryEntryValue((PBundleCategoryEntryValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
