/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.kermeta.art2.framework.Art2Handler;
import org.kermeta.art2.ui.editor.Art2UIKernel;

/**
 *
 * @author ffouquet
 */
public class SendModelCommand implements Command {

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }
    private Art2UIKernel kernel;

    @Override
    public void execute(Object p) {

        CamelContext camelContext = new DefaultCamelContext();
        ProducerTemplate producer = camelContext.createProducerTemplate();
        try {
            camelContext.start();

            /* Create Temp file */
            
            org.kermeta.art2.framework.Art2XmiHelper.save(null, null);

            //producer.sendBody("",);

            camelContext.stop();
        } catch (Exception ex) {
            Logger.getLogger(SendModelCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
