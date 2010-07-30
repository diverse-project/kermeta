package sitac.view.util;

import sitac.view.ItemType;
import android.content.Context;

public abstract class OverlayItemAbstractFactory {

	public abstract ItemType createNewItem(int type,int group, Context ctx);
}
