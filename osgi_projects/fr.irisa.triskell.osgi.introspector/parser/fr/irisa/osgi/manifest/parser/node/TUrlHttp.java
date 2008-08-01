/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class TUrlHttp extends Token
{
    public TUrlHttp()
    {
        super.setText("http://");
    }

    public TUrlHttp(int line, int pos)
    {
        super.setText("http://");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUrlHttp(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUrlHttp(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUrlHttp text.");
    }
}
