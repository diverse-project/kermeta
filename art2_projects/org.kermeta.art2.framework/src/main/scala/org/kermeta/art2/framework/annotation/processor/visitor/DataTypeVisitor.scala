/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import org.kermeta.art2.TypedElement
import com.sun.mirror.`type`.AnnotationType
import com.sun.mirror.`type`.ArrayType
import com.sun.mirror.`type`.ClassType
import com.sun.mirror.`type`.DeclaredType
import com.sun.mirror.`type`.EnumType
import com.sun.mirror.`type`.InterfaceType
import com.sun.mirror.`type`.PrimitiveType
import com.sun.mirror.`type`.ReferenceType
import com.sun.mirror.`type`.TypeMirror
import com.sun.mirror.`type`.TypeVariable
import com.sun.mirror.`type`.VoidType
import com.sun.mirror.`type`.WildcardType
import com.sun.mirror.`type`.PrimitiveType
import com.sun.mirror.util.TypeVisitor
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.framework.Art2Utility
import scala.collection.JavaConversions._

class DataTypeVisitor extends TypeVisitor {

  var dataType = Art2Factory.eINSTANCE.createTypedElement();
  def getDataType():TypedElement={return dataType}

  def visitTypeMirror(t:TypeMirror)= {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  def visitPrimitiveType(t:PrimitiveType)= {
    t.getKind match {
      case PrimitiveType.Kind.BOOLEAN => dataType.setName("scala.Boolean")
      case PrimitiveType.Kind.BYTE => dataType.setName("scala.Byte")
      case PrimitiveType.Kind.CHAR => dataType.setName("scala.Char")
      case PrimitiveType.Kind.DOUBLE => dataType.setName("scala.Double")
      case PrimitiveType.Kind.FLOAT => dataType.setName("scala.Float")
      case PrimitiveType.Kind.INT => dataType.setName("scala.Int")
      case PrimitiveType.Kind.LONG => dataType.setName("scala.Long")
      case PrimitiveType.Kind.SHORT => dataType.setName("scala.Short")
    }
  }

  def visitVoidType(t:VoidType)= {
    dataType.setName("void");
  }

  def visitReferenceType(t:ReferenceType)= {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  def visitDeclaredType(t:DeclaredType)= {
    dataType.setName(t.getDeclaration().getQualifiedName());
    System.out.println(dataType.getName());
  }

  def visitClassType(t:ClassType)= {
    dataType.setName(t.getDeclaration().getQualifiedName());
    t.getActualTypeArguments().foreach{tm=>
      var dtv = new DataTypeVisitor();
      tm.accept(dtv);
      dataType.getGenericTypes().add(Art2Utility.getOraddDataType(dtv.getDataType()));
    }

  }

  def visitEnumType(t:EnumType)= {
    dataType.setName(t.getDeclaration().getQualifiedName())
  }

  def visitInterfaceType(t:InterfaceType)= {
    dataType.setName(t.getDeclaration().getQualifiedName());
    t.getActualTypeArguments().foreach{tm=>
      var dtv = new DataTypeVisitor();
      tm.accept(dtv);
      dataType.getGenericTypes().add(Art2Utility.getOraddDataType(dtv.getDataType()));
    }
  }

  def visitAnnotationType(t:AnnotationType) ={
    dataType.setName(t.getDeclaration().getQualifiedName());
  }

  def visitArrayType(t:ArrayType) ={
    throw new UnsupportedOperationException("Not supported yet.");
  }

  def visitTypeVariable(t:TypeVariable)= {
    dataType.setName(t.getDeclaration().getSimpleName());
  }

  def visitWildcardType(t:WildcardType)= {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
