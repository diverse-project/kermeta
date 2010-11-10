/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextPrinter implements smartadapters4ART.resource.smARText.ISmARTextTextPrinter {
	
	protected smartadapters4ART.resource.smARText.ISmARTextTokenResolverFactory tokenResolverFactory = new smartadapters4ART.resource.smARText.mopp.SmARTextTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/**
	 * Holds the resource that is associated with this printer. may be null if the
	 * printer is used stand alone.
	 */
	private smartadapters4ART.resource.smARText.ISmARTextTextResource resource;
	private java.util.Map<?, ?> options;
	
	public SmARTextPrinter(java.io.OutputStream outputStream, smartadapters4ART.resource.smARText.ISmARTextTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed){
		int pos = 0;
		int neg = 0;
		
		for(String featureName:featureCounter.keySet()){
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
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof smartadapters4ART.Aspect) {
			print_smartadapters4ART_Aspect((smartadapters4ART.Aspect) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.PointcutModel) {
			print_smartadapters4ART_PointcutModel((smartadapters4ART.PointcutModel) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.AdviceModel) {
			print_smartadapters4ART_AdviceModel((smartadapters4ART.AdviceModel) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.GlobalInstantiation) {
			print_smartadapters4ART_GlobalInstantiation((smartadapters4ART.GlobalInstantiation) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.PerRoleMatch) {
			print_smartadapters4ART_PerRoleMatch((smartadapters4ART.PerRoleMatch) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.PerElementMatch) {
			print_smartadapters4ART_PerElementMatch((smartadapters4ART.PerElementMatch) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.adaptations.SetruntimeSystem) {
			print_smartadapters4ART_adaptations_SetruntimeSystem((smartadapters4ART.adaptations.SetruntimeSystem) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance) {
			print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance((smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance) {
			print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance((smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance) {
			print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance((smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding) {
			print_smartadapters4ART_adaptations_SetruntimeinstanceTransmissionBinding((smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding) element, globaltab, out);
			return;
		}
		if (element instanceof smartadapters4ART.adaptations.SetruntimeNode) {
			print_smartadapters4ART_adaptations_SetruntimeNode((smartadapters4ART.adaptations.SetruntimeNode) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.System) {
			print_art_005frelaxed_System((art_relaxed.System) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.DataType) {
			print_art_005frelaxed_DataType((art_relaxed.DataType) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.distrib_relaxed.Node) {
			print_art_005frelaxed_distrib_005frelaxed_Node((art_relaxed.distrib_relaxed.Node) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.PrimitiveInstance) {
			print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance((art_relaxed.instance_relaxed.PrimitiveInstance) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.CompositeInstance) {
			print_art_005frelaxed_instance_005frelaxed_CompositeInstance((art_relaxed.instance_relaxed.CompositeInstance) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.TransmissionBinding) {
			print_art_005frelaxed_instance_005frelaxed_TransmissionBinding((art_relaxed.instance_relaxed.TransmissionBinding) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.DelegationBinding) {
			print_art_005frelaxed_instance_005frelaxed_DelegationBinding((art_relaxed.instance_relaxed.DelegationBinding) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.ValuedAttribute) {
			print_art_005frelaxed_instance_005frelaxed_ValuedAttribute((art_relaxed.instance_relaxed.ValuedAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.DictionaryValuedAttribute) {
			print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute((art_relaxed.instance_relaxed.DictionaryValuedAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.DefaultEntry) {
			print_art_005frelaxed_instance_005frelaxed_DefaultEntry((art_relaxed.instance_relaxed.DefaultEntry) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.instance_relaxed.OtherEntry) {
			print_art_005frelaxed_instance_005frelaxed_OtherEntry((art_relaxed.instance_relaxed.OtherEntry) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.PrimitiveType) {
			print_art_005frelaxed_type_005frelaxed_PrimitiveType((art_relaxed.type_relaxed.PrimitiveType) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.CompositeType) {
			print_art_005frelaxed_type_005frelaxed_CompositeType((art_relaxed.type_relaxed.CompositeType) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.Operation) {
			print_art_005frelaxed_type_005frelaxed_Operation((art_relaxed.type_relaxed.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.Parameter) {
			print_art_005frelaxed_type_005frelaxed_Parameter((art_relaxed.type_relaxed.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.FunctionalService) {
			print_art_005frelaxed_type_005frelaxed_FunctionalService((art_relaxed.type_relaxed.FunctionalService) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.ControlService) {
			print_art_005frelaxed_type_005frelaxed_ControlService((art_relaxed.type_relaxed.ControlService) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.Port) {
			print_art_005frelaxed_type_005frelaxed_Port((art_relaxed.type_relaxed.Port) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.implem_relaxed.FractalComponent) {
			print_art_005frelaxed_implem_005frelaxed_FractalComponent((art_relaxed.implem_relaxed.FractalComponent) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.implem_relaxed.OSGiComponent) {
			print_art_005frelaxed_implem_005frelaxed_OSGiComponent((art_relaxed.implem_relaxed.OSGiComponent) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.implem_relaxed.OSGiType) {
			print_art_005frelaxed_implem_005frelaxed_OSGiType((art_relaxed.implem_relaxed.OSGiType) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.BasicAttribute) {
			print_art_005frelaxed_type_005frelaxed_BasicAttribute((art_relaxed.type_relaxed.BasicAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.Dictionary) {
			print_art_005frelaxed_type_005frelaxed_Dictionary((art_relaxed.type_relaxed.Dictionary) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.DictionaryDefaultValue) {
			print_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue((art_relaxed.type_relaxed.DictionaryDefaultValue) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.PortId) {
			print_art_005frelaxed_type_005frelaxed_PortId((art_relaxed.type_relaxed.PortId) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.type_relaxed.PortCollection) {
			print_art_005frelaxed_type_005frelaxed_PortCollection((art_relaxed.type_relaxed.PortCollection) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.group_relaxed.TypeGroup) {
			print_art_005frelaxed_group_005frelaxed_TypeGroup((art_relaxed.group_relaxed.TypeGroup) element, globaltab, out);
			return;
		}
		if (element instanceof art_relaxed.group_relaxed.InstanceGroup) {
			print_art_005frelaxed_group_005frelaxed_InstanceGroup((art_relaxed.group_relaxed.InstanceGroup) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected smartadapters4ART.resource.smARText.mopp.SmARTextReferenceResolverSwitch getReferenceResolverSwitch() {
		return (smartadapters4ART.resource.smARText.mopp.SmARTextReferenceResolverSwitch) new smartadapters4ART.resource.smARText.mopp.SmARTextMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		smartadapters4ART.resource.smARText.ISmARTextTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new smartadapters4ART.resource.smARText.mopp.SmARTextProblem(errorMessage, smartadapters4ART.resource.smARText.SmARTextEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public smartadapters4ART.resource.smARText.ISmARTextTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_smartadapters4ART_Aspect(smartadapters4ART.Aspect element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__POINTCUT));
		printCountingMap.put("pointcut", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__ADVICE));
		printCountingMap.put("advice", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__STRATEGIES));
		printCountingMap.put("strategies", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__ADAPT));
		printCountingMap.put("adapt", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("pointcut");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("pointcut");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__POINTCUT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("pointcut", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("advice");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_smartadapters4ART_Aspect_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_smartadapters4ART_Aspect_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("protocol");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_Aspect_2(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_Aspect_0(smartadapters4ART.Aspect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("advice");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__ADVICE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("advice", count - 1);
		}
	}
	public void print_smartadapters4ART_Aspect_1(smartadapters4ART.Aspect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("strategies");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_Aspect_1_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_Aspect_1_0(smartadapters4ART.Aspect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("strategies");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__STRATEGIES));
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
			printCountingMap.put("strategies", count - 1);
		}
	}
	public void print_smartadapters4ART_Aspect_2(smartadapters4ART.Aspect element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("adapt");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ASPECT__ADAPT));
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
	
	public void print_smartadapters4ART_PointcutModel(smartadapters4ART.PointcutModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.POINTCUT_MODEL__CONTENT));
		printCountingMap.put("content", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_PointcutModel_0(element, localtab, out1, printCountingMap1);
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
	public void print_smartadapters4ART_PointcutModel_0(smartadapters4ART.PointcutModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("content");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.POINTCUT_MODEL__CONTENT));
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_smartadapters4ART_AdviceModel(smartadapters4ART.AdviceModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ADVICE_MODEL__CONTENT));
		printCountingMap.put("content", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_AdviceModel_0(element, localtab, out1, printCountingMap1);
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
	public void print_smartadapters4ART_AdviceModel_0(smartadapters4ART.AdviceModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("content");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.ADVICE_MODEL__CONTENT));
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_smartadapters4ART_GlobalInstantiation(smartadapters4ART.GlobalInstantiation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS));
		printCountingMap.put("adviceElements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("global");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("adviceElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstantiationStrategyAdviceElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS), element));
			}
			printCountingMap.put("adviceElements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_GlobalInstantiation_0(element, localtab, out1, printCountingMap1);
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
	public void print_smartadapters4ART_GlobalInstantiation_0(smartadapters4ART.GlobalInstantiation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("adviceElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstantiationStrategyAdviceElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.GLOBAL_INSTANTIATION__ADVICE_ELEMENTS), element));
			}
			printCountingMap.put("adviceElements", count - 1);
		}
	}
	
	public void print_smartadapters4ART_PerRoleMatch(smartadapters4ART.PerRoleMatch element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS));
		printCountingMap.put("adviceElements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS));
		printCountingMap.put("pointcutElements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("per");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("role");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("pointcutElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getScopedInstantiationPointcutElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS), element));
			}
			printCountingMap.put("pointcutElements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_PerRoleMatch_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("adviceElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstantiationStrategyAdviceElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS), element));
			}
			printCountingMap.put("adviceElements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_PerRoleMatch_1(element, localtab, out1, printCountingMap1);
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
	public void print_smartadapters4ART_PerRoleMatch_0(smartadapters4ART.PerRoleMatch element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("pointcutElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getScopedInstantiationPointcutElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__POINTCUT_ELEMENTS), element));
			}
			printCountingMap.put("pointcutElements", count - 1);
		}
	}
	public void print_smartadapters4ART_PerRoleMatch_1(smartadapters4ART.PerRoleMatch element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("adviceElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstantiationStrategyAdviceElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ROLE_MATCH__ADVICE_ELEMENTS), element));
			}
			printCountingMap.put("adviceElements", count - 1);
		}
	}
	
	public void print_smartadapters4ART_PerElementMatch(smartadapters4ART.PerElementMatch element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS));
		printCountingMap.put("adviceElements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS));
		printCountingMap.put("pointcutElements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("per");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("elements");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("pointcutElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getScopedInstantiationPointcutElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS), element));
			}
			printCountingMap.put("pointcutElements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_PerElementMatch_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("adviceElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstantiationStrategyAdviceElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS), element));
			}
			printCountingMap.put("adviceElements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_PerElementMatch_1(element, localtab, out1, printCountingMap1);
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
	public void print_smartadapters4ART_PerElementMatch_0(smartadapters4ART.PerElementMatch element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("pointcutElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getScopedInstantiationPointcutElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__POINTCUT_ELEMENTS), element));
			}
			printCountingMap.put("pointcutElements", count - 1);
		}
	}
	public void print_smartadapters4ART_PerElementMatch_1(smartadapters4ART.PerElementMatch element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("adviceElements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstantiationStrategyAdviceElementsReferenceResolver().deResolve((art_relaxed.AspectModelElement) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.Smartadapters4ARTPackage.PER_ELEMENT_MATCH__ADVICE_ELEMENTS), element));
			}
			printCountingMap.put("adviceElements", count - 1);
		}
	}
	
	public void print_smartadapters4ART_adaptations_SetruntimeSystem(smartadapters4ART.adaptations.SetruntimeSystem element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET));
		printCountingMap.put("SystemToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT));
		printCountingMap.put("refroot", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES));
		printCountingMap.put("refservices", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES));
		printCountingMap.put("reftypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES));
		printCountingMap.put("refdataTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("system");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("SystemToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemSystemToSetReferenceResolver().deResolve((art_relaxed.System) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__SYSTEM_TO_SET), element));
			}
			printCountingMap.put("SystemToSet", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_adaptations_SetruntimeSystem_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_adaptations_SetruntimeSystem_0(smartadapters4ART.adaptations.SetruntimeSystem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("services");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refservices");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver().deResolve((art_relaxed.type_relaxed.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), element));
					}
					printCountingMap.put("refservices", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeSystem_0_0(element, localtab, out1, printCountingMap1);
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("types");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("reftypes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), element));
					}
					printCountingMap.put("reftypes", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeSystem_0_1(element, localtab, out1, printCountingMap1);
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("datatypes");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refdataTypes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver().deResolve((art_relaxed.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), element));
					}
					printCountingMap.put("refdataTypes", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeSystem_0_2(element, localtab, out1, printCountingMap1);
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
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "	";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (CsString)
			out.print("root");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("=");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("refroot");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT));
				if (o != null) {
					smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefrootReferenceResolver().deResolve((art_relaxed.instance_relaxed.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFROOT), element));
				}
				printCountingMap.put("refroot", count - 1);
			}
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeSystem_0_0(smartadapters4ART.adaptations.SetruntimeSystem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refservices");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefservicesReferenceResolver().deResolve((art_relaxed.type_relaxed.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFSERVICES), element));
			}
			printCountingMap.put("refservices", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeSystem_0_1(smartadapters4ART.adaptations.SetruntimeSystem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("reftypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemReftypesReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFTYPES), element));
			}
			printCountingMap.put("reftypes", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeSystem_0_2(smartadapters4ART.adaptations.SetruntimeSystem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refdataTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeSystemRefdataTypesReferenceResolver().deResolve((art_relaxed.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_SYSTEM__REFDATA_TYPES), element));
			}
			printCountingMap.put("refdataTypes", count - 1);
		}
	}
	
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance(smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET));
		printCountingMap.put("ComponentInstanceToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE));
		printCountingMap.put("reftype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE));
		printCountingMap.put("refstate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT));
		printCountingMap.put("refsuperComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE));
		printCountingMap.put("refattribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING));
		printCountingMap.put("refbinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("instance");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ComponentInstanceToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET), element));
			}
			printCountingMap.put("ComponentInstanceToSet", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance_0(smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("state");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refstate");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE), element));
					}
					printCountingMap.put("refstate", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("super");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refsuperComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver().deResolve((art_relaxed.instance_relaxed.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT), element));
					}
					printCountingMap.put("refsuperComponent", count - 1);
				}
			}
			break;
			case 3:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("attribute");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refattribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver().deResolve((art_relaxed.instance_relaxed.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), element));
					}
					printCountingMap.put("refattribute", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance_0_0(element, localtab, out1, printCountingMap1);
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("binding");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refbinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), element));
					}
					printCountingMap.put("refbinding", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance_0_1(element, localtab, out1, printCountingMap1);
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("name");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refname");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME), element));
					}
					printCountingMap.put("refname", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "	";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (CsString)
			out.print("type");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("=");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("reftype");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE));
				if (o != null) {
					smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceReftypeReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE), element));
				}
				printCountingMap.put("reftype", count - 1);
			}
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance_0_0(smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refattribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver().deResolve((art_relaxed.instance_relaxed.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE), element));
			}
			printCountingMap.put("refattribute", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance_0_1(smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refbinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING), element));
			}
			printCountingMap.put("refbinding", count - 1);
		}
	}
	
	public void print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance(smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET));
		printCountingMap.put("PrimitiveInstanceToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE));
		printCountingMap.put("reftype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE));
		printCountingMap.put("refstate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT));
		printCountingMap.put("refsuperComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE));
		printCountingMap.put("refattribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING));
		printCountingMap.put("refbinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("primitive");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("component");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("PrimitiveInstanceToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver().deResolve((art_relaxed.instance_relaxed.PrimitiveInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET), element));
			}
			printCountingMap.put("PrimitiveInstanceToSet", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance_0(smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("state");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refstate");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE), element));
					}
					printCountingMap.put("refstate", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("super");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refsuperComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver().deResolve((art_relaxed.instance_relaxed.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT), element));
					}
					printCountingMap.put("refsuperComponent", count - 1);
				}
			}
			break;
			case 3:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("attribute");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refattribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver().deResolve((art_relaxed.instance_relaxed.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), element));
					}
					printCountingMap.put("refattribute", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance_0_0(element, localtab, out1, printCountingMap1);
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("binding");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refbinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), element));
					}
					printCountingMap.put("refbinding", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance_0_1(element, localtab, out1, printCountingMap1);
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("name");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refname");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME), element));
					}
					printCountingMap.put("refname", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "	";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (CsString)
			out.print("type");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("=");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("reftype");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE));
				if (o != null) {
					smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceReftypeReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE), element));
				}
				printCountingMap.put("reftype", count - 1);
			}
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance_0_0(smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refattribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver().deResolve((art_relaxed.instance_relaxed.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE), element));
			}
			printCountingMap.put("refattribute", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance_0_1(smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refbinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING), element));
			}
			printCountingMap.put("refbinding", count - 1);
		}
	}
	
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET));
		printCountingMap.put("CompositeInstanceToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT));
		printCountingMap.put("refsubComponent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION));
		printCountingMap.put("refdelegation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE));
		printCountingMap.put("reftype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE));
		printCountingMap.put("refstate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT));
		printCountingMap.put("refsuperComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE));
		printCountingMap.put("refattribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING));
		printCountingMap.put("refbinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME));
		printCountingMap.put("refname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("composite");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("component");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("CompositeInstanceToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver().deResolve((art_relaxed.instance_relaxed.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET), element));
			}
			printCountingMap.put("CompositeInstanceToSet", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("delegation");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refdelegation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver().deResolve((art_relaxed.instance_relaxed.DelegationBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), element));
					}
					printCountingMap.put("refdelegation", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_1(element, localtab, out1, printCountingMap1);
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("state");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refstate");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE), element));
					}
					printCountingMap.put("refstate", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("super");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refsuperComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver().deResolve((art_relaxed.instance_relaxed.CompositeInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT), element));
					}
					printCountingMap.put("refsuperComponent", count - 1);
				}
			}
			break;
			case 4:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("attribute");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refattribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver().deResolve((art_relaxed.instance_relaxed.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), element));
					}
					printCountingMap.put("refattribute", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_2(element, localtab, out1, printCountingMap1);
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
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("binding");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("+=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refbinding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), element));
					}
					printCountingMap.put("refbinding", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
					print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_3(element, localtab, out1, printCountingMap1);
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("name");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refname");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME), element));
					}
					printCountingMap.put("refname", count - 1);
				}
			}
			break;
			default:			boolean iterate = true;
			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.Map<String, Integer> printCountingMap1 = null;
			// DEFINITION PART BEGINS (LineBreak)
			localtab += "	";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (CsString)
			out.print("component");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("+=");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("refsubComponent");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), element));
				}
				printCountingMap.put("refsubComponent", count - 1);
			}
			// DEFINITION PART BEGINS (CompoundDefinition)
			iterate = true;
			while (iterate) {
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_0(element, localtab, out1, printCountingMap1);
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
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_0(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refsubComponent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT), element));
			}
			printCountingMap.put("refsubComponent", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_1(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refdelegation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver().deResolve((art_relaxed.instance_relaxed.DelegationBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION), element));
			}
			printCountingMap.put("refdelegation", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_2(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refattribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver().deResolve((art_relaxed.instance_relaxed.ValuedAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE), element));
			}
			printCountingMap.put("refattribute", count - 1);
		}
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance_0_3(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("refbinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING), element));
			}
			printCountingMap.put("refbinding", count - 1);
		}
	}
	
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceTransmissionBinding(smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET));
		printCountingMap.put("TransmissionBindingToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT));
		printCountingMap.put("refclient", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER));
		printCountingMap.put("refserver", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE));
		printCountingMap.put("refserverInstance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID));
		printCountingMap.put("refId", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("binding");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("TransmissionBindingToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver().deResolve((art_relaxed.instance_relaxed.TransmissionBinding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET), element));
			}
			printCountingMap.put("TransmissionBindingToSet", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_adaptations_SetruntimeinstanceTransmissionBinding_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_adaptations_SetruntimeinstanceTransmissionBinding_0(smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("providedPort");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refserver");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverReferenceResolver().deResolve((art_relaxed.type_relaxed.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER), element));
					}
					printCountingMap.put("refserver", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("server");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("refserverInstance");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE), element));
					}
					printCountingMap.put("refserverInstance", count - 1);
				}
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (CsString)
				out.print("id");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("refId");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID), element));
					}
					printCountingMap.put("refId", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "	";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (CsString)
			out.print("requiredPort");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("=");
			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("refclient");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT));
				if (o != null) {
					smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeinstanceTransmissionBindingRefclientReferenceResolver().deResolve((art_relaxed.type_relaxed.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT), element));
				}
				printCountingMap.put("refclient", count - 1);
			}
		}
	}
	
	public void print_smartadapters4ART_adaptations_SetruntimeNode(smartadapters4ART.adaptations.SetruntimeNode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET));
		printCountingMap.put("nodeToSet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("node");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("nodeToSet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeNodeNodeToSetReferenceResolver().deResolve((art_relaxed.distrib_relaxed.Node) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__NODE_TO_SET), element));
			}
			printCountingMap.put("nodeToSet", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_smartadapters4ART_adaptations_SetruntimeNode_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_smartadapters4ART_adaptations_SetruntimeNode_0(smartadapters4ART.adaptations.SetruntimeNode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("components");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("components");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getSetruntimeNodeComponentsReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS)), element.eClass().getEStructuralFeature(smartadapters4ART.adaptations.AdaptationsPackage.SETRUNTIME_NODE__COMPONENTS), element));
			}
			printCountingMap.put("components", count - 1);
		}
	}
	
	public void print_art_005frelaxed_System(art_relaxed.System element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__NODES));
		printCountingMap.put("nodes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__SERVICES));
		printCountingMap.put("services", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__TYPES));
		printCountingMap.put("types", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__DATA_TYPES));
		printCountingMap.put("dataTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("system");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_System_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_System_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_System_2(element, localtab, out1, printCountingMap1);
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
	public void print_art_005frelaxed_System_0(art_relaxed.System element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_System_1(art_relaxed.System element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_System_2(art_relaxed.System element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_System_2_0(element, localtab, out, printCountingMap);
	}
	public void print_art_005frelaxed_System_2_0(art_relaxed.System element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"nodes"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"services"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"types"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"dataTypes"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"groups"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("services");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__SERVICES));
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
			break;
			case 2:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("types");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__TYPES));
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
			case 3:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("dataTypes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__DATA_TYPES));
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
			case 4:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("groups");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__GROUPS));
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
					printCountingMap.put("groups", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("nodes");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.SYSTEM__NODES));
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
				printCountingMap.put("nodes", count - 1);
			}
		}
	}
	
	public void print_art_005frelaxed_DataType(art_relaxed.DataType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.DATA_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.DATA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("datatype");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_DataType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_DataType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
	}
	public void print_art_005frelaxed_DataType_0(art_relaxed.DataType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.DATA_TYPE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.DATA_TYPE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_DataType_1(art_relaxed.DataType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.DATA_TYPE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.Art_relaxedPackage.DATA_TYPE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_distrib_005frelaxed_Node(art_relaxed.distrib_relaxed.Node element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__COMPONENTS));
		printCountingMap.put("components", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("node");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_distrib_005frelaxed_Node_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_distrib_005frelaxed_Node_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_distrib_005frelaxed_Node_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("components");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__COMPONENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("components", 0);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_distrib_005frelaxed_Node_0(art_relaxed.distrib_relaxed.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_distrib_005frelaxed_Node_1(art_relaxed.distrib_relaxed.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_distrib_005frelaxed_Node_2(art_relaxed.distrib_relaxed.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("uri");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("uri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__URI));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.distrib_relaxed.Distrib_relaxedPackage.NODE__URI), element));
			}
			printCountingMap.put("uri", count - 1);
		}
	}
	
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__STATE));
		printCountingMap.put("state", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__SUPER_COMPONENT));
		printCountingMap.put("superComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("primitive");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("instance");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_5(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_0(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_1(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_2(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__TYPE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__TYPE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__TYPE), element));
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_3(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("state");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__STATE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__STATE), element));
			}
			printCountingMap.put("state", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_4(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("implementation");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_5(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_5_0(element, localtab, out, printCountingMap);
	}
	public void print_art_005frelaxed_instance_005frelaxed_PrimitiveInstance_5_0(art_relaxed.instance_relaxed.PrimitiveInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("binding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__BINDING));
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
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("attribute");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.PRIMITIVE_INSTANCE__ATTRIBUTE));
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
	
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(11);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__STATE));
		printCountingMap.put("state", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__SUPER_COMPONENT));
		printCountingMap.put("superComponent", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__SUB_COMPONENT));
		printCountingMap.put("subComponent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__DELEGATION));
		printCountingMap.put("delegation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("composite");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("instance");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_CompositeInstance_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_CompositeInstance_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_CompositeInstance_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_CompositeInstance_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_CompositeInstance_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_instance_005frelaxed_CompositeInstance_5(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_0(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_1(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_2(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__TYPE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getComponentInstanceTypeReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__TYPE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__TYPE), element));
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_3(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("state");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__STATE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_INSTANCE_STATE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__STATE), element));
			}
			printCountingMap.put("state", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_4(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("implementation");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_5(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_CompositeInstance_5_0(element, localtab, out, printCountingMap);
	}
	public void print_art_005frelaxed_instance_005frelaxed_CompositeInstance_5_0(art_relaxed.instance_relaxed.CompositeInstance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("binding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__BINDING));
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
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("subComponent");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__SUB_COMPONENT));
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
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("delegation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__DELEGATION));
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
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("attribute");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.COMPOSITE_INSTANCE__ATTRIBUTE));
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
	
	public void print_art_005frelaxed_instance_005frelaxed_TransmissionBinding(art_relaxed.instance_relaxed.TransmissionBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER_INSTANCE));
		printCountingMap.put("serverInstance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT));
		printCountingMap.put("client", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER));
		printCountingMap.put("server", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("bind");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_0(art_relaxed.instance_relaxed.TransmissionBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"client"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("client");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingClientReferenceResolver().deResolve((art_relaxed.type_relaxed.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT), element));
					}
					printCountingMap.put("client", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_1(art_relaxed.instance_relaxed.TransmissionBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"serverInstance"		,
		"server"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("serverInstance");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER_INSTANCE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER_INSTANCE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER_INSTANCE), element));
					}
					printCountingMap.put("serverInstance", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("::");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("server");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTransmissionBindingServerReferenceResolver().deResolve((art_relaxed.type_relaxed.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER), element));
					}
					printCountingMap.put("server", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_2(art_relaxed.instance_relaxed.TransmissionBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_TransmissionBinding_3(art_relaxed.instance_relaxed.TransmissionBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (CsString)
		out.print("id");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__ID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.TRANSMISSION_BINDING__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
	}
	
	public void print_art_005frelaxed_instance_005frelaxed_DelegationBinding(art_relaxed.instance_relaxed.DelegationBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SERVER_INSTANCE));
		printCountingMap.put("serverInstance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__EXPORTED));
		printCountingMap.put("exported", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("delegate");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_DelegationBinding_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_instance_005frelaxed_DelegationBinding_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_DelegationBinding_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_DelegationBinding_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_DelegationBinding_0(art_relaxed.instance_relaxed.DelegationBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"source"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("source");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SOURCE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingSourceReferenceResolver().deResolve((art_relaxed.type_relaxed.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SOURCE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SOURCE), element));
					}
					printCountingMap.put("source", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_DelegationBinding_1(art_relaxed.instance_relaxed.DelegationBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"serverInstance"		,
		"exported"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("serverInstance");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SERVER_INSTANCE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBindingServerInstanceReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SERVER_INSTANCE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__SERVER_INSTANCE), element));
					}
					printCountingMap.put("serverInstance", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("::");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("exported");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__EXPORTED));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDelegationBindingExportedReferenceResolver().deResolve((art_relaxed.type_relaxed.AbstractPort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__EXPORTED)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__EXPORTED), element));
					}
					printCountingMap.put("exported", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_DelegationBinding_2(art_relaxed.instance_relaxed.DelegationBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_DelegationBinding_3(art_relaxed.instance_relaxed.DelegationBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (CsString)
		out.print("id");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__ID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DELEGATION_BINDING__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
	}
	
	public void print_art_005frelaxed_instance_005frelaxed_ValuedAttribute(art_relaxed.instance_relaxed.ValuedAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__ATTRIBUTE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getValuedAttributeAttributeReferenceResolver().deResolve((art_relaxed.type_relaxed.BasicAttribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__ATTRIBUTE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__ATTRIBUTE), element));
			}
			printCountingMap.put("attribute", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__VALUE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_ValuedAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_ValuedAttribute_0(art_relaxed.instance_relaxed.ValuedAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.VALUED_ATTRIBUTE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute(art_relaxed.instance_relaxed.DictionaryValuedAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES));
		printCountingMap.put("entries", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValuedAttributeAttributeReferenceResolver().deResolve((art_relaxed.type_relaxed.Dictionary) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE), element));
			}
			printCountingMap.put("attribute", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute_0(art_relaxed.instance_relaxed.DictionaryValuedAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("entries");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES));
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
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute_0_0(element, localtab, out1, printCountingMap1);
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
	public void print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute_0_0(art_relaxed.instance_relaxed.DictionaryValuedAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("entries");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__ENTRIES));
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
	public void print_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute_1(art_relaxed.instance_relaxed.DictionaryValuedAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_instance_005frelaxed_DefaultEntry(art_relaxed.instance_relaxed.DefaultEntry element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__KEY));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDefaultEntryKeyReferenceResolver().deResolve((art_relaxed.type_relaxed.DictionaryDefaultValue) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__KEY)), element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__KEY), element));
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__VALUE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_DefaultEntry_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_DefaultEntry_0(art_relaxed.instance_relaxed.DefaultEntry element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.DEFAULT_ENTRY__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_instance_005frelaxed_OtherEntry(art_relaxed.instance_relaxed.OtherEntry element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__KEY));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__KEY), element));
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__VALUE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_instance_005frelaxed_OtherEntry_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_instance_005frelaxed_OtherEntry_0(art_relaxed.instance_relaxed.OtherEntry element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.instance_relaxed.Instance_relaxedPackage.OTHER_ENTRY__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_type_005frelaxed_PrimitiveType(art_relaxed.type_relaxed.PrimitiveType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__PORT));
		printCountingMap.put("port", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("type");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_PrimitiveType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_PrimitiveType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_PrimitiveType_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_PrimitiveType_3(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_type_005frelaxed_PrimitiveType_0(art_relaxed.type_relaxed.PrimitiveType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_PrimitiveType_1(art_relaxed.type_relaxed.PrimitiveType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_PrimitiveType_2(art_relaxed.type_relaxed.PrimitiveType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("implementation");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_PrimitiveType_3(art_relaxed.type_relaxed.PrimitiveType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__ATTRIBUTE));
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
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("port");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PRIMITIVE_TYPE__PORT));
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
	
	public void print_art_005frelaxed_type_005frelaxed_CompositeType(art_relaxed.type_relaxed.CompositeType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__PORT));
		printCountingMap.put("port", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__GROUPS));
		printCountingMap.put("groups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__IMPLEM));
		printCountingMap.put("implem", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("compositetype");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_CompositeType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_CompositeType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_CompositeType_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_CompositeType_3(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_type_005frelaxed_CompositeType_0(art_relaxed.type_relaxed.CompositeType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_CompositeType_1(art_relaxed.type_relaxed.CompositeType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_CompositeType_2(art_relaxed.type_relaxed.CompositeType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("implementation");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("implem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__IMPLEM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("implem", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_CompositeType_3(art_relaxed.type_relaxed.CompositeType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
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
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("attribute");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__ATTRIBUTE));
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
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("port");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.COMPOSITE_TYPE__PORT));
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
	
	public void print_art_005frelaxed_type_005frelaxed_Operation(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__INPUT));
		printCountingMap.put("input", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("operation");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Operation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Operation_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_Operation_3(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Operation_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_Operation_5(element, localtab, out1, printCountingMap1);
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
	public void print_art_005frelaxed_type_005frelaxed_Operation_0(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Operation_1(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Operation_2(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__INPUT));
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
	public void print_art_005frelaxed_type_005frelaxed_Operation_3(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__INPUT));
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
	public void print_art_005frelaxed_type_005frelaxed_Operation_4(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__OUTPUT));
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
	public void print_art_005frelaxed_type_005frelaxed_Operation_5(art_relaxed.type_relaxed.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.OPERATION__OUTPUT));
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
	
	public void print_art_005frelaxed_type_005frelaxed_Parameter(art_relaxed.type_relaxed.Parameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_type_005frelaxed_Parameter_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Parameter_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Parameter_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Parameter_0(art_relaxed.type_relaxed.Parameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__TYPE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((art_relaxed.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__TYPE)), element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__TYPE), element));
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Parameter_1(art_relaxed.type_relaxed.Parameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Parameter_2(art_relaxed.type_relaxed.Parameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PARAMETER__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_type_005frelaxed_FunctionalService(art_relaxed.type_relaxed.FunctionalService element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("functional");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("service");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_FunctionalService_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_FunctionalService_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_FunctionalService_2(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_type_005frelaxed_FunctionalService_0(art_relaxed.type_relaxed.FunctionalService element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_FunctionalService_1(art_relaxed.type_relaxed.FunctionalService element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_FunctionalService_2(art_relaxed.type_relaxed.FunctionalService element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.FUNCTIONAL_SERVICE__OPERATION));
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
	
	public void print_art_005frelaxed_type_005frelaxed_ControlService(art_relaxed.type_relaxed.ControlService element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("control");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("service");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_ControlService_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_ControlService_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_ControlService_2(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_type_005frelaxed_ControlService_0(art_relaxed.type_relaxed.ControlService element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_ControlService_1(art_relaxed.type_relaxed.ControlService element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_ControlService_2(art_relaxed.type_relaxed.ControlService element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.CONTROL_SERVICE__OPERATION));
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
	
	public void print_art_005frelaxed_type_005frelaxed_Port(art_relaxed.type_relaxed.Port element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__LOWER));
		printCountingMap.put("lower", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__UPPER));
		printCountingMap.put("upper", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__SERVICE));
		printCountingMap.put("service", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__ROLE));
		printCountingMap.put("role", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__PROTOCOL));
		printCountingMap.put("protocol", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("role");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__ROLE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__ROLE), element));
			}
			printCountingMap.put("role", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("port");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Port_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Port_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Port_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Port_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Port_0(art_relaxed.type_relaxed.Port element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Port_1(art_relaxed.type_relaxed.Port element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Port_2(art_relaxed.type_relaxed.Port element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"service"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("service");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__SERVICE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver().deResolve((art_relaxed.type_relaxed.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__SERVICE)), element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__SERVICE), element));
					}
					printCountingMap.put("service", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Port_3(art_relaxed.type_relaxed.Port element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("lower");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__LOWER));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__LOWER), element));
			}
			printCountingMap.put("lower", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("..");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("upper");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__UPPER));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULTIPLICITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT__UPPER), element));
			}
			printCountingMap.put("upper", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
	}
	
	public void print_art_005frelaxed_implem_005frelaxed_FractalComponent(art_relaxed.implem_relaxed.FractalComponent element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__CONTROLLER_DESC));
		printCountingMap.put("controllerDesc", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__CONTENT_DESC));
		printCountingMap.put("contentDesc", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FractalComponent");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		// DEFINITION PART BEGINS (CsString)
		out.print("controllerDesc");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("controllerDesc");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__CONTROLLER_DESC));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__CONTROLLER_DESC), element));
			}
			printCountingMap.put("controllerDesc", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("contentDesc");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("contentDesc");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__CONTENT_DESC));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.FRACTAL_COMPONENT__CONTENT_DESC), element));
			}
			printCountingMap.put("contentDesc", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
	}
	
	public void print_art_005frelaxed_implem_005frelaxed_OSGiComponent(art_relaxed.implem_relaxed.OSGiComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_COMPONENT__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS));
		printCountingMap.put("implementingClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OSGiComponent");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_implem_005frelaxed_OSGiComponent_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("implementingClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS), element));
			}
			printCountingMap.put("implementingClass", count - 1);
		}
	}
	public void print_art_005frelaxed_implem_005frelaxed_OSGiComponent_0(art_relaxed.implem_relaxed.OSGiComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_COMPONENT__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_COMPONENT__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_implem_005frelaxed_OSGiType(art_relaxed.implem_relaxed.OSGiType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_TYPE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE));
		printCountingMap.put("generateInstanceBundle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("generateInstanceBundle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_IMPLEM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.implem_relaxed.Implem_relaxedPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE), element));
			}
			printCountingMap.put("generateInstanceBundle", count - 1);
		}
	}
	
	public void print_art_005frelaxed_type_005frelaxed_BasicAttribute(art_relaxed.type_relaxed.BasicAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__DEFAULT_VALUE));
		printCountingMap.put("defaultValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("attribute");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_BasicAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_BasicAttribute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_type_005frelaxed_BasicAttribute_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_BasicAttribute_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_BasicAttribute_0(art_relaxed.type_relaxed.BasicAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_BasicAttribute_1(art_relaxed.type_relaxed.BasicAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_BasicAttribute_2(art_relaxed.type_relaxed.BasicAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__TYPE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((art_relaxed.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__TYPE)), element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__TYPE), element));
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_BasicAttribute_3(art_relaxed.type_relaxed.BasicAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("default");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("defaultValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__DEFAULT_VALUE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.BASIC_ATTRIBUTE__DEFAULT_VALUE), element));
			}
			printCountingMap.put("defaultValue", count - 1);
		}
	}
	
	public void print_art_005frelaxed_type_005frelaxed_Dictionary(art_relaxed.type_relaxed.Dictionary element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__KEYS));
		printCountingMap.put("keys", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("attribute");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Dictionary_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Dictionary_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_type_005frelaxed_Dictionary_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_type_005frelaxed_Dictionary_3(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_Dictionary_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Dictionary_0(art_relaxed.type_relaxed.Dictionary element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Dictionary_1(art_relaxed.type_relaxed.Dictionary element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Dictionary_2(art_relaxed.type_relaxed.Dictionary element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("type");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__TYPE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypedElementTypeReferenceResolver().deResolve((art_relaxed.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__TYPE)), element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__TYPE), element));
					}
					printCountingMap.put("type", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Dictionary_3(art_relaxed.type_relaxed.Dictionary element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"valueType"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("valueType");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__VALUE_TYPE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDictionaryValueTypeReferenceResolver().deResolve((art_relaxed.DataType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__VALUE_TYPE)), element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__VALUE_TYPE), element));
					}
					printCountingMap.put("valueType", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_Dictionary_4(art_relaxed.type_relaxed.Dictionary element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("default");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keys");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY__KEYS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("keys", 0);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	
	public void print_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue(art_relaxed.type_relaxed.DictionaryDefaultValue element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__KEY));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__KEY), element));
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
	}
	public void print_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue_0(art_relaxed.type_relaxed.DictionaryDefaultValue element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__VALUE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__VALUE), element));
			}
			printCountingMap.put("value", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue_1(art_relaxed.type_relaxed.DictionaryDefaultValue element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	
	public void print_art_005frelaxed_type_005frelaxed_PortId(art_relaxed.type_relaxed.PortId element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_ID__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_ID__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_ID__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_ID__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_art_005frelaxed_type_005frelaxed_PortCollection(art_relaxed.type_relaxed.PortCollection element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__SERVICE));
		printCountingMap.put("service", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__ROLE));
		printCountingMap.put("role", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__PROTOCOL));
		printCountingMap.put("protocol", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__IDS));
		printCountingMap.put("ids", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("role");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__ROLE));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("T_PORT_KIND");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__ROLE), element));
			}
			printCountingMap.put("role", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("port");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_PortCollection_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_type_005frelaxed_PortCollection_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_art_005frelaxed_type_005frelaxed_PortCollection_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ids");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__IDS));
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
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_type_005frelaxed_PortCollection_3(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_type_005frelaxed_PortCollection_0(art_relaxed.type_relaxed.PortCollection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_PortCollection_1(art_relaxed.type_relaxed.PortCollection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_PortCollection_2(art_relaxed.type_relaxed.PortCollection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"service"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("service");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__SERVICE));
					if (o != null) {
						smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractPortServiceReferenceResolver().deResolve((art_relaxed.type_relaxed.Service) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__SERVICE)), element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__SERVICE), element));
					}
					printCountingMap.put("service", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("?");
		}
	}
	public void print_art_005frelaxed_type_005frelaxed_PortCollection_3(art_relaxed.type_relaxed.PortCollection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ids");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.type_relaxed.Type_relaxedPackage.PORT_COLLECTION__IDS));
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
	
	public void print_art_005frelaxed_group_005frelaxed_TypeGroup(art_relaxed.group_relaxed.TypeGroup element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES));
		printCountingMap.put("types", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS));
		printCountingMap.put("subGroups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("typegroup");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_group_005frelaxed_TypeGroup_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_group_005frelaxed_TypeGroup_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_group_005frelaxed_TypeGroup_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_group_005frelaxed_TypeGroup_3(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_group_005frelaxed_TypeGroup_0(art_relaxed.group_relaxed.TypeGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_group_005frelaxed_TypeGroup_1(art_relaxed.group_relaxed.TypeGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_group_005frelaxed_TypeGroup_2(art_relaxed.group_relaxed.TypeGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("types");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("types");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeGroupTypesReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES)), element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES), element));
			}
			printCountingMap.put("types", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_group_005frelaxed_TypeGroup_2_0(element, localtab, out1, printCountingMap1);
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
	public void print_art_005frelaxed_group_005frelaxed_TypeGroup_2_0(art_relaxed.group_relaxed.TypeGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("types");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTypeGroupTypesReferenceResolver().deResolve((art_relaxed.type_relaxed.ComponentType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES)), element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__TYPES), element));
			}
			printCountingMap.put("types", count - 1);
		}
	}
	public void print_art_005frelaxed_group_005frelaxed_TypeGroup_3(art_relaxed.group_relaxed.TypeGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subGroups");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS));
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
			printCountingMap.put("subGroups", count - 1);
		}
	}
	
	public void print_art_005frelaxed_group_005frelaxed_InstanceGroup(art_relaxed.group_relaxed.InstanceGroup element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__PID));
		printCountingMap.put("pid", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES));
		printCountingMap.put("instances", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS));
		printCountingMap.put("subGroups", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("instancegroup");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_group_005frelaxed_InstanceGroup_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_group_005frelaxed_InstanceGroup_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_art_005frelaxed_group_005frelaxed_InstanceGroup_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_group_005frelaxed_InstanceGroup_3(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	public void print_art_005frelaxed_group_005frelaxed_InstanceGroup_0(art_relaxed.group_relaxed.InstanceGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__NAME));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
	}
	public void print_art_005frelaxed_group_005frelaxed_InstanceGroup_1(art_relaxed.group_relaxed.InstanceGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pid");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__PID));
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TXTID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__PID), element));
			}
			printCountingMap.put("pid", count - 1);
		}
	}
	public void print_art_005frelaxed_group_005frelaxed_InstanceGroup_2(art_relaxed.group_relaxed.InstanceGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("instances");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("instances");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstanceGroupInstancesReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES)), element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES), element));
			}
			printCountingMap.put("instances", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_art_005frelaxed_group_005frelaxed_InstanceGroup_2_0(element, localtab, out1, printCountingMap1);
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
	public void print_art_005frelaxed_group_005frelaxed_InstanceGroup_2_0(art_relaxed.group_relaxed.InstanceGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("instances");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				smartadapters4ART.resource.smARText.ISmARTextTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstanceGroupInstancesReferenceResolver().deResolve((art_relaxed.instance_relaxed.ComponentInstance) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES)), element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__INSTANCES), element));
			}
			printCountingMap.put("instances", count - 1);
		}
	}
	public void print_art_005frelaxed_group_005frelaxed_InstanceGroup_3(art_relaxed.group_relaxed.InstanceGroup element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subGroups");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(art_relaxed.group_relaxed.Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS));
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
			printCountingMap.put("subGroups", count - 1);
		}
	}
	
}
