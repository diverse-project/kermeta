/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelingUnitImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EAnnotation;
import ecore.EClassifier;
import ecore.EPackage;

import java.util.Collection;

import kermeta.language.structure.Filter;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Require;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.Using;

import kermeta.standard.OrderedSet;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getEcorePackages <em>Ecore Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getExcludeFilters <em>Exclude Filters</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getSuperOperationsToCompileInHelper <em>Super Operations To Compile In Helper</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getReferencedModelingUnits <em>Referenced Modeling Units</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelingUnitImpl#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingUnitImpl extends TraceabilityImpl<EAnnotation> implements ModelingUnit
{
  /**
   * The cached value of the '{@link #getEcorePackages() <em>Ecore Packages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcorePackages()
   * @generated
   * @ordered
   */
  protected EList<EPackage> ecorePackages;

  /**
   * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsings()
   * @generated
   * @ordered
   */
  protected EList<Using> usings;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<kermeta.language.structure.Package> packages;

  /**
   * The cached value of the '{@link #getIncludeFilters() <em>Include Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeFilters()
   * @generated
   * @ordered
   */
  protected EList<Filter> includeFilters;

  /**
   * The cached value of the '{@link #getExcludeFilters() <em>Exclude Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeFilters()
   * @generated
   * @ordered
   */
  protected EList<Filter> excludeFilters;

  /**
   * The cached value of the '{@link #getSuperOperationsToCompileInHelper() <em>Super Operations To Compile In Helper</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperOperationsToCompileInHelper()
   * @generated
   * @ordered
   */
  protected EList<Operation> superOperationsToCompileInHelper;

  /**
   * The cached value of the '{@link #getReferencedModelingUnits() <em>Referenced Modeling Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedModelingUnits()
   * @generated
   * @ordered
   */
  protected EList<ModelingUnit> referencedModelingUnits;

  /**
   * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequires()
   * @generated
   * @ordered
   */
  protected EList<Require> requires;

  /**
   * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryPoints()
   * @generated
   * @ordered
   */
  protected EList<EAnnotation> entryPoints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelingUnitImpl()
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
    return StructurePackage.Literals.MODELING_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackage> getEcorePackages()
  {
    if (ecorePackages == null)
    {
      ecorePackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, StructurePackage.MODELING_UNIT__ECORE_PACKAGES);
    }
    return ecorePackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Using> getUsings()
  {
    if (usings == null)
    {
      usings = new EObjectContainmentEList.Resolving<Using>(Using.class, this, StructurePackage.MODELING_UNIT__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<kermeta.language.structure.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList.Resolving<kermeta.language.structure.Package>(kermeta.language.structure.Package.class, this, StructurePackage.MODELING_UNIT__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Filter> getIncludeFilters()
  {
    if (includeFilters == null)
    {
      includeFilters = new EObjectContainmentEList.Resolving<Filter>(Filter.class, this, StructurePackage.MODELING_UNIT__INCLUDE_FILTERS);
    }
    return includeFilters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Filter> getExcludeFilters()
  {
    if (excludeFilters == null)
    {
      excludeFilters = new EObjectContainmentEList.Resolving<Filter>(Filter.class, this, StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS);
    }
    return excludeFilters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getSuperOperationsToCompileInHelper()
  {
    if (superOperationsToCompileInHelper == null)
    {
      superOperationsToCompileInHelper = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER);
    }
    return superOperationsToCompileInHelper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelingUnit> getReferencedModelingUnits()
  {
    if (referencedModelingUnits == null)
    {
      referencedModelingUnits = new EObjectResolvingEList<ModelingUnit>(ModelingUnit.class, this, StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS);
    }
    return referencedModelingUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Require> getRequires()
  {
    if (requires == null)
    {
      requires = new EObjectContainmentEList.Resolving<Require>(Require.class, this, StructurePackage.MODELING_UNIT__REQUIRES);
    }
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EAnnotation> getEntryPoints()
  {
    if (entryPoints == null)
    {
      entryPoints = new EObjectResolvingEList<EAnnotation>(EAnnotation.class, this, StructurePackage.MODELING_UNIT__ENTRY_POINTS);
    }
    return entryPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kermeta.language.structure.Package retrievePackage(String qname)
  {
    
    kermeta.language.structure.Package result = null;
    
      kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, "::");
    
      java.lang.Boolean idIfCond_30 = false;
      idIfCond_30 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);
    
      if( idIfCond_30 ) {
    
      set_qname.add(qname);
    }
    
    
      kermeta.language.structure.Package pack = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Package result_ft11 = null;
    
      kermeta.language.structure.Package elem_ft11 = null;
    
      result_ft11 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft11 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();
      java.lang.Boolean idLoopCond_31 = false;
      while( !idLoopCond_31 ) {
      idLoopCond_31 = kermeta.standard.helper.BooleanWrapper.or(it_ft11.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft11, null));
      if ( idLoopCond_31 ) {
      } else {
    
      elem_ft11 = it_ft11.next();
    
      java.lang.Boolean idIfCond_32 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Package p = elem_ft11;
    
      idIfCond_32 = kermeta.standard.helper.StringWrapper.equals(p.getName(), set_qname.at(0));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_32 ) {
    
      result_ft11 = elem_ft11;
    }
    
    }
      }
    }
    
    
    //callElement
    pack = result_ft11;
    //End of the Inlining of the function type: detect
    
    
      
    {
    
      java.lang.Integer i = 1;
      java.lang.Boolean idLoopCond_33 = false;
      while( !idLoopCond_33 ) {
      idLoopCond_33 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, set_qname.size());
      if ( idLoopCond_33 ) {
      } else {
    
      pack = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Package result_ft12 = null;
    
      kermeta.language.structure.Package elem_ft12 = null;
    
      result_ft12 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft12 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();
      java.lang.Boolean idLoopCond_34 = false;
      while( !idLoopCond_34 ) {
      idLoopCond_34 = kermeta.standard.helper.BooleanWrapper.or(it_ft12.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft12, null));
      if ( idLoopCond_34 ) {
      } else {
    
      elem_ft12 = it_ft12.next();
    
      java.lang.Boolean idIfCond_35 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Package p = elem_ft12;
    
      idIfCond_35 = kermeta.standard.helper.StringWrapper.equals(p.getName(), set_qname.at(i));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_35 ) {
    
      result_ft12 = elem_ft12;
    }
    
    }
      }
    }
    
    //End of the Inlining of the function type: detect
    
    
      i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
    }
      }
    }
    
    
      result = pack;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createKRuntimeError(KM2EcoreContext context)
  {
    
      ecore.EDataType exception_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EDataType"));
    
      exception_EDataType.setName("KRuntimeError");
    
      exception_EDataType.setInstanceClassName(context.getJAVA_CLASS_EXCEPTION_SWITCHER());
    
      exception_EDataType.setSerializable(false);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(this.retrievePackage("kermeta::exceptions").getEcoreModelElement().getEClassifiers()).add(exception_EDataType);
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void preprocess(KM2EcoreContext context)
  {
    
      this.createKRuntimeError(context);
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void compileStaticOperation(Operation op, KM2EcoreContext context)
  {
    
      simk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForSuper(op, context);
    
      java.lang.Boolean idIfCond_36 = false;
      idIfCond_36 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(smContext));
    
      if( idIfCond_36 ) {
    
      simk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.StaticMethod"));
    
      staticMethod.setName(kermeta.standard.helper.StringWrapper.plus("super_", ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(op.getFinalName(), context)));
    
      staticMethod.setBody(op.createBehaviorJava(context));
    
      staticMethod.setUsages(simk.SMUsage.getByName("Super"));
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(smContext.getStaticMethods()).add(staticMethod);
    
      simk.SMReturn smReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.SMReturn"));
    
      smReturn.setType(op.getType().createBehaviorJava(context));
    
      java.lang.Boolean idIfCond_37 = false;
      idIfCond_37 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(smReturn.getType());
    
      if( idIfCond_37 ) {
    
      smReturn.setType("void");
    }
    
    
      staticMethod.setSMReturn(smReturn);
    
      simk.SMParameter default_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.SMParameter"));
    
      default_param.setName("self");
    
      default_param.setType(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(op), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).qualifiedName(), "::", "\\."));
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(default_param);
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft13 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(op.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_38 = false;
      while( !idLoopCond_38 ) {
      idLoopCond_38 = it_ft13.isOff();
      if ( idLoopCond_38 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Parameter p = it_ft13.next();
    
      simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.SMParameter"));
    
      param.setName(p.getName());
    
      java.lang.Boolean idIfCond_39 = false;
      idIfCond_39 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType")));
    
      if( idIfCond_39 ) {
    
      param.setType(p.getType().createBehaviorJava(context));
    
      java.lang.Boolean idIfCond_40 = false;
      idIfCond_40 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(param.getType());
    
      if( idIfCond_40 ) {
    
      param.setType("void");
    }
    
    }
     else {
    }
    
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void applyPass1(KM2EcoreContext context)
  {
    
      ecore.EAnnotation ecoreAnnotation = this.createEcoreModelElement(context);
    
      this.setEcoreModelElement(ecoreAnnotation);
    
      //Beginning of the Inlining of the function type: eachOwnedElement
    
      
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Require> it_ft15 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Require>convertAsOrderedSet(this.getRequires()).iterator();
      java.lang.Boolean idLoopCond_41 = false;
      while( !idLoopCond_41 ) {
      idLoopCond_41 = it_ft15.isOff();
      if ( idLoopCond_41 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Require p = it_ft15.next();
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Require p = p_ft15;
    
      p.applyPass1(context);
    //End of the Inlining of the lambda expression: func
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Using> it_ft16 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Using>convertAsOrderedSet(this.getUsings()).iterator();
      java.lang.Boolean idLoopCond_42 = false;
      while( !idLoopCond_42 ) {
      idLoopCond_42 = it_ft16.isOff();
      if ( idLoopCond_42 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Using p = it_ft16.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft17 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();
      java.lang.Boolean idLoopCond_43 = false;
      while( !idLoopCond_43 ) {
      idLoopCond_43 = it_ft17.isOff();
      if ( idLoopCond_43 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Package p = it_ft17.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    //End of the Inlining of the function type: eachOwnedElement
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft18 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();
      java.lang.Boolean idLoopCond_44 = false;
      while( !idLoopCond_44 ) {
      idLoopCond_44 = it_ft18.isOff();
      if ( idLoopCond_44 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Package p = it_ft18.next();
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).add(p.getEcoreModelElement());
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAnnotation createEcoreModelElement(KM2EcoreContext context)
  {
    
    ecore.EAnnotation result = null;
    
      ecore.EAnnotation ecoreAnnotation = ((ecore.EAnnotation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EAnnotation"));
    
      ecoreAnnotation.setSource("ModelingUnit");
    
      ecore.EStringToStringMapEntry requireEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EStringToStringMapEntry"));
    
      requireEntry.setKey("require");
    
      requireEntry.setValue("");
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(requireEntry);
    
      ecore.EStringToStringMapEntry usingEntry = ((ecore.EStringToStringMapEntry) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EStringToStringMapEntry"));
    
      usingEntry.setKey("using");
    
      usingEntry.setValue("");
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStringToStringMapEntry>convertAsOrderedSet(ecoreAnnotation.getDetails()).add(usingEntry);
    
      result = ecoreAnnotation;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void compileSuperOperation(KM2EcoreContext context)
  {
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft19 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getSuperOperationsToCompileInHelper()).iterator();
      java.lang.Boolean idLoopCond_45 = false;
      while( !idLoopCond_45 ) {
      idLoopCond_45 = it_ft19.isOff();
      if ( idLoopCond_45 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Operation op = it_ft19.next();
    
      context.setStaticOperationMode(true);
    
      this.compileStaticOperation(op, context);
    
      context.setStaticOperationMode(false);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void postprocess(KM2EcoreContext context)
  {
    
      this.compileSuperOperation(context);
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedSet<kermeta.language.structure.Package> getAllPackages()
  {
    
    kermeta.standard.OrderedSet<kermeta.language.structure.Package> result = null;
    
      result = ((kermeta.standard.OrderedSet<kermeta.language.structure.Package>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.standard.OrderedSet<kermeta.language.structure.Package>"));
    
      kermeta.language.structure.Package pack = null;
    //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft20 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();
      java.lang.Boolean idLoopCond_46 = false;
      while( !idLoopCond_46 ) {
      idLoopCond_46 = it_ft20.isOff();
      if ( idLoopCond_46 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Package p = it_ft20.next();
    
      result.add(p);
    
      result.addAll(p.getAllSubPackages());
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    
    //callElement
    pack = result_ft20;
    //End of the Inlining of the function type: each
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition getTypeDefinitionByQualifiedName(String qname)
  {
    
    kermeta.language.structure.TypeDefinition result = null;
    
      kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, "::");
    
      java.lang.Boolean idIfCond_47 = false;
      idIfCond_47 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);
    
      if( idIfCond_47 ) {
    
      set_qname.add(qname);
    }
    
    
      kermeta.language.structure.Package pack = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Package result_ft21 = null;
    
      kermeta.language.structure.Package elem_ft21 = null;
    
      result_ft21 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft21 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getPackages()).iterator();
      java.lang.Boolean idLoopCond_48 = false;
      while( !idLoopCond_48 ) {
      idLoopCond_48 = kermeta.standard.helper.BooleanWrapper.or(it_ft21.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft21, null));
      if ( idLoopCond_48 ) {
      } else {
    
      elem_ft21 = it_ft21.next();
    
      java.lang.Boolean idIfCond_49 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Package p = elem_ft21;
    
      idIfCond_49 = kermeta.standard.helper.StringWrapper.equals(p.getName(), set_qname.at(0));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_49 ) {
    
      result_ft21 = elem_ft21;
    }
    
    }
      }
    }
    
    
    //callElement
    pack = result_ft21;
    //End of the Inlining of the function type: detect
    
    
      
    {
    
      java.lang.Integer i = 1;
      java.lang.Boolean idLoopCond_50 = false;
      while( !idLoopCond_50 ) {
      idLoopCond_50 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));
      if ( idLoopCond_50 ) {
      } else {
    
      pack = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Package result_ft22 = null;
    
      kermeta.language.structure.Package elem_ft22 = null;
    
      result_ft22 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft22 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(pack.getNestedPackage()).iterator();
      java.lang.Boolean idLoopCond_51 = false;
      while( !idLoopCond_51 ) {
      idLoopCond_51 = kermeta.standard.helper.BooleanWrapper.or(it_ft22.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft22, null));
      if ( idLoopCond_51 ) {
      } else {
    
      elem_ft22 = it_ft22.next();
    
      java.lang.Boolean idIfCond_52 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Package p = elem_ft22;
    
      idIfCond_52 = kermeta.standard.helper.StringWrapper.equals(p.getName(), set_qname.at(i));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_52 ) {
    
      result_ft22 = elem_ft22;
    }
    
    }
      }
    }
    
    //End of the Inlining of the function type: detect
    
    
      i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
    }
      }
    }
    
    
      result = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.TypeDefinition result_ft23 = null;
    
      kermeta.language.structure.TypeDefinition elem_ft23 = null;
    
      result_ft23 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft23 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(pack.getOwnedTypeDefinition()).iterator();
      java.lang.Boolean idLoopCond_53 = false;
      while( !idLoopCond_53 ) {
      idLoopCond_53 = kermeta.standard.helper.BooleanWrapper.or(it_ft23.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft23, null));
      if ( idLoopCond_53 ) {
      } else {
    
      elem_ft23 = it_ft23.next();
    
      java.lang.Boolean idIfCond_54 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.TypeDefinition c = elem_ft23;
    
      idIfCond_54 = kermeta.standard.helper.StringWrapper.equals(c.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_54 ) {
    
      result_ft23 = elem_ft23;
    }
    
    }
      }
    }
    
    //End of the Inlining of the function type: detect
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier getEClassifierByQualifiedName(String qname)
  {
    
    ecore.EClassifier result = null;
    
      kermeta.standard.OrderedSet<java.lang.String> set_qname = kermeta.standard.helper.StringWrapper.split(qname, "::");
    
      java.lang.Boolean idIfCond_55 = false;
      idIfCond_55 = kermeta.standard.helper.IntegerWrapper.equals(set_qname.size(), 0);
    
      if( idIfCond_55 ) {
    
      set_qname.add(qname);
    }
    
    
      ecore.EPackage pack = null;
    //Beginning of the Inlining of the function type: detect
    
    ecore.EPackage result_ft24 = null;
    
      ecore.EPackage elem_ft24 = null;
    
      result_ft24 = null;
    
      
    {
    
      kermeta.standard.Iterator<ecore.EPackage> it_ft24 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getEcorePackages()).iterator();
      java.lang.Boolean idLoopCond_56 = false;
      while( !idLoopCond_56 ) {
      idLoopCond_56 = kermeta.standard.helper.BooleanWrapper.or(it_ft24.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft24, null));
      if ( idLoopCond_56 ) {
      } else {
    
      elem_ft24 = it_ft24.next();
    
      java.lang.Boolean idIfCond_57 = false;
    //Beginning of the Inlining of the lambda expression: detector
    ecore.EPackage p = elem_ft24;
    
      idIfCond_57 = kermeta.standard.helper.StringWrapper.equals(p.getName(), set_qname.at(0));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_57 ) {
    
      result_ft24 = elem_ft24;
    }
    
    }
      }
    }
    
    
    //callElement
    pack = result_ft24;
    //End of the Inlining of the function type: detect
    
    
      
    {
    
      java.lang.Integer i = 1;
      java.lang.Boolean idLoopCond_58 = false;
      while( !idLoopCond_58 ) {
      idLoopCond_58 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1));
      if ( idLoopCond_58 ) {
      } else {
    
      pack = null;
    //Beginning of the Inlining of the function type: detect
    
    ecore.EPackage result_ft25 = null;
    
      ecore.EPackage elem_ft25 = null;
    
      result_ft25 = null;
    
      
    {
    
      kermeta.standard.Iterator<ecore.EPackage> it_ft25 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(pack.getESubpackages()).iterator();
      java.lang.Boolean idLoopCond_59 = false;
      while( !idLoopCond_59 ) {
      idLoopCond_59 = kermeta.standard.helper.BooleanWrapper.or(it_ft25.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft25, null));
      if ( idLoopCond_59 ) {
      } else {
    
      elem_ft25 = it_ft25.next();
    
      java.lang.Boolean idIfCond_60 = false;
    //Beginning of the Inlining of the lambda expression: detector
    ecore.EPackage p = elem_ft25;
    
      idIfCond_60 = kermeta.standard.helper.StringWrapper.equals(p.getName(), set_qname.at(i));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_60 ) {
    
      result_ft25 = elem_ft25;
    }
    
    }
      }
    }
    
    //End of the Inlining of the function type: detect
    
    
      i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
    }
      }
    }
    
    
      result = null;
    //Beginning of the Inlining of the function type: detect
    
    ecore.EClassifier result_ft26 = null;
    
      ecore.EClassifier elem_ft26 = null;
    
      result_ft26 = null;
    
      
    {
    
      kermeta.standard.Iterator<ecore.EClassifier> it_ft26 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(pack.getEClassifiers()).iterator();
      java.lang.Boolean idLoopCond_61 = false;
      while( !idLoopCond_61 ) {
      idLoopCond_61 = kermeta.standard.helper.BooleanWrapper.or(it_ft26.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft26, null));
      if ( idLoopCond_61 ) {
      } else {
    
      elem_ft26 = it_ft26.next();
    
      java.lang.Boolean idIfCond_62 = false;
    //Beginning of the Inlining of the lambda expression: detector
    ecore.EClassifier c = elem_ft26;
    
      idIfCond_62 = kermeta.standard.helper.StringWrapper.equals(c.getName(), set_qname.at(kermeta.standard.helper.IntegerWrapper.minus(set_qname.size(), 1)));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_62 ) {
    
      result_ft26 = elem_ft26;
    }
    
    }
      }
    }
    
    //End of the Inlining of the function type: detect
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StructurePackage.MODELING_UNIT__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case StructurePackage.MODELING_UNIT__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
        return ((InternalEList<?>)getIncludeFilters()).basicRemove(otherEnd, msgs);
      case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
        return ((InternalEList<?>)getExcludeFilters()).basicRemove(otherEnd, msgs);
      case StructurePackage.MODELING_UNIT__REQUIRES:
        return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
        return getEcorePackages();
      case StructurePackage.MODELING_UNIT__USINGS:
        return getUsings();
      case StructurePackage.MODELING_UNIT__PACKAGES:
        return getPackages();
      case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
        return getIncludeFilters();
      case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
        return getExcludeFilters();
      case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
        return getSuperOperationsToCompileInHelper();
      case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
        return getReferencedModelingUnits();
      case StructurePackage.MODELING_UNIT__REQUIRES:
        return getRequires();
      case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
        return getEntryPoints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
        getEcorePackages().clear();
        getEcorePackages().addAll((Collection<? extends EPackage>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends kermeta.language.structure.Package>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
        getIncludeFilters().clear();
        getIncludeFilters().addAll((Collection<? extends Filter>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
        getExcludeFilters().clear();
        getExcludeFilters().addAll((Collection<? extends Filter>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
        getSuperOperationsToCompileInHelper().clear();
        getSuperOperationsToCompileInHelper().addAll((Collection<? extends Operation>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
        getReferencedModelingUnits().clear();
        getReferencedModelingUnits().addAll((Collection<? extends ModelingUnit>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__REQUIRES:
        getRequires().clear();
        getRequires().addAll((Collection<? extends Require>)newValue);
        return;
      case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
        getEntryPoints().clear();
        getEntryPoints().addAll((Collection<? extends EAnnotation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
        getEcorePackages().clear();
        return;
      case StructurePackage.MODELING_UNIT__USINGS:
        getUsings().clear();
        return;
      case StructurePackage.MODELING_UNIT__PACKAGES:
        getPackages().clear();
        return;
      case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
        getIncludeFilters().clear();
        return;
      case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
        getExcludeFilters().clear();
        return;
      case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
        getSuperOperationsToCompileInHelper().clear();
        return;
      case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
        getReferencedModelingUnits().clear();
        return;
      case StructurePackage.MODELING_UNIT__REQUIRES:
        getRequires().clear();
        return;
      case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
        getEntryPoints().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StructurePackage.MODELING_UNIT__ECORE_PACKAGES:
        return ecorePackages != null && !ecorePackages.isEmpty();
      case StructurePackage.MODELING_UNIT__USINGS:
        return usings != null && !usings.isEmpty();
      case StructurePackage.MODELING_UNIT__PACKAGES:
        return packages != null && !packages.isEmpty();
      case StructurePackage.MODELING_UNIT__INCLUDE_FILTERS:
        return includeFilters != null && !includeFilters.isEmpty();
      case StructurePackage.MODELING_UNIT__EXCLUDE_FILTERS:
        return excludeFilters != null && !excludeFilters.isEmpty();
      case StructurePackage.MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER:
        return superOperationsToCompileInHelper != null && !superOperationsToCompileInHelper.isEmpty();
      case StructurePackage.MODELING_UNIT__REFERENCED_MODELING_UNITS:
        return referencedModelingUnits != null && !referencedModelingUnits.isEmpty();
      case StructurePackage.MODELING_UNIT__REQUIRES:
        return requires != null && !requires.isEmpty();
      case StructurePackage.MODELING_UNIT__ENTRY_POINTS:
        return entryPoints != null && !entryPoints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelingUnitImpl
