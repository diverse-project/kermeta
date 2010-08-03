/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.core.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.Art2Package;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService;
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService;
import org.kermeta.art2.api.service.core.kompare.ModelKompareService;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2adaptation.AdaptationModel;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 *
 * @author ffouquet
 */
public class Art2CoreBean implements Art2ModelHandlerService {

    private ContainerRoot model;
    private List<ContainerRoot> previousModel = new ArrayList();

    @Override
    public ContainerRoot getLastModel() {
        return model;
    }

    @Override
    public void updateModel(ContainerRoot _model) {
        if (_model == null) {
            System.out.println("Null Model");
            return;
        }

        AdaptationModel adaptationModel = kompareService.kompare(model, _model, nodeName);
        /* TODO CALL DEPLOY */
        Boolean deployResult = deployService.deploy(adaptationModel);
        /* TODO CALL ROLLBACK IF NECESSARY */


        /* Transactional TODO */
        previousModel.add(model);
        model = _model;
        /* TODO CALL KOMPARE */



        System.out.println("Deploy result " + deployResult);
    }

    @Override
    public List<ContainerRoot> getPreviousModel() {
        return previousModel;
    }

    public void init() {

        try {
            System.out.println("ART2Node=" + nodeName);

            

            /* DEBUG MODE ONLY */
            ContainerRoot umodel = Art2XmiHelper.load("/Users/ffouquet/Desktop/distart.xmi");
            model = Art2Factory.eINSTANCE.createContainerRoot();
            updateModel(umodel);
            System.out.println("Model DEBUG UPDATED");
            if (true) {
                return;
            }
            System.out.println("NoUse STATMENT");

            File lastModelssaved = this.bundle.getBundleContext().getDataFile("lastModel.xmi");
            if (lastModelssaved.getTotalSpace() != 0) {
                /* Load previous state */
                model = Art2XmiHelper.load(lastModelssaved.getAbsolutePath());
            } else {
                /* INIT EMPTY model */
                model = Art2Factory.eINSTANCE.createContainerRoot();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        Art2XmiHelper.save(this.bundle.getBundleContext().getDataFile("lastModel.xmi").getAbsolutePath(), model);
    }
    private Bundle bundle = null;
    private BundleContext bundleContext = null;
    private org.kermeta.art2.api.service.core.kompare.ModelKompareService kompareService;
    private org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService deployService;
    private String nodeName;

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setDeployService(Art2AdaptationDeployService deployService) {
        this.deployService = deployService;
    }

    public void setKompareService(ModelKompareService kompareService) {
        this.kompareService = kompareService;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }
}
