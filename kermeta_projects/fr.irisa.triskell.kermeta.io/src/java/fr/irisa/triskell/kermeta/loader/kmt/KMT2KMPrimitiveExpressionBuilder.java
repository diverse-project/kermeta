/* $Id: KMT2KMPrimitiveExpressionBuilder.java,v 1.25 2008-04-28 11:50:13 ftanguy Exp $
 * Project : Kermeta io
 * File : KMT2KMExpressionBuilder.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 6 f�vr. 2005
 * Authors : 
 * 		Franck Fleurey 	<ffleurey@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 * 		Francois Tanguy <ftanguy@irisa.fr>
 */

package fr.irisa.triskell.kermeta.loader.kmt;


import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.parser.gen.ast.ActualParameter;
import fr.irisa.triskell.kermeta.parser.gen.ast.Basictype;
import fr.irisa.triskell.kermeta.parser.gen.ast.FBlock;
import fr.irisa.triskell.kermeta.parser.gen.ast.FBooleanLiteral;
import fr.irisa.triskell.kermeta.parser.gen.ast.FConditional;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpressionLst;
import fr.irisa.triskell.kermeta.parser.gen.ast.FIntegerLiteral;
import fr.irisa.triskell.kermeta.parser.gen.ast.FJavaStaticCall;
import fr.irisa.triskell.kermeta.parser.gen.ast.FLambdaExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.FLambdaparam;
import fr.irisa.triskell.kermeta.parser.gen.ast.FLoop;
import fr.irisa.triskell.kermeta.parser.gen.ast.FRaiseException;
import fr.irisa.triskell.kermeta.parser.gen.ast.FRescue;
import fr.irisa.triskell.kermeta.parser.gen.ast.FSelfCall;
import fr.irisa.triskell.kermeta.parser.gen.ast.FStringLiteral;
import fr.irisa.triskell.kermeta.parser.gen.ast.FSuperCall;
import fr.irisa.triskell.kermeta.parser.gen.ast.FTypeOrVarLiteral;
import fr.irisa.triskell.kermeta.parser.gen.ast.FVariableDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.FVoidLiteral;
import fr.irisa.triskell.kermeta.parser.gen.ast.ParentExp;
import fr.irisa.triskell.kermeta.parser.gen.ast.PrimitiveExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.ResultCall;
import fr.irisa.triskell.kermeta.parser.gen.ast.ValueCall;

/**
 * @author Franck Fleurey
 * 
 * abstract primitiveExpression : fLiteral | parentExp | fSelfCall | fSuperCall |
 * 			fJavaStaticCall | fBlock | fConditional | fRaiseException | 
 * 			fVariableDecl | fLambdaExpression | fLoop ;
 * 			
 */
public class KMT2KMPrimitiveExpressionBuilder extends KMT2KMPass {

