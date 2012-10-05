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
		if (element instanceof org.kermeta.kp.PackageEquivalence) {
			print_org_kermeta_kp_PackageEquivalence((org.kermeta.kp.PackageEquivalence) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.Metamodel) {
			print_org_kermeta_kp_Metamodel((org.kermeta.kp.Metamodel) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.ImportFile) {
			print_org_kermeta_kp_ImportFile((org.kermeta.kp.ImportFile) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.ImportProjectJar) {
			print_org_kermeta_kp_ImportProjectJar((org.kermeta.kp.ImportProjectJar) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.ImportProjectSources) {
			print_org_kermeta_kp_ImportProjectSources((org.kermeta.kp.ImportProjectSources) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.ImportBytecodeJar) {
			print_org_kermeta_kp_ImportBytecodeJar((org.kermeta.kp.ImportBytecodeJar) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.ReusableResource) {
			print_org_kermeta_kp_ReusableResource((org.kermeta.kp.ReusableResource) element, globaltab, out);
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
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__ECLIPSE_NAME));
		printCountingMap.put("eclipseName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS));
		printCountingMap.put("defaultMainClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION));
		printCountingMap.put("defaultMainOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE));
		printCountingMap.put("javaBasePackage", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES));
		printCountingMap.put("reusableResources", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS));
		printCountingMap.put("importedProjectJars", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS));
		printCountingMap.put("importedBytecodeJars", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES));
		printCountingMap.put("importedProjectSources", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
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
		count = printCountingMap.get("eclipseName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__ECLIPSE_NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__ECLIPSE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("eclipseName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_KermetaProject_0(element, localtab, out1, printCountingMap1);
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
		print_org_kermeta_kp_KermetaProject_1(element, localtab, out1, printCountingMap1);
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
		print_org_kermeta_kp_KermetaProject_2(element, localtab, out1, printCountingMap1);
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
			print_org_kermeta_kp_KermetaProject_3(element, localtab, out1, printCountingMap1);
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
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("defaultMainClass");
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
	
	public void print_org_kermeta_kp_KermetaProject_1(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("defaultMainOperation");
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
	
	public void print_org_kermeta_kp_KermetaProject_2(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("javaBasePackage");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("javaBasePackage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), element));
				out.print(" ");
			}
			printCountingMap.put("javaBasePackage", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_3(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"metamodels"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"importedProjectJars"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"importedProjectSources"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"importedBytecodeJars"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"reusableResources"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_3_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_3_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_kermeta_kp_KermetaProject_3_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("reusableResources");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES));
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
					printCountingMap.put("reusableResources", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_kermeta_kp_KermetaProject_3_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_3_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metamodels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODELS));
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
			printCountingMap.put("metamodels", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_3_1(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("importedProjectJars");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS));
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
			printCountingMap.put("importedProjectJars", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_3_2(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("importedProjectSources");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES));
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
			printCountingMap.put("importedProjectSources", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_KermetaProject_3_3(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("importedBytecodeJars");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS));
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
			printCountingMap.put("importedBytecodeJars", count - 1);
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
		localtab += "			";
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
	
	
	public void print_org_kermeta_kp_Metamodel(org.kermeta.kp.Metamodel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS));
		printCountingMap.put("extends", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__IMPORTED_FILES));
		printCountingMap.put("importedFiles", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__METAMODEL_NAME));
		printCountingMap.put("metamodelName", temp == null ? 0 : 1);
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
		count = printCountingMap.get("metamodelName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__METAMODEL_NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__METAMODEL_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("metamodelName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_Metamodel_0(element, localtab, out1, printCountingMap1);
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
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_Metamodel_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_kermeta_kp_Metamodel_0(org.kermeta.kp.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("extends");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_Metamodel_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_kermeta_kp_Metamodel_0_0(org.kermeta.kp.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("extends");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMetamodelExtendsReferenceResolver().deResolve((org.kermeta.kp.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS)), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS), element));
				out.print(" ");
			}
			printCountingMap.put("extends", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_Metamodel_0_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_kermeta_kp_Metamodel_0_0_0(org.kermeta.kp.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("extends");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMetamodelExtendsReferenceResolver().deResolve((org.kermeta.kp.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS)), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__EXTENDS), element));
				out.print(" ");
			}
			printCountingMap.put("extends", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Metamodel_1(org.kermeta.kp.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("importedFiles");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.METAMODEL__IMPORTED_FILES));
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
			printCountingMap.put("importedFiles", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_ImportFile(org.kermeta.kp.ImportFile element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM));
		printCountingMap.put("bytecodeFrom", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES));
		printCountingMap.put("packageEquivalences", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
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
		out.print("importFile");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_ImportFile_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_kermeta_kp_ImportFile_0(org.kermeta.kp.ImportFile element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("withBytecodeFrom");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("bytecodeFrom");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportFileBytecodeFromReferenceResolver().deResolve((org.kermeta.kp.ReusableResource) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM)), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), element));
				out.print(" ");
			}
			printCountingMap.put("bytecodeFrom", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_ImportFile_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_kermeta_kp_ImportFile_0_0(org.kermeta.kp.ImportFile element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("packageEquivalences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES));
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
	
	
	public void print_org_kermeta_kp_ImportProjectJar(org.kermeta.kp.ImportProjectJar element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("importProjectJar");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_ImportProjectSources(org.kermeta.kp.ImportProjectSources element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("importProjectSource");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_ImportBytecodeJar(org.kermeta.kp.ImportBytecodeJar element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("importBytecodeJar");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	
	public void print_org_kermeta_kp_ReusableResource(org.kermeta.kp.ReusableResource element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS));
		printCountingMap.put("alternateUrls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME));
		printCountingMap.put("reusableResourceName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("reusableResourceName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("reusableResourceName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_ReusableResource_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_kermeta_kp_ReusableResource_0(org.kermeta.kp.ReusableResource element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
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
		out.print("alternative");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("alternateUrls");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS));
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
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), element));
				out.print(" ");
			}
			printCountingMap.put("alternateUrls", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_ReusableResource_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_org_kermeta_kp_ReusableResource_0_0(org.kermeta.kp.ReusableResource element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("alternateUrls");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS));
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
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), element));
				out.print(" ");
			}
			printCountingMap.put("alternateUrls", count - 1);
		}
	}
	
	
}
