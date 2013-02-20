/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.parts.forms.ClassDefinitionPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.Class_PropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ConstraintPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.EnumerationLiteralPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.EnumerationPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.FunctionTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.KermetaModelElementPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ModelPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ModelTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ModelTypeVariablePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ModelingUnitPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.MultiplicityElementPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ObjectTypeVariablePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.OperationPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.Package_PropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ParameterPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.PrimitiveTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.ProductTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.PropertyPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.RequirePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.TagPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.TypeDefinitionContainerPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.TypeDefinitionPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.TypeMappingPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.TypeVariableBindingPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.UnresolvedInferredTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.UnresolvedOperationPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.UnresolvedPropertyPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.UnresolvedTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.UsingPropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.VirtualTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.forms.VoidTypePropertiesEditionPartForm;
import org.kermeta.language.structure.parts.impl.ClassDefinitionPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.Class_PropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ConstraintPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.EnumerationLiteralPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.EnumerationPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.FunctionTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.KermetaModelElementPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ModelPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ModelTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ModelTypeVariablePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ModelingUnitPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.MultiplicityElementPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ObjectTypeVariablePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.OperationPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.Package_PropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ParameterPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.PrimitiveTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.ProductTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.PropertyPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.RequirePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.TagPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.TypeDefinitionContainerPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.TypeDefinitionPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.TypeMappingPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.TypeVariableBindingPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.UnresolvedInferredTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.UnresolvedOperationPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.UnresolvedPropertyPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.UnresolvedTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.UsingPropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.VirtualTypePropertiesEditionPartImpl;
import org.kermeta.language.structure.parts.impl.VoidTypePropertiesEditionPartImpl;




/**
 * @author Didier Vojtisek
 * 
 */
public class StructurePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == StructureViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == StructureViewsRepository.KermetaModelElement.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new KermetaModelElementPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new KermetaModelElementPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Operation.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new OperationPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new OperationPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Property.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new PropertyPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new PropertyPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.EnumerationLiteral.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new EnumerationLiteralPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new EnumerationLiteralPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.TypeVariableBinding.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new TypeVariableBindingPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new TypeVariableBindingPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.MultiplicityElement.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new MultiplicityElementPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new MultiplicityElementPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.TypeDefinition.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new TypeDefinitionPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new TypeDefinitionPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Class_.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new Class_PropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new Class_PropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Enumeration.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new EnumerationPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new EnumerationPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Package_.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new Package_PropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new Package_PropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Parameter.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ParameterPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ParameterPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.PrimitiveType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new PrimitiveTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new PrimitiveTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Tag.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new TagPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new TagPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Constraint.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ConstraintPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ConstraintPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.ClassDefinition.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ClassDefinitionPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ClassDefinitionPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.ModelingUnit.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ModelingUnitPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ModelingUnitPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.TypeDefinitionContainer.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new TypeDefinitionContainerPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new TypeDefinitionContainerPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Require.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new RequirePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new RequirePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.ObjectTypeVariable.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ObjectTypeVariablePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ObjectTypeVariablePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.ModelType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ModelTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ModelTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.ModelTypeVariable.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ModelTypeVariablePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ModelTypeVariablePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.VirtualType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new VirtualTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new VirtualTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Model.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ModelPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ModelPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.UnresolvedType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new UnresolvedTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new UnresolvedTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.UnresolvedProperty.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new UnresolvedPropertyPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new UnresolvedPropertyPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.UnresolvedOperation.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new UnresolvedOperationPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new UnresolvedOperationPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.Using.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new UsingPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new UsingPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.ProductType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new ProductTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new ProductTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.FunctionType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new FunctionTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new FunctionTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.VoidType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new VoidTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new VoidTypePropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.TypeMapping.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new TypeMappingPropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new TypeMappingPropertiesEditionPartForm(component);
		}
		if (key == StructureViewsRepository.UnresolvedInferredType.class) {
			if (kind == StructureViewsRepository.SWT_KIND)
				return new UnresolvedInferredTypePropertiesEditionPartImpl(component);
			if (kind == StructureViewsRepository.FORM_KIND)
				return new UnresolvedInferredTypePropertiesEditionPartForm(component);
		}
		return null;
	}

}
