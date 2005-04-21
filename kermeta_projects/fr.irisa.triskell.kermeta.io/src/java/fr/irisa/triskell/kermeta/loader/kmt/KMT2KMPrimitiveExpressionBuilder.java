/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.ast.ActualParameter;
import fr.irisa.triskell.kermeta.ast.Basictype;
import fr.irisa.triskell.kermeta.ast.FBlock;
import fr.irisa.triskell.kermeta.ast.FBooleanLiteral;
import fr.irisa.triskell.kermeta.ast.FConditional;
import fr.irisa.triskell.kermeta.ast.FExpressionLst;
import fr.irisa.triskell.kermeta.ast.FIntegerLiteral;
import fr.irisa.triskell.kermeta.ast.FJavaStaticCall;
import fr.irisa.triskell.kermeta.ast.FLambdaExpression;
import fr.irisa.triskell.kermeta.ast.FLambdaparam;
import fr.irisa.triskell.kermeta.ast.FLoop;
import fr.irisa.triskell.kermeta.ast.FRaiseException;
import fr.irisa.triskell.kermeta.ast.FRescue;
import fr.irisa.triskell.kermeta.ast.FSelfCall;
import fr.irisa.triskell.kermeta.ast.FStringLiteral;
import fr.irisa.triskell.kermeta.ast.FSuperCall;
import fr.irisa.triskell.kermeta.ast.FTypeOrVarLiteral;
import fr.irisa.triskell.kermeta.ast.FVariableDecl;
import fr.irisa.triskell.kermeta.ast.FVoidLiteral;
import fr.irisa.triskell.kermeta.ast.ParentExp;
import fr.irisa.triskell.kermeta.ast.PrimitiveExpression;
import fr.irisa.triskell.kermeta.ast.ResultCall;
import fr.irisa.triskell.kermeta.behavior.FCallResult;
import fr.irisa.triskell.kermeta.behavior.FCallSuperOperation;
import fr.irisa.triskell.kermeta.behavior.FConditionnal;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.behavior.FRaise;
import fr.irisa.triskell.kermeta.behavior.FSelfExpression;
import fr.irisa.triskell.kermeta.behavior.FTypeLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeReference;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * abstract primitiveExpression : fLiteral | parentExp | fSelfCall | fSuperCall |
 * 			fJavaStaticCall | fBlock | fConditional | fRaiseException | 
 * 			fVariableDecl | fLambdaExpression | fLoop ;
 * 			
 */
public class KMT2KMPrimitiveExpressionBuilder extends KMT2KMPass {

