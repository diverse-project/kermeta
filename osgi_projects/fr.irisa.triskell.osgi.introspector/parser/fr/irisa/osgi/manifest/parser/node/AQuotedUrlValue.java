/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AQuotedUrlValue extends PUrlValue
{
    private PQuotedUrl _quotedUrl_;

    public AQuotedUrlValue()
    {
        // Constructor
    }

    public AQuotedUrlValue(
        @SuppressWarnings("hiding") PQuotedUrl _quotedUrl_)
    {
        // Constructor
        setQuotedUrl(_quotedUrl_);

    }

    @Override
    public Object clone()
    {
        return new AQuotedUrlValue(
            cloneNode(this._quotedUrl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAQuotedUrlValue(this);
    }

    public PQuotedUrl getQuotedUrl()
    {
        return this._quotedUrl_;
    }

    public void setQuotedUrl(PQuotedUrl node)
    {
        if(this._quotedUrl_ != null)
        {
            this._quotedUrl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._quotedUrl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._quotedUrl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._quotedUrl_ == child)
        {
            this._quotedUrl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._quotedUrl_ == oldChild)
        {
            setQuotedUrl((PQuotedUrl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
