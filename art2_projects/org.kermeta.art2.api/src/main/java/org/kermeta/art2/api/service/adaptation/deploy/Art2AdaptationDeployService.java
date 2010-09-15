

package org.kermeta.art2.api.service.adaptation.deploy;

import org.kermeta.art2adaptation.AdaptationModel;

/**
 *
 * @author ffouquet
 */
public interface Art2AdaptationDeployService {

    public boolean deploy(AdaptationModel model,String nodeName);

}
