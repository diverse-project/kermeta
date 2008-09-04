/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceabilityHelperImpl.java,v 1.1 2008-09-04 15:40:38 cfaucher Exp $
 */
package traceability.impl;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

import traceability.ModelReference;
import traceability.TextReference;
import traceability.TraceabilityHelper;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TraceabilityHelperImpl extends ObjectImpl implements TraceabilityHelper
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceabilityHelperImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TraceabilityPackage.Literals.TRACEABILITY_HELPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextReference getFirstTextReference(ModelReference mr)
  {
    
    traceability.TextReference result = null;
    
      kermeta.standard.Sequence<traceability.Reference> c = null;
    //Beginning of the Inlining of the function type: collect
    
    kermeta.standard.Sequence<traceability.Reference> result_ft198 = null;
    
      result_ft198 = ((kermeta.standard.Sequence<traceability.Reference>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.standard.Sequence<traceability.Reference>"));
    
      
    {
    
      kermeta.standard.Iterator<traceability.Trace> it_ft198 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Trace>convertAsOrderedSet(mr.getSourceTraces()).iterator();
      java.lang.Boolean idLoopCond_863 = false;
      while( !idLoopCond_863 ) {
      idLoopCond_863 = it_ft198.isOff();
      if ( idLoopCond_863 ) {
      } else {
    
    traceability.Reference result_lambda = null;
    //Beginning of the Inlining of the lambda expression: collector
    traceability.Trace t = it_ft198.next();
    
      result_lambda = //Beginning of the Inlining of the function type: detect
    
    traceability.Reference result_ft199 = null;
    
      traceability.Reference elem_ft199 = null;
    
      result_ft199 = null;
    
      
    {
    
      kermeta.standard.Iterator<traceability.Reference> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<traceability.Reference>convertAsOrderedSet(t.getSourceReferences()).iterator();
      java.lang.Boolean idLoopCond_864 = false;
      while( !idLoopCond_864 ) {
      idLoopCond_864 = kermeta.standard.helper.BooleanWrapper.or(it_ft199.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft199, null));
      if ( idLoopCond_864 ) {
      } else {
    
      elem_ft199 = it_ft199.next();
    
      java.lang.Boolean idIfCond_865 = false;
    //Beginning of the Inlining of the lambda expression: detector
    traceability.Reference sr = elem_ft199;
    
      idIfCond_865 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(sr, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("traceability.TextReference"));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_865 ) {
    
      result_ft199 = elem_ft199;
    }
    
    }
      }
    }
    
    //End of the Inlining of the function type: detect
    
    //End of the Inlining of the lambda expression: collector
    
      result_ft198.add(result_lambda);
    }
      }
    }
    
    
    //callElement
    c = result_ft198;
    //End of the Inlining of the function type: collect
    
    
      {
    try {
      traceability.TextReference tr = ((traceability.TextReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(c.first(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("traceability.TextReference")));
    
      result = tr;
    } catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_5 ) {
    if( ex_switcher_5.getRealException() instanceof kermeta.exceptions.EmptyCollection ) {
    kermeta.exceptions.EmptyCollection e = (kermeta.exceptions.EmptyCollection) ex_switcher_5.getRealException();
    result = null;
    }
    }
    }
    
    return result;
    
  }

} //TraceabilityHelperImpl
