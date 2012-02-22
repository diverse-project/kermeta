/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KpPrinter implements org.kermeta.kp.editor.IKpTextPrinter {
	
	protected org.kermeta.kp.editor.IKpTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KpTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.kermeta.kp.editor.IKpTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public KpPrinter(java.io.OutputStream outputStream, org.kermeta.kp.editor.IKpTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
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
		
		if (element instanceof org.kermeta.kp.KermetaProject) {
			print_org_kermeta_kp_KermetaProject((org.kermeta.kp.KermetaProject) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.Source) {
			print_org_kermeta_kp_Source((org.kermeta.kp.Source) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.PackageEquivalence) {
			print_org_kermeta_kp_PackageEquivalence((org.kermeta.kp.PackageEquivalence) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.Dependency) {
			print_org_kermeta_kp_Dependency((org.kermeta.kp.Dependency) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.WeaveDirective) {
			print_org_kermeta_kp_WeaveDirective((org.kermeta.kp.WeaveDirective) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.Option) {
			print_org_kermeta_kp_Option((org.kermeta.kp.Option) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.StringExpression) {
			print_org_kermeta_kp_StringExpression((org.kermeta.kp.StringExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.MixExpression) {
			print_org_kermeta_kp_MixExpression((org.kermeta.kp.MixExpression) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kp.editor.mopp.KpReferenceResolverSwitch) new org.kermeta.kp.editor.mopp.KpMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.kermeta.kp.editor.IKpTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.kermeta.kp.editor.mopp.KpProblem(errorMessage, org.kermeta.kp.editor.KpEProblemType.PRINT_PROBLEM, org.kermeta.kp.editor.KpEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.kermeta.kp.editor.IKpTextResource getResource() {
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
	
	public void print_org_kermeta_kp_KermetaProject(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES));
		printCountingMap.put("dependencies", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES));
		printCountingMap.put("sources", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES));
		printCountingMap.put("weaveDirectives", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS));
		printCountingMap.put("defaultMainClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION));
		printCountingMap.put("defaultMainOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP));
		printCountingMap.put("group", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__PACKAGE_EQUIVALENCES));
		printCountingMap.put("packageEquivalences", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("KermetaProject");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_kermeta_kp_KermetaProject_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_KermetaProject_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"group"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"defaultMainClass"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"defaultMainOperation"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_4(element, localtab, out, printCountingMap);
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_5(element, localtab, out, printCountingMap);
			}
			break;
			case 6:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_6(element, localtab, out, printCountingMap);
			}
			break;
			case 7:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_0_0_7(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_kermeta_kp_KermetaProject_0_0_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("groupId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("group");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), element));
				out.print(" ");
			}
			printCountingMap.put("group", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_1(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("defaultMainClass");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("defaultMainClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("defaultMainClass", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_2(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("defaultMainOperation");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("defaultMainOperation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), element));
				out.print(" ");
			}
			printCountingMap.put("defaultMainOperation", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_3(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("dependencies");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_0_0_3_0(element, localtab, out1, printCountingMap1);
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
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_3_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dependencies");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEPENDENCIES));
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
			printCountingMap.put("dependencies", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_4(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("packageEquivalences");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_0_0_4_0(element, localtab, out1, printCountingMap1);
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
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_4_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("packageEquivalences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__PACKAGE_EQUIVALENCES));
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
			printCountingMap.put("packageEquivalences", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_5(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("sources");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_0_0_5_0(element, localtab, out1, printCountingMap1);
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
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_5_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sources");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__SOURCES));
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
			printCountingMap.put("sources", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_6(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("options");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_0_0_6_0(element, localtab, out1, printCountingMap1);
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
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_6_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__OPTIONS));
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
			printCountingMap.put("options", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_7(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("weaveDirectives");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_0_0_7_0(element, localtab, out1, printCountingMap1);
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
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_KermetaProject_0_0_7_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("weaveDirectives");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__WEAVE_DIRECTIVES));
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
			printCountingMap.put("weaveDirectives", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_Source(org.kermeta.kp.Source element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY));
		printCountingMap.put("byteCodeFromADependency", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_Source_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("byteCodeFromADependency");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY));
			if (o != null) {
			}
			printCountingMap.put("byteCodeFromADependency", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Source_0(org.kermeta.kp.Source element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("source");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("require");
			out.print(" ");
		}
	}
	
	
	public void print_org_kermeta_kp_PackageEquivalence(org.kermeta.kp.PackageEquivalence element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE));
		printCountingMap.put("ecorePackage", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE));
		printCountingMap.put("javaPackage", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("packageEquivalence");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("ecorePackage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE), element));
				out.print(" ");
			}
			printCountingMap.put("ecorePackage", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_PackageEquivalence_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("javaPackage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE), element));
				out.print(" ");
			}
			printCountingMap.put("javaPackage", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_PackageEquivalence_0(org.kermeta.kp.PackageEquivalence element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
	}
	
	
	public void print_org_kermeta_kp_Dependency(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL));
		printCountingMap.put("url", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE));
		printCountingMap.put("ignoreByteCode", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY));
		printCountingMap.put("sourceOnly", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GENMODEL));
		printCountingMap.put("genmodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY));
		printCountingMap.put("byteCodeOnly", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("dependency");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_Dependency_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_Dependency_1(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_Dependency_2(element, localtab, out1, printCountingMap1);
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
		print_org_kermeta_kp_Dependency_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_kermeta_kp_Dependency_0(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_Dependency_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_kermeta_kp_Dependency_0_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_kermeta_kp_Dependency_0_0(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_Dependency_0_1(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("URLs");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
	}
	
	public void print_org_kermeta_kp_Dependency_1(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Dependency_2(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("genmodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("genmodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GENMODEL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GENMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("genmodel", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Dependency_3(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ignoreByteCode"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"sourceOnly"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"byteCodeOnly"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (BooleanTerminal)
				count = printCountingMap.get("sourceOnly");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__SOURCE_ONLY));
					if (o != null) {
					}
					printCountingMap.put("sourceOnly", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (BooleanTerminal)
				count = printCountingMap.get("byteCodeOnly");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__BYTE_CODE_ONLY));
					if (o != null) {
					}
					printCountingMap.put("byteCodeOnly", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (BooleanTerminal)
			count = printCountingMap.get("ignoreByteCode");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__IGNORE_BYTE_CODE));
				if (o != null) {
				}
				printCountingMap.put("ignoreByteCode", count - 1);
			}
		}
	}
	
	
	public void print_org_kermeta_kp_WeaveDirective(org.kermeta.kp.WeaveDirective element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX));
		printCountingMap.put("mix", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("weaver-directive");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("mix");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__MIX));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("mix", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_Option(org.kermeta.kp.Option element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("option");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_Option_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Option_0(org.kermeta.kp.Option element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("value");
		out.print(" ");
	}
	
	
	public void print_org_kermeta_kp_StringExpression(org.kermeta.kp.StringExpression element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.STRING_EXPRESSION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_MixExpression(org.kermeta.kp.MixExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.MIX_EXPRESSION__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
}
