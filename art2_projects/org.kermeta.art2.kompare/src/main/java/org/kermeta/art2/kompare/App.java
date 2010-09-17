package org.kermeta.art2.kompare;

import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2adaptation.AdaptationModel;
import org.kermeta.art2adaptation.AdaptationPrimitive;
import org.kermeta.art2adaptation.TypeAdaptation;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");


       // ContainerRoot amodel = Art2Factory.eINSTANCE.createContainerRoot();
        ContainerRoot amodel = Art2XmiHelper.load("/Users/ffouquet/Desktop/AS.art2");
        ContainerRoot nmodel = Art2XmiHelper.load("/Users/ffouquet/Desktop/AS2.art2");

        System.out.println("new model " + nmodel);


        Art2KompareBean kompareService = new Art2KompareBean();
        //Art2AdaptationDeployServiceOSGi adaptationService = new Art2AdaptationDeployServiceOSGi();
        //adaptationService.setContext(new Art2DeployManager());

        AdaptationModel adapModel = kompareService.kompare(amodel, nmodel, "duke.irisa.fr");



        System.out.println("adaptationModel" + adapModel.getAdaptations().size());


        for (AdaptationPrimitive ap : adapModel.getAdaptations()) {
            System.out.println(ap.getClass().getSimpleName());

            if(ap instanceof org.kermeta.art2adaptation.TypeAdaptation){
                System.out.println("ref="+((TypeAdaptation)ap).getRef().getName());
            }
            // if (ap.getClass().getName().contains("ComponentType")) {
            //      toRemove.add(ap);
            //  }
        }

    }
}
