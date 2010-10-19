/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 
package org.kermeta.art2.framework.annotation.processor;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import com.sun.mirror.declaration.Declaration;
import com.sun.mirror.declaration.TypeDeclaration;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.framework.generator.Art2Generator;
import org.kermeta.art2.framework.Art2Utility;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.framework.annotation.processor.visitor.ChannelTypeFragmentVisitor;
import org.kermeta.art2.framework.annotation.processor.visitor.ComponentTypeVisitor;
import org.kermeta.art2.framework.generator.Art2ActivatorGenerator;
import org.kermeta.art2.framework.generator.Art2FactoryGenerator;


public class Art2AnnotationProcessor implements AnnotationProcessor {

    private AnnotationProcessorEnvironment env;
    private AnnotationTypeDeclaration componentTypeAnnotationPortType;
    private AnnotationTypeDeclaration channelTypeAnnotationPortType;

    public Art2AnnotationProcessor(AnnotationProcessorEnvironment _env) {

        //System.out.println("HELLO");

        this.env = _env;
        componentTypeAnnotationPortType = (AnnotationTypeDeclaration) this.env.getTypeDeclaration(ComponentType.class.getCanonicalName());
        channelTypeAnnotationPortType = (AnnotationTypeDeclaration) this.env.getTypeDeclaration(ChannelTypeFragment.class.getCanonicalName());
    }

    @Override
    public void process() {
        ContainerRoot root = Art2Factory.eINSTANCE.createContainerRoot();
        Art2Utility.root_$eq(root);


        //GENERATE & RUN ComponentType visitor
        //Collection<ComponentTypeVisitor> ctVisitors = new ArrayList<ComponentTypeVisitor>();
        for ( TypeDeclaration type :  env.getTypeDeclarations()){

            ComponentType o = type.getAnnotation(ComponentType.class);
            System.out.println("CT="+o);
            ChannelTypeFragment o2 = type.getAnnotation(ChannelTypeFragment.class);
            System.out.println("C="+o2);

        }


        for (Declaration decl : env.getDeclarationsAnnotatedWith(componentTypeAnnotationPortType)) {
            org.kermeta.art2.ComponentType componentType = Art2Factory.eINSTANCE.createComponentType();
            ComponentTypeVisitor ctv = new ComponentTypeVisitor(componentType,env, root);
            //ctVisitors.add(ctv);
            decl.accept(ctv);
        }

        //GENERATE & RUN ChannelTypeFragment visitor
        //Collection<ChannelTypeFragmentVisitor> channelTVisitors = new ArrayList<ChannelTypeFragmentVisitor>();
        for (Declaration decl : env.getDeclarationsAnnotatedWith(channelTypeAnnotationPortType)) {
            org.kermeta.art2.ChannelType channelType = Art2Factory.eINSTANCE.createChannelType();
            ChannelTypeFragmentVisitor ctv = new ChannelTypeFragmentVisitor(channelType,env, root);
            //channelTVisitors.add(ctv);
            decl.accept(ctv);
        }


       // Art2ProvidedPortGenerator.generatePort(root, env.getFiler());
        //Art2Generator.generatePortWrapper(root, env.getFiler());
        Art2Generator.generatePort(root, env.getFiler());
        Art2FactoryGenerator.generateFactory(root, env.getFiler());
        Art2ActivatorGenerator.generateActivator(root, env.getFiler());
        System.out.println("Saving to "+ Art2Generator.generateLibURI(env));
        Art2XmiHelper.save(Art2Generator.generateLibURI(env), root);

    }
}
*/