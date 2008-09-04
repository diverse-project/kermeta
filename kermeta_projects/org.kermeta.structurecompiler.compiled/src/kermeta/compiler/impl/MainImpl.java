/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.1 2008-09-04 15:40:36 cfaucher Exp $
 */
package kermeta.compiler.impl;

import kermeta.compiler.CompilerPackage;
import kermeta.compiler.Main;

import kermeta.language.structure.TypeDefinition;

import kermeta.language.structure.impl.ObjectImpl;

import km2ecore.CompilingMode;
import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.compiler.impl.MainImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends ObjectImpl implements Main
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected KM2EcoreContext context;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainImpl()
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
    return CompilerPackage.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KM2EcoreContext getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (KM2EcoreContext)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompilerPackage.MAIN__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KM2EcoreContext basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(KM2EcoreContext newContext)
  {
    KM2EcoreContext oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompilerPackage.MAIN__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main_km2ecore_onlyEcore(String modelInput, String traceInput, String output)
  {
    
      this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName("onlyEcore"));
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main_km2ecore_behaviorJava(String modelInput, String traceInput, String output)
  {
    
      this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName("behaviorJava"));
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main_mode3(String modelInput, String traceInput, String output, CompilingMode mode)
  {
    
      this.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.KM2EcoreContext")));
    
      this.getContext().initialize(modelInput, traceInput);
    
      this.getContext().setMode(mode);
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("Input model: ", modelInput), "\n"));
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft125 = this.getContext().getMu().getAllPackages().iterator();
      java.lang.Boolean idLoopCond_642 = false;
      while( !idLoopCond_642 ) {
      idLoopCond_642 = it_ft125.isOff();
      if ( idLoopCond_642 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Package p = it_ft125.next();
    
      //Beginning of the Inlining of the function type: eachOwnedElement
    
      
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.TypeDefinition> it_ft127 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeDefinition>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(p, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Package"))).getOwnedTypeDefinition()).iterator();
      java.lang.Boolean idLoopCond_643 = false;
      while( !idLoopCond_643 ) {
      idLoopCond_643 = it_ft127.isOff();
      if ( idLoopCond_643 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.TypeDefinition o = it_ft127.next();
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.TypeDefinition cd = o_ft127;
    
      java.lang.Boolean idIfCond_644 = false;
      idIfCond_644 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(cd, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"));
    
      if( idIfCond_644 ) {
    
      //Beginning of the Inlining of the function type: eachOwnedElement
    
      
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft129 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(cd, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).getOwnedAttribute()).iterator();
      java.lang.Boolean idLoopCond_645 = false;
      while( !idLoopCond_645 ) {
      idLoopCond_645 = it_ft129.isOff();
      if ( idLoopCond_645 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Property o = it_ft129.next();
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Property op = o_ft129;
    
      java.lang.Boolean idIfCond_646 = false;
      idIfCond_646 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(op, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation"));
    
      if( idIfCond_646 ) {
    
      java.lang.Boolean idIfCond_647 = false;
      idIfCond_647 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(op, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation"))).getName(), "replaceExtension");
    
      if( idIfCond_647 ) {
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("================= ", ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(op, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation"))).qualifiedName()), " ================="));
    
      java.lang.String javaSourceCode = op.createBehaviorJava(this.getContext());
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(javaSourceCode);
    }
    
    }
    
    //End of the Inlining of the lambda expression: func
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft130 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();
      java.lang.Boolean idLoopCond_648 = false;
      while( !idLoopCond_648 ) {
      idLoopCond_648 = it_ft130.isOff();
      if ( idLoopCond_648 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Operation o = it_ft130.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft131 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getInv()).iterator();
      java.lang.Boolean idLoopCond_649 = false;
      while( !idLoopCond_649 ) {
      idLoopCond_649 = it_ft131.isOff();
      if ( idLoopCond_649 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Constraint i = it_ft131.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft132 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();
      java.lang.Boolean idLoopCond_650 = false;
      while( !idLoopCond_650 ) {
      idLoopCond_650 = it_ft132.isOff();
      if ( idLoopCond_650 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.TypeVariable t = it_ft132.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    //End of the Inlining of the function type: eachOwnedElement
    
    }
    
    //End of the Inlining of the lambda expression: func
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Package> it_ft133 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Package>convertAsOrderedSet(this.getNestedPackage()).iterator();
      java.lang.Boolean idLoopCond_651 = false;
      while( !idLoopCond_651 ) {
      idLoopCond_651 = it_ft133.isOff();
      if ( idLoopCond_651 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Package p = it_ft133.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    //End of the Inlining of the function type: eachOwnedElement
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("\nFinish, warning: this exec mode has not filtered the FunctionTypes.");
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main_mode2(String modelInput, String traceInput, String output, CompilingMode mode)
  {
    
      this.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.KM2EcoreContext")));
    
      this.getContext().initialize(modelInput, traceInput);
    
      this.getContext().setMode(mode);
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName("kermeta::standard::Integer")));
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName("kermeta::standard::Boolean")));
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName("kermeta::standard::Real")));
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName("kermeta::standard::Character")));
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName("kermeta::standard::String")));
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(this.typeDefinitionToString(this.getTypeDefinitionByQualifiedName("kermeta::standard::Numeric")));
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main_inner()
  {
    
      java.lang.String modelInput = "platform:/resource/org.kermeta.compiler.kmt/models/compilertest.km";
    
      java.lang.String output = "platform:/resource/org.kermeta.compiler.kmt/models/compilertest.ecore";
    
      java.lang.String traceInput = "";
    
      this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName("behaviorJava"));
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String typeDefinitionToString(TypeDefinition td)
  {
    
    java.lang.String result = null;
    
      java.lang.Boolean idIfCond_652 = false;
      idIfCond_652 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(td)), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(td, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition")));
    
      if( idIfCond_652 ) {
    
      kermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(td, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition")));
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(cd.getName(), " "), kermeta.standard.helper.BooleanWrapper.toString(cd.isValueType()));
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition getTypeDefinitionByQualifiedName(String qn)
  {
    
    kermeta.language.structure.TypeDefinition result = null;
    
      kermeta.language.structure.TypeDefinition td = ((kermeta.language.structure.TypeDefinition) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.TypeDefinition"));
    
      kermeta.language.structure.TypeDefinition td_tmp = this.getContext().getMu().getTypeDefinitionByQualifiedName(qn);
    
      java.lang.Boolean idIfCond_653 = false;
      idIfCond_653 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(td_tmp));
    
      if( idIfCond_653 ) {
    
      td = td_tmp;
    }
    
    
      result = td;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main_mode(String modelInput, String traceInput, String output, CompilingMode mode)
  {
    
      this.setContext(((km2ecore.KM2EcoreContext) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.KM2EcoreContext")));
    
      this.getContext().initialize(modelInput, traceInput);
    
      this.getContext().setMode(mode);
    
      this.getContext().getMu().applyPass1(this.getContext());
    
      java.lang.Boolean idIfCond_654 = false;
      idIfCond_654 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this.getContext().getMode(), km2ecore.CompilingMode.getByName("onlyEcore"));
    
      if( idIfCond_654 ) {
    
      this.getContext().getMu().applyPass2(this.getContext());
    }
    
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("KermetaCompiler - Pass 1 is finished");
    
      java.lang.Boolean idIfCond_655 = false;
      idIfCond_655 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this.getContext().getMode(), km2ecore.CompilingMode.getByName("behaviorKmt"));
    
      if( idIfCond_655 ) {
    
      this.getContext().getMu().applyPass2BehaviorKmt(this.getContext());
    }
    
    
      java.lang.Boolean idIfCond_656 = false;
      idIfCond_656 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this.getContext().getMode(), km2ecore.CompilingMode.getByName("behaviorJava"));
    
      if( idIfCond_656 ) {
    
      this.getContext().getMu().preprocess(this.getContext());
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus("KermetaCompiler - Pass 2 with the mode: ", this.getContext().getMode().getName()));
    
      this.getContext().getMu().applyPass2BehaviorJava(this.getContext());
    
      this.getContext().getMu().postprocess(this.getContext());
    }
    
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("KermetaCompiler - Pass 2 is finished");
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(this.getContext().getEcoreOutputs()).add(output);
    
      kermeta.persistence.Resource ecore_resource = this.getContext().getOutputRepository().createResource(output, "http://www.eclipse.org/emf/2002/Ecore");
    
      ecore_resource.instances().add(this.getContext().getMu().getEcoreModelElement());
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<ecore.EAnnotation> it_ft134 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getContext().getMu().getEntryPoints()).iterator();
      java.lang.Boolean idLoopCond_657 = false;
      while( !idLoopCond_657 ) {
      idLoopCond_657 = it_ft134.isOff();
      if ( idLoopCond_657 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    ecore.EAnnotation e = it_ft134.next();
    
      ecore_resource.instances().add(e);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<ecore.EPackage> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EPackage>convertAsOrderedSet(this.getContext().getMu().getEcorePackages()).iterator();
      java.lang.Boolean idLoopCond_658 = false;
      while( !idLoopCond_658 ) {
      idLoopCond_658 = it_ft135.isOff();
      if ( idLoopCond_658 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    ecore.EPackage p = it_ft135.next();
    
      ecore_resource.instances().add(p);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("Save the Ecore Model");
    
      ecore_resource.save();
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("The Ecore Model has been saved");
    
      this.getContext().save();
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("Stats:\n\tconditional + loop: ", kermeta.standard.helper.IntegerWrapper.toString(this.getContext().getInc_condStack())), "\n\tfunction type: "), kermeta.standard.helper.IntegerWrapper.toString(this.getContext().getInc_ftSuffix())));
    
      org.kermeta.compil.runtime.helper.io.StdIOUtil.writeln("Finish");
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main(String modelInput, String traceInput, String output)
  {
    
      this.main_mode(modelInput, traceInput, output, km2ecore.CompilingMode.getByName("behaviorJava"));
    
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
      case CompilerPackage.MAIN__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CompilerPackage.MAIN__CONTEXT:
        setContext((KM2EcoreContext)newValue);
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
      case CompilerPackage.MAIN__CONTEXT:
        setContext((KM2EcoreContext)null);
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
      case CompilerPackage.MAIN__CONTEXT:
        return context != null;
    }
    return super.eIsSet(featureID);
  }

} //MainImpl