	public static Expression process(LoadingContext context, PrimitiveExpression node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMPrimitiveExpressionBuilder visitor = new KMT2KMPrimitiveExpressionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected Expression result;
	
	/**
	 * @param builder
	 */
	public KMT2KMPrimitiveExpressionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
	}

	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FBlock)
	 */
	public boolean beginVisit(FBlock fBlock) {
		fr.irisa.triskell.kermeta.language.behavior.Block block =  BehaviorFactory.eINSTANCE.createBlock();
		builder.storeTrace(block,fBlock);
		block.getStatement().addAll(KMT2KMExperessionListBuilder.process(context, fBlock.getFExpressionLst(), builder, monitor));
		result = block;
		fBlock.getFRescueLst().accept(this);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FRescue)
	 */
	public boolean beginVisit(FRescue fRescue) {
		fr.irisa.triskell.kermeta.language.behavior.Rescue resc = BehaviorFactory.eINSTANCE.createRescue();
		builder.storeTrace(resc,fRescue);
		context.pushContext();
		if (fRescue.getVarName() != null) {
			resc.setExceptionName(getTextForID(fRescue.getVarName()));
			resc.setExceptionType(KMT2KMTypeReferenceBuilder.process(context, fRescue.getExTypeRef(), builder, monitor));
			context.addSymbol(new KMSymbolRescueParameter(resc));
		}
		resc.getBody().addAll(KMT2KMExperessionListBuilder.process(context, fRescue.getRescstmts(), builder, monitor));
		((fr.irisa.triskell.kermeta.language.behavior.Block)result).getRescueBlock().add(resc);
		context.popContext();
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FConditional)
	 */
	public boolean beginVisit(FConditional fConditional) {
		Conditional cond = BehaviorFactory.eINSTANCE.createConditional();
		builder.storeTrace(cond,fConditional);
		cond.setCondition(KMT2KMExperessionBuilder.process(context, fConditional.getCondition(), builder, monitor));
		cond.setThenBody(createBlock(fConditional.getIfblock()));
		
		// Patch that avoids to create an empty else block if the conditional statement
		// does not contain an else part.
		// OLD: cond.setElseBody(createBlock(fConditional.getElseblock()));
		if(fConditional.getElseblock() != null)
			cond.setElseBody(createBlock(fConditional.getElseblock()));
		else
			cond.setElseBody(null);
		
		result = cond;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FJavaStaticCall)
	 */
	public boolean beginVisit(FJavaStaticCall fJavaStaticCall) {
		fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall call = BehaviorFactory.eINSTANCE.createJavaStaticCall();
		builder.storeTrace(call,fJavaStaticCall);
		call.setJmethod(getTextForID(fJavaStaticCall.getMname()));
		call.setJclass(qualifiedIDAsString(fJavaStaticCall.getCname()));
		result = call;
		return super.beginVisit(fJavaStaticCall);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ActualParameter)
	 */
	public boolean beginVisit(ActualParameter actualParameter) {
		Expression param = KMT2KMExperessionBuilder.process(context, actualParameter.getExpression(), builder, monitor);
		((fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall)result).getParameters().add(param);
		return false;
	}
	
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FLoop)
	 */
	public boolean beginVisit(FLoop fLoop) {
		fr.irisa.triskell.kermeta.language.behavior.Loop loop = BehaviorFactory.eINSTANCE.createLoop();
		builder.storeTrace(loop,fLoop);
		loop.setInitialization(KMT2KMExperessionBuilder.process(context, fLoop.getInit(), builder, monitor));
		loop.setStopCondition(KMT2KMExperessionBuilder.process(context, fLoop.getCondition(), builder, monitor));
		loop.setBody(createBlock(fLoop.getBody()));
		result = loop;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FRaiseException)
	 */
	public boolean beginVisit(FRaiseException fRaiseException) {
		Raise raise = BehaviorFactory.eINSTANCE.createRaise();
		builder.storeTrace(raise,fRaiseException);
		raise.setExpression(KMT2KMExperessionBuilder.process(context, fRaiseException.getFExpression(), builder, monitor));
		result = raise;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FSelfCall)
	 */
	public boolean beginVisit(FSelfCall fSelfCall) {
		SelfExpression self = BehaviorFactory.eINSTANCE.createSelfExpression();
		builder.storeTrace(self,fSelfCall);
		result = self;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FSuperCall)
	 */
	public boolean beginVisit(FSuperCall fSuperCall) {
		CallSuperOperation call = BehaviorFactory.eINSTANCE.createCallSuperOperation();
		builder.storeTrace(call,fSuperCall);
		call.setName("super");
		result = call;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FVariableDecl)
	 */
	public boolean beginVisit(FVariableDecl fVariableDecl) {
		fr.irisa.triskell.kermeta.language.behavior.VariableDecl var = BehaviorFactory.eINSTANCE.createVariableDecl();
		builder.storeTrace(var,fVariableDecl);
		var.setIdentifier(getTextForID(fVariableDecl.getName()));
		var.setType(KMT2KMTypeReferenceBuilder.process(context, fVariableDecl.getTypeRef(), builder, monitor));
		var.setInitialization(KMT2KMExperessionBuilder.process(context, fVariableDecl.getInit(), builder, monitor));
		context.addSymbol(new KMSymbolVariable(var));
		result = var;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ParentExp)
	 */
	public boolean beginVisit(ParentExp parentExp) {
		result = KMT2KMExperessionBuilder.process(context, parentExp.getFExpression(), builder, monitor);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FBooleanLiteral)
	 */
	public boolean beginVisit(FBooleanLiteral fBooleanLiteral) {
		fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral bool =  BehaviorFactory.eINSTANCE.createBooleanLiteral();
		builder.storeTrace(bool,fBooleanLiteral);
		bool.setValue(fBooleanLiteral.getTrueOrFalse().getText().equals("true"));
		result = bool;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FIntegerLiteral)
	 */
	public boolean beginVisit(FIntegerLiteral fIntegerLiteral) {
		fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral integer =  BehaviorFactory.eINSTANCE.createIntegerLiteral();
		builder.storeTrace(integer,fIntegerLiteral);
		integer.setValue(Integer.parseInt(fIntegerLiteral.getInt_literal().getText()));
		result = integer;
		return false;
	}
	/**
	 * also translates the \\ and \n etc into their characters
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FStringLiteral)
	 */
	public boolean beginVisit(FStringLiteral fStringLiteral) {
		fr.irisa.triskell.kermeta.language.behavior.StringLiteral str =  BehaviorFactory.eINSTANCE.createStringLiteral();
		builder.storeTrace(str,fStringLiteral);
		// removes the quotes
		String newValue = fStringLiteral.getString_literal().getText().substring(1, fStringLiteral.getString_literal().getText().length()-1);
		// do the \\ replacements

		// the double backslash must be done first but with a string id
		newValue = newValue.replaceAll("\\\\\\\\","123456789oazehnfvkjsdnviuzerheanckencernc�earncerinnceriuh8798432198794235"); 
		
		newValue = newValue.replaceAll("\\\\n","\n");
		newValue = newValue.replaceAll("\\\\t","\t");
		newValue = newValue.replaceAll("\\\\b","\b");
		newValue = newValue.replaceAll("\\\\r","\r");
		newValue = newValue.replaceAll("\\\\f","\f");
		newValue = newValue.replaceAll("\\\\\"","\"");
		//	finally replace the escape char by a slash, 
		newValue = newValue.replaceAll("123456789oazehnfvkjsdnviuzerheanckencernc�earncerinnceriuh8798432198794235","\\\\"); 
		str.setValue(newValue);
		result = str;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FVoidLiteral)
	 */
	public boolean beginVisit(FVoidLiteral fVoidLiteral) {
		fr.irisa.triskell.kermeta.language.behavior.VoidLiteral nil = BehaviorFactory.eINSTANCE.createVoidLiteral();
		builder.storeTrace(nil,fVoidLiteral);
		result = nil;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FTypeOrVarLiteral)
	 */
	public boolean beginVisit(FTypeOrVarLiteral fTypeOrVarLiteral) {
		// this can be a variable call, a feature call, or a type literal.
		if (fTypeOrVarLiteral.getLiteral() instanceof Basictype) {
			Basictype btype = (Basictype)fTypeOrVarLiteral.getLiteral();
			String name = qualifiedIDAsString(btype.getName());
			//String name = btype.getName();
			if (btype.getParams() == null && name.indexOf("::")<0) {
				// It can be a call or a type
				KMSymbol s = context.symbolLookup(name);
				if (s != null) {
					result = s.generateCallExpression(builder);
					if (result instanceof CallFeature){
						boolean b = fTypeOrVarLiteral.getAtp()!=null;
						((CallFeature)result).setIsAtpre(b);
					}
					if (result instanceof CallVariable){
						boolean b = fTypeOrVarLiteral.getAtp()!=null;
						((CallVariable)result).setIsAtpre(b);
					}	
					builder.storeTrace(result, fTypeOrVarLiteral.getLiteral());
					return false;
				}
				else {
					// it is either a type or a type variable. we check here if it exists to give an appropriate error if it does not...
					if ((builder.getTypeDefinitionByName(name, monitor) == null) && (context.typeVariableLookup(name) == null)) {
						//builder.messages.addMessage(new KMTUnitLoadError("Cannot resolve symbol : '"+name+"'.", btype));
						builder.error("Cannot resolve symbol : '"+name+"'.", fTypeOrVarLiteral);
						return false;
					}
				}
			}
		}
		// it is a type
		TypeLiteral tl = BehaviorFactory.eINSTANCE.createTypeLiteral();
		builder.storeTrace(tl,fTypeOrVarLiteral);
		TypeReference tref = BehaviorFactory.eINSTANCE.createTypeReference();
		//builder.storeTrace(tref,fTypeOrVarLiteral); //TODO : This object should be stored in the trace
		tref.setType(KMT2KMTypeBuilder.process(context, fTypeOrVarLiteral.getLiteral(), builder, monitor));
		tref.setLower(0);
		tref.setUpper(1);
		tl.setTyperef(tref);
		result = tl;
		return false;
	}
	
	fr.irisa.triskell.kermeta.language.behavior.LambdaExpression current_le;
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FLambdaExpression)
	 */
	public boolean beginVisit(FLambdaExpression fLambdaExpression) {
		current_le = BehaviorFactory.eINSTANCE.createLambdaExpression();
		builder.storeTrace(current_le,fLambdaExpression);
		context.pushContext();
		fLambdaExpression.getParams().accept(this);
		
		// Patch that avoids to create a Block element in case the body of the lambda expression
		// contains a single expression.
		//OLD: current_le.setBody(createBlock(fLambdaExpression.getExpression()));
		if(fLambdaExpression.getExpression().getChildCount() > 1) {
			current_le.setBody( createBlock(fLambdaExpression.getExpression()) );
		}
		else {
			FExpression fExp = (FExpression) fLambdaExpression.getExpression().getChild(0);
			fr.irisa.triskell.kermeta.language.behavior.Expression expr =  BehaviorFactory.eINSTANCE.createEmptyExpression();
			builder.storeTrace(expr, fExp);
			current_le.setBody( KMT2KMExperessionBuilder.process(context, fExp, builder, monitor) );
		}

		result = current_le;
		context.popContext();
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FLambdaparam)
	 */
	public boolean beginVisit(FLambdaparam fLambdaparam) {
		LambdaParameter lp = BehaviorFactory.eINSTANCE.createLambdaParameter();
		builder.storeTrace(lp,fLambdaparam);
		lp.setName(getTextForID(fLambdaparam.getName()));
		lp.setType(KMT2KMTypeReferenceBuilder.process(context, fLambdaparam.getTypeRef(), builder, monitor));
		context.addSymbol(new KMSymbolLambdaParameter(lp));
		current_le.getParameters().add(lp);
		return false;
	}
	protected fr.irisa.triskell.kermeta.language.behavior.Block createBlock(FExpressionLst explst) {
		fr.irisa.triskell.kermeta.language.behavior.Block block =  BehaviorFactory.eINSTANCE.createBlock();
		if (explst != null) {
			builder.storeTrace(block,explst);
			block.getStatement().addAll(KMT2KMExperessionListBuilder.process(context, explst, builder, monitor));
		}
		return block;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ResultCall)
	 */
	public boolean beginVisit(ResultCall resultCall) {
		CallResult lp = BehaviorFactory.eINSTANCE.createCallResult();
		builder.storeTrace(lp,resultCall);
		lp.setName("result");
		result = lp;
		return false;
	}
	
	public boolean beginVisit(ValueCall valueCall) {
		CallValue lp = BehaviorFactory.eINSTANCE.createCallValue();
		builder.storeTrace(lp,valueCall);
		lp.setName("value");
		result = lp;
		return false;
	}
	
}
