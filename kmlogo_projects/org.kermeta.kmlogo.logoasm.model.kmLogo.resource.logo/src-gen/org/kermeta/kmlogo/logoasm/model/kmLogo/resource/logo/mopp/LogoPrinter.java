/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoPrinter implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolverFactory tokenResolverFactory = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource;
	private java.util.Map<?, ?> options;
	
	public LogoPrinter(java.io.OutputStream outputStream, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
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
		
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_LogoProgram((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower) element, globaltab, out);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure) {
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch) new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoProblem(errorMessage, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_LogoProgram(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOGO_PROGRAM__INSTRUCTIONS));
		printCountingMap.put("instructions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_LogoProgram_0(element, localtab, out1, printCountingMap1);
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
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_LogoProgram_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("instructions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOGO_PROGRAM__INSTRUCTIONS));
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
			printCountingMap.put("instructions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BACK__STEPS));
		printCountingMap.put("steps", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BACK__STEPS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("steps", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("BACK");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("bk");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("BK");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("back");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Back");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.FORWARD__STEPS));
		printCountingMap.put("steps", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.FORWARD__STEPS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("steps", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("fd");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("FORWARD");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("FD");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("forward");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Forward");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LEFT__ANGLE));
		printCountingMap.put("angle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("angle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LEFT__ANGLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("angle", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("lt");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("LEFT");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("LT");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("left");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Left");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.RIGHT__ANGLE));
		printCountingMap.put("angle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("angle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.RIGHT__ANGLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("angle", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("rt");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("RIGHT");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("RT");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("right");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Right");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(0);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("PENDOWN");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("PD");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("pd");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("penDown");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("PenDown");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(0);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("PENUP");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("pu");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("PU");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("penUp");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("PenUp");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(0);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("CLEAR");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("cs");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("CLEARSCREEN");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("clearScreen");
				out.print(" ");
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ClearScreen");
				out.print(" ");
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("CS");
				out.print(" ");
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("clear");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Clear");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONSTANT__INTEGER_VALUE));
		printCountingMap.put("integerValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("integerValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONSTANT__INTEGER_VALUE));
			if (o != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONSTANT__INTEGER_VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("integerValue", count - 1);
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__ACTUAL_ARGS));
		printCountingMap.put("actualArgs", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION));
		printCountingMap.put("declaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("declaration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION));
			if (o != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProcCallDeclarationReferenceResolver().deResolve((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION)), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__DECLARATION), element));
				out.print(" ");
			}
			printCountingMap.put("declaration", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("$");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("actualArgs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__ACTUAL_ARGS));
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
			printCountingMap.put("actualArgs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall_1_0(element, localtab, out1, printCountingMap1);
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
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall_1_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("actualArgs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_CALL__ACTUAL_ARGS));
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
			printCountingMap.put("actualArgs", count - 1);
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__ARGS));
		printCountingMap.put("args", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__BLOCK));
		printCountingMap.put("block", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__PROC_CALL));
		printCountingMap.put("procCall", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__NAME));
			if (o != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration_1(element, localtab, out1, printCountingMap1);
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("block");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__BLOCK));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("block", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration_2(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("TO");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("To");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("to");
			out.print(" ");
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("args");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PROC_DECLARATION__ARGS));
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
			printCountingMap.put("args", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration_2(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("END");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("End");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("end");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
		printCountingMap.put("instructions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				boolean iterate = true;
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_1(element, localtab, out, printCountingMap);
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				iterate = true;
				while (iterate) {
					sWriter = new java.io.StringWriter();
					out1 = new java.io.PrintWriter(sWriter);
					printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
					print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_2(element, localtab, out1, printCountingMap1);
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
			}
			break;
			default:			java.io.StringWriter sWriter = null;
			java.io.PrintWriter out1 = null;
			java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
			//////////////DEFINITION PART BEGINS (CsString):
			out.print("[");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_0(element, localtab, out1, printCountingMap1);
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
			out.print("]");
			out.print(" ");
			//////////////DEFINITION PART BEGINS (LineBreak):
			out.println();
			out.print(localtab);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("instructions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
			printCountingMap.put("instructions", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 9;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 10;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 8:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 9:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 10:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("instructions");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
				printCountingMap.put("instructions", count - 1);
			}
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_2(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_2_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block_2_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 9;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"instructions"		));
		if (tempMatchCount > matches) {
			alt = 10;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 6:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 7:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 8:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 9:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			case 10:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("instructions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
					printCountingMap.put("instructions", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (LineBreak):
			localtab += "	";
			out.println();
			out.print(localtab);
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("instructions");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.BLOCK__INSTRUCTIONS));
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
				printCountingMap.put("instructions", count - 1);
			}
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__THEN_PART));
		printCountingMap.put("thenPart", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__ELSE_PART));
		printCountingMap.put("elsePart", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"condition"		,
		"thenPart"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"condition"		,
		"thenPart"		,
		"elsePart"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_1(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("thenPart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__THEN_PART));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenPart", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("IF");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("if");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("If");
			out.print(" ");
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("THEN");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("Then");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("then");
			out.print(" ");
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_2(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_2_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("elsePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__ELSE_PART));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elsePart", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_0_2_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("else");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ELSE");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Else");
			out.print(" ");
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_1_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("thenPart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__THEN_PART));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenPart", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("elsePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.IF__ELSE_PART));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elsePart", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If_1_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("IFELSE");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ifelse");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Ifelse");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONTROL_STRUCTURE__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.CONTROL_STRUCTURE__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.REPEAT__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.REPEAT__BLOCK));
		printCountingMap.put("block", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.REPEAT__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("block");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.REPEAT__BLOCK));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("block", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("REPEAT");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("repeat");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Repeat");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.WHILE__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.WHILE__BLOCK));
		printCountingMap.put("block", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.WHILE__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("block");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.WHILE__BLOCK));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("block", count - 1);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("WHILE");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("while");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("While");
			out.print(" ");
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER__NAME));
			if (o != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER));
		printCountingMap.put("parameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (PlaceholderUsingDefaultToken):
		count = printCountingMap.get("parameter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER));
			if (o != null) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterCallParameterReferenceResolver().deResolve((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER)), element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PARAMETER_CALL__PARAMETER), element));
				out.print(" ");
			}
			printCountingMap.put("parameter", count - 1);
		}
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("+");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("+");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.PLUS__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("-");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("-");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MINUS__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("*");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("*");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.MULT__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("/");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("/");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.DIV__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.EQUALS__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(">");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(">");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.GREATER__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__LHS));
		printCountingMap.put("lhs", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__RHS));
		printCountingMap.put("rhs", temp == null ? 0 : 1);
		// print collected hidden tokens
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower_0(element, localtab, out, printCountingMap);
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"lhs"		,
		"rhs"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CompoundDefinition):
				print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CompoundDefinition):
			print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower_0_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower_0_0(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("<");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower_0_1(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("<");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("lhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__LHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(",");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("rhs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage.LOWER__RHS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rhs", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
}
