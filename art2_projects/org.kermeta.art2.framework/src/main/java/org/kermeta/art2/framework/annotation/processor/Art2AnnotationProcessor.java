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
        this.env = _env;
        componentTypeAnnotationPortType = (AnnotationTypeDeclaration) this.env.getTypeDeclaration("org.kermeta.art2.annotation.ComponentType");
    }

    @Override
    public void process() {

        art2.ContainerRoot root = art2.Art2Factory.eINSTANCE.createContainerRoot();
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
        Art2XmiHelper.save("META-INF/art2Lib.xmi", root);

    }
}
