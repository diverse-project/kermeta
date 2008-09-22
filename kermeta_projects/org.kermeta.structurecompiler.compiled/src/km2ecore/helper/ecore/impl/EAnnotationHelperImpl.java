/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAnnotationHelperImpl.java,v 1.3 2008-09-22 14:49:09 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import ecore.EAnnotation;
import ecore.EModelElement;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.helper.ecore.EAnnotationHelper;
import km2ecore.helper.ecore.EcorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnnotation Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EAnnotationHelperImpl extends ObjectImpl implements EAnnotationHelper
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAnnotationHelperImpl()
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
    return EcorePackage.Literals.EANNOTATION_HELPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addAnnotationPropGetter(EModelElement eModelElement, String body)
  {
    
      java.lang.Boolean idIfCond_995 = false;
      idIfCond_995 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(eModelElement));
    
      if( idIfCond_995 ) {
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create("kompiledderivedProp.getter", "body", body));
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation createEmpty(String source)
  {
    
    ecore.EAnnotation result = null;
    
      ecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EAnnotation"));
    
      annotation.setSource(source);
    
      result = annotation;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean existsAnnotationGenModelImpl(EModelElement eModelElement)
  {
    
    java.lang.Boolean result = null;
    
      //BIft:exists
    
    java.lang.Boolean result_ft232 = null;
    
      java.lang.Boolean test_ft232 = false;
    
      
    {
    
      kermeta.standard.Iterator<ecore.EAnnotation> it_ft232 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).iterator();
      java.lang.Boolean idLoopCond_996 = false;
      while( !idLoopCond_996 ) {
      idLoopCond_996 = kermeta.standard.helper.BooleanWrapper.or(it_ft232.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft232, false));
      if ( idLoopCond_996 ) {
      } else {
    
    java.lang.Boolean result_lambda_ft232 = null;
    //BIle:func
    ecore.EAnnotation a_lbdExp232 = it_ft232.next();
    
      //result_lambda_ft232 = //BIft:exists
    
    java.lang.Boolean result_ft233 = null;
    
      java.lang.Boolean test_ft233 = false;
    
      
    {
    
      kermeta.standard.Iterator<ecore.EStringToStringMapEntry> it_ft233 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(a_lbdExp232.getDetails()).iterator();
      java.lang.Boolean idLoopCond_997 = false;
      while( !idLoopCond_997 ) {
      idLoopCond_997 = kermeta.standard.helper.BooleanWrapper.or(it_ft233.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft233, false));
      if ( idLoopCond_997 ) {
      } else {
    
    java.lang.Boolean result_lambda_ft233 = null;
    //BIle:func
    ecore.EStringToStringMapEntry d_lbdExp233 = it_ft233.next();
    
      result_lambda_ft233 = kermeta.standard.helper.StringWrapper.equals(d_lbdExp233.getKey(), "body");
    //EIle:func
    
      test_ft233 = kermeta.standard.helper.BooleanWrapper.or(test_ft233, result_lambda_ft233);
    }
      }
    }
    
    
      result_ft233 = test_ft233;
    //EIft:exists
      result_lambda_ft232 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(a_lbdExp232.getSource(), "http://www.eclipse.org/emf/2002/GenModel"), result_ft233);
    //EIle:func
    
      test_ft232 = kermeta.standard.helper.BooleanWrapper.or(test_ft232, result_lambda_ft232);
    }
      }
    }
    
    
      result_ft232 = test_ft232;
    
    //CE
    result = result_ft232;
    //EIft:exists
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addEntry(EAnnotation annotation, String key, String value)
  {
    
      ecore.EStringToStringMapEntry entry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EStringToStringMapEntry"));
    
      entry.setKey(key);
    
      entry.setValue(value);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(annotation.getDetails()).add(entry);
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addAnnotationGenModelImpl(EModelElement eModelElement, String body)
  {
    
      java.lang.Boolean idIfCond_998 = false;
    //BIft:andThen
    
    java.lang.Boolean result_ft234 = null;
    
      java.lang.Boolean idIfCond_999 = false;
      idIfCond_999 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(eModelElement));
    
      if( idIfCond_999 ) {
    
      //BIle:right
    /*This variable should be never used*/ kermeta.language.structure.Object v_lbdExp234 = null;
    
      result_ft234 = kermeta.standard.helper.BooleanWrapper.not(this.existsAnnotationGenModelImpl(eModelElement));
    //EIle:right
    
    }
     else {
    
      result_ft234 = false;
    }
    
    
    //CEC
    idIfCond_998 = result_ft234;
    //EIft:andThen
    
    
      if( idIfCond_998 ) {
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create("http://www.eclipse.org/emf/2002/GenModel", "body", body));
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation createKermetaEAnnotation(String key, String value)
  {
    
    ecore.EAnnotation result = null;
    
      result = this.create(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName("kermeta").getName()), key, value);
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation createAbstract()
  {
    
    ecore.EAnnotation result = null;
    
      result = this.createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName("isAbstract").getName()), "true");
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation getKermetaEAnnotation(kermeta.language.structure.Object obj)
  {
    
    ecore.EAnnotation result = null;
    
      result = null;
    
      java.lang.Boolean idIfCond_1000 = false;
      idIfCond_1000 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj)));
    
      if( idIfCond_1000 ) {
    
      kermeta.language.structure.Property ecoreMEProp = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj).getPropertyValue("ecoreModelElement");
    
      java.lang.Boolean idIfCond_1001 = false;
      idIfCond_1001 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ecoreMEProp)), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj), ecoreMEProp))));
    
      if( idIfCond_1001 ) {
    
      //BIft:detect
    
    ecore.EAnnotation result_ft235 = null;
    
      ecore.EAnnotation elem_ft235 = null;
    
      result_ft235 = null;
    
      
    {
    
      kermeta.standard.Iterator<ecore.EAnnotation> it_ft235 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(((ecore.EModelElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(obj), ecoreMEProp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("ecore.EModelElement"))).getEAnnotations()).iterator();
      java.lang.Boolean idLoopCond_1002 = false;
      while( !idLoopCond_1002 ) {
      idLoopCond_1002 = kermeta.standard.helper.BooleanWrapper.or(it_ft235.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft235, null));
      if ( idLoopCond_1002 ) {
      } else {
    
      elem_ft235 = it_ft235.next();
    
      java.lang.Boolean idIfCond_1003 = false;
    //BIle:detector
    ecore.EAnnotation t_lbdExp235 = elem_ft235;
    
      idIfCond_1003 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp235.getSource(), kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName("kermeta").getName()));
    //EIle:detector
    
    
      if( idIfCond_1003 ) {
    
      result_ft235 = elem_ft235;
    }
    
    }
      }
    }
    
    
    //CE
    result = result_ft235;
    //EIft:detect
    
    
      java.lang.Boolean idIfCond_1004 = false;
      idIfCond_1004 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(result);
    
      if( idIfCond_1004 ) {
    
      result = this.getEmptyKermetaEAnnotation();
    }
    
    }
    
    }
     else {
    
      result = this.getEmptyKermetaEAnnotation();
    }
    
    
      result = this.getEmptyKermetaEAnnotation();
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation getEmptyKermetaEAnnotation()
  {
    
    ecore.EAnnotation result = null;
    
      ecore.EAnnotation annotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EAnnotation"));
    
      annotation.setSource(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationSource.getByName("kermeta").getName()));
    
      result = annotation;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addAnnotationPropSetter(EModelElement eModelElement, String body)
  {
    
      java.lang.Boolean idIfCond_1005 = false;
      idIfCond_1005 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(eModelElement));
    
      if( idIfCond_1005 ) {
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(this.create("kompiledderivedProp.setter", "body", body));
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation create(String source, String key, String value)
  {
    
    ecore.EAnnotation result = null;
    
      ecore.EAnnotation annotation = this.createEmpty(source);
    
      this.addEntry(annotation, key, value);
    
      result = annotation;
    
    return result;
    
  }

} //EAnnotationHelperImpl
