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
import org.kermeta.art2.annotation.ChannelTypeFragment;
import org.kermeta.art2.annotation.ComponentFragment;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.DictionaryAttribute;
import org.kermeta.art2.annotation.DictionaryType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.Ports;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;

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
        stype.add(ChannelTypeFragment.class.getName());
        stype.add(ComponentType.class.getName());
        stype.add(Port.class.getName());
        stype.add(ProvidedPort.class.getName());
        stype.add(Provides.class.getName());
        stype.add(Requires.class.getName());
        stype.add(RequiredPort.class.getName());
        stype.add(Start.class.getName());
        stype.add(Stop.class.getName());
        stype.add(Ports.class.getName());
        stype.add(ThirdParties.class.getName());
        stype.add(ThirdParty.class.getName());
        stype.add(DictionaryAttribute.class.getName());
        stype.add(DictionaryType.class.getName());
        stype.add(ComponentFragment.class.getName());
        return stype;
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> declarations, AnnotationProcessorEnvironment env) {

        // System.out.println("hello");

        AnnotationProcessor result;

        if (declarations.isEmpty()) {
            result = AnnotationProcessors.NO_OP;
        } else {
            result = new org.kermeta.art2.framework.annotation.processor.visitor.Art2AnnotationProcessor(env);
        }
        return result;
    }
}
