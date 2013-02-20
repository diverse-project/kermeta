/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.kermeta.language.structure.util.StructureAdapterFactory;


/**
 * @author Didier Vojtisek
 * 
 */
public class StructureEEFAdapterFactory extends StructureAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createKermetaModelElementAdapter()
	 * 
	 */
	public Adapter createKermetaModelElementAdapter() {
		return new KermetaModelElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createMultiplicityElementAdapter()
	 * 
	 */
	public Adapter createMultiplicityElementAdapter() {
		return new MultiplicityElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createOperationAdapter()
	 * 
	 */
	public Adapter createOperationAdapter() {
		return new OperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createPropertyAdapter()
	 * 
	 */
	public Adapter createPropertyAdapter() {
		return new PropertyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createEnumerationLiteralAdapter()
	 * 
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return new EnumerationLiteralPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createTypeVariableBindingAdapter()
	 * 
	 */
	public Adapter createTypeVariableBindingAdapter() {
		return new TypeVariableBindingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createTypeDefinitionAdapter()
	 * 
	 */
	public Adapter createTypeDefinitionAdapter() {
		return new TypeDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createClassAdapter()
	 * 
	 */
	public Adapter createClassAdapter() {
		return new Class_PropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createEnumerationAdapter()
	 * 
	 */
	public Adapter createEnumerationAdapter() {
		return new EnumerationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createTypeDefinitionContainerAdapter()
	 * 
	 */
	public Adapter createTypeDefinitionContainerAdapter() {
		return new TypeDefinitionContainerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createPackageAdapter()
	 * 
	 */
	public Adapter createPackageAdapter() {
		return new Package_PropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createParameterAdapter()
	 * 
	 */
	public Adapter createParameterAdapter() {
		return new ParameterPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createPrimitiveTypeAdapter()
	 * 
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return new PrimitiveTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createTagAdapter()
	 * 
	 */
	public Adapter createTagAdapter() {
		return new TagPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createConstraintAdapter()
	 * 
	 */
	public Adapter createConstraintAdapter() {
		return new ConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createClassDefinitionAdapter()
	 * 
	 */
	public Adapter createClassDefinitionAdapter() {
		return new ClassDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createModelingUnitAdapter()
	 * 
	 */
	public Adapter createModelingUnitAdapter() {
		return new ModelingUnitPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createRequireAdapter()
	 * 
	 */
	public Adapter createRequireAdapter() {
		return new RequirePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createObjectTypeVariableAdapter()
	 * 
	 */
	public Adapter createObjectTypeVariableAdapter() {
		return new ObjectTypeVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createModelAdapter()
	 * 
	 */
	public Adapter createModelAdapter() {
		return new ModelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createModelTypeAdapter()
	 * 
	 */
	public Adapter createModelTypeAdapter() {
		return new ModelTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createModelTypeVariableAdapter()
	 * 
	 */
	public Adapter createModelTypeVariableAdapter() {
		return new ModelTypeVariablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createVirtualTypeAdapter()
	 * 
	 */
	public Adapter createVirtualTypeAdapter() {
		return new VirtualTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createUnresolvedTypeAdapter()
	 * 
	 */
	public Adapter createUnresolvedTypeAdapter() {
		return new UnresolvedTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createUnresolvedPropertyAdapter()
	 * 
	 */
	public Adapter createUnresolvedPropertyAdapter() {
		return new UnresolvedPropertyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createUnresolvedOperationAdapter()
	 * 
	 */
	public Adapter createUnresolvedOperationAdapter() {
		return new UnresolvedOperationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createUsingAdapter()
	 * 
	 */
	public Adapter createUsingAdapter() {
		return new UsingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createProductTypeAdapter()
	 * 
	 */
	public Adapter createProductTypeAdapter() {
		return new ProductTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createFunctionTypeAdapter()
	 * 
	 */
	public Adapter createFunctionTypeAdapter() {
		return new FunctionTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createVoidTypeAdapter()
	 * 
	 */
	public Adapter createVoidTypeAdapter() {
		return new VoidTypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createTypeMappingAdapter()
	 * 
	 */
	public Adapter createTypeMappingAdapter() {
		return new TypeMappingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.kermeta.language.structure.util.StructureAdapterFactory#createUnresolvedInferredTypeAdapter()
	 * 
	 */
	public Adapter createUnresolvedInferredTypeAdapter() {
		return new UnresolvedInferredTypePropertiesEditionProvider();
	}

}
