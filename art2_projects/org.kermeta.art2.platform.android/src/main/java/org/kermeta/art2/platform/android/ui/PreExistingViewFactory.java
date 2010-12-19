/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.platform.android.ui;

import android.view.View;
import android.widget.TabHost.TabContentFactory;

/**
 *
 * @author ffouquet
 */
public class PreExistingViewFactory implements TabContentFactory {

    private final View preExisting;

    public PreExistingViewFactory(View view) {
        preExisting = view;
    }

    @Override
    public View createTabContent(String tag) {
        return preExisting;
    }
}
