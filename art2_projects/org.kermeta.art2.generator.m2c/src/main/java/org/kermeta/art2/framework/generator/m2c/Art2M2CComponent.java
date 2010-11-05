/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator.m2c;

import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.api.service.core.generator.m2c.M2CGenerator;
import org.kermeta.art2.framework.generator.model2code.M2CRootGenerator;

/**
 *
 * @author gnain
 */
public class Art2M2CComponent implements M2CGenerator {

     private M2CRootGenerator rootGenerator = new M2CRootGenerator();

    @Override
    public void generate(ContainerRoot actualModel, boolean generateAllProject, String generateIn) {
        rootGenerator.generate(actualModel, generateAllProject, generateIn);
    }

}
