/*
 * Created on 11 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;
import java.util.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorProvider
{

    public ColorProvider()
    {
        fColorTable = new HashMap(10);
    }

    public void dispose()
    {
        for(Iterator e = fColorTable.values().iterator(); e.hasNext(); ((Color)e.next()).dispose());
    }

    public Color getColor(RGB rgb)
    {
        if(rgb == null)
            return null;
        Color color = (Color)fColorTable.get(rgb);
        if(color == null)
        {
            color = new Color(Display.getCurrent(), rgb);
            fColorTable.put(rgb, color);
        }
        return color;
    }

    public static final RGB RED = new RGB(255, 0, 0);
    public static final RGB GREEN = new RGB(0, 255, 0);
    public static final RGB BLUE = new RGB(0, 0, 255);
    public static final RGB DARK_RED = new RGB(128, 0, 0);
    public static final RGB DARK_GREEN = new RGB(0, 128, 0);
    public static final RGB DARK_BLUE = new RGB(0, 0, 128);
    public static final RGB YELLOW = new RGB(255, 255, 0);
    public static final RGB AQUA = new RGB(0, 255, 255);
    public static final RGB FUCHSIA = new RGB(255, 0, 255);
    public static final RGB BLACK = new RGB(0, 0, 0);
    public static final RGB GREY3 = new RGB(32, 32, 32);
    public static final RGB GREY2 = new RGB(64, 64, 64);
    public static final RGB GREY1 = new RGB(128, 128, 128);
    public static final RGB WHITE = new RGB(255, 255, 255);
    private Map fColorTable;

}
