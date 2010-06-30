/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.smARText.mopp;

public class SmARTextPrinter implements org.smartadapters.core.resource.smARText.ISmARTextTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected org.smartadapters.core.resource.smARText.ISmARTextTokenResolverFactory tokenResolverFactory = new org.smartadapters.core.resource.smARText.mopp.SmARTextTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private org.smartadapters.core.resource.smARText.ISmARTextTextResource resource;
	private java.util.Map<?, ?> options;
	
	public SmARTextPrinter(java.io.OutputStream outputStream, org.smartadapters.core.resource.smARText.ISmARTextTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<java.lang.String, java.lang.Integer> featureCounter, java.util.Collection<java.lang.String> needed){
		int pos = 0;
		int neg = 0;
		
		for(java.lang.String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, java.lang.String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.smartadapters.core.Adapter) {
			print_org_smartadapters_core_Adapter((org.smartadapters.core.Adapter) element, globaltab, out);
			return;
		}
		if (element instanceof org.smartadapters.core.Aspect) {
			print_org_smartadapters_core_Aspect((org.smartadapters.core.Aspect) element, globaltab, out);
			return;
		}
		if (element instanceof org.smartadapters.core.adaptations.SetruntimeSystem) {
			print_org_smartadapters_core_adaptations_SetruntimeSystem((org.smartadapters.core.adaptations.SetruntimeSystem) element, globaltab, out);
			return;
		}
		if (element instanceof org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) {
			print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance((org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) element, globaltab, out);
			return;
		}
		if (element instanceof org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) {
			print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance((org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) element, globaltab, out);
			return;
		}
		if (element instanceof org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) {
			print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance((org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) element, globaltab, out);
			return;
		}
		if (element instanceof org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding) {
			print_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding((org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.System) {
			print_pattern_art_System((pattern.art.System) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.DataType) {
			print_pattern_art_DataType((pattern.art.DataType) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.PrimitiveInstance) {
			print_pattern_art_instance_PrimitiveInstance((pattern.art.instance.PrimitiveInstance) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.CompositeInstance) {
			print_pattern_art_instance_CompositeInstance((pattern.art.instance.CompositeInstance) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.TransmissionBinding) {
			print_pattern_art_instance_TransmissionBinding((pattern.art.instance.TransmissionBinding) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.DelegationBinding) {
			print_pattern_art_instance_DelegationBinding((pattern.art.instance.DelegationBinding) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.ValuedAttribute) {
			print_pattern_art_instance_ValuedAttribute((pattern.art.instance.ValuedAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.DictionaryValuedAttribute) {
			print_pattern_art_instance_DictionaryValuedAttribute((pattern.art.instance.DictionaryValuedAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.DefaultEntry) {
			print_pattern_art_instance_DefaultEntry((pattern.art.instance.DefaultEntry) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.instance.OtherEntry) {
			print_pattern_art_instance_OtherEntry((pattern.art.instance.OtherEntry) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.PrimitiveType) {
			print_pattern_art_type_PrimitiveType((pattern.art.type.PrimitiveType) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.CompositeType) {
			print_pattern_art_type_CompositeType((pattern.art.type.CompositeType) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.Operation) {
			print_pattern_art_type_Operation((pattern.art.type.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.Parameter) {
			print_pattern_art_type_Parameter((pattern.art.type.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.FunctionalService) {
			print_pattern_art_type_FunctionalService((pattern.art.type.FunctionalService) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.ControlService) {
			print_pattern_art_type_ControlService((pattern.art.type.ControlService) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.Port) {
			print_pattern_art_type_Port((pattern.art.type.Port) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.implem.FractalComponent) {
			print_pattern_art_implem_FractalComponent((pattern.art.implem.FractalComponent) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.implem.OSGiComponent) {
			print_pattern_art_implem_OSGiComponent((pattern.art.implem.OSGiComponent) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.implem.OSGiType) {
			print_pattern_art_implem_OSGiType((pattern.art.implem.OSGiType) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.BasicAttribute) {
			print_pattern_art_type_BasicAttribute((pattern.art.type.BasicAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.Dictionary) {
			print_pattern_art_type_Dictionary((pattern.art.type.Dictionary) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.DictionaryDefaultValue) {
			print_pattern_art_type_DictionaryDefaultValue((pattern.art.type.DictionaryDefaultValue) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.PortId) {
			print_pattern_art_type_PortId((pattern.art.type.PortId) element, globaltab, out);
			return;
		}
		if (element instanceof pattern.art.type.PortCollection) {
			print_pattern_art_type_PortCollection((pattern.art.type.PortCollection) element, globaltab, out);
			return;
		}
		if (element instanceof patternframework.ModelPattern) {
			print_patternframework_ModelPattern((patternframework.ModelPattern) element, globaltab, out);
			return;
		}
		if (element instanceof patternframework.PModel) {
			print_patternframework_PModel((patternframework.PModel) element, globaltab, out);
			return;
		}
		if (element instanceof patternframework.PConstraint) {
			print_patternframework_PConstraint((patternframework.PConstraint) element, globaltab, out);
			return;
		}
		if (element instanceof patternframework.PRole) {
			print_patternframework_PRole((patternframework.PRole) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.smartadapters.core.resource.smARText.mopp.SmARTextReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.smartadapters.core.resource.smARText.mopp.SmARTextReferenceResolverSwitch) new org.smartadapters.core.resource.smARText.mopp.SmARTextMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.smartadapters.core.resource.smARText.ISmARTextTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.smartadapters.core.resource.smARText.mopp.SmARTextProblem(errorMessage, org.smartadapters.core.resource.smARText.SmARTextEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.smartadapters.core.resource.smARText.ISmARTextTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_smartadapters_core_Adapter(org.smartadapters.core.Adapter element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__ASPECT));
		printCountingMap.put("aspect", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__ADAPT));
		printCountingMap.put("adapt", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Adapter");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("aspect");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__ASPECT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("aspect", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("protocol");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_Adapter_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_smartadapters_core_Adapter_0(org.smartadapters.core.Adapter element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("adapt");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ADAPTER__ADAPT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("adapt", count - 1);
		}
	}
	
	public void print_org_smartadapters_core_Aspect(org.smartadapters.core.Aspect element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__TEMPLATE));
		printCountingMap.put("template", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__STRUCTURE));
		printCountingMap.put("structure", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT));
		printCountingMap.put("persistent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("pointcut");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("template");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__TEMPLATE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("template", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("advice");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_smartadapters_core_Aspect_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_smartadapters_core_Aspect_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_smartadapters_core_Aspect_0(org.smartadapters.core.Aspect element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("structure");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__STRUCTURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("structure", count - 1);
		}
	}
	public void print_org_smartadapters_core_Aspect_1(org.smartadapters.core.Aspect element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("unique elements");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("persistent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAspectPersistentReferenceResolver().deResolve((patternframework.PObject) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), element));
			}
			printCountingMap.put("persistent", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_Aspect_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_org_smartadapters_core_Aspect_1_0(org.smartadapters.core.Aspect element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("persistent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAspectPersistentReferenceResolver().deResolve((patternframework.PObject) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.CorePackage.ASPECT__PERSISTENT), element));
			}
			printCountingMap.put("persistent", count - 1);
		}
	}
	
	public void print_org_smartadapters_core_adaptations_SetruntimeSystem(org.smartadapters.core.adaptations.SetruntimeSystem element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__ADAPTER));
		printCountingMap.put("adapter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET));
		printCountingMap.put("SystemToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT));
		printCountingMap.put("refroot", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES));
		printCountingMap.put("refservices", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES));
		printCountingMap.put("reftypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES));
		printCountingMap.put("refdataTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("set");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("system");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("SystemToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemSystemToSetReferenceResolver().deResolve((pattern.art.System) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), element));
			}
			printCountingMap.put("SystemToSet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_adaptations_SetruntimeSystem_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeSystem_0(org.smartadapters.core.adaptations.SetruntimeSystem element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"refroot"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refservices"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"reftypes"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refdataTypes"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("services");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refservices");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver().deResolve((pattern.art.type.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), element));
					}
					printCountingMap.put("refservices", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeSystem_0_0(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 2:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("types");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("reftypes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver().deResolve((pattern.art.type.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), element));
					}
					printCountingMap.put("reftypes", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeSystem_0_1(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 3:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("datatypes");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refdataTypes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver().deResolve((pattern.art.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), element));
					}
					printCountingMap.put("refdataTypes", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeSystem_0_2(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("root");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("=");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("refroot");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefrootReferenceResolver().deResolve((pattern.art.instance.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), element));
				}
				printCountingMap.put("refroot", count - 1);
			}
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeSystem_0_0(org.smartadapters.core.adaptations.SetruntimeSystem element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refservices");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver().deResolve((pattern.art.type.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), element));
			}
			printCountingMap.put("refservices", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeSystem_0_1(org.smartadapters.core.adaptations.SetruntimeSystem element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("reftypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver().deResolve((pattern.art.type.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), element));
			}
			printCountingMap.put("reftypes", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeSystem_0_2(org.smartadapters.core.adaptations.SetruntimeSystem element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refdataTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver().deResolve((pattern.art.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), element));
			}
			printCountingMap.put("refdataTypes", count - 1);
		}
	}
	
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance(org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__ADAPTER));
		printCountingMap.put("adapter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET));
		printCountingMap.put("ComponentInstanceToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE));
		printCountingMap.put("reftype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE));
		printCountingMap.put("refstate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT));
		printCountingMap.put("refsuperComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE));
		printCountingMap.put("refattribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING));
		printCountingMap.put("refbinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("set");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("instance");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("ComponentInstanceToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver().deResolve((pattern.art.instance.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), element));
			}
			printCountingMap.put("ComponentInstanceToSet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance_0(org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"reftype"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refstate"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refsuperComponent"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refattribute"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refbinding"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refname"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("state");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refstate");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE), element));
					}
					printCountingMap.put("refstate", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("super");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refsuperComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver().deResolve((pattern.art.instance.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), element));
					}
					printCountingMap.put("refsuperComponent", count - 1);
				}
			}
			break;
			case 3:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("attribute");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refattribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver().deResolve((pattern.art.instance.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), element));
					}
					printCountingMap.put("refattribute", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance_0_0(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 4:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("binding");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refbinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), element));
					}
					printCountingMap.put("refbinding", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance_0_1(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refname");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME), element));
					}
					printCountingMap.put("refname", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("type");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("=");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("reftype");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceReftypeReferenceResolver().deResolve((pattern.art.type.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), element));
				}
				printCountingMap.put("reftype", count - 1);
			}
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance_0_0(org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refattribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver().deResolve((pattern.art.instance.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), element));
			}
			printCountingMap.put("refattribute", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceComponentInstance_0_1(org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refbinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), element));
			}
			printCountingMap.put("refbinding", count - 1);
		}
	}
	
	public void print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance(org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__ADAPTER));
		printCountingMap.put("adapter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET));
		printCountingMap.put("PrimitiveInstanceToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE));
		printCountingMap.put("reftype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE));
		printCountingMap.put("refstate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT));
		printCountingMap.put("refsuperComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE));
		printCountingMap.put("refattribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING));
		printCountingMap.put("refbinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("set");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("primitive");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("component");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("PrimitiveInstanceToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver().deResolve((pattern.art.instance.PrimitiveInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), element));
			}
			printCountingMap.put("PrimitiveInstanceToSet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance_0(org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"reftype"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refstate"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refsuperComponent"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refattribute"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refbinding"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refname"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("state");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refstate");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE), element));
					}
					printCountingMap.put("refstate", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("super");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refsuperComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver().deResolve((pattern.art.instance.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), element));
					}
					printCountingMap.put("refsuperComponent", count - 1);
				}
			}
			break;
			case 3:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("attribute");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refattribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver().deResolve((pattern.art.instance.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), element));
					}
					printCountingMap.put("refattribute", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance_0_0(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 4:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("binding");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refbinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), element));
					}
					printCountingMap.put("refbinding", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance_0_1(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refname");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME), element));
					}
					printCountingMap.put("refname", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("type");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("=");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("reftype");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceReftypeReferenceResolver().deResolve((pattern.art.type.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), element));
				}
				printCountingMap.put("reftype", count - 1);
			}
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance_0_0(org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refattribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver().deResolve((pattern.art.instance.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), element));
			}
			printCountingMap.put("refattribute", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstancePrimitiveInstance_0_1(org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refbinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), element));
			}
			printCountingMap.put("refbinding", count - 1);
		}
	}
	
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance(org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(10);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__ADAPTER));
		printCountingMap.put("adapter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET));
		printCountingMap.put("CompositeInstanceToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT));
		printCountingMap.put("refsubComponent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION));
		printCountingMap.put("refdelegation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE));
		printCountingMap.put("reftype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE));
		printCountingMap.put("refstate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT));
		printCountingMap.put("refsuperComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE));
		printCountingMap.put("refattribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING));
		printCountingMap.put("refbinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("set");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("composite");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("component");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("CompositeInstanceToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver().deResolve((pattern.art.instance.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), element));
			}
			printCountingMap.put("CompositeInstanceToSet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0(org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"refsubComponent"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refdelegation"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refstate"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refsuperComponent"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refattribute"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refbinding"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refname"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("delegation");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refdelegation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver().deResolve((pattern.art.instance.DelegationBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), element));
					}
					printCountingMap.put("refdelegation", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_1(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("state");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refstate");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE), element));
					}
					printCountingMap.put("refstate", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("super");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refsuperComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver().deResolve((pattern.art.instance.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), element));
					}
					printCountingMap.put("refsuperComponent", count - 1);
				}
			}
			break;
			case 4:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("attribute");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refattribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver().deResolve((pattern.art.instance.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), element));
					}
					printCountingMap.put("refattribute", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_2(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 5:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("binding");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("+=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refbinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), element));
					}
					printCountingMap.put("refbinding", count - 1);
				}
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_3(element, localtab, out1, printCountingMap1);
					if (printCountingMap.equals(printCountingMap1)) {
						iterate = false;
						out1.close();
					} else {
						out1.flush();
						out1.close();
						out.print(sWriter.toString());
						printCountingMap.putAll(printCountingMap1);
					}
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("name");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refname");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME), element));
					}
					printCountingMap.put("refname", count - 1);
				}
			}
			break;
			default:			boolean iterate = true;
			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("component");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("+=");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("refsubComponent");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver().deResolve((pattern.art.instance.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), element));
				}
				printCountingMap.put("refsubComponent", count - 1);
			}
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			iterate = true;
			while (iterate) {
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
				print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					iterate = false;
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
			}
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_0(org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refsubComponent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver().deResolve((pattern.art.instance.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), element));
			}
			printCountingMap.put("refsubComponent", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_1(org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refdelegation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver().deResolve((pattern.art.instance.DelegationBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), element));
			}
			printCountingMap.put("refdelegation", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_2(org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refattribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver().deResolve((pattern.art.instance.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), element));
			}
			printCountingMap.put("refattribute", count - 1);
		}
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceCompositeInstance_0_3(org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("refbinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), element));
			}
			printCountingMap.put("refbinding", count - 1);
		}
	}
	
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding(org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__ADAPTER));
		printCountingMap.put("adapter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET));
		printCountingMap.put("TransmissionBindingToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT));
		printCountingMap.put("refclient", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER));
		printCountingMap.put("refserver", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE));
		printCountingMap.put("refserverInstance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID));
		printCountingMap.put("refId", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("set");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("binding");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("TransmissionBindingToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver().deResolve((pattern.art.instance.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), element));
			}
			printCountingMap.put("TransmissionBindingToSet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_org_smartadapters_core_adaptations_SetruntimeinstanceTransmissionBinding_0(org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"refclient"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refserver"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refserverInstance"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"refId"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("providedPort");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refserver");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverReferenceResolver().deResolve((pattern.art.type.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), element));
					}
					printCountingMap.put("refserver", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("server");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
				count = printCountingMap.get("refserverInstance");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver().deResolve((pattern.art.instance.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), element));
					}
					printCountingMap.put("refserverInstance", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (LineBreak):
				localtab += "	";
				out.println();
				out.print(localtab);
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("id");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("=");
				//////////////DEFINITION PART BEGINS (WhiteSpaces):
				out.print(" ");
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("refId");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID));
					if (o != null) {
						org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID), element));
					}
					printCountingMap.put("refId", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("requiredPort");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("=");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			out.print(" ");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("refclient");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefclientReferenceResolver().deResolve((pattern.art.type.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT)), element.eClass().getEStructuralFeature(org.smartadapters.core.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), element));
				}
				printCountingMap.put("refclient", count - 1);
			}
		}
	}
	
	public void print_pattern_art_System(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__ROOT));
		printCountingMap.put("root", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__SERVICES));
		printCountingMap.put("services", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__TYPES));
		printCountingMap.put("types", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__DATA_TYPES));
		printCountingMap.put("dataTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_System_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_System_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_System_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_pattern_art_System_0(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("system");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_System_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_System_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
	}
	public void print_pattern_art_System_0_0(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_System_0_1(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_System_1(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("root");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("root");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__ROOT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("root", count - 1);
		}
	}
	public void print_pattern_art_System_2(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_System_2_0(element, localtab, out, printCountingMap);
	}
	public void print_pattern_art_System_2_0(pattern.art.System element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"services"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"types"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"dataTypes"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("types");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__TYPES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("types", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("dataTypes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__DATA_TYPES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("dataTypes", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("services");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.SYSTEM__SERVICES));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("services", count - 1);
			}
		}
	}
	
	public void print_pattern_art_DataType(pattern.art.DataType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("datatype");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_DataType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_DataType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
	}
	public void print_pattern_art_DataType_0(pattern.art.DataType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_DataType_1(pattern.art.DataType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.ArtPackage.DATA_TYPE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_instance_PrimitiveInstance(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(9);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE));
		printCountingMap.put("state", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__SUPER_COMPONENT));
		printCountingMap.put("superComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("primitive");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("instance");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_PrimitiveInstance_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_PrimitiveInstance_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_PrimitiveInstance_2(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_PrimitiveInstance_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_PrimitiveInstance_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_instance_PrimitiveInstance_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_instance_PrimitiveInstance_0(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_instance_PrimitiveInstance_1(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_instance_PrimitiveInstance_2(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver().deResolve((pattern.art.type.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__TYPE), element));
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	public void print_pattern_art_instance_PrimitiveInstance_3(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("state");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__STATE), element));
			}
			printCountingMap.put("state", count - 1);
		}
	}
	public void print_pattern_art_instance_PrimitiveInstance_4(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("implementation");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_pattern_art_instance_PrimitiveInstance_5(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_PrimitiveInstance_5_0(element, localtab, out, printCountingMap);
	}
	public void print_pattern_art_instance_PrimitiveInstance_5_0(pattern.art.instance.PrimitiveInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"binding"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("binding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__BINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("binding", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("attribute");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.PRIMITIVE_INSTANCE__ATTRIBUTE));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("attribute", count - 1);
			}
		}
	}
	
	public void print_pattern_art_instance_CompositeInstance(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(11);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE));
		printCountingMap.put("state", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__SUPER_COMPONENT));
		printCountingMap.put("superComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT));
		printCountingMap.put("subComponent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION));
		printCountingMap.put("delegation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("composite");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("instance");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_CompositeInstance_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_CompositeInstance_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_CompositeInstance_2(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_CompositeInstance_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_CompositeInstance_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_instance_CompositeInstance_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_instance_CompositeInstance_0(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_instance_CompositeInstance_1(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_instance_CompositeInstance_2(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver().deResolve((pattern.art.type.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__TYPE), element));
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	public void print_pattern_art_instance_CompositeInstance_3(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("state");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__STATE), element));
			}
			printCountingMap.put("state", count - 1);
		}
	}
	public void print_pattern_art_instance_CompositeInstance_4(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("implementation");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_pattern_art_instance_CompositeInstance_5(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_CompositeInstance_5_0(element, localtab, out, printCountingMap);
	}
	public void print_pattern_art_instance_CompositeInstance_5_0(pattern.art.instance.CompositeInstance element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"binding"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"subComponent"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"delegation"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("binding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__BINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("binding", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("subComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__SUB_COMPONENT));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("subComponent", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("delegation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__DELEGATION));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("delegation", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("attribute");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.COMPOSITE_INSTANCE__ATTRIBUTE));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("attribute", count - 1);
			}
		}
	}
	
	public void print_pattern_art_instance_TransmissionBinding(pattern.art.instance.TransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE));
		printCountingMap.put("serverInstance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT));
		printCountingMap.put("client", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER));
		printCountingMap.put("server", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("bind");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_TransmissionBinding_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("to");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_TransmissionBinding_1(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_TransmissionBinding_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_TransmissionBinding_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_instance_TransmissionBinding_0(pattern.art.instance.TransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"client"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("client");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver().deResolve((pattern.art.type.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__CLIENT), element));
				}
				printCountingMap.put("client", count - 1);
			}
		}
	}
	public void print_pattern_art_instance_TransmissionBinding_1(pattern.art.instance.TransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"serverInstance"		,
		"server"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("serverInstance");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver().deResolve((pattern.art.instance.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER_INSTANCE), element));
				}
				printCountingMap.put("serverInstance", count - 1);
			}
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("::");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("server");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver().deResolve((pattern.art.type.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__SERVER), element));
				}
				printCountingMap.put("server", count - 1);
			}
		}
	}
	public void print_pattern_art_instance_TransmissionBinding_2(pattern.art.instance.TransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_instance_TransmissionBinding_3(pattern.art.instance.TransmissionBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("id");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.TRANSMISSION_BINDING__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
	}
	
	public void print_pattern_art_instance_DelegationBinding(pattern.art.instance.DelegationBinding element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE));
		printCountingMap.put("serverInstance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED));
		printCountingMap.put("exported", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("delegate");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_DelegationBinding_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("to");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_instance_DelegationBinding_1(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_DelegationBinding_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_DelegationBinding_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_instance_DelegationBinding_0(pattern.art.instance.DelegationBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"source"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("source");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver().deResolve((pattern.art.type.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SOURCE), element));
				}
				printCountingMap.put("source", count - 1);
			}
		}
	}
	public void print_pattern_art_instance_DelegationBinding_1(pattern.art.instance.DelegationBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"serverInstance"		,
		"exported"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("serverInstance");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver().deResolve((pattern.art.instance.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__SERVER_INSTANCE), element));
				}
				printCountingMap.put("serverInstance", count - 1);
			}
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("::");
			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("exported");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver().deResolve((pattern.art.type.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__EXPORTED), element));
				}
				printCountingMap.put("exported", count - 1);
			}
		}
	}
	public void print_pattern_art_instance_DelegationBinding_2(pattern.art.instance.DelegationBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_instance_DelegationBinding_3(pattern.art.instance.DelegationBinding element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("id");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DELEGATION_BINDING__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
	}
	
	public void print_pattern_art_instance_ValuedAttribute(pattern.art.instance.ValuedAttribute element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValuedAttributeAttributeReferenceResolver().deResolve((pattern.art.type.BasicAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__ATTRIBUTE), element));
			}
			printCountingMap.put("attribute", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":=");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_ValuedAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_instance_ValuedAttribute_0(pattern.art.instance.ValuedAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.VALUED_ATTRIBUTE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_instance_DictionaryValuedAttribute(pattern.art.instance.DictionaryValuedAttribute element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES));
		printCountingMap.put("entries", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValuedAttributeAttributeReferenceResolver().deResolve((pattern.art.type.Dictionary) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), element));
			}
			printCountingMap.put("attribute", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":=");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_DictionaryValuedAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_DictionaryValuedAttribute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_instance_DictionaryValuedAttribute_0(pattern.art.instance.DictionaryValuedAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entries");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entries", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_instance_DictionaryValuedAttribute_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_pattern_art_instance_DictionaryValuedAttribute_0_0(pattern.art.instance.DictionaryValuedAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entries");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entries", count - 1);
		}
	}
	public void print_pattern_art_instance_DictionaryValuedAttribute_1(pattern.art.instance.DictionaryValuedAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DICTIONARY_VALUED_ATTRIBUTE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_instance_DefaultEntry(pattern.art.instance.DefaultEntry element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("[");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDefaultEntryKeyReferenceResolver().deResolve((pattern.art.type.DictionaryDefaultValue) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY)), element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__KEY), element));
			}
			printCountingMap.put("key", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("->");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("]");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_DefaultEntry_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_instance_DefaultEntry_0(pattern.art.instance.DefaultEntry element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.DEFAULT_ENTRY__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_instance_OtherEntry(pattern.art.instance.OtherEntry element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("[");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__KEY), element));
			}
			printCountingMap.put("key", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("->");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("]");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_instance_OtherEntry_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_instance_OtherEntry_0(pattern.art.instance.OtherEntry element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.instance.InstancePackage.OTHER_ENTRY__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_type_PrimitiveType(pattern.art.type.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PORT));
		printCountingMap.put("port", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("type");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_PrimitiveType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_PrimitiveType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_PrimitiveType_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_PrimitiveType_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_type_PrimitiveType_0(pattern.art.type.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_PrimitiveType_1(pattern.art.type.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_PrimitiveType_2(pattern.art.type.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("implementation");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_pattern_art_type_PrimitiveType_3(pattern.art.type.PrimitiveType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"port"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__ATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("attribute", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("port");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PRIMITIVE_TYPE__PORT));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("port", count - 1);
			}
		}
	}
	
	public void print_pattern_art_type_CompositeType(pattern.art.type.CompositeType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(6);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PORT));
		printCountingMap.put("port", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("compositetype");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_CompositeType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_CompositeType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_CompositeType_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_CompositeType_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_type_CompositeType_0(pattern.art.type.CompositeType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_CompositeType_1(pattern.art.type.CompositeType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_CompositeType_2(pattern.art.type.CompositeType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("implementation");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_pattern_art_type_CompositeType_3(pattern.art.type.CompositeType element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"port"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"attribute"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__ATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("attribute", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("port");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.COMPOSITE_TYPE__PORT));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("port", count - 1);
			}
		}
	}
	
	public void print_pattern_art_type_Operation(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__INPUT));
		printCountingMap.put("input", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("operation");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Operation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Operation_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_Operation_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Operation_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_Operation_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_pattern_art_type_Operation_0(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_Operation_1(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_Operation_2(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__INPUT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("input", count - 1);
		}
	}
	public void print_pattern_art_type_Operation_3(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__INPUT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("input", count - 1);
		}
	}
	public void print_pattern_art_type_Operation_4(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__OUTPUT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
	}
	public void print_pattern_art_type_Operation_5(pattern.art.type.Operation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.OPERATION__OUTPUT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
	}
	
	public void print_pattern_art_type_Parameter(pattern.art.type.Parameter element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_type_Parameter_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Parameter_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Parameter_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_type_Parameter_0(pattern.art.type.Parameter element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((pattern.art.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE)), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__TYPE), element));
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	public void print_pattern_art_type_Parameter_1(pattern.art.type.Parameter element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_Parameter_2(pattern.art.type.Parameter element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PARAMETER__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_type_FunctionalService(pattern.art.type.FunctionalService element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("functional");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("service");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_FunctionalService_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_FunctionalService_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_FunctionalService_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_type_FunctionalService_0(pattern.art.type.FunctionalService element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_FunctionalService_1(pattern.art.type.FunctionalService element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_FunctionalService_2(pattern.art.type.FunctionalService element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("operation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.FUNCTIONAL_SERVICE__OPERATION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("operation", count - 1);
		}
	}
	
	public void print_pattern_art_type_ControlService(pattern.art.type.ControlService element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("control");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("service");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_ControlService_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_ControlService_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_ControlService_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_type_ControlService_0(pattern.art.type.ControlService element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_ControlService_1(pattern.art.type.ControlService element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_ControlService_2(pattern.art.type.ControlService element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("operation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.CONTROL_SERVICE__OPERATION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("operation", count - 1);
		}
	}
	
	public void print_pattern_art_type_Port(pattern.art.type.Port element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE));
		printCountingMap.put("service", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE));
		printCountingMap.put("role", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL));
		printCountingMap.put("isOptional", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("role");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__ROLE), element));
			}
			printCountingMap.put("role", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Port_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("port");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Port_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Port_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Port_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Port_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_type_Port_0(pattern.art.type.Port element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("isOptional");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_OPTIONAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__IS_OPTIONAL), element));
			}
			printCountingMap.put("isOptional", count - 1);
		}
	}
	public void print_pattern_art_type_Port_1(pattern.art.type.Port element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_Port_2(pattern.art.type.Port element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_Port_3(pattern.art.type.Port element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"service"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("service");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver().deResolve((pattern.art.type.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE)), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__SERVICE), element));
				}
				printCountingMap.put("service", count - 1);
			}
		}
	}
	public void print_pattern_art_type_Port_4(pattern.art.type.Port element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("[");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("lower");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__LOWER), element));
			}
			printCountingMap.put("lower", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("..");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("upper");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT__UPPER), element));
			}
			printCountingMap.put("upper", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("]");
	}
	
	public void print_pattern_art_implem_FractalComponent(pattern.art.implem.FractalComponent element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC));
		printCountingMap.put("controllerDesc", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC));
		printCountingMap.put("contentDesc", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("FractalComponent");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("<");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("controllerDesc");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("controllerDesc");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), element));
			}
			printCountingMap.put("controllerDesc", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("contentDesc");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("contentDesc");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.FRACTAL_COMPONENT__CONTENT_DESC), element));
			}
			printCountingMap.put("contentDesc", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(">");
	}
	
	public void print_pattern_art_implem_OSGiComponent(pattern.art.implem.OSGiComponent element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS));
		printCountingMap.put("implementingClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("OSGiComponent");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_implem_OSGiComponent_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("implementingClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), element));
			}
			printCountingMap.put("implementingClass", count - 1);
		}
	}
	public void print_pattern_art_implem_OSGiComponent_0(pattern.art.implem.OSGiComponent element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_COMPONENT__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_implem_OSGiType(pattern.art.implem.OSGiType element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE));
		printCountingMap.put("generateInstanceBundle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("generateInstanceBundle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_IMPLEM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.implem.ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), element));
			}
			printCountingMap.put("generateInstanceBundle", count - 1);
		}
	}
	
	public void print_pattern_art_type_BasicAttribute(pattern.art.type.BasicAttribute element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE));
		printCountingMap.put("defaultValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("attribute");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_BasicAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_BasicAttribute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_type_BasicAttribute_2(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_BasicAttribute_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_type_BasicAttribute_0(pattern.art.type.BasicAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_BasicAttribute_1(pattern.art.type.BasicAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_BasicAttribute_2(pattern.art.type.BasicAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((pattern.art.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE)), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__TYPE), element));
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	public void print_pattern_art_type_BasicAttribute_3(pattern.art.type.BasicAttribute element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("default");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("defaultValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), element));
			}
			printCountingMap.put("defaultValue", count - 1);
		}
	}
	
	public void print_pattern_art_type_Dictionary(pattern.art.type.Dictionary element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__KEYS));
		printCountingMap.put("keys", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("attribute");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Dictionary_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Dictionary_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("[");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_type_Dictionary_2(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("->");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_type_Dictionary_3(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("]");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_Dictionary_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_pattern_art_type_Dictionary_0(pattern.art.type.Dictionary element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_Dictionary_1(pattern.art.type.Dictionary element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_Dictionary_2(pattern.art.type.Dictionary element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("type");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((pattern.art.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE)), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__TYPE), element));
				}
				printCountingMap.put("type", count - 1);
			}
		}
	}
	public void print_pattern_art_type_Dictionary_3(pattern.art.type.Dictionary element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"valueType"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("valueType");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValueTypeReferenceResolver().deResolve((pattern.art.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE)), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__VALUE_TYPE), element));
				}
				printCountingMap.put("valueType", count - 1);
			}
		}
	}
	public void print_pattern_art_type_Dictionary_4(pattern.art.type.Dictionary element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("default");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("keys");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY__KEYS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("keys",0);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	
	public void print_pattern_art_type_DictionaryDefaultValue(pattern.art.type.DictionaryDefaultValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("[");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__KEY), element));
			}
			printCountingMap.put("key", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_DictionaryDefaultValue_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_DictionaryDefaultValue_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("]");
	}
	public void print_pattern_art_type_DictionaryDefaultValue_0(pattern.art.type.DictionaryDefaultValue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("->");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
	}
	public void print_pattern_art_type_DictionaryDefaultValue_1(pattern.art.type.DictionaryDefaultValue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.DICTIONARY_DEFAULT_VALUE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_pattern_art_type_PortId(pattern.art.type.PortId element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_ID__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_pattern_art_type_PortCollection(pattern.art.type.PortCollection element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(5);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE));
		printCountingMap.put("service", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE));
		printCountingMap.put("role", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__IDS));
		printCountingMap.put("ids", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("role");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__ROLE), element));
			}
			printCountingMap.put("role", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("port");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_PortCollection_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_pattern_art_type_PortCollection_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_pattern_art_type_PortCollection_2(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ids");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__IDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ids", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_pattern_art_type_PortCollection_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	public void print_pattern_art_type_PortCollection_0(pattern.art.type.PortCollection element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_pattern_art_type_PortCollection_1(pattern.art.type.PortCollection element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_pattern_art_type_PortCollection_2(pattern.art.type.PortCollection element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"service"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("?");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
			count = printCountingMap.get("service");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE));
				if (o != null) {
					org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver().deResolve((pattern.art.type.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE)), element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__SERVICE), element));
				}
				printCountingMap.put("service", count - 1);
			}
		}
	}
	public void print_pattern_art_type_PortCollection_3(pattern.art.type.PortCollection element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ids");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(pattern.art.type.TypePackage.PORT_COLLECTION__IDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ids", count - 1);
		}
	}
	
	public void print_patternframework_ModelPattern(patternframework.ModelPattern element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__PATTERN));
		printCountingMap.put("pattern", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS));
		printCountingMap.put("constraints", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER));
		printCountingMap.put("featureIdentifier", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS));
		printCountingMap.put("falsepositivepatterns", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_patternframework_ModelPattern_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_patternframework_ModelPattern_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("pattern");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__PATTERN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("pattern", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_patternframework_ModelPattern_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_patternframework_ModelPattern_0(patternframework.ModelPattern element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constraints");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__CONSTRAINTS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constraints", count - 1);
		}
	}
	public void print_patternframework_ModelPattern_1(patternframework.ModelPattern element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("featureID");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("featureIdentifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FEATURE_IDENTIFIER), element));
			}
			printCountingMap.put("featureIdentifier", count - 1);
		}
	}
	public void print_patternframework_ModelPattern_2(patternframework.ModelPattern element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("negative");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("pattern");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("falsepositivepatterns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.MODEL_PATTERN__FALSEPOSITIVEPATTERNS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("falsepositivepatterns", count - 1);
		}
	}
	
	public void print_patternframework_PModel(patternframework.PModel element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PMODEL__CONTENT));
		printCountingMap.put("content", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PMODEL__ROLES));
		printCountingMap.put("roles", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("content");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PMODEL__CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("content", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_patternframework_PModel_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_patternframework_PModel_0(patternframework.PModel element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("roles");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("roles");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PMODEL__ROLES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("roles", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_patternframework_PModel_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
	}
	public void print_patternframework_PModel_0_0(patternframework.PModel element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("roles");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PMODEL__ROLES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("roles", count - 1);
		}
	}
	
	public void print_patternframework_PConstraint(patternframework.PConstraint element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE));
		printCountingMap.put("language", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("constraint");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("language");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__LANGUAGE), element));
			}
			printCountingMap.put("language", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PCONSTRAINT__EXPRESSION), element));
			}
			printCountingMap.put("expression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(";");
	}
	
	public void print_patternframework_PRole(patternframework.PRole element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER));
		printCountingMap.put("player", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("player");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER));
			if (o != null) {
				org.smartadapters.core.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPRolePlayerReferenceResolver().deResolve((patternframework.PObject) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER)), element.eClass().getEStructuralFeature(patternframework.PatternframeworkPackage.PROLE__PLAYER), element));
			}
			printCountingMap.put("player", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
	}
	
}
