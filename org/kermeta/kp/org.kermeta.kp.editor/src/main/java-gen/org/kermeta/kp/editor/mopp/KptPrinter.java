/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

public class KptPrinter implements org.kermeta.kp.editor.IKptTextPrinter {
	
	protected org.kermeta.kp.editor.IKptTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KptTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/**
	 * Holds the resource that is associated with this printer. may be null if the
	 * printer is used stand alone.
	 */
	private org.kermeta.kp.editor.IKptTextResource resource;
	private java.util.Map<?, ?> options;
	
	public KptPrinter(java.io.OutputStream outputStream, org.kermeta.kp.editor.IKptTextResource resource) {
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
		
		if (element instanceof org.kermeta.kp.KermetaProject) {
			print_org_kermeta_kp_KermetaProject((org.kermeta.kp.KermetaProject) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.SourceFolder) {
			print_org_kermeta_kp_SourceFolder((org.kermeta.kp.SourceFolder) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.SourceFile) {
			print_org_kermeta_kp_SourceFile((org.kermeta.kp.SourceFile) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.SourceNSURI) {
			print_org_kermeta_kp_SourceNSURI((org.kermeta.kp.SourceNSURI) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.SourceQuery) {
			print_org_kermeta_kp_SourceQuery((org.kermeta.kp.SourceQuery) element, globaltab, out);
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
		if (element instanceof org.kermeta.kp.KermetaProjectRef) {
			print_org_kermeta_kp_KermetaProjectRef((org.kermeta.kp.KermetaProjectRef) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kp.Source) {
			print_org_kermeta_kp_Source((org.kermeta.kp.Source) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kp.editor.mopp.KptReferenceResolverSwitch) new org.kermeta.kp.editor.mopp.KptMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.kermeta.kp.editor.IKptTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.kermeta.kp.editor.mopp.KptProblem(errorMessage, org.kermeta.kp.editor.KptEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.kermeta.kp.editor.IKptTextResource getResource() {
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
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
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
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION));
		printCountingMap.put("version", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP));
		printCountingMap.put("group", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF));
		printCountingMap.put("ref", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("KermetaProject");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kermeta_kp_KermetaProject_2(element, localtab, out1, printCountingMap1);
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
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("ref");
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	public void print_org_kermeta_kp_KermetaProject_0(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("version");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(": ");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("version");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__VERSION), element));
				out.print(" ");
			}
			printCountingMap.put("version", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_kp_KermetaProject_1(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("group");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("group");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__GROUP), element));
				out.print(" ");
			}
			printCountingMap.put("group", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_kp_KermetaProject_2(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"sources"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"dependencies"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"options"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"weaveDirectives"		));
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
				// DEFINITION PART BEGINS (LineBreak)
				out.println();
				out.print(localtab);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
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
				// DEFINITION PART BEGINS (LineBreak)
				out.println();
				out.print(localtab);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "	";
				out.println();
				out.print(localtab);
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
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "	";
			out.println();
			out.print(localtab);
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
			// DEFINITION PART BEGINS (LineBreak)
			out.println();
			out.print(localtab);
		}
	}
	public void print_org_kermeta_kp_KermetaProject_3(org.kermeta.kp.KermetaProject element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__REF));
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
			printCountingMap.put("ref", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Source(org.kermeta.kp.Source element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_SourceFolder(org.kermeta.kp.SourceFolder element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME));
		printCountingMap.put("folderName", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("srcDir");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_SourceFolder_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kp_SourceFolder_0(org.kermeta.kp.SourceFolder element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"folderName"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"url"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("url");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL));
					if (o != null) {
						org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__URL), element));
						out.print(" ");
					}
					printCountingMap.put("url", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("folderName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME));
				if (o != null) {
					org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FOLDER__FOLDER_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("folderName", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_kp_SourceFile(org.kermeta.kp.SourceFile element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("srcFile");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_kermeta_kp_SourceFile_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kp_SourceFile_0(org.kermeta.kp.SourceFile element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"fileName"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"url"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("url");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL));
					if (o != null) {
						org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__URL), element));
						out.print(" ");
					}
					printCountingMap.put("url", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("fileName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME));
				if (o != null) {
					org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_FILE__FILE_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("fileName", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_kp_SourceNSURI(org.kermeta.kp.SourceNSURI element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM));
		printCountingMap.put("from", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("srcNSURI");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_SourceNSURI_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_kp_SourceNSURI_0(org.kermeta.kp.SourceNSURI element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("from");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("from");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver().deResolve((org.kermeta.kp.Dependency) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM)), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_NSURI__FROM), element));
				out.print(" ");
			}
			printCountingMap.put("from", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_SourceQuery(org.kermeta.kp.SourceQuery element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM));
		printCountingMap.put("from", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY));
		printCountingMap.put("query", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("srcQuery");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("query");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__QUERY), element));
				out.print(" ");
			}
			printCountingMap.put("query", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_SourceQuery_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_kp_SourceQuery_0(org.kermeta.kp.SourceQuery element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("from");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("from");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportedSourceFromReferenceResolver().deResolve((org.kermeta.kp.Dependency) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM)), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__FROM), element));
				out.print(" ");
			}
			printCountingMap.put("from", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_SourceQuery_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_kp_SourceQuery_0_0(org.kermeta.kp.SourceQuery element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("URL");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.SOURCE_QUERY__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	
	public void print_org_kermeta_kp_Dependency(org.kermeta.kp.Dependency element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP));
		printCountingMap.put("group", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION));
		printCountingMap.put("version", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF));
		printCountingMap.put("depRef", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		,
		"url"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		,
		"depRef"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("dependency");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME));
					if (o != null) {
						org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("=");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("depRef");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF));
					if (o != null) {
						org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDependencyDepRefReferenceResolver().deResolve((org.kermeta.kp.KermetaProjectRef) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF)), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__DEP_REF), element));
						out.print(" ");
					}
					printCountingMap.put("depRef", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("group");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP));
					if (o != null) {
						org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__GROUP), element));
						out.print(" ");
					}
					printCountingMap.put("group", count - 1);
				}
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("version");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION));
					if (o != null) {
						org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__VERSION), element));
						out.print(" ");
					}
					printCountingMap.put("version", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("dependency");
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME));
				if (o != null) {
					org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print("URL");
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("=");
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("url");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL));
				if (o != null) {
					org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.DEPENDENCY__URL), element));
					out.print(" ");
				}
				printCountingMap.put("url", count - 1);
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
		// DEFINITION PART BEGINS (CsString)
		out.print("weaver-directive");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.WEAVE_DIRECTIVE__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
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
		// DEFINITION PART BEGINS (CsString)
		out.print("merger-option");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.OPTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
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
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
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
	
	public void print_org_kermeta_kp_KermetaProjectRef(org.kermeta.kp.KermetaProjectRef element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP));
		printCountingMap.put("group", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION));
		printCountingMap.put("version", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL));
		printCountingMap.put("url", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("group");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__GROUP), element));
				out.print(" ");
			}
			printCountingMap.put("group", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_kermeta_kp_KermetaProjectRef_0(element, localtab, out1, printCountingMap1);
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
		print_org_kermeta_kp_KermetaProjectRef_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_kp_KermetaProjectRef_0(org.kermeta.kp.KermetaProjectRef element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("URL");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("url");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__URL), element));
				out.print(" ");
			}
			printCountingMap.put("url", count - 1);
		}
	}
	public void print_org_kermeta_kp_KermetaProjectRef_1(org.kermeta.kp.KermetaProjectRef element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("version");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION));
			if (o != null) {
				org.kermeta.kp.editor.IKptTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT_REF__VERSION), element));
				out.print(" ");
			}
			printCountingMap.put("version", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
}
