/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.netbeans.editor.parser;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;

/**
 *
 * @author ffouquet
 */
public class KermetaSyntaxErrorsHighlightingTaskFactory extends TaskFactory {

    public Collection<? extends SchedulerTask> create (Snapshot snapshot) {
        return Collections.singleton (new KermetaSyntaxErrorsHighlightingTask ());
    }
}