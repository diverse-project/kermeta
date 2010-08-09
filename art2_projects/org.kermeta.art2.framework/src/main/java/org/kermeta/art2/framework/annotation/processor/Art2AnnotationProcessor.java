/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework.annotation.processor;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import com.sun.mirror.declaration.Declaration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.framework.Art2Generator;
import org.kermeta.art2.framework.Art2Utility;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.framework.annotation.processor.visitor.ComponentTypeVisitor;

/**
 *
 * @author ffouquet
 */
public class Art2AnnotationProcessor implements AnnotationProcessor {

    private AnnotationProcessorEnvironment env;
    private AnnotationTypeDeclaration componentTypeAnnotationPortType;

    public Art2AnnotationProcessor(AnnotationProcessorEnvironment _env) {

        //System.out.println("HELLO");

        this.env = _env;
        componentTypeAnnotationPortType = (AnnotationTypeDeclaration) this.env.getTypeDeclaration("org.kermeta.art2.annotation.ComponentType");
    }

    @Override
    public void process() {

        //System.out.println("hello");

        ContainerRoot root = Art2Factory.eINSTANCE.createContainerRoot();
        Art2Utility.root_$eq(root);

        //GENERATE & RUN ComponentType visitor
        Collection<ComponentTypeVisitor> ctVisitors = new ArrayList<ComponentTypeVisitor>();

        for (Declaration decl : env.getDeclarationsAnnotatedWith(componentTypeAnnotationPortType)) {
            ComponentTypeVisitor ctv = new ComponentTypeVisitor(env, root);
            ctVisitors.add(ctv);
            decl.accept(ctv);
        }

        Art2Generator.generatePortWrapper(root, env.getFiler());
        Art2Generator.generatePortProxy(root, env.getFiler());
        Art2Generator.generateFactory(root, env.getFiler());
        System.out.println("Saving to "+ Art2Generator.generateLibURI(env));
        Art2XmiHelper.save(Art2Generator.generateLibURI(env), root);

    }
}