	public static FExpression process(PrimitiveExpression node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMPrimitiveExpressionBuilder visitor = new KMT2KMPrimitiveExpressionBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected FExpression result;
	
	/**
	 * @param builder
	 */
	public KMT2KMPrimitiveExpressionBuilder(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FBlock)
	 */
	public boolean beginVisit(FBlock fBlock) {
		fr.irisa.triskell.kermeta.behavior.FBlock block =  builder.behav_factory.createFBlock();
		builder.storeTrace(block,fBlock);
		block.getFStatement().addAll(KMT2KMExperessionListBuilder.process(fBlock.getFExpressionLst(), builder));
		result = block;
		fBlock.getFRescueLst().accept(this);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FRescue)
	 */
	public boolean beginVisit(FRescue fRescue) {
		fr.irisa.triskell.kermeta.behavior.FRescue resc = builder.behav_factory.createFRescue();
		builder.storeTrace(resc,fRescue);
		builder.pushContext();
		if (fRescue.getVarName() != null) {
			resc.setFExceptionName(getTextForID(fRescue.getVarName()));
			resc.setFExceptionType(KMT2KMTypeReferenceBuilder.process(fRescue.getExTypeRef(), builder));
			builder.addSymbol(new KMSymbolRescueParameter(resc));
		}
		resc.getFBody().addAll(KMT2KMExperessionListBuilder.process(fRescue.getRescstmts(), builder));
		((fr.irisa.triskell.kermeta.behavior.FBlock)result).getFRescueBlock().add(resc);
		builder.popContext();
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FConditional)
	 */
	public boolean beginVisit(FConditional fConditional) {
		FConditionnal cond = builder.behav_factory.createFConditionnal();
		builder.storeTrace(cond,fConditional);
		cond.setFCondition(KMT2KMExperessionBuilder.process(fConditional.getCondition(), builder));
		cond.setFThenBody(createBlock(fConditional.getIfblock()));
		cond.setFElseBody(createBlock(fConditional.getElseblock()));
		result = cond;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FJavaStaticCall)
	 */
	public boolean beginVisit(FJavaStaticCall fJavaStaticCall) {
		fr.irisa.triskell.kermeta.behavior.FJavaStaticCall call = builder.behav_factory.createFJavaStaticCall();
		builder.storeTrace(call,fJavaStaticCall);
		call.setFJmethod(getTextForID(fJavaStaticCall.getMname()));
		call.setFJclass(qualifiedIDAsString(fJavaStaticCall.getCname()));
		result = call;
		return super.beginVisit(fJavaStaticCall);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ActualParameter)
	 */
	public boolean beginVisit(ActualParameter actualParameter) {
		FExpression param = KMT2KMExperessionBuilder.process(actualParameter.getExpression(), builder);
		((fr.irisa.triskell.kermeta.behavior.FJavaStaticCall)result).getFParameters().add(param);
		return false;
	}
	
	
	
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FLoop)
	 */
	public boolean beginVisit(FLoop fLoop) {
		fr.irisa.triskell.kermeta.behavior.FLoop loop = builder.behav_factory.createFLoop();
		builder.storeTrace(loop,fLoop);
		loop.setFInitiatization(KMT2KMExperessionBuilder.process(fLoop.getInit(), builder));
		loop.setFStopCondition(KMT2KMExperessionBuilder.process(fLoop.getCondition(), builder));
		loop.setFBody(createBlock(fLoop.getBody()));
		result = loop;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FRaiseException)
	 */
	public boolean beginVisit(FRaiseException fRaiseException) {
		FRaise raise = builder.behav_factory.createFRaise();
		builder.storeTrace(raise,fRaiseException);
		raise.setFExpression(KMT2KMExperessionBuilder.process(fRaiseException.getFExpression(), builder));
		result = raise;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FSelfCall)
	 */
	public boolean beginVisit(FSelfCall fSelfCall) {
		FSelfExpression self = builder.behav_factory.createFSelfExpression();
		builder.storeTrace(self,fSelfCall);
		result = self;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FSuperCall)
	 */
	public boolean beginVisit(FSuperCall fSuperCall) {
		FCallSuperOperation call = builder.behav_factory.createFCallSuperOperation();
		builder.storeTrace(call,fSuperCall);
		call.setFName("super");
		result = call;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FVariableDecl)
	 */
	public boolean beginVisit(FVariableDecl fVariableDecl) {
		fr.irisa.triskell.kermeta.behavior.FVariableDecl var = builder.behav_factory.createFVariableDecl();
		builder.storeTrace(var,fVariableDecl);
		var.setFIdentifier(getTextForID(fVariableDecl.getName()));
		var.setFType(KMT2KMTypeReferenceBuilder.process(fVariableDecl.getTypeRef(), builder));
		var.setFInitialization(KMT2KMExperessionBuilder.process(fVariableDecl.getInit(), builder));
		builder.addSymbol(new KMSymbolVariable(var));
		result = var;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ParentExp)
	 */
	public boolean beginVisit(ParentExp parentExp) {
		result = KMT2KMExperessionBuilder.process(parentExp.getFExpression(), builder);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FBooleanLiteral)
	 */
	public boolean beginVisit(FBooleanLiteral fBooleanLiteral) {
		fr.irisa.triskell.kermeta.behavior.FBooleanLiteral bool =  builder.behav_factory.createFBooleanLiteral();
		builder.storeTrace(bool,fBooleanLiteral);
		bool.setFValue(fBooleanLiteral.getTrueOrFalse().getText().equals("true"));
		result = bool;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FIntegerLiteral)
	 */
	public boolean beginVisit(FIntegerLiteral fIntegerLiteral) {
		fr.irisa.triskell.kermeta.behavior.FIntegerLiteral integer =  builder.behav_factory.createFIntegerLiteral();
		builder.storeTrace(integer,fIntegerLiteral);
		integer.setFValue(Integer.parseInt(fIntegerLiteral.getInt_literal().getText()));
		result = integer;
		return false;
	}
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FStringLiteral)
	 */
	public boolean beginVisit(FStringLiteral fStringLiteral) {
		fr.irisa.triskell.kermeta.behavior.FStringLiteral str =  builder.behav_factory.createFStringLiteral();
		builder.storeTrace(str,fStringLiteral);
		str.setFValue(fStringLiteral.getString_literal().getText().substring(1, fStringLiteral.getString_literal().getText().length()-1));
		result = str;
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FVoidLiteral)
	 */
	public boolean beginVisit(FVoidLiteral fVoidLiteral) {
		fr.irisa.triskell.kermeta.behavior.FVoidLiteral nil = builder.behav_factory.createFVoidLiteral();
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
			if (btype.getParams() == null && name.indexOf("::")<0) {
				// It can be a call or a type
				KMSymbol s = builder.symbolLookup(name);
				if (s != null) {
					result = s.generateCallExpression(builder);
					builder.storeTrace(result, fTypeOrVarLiteral.getLiteral());
					return false;
				}
				else {
					// it is a type. we check here if it exists to give an appropriate error if it does not...
					if (builder.getTypeDefinitionByName(name) == null) {
						builder.error.add(new KMUnitError("Cannot resolve symbol : '"+name+"'.", btype));
						return false;
					}
				}
			}
		}
		// it is a type
		FTypeLiteral tl = builder.behav_factory.createFTypeLiteral();
		builder.storeTrace(tl,fTypeOrVarLiteral);
		FTypeReference tref = builder.behav_factory.createFTypeReference();
		//builder.storeTrace(tref,fTypeOrVarLiteral); //TODO : This object should be stored in the trace
		tref.setFType(KMT2KMTypeBuilder.process(fTypeOrVarLiteral.getLiteral(), builder));
		tref.setFLower(0);
		tref.setFUpper(1);
		tl.setFTyperef(tref);
		result = tl;
		return false;
	}
	
	fr.irisa.triskell.kermeta.behavior.FLambdaExpression current_le;
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FLambdaExpression)
	 */
	public boolean beginVisit(FLambdaExpression fLambdaExpression) {
		current_le = builder.behav_factory.createFLambdaExpression();
		builder.storeTrace(current_le,fLambdaExpression);
		builder.pushContext();
		fLambdaExpression.getParams().accept(this);
		current_le.setFBody(KMT2KMExperessionBuilder.process(fLambdaExpression.getExpression(), builder));
		result = current_le;
		builder.popContext();
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FLambdaparam)
	 */
	public boolean beginVisit(FLambdaparam fLambdaparam) {
		FLambdaParameter lp = builder.behav_factory.createFLambdaParameter();
		builder.storeTrace(lp,fLambdaparam);
		lp.setFName(getTextForID(fLambdaparam.getName()));
		lp.setFType(KMT2KMTypeReferenceBuilder.process(fLambdaparam.getTypeRef(), builder));
		builder.addSymbol(new KMSymbolLambdaParameter(lp));
		current_le.getFParameters().add(lp);
		return false;
	}
	protected fr.irisa.triskell.kermeta.behavior.FBlock createBlock(FExpressionLst explst) {
		fr.irisa.triskell.kermeta.behavior.FBlock block =  builder.behav_factory.createFBlock();
		if (explst != null) {
			builder.storeTrace(block,explst);
			block.getFStatement().addAll(KMT2KMExperessionListBuilder.process(explst, builder));
		}
		return block;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ResultCall)
	 */
	public boolean beginVisit(ResultCall resultCall) {
		FCallResult lp = builder.behav_factory.createFCallResult();
		builder.storeTrace(lp,resultCall);
		lp.setFName("result");
		result = lp;
		return false;
	}
}
