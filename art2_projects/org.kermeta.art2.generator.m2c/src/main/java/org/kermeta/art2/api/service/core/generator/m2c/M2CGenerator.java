/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.api.service.core.generator.m2c;

import org.kermeta.art2.ContainerRoot;

/**
 *
 * @author gnain
 */
public interface M2CGenerator {

    void generate(ContainerRoot actualModel, boolean generateAllProject, String generateIn);
}
