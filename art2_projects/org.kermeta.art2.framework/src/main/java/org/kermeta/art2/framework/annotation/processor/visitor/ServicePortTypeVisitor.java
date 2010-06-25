/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework.annotation.processor.visitor;

import com.sun.mirror.declaration.MethodDeclaration;
import com.sun.mirror.declaration.ParameterDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;
import com.sun.mirror.type.AnnotationType;
import com.sun.mirror.type.ArrayType;
import com.sun.mirror.type.ClassType;
import com.sun.mirror.type.DeclaredType;
import com.sun.mirror.type.EnumType;
import com.sun.mirror.type.InterfaceType;
import com.sun.mirror.type.PrimitiveType;
import com.sun.mirror.type.ReferenceType;
import com.sun.mirror.type.TypeMirror;
import com.sun.mirror.type.TypeVariable;
import com.sun.mirror.type.VoidType;
import com.sun.mirror.type.WildcardType;
import com.sun.mirror.util.TypeVisitor;
import org.kermeta.art2.framework.Art2Utility;

/**
 *
 * @author ffouquet
 */
public class ServicePortTypeVisitor implements TypeVisitor {

    art2.ServicePortType dataType = art2.Art2Factory.eINSTANCE.createServicePortType();

    @Override
    public void visitTypeMirror(TypeMirror t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visitPrimitiveType(PrimitiveType t) {
        dataType.setName(t.getKind().name());
    }

    @Override
    public void visitVoidType(VoidType t) {
        dataType.setName("void");
    }

    @Override
    public void visitReferenceType(ReferenceType t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visitDeclaredType(DeclaredType t) {
        dataType.setName(t.getDeclaration().getQualifiedName());
    }

    @Override
    public void visitClassType(ClassType t) {

       this.visitTypeDeclaration(t.getDeclaration());
    }

    @Override
    public void visitEnumType(EnumType t) {
        dataType.setName(t.getDeclaration().getQualifiedName());
    }

    @Override
    public void visitInterfaceType(InterfaceType t) {
        this.visitTypeDeclaration(t.getDeclaration());
    }

    @Override
    public void visitAnnotationType(AnnotationType t) {
        dataType.setName(t.getDeclaration().getQualifiedName());
    }

    @Override
    public void visitArrayType(ArrayType t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visitTypeVariable(TypeVariable t) {
        dataType.setName(t.getDeclaration().getSimpleName());
    }

    @Override
    public void visitWildcardType(WildcardType t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void visitTypeDeclaration(TypeDeclaration t) {

        dataType.setName(t.getQualifiedName());
        for (MethodDeclaration m : t.getMethods()) {

            //BUILD NEW OPERATION
            art2.Operation newo = art2.Art2Factory.eINSTANCE.createOperation();
            dataType.getOperations().add(newo);
            newo.setName(m.getSimpleName());

            //BUILD RETURN TYPE
            DataTypeVisitor rtv = new DataTypeVisitor();
            m.getReturnType().accept(rtv);
            newo.setReturnType(Art2Utility.getOraddDataType(rtv.dataType));

            //BUILD PARAMETER
            for (ParameterDeclaration p : m.getParameters()) {

                art2.Parameter newp = art2.Art2Factory.eINSTANCE.createParameter();
                newo.getParameters().add(newp);
                newp.setName(p.getSimpleName());

                DataTypeVisitor ptv = new DataTypeVisitor();
                p.getType().accept(ptv);
                newp.setType(Art2Utility.getOraddDataType(ptv.dataType));
            }
        }

    }
}
