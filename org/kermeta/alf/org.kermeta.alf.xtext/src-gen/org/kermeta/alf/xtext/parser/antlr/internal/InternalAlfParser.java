package org.kermeta.alf.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kermeta.alf.xtext.services.AlfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGERVALUE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'{'", "'}'", "'void '", "'(){'", "'*'", "'++'", "'--'", "'::'", "'<'", "','", "'>'", "'=>'", "'('", "')'", "'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'instanceof'", "'hastype'", "'<='", "'>='", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'/'", "'%'", "'!'", "'$'", "'~'", "'.'", "'['", "']'", "'->'", "'reduce'", "'ordered'", "'isUnique'", "'null'", "'this'", "'super'", "'new'", "'..'", "'allInstances'", "'/*@'", "'inline'", "'*/'", "'//@'", "';'", "'let'", "'='", "'if'", "'else'", "'or'", "'switch'", "'case'", "'default'", "'while'", "'do'", "'for'", "'in'", "'break'", "'return'", "'accept'", "'classify'", "'from'", "'to'", "'true'", "'false'", "'createLink'", "'destroyLink'", "'clearAssoc'", "'select'", "'reject'", "'collect'", "'iterate'", "'forAll'", "'exists'", "'one'", "'isolated'", "'determined'", "'assured'", "'parallel'", "'+='", "'-='", "'*='", "'%='", "'/='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int RULE_INTEGERVALUE=5;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=9;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalAlfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlfParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g"; }



     	private AlfGrammarAccess grammarAccess;
     	
        public InternalAlfParser(TokenStream input, AlfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CLASSSTRUCT";	
       	}
       	
       	@Override
       	protected AlfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCLASSSTRUCT"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:68:1: entryRuleCLASSSTRUCT returns [EObject current=null] : iv_ruleCLASSSTRUCT= ruleCLASSSTRUCT EOF ;
    public final EObject entryRuleCLASSSTRUCT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLASSSTRUCT = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:69:2: (iv_ruleCLASSSTRUCT= ruleCLASSSTRUCT EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:70:2: iv_ruleCLASSSTRUCT= ruleCLASSSTRUCT EOF
            {
             newCompositeNode(grammarAccess.getCLASSSTRUCTRule()); 
            pushFollow(FOLLOW_ruleCLASSSTRUCT_in_entryRuleCLASSSTRUCT75);
            iv_ruleCLASSSTRUCT=ruleCLASSSTRUCT();

            state._fsp--;

             current =iv_ruleCLASSSTRUCT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLASSSTRUCT85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCLASSSTRUCT"


    // $ANTLR start "ruleCLASSSTRUCT"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:77:1: ruleCLASSSTRUCT returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clsop_3_0= ruleCLASSOP ) )* otherlv_4= '}' ) ;
    public final EObject ruleCLASSSTRUCT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_clsop_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:80:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clsop_3_0= ruleCLASSOP ) )* otherlv_4= '}' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:81:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clsop_3_0= ruleCLASSOP ) )* otherlv_4= '}' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:81:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clsop_3_0= ruleCLASSOP ) )* otherlv_4= '}' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:81:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clsop_3_0= ruleCLASSOP ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCLASSSTRUCT122); 

                	newLeafNode(otherlv_0, grammarAccess.getCLASSSTRUCTAccess().getClassKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:86:1: (lv_name_1_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASSSTRUCT139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCLASSSTRUCTAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCLASSSTRUCTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleCLASSSTRUCT156); 

                	newLeafNode(otherlv_2, grammarAccess.getCLASSSTRUCTAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:107:1: ( (lv_clsop_3_0= ruleCLASSOP ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:108:1: (lv_clsop_3_0= ruleCLASSOP )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:108:1: (lv_clsop_3_0= ruleCLASSOP )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:109:3: lv_clsop_3_0= ruleCLASSOP
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCLASSSTRUCTAccess().getClsopCLASSOPParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCLASSOP_in_ruleCLASSSTRUCT177);
            	    lv_clsop_3_0=ruleCLASSOP();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCLASSSTRUCTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"clsop",
            	            		lv_clsop_3_0, 
            	            		"CLASSOP");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCLASSSTRUCT190); 

                	newLeafNode(otherlv_4, grammarAccess.getCLASSSTRUCTAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLASSSTRUCT"


    // $ANTLR start "entryRuleCLASSOP"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:137:1: entryRuleCLASSOP returns [EObject current=null] : iv_ruleCLASSOP= ruleCLASSOP EOF ;
    public final EObject entryRuleCLASSOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLASSOP = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:138:2: (iv_ruleCLASSOP= ruleCLASSOP EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:139:2: iv_ruleCLASSOP= ruleCLASSOP EOF
            {
             newCompositeNode(grammarAccess.getCLASSOPRule()); 
            pushFollow(FOLLOW_ruleCLASSOP_in_entryRuleCLASSOP226);
            iv_ruleCLASSOP=ruleCLASSOP();

            state._fsp--;

             current =iv_ruleCLASSOP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLASSOP236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCLASSOP"


    // $ANTLR start "ruleCLASSOP"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:146:1: ruleCLASSOP returns [EObject current=null] : (otherlv_0= 'void ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(){' ( (lv_stat_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleCLASSOP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_stat_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:149:28: ( (otherlv_0= 'void ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(){' ( (lv_stat_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:150:1: (otherlv_0= 'void ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(){' ( (lv_stat_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:150:1: (otherlv_0= 'void ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(){' ( (lv_stat_3_0= ruleStatement ) )* otherlv_4= '}' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:150:3: otherlv_0= 'void ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(){' ( (lv_stat_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCLASSOP273); 

                	newLeafNode(otherlv_0, grammarAccess.getCLASSOPAccess().getVoidKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:154:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:155:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:155:1: (lv_name_1_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:156:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCLASSOP290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCLASSOPAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCLASSOPRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCLASSOP307); 

                	newLeafNode(otherlv_2, grammarAccess.getCLASSOPAccess().getLeftParenthesisRightParenthesisLeftCurlyBracketKeyword_2());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:176:1: ( (lv_stat_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==13||(LA2_0>=18 && LA2_0<=19)||(LA2_0>=58 && LA2_0<=60)||LA2_0==63||(LA2_0>=66 && LA2_0<=68)||LA2_0==70||LA2_0==73||(LA2_0>=76 && LA2_0<=78)||(LA2_0>=80 && LA2_0<=83)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:177:1: (lv_stat_3_0= ruleStatement )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:177:1: (lv_stat_3_0= ruleStatement )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:178:3: lv_stat_3_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCLASSOPAccess().getStatStatementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCLASSOP328);
            	    lv_stat_3_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCLASSOPRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stat",
            	            		lv_stat_3_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCLASSOP341); 

                	newLeafNode(otherlv_4, grammarAccess.getCLASSOPAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLASSOP"


    // $ANTLR start "entryRuleLITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:206:1: entryRuleLITERAL returns [EObject current=null] : iv_ruleLITERAL= ruleLITERAL EOF ;
    public final EObject entryRuleLITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLITERAL = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:207:2: (iv_ruleLITERAL= ruleLITERAL EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:208:2: iv_ruleLITERAL= ruleLITERAL EOF
            {
             newCompositeNode(grammarAccess.getLITERALRule()); 
            pushFollow(FOLLOW_ruleLITERAL_in_entryRuleLITERAL377);
            iv_ruleLITERAL=ruleLITERAL();

            state._fsp--;

             current =iv_ruleLITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLITERAL387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLITERAL"


    // $ANTLR start "ruleLITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:215:1: ruleLITERAL returns [EObject current=null] : (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL | this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL ) ;
    public final EObject ruleLITERAL() throws RecognitionException {
        EObject current = null;

        EObject this_BOOLEAN_LITERAL_0 = null;

        EObject this_NUMBER_LITERAL_1 = null;

        EObject this_STRING_LITERAL_2 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:218:28: ( (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL | this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:219:1: (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL | this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:219:1: (this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL | this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL | this_STRING_LITERAL_2= ruleSTRING_LITERAL )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 86:
            case 87:
                {
                alt3=1;
                }
                break;
            case RULE_INTEGERVALUE:
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:220:5: this_BOOLEAN_LITERAL_0= ruleBOOLEAN_LITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getLITERALAccess().getBOOLEAN_LITERALParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_ruleLITERAL434);
                    this_BOOLEAN_LITERAL_0=ruleBOOLEAN_LITERAL();

                    state._fsp--;

                     
                            current = this_BOOLEAN_LITERAL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:230:5: this_NUMBER_LITERAL_1= ruleNUMBER_LITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getLITERALAccess().getNUMBER_LITERALParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_LITERAL_in_ruleLITERAL461);
                    this_NUMBER_LITERAL_1=ruleNUMBER_LITERAL();

                    state._fsp--;

                     
                            current = this_NUMBER_LITERAL_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:240:5: this_STRING_LITERAL_2= ruleSTRING_LITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getLITERALAccess().getSTRING_LITERALParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSTRING_LITERAL_in_ruleLITERAL488);
                    this_STRING_LITERAL_2=ruleSTRING_LITERAL();

                    state._fsp--;

                     
                            current = this_STRING_LITERAL_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLITERAL"


    // $ANTLR start "entryRuleBOOLEAN_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:256:1: entryRuleBOOLEAN_LITERAL returns [EObject current=null] : iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF ;
    public final EObject entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN_LITERAL = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:257:2: (iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:258:2: iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getBOOLEAN_LITERALRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL523);
            iv_ruleBOOLEAN_LITERAL=ruleBOOLEAN_LITERAL();

            state._fsp--;

             current =iv_ruleBOOLEAN_LITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN_LITERAL"


    // $ANTLR start "ruleBOOLEAN_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:265:1: ruleBOOLEAN_LITERAL returns [EObject current=null] : ( ( (lv_value_0_0= ruleBooleanValue ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleBOOLEAN_LITERAL() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;

        EObject lv_suffix_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:268:28: ( ( ( (lv_value_0_0= ruleBooleanValue ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:269:1: ( ( (lv_value_0_0= ruleBooleanValue ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:269:1: ( ( (lv_value_0_0= ruleBooleanValue ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:269:2: ( (lv_value_0_0= ruleBooleanValue ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:269:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:270:1: (lv_value_0_0= ruleBooleanValue )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:270:1: (lv_value_0_0= ruleBooleanValue )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:271:3: lv_value_0_0= ruleBooleanValue
            {
             
            	        newCompositeNode(grammarAccess.getBOOLEAN_LITERALAccess().getValueBooleanValueEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleBOOLEAN_LITERAL579);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBOOLEAN_LITERALRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BooleanValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:287:2: ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50||LA4_0==53) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:288:1: (lv_suffix_1_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:288:1: (lv_suffix_1_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:289:3: lv_suffix_1_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBOOLEAN_LITERALAccess().getSuffixSuffixExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleBOOLEAN_LITERAL600);
                    lv_suffix_1_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBOOLEAN_LITERALRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_1_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN_LITERAL"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:313:1: entryRuleNUMBER_LITERAL returns [EObject current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final EObject entryRuleNUMBER_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNUMBER_LITERAL = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:314:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:315:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            pushFollow(FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL637);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;

             current =iv_ruleNUMBER_LITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER_LITERAL647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:322:1: ruleNUMBER_LITERAL returns [EObject current=null] : (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL | this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL ) ;
    public final EObject ruleNUMBER_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject this_INTEGER_LITERAL_0 = null;

        EObject this_UNLIMITED_LITERAL_1 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:325:28: ( (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL | this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:326:1: (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL | this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:326:1: (this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL | this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INTEGERVALUE) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:327:5: this_INTEGER_LITERAL_0= ruleINTEGER_LITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getNUMBER_LITERALAccess().getINTEGER_LITERALParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_ruleNUMBER_LITERAL694);
                    this_INTEGER_LITERAL_0=ruleINTEGER_LITERAL();

                    state._fsp--;

                     
                            current = this_INTEGER_LITERAL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:337:5: this_UNLIMITED_LITERAL_1= ruleUNLIMITED_LITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getNUMBER_LITERALAccess().getUNLIMITED_LITERALParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUNLIMITED_LITERAL_in_ruleNUMBER_LITERAL721);
                    this_UNLIMITED_LITERAL_1=ruleUNLIMITED_LITERAL();

                    state._fsp--;

                     
                            current = this_UNLIMITED_LITERAL_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleINTEGER_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:353:1: entryRuleINTEGER_LITERAL returns [EObject current=null] : iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF ;
    public final EObject entryRuleINTEGER_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTEGER_LITERAL = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:354:2: (iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:355:2: iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getINTEGER_LITERALRule()); 
            pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_entryRuleINTEGER_LITERAL756);
            iv_ruleINTEGER_LITERAL=ruleINTEGER_LITERAL();

            state._fsp--;

             current =iv_ruleINTEGER_LITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER_LITERAL766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER_LITERAL"


    // $ANTLR start "ruleINTEGER_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:362:1: ruleINTEGER_LITERAL returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INTEGERVALUE ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleINTEGER_LITERAL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_suffix_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:365:28: ( ( ( (lv_value_0_0= RULE_INTEGERVALUE ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:366:1: ( ( (lv_value_0_0= RULE_INTEGERVALUE ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:366:1: ( ( (lv_value_0_0= RULE_INTEGERVALUE ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:366:2: ( (lv_value_0_0= RULE_INTEGERVALUE ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:366:2: ( (lv_value_0_0= RULE_INTEGERVALUE ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:367:1: (lv_value_0_0= RULE_INTEGERVALUE )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:367:1: (lv_value_0_0= RULE_INTEGERVALUE )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:368:3: lv_value_0_0= RULE_INTEGERVALUE
            {
            lv_value_0_0=(Token)match(input,RULE_INTEGERVALUE,FOLLOW_RULE_INTEGERVALUE_in_ruleINTEGER_LITERAL808); 

            			newLeafNode(lv_value_0_0, grammarAccess.getINTEGER_LITERALAccess().getValueIntegerValueTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getINTEGER_LITERALRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"IntegerValue");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:384:2: ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50||LA6_0==53) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:385:1: (lv_suffix_1_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:385:1: (lv_suffix_1_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:386:3: lv_suffix_1_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getINTEGER_LITERALAccess().getSuffixSuffixExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleINTEGER_LITERAL834);
                    lv_suffix_1_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getINTEGER_LITERALRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_1_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTEGER_LITERAL"


    // $ANTLR start "entryRuleUNLIMITED_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:410:1: entryRuleUNLIMITED_LITERAL returns [EObject current=null] : iv_ruleUNLIMITED_LITERAL= ruleUNLIMITED_LITERAL EOF ;
    public final EObject entryRuleUNLIMITED_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNLIMITED_LITERAL = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:411:2: (iv_ruleUNLIMITED_LITERAL= ruleUNLIMITED_LITERAL EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:412:2: iv_ruleUNLIMITED_LITERAL= ruleUNLIMITED_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getUNLIMITED_LITERALRule()); 
            pushFollow(FOLLOW_ruleUNLIMITED_LITERAL_in_entryRuleUNLIMITED_LITERAL871);
            iv_ruleUNLIMITED_LITERAL=ruleUNLIMITED_LITERAL();

            state._fsp--;

             current =iv_ruleUNLIMITED_LITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNLIMITED_LITERAL881); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNLIMITED_LITERAL"


    // $ANTLR start "ruleUNLIMITED_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:419:1: ruleUNLIMITED_LITERAL returns [EObject current=null] : ( ( (lv_value_0_0= '*' ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleUNLIMITED_LITERAL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_suffix_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:422:28: ( ( ( (lv_value_0_0= '*' ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:423:1: ( ( (lv_value_0_0= '*' ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:423:1: ( ( (lv_value_0_0= '*' ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:423:2: ( (lv_value_0_0= '*' ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:423:2: ( (lv_value_0_0= '*' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:424:1: (lv_value_0_0= '*' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:424:1: (lv_value_0_0= '*' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:425:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,17,FOLLOW_17_in_ruleUNLIMITED_LITERAL924); 

                    newLeafNode(lv_value_0_0, grammarAccess.getUNLIMITED_LITERALAccess().getValueAsteriskKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUNLIMITED_LITERALRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "*");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:438:2: ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50||LA7_0==53) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:439:1: (lv_suffix_1_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:439:1: (lv_suffix_1_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:440:3: lv_suffix_1_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUNLIMITED_LITERALAccess().getSuffixSuffixExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleUNLIMITED_LITERAL958);
                    lv_suffix_1_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUNLIMITED_LITERALRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_1_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNLIMITED_LITERAL"


    // $ANTLR start "entryRuleSTRING_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:464:1: entryRuleSTRING_LITERAL returns [EObject current=null] : iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF ;
    public final EObject entryRuleSTRING_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTRING_LITERAL = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:465:2: (iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:466:2: iv_ruleSTRING_LITERAL= ruleSTRING_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getSTRING_LITERALRule()); 
            pushFollow(FOLLOW_ruleSTRING_LITERAL_in_entryRuleSTRING_LITERAL995);
            iv_ruleSTRING_LITERAL=ruleSTRING_LITERAL();

            state._fsp--;

             current =iv_ruleSTRING_LITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTRING_LITERAL1005); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTRING_LITERAL"


    // $ANTLR start "ruleSTRING_LITERAL"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:473:1: ruleSTRING_LITERAL returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleSTRING_LITERAL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        EObject lv_suffix_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:476:28: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:477:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:477:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:477:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:477:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:478:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:478:1: (lv_value_0_0= RULE_STRING )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:479:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSTRING_LITERAL1047); 

            			newLeafNode(lv_value_0_0, grammarAccess.getSTRING_LITERALAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSTRING_LITERALRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:495:2: ( (lv_suffix_1_0= ruleSuffixExpression ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50||LA8_0==53) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:496:1: (lv_suffix_1_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:496:1: (lv_suffix_1_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:497:3: lv_suffix_1_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSTRING_LITERALAccess().getSuffixSuffixExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSTRING_LITERAL1073);
                    lv_suffix_1_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSTRING_LITERALRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_1_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTRING_LITERAL"


    // $ANTLR start "entryRuleNameExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:521:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:522:2: (iv_ruleNameExpression= ruleNameExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:523:2: iv_ruleNameExpression= ruleNameExpression EOF
            {
             newCompositeNode(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_ruleNameExpression_in_entryRuleNameExpression1110);
            iv_ruleNameExpression=ruleNameExpression();

            state._fsp--;

             current =iv_ruleNameExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameExpression1120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:530:1: ruleNameExpression returns [EObject current=null] : ( ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOp_0_1=null;
        Token lv_prefixOp_0_2=null;
        Token lv_id_2_0=null;
        Token lv_id_4_0=null;
        Token lv_postfixOp_7_1=null;
        Token lv_postfixOp_7_2=null;
        EObject lv_path_1_0 = null;

        EObject lv_path_3_0 = null;

        EObject lv_invocationCompletion_5_0 = null;

        EObject lv_sequenceConstructionCompletion_6_0 = null;

        EObject lv_suffix_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:533:28: ( ( ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:1: ( ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:1: ( ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:2: ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) ) ( (lv_suffix_8_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:2: ( ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) ) | ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=18 && LA14_0<=19)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:3: ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:3: ( ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:4: ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) ) ( (lv_path_1_0= ruleQualifiedNamePath ) )? ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:534:4: ( ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:535:1: ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:535:1: ( (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:536:1: (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:536:1: (lv_prefixOp_0_1= '++' | lv_prefixOp_0_2= '--' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==19) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:537:3: lv_prefixOp_0_1= '++'
                            {
                            lv_prefixOp_0_1=(Token)match(input,18,FOLLOW_18_in_ruleNameExpression1167); 

                                    newLeafNode(lv_prefixOp_0_1, grammarAccess.getNameExpressionAccess().getPrefixOpPlusSignPlusSignKeyword_0_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNameExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "prefixOp", lv_prefixOp_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:549:8: lv_prefixOp_0_2= '--'
                            {
                            lv_prefixOp_0_2=(Token)match(input,19,FOLLOW_19_in_ruleNameExpression1196); 

                                    newLeafNode(lv_prefixOp_0_2, grammarAccess.getNameExpressionAccess().getPrefixOpHyphenMinusHyphenMinusKeyword_0_0_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNameExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "prefixOp", lv_prefixOp_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:564:2: ( (lv_path_1_0= ruleQualifiedNamePath ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==21) ) {
                            int LA10_2 = input.LA(3);

                            if ( (LA10_2==RULE_ID) ) {
                                int LA10_5 = input.LA(4);

                                if ( (LA10_5==24) ) {
                                    alt10=1;
                                }
                            }
                        }
                        else if ( (LA10_1==20) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:565:1: (lv_path_1_0= ruleQualifiedNamePath )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:565:1: (lv_path_1_0= ruleQualifiedNamePath )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:566:3: lv_path_1_0= ruleQualifiedNamePath
                            {
                             
                            	        newCompositeNode(grammarAccess.getNameExpressionAccess().getPathQualifiedNamePathParserRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1233);
                            lv_path_1_0=ruleQualifiedNamePath();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNameExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"path",
                                    		lv_path_1_0, 
                                    		"QualifiedNamePath");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:582:3: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:583:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:583:1: (lv_id_2_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:584:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameExpression1251); 

                    			newLeafNode(lv_id_2_0, grammarAccess.getNameExpressionAccess().getIdIDTerminalRuleCall_0_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNameExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:601:6: ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:601:6: ( ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )? )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:601:7: ( (lv_path_3_0= ruleQualifiedNamePath ) )? ( (lv_id_4_0= RULE_ID ) ) ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )?
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:601:7: ( (lv_path_3_0= ruleQualifiedNamePath ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==21) ) {
                            int LA11_3 = input.LA(3);

                            if ( (LA11_3==RULE_ID) ) {
                                int LA11_5 = input.LA(4);

                                if ( (LA11_5==24) ) {
                                    alt11=1;
                                }
                            }
                        }
                        else if ( (LA11_1==20) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:602:1: (lv_path_3_0= ruleQualifiedNamePath )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:602:1: (lv_path_3_0= ruleQualifiedNamePath )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:603:3: lv_path_3_0= ruleQualifiedNamePath
                            {
                             
                            	        newCompositeNode(grammarAccess.getNameExpressionAccess().getPathQualifiedNamePathParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1285);
                            lv_path_3_0=ruleQualifiedNamePath();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNameExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"path",
                                    		lv_path_3_0, 
                                    		"QualifiedNamePath");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:619:3: ( (lv_id_4_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:620:1: (lv_id_4_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:620:1: (lv_id_4_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:621:3: lv_id_4_0= RULE_ID
                    {
                    lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameExpression1303); 

                    			newLeafNode(lv_id_4_0, grammarAccess.getNameExpressionAccess().getIdIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNameExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:637:2: ( ( (lv_invocationCompletion_5_0= ruleTuple ) ) | ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) ) | ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) ) )?
                    int alt13=4;
                    switch ( input.LA(1) ) {
                        case 25:
                            {
                            alt13=1;
                            }
                            break;
                        case 51:
                            {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==52) ) {
                                int LA13_6 = input.LA(3);

                                if ( (LA13_6==13) ) {
                                    alt13=2;
                                }
                            }
                            else if ( ((LA13_2>=RULE_ID && LA13_2<=RULE_STRING)||(LA13_2>=17 && LA13_2<=19)||LA13_2==25||(LA13_2>=43 && LA13_2<=44)||(LA13_2>=47 && LA13_2<=49)||(LA13_2>=57 && LA13_2<=60)||(LA13_2>=86 && LA13_2<=87)) ) {
                                alt13=2;
                            }
                            }
                            break;
                        case 13:
                            {
                            alt13=2;
                            }
                            break;
                        case 18:
                        case 19:
                            {
                            alt13=3;
                            }
                            break;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:637:3: ( (lv_invocationCompletion_5_0= ruleTuple ) )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:637:3: ( (lv_invocationCompletion_5_0= ruleTuple ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:638:1: (lv_invocationCompletion_5_0= ruleTuple )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:638:1: (lv_invocationCompletion_5_0= ruleTuple )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:639:3: lv_invocationCompletion_5_0= ruleTuple
                            {
                             
                            	        newCompositeNode(grammarAccess.getNameExpressionAccess().getInvocationCompletionTupleParserRuleCall_0_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTuple_in_ruleNameExpression1330);
                            lv_invocationCompletion_5_0=ruleTuple();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNameExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"invocationCompletion",
                                    		lv_invocationCompletion_5_0, 
                                    		"Tuple");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:656:6: ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:656:6: ( (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:657:1: (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:657:1: (lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:658:3: lv_sequenceConstructionCompletion_6_0= ruleSequenceConstructionOrAccessCompletion
                            {
                             
                            	        newCompositeNode(grammarAccess.getNameExpressionAccess().getSequenceConstructionCompletionSequenceConstructionOrAccessCompletionParserRuleCall_0_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_ruleNameExpression1357);
                            lv_sequenceConstructionCompletion_6_0=ruleSequenceConstructionOrAccessCompletion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNameExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"sequenceConstructionCompletion",
                                    		lv_sequenceConstructionCompletion_6_0, 
                                    		"SequenceConstructionOrAccessCompletion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:675:6: ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:675:6: ( ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:676:1: ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:676:1: ( (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:677:1: (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:677:1: (lv_postfixOp_7_1= '++' | lv_postfixOp_7_2= '--' )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==18) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==19) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:678:3: lv_postfixOp_7_1= '++'
                                    {
                                    lv_postfixOp_7_1=(Token)match(input,18,FOLLOW_18_in_ruleNameExpression1383); 

                                            newLeafNode(lv_postfixOp_7_1, grammarAccess.getNameExpressionAccess().getPostfixOpPlusSignPlusSignKeyword_0_1_2_2_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getNameExpressionRule());
                                    	        }
                                           		setWithLastConsumed(current, "postfixOp", lv_postfixOp_7_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:690:8: lv_postfixOp_7_2= '--'
                                    {
                                    lv_postfixOp_7_2=(Token)match(input,19,FOLLOW_19_in_ruleNameExpression1412); 

                                            newLeafNode(lv_postfixOp_7_2, grammarAccess.getNameExpressionAccess().getPostfixOpHyphenMinusHyphenMinusKeyword_0_1_2_2_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getNameExpressionRule());
                                    	        }
                                           		setWithLastConsumed(current, "postfixOp", lv_postfixOp_7_2, null);
                                    	    

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:705:6: ( (lv_suffix_8_0= ruleSuffixExpression ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50||LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:706:1: (lv_suffix_8_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:706:1: (lv_suffix_8_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:707:3: lv_suffix_8_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNameExpressionAccess().getSuffixSuffixExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleNameExpression1453);
                    lv_suffix_8_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNameExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_8_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "entryRuleQualifiedNamePath"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:731:1: entryRuleQualifiedNamePath returns [EObject current=null] : iv_ruleQualifiedNamePath= ruleQualifiedNamePath EOF ;
    public final EObject entryRuleQualifiedNamePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNamePath = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:732:2: (iv_ruleQualifiedNamePath= ruleQualifiedNamePath EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:733:2: iv_ruleQualifiedNamePath= ruleQualifiedNamePath EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNamePathRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamePath_in_entryRuleQualifiedNamePath1490);
            iv_ruleQualifiedNamePath=ruleQualifiedNamePath();

            state._fsp--;

             current =iv_ruleQualifiedNamePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamePath1500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNamePath"


    // $ANTLR start "ruleQualifiedNamePath"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:740:1: ruleQualifiedNamePath returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleUnqualifiedName ) ) otherlv_1= '::' )+ ;
    public final EObject ruleQualifiedNamePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_namespace_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:743:28: ( ( ( (lv_namespace_0_0= ruleUnqualifiedName ) ) otherlv_1= '::' )+ )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:744:1: ( ( (lv_namespace_0_0= ruleUnqualifiedName ) ) otherlv_1= '::' )+
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:744:1: ( ( (lv_namespace_0_0= ruleUnqualifiedName ) ) otherlv_1= '::' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==21) ) {
                        int LA16_3 = input.LA(3);

                        if ( (LA16_3==RULE_ID) ) {
                            int LA16_5 = input.LA(4);

                            if ( (LA16_5==24) ) {
                                alt16=1;
                            }


                        }


                    }
                    else if ( (LA16_1==20) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:744:2: ( (lv_namespace_0_0= ruleUnqualifiedName ) ) otherlv_1= '::'
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:744:2: ( (lv_namespace_0_0= ruleUnqualifiedName ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:745:1: (lv_namespace_0_0= ruleUnqualifiedName )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:745:1: (lv_namespace_0_0= ruleUnqualifiedName )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:746:3: lv_namespace_0_0= ruleUnqualifiedName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualifiedNamePathAccess().getNamespaceUnqualifiedNameParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnqualifiedName_in_ruleQualifiedNamePath1546);
            	    lv_namespace_0_0=ruleUnqualifiedName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualifiedNamePathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespace",
            	            		lv_namespace_0_0, 
            	            		"UnqualifiedName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedNamePath1558); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQualifiedNamePathAccess().getColonColonKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNamePath"


    // $ANTLR start "entryRuleUnqualifiedName"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:774:1: entryRuleUnqualifiedName returns [EObject current=null] : iv_ruleUnqualifiedName= ruleUnqualifiedName EOF ;
    public final EObject entryRuleUnqualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualifiedName = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:775:2: (iv_ruleUnqualifiedName= ruleUnqualifiedName EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:776:2: iv_ruleUnqualifiedName= ruleUnqualifiedName EOF
            {
             newCompositeNode(grammarAccess.getUnqualifiedNameRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedName_in_entryRuleUnqualifiedName1595);
            iv_ruleUnqualifiedName=ruleUnqualifiedName();

            state._fsp--;

             current =iv_ruleUnqualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedName1605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualifiedName"


    // $ANTLR start "ruleUnqualifiedName"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:783:1: ruleUnqualifiedName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_templateBinding_1_0= ruleTemplateBinding ) )? ) ;
    public final EObject ruleUnqualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_templateBinding_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:786:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_templateBinding_1_0= ruleTemplateBinding ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:787:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_templateBinding_1_0= ruleTemplateBinding ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:787:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_templateBinding_1_0= ruleTemplateBinding ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:787:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_templateBinding_1_0= ruleTemplateBinding ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:787:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:788:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:788:1: (lv_name_0_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:789:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnqualifiedName1647); 

            			newLeafNode(lv_name_0_0, grammarAccess.getUnqualifiedNameAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnqualifiedNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:805:2: ( (lv_templateBinding_1_0= ruleTemplateBinding ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:806:1: (lv_templateBinding_1_0= ruleTemplateBinding )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:806:1: (lv_templateBinding_1_0= ruleTemplateBinding )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:807:3: lv_templateBinding_1_0= ruleTemplateBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnqualifiedNameAccess().getTemplateBindingTemplateBindingParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateBinding_in_ruleUnqualifiedName1673);
                    lv_templateBinding_1_0=ruleTemplateBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnqualifiedNameRule());
                    	        }
                           		set(
                           			current, 
                           			"templateBinding",
                            		lv_templateBinding_1_0, 
                            		"TemplateBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnqualifiedName"


    // $ANTLR start "entryRuleTemplateBinding"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:831:1: entryRuleTemplateBinding returns [EObject current=null] : iv_ruleTemplateBinding= ruleTemplateBinding EOF ;
    public final EObject entryRuleTemplateBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBinding = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:832:2: (iv_ruleTemplateBinding= ruleTemplateBinding EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:833:2: iv_ruleTemplateBinding= ruleTemplateBinding EOF
            {
             newCompositeNode(grammarAccess.getTemplateBindingRule()); 
            pushFollow(FOLLOW_ruleTemplateBinding_in_entryRuleTemplateBinding1710);
            iv_ruleTemplateBinding=ruleTemplateBinding();

            state._fsp--;

             current =iv_ruleTemplateBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateBinding1720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateBinding"


    // $ANTLR start "ruleTemplateBinding"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:840:1: ruleTemplateBinding returns [EObject current=null] : (otherlv_0= '<' ( (lv_bindings_1_0= ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' ) ;
    public final EObject ruleTemplateBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bindings_1_0 = null;

        EObject lv_bindings_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:843:28: ( (otherlv_0= '<' ( (lv_bindings_1_0= ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:844:1: (otherlv_0= '<' ( (lv_bindings_1_0= ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:844:1: (otherlv_0= '<' ( (lv_bindings_1_0= ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:844:3: otherlv_0= '<' ( (lv_bindings_1_0= ruleNamedTemplateBinding ) ) (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )* otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTemplateBinding1757); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateBindingAccess().getLessThanSignKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:848:1: ( (lv_bindings_1_0= ruleNamedTemplateBinding ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:849:1: (lv_bindings_1_0= ruleNamedTemplateBinding )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:849:1: (lv_bindings_1_0= ruleNamedTemplateBinding )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:850:3: lv_bindings_1_0= ruleNamedTemplateBinding
            {
             
            	        newCompositeNode(grammarAccess.getTemplateBindingAccess().getBindingsNamedTemplateBindingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1778);
            lv_bindings_1_0=ruleNamedTemplateBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateBindingRule());
            	        }
                   		add(
                   			current, 
                   			"bindings",
                    		lv_bindings_1_0, 
                    		"NamedTemplateBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:866:2: (otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:866:4: otherlv_2= ',' ( (lv_bindings_3_0= ruleNamedTemplateBinding ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTemplateBinding1791); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTemplateBindingAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:870:1: ( (lv_bindings_3_0= ruleNamedTemplateBinding ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:871:1: (lv_bindings_3_0= ruleNamedTemplateBinding )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:871:1: (lv_bindings_3_0= ruleNamedTemplateBinding )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:872:3: lv_bindings_3_0= ruleNamedTemplateBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateBindingAccess().getBindingsNamedTemplateBindingParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1812);
            	    lv_bindings_3_0=ruleNamedTemplateBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateBindingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bindings",
            	            		lv_bindings_3_0, 
            	            		"NamedTemplateBinding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleTemplateBinding1826); 

                	newLeafNode(otherlv_4, grammarAccess.getTemplateBindingAccess().getGreaterThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateBinding"


    // $ANTLR start "entryRuleNamedTemplateBinding"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:900:1: entryRuleNamedTemplateBinding returns [EObject current=null] : iv_ruleNamedTemplateBinding= ruleNamedTemplateBinding EOF ;
    public final EObject entryRuleNamedTemplateBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedTemplateBinding = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:901:2: (iv_ruleNamedTemplateBinding= ruleNamedTemplateBinding EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:902:2: iv_ruleNamedTemplateBinding= ruleNamedTemplateBinding EOF
            {
             newCompositeNode(grammarAccess.getNamedTemplateBindingRule()); 
            pushFollow(FOLLOW_ruleNamedTemplateBinding_in_entryRuleNamedTemplateBinding1862);
            iv_ruleNamedTemplateBinding=ruleNamedTemplateBinding();

            state._fsp--;

             current =iv_ruleNamedTemplateBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedTemplateBinding1872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedTemplateBinding"


    // $ANTLR start "ruleNamedTemplateBinding"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:909:1: ruleNamedTemplateBinding returns [EObject current=null] : ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) ) ;
    public final EObject ruleNamedTemplateBinding() throws RecognitionException {
        EObject current = null;

        Token lv_formal_0_0=null;
        Token otherlv_1=null;
        EObject lv_actual_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:912:28: ( ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:913:1: ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:913:1: ( ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:913:2: ( (lv_formal_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:913:2: ( (lv_formal_0_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:914:1: (lv_formal_0_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:914:1: (lv_formal_0_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:915:3: lv_formal_0_0= RULE_ID
            {
            lv_formal_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedTemplateBinding1914); 

            			newLeafNode(lv_formal_0_0, grammarAccess.getNamedTemplateBindingAccess().getFormalIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedTemplateBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"formal",
                    		lv_formal_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleNamedTemplateBinding1931); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedTemplateBindingAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:935:1: ( (lv_actual_2_0= ruleQualifiedNameWithBinding ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:936:1: (lv_actual_2_0= ruleQualifiedNameWithBinding )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:936:1: (lv_actual_2_0= ruleQualifiedNameWithBinding )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:937:3: lv_actual_2_0= ruleQualifiedNameWithBinding
            {
             
            	        newCompositeNode(grammarAccess.getNamedTemplateBindingAccess().getActualQualifiedNameWithBindingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleNamedTemplateBinding1952);
            lv_actual_2_0=ruleQualifiedNameWithBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedTemplateBindingRule());
            	        }
                   		set(
                   			current, 
                   			"actual",
                    		lv_actual_2_0, 
                    		"QualifiedNameWithBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedTemplateBinding"


    // $ANTLR start "entryRuleQualifiedNameWithBinding"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:961:1: entryRuleQualifiedNameWithBinding returns [EObject current=null] : iv_ruleQualifiedNameWithBinding= ruleQualifiedNameWithBinding EOF ;
    public final EObject entryRuleQualifiedNameWithBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameWithBinding = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:962:2: (iv_ruleQualifiedNameWithBinding= ruleQualifiedNameWithBinding EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:963:2: iv_ruleQualifiedNameWithBinding= ruleQualifiedNameWithBinding EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithBindingRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_entryRuleQualifiedNameWithBinding1988);
            iv_ruleQualifiedNameWithBinding=ruleQualifiedNameWithBinding();

            state._fsp--;

             current =iv_ruleQualifiedNameWithBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithBinding1998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithBinding"


    // $ANTLR start "ruleQualifiedNameWithBinding"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:970:1: ruleQualifiedNameWithBinding returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0= ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? ) ;
    public final EObject ruleQualifiedNameWithBinding() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_2=null;
        EObject lv_binding_1_0 = null;

        EObject lv_remaining_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:973:28: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0= ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:974:1: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0= ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:974:1: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0= ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:974:2: ( (lv_id_0_0= RULE_ID ) ) ( (lv_binding_1_0= ruleTemplateBinding ) )? (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:974:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:975:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:975:1: (lv_id_0_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:976:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithBinding2040); 

            			newLeafNode(lv_id_0_0, grammarAccess.getQualifiedNameWithBindingAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameWithBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:992:2: ( (lv_binding_1_0= ruleTemplateBinding ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==24) ) {
                        alt19=1;
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:993:1: (lv_binding_1_0= ruleTemplateBinding )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:993:1: (lv_binding_1_0= ruleTemplateBinding )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:994:3: lv_binding_1_0= ruleTemplateBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedNameWithBindingAccess().getBindingTemplateBindingParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateBinding_in_ruleQualifiedNameWithBinding2066);
                    lv_binding_1_0=ruleTemplateBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQualifiedNameWithBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"binding",
                            		lv_binding_1_0, 
                            		"TemplateBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1010:3: (otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1010:5: otherlv_2= '::' ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedNameWithBinding2080); 

                        	newLeafNode(otherlv_2, grammarAccess.getQualifiedNameWithBindingAccess().getColonColonKeyword_2_0());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1014:1: ( (lv_remaining_3_0= ruleQualifiedNameWithBinding ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1015:1: (lv_remaining_3_0= ruleQualifiedNameWithBinding )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1015:1: (lv_remaining_3_0= ruleQualifiedNameWithBinding )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1016:3: lv_remaining_3_0= ruleQualifiedNameWithBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getQualifiedNameWithBindingAccess().getRemainingQualifiedNameWithBindingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameWithBinding2101);
                    lv_remaining_3_0=ruleQualifiedNameWithBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQualifiedNameWithBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"remaining",
                            		lv_remaining_3_0, 
                            		"QualifiedNameWithBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithBinding"


    // $ANTLR start "entryRuleTuple"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1040:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1041:2: (iv_ruleTuple= ruleTuple EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1042:2: iv_ruleTuple= ruleTuple EOF
            {
             newCompositeNode(grammarAccess.getTupleRule()); 
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple2139);
            iv_ruleTuple=ruleTuple();

            state._fsp--;

             current =iv_ruleTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple2149); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1049:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tupleElements_2_0 = null;

        EObject lv_tupleElements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1052:28: ( ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1053:1: ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1053:1: ( () otherlv_1= '(' ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1053:2: () otherlv_1= '(' ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )? otherlv_5= ')'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1053:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1054:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTupleAccess().getTupleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTuple2195); 

                	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftParenthesisKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1063:1: ( ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||(LA22_0>=17 && LA22_0<=19)||LA22_0==25||(LA22_0>=43 && LA22_0<=44)||(LA22_0>=47 && LA22_0<=49)||(LA22_0>=57 && LA22_0<=60)||(LA22_0>=86 && LA22_0<=87)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1063:2: ( (lv_tupleElements_2_0= ruleTupleElement ) ) (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )*
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1063:2: ( (lv_tupleElements_2_0= ruleTupleElement ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1064:1: (lv_tupleElements_2_0= ruleTupleElement )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1064:1: (lv_tupleElements_2_0= ruleTupleElement )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1065:3: lv_tupleElements_2_0= ruleTupleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getTupleAccess().getTupleElementsTupleElementParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTupleElement_in_ruleTuple2217);
                    lv_tupleElements_2_0=ruleTupleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTupleRule());
                    	        }
                           		add(
                           			current, 
                           			"tupleElements",
                            		lv_tupleElements_2_0, 
                            		"TupleElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1081:2: (otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==22) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1081:4: otherlv_3= ',' ( (lv_tupleElements_4_0= ruleTupleElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTuple2230); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1085:1: ( (lv_tupleElements_4_0= ruleTupleElement ) )
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1086:1: (lv_tupleElements_4_0= ruleTupleElement )
                    	    {
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1086:1: (lv_tupleElements_4_0= ruleTupleElement )
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1087:3: lv_tupleElements_4_0= ruleTupleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTupleAccess().getTupleElementsTupleElementParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTupleElement_in_ruleTuple2251);
                    	    lv_tupleElements_4_0=ruleTupleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTupleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tupleElements",
                    	            		lv_tupleElements_4_0, 
                    	            		"TupleElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleTuple2267); 

                	newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleTupleElement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1115:1: entryRuleTupleElement returns [EObject current=null] : iv_ruleTupleElement= ruleTupleElement EOF ;
    public final EObject entryRuleTupleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleElement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1116:2: (iv_ruleTupleElement= ruleTupleElement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1117:2: iv_ruleTupleElement= ruleTupleElement EOF
            {
             newCompositeNode(grammarAccess.getTupleElementRule()); 
            pushFollow(FOLLOW_ruleTupleElement_in_entryRuleTupleElement2303);
            iv_ruleTupleElement=ruleTupleElement();

            state._fsp--;

             current =iv_ruleTupleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleElement2313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleElement"


    // $ANTLR start "ruleTupleElement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1124:1: ruleTupleElement returns [EObject current=null] : ( (lv_argument_0_0= ruleExpression ) ) ;
    public final EObject ruleTupleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1127:28: ( ( (lv_argument_0_0= ruleExpression ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1128:1: ( (lv_argument_0_0= ruleExpression ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1128:1: ( (lv_argument_0_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1129:1: (lv_argument_0_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1129:1: (lv_argument_0_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1130:3: lv_argument_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTupleElementAccess().getArgumentExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTupleElement2358);
            lv_argument_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTupleElementRule());
            	        }
                   		set(
                   			current, 
                   			"argument",
                    		lv_argument_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleElement"


    // $ANTLR start "entryRuleExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1154:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1155:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1156:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2393);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1163:1: ruleExpression returns [EObject current=null] : this_ConditionalTestExpression_0= ruleConditionalTestExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalTestExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1166:28: (this_ConditionalTestExpression_0= ruleConditionalTestExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1168:5: this_ConditionalTestExpression_0= ruleConditionalTestExpression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getConditionalTestExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleConditionalTestExpression_in_ruleExpression2449);
            this_ConditionalTestExpression_0=ruleConditionalTestExpression();

            state._fsp--;

             
                    current = this_ConditionalTestExpression_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConditionalTestExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1184:1: entryRuleConditionalTestExpression returns [EObject current=null] : iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF ;
    public final EObject entryRuleConditionalTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalTestExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1185:2: (iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1186:2: iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalTestExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalTestExpression_in_entryRuleConditionalTestExpression2483);
            iv_ruleConditionalTestExpression=ruleConditionalTestExpression();

            state._fsp--;

             current =iv_ruleConditionalTestExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalTestExpression2493); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalTestExpression"


    // $ANTLR start "ruleConditionalTestExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1193:1: ruleConditionalTestExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? ) ;
    public final EObject ruleConditionalTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_0_0 = null;

        EObject lv_whenTrue_2_0 = null;

        EObject lv_whenFalse_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1196:28: ( ( ( (lv_exp_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1197:1: ( ( (lv_exp_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1197:1: ( ( (lv_exp_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1197:2: ( (lv_exp_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1197:2: ( (lv_exp_0_0= ruleConditionalOrExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1198:1: (lv_exp_0_0= ruleConditionalOrExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1198:1: (lv_exp_0_0= ruleConditionalOrExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1199:3: lv_exp_0_0= ruleConditionalOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getExpConditionalOrExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleConditionalTestExpression2539);
            lv_exp_0_0=ruleConditionalOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"ConditionalOrExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1215:2: (otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1215:4: otherlv_1= '?' ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) ) otherlv_3= ':' ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleConditionalTestExpression2552); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionalTestExpressionAccess().getQuestionMarkKeyword_1_0());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1219:1: ( (lv_whenTrue_2_0= ruleConditionalTestExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1220:1: (lv_whenTrue_2_0= ruleConditionalTestExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1220:1: (lv_whenTrue_2_0= ruleConditionalTestExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1221:3: lv_whenTrue_2_0= ruleConditionalTestExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getWhenTrueConditionalTestExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2573);
                    lv_whenTrue_2_0=ruleConditionalTestExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"whenTrue",
                            		lv_whenTrue_2_0, 
                            		"ConditionalTestExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleConditionalTestExpression2585); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionalTestExpressionAccess().getColonKeyword_1_2());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1241:1: ( (lv_whenFalse_4_0= ruleConditionalTestExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1242:1: (lv_whenFalse_4_0= ruleConditionalTestExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1242:1: (lv_whenFalse_4_0= ruleConditionalTestExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1243:3: lv_whenFalse_4_0= ruleConditionalTestExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getWhenFalseConditionalTestExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2606);
                    lv_whenFalse_4_0=ruleConditionalTestExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"whenFalse",
                            		lv_whenFalse_4_0, 
                            		"ConditionalTestExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalTestExpression"


    // $ANTLR start "entryRuleConditionalOrExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1267:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1268:2: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1269:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression2644);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;

             current =iv_ruleConditionalOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression2654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1276:1: ruleConditionalOrExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleConditionalAndExpression ) ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1279:28: ( ( ( (lv_exp_0_0= ruleConditionalAndExpression ) ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1280:1: ( ( (lv_exp_0_0= ruleConditionalAndExpression ) ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1280:1: ( ( (lv_exp_0_0= ruleConditionalAndExpression ) ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1280:2: ( (lv_exp_0_0= ruleConditionalAndExpression ) ) (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1280:2: ( (lv_exp_0_0= ruleConditionalAndExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1281:1: (lv_exp_0_0= ruleConditionalAndExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1281:1: (lv_exp_0_0= ruleConditionalAndExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1282:3: lv_exp_0_0= ruleConditionalAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getExpConditionalAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2700);
            lv_exp_0_0=ruleConditionalAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"ConditionalAndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1298:2: (otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1298:4: otherlv_1= '||' ( (lv_exp_2_0= ruleConditionalAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleConditionalOrExpression2713); 

            	        	newLeafNode(otherlv_1, grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1302:1: ( (lv_exp_2_0= ruleConditionalAndExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1303:1: (lv_exp_2_0= ruleConditionalAndExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1303:1: (lv_exp_2_0= ruleConditionalAndExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1304:3: lv_exp_2_0= ruleConditionalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getExpConditionalAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2734);
            	    lv_exp_2_0=ruleConditionalAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"ConditionalAndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalAndExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1328:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1329:2: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1330:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression2772);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;

             current =iv_ruleConditionalAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression2782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1337:1: ruleConditionalAndExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) ) (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1340:28: ( ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) ) (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1341:1: ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) ) (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1341:1: ( ( (lv_exp_0_0= ruleInclusiveOrExpression ) ) (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1341:2: ( (lv_exp_0_0= ruleInclusiveOrExpression ) ) (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1341:2: ( (lv_exp_0_0= ruleInclusiveOrExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1342:1: (lv_exp_0_0= ruleInclusiveOrExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1342:1: (lv_exp_0_0= ruleInclusiveOrExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1343:3: lv_exp_0_0= ruleInclusiveOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getExpInclusiveOrExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2828);
            lv_exp_0_0=ruleInclusiveOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"InclusiveOrExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1359:2: (otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1359:4: otherlv_1= '&&' ( (lv_exp_2_0= ruleInclusiveOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleConditionalAndExpression2841); 

            	        	newLeafNode(otherlv_1, grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1363:1: ( (lv_exp_2_0= ruleInclusiveOrExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1364:1: (lv_exp_2_0= ruleInclusiveOrExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1364:1: (lv_exp_2_0= ruleInclusiveOrExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1365:3: lv_exp_2_0= ruleInclusiveOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getExpInclusiveOrExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2862);
            	    lv_exp_2_0=ruleInclusiveOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"InclusiveOrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleInclusiveOrExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1389:1: entryRuleInclusiveOrExpression returns [EObject current=null] : iv_ruleInclusiveOrExpression= ruleInclusiveOrExpression EOF ;
    public final EObject entryRuleInclusiveOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclusiveOrExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1390:2: (iv_ruleInclusiveOrExpression= ruleInclusiveOrExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1391:2: iv_ruleInclusiveOrExpression= ruleInclusiveOrExpression EOF
            {
             newCompositeNode(grammarAccess.getInclusiveOrExpressionRule()); 
            pushFollow(FOLLOW_ruleInclusiveOrExpression_in_entryRuleInclusiveOrExpression2900);
            iv_ruleInclusiveOrExpression=ruleInclusiveOrExpression();

            state._fsp--;

             current =iv_ruleInclusiveOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclusiveOrExpression2910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclusiveOrExpression"


    // $ANTLR start "ruleInclusiveOrExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1398:1: ruleInclusiveOrExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* ) ;
    public final EObject ruleInclusiveOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1401:28: ( ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1402:1: ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1402:1: ( ( (lv_exp_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1402:2: ( (lv_exp_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1402:2: ( (lv_exp_0_0= ruleExclusiveOrExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1403:1: (lv_exp_0_0= ruleExclusiveOrExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1403:1: (lv_exp_0_0= ruleExclusiveOrExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1404:3: lv_exp_0_0= ruleExclusiveOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getInclusiveOrExpressionAccess().getExpExclusiveOrExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2956);
            lv_exp_0_0=ruleExclusiveOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInclusiveOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"ExclusiveOrExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1420:2: (otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1420:4: otherlv_1= '|' ( (lv_exp_2_0= ruleExclusiveOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleInclusiveOrExpression2969); 

            	        	newLeafNode(otherlv_1, grammarAccess.getInclusiveOrExpressionAccess().getVerticalLineKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1424:1: ( (lv_exp_2_0= ruleExclusiveOrExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1425:1: (lv_exp_2_0= ruleExclusiveOrExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1425:1: (lv_exp_2_0= ruleExclusiveOrExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1426:3: lv_exp_2_0= ruleExclusiveOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInclusiveOrExpressionAccess().getExpExclusiveOrExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2990);
            	    lv_exp_2_0=ruleExclusiveOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInclusiveOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"ExclusiveOrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclusiveOrExpression"


    // $ANTLR start "entryRuleExclusiveOrExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1450:1: entryRuleExclusiveOrExpression returns [EObject current=null] : iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF ;
    public final EObject entryRuleExclusiveOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveOrExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1451:2: (iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1452:2: iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF
            {
             newCompositeNode(grammarAccess.getExclusiveOrExpressionRule()); 
            pushFollow(FOLLOW_ruleExclusiveOrExpression_in_entryRuleExclusiveOrExpression3028);
            iv_ruleExclusiveOrExpression=ruleExclusiveOrExpression();

            state._fsp--;

             current =iv_ruleExclusiveOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExclusiveOrExpression3038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveOrExpression"


    // $ANTLR start "ruleExclusiveOrExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1459:1: ruleExclusiveOrExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExclusiveOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1462:28: ( ( ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1463:1: ( ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1463:1: ( ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1463:2: ( (lv_exp_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1463:2: ( (lv_exp_0_0= ruleAndExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1464:1: (lv_exp_0_0= ruleAndExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1464:1: (lv_exp_0_0= ruleAndExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1465:3: lv_exp_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getExclusiveOrExpressionAccess().getExpAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression3084);
            lv_exp_0_0=ruleAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExclusiveOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"AndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1481:2: (otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1481:4: otherlv_1= '^' ( (lv_exp_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleExclusiveOrExpression3097); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExclusiveOrExpressionAccess().getCircumflexAccentKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1485:1: ( (lv_exp_2_0= ruleAndExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1486:1: (lv_exp_2_0= ruleAndExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1486:1: (lv_exp_2_0= ruleAndExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1487:3: lv_exp_2_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExclusiveOrExpressionAccess().getExpAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression3118);
            	    lv_exp_2_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExclusiveOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusiveOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1511:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1512:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1513:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression3156);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression3166); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1520:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1523:28: ( ( ( (lv_exp_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1524:1: ( ( (lv_exp_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1524:1: ( ( (lv_exp_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1524:2: ( (lv_exp_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1524:2: ( (lv_exp_0_0= ruleEqualityExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1525:1: (lv_exp_0_0= ruleEqualityExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1525:1: (lv_exp_0_0= ruleEqualityExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1526:3: lv_exp_0_0= ruleEqualityExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getExpEqualityExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression3212);
            lv_exp_0_0=ruleEqualityExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"EqualityExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1542:2: (otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1542:4: otherlv_1= '&' ( (lv_exp_2_0= ruleEqualityExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAndExpression3225); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1546:1: ( (lv_exp_2_0= ruleEqualityExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1547:1: (lv_exp_2_0= ruleEqualityExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1547:1: (lv_exp_2_0= ruleEqualityExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1548:3: lv_exp_2_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getExpEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression3246);
            	    lv_exp_2_0=ruleEqualityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"EqualityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1572:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1573:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1574:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression3284);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression3294); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1581:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleClassificationExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1584:28: ( ( ( (lv_exp_0_0= ruleClassificationExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1585:1: ( ( (lv_exp_0_0= ruleClassificationExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1585:1: ( ( (lv_exp_0_0= ruleClassificationExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1585:2: ( (lv_exp_0_0= ruleClassificationExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1585:2: ( (lv_exp_0_0= ruleClassificationExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1586:1: (lv_exp_0_0= ruleClassificationExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1586:1: (lv_exp_0_0= ruleClassificationExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1587:3: lv_exp_0_0= ruleClassificationExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getExpClassificationExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3340);
            lv_exp_0_0=ruleClassificationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"ClassificationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1603:2: ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=34 && LA30_0<=35)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1603:3: ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_exp_2_0= ruleClassificationExpression ) )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1603:3: ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1604:1: ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1604:1: ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1605:1: (lv_op_1_1= '==' | lv_op_1_2= '!=' )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1605:1: (lv_op_1_1= '==' | lv_op_1_2= '!=' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==34) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==35) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1606:3: lv_op_1_1= '=='
            	            {
            	            lv_op_1_1=(Token)match(input,34,FOLLOW_34_in_ruleEqualityExpression3361); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1618:8: lv_op_1_2= '!='
            	            {
            	            lv_op_1_2=(Token)match(input,35,FOLLOW_35_in_ruleEqualityExpression3390); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1633:2: ( (lv_exp_2_0= ruleClassificationExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1634:1: (lv_exp_2_0= ruleClassificationExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1634:1: (lv_exp_2_0= ruleClassificationExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1635:3: lv_exp_2_0= ruleClassificationExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getExpClassificationExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3427);
            	    lv_exp_2_0=ruleClassificationExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"ClassificationExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleClassificationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1659:1: entryRuleClassificationExpression returns [EObject current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final EObject entryRuleClassificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1660:2: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1661:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
            {
             newCompositeNode(grammarAccess.getClassificationExpressionRule()); 
            pushFollow(FOLLOW_ruleClassificationExpression_in_entryRuleClassificationExpression3465);
            iv_ruleClassificationExpression=ruleClassificationExpression();

            state._fsp--;

             current =iv_ruleClassificationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassificationExpression3475); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassificationExpression"


    // $ANTLR start "ruleClassificationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1668:1: ruleClassificationExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? ) ;
    public final EObject ruleClassificationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_exp_0_0 = null;

        EObject lv_typeName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1671:28: ( ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1672:1: ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1672:1: ( ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1672:2: ( (lv_exp_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1672:2: ( (lv_exp_0_0= ruleRelationalExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1673:1: (lv_exp_0_0= ruleRelationalExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1673:1: (lv_exp_0_0= ruleRelationalExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1674:3: lv_exp_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getClassificationExpressionAccess().getExpRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleClassificationExpression3521);
            lv_exp_0_0=ruleRelationalExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"RelationalExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1690:2: ( ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=36 && LA32_0<=37)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1690:3: ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) ) ( (lv_typeName_2_0= ruleNameExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1690:3: ( ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1691:1: ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1691:1: ( (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1692:1: (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1692:1: (lv_op_1_1= 'instanceof' | lv_op_1_2= 'hastype' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==36) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==37) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1693:3: lv_op_1_1= 'instanceof'
                            {
                            lv_op_1_1=(Token)match(input,36,FOLLOW_36_in_ruleClassificationExpression3542); 

                                    newLeafNode(lv_op_1_1, grammarAccess.getClassificationExpressionAccess().getOpInstanceofKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getClassificationExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1705:8: lv_op_1_2= 'hastype'
                            {
                            lv_op_1_2=(Token)match(input,37,FOLLOW_37_in_ruleClassificationExpression3571); 

                                    newLeafNode(lv_op_1_2, grammarAccess.getClassificationExpressionAccess().getOpHastypeKeyword_1_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getClassificationExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1720:2: ( (lv_typeName_2_0= ruleNameExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1721:1: (lv_typeName_2_0= ruleNameExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1721:1: (lv_typeName_2_0= ruleNameExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1722:3: lv_typeName_2_0= ruleNameExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassificationExpressionAccess().getTypeNameNameExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameExpression_in_ruleClassificationExpression3608);
                    lv_typeName_2_0=ruleNameExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassificationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"typeName",
                            		lv_typeName_2_0, 
                            		"NameExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassificationExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1746:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1747:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1748:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3646);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression3656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1755:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        Token lv_op_1_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1758:28: ( ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1759:1: ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1759:1: ( ( (lv_left_0_0= ruleShiftExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1759:2: ( (lv_left_0_0= ruleShiftExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1759:2: ( (lv_left_0_0= ruleShiftExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1760:1: (lv_left_0_0= ruleShiftExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1760:1: (lv_left_0_0= ruleShiftExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1761:3: lv_left_0_0= ruleShiftExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getLeftShiftExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3702);
            lv_left_0_0=ruleShiftExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"ShiftExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1777:2: ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21||LA34_0==23||(LA34_0>=38 && LA34_0<=39)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1777:3: ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) ) ( (lv_right_2_0= ruleShiftExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1777:3: ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1778:1: ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1778:1: ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1779:1: (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1779:1: (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '<=' | lv_op_1_4= '>=' )
                    int alt33=4;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt33=1;
                        }
                        break;
                    case 23:
                        {
                        alt33=2;
                        }
                        break;
                    case 38:
                        {
                        alt33=3;
                        }
                        break;
                    case 39:
                        {
                        alt33=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1780:3: lv_op_1_1= '<'
                            {
                            lv_op_1_1=(Token)match(input,21,FOLLOW_21_in_ruleRelationalExpression3723); 

                                    newLeafNode(lv_op_1_1, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1792:8: lv_op_1_2= '>'
                            {
                            lv_op_1_2=(Token)match(input,23,FOLLOW_23_in_ruleRelationalExpression3752); 

                                    newLeafNode(lv_op_1_2, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1804:8: lv_op_1_3= '<='
                            {
                            lv_op_1_3=(Token)match(input,38,FOLLOW_38_in_ruleRelationalExpression3781); 

                                    newLeafNode(lv_op_1_3, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1816:8: lv_op_1_4= '>='
                            {
                            lv_op_1_4=(Token)match(input,39,FOLLOW_39_in_ruleRelationalExpression3810); 

                                    newLeafNode(lv_op_1_4, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_4, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1831:2: ( (lv_right_2_0= ruleShiftExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1832:1: (lv_right_2_0= ruleShiftExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1832:1: (lv_right_2_0= ruleShiftExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1833:3: lv_right_2_0= ruleShiftExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightShiftExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3847);
                    lv_right_2_0=ruleShiftExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_0, 
                            		"ShiftExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1857:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1858:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1859:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
             newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression3885);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;

             current =iv_ruleShiftExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression3895); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1866:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1869:28: ( ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1870:1: ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1870:1: ( ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1870:2: ( (lv_exp_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1870:2: ( (lv_exp_0_0= ruleAdditiveExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1871:1: (lv_exp_0_0= ruleAdditiveExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1871:1: (lv_exp_0_0= ruleAdditiveExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1872:3: lv_exp_0_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getExpAdditiveExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3941);
            lv_exp_0_0=ruleAdditiveExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"AdditiveExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1888:2: ( ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=40 && LA36_0<=42)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1888:3: ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) ) ( (lv_exp_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1888:3: ( ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1889:1: ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1889:1: ( (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1890:1: (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1890:1: (lv_op_1_1= '<<' | lv_op_1_2= '>>' | lv_op_1_3= '>>>' )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case 40:
                        {
                        alt35=1;
                        }
                        break;
                    case 41:
                        {
                        alt35=2;
                        }
                        break;
                    case 42:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1891:3: lv_op_1_1= '<<'
                            {
                            lv_op_1_1=(Token)match(input,40,FOLLOW_40_in_ruleShiftExpression3962); 

                                    newLeafNode(lv_op_1_1, grammarAccess.getShiftExpressionAccess().getOpLessThanSignLessThanSignKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getShiftExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1903:8: lv_op_1_2= '>>'
                            {
                            lv_op_1_2=(Token)match(input,41,FOLLOW_41_in_ruleShiftExpression3991); 

                                    newLeafNode(lv_op_1_2, grammarAccess.getShiftExpressionAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getShiftExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1915:8: lv_op_1_3= '>>>'
                            {
                            lv_op_1_3=(Token)match(input,42,FOLLOW_42_in_ruleShiftExpression4020); 

                                    newLeafNode(lv_op_1_3, grammarAccess.getShiftExpressionAccess().getOpGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getShiftExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_1_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1930:2: ( (lv_exp_2_0= ruleAdditiveExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1931:1: (lv_exp_2_0= ruleAdditiveExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1931:1: (lv_exp_2_0= ruleAdditiveExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1932:3: lv_exp_2_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getExpAdditiveExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression4057);
                    lv_exp_2_0=ruleAdditiveExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"exp",
                            		lv_exp_2_0, 
                            		"AdditiveExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1956:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1957:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1958:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression4095);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression4105); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1965:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1968:28: ( ( ( (lv_exp_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1969:1: ( ( (lv_exp_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1969:1: ( ( (lv_exp_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1969:2: ( (lv_exp_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1969:2: ( (lv_exp_0_0= ruleMultiplicativeExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1970:1: (lv_exp_0_0= ruleMultiplicativeExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1970:1: (lv_exp_0_0= ruleMultiplicativeExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1971:3: lv_exp_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExpMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4151);
            lv_exp_0_0=ruleMultiplicativeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"MultiplicativeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1987:2: ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=43 && LA38_0<=44)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1987:3: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_exp_2_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1987:3: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1988:1: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1988:1: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1989:1: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1989:1: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==43) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==44) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1990:3: lv_op_1_1= '+'
            	            {
            	            lv_op_1_1=(Token)match(input,43,FOLLOW_43_in_ruleAdditiveExpression4172); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2002:8: lv_op_1_2= '-'
            	            {
            	            lv_op_1_2=(Token)match(input,44,FOLLOW_44_in_ruleAdditiveExpression4201); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2017:2: ( (lv_exp_2_0= ruleMultiplicativeExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2018:1: (lv_exp_2_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2018:1: (lv_exp_2_0= ruleMultiplicativeExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2019:3: lv_exp_2_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getExpMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4238);
            	    lv_exp_2_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"MultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2043:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2044:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2045:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression4276);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression4286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2052:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2055:28: ( ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2056:1: ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2056:1: ( ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2056:2: ( (lv_exp_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2056:2: ( (lv_exp_0_0= ruleUnaryExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2057:1: (lv_exp_0_0= ruleUnaryExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2057:1: (lv_exp_0_0= ruleUnaryExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2058:3: lv_exp_0_0= ruleUnaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExpUnaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4332);
            lv_exp_0_0=ruleUnaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"exp",
                    		lv_exp_0_0, 
                    		"UnaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2074:2: ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==17||(LA40_0>=45 && LA40_0<=46)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2074:3: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_exp_2_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2074:3: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2075:1: ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2075:1: ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2076:1: (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2076:1: (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2077:3: lv_op_1_1= '*'
            	            {
            	            lv_op_1_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicativeExpression4353); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2089:8: lv_op_1_2= '/'
            	            {
            	            lv_op_1_2=(Token)match(input,45,FOLLOW_45_in_ruleMultiplicativeExpression4382); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2101:8: lv_op_1_3= '%'
            	            {
            	            lv_op_1_3=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicativeExpression4411); 

            	                    newLeafNode(lv_op_1_3, grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_3, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2116:2: ( (lv_exp_2_0= ruleUnaryExpression ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2117:1: (lv_exp_2_0= ruleUnaryExpression )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2117:1: (lv_exp_2_0= ruleUnaryExpression )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2118:3: lv_exp_2_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExpUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4448);
            	    lv_exp_2_0=ruleUnaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_2_0, 
            	            		"UnaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2142:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2143:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2144:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4486);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression4496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2151:1: ruleUnaryExpression returns [EObject current=null] : ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        Token lv_op_0_5=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2154:28: ( ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2155:1: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2155:1: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2155:2: ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )? ( (lv_exp_1_0= rulePrimaryExpression ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2155:2: ( ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=43 && LA42_0<=44)||(LA42_0>=47 && LA42_0<=49)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2156:1: ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2156:1: ( (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2157:1: (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2157:1: (lv_op_0_1= '!' | lv_op_0_2= '-' | lv_op_0_3= '+' | lv_op_0_4= '$' | lv_op_0_5= '~' )
                    int alt41=5;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt41=1;
                        }
                        break;
                    case 44:
                        {
                        alt41=2;
                        }
                        break;
                    case 43:
                        {
                        alt41=3;
                        }
                        break;
                    case 48:
                        {
                        alt41=4;
                        }
                        break;
                    case 49:
                        {
                        alt41=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2158:3: lv_op_0_1= '!'
                            {
                            lv_op_0_1=(Token)match(input,47,FOLLOW_47_in_ruleUnaryExpression4541); 

                                    newLeafNode(lv_op_0_1, grammarAccess.getUnaryExpressionAccess().getOpExclamationMarkKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2170:8: lv_op_0_2= '-'
                            {
                            lv_op_0_2=(Token)match(input,44,FOLLOW_44_in_ruleUnaryExpression4570); 

                                    newLeafNode(lv_op_0_2, grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2182:8: lv_op_0_3= '+'
                            {
                            lv_op_0_3=(Token)match(input,43,FOLLOW_43_in_ruleUnaryExpression4599); 

                                    newLeafNode(lv_op_0_3, grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2194:8: lv_op_0_4= '$'
                            {
                            lv_op_0_4=(Token)match(input,48,FOLLOW_48_in_ruleUnaryExpression4628); 

                                    newLeafNode(lv_op_0_4, grammarAccess.getUnaryExpressionAccess().getOpDollarSignKeyword_0_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2206:8: lv_op_0_5= '~'
                            {
                            lv_op_0_5=(Token)match(input,49,FOLLOW_49_in_ruleUnaryExpression4657); 

                                    newLeafNode(lv_op_0_5, grammarAccess.getUnaryExpressionAccess().getOpTildeKeyword_0_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_5, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2221:3: ( (lv_exp_1_0= rulePrimaryExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2222:1: (lv_exp_1_0= rulePrimaryExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2222:1: (lv_exp_1_0= rulePrimaryExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2223:3: lv_exp_1_0= rulePrimaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpPrimaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression4695);
            lv_exp_1_0=rulePrimaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"PrimaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2247:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2248:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2249:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4731);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2256:1: rulePrimaryExpression returns [EObject current=null] : ( (lv_prefix_0_0= ruleValueSpecification ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_prefix_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2259:28: ( ( (lv_prefix_0_0= ruleValueSpecification ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2260:1: ( (lv_prefix_0_0= ruleValueSpecification ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2260:1: ( (lv_prefix_0_0= ruleValueSpecification ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2261:1: (lv_prefix_0_0= ruleValueSpecification )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2261:1: (lv_prefix_0_0= ruleValueSpecification )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2262:3: lv_prefix_0_0= ruleValueSpecification
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrefixValueSpecificationParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePrimaryExpression4786);
            lv_prefix_0_0=ruleValueSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"prefix",
                    		lv_prefix_0_0, 
                    		"ValueSpecification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSuffixExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2286:1: entryRuleSuffixExpression returns [EObject current=null] : iv_ruleSuffixExpression= ruleSuffixExpression EOF ;
    public final EObject entryRuleSuffixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuffixExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2287:2: (iv_ruleSuffixExpression= ruleSuffixExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2288:2: iv_ruleSuffixExpression= ruleSuffixExpression EOF
            {
             newCompositeNode(grammarAccess.getSuffixExpressionRule()); 
            pushFollow(FOLLOW_ruleSuffixExpression_in_entryRuleSuffixExpression4821);
            iv_ruleSuffixExpression=ruleSuffixExpression();

            state._fsp--;

             current =iv_ruleSuffixExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuffixExpression4831); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuffixExpression"


    // $ANTLR start "ruleSuffixExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2295:1: ruleSuffixExpression returns [EObject current=null] : (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression ) ;
    public final EObject ruleSuffixExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OperationCallExpression_0 = null;

        EObject this_PropertyCallExpression_1 = null;

        EObject this_LinkOperationExpression_2 = null;

        EObject this_SequenceOperationExpression_3 = null;

        EObject this_SequenceReductionExpression_4 = null;

        EObject this_SequenceExpansionExpression_5 = null;

        EObject this_ClassExtentExpression_6 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2298:28: ( (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2299:1: (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2299:1: (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression )
            int alt43=7;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2300:5: this_OperationCallExpression_0= ruleOperationCallExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getOperationCallExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOperationCallExpression_in_ruleSuffixExpression4878);
                    this_OperationCallExpression_0=ruleOperationCallExpression();

                    state._fsp--;

                     
                            current = this_OperationCallExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2310:5: this_PropertyCallExpression_1= rulePropertyCallExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getPropertyCallExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyCallExpression_in_ruleSuffixExpression4905);
                    this_PropertyCallExpression_1=rulePropertyCallExpression();

                    state._fsp--;

                     
                            current = this_PropertyCallExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2320:5: this_LinkOperationExpression_2= ruleLinkOperationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getLinkOperationExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLinkOperationExpression_in_ruleSuffixExpression4932);
                    this_LinkOperationExpression_2=ruleLinkOperationExpression();

                    state._fsp--;

                     
                            current = this_LinkOperationExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2330:5: this_SequenceOperationExpression_3= ruleSequenceOperationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getSequenceOperationExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSequenceOperationExpression_in_ruleSuffixExpression4959);
                    this_SequenceOperationExpression_3=ruleSequenceOperationExpression();

                    state._fsp--;

                     
                            current = this_SequenceOperationExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2340:5: this_SequenceReductionExpression_4= ruleSequenceReductionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getSequenceReductionExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSequenceReductionExpression_in_ruleSuffixExpression4986);
                    this_SequenceReductionExpression_4=ruleSequenceReductionExpression();

                    state._fsp--;

                     
                            current = this_SequenceReductionExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2350:5: this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getSequenceExpansionExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSequenceExpansionExpression_in_ruleSuffixExpression5013);
                    this_SequenceExpansionExpression_5=ruleSequenceExpansionExpression();

                    state._fsp--;

                     
                            current = this_SequenceExpansionExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2360:5: this_ClassExtentExpression_6= ruleClassExtentExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSuffixExpressionAccess().getClassExtentExpressionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleClassExtentExpression_in_ruleSuffixExpression5040);
                    this_ClassExtentExpression_6=ruleClassExtentExpression();

                    state._fsp--;

                     
                            current = this_ClassExtentExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuffixExpression"


    // $ANTLR start "entryRuleOperationCallExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2376:1: entryRuleOperationCallExpression returns [EObject current=null] : iv_ruleOperationCallExpression= ruleOperationCallExpression EOF ;
    public final EObject entryRuleOperationCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2377:2: (iv_ruleOperationCallExpression= ruleOperationCallExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2378:2: iv_ruleOperationCallExpression= ruleOperationCallExpression EOF
            {
             newCompositeNode(grammarAccess.getOperationCallExpressionRule()); 
            pushFollow(FOLLOW_ruleOperationCallExpression_in_entryRuleOperationCallExpression5075);
            iv_ruleOperationCallExpression=ruleOperationCallExpression();

            state._fsp--;

             current =iv_ruleOperationCallExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallExpression5085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCallExpression"


    // $ANTLR start "ruleOperationCallExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2385:1: ruleOperationCallExpression returns [EObject current=null] : (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleOperationCallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operationName_1_0=null;
        EObject lv_tuple_2_0 = null;

        EObject lv_suffix_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2388:28: ( (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2389:1: (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2389:1: (otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2389:3: otherlv_0= '.' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleOperationCallExpression5122); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationCallExpressionAccess().getFullStopKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2393:1: ( (lv_operationName_1_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2394:1: (lv_operationName_1_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2394:1: (lv_operationName_1_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2395:3: lv_operationName_1_0= RULE_ID
            {
            lv_operationName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationCallExpression5139); 

            			newLeafNode(lv_operationName_1_0, grammarAccess.getOperationCallExpressionAccess().getOperationNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationCallExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operationName",
                    		lv_operationName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2411:2: ( (lv_tuple_2_0= ruleTuple ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2412:1: (lv_tuple_2_0= ruleTuple )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2412:1: (lv_tuple_2_0= ruleTuple )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2413:3: lv_tuple_2_0= ruleTuple
            {
             
            	        newCompositeNode(grammarAccess.getOperationCallExpressionAccess().getTupleTupleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTuple_in_ruleOperationCallExpression5165);
            lv_tuple_2_0=ruleTuple();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationCallExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"tuple",
                    		lv_tuple_2_0, 
                    		"Tuple");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2429:2: ( (lv_suffix_3_0= ruleSuffixExpression ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50||LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2430:1: (lv_suffix_3_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2430:1: (lv_suffix_3_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2431:3: lv_suffix_3_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationCallExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleOperationCallExpression5186);
                    lv_suffix_3_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationCallExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_3_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationCallExpression"


    // $ANTLR start "entryRuleOperationCallExpressionWithoutDot"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2455:1: entryRuleOperationCallExpressionWithoutDot returns [EObject current=null] : iv_ruleOperationCallExpressionWithoutDot= ruleOperationCallExpressionWithoutDot EOF ;
    public final EObject entryRuleOperationCallExpressionWithoutDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallExpressionWithoutDot = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2456:2: (iv_ruleOperationCallExpressionWithoutDot= ruleOperationCallExpressionWithoutDot EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2457:2: iv_ruleOperationCallExpressionWithoutDot= ruleOperationCallExpressionWithoutDot EOF
            {
             newCompositeNode(grammarAccess.getOperationCallExpressionWithoutDotRule()); 
            pushFollow(FOLLOW_ruleOperationCallExpressionWithoutDot_in_entryRuleOperationCallExpressionWithoutDot5223);
            iv_ruleOperationCallExpressionWithoutDot=ruleOperationCallExpressionWithoutDot();

            state._fsp--;

             current =iv_ruleOperationCallExpressionWithoutDot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationCallExpressionWithoutDot5233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCallExpressionWithoutDot"


    // $ANTLR start "ruleOperationCallExpressionWithoutDot"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2464:1: ruleOperationCallExpressionWithoutDot returns [EObject current=null] : ( ( (lv_operationName_0_0= RULE_ID ) ) ( (lv_tuple_1_0= ruleTuple ) ) ( (lv_suffix_2_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleOperationCallExpressionWithoutDot() throws RecognitionException {
        EObject current = null;

        Token lv_operationName_0_0=null;
        EObject lv_tuple_1_0 = null;

        EObject lv_suffix_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2467:28: ( ( ( (lv_operationName_0_0= RULE_ID ) ) ( (lv_tuple_1_0= ruleTuple ) ) ( (lv_suffix_2_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2468:1: ( ( (lv_operationName_0_0= RULE_ID ) ) ( (lv_tuple_1_0= ruleTuple ) ) ( (lv_suffix_2_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2468:1: ( ( (lv_operationName_0_0= RULE_ID ) ) ( (lv_tuple_1_0= ruleTuple ) ) ( (lv_suffix_2_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2468:2: ( (lv_operationName_0_0= RULE_ID ) ) ( (lv_tuple_1_0= ruleTuple ) ) ( (lv_suffix_2_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2468:2: ( (lv_operationName_0_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2469:1: (lv_operationName_0_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2469:1: (lv_operationName_0_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2470:3: lv_operationName_0_0= RULE_ID
            {
            lv_operationName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationCallExpressionWithoutDot5275); 

            			newLeafNode(lv_operationName_0_0, grammarAccess.getOperationCallExpressionWithoutDotAccess().getOperationNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationCallExpressionWithoutDotRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operationName",
                    		lv_operationName_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2486:2: ( (lv_tuple_1_0= ruleTuple ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2487:1: (lv_tuple_1_0= ruleTuple )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2487:1: (lv_tuple_1_0= ruleTuple )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2488:3: lv_tuple_1_0= ruleTuple
            {
             
            	        newCompositeNode(grammarAccess.getOperationCallExpressionWithoutDotAccess().getTupleTupleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTuple_in_ruleOperationCallExpressionWithoutDot5301);
            lv_tuple_1_0=ruleTuple();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationCallExpressionWithoutDotRule());
            	        }
                   		set(
                   			current, 
                   			"tuple",
                    		lv_tuple_1_0, 
                    		"Tuple");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2504:2: ( (lv_suffix_2_0= ruleSuffixExpression ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50||LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2505:1: (lv_suffix_2_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2505:1: (lv_suffix_2_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2506:3: lv_suffix_2_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationCallExpressionWithoutDotAccess().getSuffixSuffixExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleOperationCallExpressionWithoutDot5322);
                    lv_suffix_2_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationCallExpressionWithoutDotRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_2_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationCallExpressionWithoutDot"


    // $ANTLR start "entryRulePropertyCallExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2530:1: entryRulePropertyCallExpression returns [EObject current=null] : iv_rulePropertyCallExpression= rulePropertyCallExpression EOF ;
    public final EObject entryRulePropertyCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCallExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2531:2: (iv_rulePropertyCallExpression= rulePropertyCallExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2532:2: iv_rulePropertyCallExpression= rulePropertyCallExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyCallExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyCallExpression_in_entryRulePropertyCallExpression5359);
            iv_rulePropertyCallExpression=rulePropertyCallExpression();

            state._fsp--;

             current =iv_rulePropertyCallExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCallExpression5369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyCallExpression"


    // $ANTLR start "rulePropertyCallExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2539:1: rulePropertyCallExpression returns [EObject current=null] : (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? ) ;
    public final EObject rulePropertyCallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertyName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_index_3_0 = null;

        EObject lv_suffix_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2542:28: ( (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2543:1: (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2543:1: (otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2543:3: otherlv_0= '.' ( (lv_propertyName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ( (lv_suffix_5_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_rulePropertyCallExpression5406); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyCallExpressionAccess().getFullStopKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2547:1: ( (lv_propertyName_1_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2548:1: (lv_propertyName_1_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2548:1: (lv_propertyName_1_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2549:3: lv_propertyName_1_0= RULE_ID
            {
            lv_propertyName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyCallExpression5423); 

            			newLeafNode(lv_propertyName_1_0, grammarAccess.getPropertyCallExpressionAccess().getPropertyNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyCallExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2565:2: (otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>=RULE_ID && LA46_1<=RULE_STRING)||(LA46_1>=17 && LA46_1<=19)||LA46_1==25||(LA46_1>=43 && LA46_1<=44)||(LA46_1>=47 && LA46_1<=49)||(LA46_1>=57 && LA46_1<=60)||(LA46_1>=86 && LA46_1<=87)) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2565:4: otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_rulePropertyCallExpression5441); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyCallExpressionAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2569:1: ( (lv_index_3_0= ruleExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2570:1: (lv_index_3_0= ruleExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2570:1: (lv_index_3_0= ruleExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2571:3: lv_index_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyCallExpressionAccess().getIndexExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_rulePropertyCallExpression5462);
                    lv_index_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyCallExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"index",
                            		lv_index_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_52_in_rulePropertyCallExpression5474); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyCallExpressionAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2591:3: ( (lv_suffix_5_0= ruleSuffixExpression ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50||LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2592:1: (lv_suffix_5_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2592:1: (lv_suffix_5_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2593:3: lv_suffix_5_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyCallExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_rulePropertyCallExpression5497);
                    lv_suffix_5_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyCallExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_5_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyCallExpression"


    // $ANTLR start "entryRuleLinkOperationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2617:1: entryRuleLinkOperationExpression returns [EObject current=null] : iv_ruleLinkOperationExpression= ruleLinkOperationExpression EOF ;
    public final EObject entryRuleLinkOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkOperationExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2618:2: (iv_ruleLinkOperationExpression= ruleLinkOperationExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2619:2: iv_ruleLinkOperationExpression= ruleLinkOperationExpression EOF
            {
             newCompositeNode(grammarAccess.getLinkOperationExpressionRule()); 
            pushFollow(FOLLOW_ruleLinkOperationExpression_in_entryRuleLinkOperationExpression5534);
            iv_ruleLinkOperationExpression=ruleLinkOperationExpression();

            state._fsp--;

             current =iv_ruleLinkOperationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkOperationExpression5544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkOperationExpression"


    // $ANTLR start "ruleLinkOperationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2626:1: ruleLinkOperationExpression returns [EObject current=null] : (otherlv_0= '.' ( (lv_kind_1_0= ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) ) ;
    public final EObject ruleLinkOperationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_tuple_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2629:28: ( (otherlv_0= '.' ( (lv_kind_1_0= ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2630:1: (otherlv_0= '.' ( (lv_kind_1_0= ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2630:1: (otherlv_0= '.' ( (lv_kind_1_0= ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2630:3: otherlv_0= '.' ( (lv_kind_1_0= ruleLinkOperationKind ) ) ( (lv_tuple_2_0= ruleLinkOperationTuple ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleLinkOperationExpression5581); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkOperationExpressionAccess().getFullStopKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2634:1: ( (lv_kind_1_0= ruleLinkOperationKind ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2635:1: (lv_kind_1_0= ruleLinkOperationKind )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2635:1: (lv_kind_1_0= ruleLinkOperationKind )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2636:3: lv_kind_1_0= ruleLinkOperationKind
            {
             
            	        newCompositeNode(grammarAccess.getLinkOperationExpressionAccess().getKindLinkOperationKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkOperationKind_in_ruleLinkOperationExpression5602);
            lv_kind_1_0=ruleLinkOperationKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkOperationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_1_0, 
                    		"LinkOperationKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2652:2: ( (lv_tuple_2_0= ruleLinkOperationTuple ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2653:1: (lv_tuple_2_0= ruleLinkOperationTuple )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2653:1: (lv_tuple_2_0= ruleLinkOperationTuple )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2654:3: lv_tuple_2_0= ruleLinkOperationTuple
            {
             
            	        newCompositeNode(grammarAccess.getLinkOperationExpressionAccess().getTupleLinkOperationTupleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkOperationTuple_in_ruleLinkOperationExpression5623);
            lv_tuple_2_0=ruleLinkOperationTuple();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkOperationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"tuple",
                    		lv_tuple_2_0, 
                    		"LinkOperationTuple");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkOperationExpression"


    // $ANTLR start "entryRuleLinkOperationTuple"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2678:1: entryRuleLinkOperationTuple returns [EObject current=null] : iv_ruleLinkOperationTuple= ruleLinkOperationTuple EOF ;
    public final EObject entryRuleLinkOperationTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkOperationTuple = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2679:2: (iv_ruleLinkOperationTuple= ruleLinkOperationTuple EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2680:2: iv_ruleLinkOperationTuple= ruleLinkOperationTuple EOF
            {
             newCompositeNode(grammarAccess.getLinkOperationTupleRule()); 
            pushFollow(FOLLOW_ruleLinkOperationTuple_in_entryRuleLinkOperationTuple5659);
            iv_ruleLinkOperationTuple=ruleLinkOperationTuple();

            state._fsp--;

             current =iv_ruleLinkOperationTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkOperationTuple5669); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkOperationTuple"


    // $ANTLR start "ruleLinkOperationTuple"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2687:1: ruleLinkOperationTuple returns [EObject current=null] : (otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleLinkOperationTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linkOperationTupleElement_1_0 = null;

        EObject lv_linkOperationTupleElement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2690:28: ( (otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2691:1: (otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2691:1: (otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2691:3: otherlv_0= '(' ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) ) (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleLinkOperationTuple5706); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkOperationTupleAccess().getLeftParenthesisKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2695:1: ( (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2696:1: (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2696:1: (lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2697:3: lv_linkOperationTupleElement_1_0= ruleLinkOperationTupleElement
            {
             
            	        newCompositeNode(grammarAccess.getLinkOperationTupleAccess().getLinkOperationTupleElementLinkOperationTupleElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5727);
            lv_linkOperationTupleElement_1_0=ruleLinkOperationTupleElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkOperationTupleRule());
            	        }
                   		add(
                   			current, 
                   			"linkOperationTupleElement",
                    		lv_linkOperationTupleElement_1_0, 
                    		"LinkOperationTupleElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2713:2: (otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==22) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2713:4: otherlv_2= ',' ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleLinkOperationTuple5740); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLinkOperationTupleAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2717:1: ( (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2718:1: (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2718:1: (lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2719:3: lv_linkOperationTupleElement_3_0= ruleLinkOperationTupleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkOperationTupleAccess().getLinkOperationTupleElementLinkOperationTupleElementParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5761);
            	    lv_linkOperationTupleElement_3_0=ruleLinkOperationTupleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkOperationTupleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"linkOperationTupleElement",
            	            		lv_linkOperationTupleElement_3_0, 
            	            		"LinkOperationTupleElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleLinkOperationTuple5775); 

                	newLeafNode(otherlv_4, grammarAccess.getLinkOperationTupleAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkOperationTuple"


    // $ANTLR start "entryRuleLinkOperationTupleElement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2747:1: entryRuleLinkOperationTupleElement returns [EObject current=null] : iv_ruleLinkOperationTupleElement= ruleLinkOperationTupleElement EOF ;
    public final EObject entryRuleLinkOperationTupleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkOperationTupleElement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2748:2: (iv_ruleLinkOperationTupleElement= ruleLinkOperationTupleElement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2749:2: iv_ruleLinkOperationTupleElement= ruleLinkOperationTupleElement EOF
            {
             newCompositeNode(grammarAccess.getLinkOperationTupleElementRule()); 
            pushFollow(FOLLOW_ruleLinkOperationTupleElement_in_entryRuleLinkOperationTupleElement5811);
            iv_ruleLinkOperationTupleElement=ruleLinkOperationTupleElement();

            state._fsp--;

             current =iv_ruleLinkOperationTupleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkOperationTupleElement5821); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkOperationTupleElement"


    // $ANTLR start "ruleLinkOperationTupleElement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2756:1: ruleLinkOperationTupleElement returns [EObject current=null] : ( ( (lv_objectOrRole_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleLinkOperationTupleElement() throws RecognitionException {
        EObject current = null;

        Token lv_objectOrRole_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_object_5_0=null;
        EObject lv_roleIndex_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2759:28: ( ( ( (lv_objectOrRole_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2760:1: ( ( (lv_objectOrRole_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2760:1: ( ( (lv_objectOrRole_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2760:2: ( (lv_objectOrRole_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2760:2: ( (lv_objectOrRole_0_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2761:1: (lv_objectOrRole_0_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2761:1: (lv_objectOrRole_0_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2762:3: lv_objectOrRole_0_0= RULE_ID
            {
            lv_objectOrRole_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkOperationTupleElement5863); 

            			newLeafNode(lv_objectOrRole_0_0, grammarAccess.getLinkOperationTupleElementAccess().getObjectOrRoleIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkOperationTupleElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"objectOrRole",
                    		lv_objectOrRole_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2778:2: ( (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24||LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2778:3: (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (lv_object_5_0= RULE_ID ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2778:3: (otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==51) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2778:5: otherlv_1= '[' ( (lv_roleIndex_2_0= ruleExpression ) ) otherlv_3= ']'
                            {
                            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleLinkOperationTupleElement5882); 

                                	newLeafNode(otherlv_1, grammarAccess.getLinkOperationTupleElementAccess().getLeftSquareBracketKeyword_1_0_0());
                                
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2782:1: ( (lv_roleIndex_2_0= ruleExpression ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2783:1: (lv_roleIndex_2_0= ruleExpression )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2783:1: (lv_roleIndex_2_0= ruleExpression )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2784:3: lv_roleIndex_2_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getLinkOperationTupleElementAccess().getRoleIndexExpressionParserRuleCall_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleLinkOperationTupleElement5903);
                            lv_roleIndex_2_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLinkOperationTupleElementRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"roleIndex",
                                    		lv_roleIndex_2_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleLinkOperationTupleElement5915); 

                                	newLeafNode(otherlv_3, grammarAccess.getLinkOperationTupleElementAccess().getRightSquareBracketKeyword_1_0_2());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleLinkOperationTupleElement5929); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkOperationTupleElementAccess().getEqualsSignGreaterThanSignKeyword_1_1());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2808:1: ( (lv_object_5_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2809:1: (lv_object_5_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2809:1: (lv_object_5_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2810:3: lv_object_5_0= RULE_ID
                    {
                    lv_object_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkOperationTupleElement5946); 

                    			newLeafNode(lv_object_5_0, grammarAccess.getLinkOperationTupleElementAccess().getObjectIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkOperationTupleElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"object",
                            		lv_object_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkOperationTupleElement"


    // $ANTLR start "entryRuleSequenceOperationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2834:1: entryRuleSequenceOperationExpression returns [EObject current=null] : iv_ruleSequenceOperationExpression= ruleSequenceOperationExpression EOF ;
    public final EObject entryRuleSequenceOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOperationExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2835:2: (iv_ruleSequenceOperationExpression= ruleSequenceOperationExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2836:2: iv_ruleSequenceOperationExpression= ruleSequenceOperationExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceOperationExpressionRule()); 
            pushFollow(FOLLOW_ruleSequenceOperationExpression_in_entryRuleSequenceOperationExpression5989);
            iv_ruleSequenceOperationExpression=ruleSequenceOperationExpression();

            state._fsp--;

             current =iv_ruleSequenceOperationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceOperationExpression5999); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceOperationExpression"


    // $ANTLR start "ruleSequenceOperationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2843:1: ruleSequenceOperationExpression returns [EObject current=null] : (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleSequenceOperationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operationName_1_0=null;
        EObject lv_tuple_2_0 = null;

        EObject lv_suffix_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2846:28: ( (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2847:1: (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2847:1: (otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2847:3: otherlv_0= '->' ( (lv_operationName_1_0= RULE_ID ) ) ( (lv_tuple_2_0= ruleTuple ) ) ( (lv_suffix_3_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleSequenceOperationExpression6036); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceOperationExpressionAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2851:1: ( (lv_operationName_1_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2852:1: (lv_operationName_1_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2852:1: (lv_operationName_1_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2853:3: lv_operationName_1_0= RULE_ID
            {
            lv_operationName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequenceOperationExpression6053); 

            			newLeafNode(lv_operationName_1_0, grammarAccess.getSequenceOperationExpressionAccess().getOperationNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceOperationExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operationName",
                    		lv_operationName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2869:2: ( (lv_tuple_2_0= ruleTuple ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2870:1: (lv_tuple_2_0= ruleTuple )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2870:1: (lv_tuple_2_0= ruleTuple )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2871:3: lv_tuple_2_0= ruleTuple
            {
             
            	        newCompositeNode(grammarAccess.getSequenceOperationExpressionAccess().getTupleTupleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTuple_in_ruleSequenceOperationExpression6079);
            lv_tuple_2_0=ruleTuple();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceOperationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"tuple",
                    		lv_tuple_2_0, 
                    		"Tuple");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2887:2: ( (lv_suffix_3_0= ruleSuffixExpression ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50||LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2888:1: (lv_suffix_3_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2888:1: (lv_suffix_3_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2889:3: lv_suffix_3_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceOperationExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSequenceOperationExpression6100);
                    lv_suffix_3_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceOperationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_3_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceOperationExpression"


    // $ANTLR start "entryRuleSequenceReductionExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2913:1: entryRuleSequenceReductionExpression returns [EObject current=null] : iv_ruleSequenceReductionExpression= ruleSequenceReductionExpression EOF ;
    public final EObject entryRuleSequenceReductionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceReductionExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2914:2: (iv_ruleSequenceReductionExpression= ruleSequenceReductionExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2915:2: iv_ruleSequenceReductionExpression= ruleSequenceReductionExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceReductionExpressionRule()); 
            pushFollow(FOLLOW_ruleSequenceReductionExpression_in_entryRuleSequenceReductionExpression6137);
            iv_ruleSequenceReductionExpression=ruleSequenceReductionExpression();

            state._fsp--;

             current =iv_ruleSequenceReductionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceReductionExpression6147); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceReductionExpression"


    // $ANTLR start "ruleSequenceReductionExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2922:1: ruleSequenceReductionExpression returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'reduce' ( (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleSequenceReductionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isOrdered_2_0=null;
        EObject lv_behavior_3_0 = null;

        EObject lv_suffix_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2925:28: ( (otherlv_0= '->' otherlv_1= 'reduce' ( (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2926:1: (otherlv_0= '->' otherlv_1= 'reduce' ( (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2926:1: (otherlv_0= '->' otherlv_1= 'reduce' ( (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2926:3: otherlv_0= '->' otherlv_1= 'reduce' ( (lv_isOrdered_2_0= 'ordered' ) )? ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleSequenceReductionExpression6184); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceReductionExpressionAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleSequenceReductionExpression6196); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceReductionExpressionAccess().getReduceKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2934:1: ( (lv_isOrdered_2_0= 'ordered' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2935:1: (lv_isOrdered_2_0= 'ordered' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2935:1: (lv_isOrdered_2_0= 'ordered' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2936:3: lv_isOrdered_2_0= 'ordered'
                    {
                    lv_isOrdered_2_0=(Token)match(input,55,FOLLOW_55_in_ruleSequenceReductionExpression6214); 

                            newLeafNode(lv_isOrdered_2_0, grammarAccess.getSequenceReductionExpressionAccess().getIsOrderedOrderedKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequenceReductionExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isOrdered", true, "ordered");
                    	    

                    }


                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2949:3: ( (lv_behavior_3_0= ruleQualifiedNameWithBinding ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2950:1: (lv_behavior_3_0= ruleQualifiedNameWithBinding )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2950:1: (lv_behavior_3_0= ruleQualifiedNameWithBinding )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2951:3: lv_behavior_3_0= ruleQualifiedNameWithBinding
            {
             
            	        newCompositeNode(grammarAccess.getSequenceReductionExpressionAccess().getBehaviorQualifiedNameWithBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleSequenceReductionExpression6249);
            lv_behavior_3_0=ruleQualifiedNameWithBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceReductionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"behavior",
                    		lv_behavior_3_0, 
                    		"QualifiedNameWithBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2967:2: ( (lv_suffix_4_0= ruleSuffixExpression ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50||LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2968:1: (lv_suffix_4_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2968:1: (lv_suffix_4_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2969:3: lv_suffix_4_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceReductionExpressionAccess().getSuffixSuffixExpressionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSequenceReductionExpression6270);
                    lv_suffix_4_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceReductionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_4_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceReductionExpression"


    // $ANTLR start "entryRuleSequenceExpansionExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2993:1: entryRuleSequenceExpansionExpression returns [EObject current=null] : iv_ruleSequenceExpansionExpression= ruleSequenceExpansionExpression EOF ;
    public final EObject entryRuleSequenceExpansionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpansionExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2994:2: (iv_ruleSequenceExpansionExpression= ruleSequenceExpansionExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:2995:2: iv_ruleSequenceExpansionExpression= ruleSequenceExpansionExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceExpansionExpressionRule()); 
            pushFollow(FOLLOW_ruleSequenceExpansionExpression_in_entryRuleSequenceExpansionExpression6307);
            iv_ruleSequenceExpansionExpression=ruleSequenceExpansionExpression();

            state._fsp--;

             current =iv_ruleSequenceExpansionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceExpansionExpression6317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceExpansionExpression"


    // $ANTLR start "ruleSequenceExpansionExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3002:1: ruleSequenceExpansionExpression returns [EObject current=null] : (this_SelectOrRejectOperation_0= ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation ) ;
    public final EObject ruleSequenceExpansionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SelectOrRejectOperation_0 = null;

        EObject this_CollectOrIterateOperation_1 = null;

        EObject this_ForAllOrExistsOrOneOperation_2 = null;

        EObject this_IsUniqueOperation_3 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3005:28: ( (this_SelectOrRejectOperation_0= ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3006:1: (this_SelectOrRejectOperation_0= ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3006:1: (this_SelectOrRejectOperation_0= ruleSelectOrRejectOperation | this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation | this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation | this_IsUniqueOperation_3= ruleIsUniqueOperation )
            int alt54=4;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                switch ( input.LA(2) ) {
                case 91:
                case 92:
                    {
                    alt54=1;
                    }
                    break;
                case 95:
                case 96:
                case 97:
                    {
                    alt54=3;
                    }
                    break;
                case 56:
                    {
                    alt54=4;
                    }
                    break;
                case 93:
                case 94:
                    {
                    alt54=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3007:5: this_SelectOrRejectOperation_0= ruleSelectOrRejectOperation
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getSelectOrRejectOperationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectOrRejectOperation_in_ruleSequenceExpansionExpression6364);
                    this_SelectOrRejectOperation_0=ruleSelectOrRejectOperation();

                    state._fsp--;

                     
                            current = this_SelectOrRejectOperation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3017:5: this_CollectOrIterateOperation_1= ruleCollectOrIterateOperation
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getCollectOrIterateOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCollectOrIterateOperation_in_ruleSequenceExpansionExpression6391);
                    this_CollectOrIterateOperation_1=ruleCollectOrIterateOperation();

                    state._fsp--;

                     
                            current = this_CollectOrIterateOperation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3027:5: this_ForAllOrExistsOrOneOperation_2= ruleForAllOrExistsOrOneOperation
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getForAllOrExistsOrOneOperationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleForAllOrExistsOrOneOperation_in_ruleSequenceExpansionExpression6418);
                    this_ForAllOrExistsOrOneOperation_2=ruleForAllOrExistsOrOneOperation();

                    state._fsp--;

                     
                            current = this_ForAllOrExistsOrOneOperation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3037:5: this_IsUniqueOperation_3= ruleIsUniqueOperation
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceExpansionExpressionAccess().getIsUniqueOperationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIsUniqueOperation_in_ruleSequenceExpansionExpression6445);
                    this_IsUniqueOperation_3=ruleIsUniqueOperation();

                    state._fsp--;

                     
                            current = this_IsUniqueOperation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceExpansionExpression"


    // $ANTLR start "entryRuleSelectOrRejectOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3053:1: entryRuleSelectOrRejectOperation returns [EObject current=null] : iv_ruleSelectOrRejectOperation= ruleSelectOrRejectOperation EOF ;
    public final EObject entryRuleSelectOrRejectOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectOrRejectOperation = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3054:2: (iv_ruleSelectOrRejectOperation= ruleSelectOrRejectOperation EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3055:2: iv_ruleSelectOrRejectOperation= ruleSelectOrRejectOperation EOF
            {
             newCompositeNode(grammarAccess.getSelectOrRejectOperationRule()); 
            pushFollow(FOLLOW_ruleSelectOrRejectOperation_in_entryRuleSelectOrRejectOperation6480);
            iv_ruleSelectOrRejectOperation=ruleSelectOrRejectOperation();

            state._fsp--;

             current =iv_ruleSelectOrRejectOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectOrRejectOperation6490); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectOrRejectOperation"


    // $ANTLR start "ruleSelectOrRejectOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3062:1: ruleSelectOrRejectOperation returns [EObject current=null] : (otherlv_0= '->' ( (lv_op_1_0= ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleSelectOrRejectOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_op_1_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_suffix_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3065:28: ( (otherlv_0= '->' ( (lv_op_1_0= ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3066:1: (otherlv_0= '->' ( (lv_op_1_0= ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3066:1: (otherlv_0= '->' ( (lv_op_1_0= ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3066:3: otherlv_0= '->' ( (lv_op_1_0= ruleSelectOrRejectOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleSelectOrRejectOperation6527); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectOrRejectOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3070:1: ( (lv_op_1_0= ruleSelectOrRejectOperator ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3071:1: (lv_op_1_0= ruleSelectOrRejectOperator )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3071:1: (lv_op_1_0= ruleSelectOrRejectOperator )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3072:3: lv_op_1_0= ruleSelectOrRejectOperator
            {
             
            	        newCompositeNode(grammarAccess.getSelectOrRejectOperationAccess().getOpSelectOrRejectOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectOrRejectOperator_in_ruleSelectOrRejectOperation6548);
            lv_op_1_0=ruleSelectOrRejectOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectOrRejectOperationRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"SelectOrRejectOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3088:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3089:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3089:1: (lv_name_2_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3090:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectOrRejectOperation6565); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSelectOrRejectOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectOrRejectOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleSelectOrRejectOperation6582); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectOrRejectOperationAccess().getLeftParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3110:1: ( (lv_expr_4_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3111:1: (lv_expr_4_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3111:1: (lv_expr_4_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3112:3: lv_expr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectOrRejectOperationAccess().getExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSelectOrRejectOperation6603);
            lv_expr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectOrRejectOperationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleSelectOrRejectOperation6615); 

                	newLeafNode(otherlv_5, grammarAccess.getSelectOrRejectOperationAccess().getRightParenthesisKeyword_5());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3132:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50||LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3133:1: (lv_suffix_6_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3133:1: (lv_suffix_6_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3134:3: lv_suffix_6_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectOrRejectOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleSelectOrRejectOperation6636);
                    lv_suffix_6_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectOrRejectOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_6_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectOrRejectOperation"


    // $ANTLR start "entryRuleCollectOrIterateOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3158:1: entryRuleCollectOrIterateOperation returns [EObject current=null] : iv_ruleCollectOrIterateOperation= ruleCollectOrIterateOperation EOF ;
    public final EObject entryRuleCollectOrIterateOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectOrIterateOperation = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3159:2: (iv_ruleCollectOrIterateOperation= ruleCollectOrIterateOperation EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3160:2: iv_ruleCollectOrIterateOperation= ruleCollectOrIterateOperation EOF
            {
             newCompositeNode(grammarAccess.getCollectOrIterateOperationRule()); 
            pushFollow(FOLLOW_ruleCollectOrIterateOperation_in_entryRuleCollectOrIterateOperation6673);
            iv_ruleCollectOrIterateOperation=ruleCollectOrIterateOperation();

            state._fsp--;

             current =iv_ruleCollectOrIterateOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectOrIterateOperation6683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectOrIterateOperation"


    // $ANTLR start "ruleCollectOrIterateOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3167:1: ruleCollectOrIterateOperation returns [EObject current=null] : (otherlv_0= '->' ( (lv_op_1_0= ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleCollectOrIterateOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_op_1_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_suffix_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3170:28: ( (otherlv_0= '->' ( (lv_op_1_0= ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3171:1: (otherlv_0= '->' ( (lv_op_1_0= ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3171:1: (otherlv_0= '->' ( (lv_op_1_0= ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3171:3: otherlv_0= '->' ( (lv_op_1_0= ruleCollectOrIterateOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleCollectOrIterateOperation6720); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectOrIterateOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3175:1: ( (lv_op_1_0= ruleCollectOrIterateOperator ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3176:1: (lv_op_1_0= ruleCollectOrIterateOperator )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3176:1: (lv_op_1_0= ruleCollectOrIterateOperator )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3177:3: lv_op_1_0= ruleCollectOrIterateOperator
            {
             
            	        newCompositeNode(grammarAccess.getCollectOrIterateOperationAccess().getOpCollectOrIterateOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectOrIterateOperator_in_ruleCollectOrIterateOperation6741);
            lv_op_1_0=ruleCollectOrIterateOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectOrIterateOperationRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"CollectOrIterateOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3193:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3194:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3194:1: (lv_name_2_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3195:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectOrIterateOperation6758); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCollectOrIterateOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectOrIterateOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleCollectOrIterateOperation6775); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectOrIterateOperationAccess().getLeftParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3215:1: ( (lv_expr_4_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3216:1: (lv_expr_4_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3216:1: (lv_expr_4_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3217:3: lv_expr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectOrIterateOperationAccess().getExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCollectOrIterateOperation6796);
            lv_expr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectOrIterateOperationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleCollectOrIterateOperation6808); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectOrIterateOperationAccess().getRightParenthesisKeyword_5());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3237:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50||LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3238:1: (lv_suffix_6_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3238:1: (lv_suffix_6_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3239:3: lv_suffix_6_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCollectOrIterateOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleCollectOrIterateOperation6829);
                    lv_suffix_6_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCollectOrIterateOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_6_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectOrIterateOperation"


    // $ANTLR start "entryRuleForAllOrExistsOrOneOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3263:1: entryRuleForAllOrExistsOrOneOperation returns [EObject current=null] : iv_ruleForAllOrExistsOrOneOperation= ruleForAllOrExistsOrOneOperation EOF ;
    public final EObject entryRuleForAllOrExistsOrOneOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAllOrExistsOrOneOperation = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3264:2: (iv_ruleForAllOrExistsOrOneOperation= ruleForAllOrExistsOrOneOperation EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3265:2: iv_ruleForAllOrExistsOrOneOperation= ruleForAllOrExistsOrOneOperation EOF
            {
             newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationRule()); 
            pushFollow(FOLLOW_ruleForAllOrExistsOrOneOperation_in_entryRuleForAllOrExistsOrOneOperation6866);
            iv_ruleForAllOrExistsOrOneOperation=ruleForAllOrExistsOrOneOperation();

            state._fsp--;

             current =iv_ruleForAllOrExistsOrOneOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAllOrExistsOrOneOperation6876); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForAllOrExistsOrOneOperation"


    // $ANTLR start "ruleForAllOrExistsOrOneOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3272:1: ruleForAllOrExistsOrOneOperation returns [EObject current=null] : (otherlv_0= '->' ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleForAllOrExistsOrOneOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_op_1_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_suffix_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3275:28: ( (otherlv_0= '->' ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3276:1: (otherlv_0= '->' ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3276:1: (otherlv_0= '->' ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3276:3: otherlv_0= '->' ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleForAllOrExistsOrOneOperation6913); 

                	newLeafNode(otherlv_0, grammarAccess.getForAllOrExistsOrOneOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3280:1: ( (lv_op_1_0= ruleForAllOrExistsOrOneOperator ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3281:1: (lv_op_1_0= ruleForAllOrExistsOrOneOperator )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3281:1: (lv_op_1_0= ruleForAllOrExistsOrOneOperator )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3282:3: lv_op_1_0= ruleForAllOrExistsOrOneOperator
            {
             
            	        newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationAccess().getOpForAllOrExistsOrOneOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleForAllOrExistsOrOneOperator_in_ruleForAllOrExistsOrOneOperation6934);
            lv_op_1_0=ruleForAllOrExistsOrOneOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForAllOrExistsOrOneOperationRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"ForAllOrExistsOrOneOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3298:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3299:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3299:1: (lv_name_2_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3300:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForAllOrExistsOrOneOperation6951); 

            			newLeafNode(lv_name_2_0, grammarAccess.getForAllOrExistsOrOneOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForAllOrExistsOrOneOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleForAllOrExistsOrOneOperation6968); 

                	newLeafNode(otherlv_3, grammarAccess.getForAllOrExistsOrOneOperationAccess().getLeftParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3320:1: ( (lv_expr_4_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3321:1: (lv_expr_4_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3321:1: (lv_expr_4_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3322:3: lv_expr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationAccess().getExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleForAllOrExistsOrOneOperation6989);
            lv_expr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForAllOrExistsOrOneOperationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleForAllOrExistsOrOneOperation7001); 

                	newLeafNode(otherlv_5, grammarAccess.getForAllOrExistsOrOneOperationAccess().getRightParenthesisKeyword_5());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3342:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50||LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3343:1: (lv_suffix_6_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3343:1: (lv_suffix_6_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3344:3: lv_suffix_6_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getForAllOrExistsOrOneOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleForAllOrExistsOrOneOperation7022);
                    lv_suffix_6_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForAllOrExistsOrOneOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_6_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForAllOrExistsOrOneOperation"


    // $ANTLR start "entryRuleIsUniqueOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3368:1: entryRuleIsUniqueOperation returns [EObject current=null] : iv_ruleIsUniqueOperation= ruleIsUniqueOperation EOF ;
    public final EObject entryRuleIsUniqueOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsUniqueOperation = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3369:2: (iv_ruleIsUniqueOperation= ruleIsUniqueOperation EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3370:2: iv_ruleIsUniqueOperation= ruleIsUniqueOperation EOF
            {
             newCompositeNode(grammarAccess.getIsUniqueOperationRule()); 
            pushFollow(FOLLOW_ruleIsUniqueOperation_in_entryRuleIsUniqueOperation7059);
            iv_ruleIsUniqueOperation=ruleIsUniqueOperation();

            state._fsp--;

             current =iv_ruleIsUniqueOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsUniqueOperation7069); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsUniqueOperation"


    // $ANTLR start "ruleIsUniqueOperation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3377:1: ruleIsUniqueOperation returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'isUnique' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleIsUniqueOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_4_0 = null;

        EObject lv_suffix_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3380:28: ( (otherlv_0= '->' otherlv_1= 'isUnique' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3381:1: (otherlv_0= '->' otherlv_1= 'isUnique' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3381:1: (otherlv_0= '->' otherlv_1= 'isUnique' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3381:3: otherlv_0= '->' otherlv_1= 'isUnique' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleIsUniqueOperation7106); 

                	newLeafNode(otherlv_0, grammarAccess.getIsUniqueOperationAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleIsUniqueOperation7118); 

                	newLeafNode(otherlv_1, grammarAccess.getIsUniqueOperationAccess().getIsUniqueKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3389:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3390:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3390:1: (lv_name_2_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3391:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsUniqueOperation7135); 

            			newLeafNode(lv_name_2_0, grammarAccess.getIsUniqueOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsUniqueOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleIsUniqueOperation7152); 

                	newLeafNode(otherlv_3, grammarAccess.getIsUniqueOperationAccess().getLeftParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3411:1: ( (lv_expr_4_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3412:1: (lv_expr_4_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3412:1: (lv_expr_4_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3413:3: lv_expr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIsUniqueOperationAccess().getExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIsUniqueOperation7173);
            lv_expr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIsUniqueOperationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleIsUniqueOperation7185); 

                	newLeafNode(otherlv_5, grammarAccess.getIsUniqueOperationAccess().getRightParenthesisKeyword_5());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3433:1: ( (lv_suffix_6_0= ruleSuffixExpression ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50||LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3434:1: (lv_suffix_6_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3434:1: (lv_suffix_6_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3435:3: lv_suffix_6_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIsUniqueOperationAccess().getSuffixSuffixExpressionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleIsUniqueOperation7206);
                    lv_suffix_6_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIsUniqueOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_6_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsUniqueOperation"


    // $ANTLR start "entryRuleValueSpecification"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3459:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3460:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3461:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
             newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7243);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;

             current =iv_ruleValueSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification7253); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueSpecification"


    // $ANTLR start "ruleValueSpecification"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3468:1: ruleValueSpecification returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LITERAL_1 = null;

        EObject this_ThisExpression_2 = null;

        EObject this_SuperInvocationExpression_3 = null;

        EObject this_InstanceCreationExpression_4 = null;

        EObject this_ParenthesizedExpression_5 = null;

        EObject this_NullExpression_6 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3471:28: ( (this_NameExpression_0= ruleNameExpression | this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3472:1: (this_NameExpression_0= ruleNameExpression | this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3472:1: (this_NameExpression_0= ruleNameExpression | this_LITERAL_1= ruleLITERAL | this_ThisExpression_2= ruleThisExpression | this_SuperInvocationExpression_3= ruleSuperInvocationExpression | this_InstanceCreationExpression_4= ruleInstanceCreationExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_NullExpression_6= ruleNullExpression )
            int alt59=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 18:
            case 19:
                {
                alt59=1;
                }
                break;
            case RULE_INTEGERVALUE:
            case RULE_STRING:
            case 17:
            case 86:
            case 87:
                {
                alt59=2;
                }
                break;
            case 58:
                {
                alt59=3;
                }
                break;
            case 59:
                {
                alt59=4;
                }
                break;
            case 60:
                {
                alt59=5;
                }
                break;
            case 25:
                {
                alt59=6;
                }
                break;
            case 57:
                {
                alt59=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3473:5: this_NameExpression_0= ruleNameExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getNameExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNameExpression_in_ruleValueSpecification7300);
                    this_NameExpression_0=ruleNameExpression();

                    state._fsp--;

                     
                            current = this_NameExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3483:5: this_LITERAL_1= ruleLITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getLITERALParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLITERAL_in_ruleValueSpecification7327);
                    this_LITERAL_1=ruleLITERAL();

                    state._fsp--;

                     
                            current = this_LITERAL_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3493:5: this_ThisExpression_2= ruleThisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getThisExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleThisExpression_in_ruleValueSpecification7354);
                    this_ThisExpression_2=ruleThisExpression();

                    state._fsp--;

                     
                            current = this_ThisExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3503:5: this_SuperInvocationExpression_3= ruleSuperInvocationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getSuperInvocationExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSuperInvocationExpression_in_ruleValueSpecification7381);
                    this_SuperInvocationExpression_3=ruleSuperInvocationExpression();

                    state._fsp--;

                     
                            current = this_SuperInvocationExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3513:5: this_InstanceCreationExpression_4= ruleInstanceCreationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceCreationExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInstanceCreationExpression_in_ruleValueSpecification7408);
                    this_InstanceCreationExpression_4=ruleInstanceCreationExpression();

                    state._fsp--;

                     
                            current = this_InstanceCreationExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3523:5: this_ParenthesizedExpression_5= ruleParenthesizedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getParenthesizedExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleValueSpecification7435);
                    this_ParenthesizedExpression_5=ruleParenthesizedExpression();

                    state._fsp--;

                     
                            current = this_ParenthesizedExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3533:5: this_NullExpression_6= ruleNullExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getNullExpressionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValueSpecification7462);
                    this_NullExpression_6=ruleNullExpression();

                    state._fsp--;

                     
                            current = this_NullExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueSpecification"


    // $ANTLR start "entryRuleNonLiteralValueSpecification"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3549:1: entryRuleNonLiteralValueSpecification returns [EObject current=null] : iv_ruleNonLiteralValueSpecification= ruleNonLiteralValueSpecification EOF ;
    public final EObject entryRuleNonLiteralValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonLiteralValueSpecification = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3550:2: (iv_ruleNonLiteralValueSpecification= ruleNonLiteralValueSpecification EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3551:2: iv_ruleNonLiteralValueSpecification= ruleNonLiteralValueSpecification EOF
            {
             newCompositeNode(grammarAccess.getNonLiteralValueSpecificationRule()); 
            pushFollow(FOLLOW_ruleNonLiteralValueSpecification_in_entryRuleNonLiteralValueSpecification7497);
            iv_ruleNonLiteralValueSpecification=ruleNonLiteralValueSpecification();

            state._fsp--;

             current =iv_ruleNonLiteralValueSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonLiteralValueSpecification7507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonLiteralValueSpecification"


    // $ANTLR start "ruleNonLiteralValueSpecification"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3558:1: ruleNonLiteralValueSpecification returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression ) ;
    public final EObject ruleNonLiteralValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_ParenthesizedExpression_1 = null;

        EObject this_InstanceCreationExpression_2 = null;

        EObject this_ThisExpression_3 = null;

        EObject this_SuperInvocationExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3561:28: ( (this_NameExpression_0= ruleNameExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3562:1: (this_NameExpression_0= ruleNameExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3562:1: (this_NameExpression_0= ruleNameExpression | this_ParenthesizedExpression_1= ruleParenthesizedExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_ThisExpression_3= ruleThisExpression | this_SuperInvocationExpression_4= ruleSuperInvocationExpression )
            int alt60=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 18:
            case 19:
                {
                alt60=1;
                }
                break;
            case 25:
                {
                alt60=2;
                }
                break;
            case 60:
                {
                alt60=3;
                }
                break;
            case 58:
                {
                alt60=4;
                }
                break;
            case 59:
                {
                alt60=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3563:5: this_NameExpression_0= ruleNameExpression
                    {
                     
                            newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getNameExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNameExpression_in_ruleNonLiteralValueSpecification7554);
                    this_NameExpression_0=ruleNameExpression();

                    state._fsp--;

                     
                            current = this_NameExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3573:5: this_ParenthesizedExpression_1= ruleParenthesizedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getParenthesizedExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleNonLiteralValueSpecification7581);
                    this_ParenthesizedExpression_1=ruleParenthesizedExpression();

                    state._fsp--;

                     
                            current = this_ParenthesizedExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3583:5: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getInstanceCreationExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstanceCreationExpression_in_ruleNonLiteralValueSpecification7608);
                    this_InstanceCreationExpression_2=ruleInstanceCreationExpression();

                    state._fsp--;

                     
                            current = this_InstanceCreationExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3593:5: this_ThisExpression_3= ruleThisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getThisExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleThisExpression_in_ruleNonLiteralValueSpecification7635);
                    this_ThisExpression_3=ruleThisExpression();

                    state._fsp--;

                     
                            current = this_ThisExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3603:5: this_SuperInvocationExpression_4= ruleSuperInvocationExpression
                    {
                     
                            newCompositeNode(grammarAccess.getNonLiteralValueSpecificationAccess().getSuperInvocationExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSuperInvocationExpression_in_ruleNonLiteralValueSpecification7662);
                    this_SuperInvocationExpression_4=ruleSuperInvocationExpression();

                    state._fsp--;

                     
                            current = this_SuperInvocationExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonLiteralValueSpecification"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3619:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3620:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3621:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7697);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;

             current =iv_ruleParenthesizedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3628:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expOrTypeCast_1_0= ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expOrTypeCast_1_0 = null;

        EObject lv_casted_3_0 = null;

        EObject lv_suffix_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3631:28: ( (otherlv_0= '(' ( (lv_expOrTypeCast_1_0= ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3632:1: (otherlv_0= '(' ( (lv_expOrTypeCast_1_0= ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3632:1: (otherlv_0= '(' ( (lv_expOrTypeCast_1_0= ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3632:3: otherlv_0= '(' ( (lv_expOrTypeCast_1_0= ruleExpression ) ) otherlv_2= ')' ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleParenthesizedExpression7744); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3636:1: ( (lv_expOrTypeCast_1_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3637:1: (lv_expOrTypeCast_1_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3637:1: (lv_expOrTypeCast_1_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3638:3: lv_expOrTypeCast_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpOrTypeCastExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7765);
            lv_expOrTypeCast_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expOrTypeCast",
                    		lv_expOrTypeCast_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleParenthesizedExpression7777); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3658:1: ( ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) ) | ( (lv_suffix_4_0= ruleSuffixExpression ) ) )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||(LA61_0>=18 && LA61_0<=19)||LA61_0==25||(LA61_0>=58 && LA61_0<=60)) ) {
                alt61=1;
            }
            else if ( (LA61_0==50||LA61_0==53) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3658:2: ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3658:2: ( (lv_casted_3_0= ruleNonLiteralValueSpecification ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3659:1: (lv_casted_3_0= ruleNonLiteralValueSpecification )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3659:1: (lv_casted_3_0= ruleNonLiteralValueSpecification )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3660:3: lv_casted_3_0= ruleNonLiteralValueSpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getCastedNonLiteralValueSpecificationParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNonLiteralValueSpecification_in_ruleParenthesizedExpression7799);
                    lv_casted_3_0=ruleNonLiteralValueSpecification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"casted",
                            		lv_casted_3_0, 
                            		"NonLiteralValueSpecification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3677:6: ( (lv_suffix_4_0= ruleSuffixExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3677:6: ( (lv_suffix_4_0= ruleSuffixExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3678:1: (lv_suffix_4_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3678:1: (lv_suffix_4_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3679:3: lv_suffix_4_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleParenthesizedExpression7826);
                    lv_suffix_4_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_4_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3703:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3704:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3705:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression7864);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression7874); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3712:1: ruleNullExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3715:28: ( ( () otherlv_1= 'null' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3716:1: ( () otherlv_1= 'null' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3716:1: ( () otherlv_1= 'null' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3716:2: () otherlv_1= 'null'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3716:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3717:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleNullExpression7920); 

                	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleThisExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3734:1: entryRuleThisExpression returns [EObject current=null] : iv_ruleThisExpression= ruleThisExpression EOF ;
    public final EObject entryRuleThisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3735:2: (iv_ruleThisExpression= ruleThisExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3736:2: iv_ruleThisExpression= ruleThisExpression EOF
            {
             newCompositeNode(grammarAccess.getThisExpressionRule()); 
            pushFollow(FOLLOW_ruleThisExpression_in_entryRuleThisExpression7956);
            iv_ruleThisExpression=ruleThisExpression();

            state._fsp--;

             current =iv_ruleThisExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThisExpression7966); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThisExpression"


    // $ANTLR start "ruleThisExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3743:1: ruleThisExpression returns [EObject current=null] : ( () otherlv_1= 'this' ( (lv_suffix_2_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleThisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_suffix_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3746:28: ( ( () otherlv_1= 'this' ( (lv_suffix_2_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3747:1: ( () otherlv_1= 'this' ( (lv_suffix_2_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3747:1: ( () otherlv_1= 'this' ( (lv_suffix_2_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3747:2: () otherlv_1= 'this' ( (lv_suffix_2_0= ruleSuffixExpression ) )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3747:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3748:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getThisExpressionAccess().getThisExpressionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleThisExpression8012); 

                	newLeafNode(otherlv_1, grammarAccess.getThisExpressionAccess().getThisKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3757:1: ( (lv_suffix_2_0= ruleSuffixExpression ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50||LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3758:1: (lv_suffix_2_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3758:1: (lv_suffix_2_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3759:3: lv_suffix_2_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getThisExpressionAccess().getSuffixSuffixExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleThisExpression8033);
                    lv_suffix_2_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThisExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_2_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThisExpression"


    // $ANTLR start "entryRuleSuperInvocationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3783:1: entryRuleSuperInvocationExpression returns [EObject current=null] : iv_ruleSuperInvocationExpression= ruleSuperInvocationExpression EOF ;
    public final EObject entryRuleSuperInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperInvocationExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3784:2: (iv_ruleSuperInvocationExpression= ruleSuperInvocationExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3785:2: iv_ruleSuperInvocationExpression= ruleSuperInvocationExpression EOF
            {
             newCompositeNode(grammarAccess.getSuperInvocationExpressionRule()); 
            pushFollow(FOLLOW_ruleSuperInvocationExpression_in_entryRuleSuperInvocationExpression8070);
            iv_ruleSuperInvocationExpression=ruleSuperInvocationExpression();

            state._fsp--;

             current =iv_ruleSuperInvocationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperInvocationExpression8080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperInvocationExpression"


    // $ANTLR start "ruleSuperInvocationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3792:1: ruleSuperInvocationExpression returns [EObject current=null] : (otherlv_0= 'super' ( (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) ) | ( (lv_operationCall_5_0= ruleOperationCallExpression ) ) ) ) ;
    public final EObject ruleSuperInvocationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;
        EObject lv_operationCallWithoutDot_4_0 = null;

        EObject lv_operationCall_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3795:28: ( (otherlv_0= 'super' ( (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) ) | ( (lv_operationCall_5_0= ruleOperationCallExpression ) ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3796:1: (otherlv_0= 'super' ( (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) ) | ( (lv_operationCall_5_0= ruleOperationCallExpression ) ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3796:1: (otherlv_0= 'super' ( (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) ) | ( (lv_operationCall_5_0= ruleOperationCallExpression ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3796:3: otherlv_0= 'super' ( (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) ) | ( (lv_operationCall_5_0= ruleOperationCallExpression ) ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleSuperInvocationExpression8117); 

                	newLeafNode(otherlv_0, grammarAccess.getSuperInvocationExpressionAccess().getSuperKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3800:1: ( (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) ) | ( (lv_operationCall_5_0= ruleOperationCallExpression ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_ID) ) {
                    int LA63_2 = input.LA(3);

                    if ( (LA63_2==25) ) {
                        alt63=2;
                    }
                    else if ( (LA63_2==20) ) {
                        alt63=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3800:2: (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3800:2: (otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3800:4: otherlv_1= '.' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '::' ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleSuperInvocationExpression8131); 

                        	newLeafNode(otherlv_1, grammarAccess.getSuperInvocationExpressionAccess().getFullStopKeyword_1_0_0());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3804:1: ( (lv_className_2_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3805:1: (lv_className_2_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3805:1: (lv_className_2_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3806:3: lv_className_2_0= RULE_ID
                    {
                    lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSuperInvocationExpression8148); 

                    			newLeafNode(lv_className_2_0, grammarAccess.getSuperInvocationExpressionAccess().getClassNameIDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSuperInvocationExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"className",
                            		lv_className_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSuperInvocationExpression8165); 

                        	newLeafNode(otherlv_3, grammarAccess.getSuperInvocationExpressionAccess().getColonColonKeyword_1_0_2());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3826:1: ( (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3827:1: (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3827:1: (lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3828:3: lv_operationCallWithoutDot_4_0= ruleOperationCallExpressionWithoutDot
                    {
                     
                    	        newCompositeNode(grammarAccess.getSuperInvocationExpressionAccess().getOperationCallWithoutDotOperationCallExpressionWithoutDotParserRuleCall_1_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperationCallExpressionWithoutDot_in_ruleSuperInvocationExpression8186);
                    lv_operationCallWithoutDot_4_0=ruleOperationCallExpressionWithoutDot();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSuperInvocationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operationCallWithoutDot",
                            		lv_operationCallWithoutDot_4_0, 
                            		"OperationCallExpressionWithoutDot");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3845:6: ( (lv_operationCall_5_0= ruleOperationCallExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3845:6: ( (lv_operationCall_5_0= ruleOperationCallExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3846:1: (lv_operationCall_5_0= ruleOperationCallExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3846:1: (lv_operationCall_5_0= ruleOperationCallExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3847:3: lv_operationCall_5_0= ruleOperationCallExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSuperInvocationExpressionAccess().getOperationCallOperationCallExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperationCallExpression_in_ruleSuperInvocationExpression8214);
                    lv_operationCall_5_0=ruleOperationCallExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSuperInvocationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operationCall",
                            		lv_operationCall_5_0, 
                            		"OperationCallExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperInvocationExpression"


    // $ANTLR start "entryRuleInstanceCreationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3871:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3872:2: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3873:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceCreationExpressionRule()); 
            pushFollow(FOLLOW_ruleInstanceCreationExpression_in_entryRuleInstanceCreationExpression8251);
            iv_ruleInstanceCreationExpression=ruleInstanceCreationExpression();

            state._fsp--;

             current =iv_ruleInstanceCreationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceCreationExpression8261); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceCreationExpression"


    // $ANTLR start "ruleInstanceCreationExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3880:1: ruleInstanceCreationExpression returns [EObject current=null] : (otherlv_0= 'new' ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_tuple_2_0= ruleTuple ) ) | ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_constructor_1_0 = null;

        EObject lv_tuple_2_0 = null;

        EObject lv_sequenceConstuctionCompletion_3_0 = null;

        EObject lv_suffix_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3883:28: ( (otherlv_0= 'new' ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_tuple_2_0= ruleTuple ) ) | ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3884:1: (otherlv_0= 'new' ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_tuple_2_0= ruleTuple ) ) | ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3884:1: (otherlv_0= 'new' ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_tuple_2_0= ruleTuple ) ) | ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3884:3: otherlv_0= 'new' ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_tuple_2_0= ruleTuple ) ) | ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) ) ) ( (lv_suffix_4_0= ruleSuffixExpression ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleInstanceCreationExpression8298); 

                	newLeafNode(otherlv_0, grammarAccess.getInstanceCreationExpressionAccess().getNewKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3888:1: ( (lv_constructor_1_0= ruleQualifiedNameWithBinding ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3889:1: (lv_constructor_1_0= ruleQualifiedNameWithBinding )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3889:1: (lv_constructor_1_0= ruleQualifiedNameWithBinding )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3890:3: lv_constructor_1_0= ruleQualifiedNameWithBinding
            {
             
            	        newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getConstructorQualifiedNameWithBindingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleInstanceCreationExpression8319);
            lv_constructor_1_0=ruleQualifiedNameWithBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"constructor",
                    		lv_constructor_1_0, 
                    		"QualifiedNameWithBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3906:2: ( ( (lv_tuple_2_0= ruleTuple ) ) | ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==25) ) {
                alt64=1;
            }
            else if ( (LA64_0==13||LA64_0==51) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3906:3: ( (lv_tuple_2_0= ruleTuple ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3906:3: ( (lv_tuple_2_0= ruleTuple ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3907:1: (lv_tuple_2_0= ruleTuple )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3907:1: (lv_tuple_2_0= ruleTuple )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3908:3: lv_tuple_2_0= ruleTuple
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getTupleTupleParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTuple_in_ruleInstanceCreationExpression8341);
                    lv_tuple_2_0=ruleTuple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"tuple",
                            		lv_tuple_2_0, 
                            		"Tuple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3925:6: ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3925:6: ( (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3926:1: (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3926:1: (lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3927:3: lv_sequenceConstuctionCompletion_3_0= ruleSequenceConstructionCompletion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getSequenceConstuctionCompletionSequenceConstructionCompletionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceConstructionCompletion_in_ruleInstanceCreationExpression8368);
                    lv_sequenceConstuctionCompletion_3_0=ruleSequenceConstructionCompletion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"sequenceConstuctionCompletion",
                            		lv_sequenceConstuctionCompletion_3_0, 
                            		"SequenceConstructionCompletion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3943:3: ( (lv_suffix_4_0= ruleSuffixExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==50||LA65_0==53) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3944:1: (lv_suffix_4_0= ruleSuffixExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3944:1: (lv_suffix_4_0= ruleSuffixExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3945:3: lv_suffix_4_0= ruleSuffixExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getSuffixSuffixExpressionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuffixExpression_in_ruleInstanceCreationExpression8390);
                    lv_suffix_4_0=ruleSuffixExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_4_0, 
                            		"SuffixExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceCreationExpression"


    // $ANTLR start "entryRuleSequenceConstructionOrAccessCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3969:1: entryRuleSequenceConstructionOrAccessCompletion returns [EObject current=null] : iv_ruleSequenceConstructionOrAccessCompletion= ruleSequenceConstructionOrAccessCompletion EOF ;
    public final EObject entryRuleSequenceConstructionOrAccessCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionOrAccessCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3970:2: (iv_ruleSequenceConstructionOrAccessCompletion= ruleSequenceConstructionOrAccessCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3971:2: iv_ruleSequenceConstructionOrAccessCompletion= ruleSequenceConstructionOrAccessCompletion EOF
            {
             newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionRule()); 
            pushFollow(FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_entryRuleSequenceConstructionOrAccessCompletion8427);
            iv_ruleSequenceConstructionOrAccessCompletion=ruleSequenceConstructionOrAccessCompletion();

            state._fsp--;

             current =iv_ruleSequenceConstructionOrAccessCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceConstructionOrAccessCompletion8437); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceConstructionOrAccessCompletion"


    // $ANTLR start "ruleSequenceConstructionOrAccessCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3978:1: ruleSequenceConstructionOrAccessCompletion returns [EObject current=null] : ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) ) ;
    public final EObject ruleSequenceConstructionOrAccessCompletion() throws RecognitionException {
        EObject current = null;

        Token lv_multiplicityIndicator_0_0=null;
        EObject lv_accessCompletion_1_0 = null;

        EObject lv_sequenceCompletion_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3981:28: ( ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3982:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3982:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) ) | ( (lv_expression_3_0= ruleSequenceConstructionExpression ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            else if ( (LA67_0==13) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3982:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3982:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3982:3: ( (lv_multiplicityIndicator_0_0= '[' ) ) ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3982:3: ( (lv_multiplicityIndicator_0_0= '[' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3983:1: (lv_multiplicityIndicator_0_0= '[' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3983:1: (lv_multiplicityIndicator_0_0= '[' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3984:3: lv_multiplicityIndicator_0_0= '['
                    {
                    lv_multiplicityIndicator_0_0=(Token)match(input,51,FOLLOW_51_in_ruleSequenceConstructionOrAccessCompletion8481); 

                            newLeafNode(lv_multiplicityIndicator_0_0, grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicityIndicator", true, "[");
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3997:2: ( ( (lv_accessCompletion_1_0= ruleAccessCompletion ) ) | ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_STRING)||(LA66_0>=17 && LA66_0<=19)||LA66_0==25||(LA66_0>=43 && LA66_0<=44)||(LA66_0>=47 && LA66_0<=49)||(LA66_0>=57 && LA66_0<=60)||(LA66_0>=86 && LA66_0<=87)) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==52) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3997:3: ( (lv_accessCompletion_1_0= ruleAccessCompletion ) )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3997:3: ( (lv_accessCompletion_1_0= ruleAccessCompletion ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3998:1: (lv_accessCompletion_1_0= ruleAccessCompletion )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3998:1: (lv_accessCompletion_1_0= ruleAccessCompletion )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:3999:3: lv_accessCompletion_1_0= ruleAccessCompletion
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getAccessCompletionAccessCompletionParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAccessCompletion_in_ruleSequenceConstructionOrAccessCompletion8516);
                            lv_accessCompletion_1_0=ruleAccessCompletion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"accessCompletion",
                                    		lv_accessCompletion_1_0, 
                                    		"AccessCompletion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4016:6: ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4016:6: ( (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4017:1: (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4017:1: (lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4018:3: lv_sequenceCompletion_2_0= rulePartialSequenceConstructionCompletion
                            {
                             
                            	        newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getSequenceCompletionPartialSequenceConstructionCompletionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePartialSequenceConstructionCompletion_in_ruleSequenceConstructionOrAccessCompletion8543);
                            lv_sequenceCompletion_2_0=rulePartialSequenceConstructionCompletion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"sequenceCompletion",
                                    		lv_sequenceCompletion_2_0, 
                                    		"PartialSequenceConstructionCompletion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4035:6: ( (lv_expression_3_0= ruleSequenceConstructionExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4035:6: ( (lv_expression_3_0= ruleSequenceConstructionExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4036:1: (lv_expression_3_0= ruleSequenceConstructionExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4036:1: (lv_expression_3_0= ruleSequenceConstructionExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4037:3: lv_expression_3_0= ruleSequenceConstructionExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceConstructionOrAccessCompletionAccess().getExpressionSequenceConstructionExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceConstructionOrAccessCompletion8572);
                    lv_expression_3_0=ruleSequenceConstructionExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceConstructionOrAccessCompletionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"SequenceConstructionExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceConstructionOrAccessCompletion"


    // $ANTLR start "entryRuleAccessCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4061:1: entryRuleAccessCompletion returns [EObject current=null] : iv_ruleAccessCompletion= ruleAccessCompletion EOF ;
    public final EObject entryRuleAccessCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4062:2: (iv_ruleAccessCompletion= ruleAccessCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4063:2: iv_ruleAccessCompletion= ruleAccessCompletion EOF
            {
             newCompositeNode(grammarAccess.getAccessCompletionRule()); 
            pushFollow(FOLLOW_ruleAccessCompletion_in_entryRuleAccessCompletion8608);
            iv_ruleAccessCompletion=ruleAccessCompletion();

            state._fsp--;

             current =iv_ruleAccessCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessCompletion8618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessCompletion"


    // $ANTLR start "ruleAccessCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4070:1: ruleAccessCompletion returns [EObject current=null] : ( ( (lv_accessIndex_0_0= ruleExpression ) ) otherlv_1= ']' ) ;
    public final EObject ruleAccessCompletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_accessIndex_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4073:28: ( ( ( (lv_accessIndex_0_0= ruleExpression ) ) otherlv_1= ']' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4074:1: ( ( (lv_accessIndex_0_0= ruleExpression ) ) otherlv_1= ']' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4074:1: ( ( (lv_accessIndex_0_0= ruleExpression ) ) otherlv_1= ']' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4074:2: ( (lv_accessIndex_0_0= ruleExpression ) ) otherlv_1= ']'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4074:2: ( (lv_accessIndex_0_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4075:1: (lv_accessIndex_0_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4075:1: (lv_accessIndex_0_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4076:3: lv_accessIndex_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAccessCompletionAccess().getAccessIndexExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAccessCompletion8664);
            lv_accessIndex_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccessCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"accessIndex",
                    		lv_accessIndex_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleAccessCompletion8676); 

                	newLeafNode(otherlv_1, grammarAccess.getAccessCompletionAccess().getRightSquareBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessCompletion"


    // $ANTLR start "entryRulePartialSequenceConstructionCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4104:1: entryRulePartialSequenceConstructionCompletion returns [EObject current=null] : iv_rulePartialSequenceConstructionCompletion= rulePartialSequenceConstructionCompletion EOF ;
    public final EObject entryRulePartialSequenceConstructionCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialSequenceConstructionCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4105:2: (iv_rulePartialSequenceConstructionCompletion= rulePartialSequenceConstructionCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4106:2: iv_rulePartialSequenceConstructionCompletion= rulePartialSequenceConstructionCompletion EOF
            {
             newCompositeNode(grammarAccess.getPartialSequenceConstructionCompletionRule()); 
            pushFollow(FOLLOW_rulePartialSequenceConstructionCompletion_in_entryRulePartialSequenceConstructionCompletion8712);
            iv_rulePartialSequenceConstructionCompletion=rulePartialSequenceConstructionCompletion();

            state._fsp--;

             current =iv_rulePartialSequenceConstructionCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialSequenceConstructionCompletion8722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialSequenceConstructionCompletion"


    // $ANTLR start "rulePartialSequenceConstructionCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4113:1: rulePartialSequenceConstructionCompletion returns [EObject current=null] : (otherlv_0= ']' ( (lv_expression_1_0= ruleSequenceConstructionExpression ) ) ) ;
    public final EObject rulePartialSequenceConstructionCompletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4116:28: ( (otherlv_0= ']' ( (lv_expression_1_0= ruleSequenceConstructionExpression ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4117:1: (otherlv_0= ']' ( (lv_expression_1_0= ruleSequenceConstructionExpression ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4117:1: (otherlv_0= ']' ( (lv_expression_1_0= ruleSequenceConstructionExpression ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4117:3: otherlv_0= ']' ( (lv_expression_1_0= ruleSequenceConstructionExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_rulePartialSequenceConstructionCompletion8759); 

                	newLeafNode(otherlv_0, grammarAccess.getPartialSequenceConstructionCompletionAccess().getRightSquareBracketKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4121:1: ( (lv_expression_1_0= ruleSequenceConstructionExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4122:1: (lv_expression_1_0= ruleSequenceConstructionExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4122:1: (lv_expression_1_0= ruleSequenceConstructionExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4123:3: lv_expression_1_0= ruleSequenceConstructionExpression
            {
             
            	        newCompositeNode(grammarAccess.getPartialSequenceConstructionCompletionAccess().getExpressionSequenceConstructionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_rulePartialSequenceConstructionCompletion8780);
            lv_expression_1_0=ruleSequenceConstructionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartialSequenceConstructionCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"SequenceConstructionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialSequenceConstructionCompletion"


    // $ANTLR start "entryRuleSequenceConstructionCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4147:1: entryRuleSequenceConstructionCompletion returns [EObject current=null] : iv_ruleSequenceConstructionCompletion= ruleSequenceConstructionCompletion EOF ;
    public final EObject entryRuleSequenceConstructionCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4148:2: (iv_ruleSequenceConstructionCompletion= ruleSequenceConstructionCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4149:2: iv_ruleSequenceConstructionCompletion= ruleSequenceConstructionCompletion EOF
            {
             newCompositeNode(grammarAccess.getSequenceConstructionCompletionRule()); 
            pushFollow(FOLLOW_ruleSequenceConstructionCompletion_in_entryRuleSequenceConstructionCompletion8816);
            iv_ruleSequenceConstructionCompletion=ruleSequenceConstructionCompletion();

            state._fsp--;

             current =iv_ruleSequenceConstructionCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceConstructionCompletion8826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceConstructionCompletion"


    // $ANTLR start "ruleSequenceConstructionCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4156:1: ruleSequenceConstructionCompletion returns [EObject current=null] : ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_expression_2_0= ruleSequenceConstructionExpression ) ) ) ;
    public final EObject ruleSequenceConstructionCompletion() throws RecognitionException {
        EObject current = null;

        Token lv_multiplicityIndicator_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4159:28: ( ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_expression_2_0= ruleSequenceConstructionExpression ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4160:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_expression_2_0= ruleSequenceConstructionExpression ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4160:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_expression_2_0= ruleSequenceConstructionExpression ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4160:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_expression_2_0= ruleSequenceConstructionExpression ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4160:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==51) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4160:3: ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']'
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4160:3: ( (lv_multiplicityIndicator_0_0= '[' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4161:1: (lv_multiplicityIndicator_0_0= '[' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4161:1: (lv_multiplicityIndicator_0_0= '[' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4162:3: lv_multiplicityIndicator_0_0= '['
                    {
                    lv_multiplicityIndicator_0_0=(Token)match(input,51,FOLLOW_51_in_ruleSequenceConstructionCompletion8870); 

                            newLeafNode(lv_multiplicityIndicator_0_0, grammarAccess.getSequenceConstructionCompletionAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequenceConstructionCompletionRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicityIndicator", true, "[");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleSequenceConstructionCompletion8895); 

                        	newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionCompletionAccess().getRightSquareBracketKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4179:3: ( (lv_expression_2_0= ruleSequenceConstructionExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4180:1: (lv_expression_2_0= ruleSequenceConstructionExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4180:1: (lv_expression_2_0= ruleSequenceConstructionExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4181:3: lv_expression_2_0= ruleSequenceConstructionExpression
            {
             
            	        newCompositeNode(grammarAccess.getSequenceConstructionCompletionAccess().getExpressionSequenceConstructionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceConstructionCompletion8918);
            lv_expression_2_0=ruleSequenceConstructionExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceConstructionCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"SequenceConstructionExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceConstructionCompletion"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4205:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4206:2: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4207:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceConstructionExpressionRule()); 
            pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_entryRuleSequenceConstructionExpression8954);
            iv_ruleSequenceConstructionExpression=ruleSequenceConstructionExpression();

            state._fsp--;

             current =iv_ruleSequenceConstructionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceConstructionExpression8964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceConstructionExpression"


    // $ANTLR start "ruleSequenceConstructionExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4214:1: ruleSequenceConstructionExpression returns [EObject current=null] : (otherlv_0= '{' ( (lv_sequenceElement_1_0= ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sequenceElement_1_0 = null;

        EObject lv_sequenceElement_3_0 = null;

        EObject lv_rangeUpper_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4217:28: ( (otherlv_0= '{' ( (lv_sequenceElement_1_0= ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4218:1: (otherlv_0= '{' ( (lv_sequenceElement_1_0= ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4218:1: (otherlv_0= '{' ( (lv_sequenceElement_1_0= ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4218:3: otherlv_0= '{' ( (lv_sequenceElement_1_0= ruleSequenceElement ) ) ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSequenceConstructionExpression9001); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4222:1: ( (lv_sequenceElement_1_0= ruleSequenceElement ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4223:1: (lv_sequenceElement_1_0= ruleSequenceElement )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4223:1: (lv_sequenceElement_1_0= ruleSequenceElement )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4224:3: lv_sequenceElement_1_0= ruleSequenceElement
            {
             
            	        newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceElementSequenceElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression9022);
            lv_sequenceElement_1_0=ruleSequenceElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"sequenceElement",
                    		lv_sequenceElement_1_0, 
                    		"SequenceElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4240:2: ( (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )* | (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==14||LA70_0==22) ) {
                alt70=1;
            }
            else if ( (LA70_0==61) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4240:3: (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )*
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4240:3: (otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==22) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4240:5: otherlv_2= ',' ( (lv_sequenceElement_3_0= ruleSequenceElement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleSequenceConstructionExpression9036); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_0_0());
                    	        
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4244:1: ( (lv_sequenceElement_3_0= ruleSequenceElement ) )
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4245:1: (lv_sequenceElement_3_0= ruleSequenceElement )
                    	    {
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4245:1: (lv_sequenceElement_3_0= ruleSequenceElement )
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4246:3: lv_sequenceElement_3_0= ruleSequenceElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getSequenceElementSequenceElementParserRuleCall_2_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression9057);
                    	    lv_sequenceElement_3_0=ruleSequenceElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sequenceElement",
                    	            		lv_sequenceElement_3_0, 
                    	            		"SequenceElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4263:6: (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4263:6: (otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4263:8: otherlv_4= '..' ( (lv_rangeUpper_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleSequenceConstructionExpression9078); 

                        	newLeafNode(otherlv_4, grammarAccess.getSequenceConstructionExpressionAccess().getFullStopFullStopKeyword_2_1_0());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4267:1: ( (lv_rangeUpper_5_0= ruleExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4268:1: (lv_rangeUpper_5_0= ruleExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4268:1: (lv_rangeUpper_5_0= ruleExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4269:3: lv_rangeUpper_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getRangeUpperExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleSequenceConstructionExpression9099);
                    lv_rangeUpper_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rangeUpper",
                            		lv_rangeUpper_5_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSequenceConstructionExpression9113); 

                	newLeafNode(otherlv_6, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceConstructionExpression"


    // $ANTLR start "entryRuleSequenceElement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4297:1: entryRuleSequenceElement returns [EObject current=null] : iv_ruleSequenceElement= ruleSequenceElement EOF ;
    public final EObject entryRuleSequenceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceElement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4298:2: (iv_ruleSequenceElement= ruleSequenceElement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4299:2: iv_ruleSequenceElement= ruleSequenceElement EOF
            {
             newCompositeNode(grammarAccess.getSequenceElementRule()); 
            pushFollow(FOLLOW_ruleSequenceElement_in_entryRuleSequenceElement9149);
            iv_ruleSequenceElement=ruleSequenceElement();

            state._fsp--;

             current =iv_ruleSequenceElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceElement9159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceElement"


    // $ANTLR start "ruleSequenceElement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4306:1: ruleSequenceElement returns [EObject current=null] : (this_Expression_0= ruleExpression | this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression ) ;
    public final EObject ruleSequenceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_SequenceConstructionExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4309:28: ( (this_Expression_0= ruleExpression | this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4310:1: (this_Expression_0= ruleExpression | this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4310:1: (this_Expression_0= ruleExpression | this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_STRING)||(LA71_0>=17 && LA71_0<=19)||LA71_0==25||(LA71_0>=43 && LA71_0<=44)||(LA71_0>=47 && LA71_0<=49)||(LA71_0>=57 && LA71_0<=60)||(LA71_0>=86 && LA71_0<=87)) ) {
                alt71=1;
            }
            else if ( (LA71_0==13) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4311:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceElementAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleSequenceElement9206);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4321:5: this_SequenceConstructionExpression_1= ruleSequenceConstructionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSequenceElementAccess().getSequenceConstructionExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceElement9233);
                    this_SequenceConstructionExpression_1=ruleSequenceConstructionExpression();

                    state._fsp--;

                     
                            current = this_SequenceConstructionExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceElement"


    // $ANTLR start "entryRuleClassExtentExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4337:1: entryRuleClassExtentExpression returns [EObject current=null] : iv_ruleClassExtentExpression= ruleClassExtentExpression EOF ;
    public final EObject entryRuleClassExtentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassExtentExpression = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4338:2: (iv_ruleClassExtentExpression= ruleClassExtentExpression EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4339:2: iv_ruleClassExtentExpression= ruleClassExtentExpression EOF
            {
             newCompositeNode(grammarAccess.getClassExtentExpressionRule()); 
            pushFollow(FOLLOW_ruleClassExtentExpression_in_entryRuleClassExtentExpression9268);
            iv_ruleClassExtentExpression=ruleClassExtentExpression();

            state._fsp--;

             current =iv_ruleClassExtentExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassExtentExpression9278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassExtentExpression"


    // $ANTLR start "ruleClassExtentExpression"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4346:1: ruleClassExtentExpression returns [EObject current=null] : ( () otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleClassExtentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4349:28: ( ( () otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4350:1: ( () otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4350:1: ( () otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4350:2: () otherlv_1= '.' otherlv_2= 'allInstances' otherlv_3= '(' otherlv_4= ')'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4350:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassExtentExpressionAccess().getClassExtentExpressionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleClassExtentExpression9324); 

                	newLeafNode(otherlv_1, grammarAccess.getClassExtentExpressionAccess().getFullStopKeyword_1());
                
            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleClassExtentExpression9336); 

                	newLeafNode(otherlv_2, grammarAccess.getClassExtentExpressionAccess().getAllInstancesKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleClassExtentExpression9348); 

                	newLeafNode(otherlv_3, grammarAccess.getClassExtentExpressionAccess().getLeftParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleClassExtentExpression9360); 

                	newLeafNode(otherlv_4, grammarAccess.getClassExtentExpressionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassExtentExpression"


    // $ANTLR start "entryRuleBlock"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4380:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4381:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4382:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock9396);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock9406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4389:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_sequence_2_0= ruleStatementSequence ) )? otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4392:28: ( (otherlv_0= '{' () ( (lv_sequence_2_0= ruleStatementSequence ) )? otherlv_3= '}' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4393:1: (otherlv_0= '{' () ( (lv_sequence_2_0= ruleStatementSequence ) )? otherlv_3= '}' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4393:1: (otherlv_0= '{' () ( (lv_sequence_2_0= ruleStatementSequence ) )? otherlv_3= '}' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4393:3: otherlv_0= '{' () ( (lv_sequence_2_0= ruleStatementSequence ) )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBlock9443); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4397:1: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4398:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_1(),
                        current);
                

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4403:2: ( (lv_sequence_2_0= ruleStatementSequence ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID||(LA72_0>=RULE_ML_COMMENT && LA72_0<=RULE_SL_COMMENT)||LA72_0==13||(LA72_0>=18 && LA72_0<=19)||(LA72_0>=58 && LA72_0<=60)||LA72_0==63||(LA72_0>=66 && LA72_0<=68)||LA72_0==70||LA72_0==73||(LA72_0>=76 && LA72_0<=78)||(LA72_0>=80 && LA72_0<=83)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4404:1: (lv_sequence_2_0= ruleStatementSequence )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4404:1: (lv_sequence_2_0= ruleStatementSequence )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4405:3: lv_sequence_2_0= ruleStatementSequence
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getSequenceStatementSequenceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatementSequence_in_ruleBlock9473);
                    lv_sequence_2_0=ruleStatementSequence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"sequence",
                            		lv_sequence_2_0, 
                            		"StatementSequence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBlock9486); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatementSequence"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4433:1: entryRuleStatementSequence returns [EObject current=null] : iv_ruleStatementSequence= ruleStatementSequence EOF ;
    public final EObject entryRuleStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementSequence = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4434:2: (iv_ruleStatementSequence= ruleStatementSequence EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4435:2: iv_ruleStatementSequence= ruleStatementSequence EOF
            {
             newCompositeNode(grammarAccess.getStatementSequenceRule()); 
            pushFollow(FOLLOW_ruleStatementSequence_in_entryRuleStatementSequence9522);
            iv_ruleStatementSequence=ruleStatementSequence();

            state._fsp--;

             current =iv_ruleStatementSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementSequence9532); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementSequence"


    // $ANTLR start "ruleStatementSequence"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4442:1: ruleStatementSequence returns [EObject current=null] : ( (lv_statements_0_0= ruleDocumentedStatement ) )+ ;
    public final EObject ruleStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4445:28: ( ( (lv_statements_0_0= ruleDocumentedStatement ) )+ )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4446:1: ( (lv_statements_0_0= ruleDocumentedStatement ) )+
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4446:1: ( (lv_statements_0_0= ruleDocumentedStatement ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID||(LA73_0>=RULE_ML_COMMENT && LA73_0<=RULE_SL_COMMENT)||LA73_0==13||(LA73_0>=18 && LA73_0<=19)||(LA73_0>=58 && LA73_0<=60)||LA73_0==63||(LA73_0>=66 && LA73_0<=68)||LA73_0==70||LA73_0==73||(LA73_0>=76 && LA73_0<=78)||(LA73_0>=80 && LA73_0<=83)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4447:1: (lv_statements_0_0= ruleDocumentedStatement )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4447:1: (lv_statements_0_0= ruleDocumentedStatement )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4448:3: lv_statements_0_0= ruleDocumentedStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementSequenceAccess().getStatementsDocumentedStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDocumentedStatement_in_ruleStatementSequence9577);
            	    lv_statements_0_0=ruleDocumentedStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_0_0, 
            	            		"DocumentedStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementSequence"


    // $ANTLR start "entryRuleInlineStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4472:1: entryRuleInlineStatement returns [EObject current=null] : iv_ruleInlineStatement= ruleInlineStatement EOF ;
    public final EObject entryRuleInlineStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4473:2: (iv_ruleInlineStatement= ruleInlineStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4474:2: iv_ruleInlineStatement= ruleInlineStatement EOF
            {
             newCompositeNode(grammarAccess.getInlineStatementRule()); 
            pushFollow(FOLLOW_ruleInlineStatement_in_entryRuleInlineStatement9613);
            iv_ruleInlineStatement=ruleInlineStatement();

            state._fsp--;

             current =iv_ruleInlineStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineStatement9623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineStatement"


    // $ANTLR start "ruleInlineStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4481:1: ruleInlineStatement returns [EObject current=null] : (otherlv_0= '/*@' otherlv_1= 'inline' ( (lv_langageName_2_0= RULE_ID ) ) ( (lv_body_3_0= RULE_STRING ) ) otherlv_4= '*/' ) ;
    public final EObject ruleInlineStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_langageName_2_0=null;
        Token lv_body_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4484:28: ( (otherlv_0= '/*@' otherlv_1= 'inline' ( (lv_langageName_2_0= RULE_ID ) ) ( (lv_body_3_0= RULE_STRING ) ) otherlv_4= '*/' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4485:1: (otherlv_0= '/*@' otherlv_1= 'inline' ( (lv_langageName_2_0= RULE_ID ) ) ( (lv_body_3_0= RULE_STRING ) ) otherlv_4= '*/' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4485:1: (otherlv_0= '/*@' otherlv_1= 'inline' ( (lv_langageName_2_0= RULE_ID ) ) ( (lv_body_3_0= RULE_STRING ) ) otherlv_4= '*/' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4485:3: otherlv_0= '/*@' otherlv_1= 'inline' ( (lv_langageName_2_0= RULE_ID ) ) ( (lv_body_3_0= RULE_STRING ) ) otherlv_4= '*/'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleInlineStatement9660); 

                	newLeafNode(otherlv_0, grammarAccess.getInlineStatementAccess().getSolidusAsteriskCommercialAtKeyword_0());
                
            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleInlineStatement9672); 

                	newLeafNode(otherlv_1, grammarAccess.getInlineStatementAccess().getInlineKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4493:1: ( (lv_langageName_2_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4494:1: (lv_langageName_2_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4494:1: (lv_langageName_2_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4495:3: lv_langageName_2_0= RULE_ID
            {
            lv_langageName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInlineStatement9689); 

            			newLeafNode(lv_langageName_2_0, grammarAccess.getInlineStatementAccess().getLangageNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInlineStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"langageName",
                    		lv_langageName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4511:2: ( (lv_body_3_0= RULE_STRING ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4512:1: (lv_body_3_0= RULE_STRING )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4512:1: (lv_body_3_0= RULE_STRING )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4513:3: lv_body_3_0= RULE_STRING
            {
            lv_body_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInlineStatement9711); 

            			newLeafNode(lv_body_3_0, grammarAccess.getInlineStatementAccess().getBodySTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInlineStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleInlineStatement9728); 

                	newLeafNode(otherlv_4, grammarAccess.getInlineStatementAccess().getAsteriskSolidusKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineStatement"


    // $ANTLR start "entryRuleAnnotatedStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4541:1: entryRuleAnnotatedStatement returns [EObject current=null] : iv_ruleAnnotatedStatement= ruleAnnotatedStatement EOF ;
    public final EObject entryRuleAnnotatedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4542:2: (iv_ruleAnnotatedStatement= ruleAnnotatedStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4543:2: iv_ruleAnnotatedStatement= ruleAnnotatedStatement EOF
            {
             newCompositeNode(grammarAccess.getAnnotatedStatementRule()); 
            pushFollow(FOLLOW_ruleAnnotatedStatement_in_entryRuleAnnotatedStatement9764);
            iv_ruleAnnotatedStatement=ruleAnnotatedStatement();

            state._fsp--;

             current =iv_ruleAnnotatedStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotatedStatement9774); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedStatement"


    // $ANTLR start "ruleAnnotatedStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4550:1: ruleAnnotatedStatement returns [EObject current=null] : (otherlv_0= '//@' ( (lv_annotation_1_0= ruleAnnotation ) ) ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleAnnotatedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_annotation_1_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4553:28: ( (otherlv_0= '//@' ( (lv_annotation_1_0= ruleAnnotation ) ) ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4554:1: (otherlv_0= '//@' ( (lv_annotation_1_0= ruleAnnotation ) ) ( (lv_block_2_0= ruleBlock ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4554:1: (otherlv_0= '//@' ( (lv_annotation_1_0= ruleAnnotation ) ) ( (lv_block_2_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4554:3: otherlv_0= '//@' ( (lv_annotation_1_0= ruleAnnotation ) ) ( (lv_block_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleAnnotatedStatement9811); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotatedStatementAccess().getSolidusSolidusCommercialAtKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4558:1: ( (lv_annotation_1_0= ruleAnnotation ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4559:1: (lv_annotation_1_0= ruleAnnotation )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4559:1: (lv_annotation_1_0= ruleAnnotation )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4560:3: lv_annotation_1_0= ruleAnnotation
            {
             
            	        newCompositeNode(grammarAccess.getAnnotatedStatementAccess().getAnnotationAnnotationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotatedStatement9832);
            lv_annotation_1_0=ruleAnnotation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotatedStatementRule());
            	        }
                   		set(
                   			current, 
                   			"annotation",
                    		lv_annotation_1_0, 
                    		"Annotation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4576:2: ( (lv_block_2_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4577:1: (lv_block_2_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4577:1: (lv_block_2_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4578:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getAnnotatedStatementAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleAnnotatedStatement9853);
            lv_block_2_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotatedStatementRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_2_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatedStatement"


    // $ANTLR start "entryRuleDocumentedStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4602:1: entryRuleDocumentedStatement returns [EObject current=null] : iv_ruleDocumentedStatement= ruleDocumentedStatement EOF ;
    public final EObject entryRuleDocumentedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentedStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4603:2: (iv_ruleDocumentedStatement= ruleDocumentedStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4604:2: iv_ruleDocumentedStatement= ruleDocumentedStatement EOF
            {
             newCompositeNode(grammarAccess.getDocumentedStatementRule()); 
            pushFollow(FOLLOW_ruleDocumentedStatement_in_entryRuleDocumentedStatement9889);
            iv_ruleDocumentedStatement=ruleDocumentedStatement();

            state._fsp--;

             current =iv_ruleDocumentedStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentedStatement9899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentedStatement"


    // $ANTLR start "ruleDocumentedStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4611:1: ruleDocumentedStatement returns [EObject current=null] : ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) ) ;
    public final EObject ruleDocumentedStatement() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_1=null;
        Token lv_comment_0_2=null;
        EObject lv_statement_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4614:28: ( ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4615:1: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4615:1: ( ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4615:2: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )? ( (lv_statement_1_0= ruleStatement ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4615:2: ( ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ML_COMMENT && LA75_0<=RULE_SL_COMMENT)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4616:1: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4616:1: ( (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4617:1: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4617:1: (lv_comment_0_1= RULE_ML_COMMENT | lv_comment_0_2= RULE_SL_COMMENT )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_ML_COMMENT) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==RULE_SL_COMMENT) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4618:3: lv_comment_0_1= RULE_ML_COMMENT
                            {
                            lv_comment_0_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleDocumentedStatement9943); 

                            			newLeafNode(lv_comment_0_1, grammarAccess.getDocumentedStatementAccess().getCommentML_COMMENTTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDocumentedStatementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"comment",
                                    		lv_comment_0_1, 
                                    		"ML_COMMENT");
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4633:8: lv_comment_0_2= RULE_SL_COMMENT
                            {
                            lv_comment_0_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleDocumentedStatement9963); 

                            			newLeafNode(lv_comment_0_2, grammarAccess.getDocumentedStatementAccess().getCommentSL_COMMENTTerminalRuleCall_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDocumentedStatementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"comment",
                                    		lv_comment_0_2, 
                                    		"SL_COMMENT");
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4651:3: ( (lv_statement_1_0= ruleStatement ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4652:1: (lv_statement_1_0= ruleStatement )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4652:1: (lv_statement_1_0= ruleStatement )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4653:3: lv_statement_1_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getDocumentedStatementAccess().getStatementStatementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleDocumentedStatement9993);
            lv_statement_1_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentedStatementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_1_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentedStatement"


    // $ANTLR start "entryRuleStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4677:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4678:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4679:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement10029);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement10039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4686:1: ruleStatement returns [EObject current=null] : (this_AnnotatedStatement_0= ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement | this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10= ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17= ruleInstanceCreationInvocationStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatedStatement_0 = null;

        EObject this_InlineStatement_1 = null;

        EObject this_BlockStatement_2 = null;

        EObject this_EmptyStatement_3 = null;

        EObject this_LocalNameDeclarationStatement_4 = null;

        EObject this_IfStatement_5 = null;

        EObject this_SwitchStatement_6 = null;

        EObject this_WhileStatement_7 = null;

        EObject this_DoStatement_8 = null;

        EObject this_ForStatement_9 = null;

        EObject this_BreakStatement_10 = null;

        EObject this_ReturnStatement_11 = null;

        EObject this_AcceptStatement_12 = null;

        EObject this_ClassifyStatement_13 = null;

        EObject this_InvocationOrAssignementOrDeclarationStatement_14 = null;

        EObject this_SuperInvocationStatement_15 = null;

        EObject this_ThisInvocationStatement_16 = null;

        EObject this_InstanceCreationInvocationStatement_17 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4689:28: ( (this_AnnotatedStatement_0= ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement | this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10= ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17= ruleInstanceCreationInvocationStatement ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4690:1: (this_AnnotatedStatement_0= ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement | this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10= ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17= ruleInstanceCreationInvocationStatement )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4690:1: (this_AnnotatedStatement_0= ruleAnnotatedStatement | this_InlineStatement_1= ruleInlineStatement | this_BlockStatement_2= ruleBlockStatement | this_EmptyStatement_3= ruleEmptyStatement | this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement | this_IfStatement_5= ruleIfStatement | this_SwitchStatement_6= ruleSwitchStatement | this_WhileStatement_7= ruleWhileStatement | this_DoStatement_8= ruleDoStatement | this_ForStatement_9= ruleForStatement | this_BreakStatement_10= ruleBreakStatement | this_ReturnStatement_11= ruleReturnStatement | this_AcceptStatement_12= ruleAcceptStatement | this_ClassifyStatement_13= ruleClassifyStatement | this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement | this_SuperInvocationStatement_15= ruleSuperInvocationStatement | this_ThisInvocationStatement_16= ruleThisInvocationStatement | this_InstanceCreationInvocationStatement_17= ruleInstanceCreationInvocationStatement )
            int alt76=18;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt76=1;
                }
                break;
            case 63:
                {
                alt76=2;
                }
                break;
            case 13:
                {
                alt76=3;
                }
                break;
            case 67:
                {
                alt76=4;
                }
                break;
            case 68:
                {
                alt76=5;
                }
                break;
            case 70:
                {
                alt76=6;
                }
                break;
            case 73:
                {
                alt76=7;
                }
                break;
            case 76:
                {
                alt76=8;
                }
                break;
            case 77:
                {
                alt76=9;
                }
                break;
            case 78:
                {
                alt76=10;
                }
                break;
            case 80:
                {
                alt76=11;
                }
                break;
            case 81:
                {
                alt76=12;
                }
                break;
            case 82:
                {
                alt76=13;
                }
                break;
            case 83:
                {
                alt76=14;
                }
                break;
            case RULE_ID:
            case 18:
            case 19:
                {
                alt76=15;
                }
                break;
            case 59:
                {
                alt76=16;
                }
                break;
            case 58:
                {
                alt76=17;
                }
                break;
            case 60:
                {
                alt76=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4691:5: this_AnnotatedStatement_0= ruleAnnotatedStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAnnotatedStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnnotatedStatement_in_ruleStatement10086);
                    this_AnnotatedStatement_0=ruleAnnotatedStatement();

                    state._fsp--;

                     
                            current = this_AnnotatedStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4701:5: this_InlineStatement_1= ruleInlineStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getInlineStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInlineStatement_in_ruleStatement10113);
                    this_InlineStatement_1=ruleInlineStatement();

                    state._fsp--;

                     
                            current = this_InlineStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4711:5: this_BlockStatement_2= ruleBlockStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBlockStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleStatement10140);
                    this_BlockStatement_2=ruleBlockStatement();

                    state._fsp--;

                     
                            current = this_BlockStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4721:5: this_EmptyStatement_3= ruleEmptyStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getEmptyStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEmptyStatement_in_ruleStatement10167);
                    this_EmptyStatement_3=ruleEmptyStatement();

                    state._fsp--;

                     
                            current = this_EmptyStatement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4731:5: this_LocalNameDeclarationStatement_4= ruleLocalNameDeclarationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLocalNameDeclarationStatementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLocalNameDeclarationStatement_in_ruleStatement10194);
                    this_LocalNameDeclarationStatement_4=ruleLocalNameDeclarationStatement();

                    state._fsp--;

                     
                            current = this_LocalNameDeclarationStatement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4741:5: this_IfStatement_5= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement10221);
                    this_IfStatement_5=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4751:5: this_SwitchStatement_6= ruleSwitchStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement10248);
                    this_SwitchStatement_6=ruleSwitchStatement();

                    state._fsp--;

                     
                            current = this_SwitchStatement_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4761:5: this_WhileStatement_7= ruleWhileStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement10275);
                    this_WhileStatement_7=ruleWhileStatement();

                    state._fsp--;

                     
                            current = this_WhileStatement_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4771:5: this_DoStatement_8= ruleDoStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getDoStatementParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleDoStatement_in_ruleStatement10302);
                    this_DoStatement_8=ruleDoStatement();

                    state._fsp--;

                     
                            current = this_DoStatement_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4781:5: this_ForStatement_9= ruleForStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement10329);
                    this_ForStatement_9=ruleForStatement();

                    state._fsp--;

                     
                            current = this_ForStatement_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4791:5: this_BreakStatement_10= ruleBreakStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement10356);
                    this_BreakStatement_10=ruleBreakStatement();

                    state._fsp--;

                     
                            current = this_BreakStatement_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4801:5: this_ReturnStatement_11= ruleReturnStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement10383);
                    this_ReturnStatement_11=ruleReturnStatement();

                    state._fsp--;

                     
                            current = this_ReturnStatement_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4811:5: this_AcceptStatement_12= ruleAcceptStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAcceptStatementParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleAcceptStatement_in_ruleStatement10410);
                    this_AcceptStatement_12=ruleAcceptStatement();

                    state._fsp--;

                     
                            current = this_AcceptStatement_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4821:5: this_ClassifyStatement_13= ruleClassifyStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getClassifyStatementParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleClassifyStatement_in_ruleStatement10437);
                    this_ClassifyStatement_13=ruleClassifyStatement();

                    state._fsp--;

                     
                            current = this_ClassifyStatement_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4831:5: this_InvocationOrAssignementOrDeclarationStatement_14= ruleInvocationOrAssignementOrDeclarationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getInvocationOrAssignementOrDeclarationStatementParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_ruleStatement10464);
                    this_InvocationOrAssignementOrDeclarationStatement_14=ruleInvocationOrAssignementOrDeclarationStatement();

                    state._fsp--;

                     
                            current = this_InvocationOrAssignementOrDeclarationStatement_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4841:5: this_SuperInvocationStatement_15= ruleSuperInvocationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSuperInvocationStatementParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleSuperInvocationStatement_in_ruleStatement10491);
                    this_SuperInvocationStatement_15=ruleSuperInvocationStatement();

                    state._fsp--;

                     
                            current = this_SuperInvocationStatement_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4851:5: this_ThisInvocationStatement_16= ruleThisInvocationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getThisInvocationStatementParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleThisInvocationStatement_in_ruleStatement10518);
                    this_ThisInvocationStatement_16=ruleThisInvocationStatement();

                    state._fsp--;

                     
                            current = this_ThisInvocationStatement_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4861:5: this_InstanceCreationInvocationStatement_17= ruleInstanceCreationInvocationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getInstanceCreationInvocationStatementParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleInstanceCreationInvocationStatement_in_ruleStatement10545);
                    this_InstanceCreationInvocationStatement_17=ruleInstanceCreationInvocationStatement();

                    state._fsp--;

                     
                            current = this_InstanceCreationInvocationStatement_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4877:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4878:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4879:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation10580);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation10590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4886:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_args_2_0=null;
        Token otherlv_3=null;
        Token lv_args_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_kind_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4889:28: ( ( ( (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4890:1: ( ( (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4890:1: ( ( (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4890:2: ( (lv_kind_0_0= ruleAnnotationKind ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )?
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4890:2: ( (lv_kind_0_0= ruleAnnotationKind ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4891:1: (lv_kind_0_0= ruleAnnotationKind )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4891:1: (lv_kind_0_0= ruleAnnotationKind )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4892:3: lv_kind_0_0= ruleAnnotationKind
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getKindAnnotationKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAnnotationKind_in_ruleAnnotation10636);
            lv_kind_0_0=ruleAnnotationKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"AnnotationKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4908:2: (otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==25) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4908:4: otherlv_1= '(' ( (lv_args_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAnnotation10649); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4912:1: ( (lv_args_2_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4913:1: (lv_args_2_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4913:1: (lv_args_2_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4914:3: lv_args_2_0= RULE_ID
                    {
                    lv_args_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation10666); 

                    			newLeafNode(lv_args_2_0, grammarAccess.getAnnotationAccess().getArgsIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4930:2: (otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==22) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4930:4: otherlv_3= ',' ( (lv_args_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation10684); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4934:1: ( (lv_args_4_0= RULE_ID ) )
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4935:1: (lv_args_4_0= RULE_ID )
                    	    {
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4935:1: (lv_args_4_0= RULE_ID )
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4936:3: lv_args_4_0= RULE_ID
                    	    {
                    	    lv_args_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation10701); 

                    	    			newLeafNode(lv_args_4_0, grammarAccess.getAnnotationAccess().getArgsIDTerminalRuleCall_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_4_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleAnnotation10720); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleBlockStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4964:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4965:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4966:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
             newCompositeNode(grammarAccess.getBlockStatementRule()); 
            pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement10758);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;

             current =iv_ruleBlockStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockStatement10768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4973:1: ruleBlockStatement returns [EObject current=null] : ( (lv_block_0_0= ruleBlock ) ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4976:28: ( ( (lv_block_0_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4977:1: ( (lv_block_0_0= ruleBlock ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4977:1: ( (lv_block_0_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4978:1: (lv_block_0_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4978:1: (lv_block_0_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:4979:3: lv_block_0_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getBlockStatementAccess().getBlockBlockParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleBlockStatement10813);
            lv_block_0_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockStatementRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_0_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleEmptyStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5003:1: entryRuleEmptyStatement returns [EObject current=null] : iv_ruleEmptyStatement= ruleEmptyStatement EOF ;
    public final EObject entryRuleEmptyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5004:2: (iv_ruleEmptyStatement= ruleEmptyStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5005:2: iv_ruleEmptyStatement= ruleEmptyStatement EOF
            {
             newCompositeNode(grammarAccess.getEmptyStatementRule()); 
            pushFollow(FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement10848);
            iv_ruleEmptyStatement=ruleEmptyStatement();

            state._fsp--;

             current =iv_ruleEmptyStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyStatement10858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyStatement"


    // $ANTLR start "ruleEmptyStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5012:1: ruleEmptyStatement returns [EObject current=null] : ( () otherlv_1= ';' ) ;
    public final EObject ruleEmptyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5015:28: ( ( () otherlv_1= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5016:1: ( () otherlv_1= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5016:1: ( () otherlv_1= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5016:2: () otherlv_1= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5016:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5017:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmptyStatementAccess().getEmptyStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleEmptyStatement10904); 

                	newLeafNode(otherlv_1, grammarAccess.getEmptyStatementAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyStatement"


    // $ANTLR start "entryRuleLocalNameDeclarationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5034:1: entryRuleLocalNameDeclarationStatement returns [EObject current=null] : iv_ruleLocalNameDeclarationStatement= ruleLocalNameDeclarationStatement EOF ;
    public final EObject entryRuleLocalNameDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalNameDeclarationStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5035:2: (iv_ruleLocalNameDeclarationStatement= ruleLocalNameDeclarationStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5036:2: iv_ruleLocalNameDeclarationStatement= ruleLocalNameDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getLocalNameDeclarationStatementRule()); 
            pushFollow(FOLLOW_ruleLocalNameDeclarationStatement_in_entryRuleLocalNameDeclarationStatement10940);
            iv_ruleLocalNameDeclarationStatement=ruleLocalNameDeclarationStatement();

            state._fsp--;

             current =iv_ruleLocalNameDeclarationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalNameDeclarationStatement10950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalNameDeclarationStatement"


    // $ANTLR start "ruleLocalNameDeclarationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5043:1: ruleLocalNameDeclarationStatement returns [EObject current=null] : (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleExpression ) ) otherlv_8= ';' ) ;
    public final EObject ruleLocalNameDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token otherlv_2=null;
        Token lv_multiplicityIndicator_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_3_0 = null;

        EObject lv_init_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5046:28: ( (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleExpression ) ) otherlv_8= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5047:1: (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleExpression ) ) otherlv_8= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5047:1: (otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleExpression ) ) otherlv_8= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5047:3: otherlv_0= 'let' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleQualifiedNameWithBinding ) ) ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )? otherlv_6= '=' ( (lv_init_7_0= ruleExpression ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleLocalNameDeclarationStatement10987); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalNameDeclarationStatementAccess().getLetKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5051:1: ( (lv_varName_1_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5052:1: (lv_varName_1_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5052:1: (lv_varName_1_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5053:3: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalNameDeclarationStatement11004); 

            			newLeafNode(lv_varName_1_0, grammarAccess.getLocalNameDeclarationStatementAccess().getVarNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalNameDeclarationStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleLocalNameDeclarationStatement11021); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalNameDeclarationStatementAccess().getColonKeyword_2());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5073:1: ( (lv_type_3_0= ruleQualifiedNameWithBinding ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5074:1: (lv_type_3_0= ruleQualifiedNameWithBinding )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5074:1: (lv_type_3_0= ruleQualifiedNameWithBinding )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5075:3: lv_type_3_0= ruleQualifiedNameWithBinding
            {
             
            	        newCompositeNode(grammarAccess.getLocalNameDeclarationStatementAccess().getTypeQualifiedNameWithBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleLocalNameDeclarationStatement11042);
            lv_type_3_0=ruleQualifiedNameWithBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalNameDeclarationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"QualifiedNameWithBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5091:2: ( ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==51) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5091:3: ( (lv_multiplicityIndicator_4_0= '[' ) ) otherlv_5= ']'
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5091:3: ( (lv_multiplicityIndicator_4_0= '[' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5092:1: (lv_multiplicityIndicator_4_0= '[' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5092:1: (lv_multiplicityIndicator_4_0= '[' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5093:3: lv_multiplicityIndicator_4_0= '['
                    {
                    lv_multiplicityIndicator_4_0=(Token)match(input,51,FOLLOW_51_in_ruleLocalNameDeclarationStatement11061); 

                            newLeafNode(lv_multiplicityIndicator_4_0, grammarAccess.getLocalNameDeclarationStatementAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalNameDeclarationStatementRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicityIndicator", true, "[");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleLocalNameDeclarationStatement11086); 

                        	newLeafNode(otherlv_5, grammarAccess.getLocalNameDeclarationStatementAccess().getRightSquareBracketKeyword_4_1());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleLocalNameDeclarationStatement11100); 

                	newLeafNode(otherlv_6, grammarAccess.getLocalNameDeclarationStatementAccess().getEqualsSignKeyword_5());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5114:1: ( (lv_init_7_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5115:1: (lv_init_7_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5115:1: (lv_init_7_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5116:3: lv_init_7_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLocalNameDeclarationStatementAccess().getInitExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLocalNameDeclarationStatement11121);
            lv_init_7_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalNameDeclarationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"init",
                    		lv_init_7_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleLocalNameDeclarationStatement11133); 

                	newLeafNode(otherlv_8, grammarAccess.getLocalNameDeclarationStatementAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalNameDeclarationStatement"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5144:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5145:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5146:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement11169);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement11179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5153:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sequentialClausses_1_0 = null;

        EObject lv_finalClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5156:28: ( (otherlv_0= 'if' ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5157:1: (otherlv_0= 'if' ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5157:1: (otherlv_0= 'if' ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5157:3: otherlv_0= 'if' ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) ) ( (lv_finalClause_2_0= ruleFinalClause ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleIfStatement11216); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5161:1: ( (lv_sequentialClausses_1_0= ruleSequentialClauses ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5162:1: (lv_sequentialClausses_1_0= ruleSequentialClauses )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5162:1: (lv_sequentialClausses_1_0= ruleSequentialClauses )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5163:3: lv_sequentialClausses_1_0= ruleSequentialClauses
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getSequentialClaussesSequentialClausesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequentialClauses_in_ruleIfStatement11237);
            lv_sequentialClausses_1_0=ruleSequentialClauses();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"sequentialClausses",
                    		lv_sequentialClausses_1_0, 
                    		"SequentialClauses");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5179:2: ( (lv_finalClause_2_0= ruleFinalClause ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==71) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5180:1: (lv_finalClause_2_0= ruleFinalClause )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5180:1: (lv_finalClause_2_0= ruleFinalClause )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5181:3: lv_finalClause_2_0= ruleFinalClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getFinalClauseFinalClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFinalClause_in_ruleIfStatement11258);
                    lv_finalClause_2_0=ruleFinalClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"finalClause",
                            		lv_finalClause_2_0, 
                            		"FinalClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleSequentialClauses"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5205:1: entryRuleSequentialClauses returns [EObject current=null] : iv_ruleSequentialClauses= ruleSequentialClauses EOF ;
    public final EObject entryRuleSequentialClauses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequentialClauses = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5206:2: (iv_ruleSequentialClauses= ruleSequentialClauses EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5207:2: iv_ruleSequentialClauses= ruleSequentialClauses EOF
            {
             newCompositeNode(grammarAccess.getSequentialClausesRule()); 
            pushFollow(FOLLOW_ruleSequentialClauses_in_entryRuleSequentialClauses11295);
            iv_ruleSequentialClauses=ruleSequentialClauses();

            state._fsp--;

             current =iv_ruleSequentialClauses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequentialClauses11305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequentialClauses"


    // $ANTLR start "ruleSequentialClauses"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5214:1: ruleSequentialClauses returns [EObject current=null] : ( ( (lv_conccurentClauses_0_0= ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* ) ;
    public final EObject ruleSequentialClauses() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_conccurentClauses_0_0 = null;

        EObject lv_conccurentClauses_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5217:28: ( ( ( (lv_conccurentClauses_0_0= ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5218:1: ( ( (lv_conccurentClauses_0_0= ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5218:1: ( ( (lv_conccurentClauses_0_0= ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5218:2: ( (lv_conccurentClauses_0_0= ruleConcurrentClauses ) ) (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5218:2: ( (lv_conccurentClauses_0_0= ruleConcurrentClauses ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5219:1: (lv_conccurentClauses_0_0= ruleConcurrentClauses )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5219:1: (lv_conccurentClauses_0_0= ruleConcurrentClauses )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5220:3: lv_conccurentClauses_0_0= ruleConcurrentClauses
            {
             
            	        newCompositeNode(grammarAccess.getSequentialClausesAccess().getConccurentClausesConcurrentClausesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11351);
            lv_conccurentClauses_0_0=ruleConcurrentClauses();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequentialClausesRule());
            	        }
                   		add(
                   			current, 
                   			"conccurentClauses",
                    		lv_conccurentClauses_0_0, 
                    		"ConcurrentClauses");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5236:2: (otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==71) ) {
                    int LA81_1 = input.LA(2);

                    if ( (LA81_1==70) ) {
                        alt81=1;
                    }


                }


                switch (alt81) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5236:4: otherlv_1= 'else' otherlv_2= 'if' ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) )
            	    {
            	    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSequentialClauses11364); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSequentialClausesAccess().getElseKeyword_1_0());
            	        
            	    otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleSequentialClauses11376); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSequentialClausesAccess().getIfKeyword_1_1());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5244:1: ( (lv_conccurentClauses_3_0= ruleConcurrentClauses ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5245:1: (lv_conccurentClauses_3_0= ruleConcurrentClauses )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5245:1: (lv_conccurentClauses_3_0= ruleConcurrentClauses )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5246:3: lv_conccurentClauses_3_0= ruleConcurrentClauses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequentialClausesAccess().getConccurentClausesConcurrentClausesParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11397);
            	    lv_conccurentClauses_3_0=ruleConcurrentClauses();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequentialClausesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conccurentClauses",
            	            		lv_conccurentClauses_3_0, 
            	            		"ConcurrentClauses");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequentialClauses"


    // $ANTLR start "entryRuleConcurrentClauses"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5270:1: entryRuleConcurrentClauses returns [EObject current=null] : iv_ruleConcurrentClauses= ruleConcurrentClauses EOF ;
    public final EObject entryRuleConcurrentClauses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrentClauses = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5271:2: (iv_ruleConcurrentClauses= ruleConcurrentClauses EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5272:2: iv_ruleConcurrentClauses= ruleConcurrentClauses EOF
            {
             newCompositeNode(grammarAccess.getConcurrentClausesRule()); 
            pushFollow(FOLLOW_ruleConcurrentClauses_in_entryRuleConcurrentClauses11435);
            iv_ruleConcurrentClauses=ruleConcurrentClauses();

            state._fsp--;

             current =iv_ruleConcurrentClauses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcurrentClauses11445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcurrentClauses"


    // $ANTLR start "ruleConcurrentClauses"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5279:1: ruleConcurrentClauses returns [EObject current=null] : ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* ) ;
    public final EObject ruleConcurrentClauses() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_nonFinalClause_0_0 = null;

        EObject lv_nonFinalClause_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5282:28: ( ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5283:1: ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5283:1: ( ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5283:2: ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) ) (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5283:2: ( (lv_nonFinalClause_0_0= ruleNonFinalClause ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5284:1: (lv_nonFinalClause_0_0= ruleNonFinalClause )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5284:1: (lv_nonFinalClause_0_0= ruleNonFinalClause )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5285:3: lv_nonFinalClause_0_0= ruleNonFinalClause
            {
             
            	        newCompositeNode(grammarAccess.getConcurrentClausesAccess().getNonFinalClauseNonFinalClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11491);
            lv_nonFinalClause_0_0=ruleNonFinalClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcurrentClausesRule());
            	        }
                   		add(
                   			current, 
                   			"nonFinalClause",
                    		lv_nonFinalClause_0_0, 
                    		"NonFinalClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5301:2: (otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==72) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5301:4: otherlv_1= 'or' otherlv_2= 'if' ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleConcurrentClauses11504); 

            	        	newLeafNode(otherlv_1, grammarAccess.getConcurrentClausesAccess().getOrKeyword_1_0());
            	        
            	    otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleConcurrentClauses11516); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConcurrentClausesAccess().getIfKeyword_1_1());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5309:1: ( (lv_nonFinalClause_3_0= ruleNonFinalClause ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5310:1: (lv_nonFinalClause_3_0= ruleNonFinalClause )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5310:1: (lv_nonFinalClause_3_0= ruleNonFinalClause )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5311:3: lv_nonFinalClause_3_0= ruleNonFinalClause
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConcurrentClausesAccess().getNonFinalClauseNonFinalClauseParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11537);
            	    lv_nonFinalClause_3_0=ruleNonFinalClause();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConcurrentClausesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nonFinalClause",
            	            		lv_nonFinalClause_3_0, 
            	            		"NonFinalClause");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcurrentClauses"


    // $ANTLR start "entryRuleNonFinalClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5335:1: entryRuleNonFinalClause returns [EObject current=null] : iv_ruleNonFinalClause= ruleNonFinalClause EOF ;
    public final EObject entryRuleNonFinalClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFinalClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5336:2: (iv_ruleNonFinalClause= ruleNonFinalClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5337:2: iv_ruleNonFinalClause= ruleNonFinalClause EOF
            {
             newCompositeNode(grammarAccess.getNonFinalClauseRule()); 
            pushFollow(FOLLOW_ruleNonFinalClause_in_entryRuleNonFinalClause11575);
            iv_ruleNonFinalClause=ruleNonFinalClause();

            state._fsp--;

             current =iv_ruleNonFinalClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonFinalClause11585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFinalClause"


    // $ANTLR start "ruleNonFinalClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5344:1: ruleNonFinalClause returns [EObject current=null] : (otherlv_0= '(' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) ) ;
    public final EObject ruleNonFinalClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_block_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5347:28: ( (otherlv_0= '(' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5348:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5348:1: (otherlv_0= '(' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5348:3: otherlv_0= '(' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_block_3_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleNonFinalClause11622); 

                	newLeafNode(otherlv_0, grammarAccess.getNonFinalClauseAccess().getLeftParenthesisKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5352:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5353:1: (lv_condition_1_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5353:1: (lv_condition_1_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5354:3: lv_condition_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getNonFinalClauseAccess().getConditionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleNonFinalClause11643);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonFinalClauseRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleNonFinalClause11655); 

                	newLeafNode(otherlv_2, grammarAccess.getNonFinalClauseAccess().getRightParenthesisKeyword_2());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5374:1: ( (lv_block_3_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5375:1: (lv_block_3_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5375:1: (lv_block_3_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5376:3: lv_block_3_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getNonFinalClauseAccess().getBlockBlockParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleNonFinalClause11676);
            lv_block_3_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonFinalClauseRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_3_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFinalClause"


    // $ANTLR start "entryRuleFinalClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5400:1: entryRuleFinalClause returns [EObject current=null] : iv_ruleFinalClause= ruleFinalClause EOF ;
    public final EObject entryRuleFinalClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5401:2: (iv_ruleFinalClause= ruleFinalClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5402:2: iv_ruleFinalClause= ruleFinalClause EOF
            {
             newCompositeNode(grammarAccess.getFinalClauseRule()); 
            pushFollow(FOLLOW_ruleFinalClause_in_entryRuleFinalClause11712);
            iv_ruleFinalClause=ruleFinalClause();

            state._fsp--;

             current =iv_ruleFinalClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinalClause11722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalClause"


    // $ANTLR start "ruleFinalClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5409:1: ruleFinalClause returns [EObject current=null] : (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFinalClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5412:28: ( (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5413:1: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5413:1: (otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5413:3: otherlv_0= 'else' ( (lv_block_1_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleFinalClause11759); 

                	newLeafNode(otherlv_0, grammarAccess.getFinalClauseAccess().getElseKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5417:1: ( (lv_block_1_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5418:1: (lv_block_1_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5418:1: (lv_block_1_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5419:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getFinalClauseAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleFinalClause11780);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFinalClauseRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalClause"


    // $ANTLR start "entryRuleSwitchStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5443:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5444:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5445:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
             newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement11816);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;

             current =iv_ruleSwitchStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement11826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5452:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_switchClause_5_0 = null;

        EObject lv_defaultClause_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5455:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5456:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5456:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5456:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_switchClause_5_0= ruleSwitchClause ) )* ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleSwitchStatement11863); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSwitchStatement11875); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5464:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5465:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5465:1: (lv_expression_2_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5466:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchStatement11896);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSwitchStatement11908); 

                	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSwitchStatement11920); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5490:1: ( (lv_switchClause_5_0= ruleSwitchClause ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==74) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5491:1: (lv_switchClause_5_0= ruleSwitchClause )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5491:1: (lv_switchClause_5_0= ruleSwitchClause )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5492:3: lv_switchClause_5_0= ruleSwitchClause
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getSwitchClauseSwitchClauseParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSwitchClause_in_ruleSwitchStatement11941);
            	    lv_switchClause_5_0=ruleSwitchClause();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"switchClause",
            	            		lv_switchClause_5_0, 
            	            		"SwitchClause");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5508:3: ( (lv_defaultClause_6_0= ruleSwitchDefaultClause ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==75) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5509:1: (lv_defaultClause_6_0= ruleSwitchDefaultClause )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5509:1: (lv_defaultClause_6_0= ruleSwitchDefaultClause )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5510:3: lv_defaultClause_6_0= ruleSwitchDefaultClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultClauseSwitchDefaultClauseParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSwitchDefaultClause_in_ruleSwitchStatement11963);
                    lv_defaultClause_6_0=ruleSwitchDefaultClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultClause",
                            		lv_defaultClause_6_0, 
                            		"SwitchDefaultClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleSwitchStatement11976); 

                	newLeafNode(otherlv_7, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleSwitchClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5538:1: entryRuleSwitchClause returns [EObject current=null] : iv_ruleSwitchClause= ruleSwitchClause EOF ;
    public final EObject entryRuleSwitchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5539:2: (iv_ruleSwitchClause= ruleSwitchClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5540:2: iv_ruleSwitchClause= ruleSwitchClause EOF
            {
             newCompositeNode(grammarAccess.getSwitchClauseRule()); 
            pushFollow(FOLLOW_ruleSwitchClause_in_entryRuleSwitchClause12012);
            iv_ruleSwitchClause=ruleSwitchClause();

            state._fsp--;

             current =iv_ruleSwitchClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchClause12022); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchClause"


    // $ANTLR start "ruleSwitchClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5547:1: ruleSwitchClause returns [EObject current=null] : ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) ( (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) ;
    public final EObject ruleSwitchClause() throws RecognitionException {
        EObject current = null;

        EObject lv_switchCase_0_0 = null;

        EObject lv_switchCase_1_0 = null;

        EObject lv_statementSequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5550:28: ( ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) ( (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5551:1: ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) ( (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5551:1: ( ( (lv_switchCase_0_0= ruleSwitchCase ) ) ( (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5551:2: ( (lv_switchCase_0_0= ruleSwitchCase ) ) ( (lv_switchCase_1_0= ruleSwitchCase ) )* ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5551:2: ( (lv_switchCase_0_0= ruleSwitchCase ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5552:1: (lv_switchCase_0_0= ruleSwitchCase )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5552:1: (lv_switchCase_0_0= ruleSwitchCase )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5553:3: lv_switchCase_0_0= ruleSwitchCase
            {
             
            	        newCompositeNode(grammarAccess.getSwitchClauseAccess().getSwitchCaseSwitchCaseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchClause12068);
            lv_switchCase_0_0=ruleSwitchCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchClauseRule());
            	        }
                   		add(
                   			current, 
                   			"switchCase",
                    		lv_switchCase_0_0, 
                    		"SwitchCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5569:2: ( (lv_switchCase_1_0= ruleSwitchCase ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==74) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5570:1: (lv_switchCase_1_0= ruleSwitchCase )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5570:1: (lv_switchCase_1_0= ruleSwitchCase )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5571:3: lv_switchCase_1_0= ruleSwitchCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchClauseAccess().getSwitchCaseSwitchCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchClause12089);
            	    lv_switchCase_1_0=ruleSwitchCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"switchCase",
            	            		lv_switchCase_1_0, 
            	            		"SwitchCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5587:3: ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5588:1: (lv_statementSequence_2_0= ruleNonEmptyStatementSequence )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5588:1: (lv_statementSequence_2_0= ruleNonEmptyStatementSequence )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5589:3: lv_statementSequence_2_0= ruleNonEmptyStatementSequence
            {
             
            	        newCompositeNode(grammarAccess.getSwitchClauseAccess().getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchClause12111);
            lv_statementSequence_2_0=ruleNonEmptyStatementSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchClauseRule());
            	        }
                   		set(
                   			current, 
                   			"statementSequence",
                    		lv_statementSequence_2_0, 
                    		"NonEmptyStatementSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchClause"


    // $ANTLR start "entryRuleSwitchCase"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5613:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5614:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5615:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase12147);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;

             current =iv_ruleSwitchCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase12157); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5622:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ':' ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5625:28: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ':' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5626:1: (otherlv_0= 'case' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ':' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5626:1: (otherlv_0= 'case' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ':' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5626:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleSwitchCase12194); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5630:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5631:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5631:1: (lv_expression_1_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5632:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchCase12215);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSwitchCase12227); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleSwitchDefaultClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5660:1: entryRuleSwitchDefaultClause returns [EObject current=null] : iv_ruleSwitchDefaultClause= ruleSwitchDefaultClause EOF ;
    public final EObject entryRuleSwitchDefaultClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefaultClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5661:2: (iv_ruleSwitchDefaultClause= ruleSwitchDefaultClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5662:2: iv_ruleSwitchDefaultClause= ruleSwitchDefaultClause EOF
            {
             newCompositeNode(grammarAccess.getSwitchDefaultClauseRule()); 
            pushFollow(FOLLOW_ruleSwitchDefaultClause_in_entryRuleSwitchDefaultClause12263);
            iv_ruleSwitchDefaultClause=ruleSwitchDefaultClause();

            state._fsp--;

             current =iv_ruleSwitchDefaultClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchDefaultClause12273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchDefaultClause"


    // $ANTLR start "ruleSwitchDefaultClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5669:1: ruleSwitchDefaultClause returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) ;
    public final EObject ruleSwitchDefaultClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statementSequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5672:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5673:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5673:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5673:3: otherlv_0= 'default' otherlv_1= ':' ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleSwitchDefaultClause12310); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultClauseAccess().getDefaultKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleSwitchDefaultClause12322); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultClauseAccess().getColonKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5681:1: ( (lv_statementSequence_2_0= ruleNonEmptyStatementSequence ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5682:1: (lv_statementSequence_2_0= ruleNonEmptyStatementSequence )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5682:1: (lv_statementSequence_2_0= ruleNonEmptyStatementSequence )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5683:3: lv_statementSequence_2_0= ruleNonEmptyStatementSequence
            {
             
            	        newCompositeNode(grammarAccess.getSwitchDefaultClauseAccess().getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchDefaultClause12343);
            lv_statementSequence_2_0=ruleNonEmptyStatementSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchDefaultClauseRule());
            	        }
                   		set(
                   			current, 
                   			"statementSequence",
                    		lv_statementSequence_2_0, 
                    		"NonEmptyStatementSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchDefaultClause"


    // $ANTLR start "entryRuleNonEmptyStatementSequence"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5707:1: entryRuleNonEmptyStatementSequence returns [EObject current=null] : iv_ruleNonEmptyStatementSequence= ruleNonEmptyStatementSequence EOF ;
    public final EObject entryRuleNonEmptyStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEmptyStatementSequence = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5708:2: (iv_ruleNonEmptyStatementSequence= ruleNonEmptyStatementSequence EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5709:2: iv_ruleNonEmptyStatementSequence= ruleNonEmptyStatementSequence EOF
            {
             newCompositeNode(grammarAccess.getNonEmptyStatementSequenceRule()); 
            pushFollow(FOLLOW_ruleNonEmptyStatementSequence_in_entryRuleNonEmptyStatementSequence12379);
            iv_ruleNonEmptyStatementSequence=ruleNonEmptyStatementSequence();

            state._fsp--;

             current =iv_ruleNonEmptyStatementSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonEmptyStatementSequence12389); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonEmptyStatementSequence"


    // $ANTLR start "ruleNonEmptyStatementSequence"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5716:1: ruleNonEmptyStatementSequence returns [EObject current=null] : ( (lv_statement_0_0= ruleDocumentedStatement ) )+ ;
    public final EObject ruleNonEmptyStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5719:28: ( ( (lv_statement_0_0= ruleDocumentedStatement ) )+ )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5720:1: ( (lv_statement_0_0= ruleDocumentedStatement ) )+
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5720:1: ( (lv_statement_0_0= ruleDocumentedStatement ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_ID||(LA86_0>=RULE_ML_COMMENT && LA86_0<=RULE_SL_COMMENT)||LA86_0==13||(LA86_0>=18 && LA86_0<=19)||(LA86_0>=58 && LA86_0<=60)||LA86_0==63||(LA86_0>=66 && LA86_0<=68)||LA86_0==70||LA86_0==73||(LA86_0>=76 && LA86_0<=78)||(LA86_0>=80 && LA86_0<=83)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5721:1: (lv_statement_0_0= ruleDocumentedStatement )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5721:1: (lv_statement_0_0= ruleDocumentedStatement )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5722:3: lv_statement_0_0= ruleDocumentedStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNonEmptyStatementSequenceAccess().getStatementDocumentedStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDocumentedStatement_in_ruleNonEmptyStatementSequence12434);
            	    lv_statement_0_0=ruleDocumentedStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNonEmptyStatementSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statement",
            	            		lv_statement_0_0, 
            	            		"DocumentedStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonEmptyStatementSequence"


    // $ANTLR start "entryRuleWhileStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5746:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5747:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5748:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement12470);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement12480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5755:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5758:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5759:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5759:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5759:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleWhileStatement12517); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleWhileStatement12529); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5767:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5768:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5768:1: (lv_condition_2_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5769:3: lv_condition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileStatement12550);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleWhileStatement12562); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5789:1: ( (lv_block_4_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5790:1: (lv_block_4_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5790:1: (lv_block_4_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5791:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleWhileStatement12583);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleDoStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5815:1: entryRuleDoStatement returns [EObject current=null] : iv_ruleDoStatement= ruleDoStatement EOF ;
    public final EObject entryRuleDoStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5816:2: (iv_ruleDoStatement= ruleDoStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5817:2: iv_ruleDoStatement= ruleDoStatement EOF
            {
             newCompositeNode(grammarAccess.getDoStatementRule()); 
            pushFollow(FOLLOW_ruleDoStatement_in_entryRuleDoStatement12619);
            iv_ruleDoStatement=ruleDoStatement();

            state._fsp--;

             current =iv_ruleDoStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoStatement12629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoStatement"


    // $ANTLR start "ruleDoStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5824:1: ruleDoStatement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleDoStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_block_1_0 = null;

        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5827:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5828:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5828:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5828:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleDoStatement12666); 

                	newLeafNode(otherlv_0, grammarAccess.getDoStatementAccess().getDoKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5832:1: ( (lv_block_1_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5833:1: (lv_block_1_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5833:1: (lv_block_1_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5834:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDoStatementAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleDoStatement12687);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoStatementRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleDoStatement12699); 

                	newLeafNode(otherlv_2, grammarAccess.getDoStatementAccess().getWhileKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleDoStatement12711); 

                	newLeafNode(otherlv_3, grammarAccess.getDoStatementAccess().getLeftParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5858:1: ( (lv_condition_4_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5859:1: (lv_condition_4_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5859:1: (lv_condition_4_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5860:3: lv_condition_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDoStatementAccess().getConditionExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleDoStatement12732);
            lv_condition_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleDoStatement12744); 

                	newLeafNode(otherlv_5, grammarAccess.getDoStatementAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleDoStatement12756); 

                	newLeafNode(otherlv_6, grammarAccess.getDoStatementAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoStatement"


    // $ANTLR start "entryRuleForStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5892:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5893:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5894:2: iv_ruleForStatement= ruleForStatement EOF
            {
             newCompositeNode(grammarAccess.getForStatementRule()); 
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement12792);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;

             current =iv_ruleForStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement12802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5901:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_control_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5904:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5905:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5905:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5905:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_control_2_0= ruleForControl ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleForStatement12839); 

                	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleForStatement12851); 

                	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5913:1: ( (lv_control_2_0= ruleForControl ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5914:1: (lv_control_2_0= ruleForControl )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5914:1: (lv_control_2_0= ruleForControl )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5915:3: lv_control_2_0= ruleForControl
            {
             
            	        newCompositeNode(grammarAccess.getForStatementAccess().getControlForControlParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleForControl_in_ruleForStatement12872);
            lv_control_2_0=ruleForControl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForStatementRule());
            	        }
                   		set(
                   			current, 
                   			"control",
                    		lv_control_2_0, 
                    		"ForControl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleForStatement12884); 

                	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_3());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5935:1: ( (lv_block_4_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5936:1: (lv_block_4_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5936:1: (lv_block_4_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5937:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleForStatement12905);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForStatementRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleForControl"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5961:1: entryRuleForControl returns [EObject current=null] : iv_ruleForControl= ruleForControl EOF ;
    public final EObject entryRuleForControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForControl = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5962:2: (iv_ruleForControl= ruleForControl EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5963:2: iv_ruleForControl= ruleForControl EOF
            {
             newCompositeNode(grammarAccess.getForControlRule()); 
            pushFollow(FOLLOW_ruleForControl_in_entryRuleForControl12941);
            iv_ruleForControl=ruleForControl();

            state._fsp--;

             current =iv_ruleForControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForControl12951); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForControl"


    // $ANTLR start "ruleForControl"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5970:1: ruleForControl returns [EObject current=null] : ( ( (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* ) ;
    public final EObject ruleForControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_loopVariableDefinition_0_0 = null;

        EObject lv_loopVariableDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5973:28: ( ( ( (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5974:1: ( ( (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5974:1: ( ( (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5974:2: ( (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) ) (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5974:2: ( (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5975:1: (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5975:1: (lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5976:3: lv_loopVariableDefinition_0_0= ruleLoopVariableDefinition
            {
             
            	        newCompositeNode(grammarAccess.getForControlAccess().getLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLoopVariableDefinition_in_ruleForControl12997);
            lv_loopVariableDefinition_0_0=ruleLoopVariableDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForControlRule());
            	        }
                   		add(
                   			current, 
                   			"loopVariableDefinition",
                    		lv_loopVariableDefinition_0_0, 
                    		"LoopVariableDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5992:2: (otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==22) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5992:4: otherlv_1= ',' ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleForControl13010); 

            	        	newLeafNode(otherlv_1, grammarAccess.getForControlAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5996:1: ( (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5997:1: (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5997:1: (lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:5998:3: lv_loopVariableDefinition_2_0= ruleLoopVariableDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForControlAccess().getLoopVariableDefinitionLoopVariableDefinitionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLoopVariableDefinition_in_ruleForControl13031);
            	    lv_loopVariableDefinition_2_0=ruleLoopVariableDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForControlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"loopVariableDefinition",
            	            		lv_loopVariableDefinition_2_0, 
            	            		"LoopVariableDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForControl"


    // $ANTLR start "entryRuleLoopVariableDefinition"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6022:1: entryRuleLoopVariableDefinition returns [EObject current=null] : iv_ruleLoopVariableDefinition= ruleLoopVariableDefinition EOF ;
    public final EObject entryRuleLoopVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopVariableDefinition = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6023:2: (iv_ruleLoopVariableDefinition= ruleLoopVariableDefinition EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6024:2: iv_ruleLoopVariableDefinition= ruleLoopVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getLoopVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleLoopVariableDefinition_in_entryRuleLoopVariableDefinition13069);
            iv_ruleLoopVariableDefinition=ruleLoopVariableDefinition();

            state._fsp--;

             current =iv_ruleLoopVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopVariableDefinition13079); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopVariableDefinition"


    // $ANTLR start "ruleLoopVariableDefinition"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6031:1: ruleLoopVariableDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) ) ) ;
    public final EObject ruleLoopVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_expression1_2_0 = null;

        EObject lv_expression2_4_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_expression_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6034:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6035:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6035:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? ) | ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==RULE_ID||(LA89_1>=20 && LA89_1<=21)) ) {
                    alt89=2;
                }
                else if ( (LA89_1==79) ) {
                    alt89=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6035:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6035:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )? )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6035:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_expression1_2_0= ruleExpression ) ) (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )?
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6035:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6036:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6036:1: (lv_name_0_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6037:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoopVariableDefinition13122); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getLoopVariableDefinitionAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoopVariableDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleLoopVariableDefinition13139); 

                        	newLeafNode(otherlv_1, grammarAccess.getLoopVariableDefinitionAccess().getInKeyword_0_1());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6057:1: ( (lv_expression1_2_0= ruleExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6058:1: (lv_expression1_2_0= ruleExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6058:1: (lv_expression1_2_0= ruleExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6059:3: lv_expression1_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getExpression1ExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13160);
                    lv_expression1_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression1",
                            		lv_expression1_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6075:2: (otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==61) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6075:4: otherlv_3= '..' ( (lv_expression2_4_0= ruleExpression ) )
                            {
                            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleLoopVariableDefinition13173); 

                                	newLeafNode(otherlv_3, grammarAccess.getLoopVariableDefinitionAccess().getFullStopFullStopKeyword_0_3_0());
                                
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6079:1: ( (lv_expression2_4_0= ruleExpression ) )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6080:1: (lv_expression2_4_0= ruleExpression )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6080:1: (lv_expression2_4_0= ruleExpression )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6081:3: lv_expression2_4_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getExpression2ExpressionParserRuleCall_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13194);
                            lv_expression2_4_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"expression2",
                                    		lv_expression2_4_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6098:6: ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6098:6: ( ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6098:7: ( (lv_type_5_0= ruleQualifiedNameWithBinding ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_expression_8_0= ruleExpression ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6098:7: ( (lv_type_5_0= ruleQualifiedNameWithBinding ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6099:1: (lv_type_5_0= ruleQualifiedNameWithBinding )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6099:1: (lv_type_5_0= ruleQualifiedNameWithBinding )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6100:3: lv_type_5_0= ruleQualifiedNameWithBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getTypeQualifiedNameWithBindingParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleLoopVariableDefinition13225);
                    lv_type_5_0=ruleQualifiedNameWithBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"QualifiedNameWithBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6116:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6117:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6117:1: (lv_name_6_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6118:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoopVariableDefinition13242); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getLoopVariableDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoopVariableDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleLoopVariableDefinition13259); 

                        	newLeafNode(otherlv_7, grammarAccess.getLoopVariableDefinitionAccess().getColonKeyword_1_2());
                        
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6138:1: ( (lv_expression_8_0= ruleExpression ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6139:1: (lv_expression_8_0= ruleExpression )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6139:1: (lv_expression_8_0= ruleExpression )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6140:3: lv_expression_8_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoopVariableDefinitionAccess().getExpressionExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13280);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoopVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_8_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopVariableDefinition"


    // $ANTLR start "entryRuleBreakStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6164:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6165:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6166:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
             newCompositeNode(grammarAccess.getBreakStatementRule()); 
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement13317);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;

             current =iv_ruleBreakStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement13327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6173:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6176:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6177:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6177:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6177:2: () otherlv_1= 'break' otherlv_2= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6177:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6178:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleBreakStatement13373); 

                	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                
            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleBreakStatement13385); 

                	newLeafNode(otherlv_2, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6199:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6200:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6201:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement13421);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement13431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6208:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6211:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6212:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6212:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6212:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleReturnStatement13468); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6216:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6217:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6217:1: (lv_expression_1_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6218:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement13489);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleReturnStatement13501); 

                	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleAcceptStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6246:1: entryRuleAcceptStatement returns [EObject current=null] : iv_ruleAcceptStatement= ruleAcceptStatement EOF ;
    public final EObject entryRuleAcceptStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6247:2: (iv_ruleAcceptStatement= ruleAcceptStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6248:2: iv_ruleAcceptStatement= ruleAcceptStatement EOF
            {
             newCompositeNode(grammarAccess.getAcceptStatementRule()); 
            pushFollow(FOLLOW_ruleAcceptStatement_in_entryRuleAcceptStatement13537);
            iv_ruleAcceptStatement=ruleAcceptStatement();

            state._fsp--;

             current =iv_ruleAcceptStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceptStatement13547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptStatement"


    // $ANTLR start "ruleAcceptStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6255:1: ruleAcceptStatement returns [EObject current=null] : ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) ) ;
    public final EObject ruleAcceptStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;

        EObject lv_simpleAccept_1_0 = null;

        EObject lv_compoundAccept_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6258:28: ( ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6259:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6259:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6259:2: ( (lv_clause_0_0= ruleAcceptClause ) ) ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6259:2: ( (lv_clause_0_0= ruleAcceptClause ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6260:1: (lv_clause_0_0= ruleAcceptClause )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6260:1: (lv_clause_0_0= ruleAcceptClause )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6261:3: lv_clause_0_0= ruleAcceptClause
            {
             
            	        newCompositeNode(grammarAccess.getAcceptStatementAccess().getClauseAcceptClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAcceptClause_in_ruleAcceptStatement13593);
            lv_clause_0_0=ruleAcceptClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAcceptStatementRule());
            	        }
                   		set(
                   			current, 
                   			"clause",
                    		lv_clause_0_0, 
                    		"AcceptClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6277:2: ( ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) ) | ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==67) ) {
                alt90=1;
            }
            else if ( (LA90_0==13) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6277:3: ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6277:3: ( (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6278:1: (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6278:1: (lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6279:3: lv_simpleAccept_1_0= ruleSimpleAcceptStatementCompletion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAcceptStatementAccess().getSimpleAcceptSimpleAcceptStatementCompletionParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleAcceptStatementCompletion_in_ruleAcceptStatement13615);
                    lv_simpleAccept_1_0=ruleSimpleAcceptStatementCompletion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAcceptStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"simpleAccept",
                            		lv_simpleAccept_1_0, 
                            		"SimpleAcceptStatementCompletion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6296:6: ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6296:6: ( (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6297:1: (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6297:1: (lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6298:3: lv_compoundAccept_2_0= ruleCompoundAcceptStatementCompletion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAcceptStatementAccess().getCompoundAcceptCompoundAcceptStatementCompletionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompoundAcceptStatementCompletion_in_ruleAcceptStatement13642);
                    lv_compoundAccept_2_0=ruleCompoundAcceptStatementCompletion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAcceptStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"compoundAccept",
                            		lv_compoundAccept_2_0, 
                            		"CompoundAcceptStatementCompletion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptStatement"


    // $ANTLR start "entryRuleSimpleAcceptStatementCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6322:1: entryRuleSimpleAcceptStatementCompletion returns [EObject current=null] : iv_ruleSimpleAcceptStatementCompletion= ruleSimpleAcceptStatementCompletion EOF ;
    public final EObject entryRuleSimpleAcceptStatementCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAcceptStatementCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6323:2: (iv_ruleSimpleAcceptStatementCompletion= ruleSimpleAcceptStatementCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6324:2: iv_ruleSimpleAcceptStatementCompletion= ruleSimpleAcceptStatementCompletion EOF
            {
             newCompositeNode(grammarAccess.getSimpleAcceptStatementCompletionRule()); 
            pushFollow(FOLLOW_ruleSimpleAcceptStatementCompletion_in_entryRuleSimpleAcceptStatementCompletion13679);
            iv_ruleSimpleAcceptStatementCompletion=ruleSimpleAcceptStatementCompletion();

            state._fsp--;

             current =iv_ruleSimpleAcceptStatementCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAcceptStatementCompletion13689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAcceptStatementCompletion"


    // $ANTLR start "ruleSimpleAcceptStatementCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6331:1: ruleSimpleAcceptStatementCompletion returns [EObject current=null] : ( () otherlv_1= ';' ) ;
    public final EObject ruleSimpleAcceptStatementCompletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6334:28: ( ( () otherlv_1= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6335:1: ( () otherlv_1= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6335:1: ( () otherlv_1= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6335:2: () otherlv_1= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6335:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6336:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleAcceptStatementCompletionAccess().getSimpleAcceptStatementCompletionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleSimpleAcceptStatementCompletion13735); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleAcceptStatementCompletionAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAcceptStatementCompletion"


    // $ANTLR start "entryRuleCompoundAcceptStatementCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6353:1: entryRuleCompoundAcceptStatementCompletion returns [EObject current=null] : iv_ruleCompoundAcceptStatementCompletion= ruleCompoundAcceptStatementCompletion EOF ;
    public final EObject entryRuleCompoundAcceptStatementCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundAcceptStatementCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6354:2: (iv_ruleCompoundAcceptStatementCompletion= ruleCompoundAcceptStatementCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6355:2: iv_ruleCompoundAcceptStatementCompletion= ruleCompoundAcceptStatementCompletion EOF
            {
             newCompositeNode(grammarAccess.getCompoundAcceptStatementCompletionRule()); 
            pushFollow(FOLLOW_ruleCompoundAcceptStatementCompletion_in_entryRuleCompoundAcceptStatementCompletion13771);
            iv_ruleCompoundAcceptStatementCompletion=ruleCompoundAcceptStatementCompletion();

            state._fsp--;

             current =iv_ruleCompoundAcceptStatementCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundAcceptStatementCompletion13781); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundAcceptStatementCompletion"


    // $ANTLR start "ruleCompoundAcceptStatementCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6362:1: ruleCompoundAcceptStatementCompletion returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* ) ;
    public final EObject ruleCompoundAcceptStatementCompletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_block_0_0 = null;

        EObject lv_acceptBlock_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6365:28: ( ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6366:1: ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6366:1: ( ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6366:2: ( (lv_block_0_0= ruleBlock ) ) (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6366:2: ( (lv_block_0_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6367:1: (lv_block_0_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6367:1: (lv_block_0_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6368:3: lv_block_0_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getCompoundAcceptStatementCompletionAccess().getBlockBlockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleCompoundAcceptStatementCompletion13827);
            lv_block_0_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompoundAcceptStatementCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_0_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6384:2: (otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==72) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6384:4: otherlv_1= 'or' ( (lv_acceptBlock_2_0= ruleAcceptBlock ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleCompoundAcceptStatementCompletion13840); 

            	        	newLeafNode(otherlv_1, grammarAccess.getCompoundAcceptStatementCompletionAccess().getOrKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6388:1: ( (lv_acceptBlock_2_0= ruleAcceptBlock ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6389:1: (lv_acceptBlock_2_0= ruleAcceptBlock )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6389:1: (lv_acceptBlock_2_0= ruleAcceptBlock )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6390:3: lv_acceptBlock_2_0= ruleAcceptBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompoundAcceptStatementCompletionAccess().getAcceptBlockAcceptBlockParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAcceptBlock_in_ruleCompoundAcceptStatementCompletion13861);
            	    lv_acceptBlock_2_0=ruleAcceptBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompoundAcceptStatementCompletionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"acceptBlock",
            	            		lv_acceptBlock_2_0, 
            	            		"AcceptBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundAcceptStatementCompletion"


    // $ANTLR start "entryRuleAcceptBlock"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6414:1: entryRuleAcceptBlock returns [EObject current=null] : iv_ruleAcceptBlock= ruleAcceptBlock EOF ;
    public final EObject entryRuleAcceptBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptBlock = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6415:2: (iv_ruleAcceptBlock= ruleAcceptBlock EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6416:2: iv_ruleAcceptBlock= ruleAcceptBlock EOF
            {
             newCompositeNode(grammarAccess.getAcceptBlockRule()); 
            pushFollow(FOLLOW_ruleAcceptBlock_in_entryRuleAcceptBlock13899);
            iv_ruleAcceptBlock=ruleAcceptBlock();

            state._fsp--;

             current =iv_ruleAcceptBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceptBlock13909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptBlock"


    // $ANTLR start "ruleAcceptBlock"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6423:1: ruleAcceptBlock returns [EObject current=null] : ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleAcceptBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6426:28: ( ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6427:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6427:1: ( ( (lv_clause_0_0= ruleAcceptClause ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6427:2: ( (lv_clause_0_0= ruleAcceptClause ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6427:2: ( (lv_clause_0_0= ruleAcceptClause ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6428:1: (lv_clause_0_0= ruleAcceptClause )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6428:1: (lv_clause_0_0= ruleAcceptClause )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6429:3: lv_clause_0_0= ruleAcceptClause
            {
             
            	        newCompositeNode(grammarAccess.getAcceptBlockAccess().getClauseAcceptClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAcceptClause_in_ruleAcceptBlock13955);
            lv_clause_0_0=ruleAcceptClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAcceptBlockRule());
            	        }
                   		set(
                   			current, 
                   			"clause",
                    		lv_clause_0_0, 
                    		"AcceptClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6445:2: ( (lv_block_1_0= ruleBlock ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6446:1: (lv_block_1_0= ruleBlock )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6446:1: (lv_block_1_0= ruleBlock )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6447:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getAcceptBlockAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleAcceptBlock13976);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAcceptBlockRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptBlock"


    // $ANTLR start "entryRuleAcceptClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6471:1: entryRuleAcceptClause returns [EObject current=null] : iv_ruleAcceptClause= ruleAcceptClause EOF ;
    public final EObject entryRuleAcceptClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6472:2: (iv_ruleAcceptClause= ruleAcceptClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6473:2: iv_ruleAcceptClause= ruleAcceptClause EOF
            {
             newCompositeNode(grammarAccess.getAcceptClauseRule()); 
            pushFollow(FOLLOW_ruleAcceptClause_in_entryRuleAcceptClause14012);
            iv_ruleAcceptClause=ruleAcceptClause();

            state._fsp--;

             current =iv_ruleAcceptClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcceptClause14022); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptClause"


    // $ANTLR start "ruleAcceptClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6480:1: ruleAcceptClause returns [EObject current=null] : (otherlv_0= 'accept' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' ) ;
    public final EObject ruleAcceptClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_qualifiedNameList_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6483:28: ( (otherlv_0= 'accept' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6484:1: (otherlv_0= 'accept' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6484:1: (otherlv_0= 'accept' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6484:3: otherlv_0= 'accept' otherlv_1= '(' ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleAcceptClause14059); 

                	newLeafNode(otherlv_0, grammarAccess.getAcceptClauseAccess().getAcceptKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAcceptClause14071); 

                	newLeafNode(otherlv_1, grammarAccess.getAcceptClauseAccess().getLeftParenthesisKeyword_1());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6492:1: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==28) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6492:2: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6492:2: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6493:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6493:1: (lv_name_2_0= RULE_ID )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6494:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAcceptClause14089); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getAcceptClauseAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAcceptClauseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAcceptClause14106); 

                        	newLeafNode(otherlv_3, grammarAccess.getAcceptClauseAccess().getColonKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6514:3: ( (lv_qualifiedNameList_4_0= ruleQualifiedNameList ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6515:1: (lv_qualifiedNameList_4_0= ruleQualifiedNameList )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6515:1: (lv_qualifiedNameList_4_0= ruleQualifiedNameList )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6516:3: lv_qualifiedNameList_4_0= ruleQualifiedNameList
            {
             
            	        newCompositeNode(grammarAccess.getAcceptClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameList_in_ruleAcceptClause14129);
            lv_qualifiedNameList_4_0=ruleQualifiedNameList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAcceptClauseRule());
            	        }
                   		set(
                   			current, 
                   			"qualifiedNameList",
                    		lv_qualifiedNameList_4_0, 
                    		"QualifiedNameList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleAcceptClause14141); 

                	newLeafNode(otherlv_5, grammarAccess.getAcceptClauseAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptClause"


    // $ANTLR start "entryRuleClassifyStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6544:1: entryRuleClassifyStatement returns [EObject current=null] : iv_ruleClassifyStatement= ruleClassifyStatement EOF ;
    public final EObject entryRuleClassifyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifyStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6545:2: (iv_ruleClassifyStatement= ruleClassifyStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6546:2: iv_ruleClassifyStatement= ruleClassifyStatement EOF
            {
             newCompositeNode(grammarAccess.getClassifyStatementRule()); 
            pushFollow(FOLLOW_ruleClassifyStatement_in_entryRuleClassifyStatement14177);
            iv_ruleClassifyStatement=ruleClassifyStatement();

            state._fsp--;

             current =iv_ruleClassifyStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifyStatement14187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifyStatement"


    // $ANTLR start "ruleClassifyStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6553:1: ruleClassifyStatement returns [EObject current=null] : (otherlv_0= 'classify' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' ) ;
    public final EObject ruleClassifyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_1_0 = null;

        EObject lv_clause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6556:28: ( (otherlv_0= 'classify' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6557:1: (otherlv_0= 'classify' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6557:1: (otherlv_0= 'classify' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6557:3: otherlv_0= 'classify' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_clause_2_0= ruleClassificationClause ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleClassifyStatement14224); 

                	newLeafNode(otherlv_0, grammarAccess.getClassifyStatementAccess().getClassifyKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6561:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6562:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6562:1: (lv_expression_1_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6563:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getClassifyStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleClassifyStatement14245);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassifyStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6579:2: ( (lv_clause_2_0= ruleClassificationClause ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6580:1: (lv_clause_2_0= ruleClassificationClause )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6580:1: (lv_clause_2_0= ruleClassificationClause )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6581:3: lv_clause_2_0= ruleClassificationClause
            {
             
            	        newCompositeNode(grammarAccess.getClassifyStatementAccess().getClauseClassificationClauseParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleClassificationClause_in_ruleClassifyStatement14266);
            lv_clause_2_0=ruleClassificationClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassifyStatementRule());
            	        }
                   		set(
                   			current, 
                   			"clause",
                    		lv_clause_2_0, 
                    		"ClassificationClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleClassifyStatement14278); 

                	newLeafNode(otherlv_3, grammarAccess.getClassifyStatementAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifyStatement"


    // $ANTLR start "entryRuleClassificationClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6609:1: entryRuleClassificationClause returns [EObject current=null] : iv_ruleClassificationClause= ruleClassificationClause EOF ;
    public final EObject entryRuleClassificationClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6610:2: (iv_ruleClassificationClause= ruleClassificationClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6611:2: iv_ruleClassificationClause= ruleClassificationClause EOF
            {
             newCompositeNode(grammarAccess.getClassificationClauseRule()); 
            pushFollow(FOLLOW_ruleClassificationClause_in_entryRuleClassificationClause14314);
            iv_ruleClassificationClause=ruleClassificationClause();

            state._fsp--;

             current =iv_ruleClassificationClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassificationClause14324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassificationClause"


    // $ANTLR start "ruleClassificationClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6618:1: ruleClassificationClause returns [EObject current=null] : ( ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) ) ;
    public final EObject ruleClassificationClause() throws RecognitionException {
        EObject current = null;

        EObject lv_classifyFromClause_0_0 = null;

        EObject lv_classifyToClause_1_0 = null;

        EObject lv_reclassyAllClause_2_0 = null;

        EObject lv_classifyToClause_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6621:28: ( ( ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6622:1: ( ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6622:1: ( ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? ) | ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==84) ) {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==RULE_ID) ) {
                    alt95=1;
                }
                else if ( (LA95_1==17) ) {
                    alt95=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA95_0==85) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6622:2: ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6622:2: ( ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )? )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6622:3: ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) ) ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )?
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6622:3: ( (lv_classifyFromClause_0_0= ruleClassificationFromClause ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6623:1: (lv_classifyFromClause_0_0= ruleClassificationFromClause )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6623:1: (lv_classifyFromClause_0_0= ruleClassificationFromClause )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6624:3: lv_classifyFromClause_0_0= ruleClassificationFromClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassificationClauseAccess().getClassifyFromClauseClassificationFromClauseParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassificationFromClause_in_ruleClassificationClause14371);
                    lv_classifyFromClause_0_0=ruleClassificationFromClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"classifyFromClause",
                            		lv_classifyFromClause_0_0, 
                            		"ClassificationFromClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6640:2: ( (lv_classifyToClause_1_0= ruleClassificationToClause ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==85) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6641:1: (lv_classifyToClause_1_0= ruleClassificationToClause )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6641:1: (lv_classifyToClause_1_0= ruleClassificationToClause )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6642:3: lv_classifyToClause_1_0= ruleClassificationToClause
                            {
                             
                            	        newCompositeNode(grammarAccess.getClassificationClauseAccess().getClassifyToClauseClassificationToClauseParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14392);
                            lv_classifyToClause_1_0=ruleClassificationToClause();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"classifyToClause",
                                    		lv_classifyToClause_1_0, 
                                    		"ClassificationToClause");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6659:6: ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6659:6: ( ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6659:7: ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )? ( (lv_classifyToClause_3_0= ruleClassificationToClause ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6659:7: ( (lv_reclassyAllClause_2_0= ruleReclassifyAllClause ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==84) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6660:1: (lv_reclassyAllClause_2_0= ruleReclassifyAllClause )
                            {
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6660:1: (lv_reclassyAllClause_2_0= ruleReclassifyAllClause )
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6661:3: lv_reclassyAllClause_2_0= ruleReclassifyAllClause
                            {
                             
                            	        newCompositeNode(grammarAccess.getClassificationClauseAccess().getReclassyAllClauseReclassifyAllClauseParserRuleCall_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleReclassifyAllClause_in_ruleClassificationClause14422);
                            lv_reclassyAllClause_2_0=ruleReclassifyAllClause();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"reclassyAllClause",
                                    		lv_reclassyAllClause_2_0, 
                                    		"ReclassifyAllClause");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6677:3: ( (lv_classifyToClause_3_0= ruleClassificationToClause ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6678:1: (lv_classifyToClause_3_0= ruleClassificationToClause )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6678:1: (lv_classifyToClause_3_0= ruleClassificationToClause )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6679:3: lv_classifyToClause_3_0= ruleClassificationToClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassificationClauseAccess().getClassifyToClauseClassificationToClauseParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14444);
                    lv_classifyToClause_3_0=ruleClassificationToClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassificationClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"classifyToClause",
                            		lv_classifyToClause_3_0, 
                            		"ClassificationToClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassificationClause"


    // $ANTLR start "entryRuleClassificationFromClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6703:1: entryRuleClassificationFromClause returns [EObject current=null] : iv_ruleClassificationFromClause= ruleClassificationFromClause EOF ;
    public final EObject entryRuleClassificationFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationFromClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6704:2: (iv_ruleClassificationFromClause= ruleClassificationFromClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6705:2: iv_ruleClassificationFromClause= ruleClassificationFromClause EOF
            {
             newCompositeNode(grammarAccess.getClassificationFromClauseRule()); 
            pushFollow(FOLLOW_ruleClassificationFromClause_in_entryRuleClassificationFromClause14481);
            iv_ruleClassificationFromClause=ruleClassificationFromClause();

            state._fsp--;

             current =iv_ruleClassificationFromClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassificationFromClause14491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassificationFromClause"


    // $ANTLR start "ruleClassificationFromClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6712:1: ruleClassificationFromClause returns [EObject current=null] : (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) ) ;
    public final EObject ruleClassificationFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_qualifiedNameList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6715:28: ( (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6716:1: (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6716:1: (otherlv_0= 'from' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6716:3: otherlv_0= 'from' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleClassificationFromClause14528); 

                	newLeafNode(otherlv_0, grammarAccess.getClassificationFromClauseAccess().getFromKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6720:1: ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6721:1: (lv_qualifiedNameList_1_0= ruleQualifiedNameList )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6721:1: (lv_qualifiedNameList_1_0= ruleQualifiedNameList )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6722:3: lv_qualifiedNameList_1_0= ruleQualifiedNameList
            {
             
            	        newCompositeNode(grammarAccess.getClassificationFromClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameList_in_ruleClassificationFromClause14549);
            lv_qualifiedNameList_1_0=ruleQualifiedNameList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassificationFromClauseRule());
            	        }
                   		set(
                   			current, 
                   			"qualifiedNameList",
                    		lv_qualifiedNameList_1_0, 
                    		"QualifiedNameList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassificationFromClause"


    // $ANTLR start "entryRuleClassificationToClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6746:1: entryRuleClassificationToClause returns [EObject current=null] : iv_ruleClassificationToClause= ruleClassificationToClause EOF ;
    public final EObject entryRuleClassificationToClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassificationToClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6747:2: (iv_ruleClassificationToClause= ruleClassificationToClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6748:2: iv_ruleClassificationToClause= ruleClassificationToClause EOF
            {
             newCompositeNode(grammarAccess.getClassificationToClauseRule()); 
            pushFollow(FOLLOW_ruleClassificationToClause_in_entryRuleClassificationToClause14585);
            iv_ruleClassificationToClause=ruleClassificationToClause();

            state._fsp--;

             current =iv_ruleClassificationToClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassificationToClause14595); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassificationToClause"


    // $ANTLR start "ruleClassificationToClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6755:1: ruleClassificationToClause returns [EObject current=null] : (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) ) ;
    public final EObject ruleClassificationToClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_qualifiedNameList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6758:28: ( (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6759:1: (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6759:1: (otherlv_0= 'to' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6759:3: otherlv_0= 'to' ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleClassificationToClause14632); 

                	newLeafNode(otherlv_0, grammarAccess.getClassificationToClauseAccess().getToKeyword_0());
                
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6763:1: ( (lv_qualifiedNameList_1_0= ruleQualifiedNameList ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6764:1: (lv_qualifiedNameList_1_0= ruleQualifiedNameList )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6764:1: (lv_qualifiedNameList_1_0= ruleQualifiedNameList )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6765:3: lv_qualifiedNameList_1_0= ruleQualifiedNameList
            {
             
            	        newCompositeNode(grammarAccess.getClassificationToClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameList_in_ruleClassificationToClause14653);
            lv_qualifiedNameList_1_0=ruleQualifiedNameList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassificationToClauseRule());
            	        }
                   		set(
                   			current, 
                   			"qualifiedNameList",
                    		lv_qualifiedNameList_1_0, 
                    		"QualifiedNameList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassificationToClause"


    // $ANTLR start "entryRuleReclassifyAllClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6789:1: entryRuleReclassifyAllClause returns [EObject current=null] : iv_ruleReclassifyAllClause= ruleReclassifyAllClause EOF ;
    public final EObject entryRuleReclassifyAllClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReclassifyAllClause = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6790:2: (iv_ruleReclassifyAllClause= ruleReclassifyAllClause EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6791:2: iv_ruleReclassifyAllClause= ruleReclassifyAllClause EOF
            {
             newCompositeNode(grammarAccess.getReclassifyAllClauseRule()); 
            pushFollow(FOLLOW_ruleReclassifyAllClause_in_entryRuleReclassifyAllClause14689);
            iv_ruleReclassifyAllClause=ruleReclassifyAllClause();

            state._fsp--;

             current =iv_ruleReclassifyAllClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReclassifyAllClause14699); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReclassifyAllClause"


    // $ANTLR start "ruleReclassifyAllClause"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6798:1: ruleReclassifyAllClause returns [EObject current=null] : ( () otherlv_1= 'from' otherlv_2= '*' ) ;
    public final EObject ruleReclassifyAllClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6801:28: ( ( () otherlv_1= 'from' otherlv_2= '*' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6802:1: ( () otherlv_1= 'from' otherlv_2= '*' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6802:1: ( () otherlv_1= 'from' otherlv_2= '*' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6802:2: () otherlv_1= 'from' otherlv_2= '*'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6802:2: ()
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6803:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReclassifyAllClauseAccess().getReclassifyAllClauseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleReclassifyAllClause14745); 

                	newLeafNode(otherlv_1, grammarAccess.getReclassifyAllClauseAccess().getFromKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReclassifyAllClause14757); 

                	newLeafNode(otherlv_2, grammarAccess.getReclassifyAllClauseAccess().getAsteriskKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReclassifyAllClause"


    // $ANTLR start "entryRuleQualifiedNameList"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6824:1: entryRuleQualifiedNameList returns [EObject current=null] : iv_ruleQualifiedNameList= ruleQualifiedNameList EOF ;
    public final EObject entryRuleQualifiedNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameList = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6825:2: (iv_ruleQualifiedNameList= ruleQualifiedNameList EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6826:2: iv_ruleQualifiedNameList= ruleQualifiedNameList EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameListRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameList_in_entryRuleQualifiedNameList14793);
            iv_ruleQualifiedNameList=ruleQualifiedNameList();

            state._fsp--;

             current =iv_ruleQualifiedNameList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameList14803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameList"


    // $ANTLR start "ruleQualifiedNameList"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6833:1: ruleQualifiedNameList returns [EObject current=null] : ( ( (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* ) ;
    public final EObject ruleQualifiedNameList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_qualifiedName_0_0 = null;

        EObject lv_qualifiedName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6836:28: ( ( ( (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6837:1: ( ( (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6837:1: ( ( (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )* )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6837:2: ( (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) ) (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )*
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6837:2: ( (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6838:1: (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6838:1: (lv_qualifiedName_0_0= ruleQualifiedNameWithBinding )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6839:3: lv_qualifiedName_0_0= ruleQualifiedNameWithBinding
            {
             
            	        newCompositeNode(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameWithBindingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14849);
            lv_qualifiedName_0_0=ruleQualifiedNameWithBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQualifiedNameListRule());
            	        }
                   		add(
                   			current, 
                   			"qualifiedName",
                    		lv_qualifiedName_0_0, 
                    		"QualifiedNameWithBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6855:2: (otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==22) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6855:4: otherlv_1= ',' ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedNameList14862); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameListAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6859:1: ( (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding ) )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6860:1: (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding )
            	    {
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6860:1: (lv_qualifiedName_2_0= ruleQualifiedNameWithBinding )
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6861:3: lv_qualifiedName_2_0= ruleQualifiedNameWithBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualifiedNameListAccess().getQualifiedNameQualifiedNameWithBindingParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14883);
            	    lv_qualifiedName_2_0=ruleQualifiedNameWithBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualifiedNameListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"qualifiedName",
            	            		lv_qualifiedName_2_0, 
            	            		"QualifiedNameWithBinding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameList"


    // $ANTLR start "entryRuleInvocationOrAssignementOrDeclarationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6885:1: entryRuleInvocationOrAssignementOrDeclarationStatement returns [EObject current=null] : iv_ruleInvocationOrAssignementOrDeclarationStatement= ruleInvocationOrAssignementOrDeclarationStatement EOF ;
    public final EObject entryRuleInvocationOrAssignementOrDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationOrAssignementOrDeclarationStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6886:2: (iv_ruleInvocationOrAssignementOrDeclarationStatement= ruleInvocationOrAssignementOrDeclarationStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6887:2: iv_ruleInvocationOrAssignementOrDeclarationStatement= ruleInvocationOrAssignementOrDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule()); 
            pushFollow(FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_entryRuleInvocationOrAssignementOrDeclarationStatement14921);
            iv_ruleInvocationOrAssignementOrDeclarationStatement=ruleInvocationOrAssignementOrDeclarationStatement();

            state._fsp--;

             current =iv_ruleInvocationOrAssignementOrDeclarationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvocationOrAssignementOrDeclarationStatement14931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvocationOrAssignementOrDeclarationStatement"


    // $ANTLR start "ruleInvocationOrAssignementOrDeclarationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6894:1: ruleInvocationOrAssignementOrDeclarationStatement returns [EObject current=null] : ( ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleInvocationOrAssignementOrDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_typePart_OR_assignedPart_OR_invocationPart_0_0 = null;

        EObject lv_variableDeclarationCompletion_1_0 = null;

        EObject lv_assignmentCompletion_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6897:28: ( ( ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6898:1: ( ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6898:1: ( ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6898:2: ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) ) ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )? otherlv_3= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6898:2: ( (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6899:1: (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6899:1: (lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6900:3: lv_typePart_OR_assignedPart_OR_invocationPart_0_0= ruleNameExpression
            {
             
            	        newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getTypePart_OR_assignedPart_OR_invocationPartNameExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNameExpression_in_ruleInvocationOrAssignementOrDeclarationStatement14977);
            lv_typePart_OR_assignedPart_OR_invocationPart_0_0=ruleNameExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"typePart_OR_assignedPart_OR_invocationPart",
                    		lv_typePart_OR_assignedPart_OR_invocationPart_0_0, 
                    		"NameExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6916:2: ( ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) ) | ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) ) )?
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID||LA97_0==51) ) {
                alt97=1;
            }
            else if ( (LA97_0==69||(LA97_0>=102 && LA97_0<=112)) ) {
                alt97=2;
            }
            switch (alt97) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6916:3: ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6916:3: ( (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6917:1: (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6917:1: (lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6918:3: lv_variableDeclarationCompletion_1_0= ruleVariableDeclarationCompletion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getVariableDeclarationCompletionVariableDeclarationCompletionParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDeclarationCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement14999);
                    lv_variableDeclarationCompletion_1_0=ruleVariableDeclarationCompletion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"variableDeclarationCompletion",
                            		lv_variableDeclarationCompletion_1_0, 
                            		"VariableDeclarationCompletion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6935:6: ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6935:6: ( (lv_assignmentCompletion_2_0= ruleAssignmentCompletion ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6936:1: (lv_assignmentCompletion_2_0= ruleAssignmentCompletion )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6936:1: (lv_assignmentCompletion_2_0= ruleAssignmentCompletion )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6937:3: lv_assignmentCompletion_2_0= ruleAssignmentCompletion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getAssignmentCompletionAssignmentCompletionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement15026);
                    lv_assignmentCompletion_2_0=ruleAssignmentCompletion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvocationOrAssignementOrDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"assignmentCompletion",
                            		lv_assignmentCompletion_2_0, 
                            		"AssignmentCompletion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleInvocationOrAssignementOrDeclarationStatement15040); 

                	newLeafNode(otherlv_3, grammarAccess.getInvocationOrAssignementOrDeclarationStatementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvocationOrAssignementOrDeclarationStatement"


    // $ANTLR start "entryRuleSuperInvocationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6965:1: entryRuleSuperInvocationStatement returns [EObject current=null] : iv_ruleSuperInvocationStatement= ruleSuperInvocationStatement EOF ;
    public final EObject entryRuleSuperInvocationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperInvocationStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6966:2: (iv_ruleSuperInvocationStatement= ruleSuperInvocationStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6967:2: iv_ruleSuperInvocationStatement= ruleSuperInvocationStatement EOF
            {
             newCompositeNode(grammarAccess.getSuperInvocationStatementRule()); 
            pushFollow(FOLLOW_ruleSuperInvocationStatement_in_entryRuleSuperInvocationStatement15076);
            iv_ruleSuperInvocationStatement=ruleSuperInvocationStatement();

            state._fsp--;

             current =iv_ruleSuperInvocationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperInvocationStatement15086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperInvocationStatement"


    // $ANTLR start "ruleSuperInvocationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6974:1: ruleSuperInvocationStatement returns [EObject current=null] : ( ( (lv__super_0_0= ruleSuperInvocationExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleSuperInvocationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv__super_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6977:28: ( ( ( (lv__super_0_0= ruleSuperInvocationExpression ) ) otherlv_1= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6978:1: ( ( (lv__super_0_0= ruleSuperInvocationExpression ) ) otherlv_1= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6978:1: ( ( (lv__super_0_0= ruleSuperInvocationExpression ) ) otherlv_1= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6978:2: ( (lv__super_0_0= ruleSuperInvocationExpression ) ) otherlv_1= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6978:2: ( (lv__super_0_0= ruleSuperInvocationExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6979:1: (lv__super_0_0= ruleSuperInvocationExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6979:1: (lv__super_0_0= ruleSuperInvocationExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:6980:3: lv__super_0_0= ruleSuperInvocationExpression
            {
             
            	        newCompositeNode(grammarAccess.getSuperInvocationStatementAccess().get_superSuperInvocationExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSuperInvocationExpression_in_ruleSuperInvocationStatement15132);
            lv__super_0_0=ruleSuperInvocationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSuperInvocationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"_super",
                    		lv__super_0_0, 
                    		"SuperInvocationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleSuperInvocationStatement15144); 

                	newLeafNode(otherlv_1, grammarAccess.getSuperInvocationStatementAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperInvocationStatement"


    // $ANTLR start "entryRuleThisInvocationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7008:1: entryRuleThisInvocationStatement returns [EObject current=null] : iv_ruleThisInvocationStatement= ruleThisInvocationStatement EOF ;
    public final EObject entryRuleThisInvocationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisInvocationStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7009:2: (iv_ruleThisInvocationStatement= ruleThisInvocationStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7010:2: iv_ruleThisInvocationStatement= ruleThisInvocationStatement EOF
            {
             newCompositeNode(grammarAccess.getThisInvocationStatementRule()); 
            pushFollow(FOLLOW_ruleThisInvocationStatement_in_entryRuleThisInvocationStatement15180);
            iv_ruleThisInvocationStatement=ruleThisInvocationStatement();

            state._fsp--;

             current =iv_ruleThisInvocationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThisInvocationStatement15190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThisInvocationStatement"


    // $ANTLR start "ruleThisInvocationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7017:1: ruleThisInvocationStatement returns [EObject current=null] : ( ( (lv__this_0_0= ruleThisExpression ) ) ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' ) ;
    public final EObject ruleThisInvocationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv__this_0_0 = null;

        EObject lv_assignmentCompletion_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7020:28: ( ( ( (lv__this_0_0= ruleThisExpression ) ) ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7021:1: ( ( (lv__this_0_0= ruleThisExpression ) ) ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7021:1: ( ( (lv__this_0_0= ruleThisExpression ) ) ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7021:2: ( (lv__this_0_0= ruleThisExpression ) ) ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )? otherlv_2= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7021:2: ( (lv__this_0_0= ruleThisExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7022:1: (lv__this_0_0= ruleThisExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7022:1: (lv__this_0_0= ruleThisExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7023:3: lv__this_0_0= ruleThisExpression
            {
             
            	        newCompositeNode(grammarAccess.getThisInvocationStatementAccess().get_thisThisExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleThisExpression_in_ruleThisInvocationStatement15236);
            lv__this_0_0=ruleThisExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getThisInvocationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"_this",
                    		lv__this_0_0, 
                    		"ThisExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7039:2: ( (lv_assignmentCompletion_1_0= ruleAssignmentCompletion ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==69||(LA98_0>=102 && LA98_0<=112)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7040:1: (lv_assignmentCompletion_1_0= ruleAssignmentCompletion )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7040:1: (lv_assignmentCompletion_1_0= ruleAssignmentCompletion )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7041:3: lv_assignmentCompletion_1_0= ruleAssignmentCompletion
                    {
                     
                    	        newCompositeNode(grammarAccess.getThisInvocationStatementAccess().getAssignmentCompletionAssignmentCompletionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentCompletion_in_ruleThisInvocationStatement15257);
                    lv_assignmentCompletion_1_0=ruleAssignmentCompletion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThisInvocationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"assignmentCompletion",
                            		lv_assignmentCompletion_1_0, 
                            		"AssignmentCompletion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleThisInvocationStatement15270); 

                	newLeafNode(otherlv_2, grammarAccess.getThisInvocationStatementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThisInvocationStatement"


    // $ANTLR start "entryRuleInstanceCreationInvocationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7069:1: entryRuleInstanceCreationInvocationStatement returns [EObject current=null] : iv_ruleInstanceCreationInvocationStatement= ruleInstanceCreationInvocationStatement EOF ;
    public final EObject entryRuleInstanceCreationInvocationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationInvocationStatement = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7070:2: (iv_ruleInstanceCreationInvocationStatement= ruleInstanceCreationInvocationStatement EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7071:2: iv_ruleInstanceCreationInvocationStatement= ruleInstanceCreationInvocationStatement EOF
            {
             newCompositeNode(grammarAccess.getInstanceCreationInvocationStatementRule()); 
            pushFollow(FOLLOW_ruleInstanceCreationInvocationStatement_in_entryRuleInstanceCreationInvocationStatement15306);
            iv_ruleInstanceCreationInvocationStatement=ruleInstanceCreationInvocationStatement();

            state._fsp--;

             current =iv_ruleInstanceCreationInvocationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceCreationInvocationStatement15316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceCreationInvocationStatement"


    // $ANTLR start "ruleInstanceCreationInvocationStatement"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7078:1: ruleInstanceCreationInvocationStatement returns [EObject current=null] : ( ( (lv__new_0_0= ruleInstanceCreationExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleInstanceCreationInvocationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv__new_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7081:28: ( ( ( (lv__new_0_0= ruleInstanceCreationExpression ) ) otherlv_1= ';' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7082:1: ( ( (lv__new_0_0= ruleInstanceCreationExpression ) ) otherlv_1= ';' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7082:1: ( ( (lv__new_0_0= ruleInstanceCreationExpression ) ) otherlv_1= ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7082:2: ( (lv__new_0_0= ruleInstanceCreationExpression ) ) otherlv_1= ';'
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7082:2: ( (lv__new_0_0= ruleInstanceCreationExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7083:1: (lv__new_0_0= ruleInstanceCreationExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7083:1: (lv__new_0_0= ruleInstanceCreationExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7084:3: lv__new_0_0= ruleInstanceCreationExpression
            {
             
            	        newCompositeNode(grammarAccess.getInstanceCreationInvocationStatementAccess().get_newInstanceCreationExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstanceCreationExpression_in_ruleInstanceCreationInvocationStatement15362);
            lv__new_0_0=ruleInstanceCreationExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceCreationInvocationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"_new",
                    		lv__new_0_0, 
                    		"InstanceCreationExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleInstanceCreationInvocationStatement15374); 

                	newLeafNode(otherlv_1, grammarAccess.getInstanceCreationInvocationStatementAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceCreationInvocationStatement"


    // $ANTLR start "entryRuleVariableDeclarationCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7112:1: entryRuleVariableDeclarationCompletion returns [EObject current=null] : iv_ruleVariableDeclarationCompletion= ruleVariableDeclarationCompletion EOF ;
    public final EObject entryRuleVariableDeclarationCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7113:2: (iv_ruleVariableDeclarationCompletion= ruleVariableDeclarationCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7114:2: iv_ruleVariableDeclarationCompletion= ruleVariableDeclarationCompletion EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationCompletionRule()); 
            pushFollow(FOLLOW_ruleVariableDeclarationCompletion_in_entryRuleVariableDeclarationCompletion15410);
            iv_ruleVariableDeclarationCompletion=ruleVariableDeclarationCompletion();

            state._fsp--;

             current =iv_ruleVariableDeclarationCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarationCompletion15420); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationCompletion"


    // $ANTLR start "ruleVariableDeclarationCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7121:1: ruleVariableDeclarationCompletion returns [EObject current=null] : ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) ) ;
    public final EObject ruleVariableDeclarationCompletion() throws RecognitionException {
        EObject current = null;

        Token lv_multiplicityIndicator_0_0=null;
        Token otherlv_1=null;
        Token lv_variableName_2_0=null;
        EObject lv_initValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7124:28: ( ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7125:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7125:1: ( ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7125:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )? ( (lv_variableName_2_0= RULE_ID ) ) ( (lv_initValue_3_0= ruleAssignmentCompletion ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7125:2: ( ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==51) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7125:3: ( (lv_multiplicityIndicator_0_0= '[' ) ) otherlv_1= ']'
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7125:3: ( (lv_multiplicityIndicator_0_0= '[' ) )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7126:1: (lv_multiplicityIndicator_0_0= '[' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7126:1: (lv_multiplicityIndicator_0_0= '[' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7127:3: lv_multiplicityIndicator_0_0= '['
                    {
                    lv_multiplicityIndicator_0_0=(Token)match(input,51,FOLLOW_51_in_ruleVariableDeclarationCompletion15464); 

                            newLeafNode(lv_multiplicityIndicator_0_0, grammarAccess.getVariableDeclarationCompletionAccess().getMultiplicityIndicatorLeftSquareBracketKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationCompletionRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicityIndicator", true, "[");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleVariableDeclarationCompletion15489); 

                        	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationCompletionAccess().getRightSquareBracketKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7144:3: ( (lv_variableName_2_0= RULE_ID ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7145:1: (lv_variableName_2_0= RULE_ID )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7145:1: (lv_variableName_2_0= RULE_ID )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7146:3: lv_variableName_2_0= RULE_ID
            {
            lv_variableName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarationCompletion15508); 

            			newLeafNode(lv_variableName_2_0, grammarAccess.getVariableDeclarationCompletionAccess().getVariableNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclarationCompletionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7162:2: ( (lv_initValue_3_0= ruleAssignmentCompletion ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7163:1: (lv_initValue_3_0= ruleAssignmentCompletion )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7163:1: (lv_initValue_3_0= ruleAssignmentCompletion )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7164:3: lv_initValue_3_0= ruleAssignmentCompletion
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationCompletionAccess().getInitValueAssignmentCompletionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignmentCompletion_in_ruleVariableDeclarationCompletion15534);
            lv_initValue_3_0=ruleAssignmentCompletion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"initValue",
                    		lv_initValue_3_0, 
                    		"AssignmentCompletion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationCompletion"


    // $ANTLR start "entryRuleAssignmentCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7188:1: entryRuleAssignmentCompletion returns [EObject current=null] : iv_ruleAssignmentCompletion= ruleAssignmentCompletion EOF ;
    public final EObject entryRuleAssignmentCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentCompletion = null;


        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7189:2: (iv_ruleAssignmentCompletion= ruleAssignmentCompletion EOF )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7190:2: iv_ruleAssignmentCompletion= ruleAssignmentCompletion EOF
            {
             newCompositeNode(grammarAccess.getAssignmentCompletionRule()); 
            pushFollow(FOLLOW_ruleAssignmentCompletion_in_entryRuleAssignmentCompletion15570);
            iv_ruleAssignmentCompletion=ruleAssignmentCompletion();

            state._fsp--;

             current =iv_ruleAssignmentCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentCompletion15580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentCompletion"


    // $ANTLR start "ruleAssignmentCompletion"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7197:1: ruleAssignmentCompletion returns [EObject current=null] : ( ( (lv_op_0_0= ruleAssignmentOperator ) ) ( (lv_rightHandSide_1_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignmentCompletion() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_rightHandSide_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7200:28: ( ( ( (lv_op_0_0= ruleAssignmentOperator ) ) ( (lv_rightHandSide_1_0= ruleExpression ) ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7201:1: ( ( (lv_op_0_0= ruleAssignmentOperator ) ) ( (lv_rightHandSide_1_0= ruleExpression ) ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7201:1: ( ( (lv_op_0_0= ruleAssignmentOperator ) ) ( (lv_rightHandSide_1_0= ruleExpression ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7201:2: ( (lv_op_0_0= ruleAssignmentOperator ) ) ( (lv_rightHandSide_1_0= ruleExpression ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7201:2: ( (lv_op_0_0= ruleAssignmentOperator ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7202:1: (lv_op_0_0= ruleAssignmentOperator )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7202:1: (lv_op_0_0= ruleAssignmentOperator )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7203:3: lv_op_0_0= ruleAssignmentOperator
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentCompletionAccess().getOpAssignmentOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentCompletion15626);
            lv_op_0_0=ruleAssignmentOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"AssignmentOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7219:2: ( (lv_rightHandSide_1_0= ruleExpression ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7220:1: (lv_rightHandSide_1_0= ruleExpression )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7220:1: (lv_rightHandSide_1_0= ruleExpression )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7221:3: lv_rightHandSide_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentCompletionAccess().getRightHandSideExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignmentCompletion15647);
            lv_rightHandSide_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentCompletionRule());
            	        }
                   		set(
                   			current, 
                   			"rightHandSide",
                    		lv_rightHandSide_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentCompletion"


    // $ANTLR start "ruleBooleanValue"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7245:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7247:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7248:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7248:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==86) ) {
                alt100=1;
            }
            else if ( (LA100_0==87) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7248:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7248:2: (enumLiteral_0= 'true' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7248:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleBooleanValue15697); 

                            current = grammarAccess.getBooleanValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7254:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7254:6: (enumLiteral_1= 'false' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7254:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleBooleanValue15714); 

                            current = grammarAccess.getBooleanValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFALSEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "ruleLinkOperationKind"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7264:1: ruleLinkOperationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'createLink' ) | (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) ) ;
    public final Enumerator ruleLinkOperationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7266:28: ( ( (enumLiteral_0= 'createLink' ) | (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7267:1: ( (enumLiteral_0= 'createLink' ) | (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7267:1: ( (enumLiteral_0= 'createLink' ) | (enumLiteral_1= 'destroyLink' ) | (enumLiteral_2= 'clearAssoc' ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt101=1;
                }
                break;
            case 89:
                {
                alt101=2;
                }
                break;
            case 90:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7267:2: (enumLiteral_0= 'createLink' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7267:2: (enumLiteral_0= 'createLink' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7267:4: enumLiteral_0= 'createLink'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleLinkOperationKind15759); 

                            current = grammarAccess.getLinkOperationKindAccess().getCREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinkOperationKindAccess().getCREATEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7273:6: (enumLiteral_1= 'destroyLink' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7273:6: (enumLiteral_1= 'destroyLink' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7273:8: enumLiteral_1= 'destroyLink'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleLinkOperationKind15776); 

                            current = grammarAccess.getLinkOperationKindAccess().getDESTROYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLinkOperationKindAccess().getDESTROYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7279:6: (enumLiteral_2= 'clearAssoc' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7279:6: (enumLiteral_2= 'clearAssoc' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7279:8: enumLiteral_2= 'clearAssoc'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleLinkOperationKind15793); 

                            current = grammarAccess.getLinkOperationKindAccess().getCLEAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLinkOperationKindAccess().getCLEAREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkOperationKind"


    // $ANTLR start "ruleSelectOrRejectOperator"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7289:1: ruleSelectOrRejectOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) ) ;
    public final Enumerator ruleSelectOrRejectOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7291:28: ( ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7292:1: ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7292:1: ( (enumLiteral_0= 'select' ) | (enumLiteral_1= 'reject' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==91) ) {
                alt102=1;
            }
            else if ( (LA102_0==92) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7292:2: (enumLiteral_0= 'select' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7292:2: (enumLiteral_0= 'select' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7292:4: enumLiteral_0= 'select'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_91_in_ruleSelectOrRejectOperator15838); 

                            current = grammarAccess.getSelectOrRejectOperatorAccess().getSELECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSelectOrRejectOperatorAccess().getSELECTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7298:6: (enumLiteral_1= 'reject' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7298:6: (enumLiteral_1= 'reject' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7298:8: enumLiteral_1= 'reject'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_92_in_ruleSelectOrRejectOperator15855); 

                            current = grammarAccess.getSelectOrRejectOperatorAccess().getREJECTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSelectOrRejectOperatorAccess().getREJECTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectOrRejectOperator"


    // $ANTLR start "ruleCollectOrIterateOperator"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7308:1: ruleCollectOrIterateOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'collect' ) | (enumLiteral_1= 'iterate' ) ) ;
    public final Enumerator ruleCollectOrIterateOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7310:28: ( ( (enumLiteral_0= 'collect' ) | (enumLiteral_1= 'iterate' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7311:1: ( (enumLiteral_0= 'collect' ) | (enumLiteral_1= 'iterate' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7311:1: ( (enumLiteral_0= 'collect' ) | (enumLiteral_1= 'iterate' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==93) ) {
                alt103=1;
            }
            else if ( (LA103_0==94) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7311:2: (enumLiteral_0= 'collect' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7311:2: (enumLiteral_0= 'collect' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7311:4: enumLiteral_0= 'collect'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleCollectOrIterateOperator15900); 

                            current = grammarAccess.getCollectOrIterateOperatorAccess().getCOLLECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCollectOrIterateOperatorAccess().getCOLLECTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7317:6: (enumLiteral_1= 'iterate' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7317:6: (enumLiteral_1= 'iterate' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7317:8: enumLiteral_1= 'iterate'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleCollectOrIterateOperator15917); 

                            current = grammarAccess.getCollectOrIterateOperatorAccess().getITERATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCollectOrIterateOperatorAccess().getITERATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectOrIterateOperator"


    // $ANTLR start "ruleForAllOrExistsOrOneOperator"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7327:1: ruleForAllOrExistsOrOneOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'one' ) ) ;
    public final Enumerator ruleForAllOrExistsOrOneOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7329:28: ( ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'one' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7330:1: ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'one' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7330:1: ( (enumLiteral_0= 'forAll' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'one' ) )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt104=1;
                }
                break;
            case 96:
                {
                alt104=2;
                }
                break;
            case 97:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7330:2: (enumLiteral_0= 'forAll' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7330:2: (enumLiteral_0= 'forAll' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7330:4: enumLiteral_0= 'forAll'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleForAllOrExistsOrOneOperator15962); 

                            current = grammarAccess.getForAllOrExistsOrOneOperatorAccess().getFORALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getForAllOrExistsOrOneOperatorAccess().getFORALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7336:6: (enumLiteral_1= 'exists' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7336:6: (enumLiteral_1= 'exists' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7336:8: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_96_in_ruleForAllOrExistsOrOneOperator15979); 

                            current = grammarAccess.getForAllOrExistsOrOneOperatorAccess().getEXISTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getForAllOrExistsOrOneOperatorAccess().getEXISTSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7342:6: (enumLiteral_2= 'one' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7342:6: (enumLiteral_2= 'one' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7342:8: enumLiteral_2= 'one'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_97_in_ruleForAllOrExistsOrOneOperator15996); 

                            current = grammarAccess.getForAllOrExistsOrOneOperatorAccess().getONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getForAllOrExistsOrOneOperatorAccess().getONEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForAllOrExistsOrOneOperator"


    // $ANTLR start "ruleAnnotationKind"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7352:1: ruleAnnotationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1= 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) ) ;
    public final Enumerator ruleAnnotationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7354:28: ( ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1= 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7355:1: ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1= 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7355:1: ( (enumLiteral_0= 'isolated' ) | (enumLiteral_1= 'determined' ) | (enumLiteral_2= 'assured' ) | (enumLiteral_3= 'parallel' ) )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt105=1;
                }
                break;
            case 99:
                {
                alt105=2;
                }
                break;
            case 100:
                {
                alt105=3;
                }
                break;
            case 101:
                {
                alt105=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7355:2: (enumLiteral_0= 'isolated' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7355:2: (enumLiteral_0= 'isolated' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7355:4: enumLiteral_0= 'isolated'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleAnnotationKind16041); 

                            current = grammarAccess.getAnnotationKindAccess().getISOLATEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnnotationKindAccess().getISOLATEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7361:6: (enumLiteral_1= 'determined' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7361:6: (enumLiteral_1= 'determined' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7361:8: enumLiteral_1= 'determined'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_99_in_ruleAnnotationKind16058); 

                            current = grammarAccess.getAnnotationKindAccess().getDETERMINEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnnotationKindAccess().getDETERMINEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7367:6: (enumLiteral_2= 'assured' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7367:6: (enumLiteral_2= 'assured' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7367:8: enumLiteral_2= 'assured'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_100_in_ruleAnnotationKind16075); 

                            current = grammarAccess.getAnnotationKindAccess().getASSUREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAnnotationKindAccess().getASSUREDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7373:6: (enumLiteral_3= 'parallel' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7373:6: (enumLiteral_3= 'parallel' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7373:8: enumLiteral_3= 'parallel'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_101_in_ruleAnnotationKind16092); 

                            current = grammarAccess.getAnnotationKindAccess().getPARALLELEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAnnotationKindAccess().getPARALLELEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationKind"


    // $ANTLR start "ruleAssignmentOperator"
    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7383:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) ) ;
    public final Enumerator ruleAssignmentOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7385:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7386:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7386:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '%=' ) | (enumLiteral_5= '/=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) )
            int alt106=12;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt106=1;
                }
                break;
            case 102:
                {
                alt106=2;
                }
                break;
            case 103:
                {
                alt106=3;
                }
                break;
            case 104:
                {
                alt106=4;
                }
                break;
            case 105:
                {
                alt106=5;
                }
                break;
            case 106:
                {
                alt106=6;
                }
                break;
            case 107:
                {
                alt106=7;
                }
                break;
            case 108:
                {
                alt106=8;
                }
                break;
            case 109:
                {
                alt106=9;
                }
                break;
            case 110:
                {
                alt106=10;
                }
                break;
            case 111:
                {
                alt106=11;
                }
                break;
            case 112:
                {
                alt106=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7386:2: (enumLiteral_0= '=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7386:2: (enumLiteral_0= '=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7386:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator16137); 

                            current = grammarAccess.getAssignmentOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7392:6: (enumLiteral_1= '+=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7392:6: (enumLiteral_1= '+=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7392:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_102_in_ruleAssignmentOperator16154); 

                            current = grammarAccess.getAssignmentOperatorAccess().getPLUSASSIGNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getPLUSASSIGNEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7398:6: (enumLiteral_2= '-=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7398:6: (enumLiteral_2= '-=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7398:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_103_in_ruleAssignmentOperator16171); 

                            current = grammarAccess.getAssignmentOperatorAccess().getMINUSASSIGNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getMINUSASSIGNEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7404:6: (enumLiteral_3= '*=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7404:6: (enumLiteral_3= '*=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7404:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_104_in_ruleAssignmentOperator16188); 

                            current = grammarAccess.getAssignmentOperatorAccess().getMULTASSIGNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getMULTASSIGNEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7410:6: (enumLiteral_4= '%=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7410:6: (enumLiteral_4= '%=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7410:8: enumLiteral_4= '%='
                    {
                    enumLiteral_4=(Token)match(input,105,FOLLOW_105_in_ruleAssignmentOperator16205); 

                            current = grammarAccess.getAssignmentOperatorAccess().getMODASSIGNEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getMODASSIGNEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7416:6: (enumLiteral_5= '/=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7416:6: (enumLiteral_5= '/=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7416:8: enumLiteral_5= '/='
                    {
                    enumLiteral_5=(Token)match(input,106,FOLLOW_106_in_ruleAssignmentOperator16222); 

                            current = grammarAccess.getAssignmentOperatorAccess().getDIVASSIGNEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getDIVASSIGNEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7422:6: (enumLiteral_6= '&=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7422:6: (enumLiteral_6= '&=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7422:8: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,107,FOLLOW_107_in_ruleAssignmentOperator16239); 

                            current = grammarAccess.getAssignmentOperatorAccess().getANDASSIGNEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getANDASSIGNEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7428:6: (enumLiteral_7= '|=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7428:6: (enumLiteral_7= '|=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7428:8: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,108,FOLLOW_108_in_ruleAssignmentOperator16256); 

                            current = grammarAccess.getAssignmentOperatorAccess().getORASSIGNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getORASSIGNEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7434:6: (enumLiteral_8= '^=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7434:6: (enumLiteral_8= '^=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7434:8: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,109,FOLLOW_109_in_ruleAssignmentOperator16273); 

                            current = grammarAccess.getAssignmentOperatorAccess().getXORASSIGNEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getXORASSIGNEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7440:6: (enumLiteral_9= '<<=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7440:6: (enumLiteral_9= '<<=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7440:8: enumLiteral_9= '<<='
                    {
                    enumLiteral_9=(Token)match(input,110,FOLLOW_110_in_ruleAssignmentOperator16290); 

                            current = grammarAccess.getAssignmentOperatorAccess().getLSHIFTASSIGNEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getLSHIFTASSIGNEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7446:6: (enumLiteral_10= '>>=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7446:6: (enumLiteral_10= '>>=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7446:8: enumLiteral_10= '>>='
                    {
                    enumLiteral_10=(Token)match(input,111,FOLLOW_111_in_ruleAssignmentOperator16307); 

                            current = grammarAccess.getAssignmentOperatorAccess().getRSHIFTASSIGNEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getAssignmentOperatorAccess().getRSHIFTASSIGNEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7452:6: (enumLiteral_11= '>>>=' )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7452:6: (enumLiteral_11= '>>>=' )
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7452:8: enumLiteral_11= '>>>='
                    {
                    enumLiteral_11=(Token)match(input,112,FOLLOW_112_in_ruleAssignmentOperator16324); 

                            current = grammarAccess.getAssignmentOperatorAccess().getURSHIFTASSIGNEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getAssignmentOperatorAccess().getURSHIFTASSIGNEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentOperator"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA43_eotS =
        "\13\uffff";
    static final String DFA43_eofS =
        "\4\uffff\1\12\6\uffff";
    static final String DFA43_minS =
        "\1\62\2\4\1\uffff\1\4\6\uffff";
    static final String DFA43_maxS =
        "\1\65\1\132\1\141\1\uffff\1\160\6\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\7\1\uffff\1\3\1\6\1\5\1\4\1\1\1\2";
    static final String DFA43_specialS =
        "\13\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\4\71\uffff\1\3\31\uffff\3\5",
            "\1\10\61\uffff\1\7\1\uffff\1\6\42\uffff\7\6",
            "",
            "\1\12\11\uffff\1\12\2\uffff\1\12\3\uffff\3\12\1\uffff\1\11"+
            "\25\12\3\uffff\4\12\7\uffff\1\12\5\uffff\1\12\1\uffff\1\12\16"+
            "\uffff\2\12\20\uffff\13\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2299:1: (this_OperationCallExpression_0= ruleOperationCallExpression | this_PropertyCallExpression_1= rulePropertyCallExpression | this_LinkOperationExpression_2= ruleLinkOperationExpression | this_SequenceOperationExpression_3= ruleSequenceOperationExpression | this_SequenceReductionExpression_4= ruleSequenceReductionExpression | this_SequenceExpansionExpression_5= ruleSequenceExpansionExpression | this_ClassExtentExpression_6= ruleClassExtentExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCLASSSTRUCT_in_entryRuleCLASSSTRUCT75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASSSTRUCT85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCLASSSTRUCT122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASSSTRUCT139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCLASSSTRUCT156 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleCLASSOP_in_ruleCLASSSTRUCT177 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleCLASSSTRUCT190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASSOP_in_entryRuleCLASSOP226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASSOP236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCLASSOP273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCLASSOP290 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCLASSOP307 = new BitSet(new long[]{0x9C000000000C6010L,0x00000000000F725CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCLASSOP328 = new BitSet(new long[]{0x9C000000000C6010L,0x00000000000F725CL});
    public static final BitSet FOLLOW_14_in_ruleCLASSOP341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_entryRuleLITERAL377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLITERAL387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_ruleLITERAL434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleLITERAL461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTRING_LITERAL_in_ruleLITERAL488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBOOLEAN_LITERAL579 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleBOOLEAN_LITERAL600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_ruleNUMBER_LITERAL694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNLIMITED_LITERAL_in_ruleNUMBER_LITERAL721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_entryRuleINTEGER_LITERAL756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_LITERAL766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGERVALUE_in_ruleINTEGER_LITERAL808 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleINTEGER_LITERAL834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNLIMITED_LITERAL_in_entryRuleUNLIMITED_LITERAL871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNLIMITED_LITERAL881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUNLIMITED_LITERAL924 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleUNLIMITED_LITERAL958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTRING_LITERAL_in_entryRuleSTRING_LITERAL995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTRING_LITERAL1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSTRING_LITERAL1047 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSTRING_LITERAL1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpression_in_entryRuleNameExpression1110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameExpression1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNameExpression1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleNameExpression1196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameExpression1251 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamePath_in_ruleNameExpression1285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameExpression1303 = new BitSet(new long[]{0x002C0000020C2002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleNameExpression1330 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_ruleNameExpression1357 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNameExpression1383 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNameExpression1412 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleNameExpression1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamePath_in_entryRuleQualifiedNamePath1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamePath1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedName_in_ruleQualifiedNamePath1546 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedNamePath1558 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleUnqualifiedName_in_entryRuleUnqualifiedName1595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedName1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnqualifiedName1647 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleTemplateBinding_in_ruleUnqualifiedName1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateBinding_in_entryRuleTemplateBinding1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateBinding1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTemplateBinding1757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1778 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTemplateBinding1791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNamedTemplateBinding_in_ruleTemplateBinding1812 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTemplateBinding1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedTemplateBinding_in_entryRuleNamedTemplateBinding1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedTemplateBinding1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedTemplateBinding1914 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNamedTemplateBinding1931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleNamedTemplateBinding1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_entryRuleQualifiedNameWithBinding1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithBinding1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithBinding2040 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleTemplateBinding_in_ruleQualifiedNameWithBinding2066 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedNameWithBinding2080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameWithBinding2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple2139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTuple2195 = new BitSet(new long[]{0x9E039800060E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleTupleElement_in_ruleTuple2217 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleTuple2230 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleTupleElement_in_ruleTuple2251 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleTuple2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleElement_in_entryRuleTupleElement2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleElement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTupleElement2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalTestExpression_in_ruleExpression2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalTestExpression_in_entryRuleConditionalTestExpression2483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalTestExpression2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleConditionalTestExpression2539 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleConditionalTestExpression2552 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2573 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConditionalTestExpression2585 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleConditionalTestExpression_in_ruleConditionalTestExpression2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression2644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2700 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleConditionalOrExpression2713 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2734 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression2772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2828 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleConditionalAndExpression2841 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleInclusiveOrExpression_in_ruleConditionalAndExpression2862 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleInclusiveOrExpression_in_entryRuleInclusiveOrExpression2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclusiveOrExpression2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2956 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleInclusiveOrExpression2969 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_ruleInclusiveOrExpression2990 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_entryRuleExclusiveOrExpression3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExclusiveOrExpression3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression3084 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleExclusiveOrExpression3097 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExclusiveOrExpression3118 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression3212 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAndExpression3225 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression3246 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression3284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3340 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleEqualityExpression3361 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_35_in_ruleEqualityExpression3390 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleClassificationExpression_in_ruleEqualityExpression3427 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleClassificationExpression_in_entryRuleClassificationExpression3465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassificationExpression3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleClassificationExpression3521 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleClassificationExpression3542 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_37_in_ruleClassificationExpression3571 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_ruleNameExpression_in_ruleClassificationExpression3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3702 = new BitSet(new long[]{0x000000C000A00002L});
    public static final BitSet FOLLOW_21_in_ruleRelationalExpression3723 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_23_in_ruleRelationalExpression3752 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_38_in_ruleRelationalExpression3781 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_39_in_ruleRelationalExpression3810 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleRelationalExpression3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3941 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleShiftExpression3962 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_41_in_ruleShiftExpression3991 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_42_in_ruleShiftExpression4020 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression4095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4151 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleAdditiveExpression4172 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_44_in_ruleAdditiveExpression4201 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression4238 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression4276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4332 = new BitSet(new long[]{0x0000600000020002L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicativeExpression4353 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_45_in_ruleMultiplicativeExpression4382 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_46_in_ruleMultiplicativeExpression4411 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression4448 = new BitSet(new long[]{0x0000600000020002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUnaryExpression4541 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_44_in_ruleUnaryExpression4570 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_43_in_ruleUnaryExpression4599 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_48_in_ruleUnaryExpression4628 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_49_in_ruleUnaryExpression4657 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePrimaryExpression4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_entryRuleSuffixExpression4821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuffixExpression4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallExpression_in_ruleSuffixExpression4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCallExpression_in_ruleSuffixExpression4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkOperationExpression_in_ruleSuffixExpression4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceOperationExpression_in_ruleSuffixExpression4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceReductionExpression_in_ruleSuffixExpression4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExpansionExpression_in_ruleSuffixExpression5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassExtentExpression_in_ruleSuffixExpression5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallExpression_in_entryRuleOperationCallExpression5075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallExpression5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOperationCallExpression5122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCallExpression5139 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleOperationCallExpression5165 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleOperationCallExpression5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallExpressionWithoutDot_in_entryRuleOperationCallExpressionWithoutDot5223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallExpressionWithoutDot5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCallExpressionWithoutDot5275 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleOperationCallExpressionWithoutDot5301 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleOperationCallExpressionWithoutDot5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCallExpression_in_entryRulePropertyCallExpression5359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCallExpression5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePropertyCallExpression5406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyCallExpression5423 = new BitSet(new long[]{0x002C000000000002L});
    public static final BitSet FOLLOW_51_in_rulePropertyCallExpression5441 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyCallExpression5462 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_rulePropertyCallExpression5474 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_rulePropertyCallExpression5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkOperationExpression_in_entryRuleLinkOperationExpression5534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperationExpression5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLinkOperationExpression5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleLinkOperationKind_in_ruleLinkOperationExpression5602 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLinkOperationTuple_in_ruleLinkOperationExpression5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkOperationTuple_in_entryRuleLinkOperationTuple5659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperationTuple5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLinkOperationTuple5706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5727 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleLinkOperationTuple5740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLinkOperationTupleElement_in_ruleLinkOperationTuple5761 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleLinkOperationTuple5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkOperationTupleElement_in_entryRuleLinkOperationTupleElement5811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkOperationTupleElement5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkOperationTupleElement5863 = new BitSet(new long[]{0x0008000001000002L});
    public static final BitSet FOLLOW_51_in_ruleLinkOperationTupleElement5882 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLinkOperationTupleElement5903 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleLinkOperationTupleElement5915 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkOperationTupleElement5929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkOperationTupleElement5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceOperationExpression_in_entryRuleSequenceOperationExpression5989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceOperationExpression5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSequenceOperationExpression6036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequenceOperationExpression6053 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleSequenceOperationExpression6079 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSequenceOperationExpression6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceReductionExpression_in_entryRuleSequenceReductionExpression6137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceReductionExpression6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSequenceReductionExpression6184 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSequenceReductionExpression6196 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleSequenceReductionExpression6214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleSequenceReductionExpression6249 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSequenceReductionExpression6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExpansionExpression_in_entryRuleSequenceExpansionExpression6307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceExpansionExpression6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectOrRejectOperation_in_ruleSequenceExpansionExpression6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectOrIterateOperation_in_ruleSequenceExpansionExpression6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAllOrExistsOrOneOperation_in_ruleSequenceExpansionExpression6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsUniqueOperation_in_ruleSequenceExpansionExpression6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectOrRejectOperation_in_entryRuleSelectOrRejectOperation6480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectOrRejectOperation6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSelectOrRejectOperation6527 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleSelectOrRejectOperator_in_ruleSelectOrRejectOperation6548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectOrRejectOperation6565 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSelectOrRejectOperation6582 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectOrRejectOperation6603 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSelectOrRejectOperation6615 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleSelectOrRejectOperation6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectOrIterateOperation_in_entryRuleCollectOrIterateOperation6673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectOrIterateOperation6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCollectOrIterateOperation6720 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_ruleCollectOrIterateOperator_in_ruleCollectOrIterateOperation6741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectOrIterateOperation6758 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCollectOrIterateOperation6775 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCollectOrIterateOperation6796 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCollectOrIterateOperation6808 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleCollectOrIterateOperation6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAllOrExistsOrOneOperation_in_entryRuleForAllOrExistsOrOneOperation6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAllOrExistsOrOneOperation6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleForAllOrExistsOrOneOperation6913 = new BitSet(new long[]{0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_ruleForAllOrExistsOrOneOperator_in_ruleForAllOrExistsOrOneOperation6934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForAllOrExistsOrOneOperation6951 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleForAllOrExistsOrOneOperation6968 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForAllOrExistsOrOneOperation6989 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleForAllOrExistsOrOneOperation7001 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleForAllOrExistsOrOneOperation7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsUniqueOperation_in_entryRuleIsUniqueOperation7059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsUniqueOperation7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIsUniqueOperation7106 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleIsUniqueOperation7118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsUniqueOperation7135 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleIsUniqueOperation7152 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIsUniqueOperation7173 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIsUniqueOperation7185 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleIsUniqueOperation7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpression_in_ruleValueSpecification7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLITERAL_in_ruleValueSpecification7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisExpression_in_ruleValueSpecification7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_ruleValueSpecification7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_ruleValueSpecification7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleValueSpecification7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValueSpecification7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonLiteralValueSpecification_in_entryRuleNonLiteralValueSpecification7497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonLiteralValueSpecification7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpression_in_ruleNonLiteralValueSpecification7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleNonLiteralValueSpecification7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_ruleNonLiteralValueSpecification7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisExpression_in_ruleNonLiteralValueSpecification7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_ruleNonLiteralValueSpecification7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleParenthesizedExpression7744 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7765 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParenthesizedExpression7777 = new BitSet(new long[]{0x9C240000020C2012L,0x00000000000F725CL});
    public static final BitSet FOLLOW_ruleNonLiteralValueSpecification_in_ruleParenthesizedExpression7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleParenthesizedExpression7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression7864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNullExpression7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisExpression_in_entryRuleThisExpression7956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThisExpression7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleThisExpression8012 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleThisExpression8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_entryRuleSuperInvocationExpression8070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperInvocationExpression8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSuperInvocationExpression8117 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleSuperInvocationExpression8131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSuperInvocationExpression8148 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSuperInvocationExpression8165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperationCallExpressionWithoutDot_in_ruleSuperInvocationExpression8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationCallExpression_in_ruleSuperInvocationExpression8214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_entryRuleInstanceCreationExpression8251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceCreationExpression8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleInstanceCreationExpression8298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleInstanceCreationExpression8319 = new BitSet(new long[]{0x0008000002002000L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleInstanceCreationExpression8341 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionCompletion_in_ruleInstanceCreationExpression8368 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_ruleSuffixExpression_in_ruleInstanceCreationExpression8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionOrAccessCompletion_in_entryRuleSequenceConstructionOrAccessCompletion8427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceConstructionOrAccessCompletion8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSequenceConstructionOrAccessCompletion8481 = new BitSet(new long[]{0x9E139800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleAccessCompletion_in_ruleSequenceConstructionOrAccessCompletion8516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialSequenceConstructionCompletion_in_ruleSequenceConstructionOrAccessCompletion8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceConstructionOrAccessCompletion8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessCompletion_in_entryRuleAccessCompletion8608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessCompletion8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAccessCompletion8664 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAccessCompletion8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialSequenceConstructionCompletion_in_entryRulePartialSequenceConstructionCompletion8712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialSequenceConstructionCompletion8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePartialSequenceConstructionCompletion8759 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_rulePartialSequenceConstructionCompletion8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionCompletion_in_entryRuleSequenceConstructionCompletion8816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceConstructionCompletion8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSequenceConstructionCompletion8870 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleSequenceConstructionCompletion8895 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceConstructionCompletion8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_entryRuleSequenceConstructionExpression8954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceConstructionExpression8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSequenceConstructionExpression9001 = new BitSet(new long[]{0x9E0B9800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression9022 = new BitSet(new long[]{0x2000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleSequenceConstructionExpression9036 = new BitSet(new long[]{0x9E0B9800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleSequenceElement_in_ruleSequenceConstructionExpression9057 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_61_in_ruleSequenceConstructionExpression9078 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSequenceConstructionExpression9099 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSequenceConstructionExpression9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceElement_in_entryRuleSequenceElement9149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceElement9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSequenceElement9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceConstructionExpression_in_ruleSequenceElement9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassExtentExpression_in_entryRuleClassExtentExpression9268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassExtentExpression9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleClassExtentExpression9324 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleClassExtentExpression9336 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleClassExtentExpression9348 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleClassExtentExpression9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock9396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBlock9443 = new BitSet(new long[]{0x9C000000000C6190L,0x00000000000F725CL});
    public static final BitSet FOLLOW_ruleStatementSequence_in_ruleBlock9473 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBlock9486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementSequence_in_entryRuleStatementSequence9522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementSequence9532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentedStatement_in_ruleStatementSequence9577 = new BitSet(new long[]{0x9C000000000C2192L,0x00000000000F725CL});
    public static final BitSet FOLLOW_ruleInlineStatement_in_entryRuleInlineStatement9613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineStatement9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleInlineStatement9660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleInlineStatement9672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInlineStatement9689 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInlineStatement9711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleInlineStatement9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotatedStatement_in_entryRuleAnnotatedStatement9764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotatedStatement9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAnnotatedStatement9811 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotatedStatement9832 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAnnotatedStatement9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentedStatement_in_entryRuleDocumentedStatement9889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentedStatement9899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleDocumentedStatement9943 = new BitSet(new long[]{0x9C000000000C2010L,0x00000000000F725CL});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleDocumentedStatement9963 = new BitSet(new long[]{0x9C000000000C2010L,0x00000000000F725CL});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDocumentedStatement9993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement10029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotatedStatement_in_ruleStatement10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineStatement_in_ruleStatement10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleStatement10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_ruleStatement10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalNameDeclarationStatement_in_ruleStatement10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoStatement_in_ruleStatement10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement10383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceptStatement_in_ruleStatement10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifyStatement_in_ruleStatement10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_ruleStatement10464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperInvocationStatement_in_ruleStatement10491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisInvocationStatement_in_ruleStatement10518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceCreationInvocationStatement_in_ruleStatement10545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation10580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation10590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationKind_in_ruleAnnotation10636 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAnnotation10649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation10666 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation10684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation10701 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleAnnotation10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement10758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockStatement10813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyStatement_in_entryRuleEmptyStatement10848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyStatement10858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleEmptyStatement10904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalNameDeclarationStatement_in_entryRuleLocalNameDeclarationStatement10940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalNameDeclarationStatement10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLocalNameDeclarationStatement10987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalNameDeclarationStatement11004 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLocalNameDeclarationStatement11021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleLocalNameDeclarationStatement11042 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51_in_ruleLocalNameDeclarationStatement11061 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleLocalNameDeclarationStatement11086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleLocalNameDeclarationStatement11100 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalNameDeclarationStatement11121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleLocalNameDeclarationStatement11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement11169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleIfStatement11216 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleSequentialClauses_in_ruleIfStatement11237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFinalClause_in_ruleIfStatement11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequentialClauses_in_entryRuleSequentialClauses11295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequentialClauses11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleSequentialClauses11364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSequentialClauses11376 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConcurrentClauses_in_ruleSequentialClauses11397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleConcurrentClauses_in_entryRuleConcurrentClauses11435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcurrentClauses11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleConcurrentClauses11504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleConcurrentClauses11516 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleNonFinalClause_in_ruleConcurrentClauses11537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleNonFinalClause_in_entryRuleNonFinalClause11575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonFinalClause11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNonFinalClause11622 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNonFinalClause11643 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNonFinalClause11655 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleNonFinalClause11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinalClause_in_entryRuleFinalClause11712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinalClause11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleFinalClause11759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFinalClause11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement11816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSwitchStatement11863 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSwitchStatement11875 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchStatement11896 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSwitchStatement11908 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSwitchStatement11920 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleSwitchClause_in_ruleSwitchStatement11941 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleSwitchDefaultClause_in_ruleSwitchStatement11963 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSwitchStatement11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchClause_in_entryRuleSwitchClause12012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchClause12022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchClause12068 = new BitSet(new long[]{0x9C000000000C2190L,0x00000000000F765CL});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchClause12089 = new BitSet(new long[]{0x9C000000000C2190L,0x00000000000F765CL});
    public static final BitSet FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchClause12111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase12147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase12157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSwitchCase12194 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchCase12215 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSwitchCase12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchDefaultClause_in_entryRuleSwitchDefaultClause12263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchDefaultClause12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSwitchDefaultClause12310 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSwitchDefaultClause12322 = new BitSet(new long[]{0x9C000000000C2190L,0x00000000000F765CL});
    public static final BitSet FOLLOW_ruleNonEmptyStatementSequence_in_ruleSwitchDefaultClause12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonEmptyStatementSequence_in_entryRuleNonEmptyStatementSequence12379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonEmptyStatementSequence12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentedStatement_in_ruleNonEmptyStatementSequence12434 = new BitSet(new long[]{0x9C000000000C2192L,0x00000000000F725CL});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement12470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleWhileStatement12517 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleWhileStatement12529 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileStatement12550 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleWhileStatement12562 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleWhileStatement12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoStatement_in_entryRuleDoStatement12619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoStatement12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDoStatement12666 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleDoStatement12687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleDoStatement12699 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDoStatement12711 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDoStatement12732 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDoStatement12744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleDoStatement12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement12792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement12802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleForStatement12839 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleForStatement12851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleForControl_in_ruleForStatement12872 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleForStatement12884 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleForStatement12905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForControl_in_entryRuleForControl12941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForControl12951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopVariableDefinition_in_ruleForControl12997 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleForControl13010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLoopVariableDefinition_in_ruleForControl13031 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleLoopVariableDefinition_in_entryRuleLoopVariableDefinition13069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopVariableDefinition13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariableDefinition13122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleLoopVariableDefinition13139 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13160 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLoopVariableDefinition13173 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleLoopVariableDefinition13225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoopVariableDefinition13242 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLoopVariableDefinition13259 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopVariableDefinition13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement13317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBreakStatement13373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleBreakStatement13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement13421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleReturnStatement13468 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement13489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleReturnStatement13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceptStatement_in_entryRuleAcceptStatement13537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceptStatement13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceptClause_in_ruleAcceptStatement13593 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSimpleAcceptStatementCompletion_in_ruleAcceptStatement13615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundAcceptStatementCompletion_in_ruleAcceptStatement13642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAcceptStatementCompletion_in_entryRuleSimpleAcceptStatementCompletion13679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAcceptStatementCompletion13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSimpleAcceptStatementCompletion13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundAcceptStatementCompletion_in_entryRuleCompoundAcceptStatementCompletion13771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundAcceptStatementCompletion13781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCompoundAcceptStatementCompletion13827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleCompoundAcceptStatementCompletion13840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleAcceptBlock_in_ruleCompoundAcceptStatementCompletion13861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleAcceptBlock_in_entryRuleAcceptBlock13899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceptBlock13909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceptClause_in_ruleAcceptBlock13955 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAcceptBlock13976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcceptClause_in_entryRuleAcceptClause14012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcceptClause14022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAcceptClause14059 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAcceptClause14071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAcceptClause14089 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAcceptClause14106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameList_in_ruleAcceptClause14129 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAcceptClause14141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifyStatement_in_entryRuleClassifyStatement14177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifyStatement14187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleClassifyStatement14224 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleClassifyStatement14245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleClassificationClause_in_ruleClassifyStatement14266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleClassifyStatement14278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassificationClause_in_entryRuleClassificationClause14314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassificationClause14324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassificationFromClause_in_ruleClassificationClause14371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReclassifyAllClause_in_ruleClassificationClause14422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleClassificationToClause_in_ruleClassificationClause14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassificationFromClause_in_entryRuleClassificationFromClause14481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassificationFromClause14491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleClassificationFromClause14528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameList_in_ruleClassificationFromClause14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassificationToClause_in_entryRuleClassificationToClause14585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassificationToClause14595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleClassificationToClause14632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameList_in_ruleClassificationToClause14653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReclassifyAllClause_in_entryRuleReclassifyAllClause14689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReclassifyAllClause14699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleReclassifyAllClause14745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReclassifyAllClause14757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameList_in_entryRuleQualifiedNameList14793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameList14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14849 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedNameList14862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithBinding_in_ruleQualifiedNameList14883 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleInvocationOrAssignementOrDeclarationStatement_in_entryRuleInvocationOrAssignementOrDeclarationStatement14921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvocationOrAssignementOrDeclarationStatement14931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameExpression_in_ruleInvocationOrAssignementOrDeclarationStatement14977 = new BitSet(new long[]{0x0008000000000010L,0x0001FFC000000028L});
    public static final BitSet FOLLOW_ruleVariableDeclarationCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement14999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleAssignmentCompletion_in_ruleInvocationOrAssignementOrDeclarationStatement15026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleInvocationOrAssignementOrDeclarationStatement15040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperInvocationStatement_in_entryRuleSuperInvocationStatement15076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperInvocationStatement15086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperInvocationExpression_in_ruleSuperInvocationStatement15132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSuperInvocationStatement15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisInvocationStatement_in_entryRuleThisInvocationStatement15180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThisInvocationStatement15190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisExpression_in_ruleThisInvocationStatement15236 = new BitSet(new long[]{0x0000000000000000L,0x0001FFC000000028L});
    public static final BitSet FOLLOW_ruleAssignmentCompletion_in_ruleThisInvocationStatement15257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleThisInvocationStatement15270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceCreationInvocationStatement_in_entryRuleInstanceCreationInvocationStatement15306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceCreationInvocationStatement15316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceCreationExpression_in_ruleInstanceCreationInvocationStatement15362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleInstanceCreationInvocationStatement15374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationCompletion_in_entryRuleVariableDeclarationCompletion15410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationCompletion15420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVariableDeclarationCompletion15464 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleVariableDeclarationCompletion15489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationCompletion15508 = new BitSet(new long[]{0x0000000000000000L,0x0001FFC000000020L});
    public static final BitSet FOLLOW_ruleAssignmentCompletion_in_ruleVariableDeclarationCompletion15534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentCompletion_in_entryRuleAssignmentCompletion15570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentCompletion15580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentCompletion15626 = new BitSet(new long[]{0x9E039800020E2070L,0x0000000000CF725CL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignmentCompletion15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleBooleanValue15697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBooleanValue15714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLinkOperationKind15759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLinkOperationKind15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLinkOperationKind15793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleSelectOrRejectOperator15838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleSelectOrRejectOperator15855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCollectOrIterateOperator15900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCollectOrIterateOperator15917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleForAllOrExistsOrOneOperator15962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleForAllOrExistsOrOneOperator15979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleForAllOrExistsOrOneOperator15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleAnnotationKind16041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleAnnotationKind16058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleAnnotationKind16075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleAnnotationKind16092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator16137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleAssignmentOperator16154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleAssignmentOperator16171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAssignmentOperator16188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAssignmentOperator16205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAssignmentOperator16222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAssignmentOperator16239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAssignmentOperator16256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleAssignmentOperator16273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleAssignmentOperator16290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleAssignmentOperator16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleAssignmentOperator16324 = new BitSet(new long[]{0x0000000000000002L});

}