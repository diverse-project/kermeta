/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework.annotation.processor.visitor;

import org.kermeta.art2.TypedElement;
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
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.framework.Art2Utility;


/**
 *
 * @author ffouquet
 */
public class DataTypeVisitor implements TypeVisitor {

    TypedElement dataType = Art2Factory.eINSTANCE.createTypedElement();

    public TypedElement getDataType() {
        return dataType;
    }

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
        System.out.println(dataType.getName());
    }

    @Override
    public void visitClassType(ClassType t) {
        dataType.setName(t.getDeclaration().getQualifiedName());
        //  System.out.println(dataType.getName());
        for (TypeMirror tm : t.getActualTypeArguments()) {
            DataTypeVisitor dtv = new DataTypeVisitor();
            tm.accept(dtv);
            //System.out.println(dtv.dataType.getName());
            dataType.getGenericTypes().add(Art2Utility.getOraddDataType(dtv.getDataType()));
        }

    }

    @Override
    public void visitEnumType(EnumType t) {
        dataType.setName(t.getDeclaration().getQualifiedName());
    }

    @Override
    public void visitInterfaceType(InterfaceType t) {

        dataType.setName(t.getDeclaration().getQualifiedName());
        //System.out.println(dataType.getName() + t.getActualTypeArguments().size());
        for (TypeMirror tm : t.getActualTypeArguments()) {
            DataTypeVisitor dtv = new DataTypeVisitor();
            tm.accept(dtv);
            //System.out.println(dtv.dataType.getName());
            dataType.getGenericTypes().add(Art2Utility.getOraddDataType(dtv.getDataType()));
        }

        //    System.out.println(dataType.getName());
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
}
