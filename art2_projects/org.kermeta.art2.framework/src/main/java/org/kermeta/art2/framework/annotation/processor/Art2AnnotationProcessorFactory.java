/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework.annotation.processor;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.apt.AnnotationProcessors;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;

/**
 *
 * @author ffouquet
 */
public class Art2AnnotationProcessorFactory implements
        AnnotationProcessorFactory {

    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptyList();
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        Collection<String> stype = new ArrayList();
        stype.add(ComponentType.class.getName());
        stype.add(Port.class.getName());
        stype.add(ProvidedPort.class.getName());
        stype.add(Provides.class.getName());
        stype.add(Requires.class.getName());
        stype.add(RequiredPort.class.getName());
        return stype;
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> declarations, AnnotationProcessorEnvironment env) {
        AnnotationProcessor result;

        if (declarations.isEmpty()) {
            result = AnnotationProcessors.NO_OP;
        } else {
            result = new Art2AnnotationProcessor(env);
        }
        return result;
    }
}
