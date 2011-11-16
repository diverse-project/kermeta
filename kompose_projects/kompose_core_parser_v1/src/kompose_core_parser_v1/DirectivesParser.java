// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g 2010-09-20 10:50:52

package kompose_core_parser_v1;

import directives.*;
import directives.impl.DirectivesPackageImpl;

import kompose.*;
import kompose.impl.KomposePackageImpl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DirectivesParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "UNION", "INTER", "LCURLY", "RCURLY", "CREATE", "AS", "DESTROY", "MERGE", "LP", "COMMA", "RP", "CONCAT", "EQUALS", "PLUS", "MINUS", "META_ID", "DOLLAR", "ID", "COL_COL", "DOT", "TRUE", "FALSE", "INT_LITERAL", "PRE", "POST", "ESC", "DIGIT", "WS", "SingleLineComment", "MultiLineComment", "'EXT'", "'MODE'", "'PM'", "'AM'", "'CM'", "'PMPre'", "'AMPre'", "'Post'"
    };
    public static final int DOLLAR=21;
    public static final int T__42=42;
    public static final int DESTROY=11;
    public static final int T__40=40;
    public static final int INT_LITERAL=27;
    public static final int T__41=41;
    public static final int SingleLineComment=33;
    public static final int CONCAT=16;
    public static final int RP=15;
    public static final int ESC=30;
    public static final int MERGE=12;
    public static final int LP=13;
    public static final int COL_COL=23;
    public static final int INTER=6;
    public static final int LCURLY=7;
    public static final int PRE=28;
    public static final int EQUALS=17;
    public static final int META_ID=20;
    public static final int MINUS=19;
    public static final int ID=22;
    public static final int EOF=-1;
    public static final int TRUE=25;
    public static final int UNION=5;
    public static final int AS=10;
    public static final int CREATE=9;
    public static final int WS=32;
    public static final int STRING_LITERAL=4;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int COMMA=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RCURLY=8;
    public static final int POST=29;
    public static final int PLUS=18;
    public static final int DIGIT=31;
    public static final int DOT=24;
    public static final int FALSE=26;
    public static final int MultiLineComment=34;

    // delegates
    // delegators


        public DirectivesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DirectivesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DirectivesParser.tokenNames; }
    public String getGrammarFileName() { return "/home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g"; }


      private static DirectivesFactory directives_factory = DirectivesPackageImpl.init().getDirectivesFactory();
      private static KomposeFactory kompose_factory = KomposePackageImpl.init().getKomposeFactory();
      
      public static void main(String[] args) throws Exception {
        DirectivesLexer lexer = new DirectivesLexer(new ANTLRFileStream("/home/mclavreu/main_workspace/kompose_directives/tests/kompose.kompt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DirectivesParser parser = new DirectivesParser(tokens);
        try {
          parser.start();
        } catch (RecognitionException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      public ArrayList<String> errors = new ArrayList<String>();
      public ArrayList<String> warnings = new ArrayList<String>();
      
      public boolean hasErrors() {
        return !errors.isEmpty(); 
      }
      
      public void reportError(RecognitionException ex) {
        super.reportError(ex);
        errors.add(ex.toString());
      }
      
      public String getString(ElementRef r) {
        if (r instanceof Literal){
          return ("\""+((Literal)r).toString()+"\"");
        }
        else {
          if (r instanceof PropRef){
            String s = getString(((PropRef)r).getObject());
            s += "::"+((PropRef)r).getProperty();
            return s;
          }
          else {
            if (r instanceof NameRef)
              return ((NameRef)r).getQname();
            else
              return "$"+((IDRef)r).getIdentifier();
          }
        }
      }



    // $ANTLR start "start"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:66:1: start returns [Context ctx = kompose_factory.createContext();] : 'EXT' ext= STRING_LITERAL ( 'MODE' ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY ;
    public final Context start() throws RecognitionException {
        Context ctx =  kompose_factory.createContext();;

        Token ext=null;
        Token pm=null;
        Token am=null;
        Token cm=null;
        ArrayList<ElementDirective> pmpre = null;

        ArrayList<ElementDirective> ampre = null;

        ArrayList<ElementDirective> post = null;



            System.out.println("Starting parser...");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:79:3: ( 'EXT' ext= STRING_LITERAL ( 'MODE' ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:80:3: 'EXT' ext= STRING_LITERAL ( 'MODE' ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY
            {
            match(input,35,FOLLOW_35_in_start69); 
            ext=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_start73); 
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:81:3: ( 'MODE' ( UNION | INTER ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:81:4: 'MODE' ( UNION | INTER )
                    {
                    match(input,36,FOLLOW_36_in_start78); 
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:81:11: ( UNION | INTER )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==UNION) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==INTER) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:81:12: UNION
                            {
                            match(input,UNION,FOLLOW_UNION_in_start81); 
                            ctx.setMode(Modes.UNION);

                            }
                            break;
                        case 2 :
                            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:81:48: INTER
                            {
                            match(input,INTER,FOLLOW_INTER_in_start87); 
                            ctx.setMode(Modes.INTERSECTION);

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,37,FOLLOW_37_in_start96); 
            pm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_start100); 
            match(input,38,FOLLOW_38_in_start104); 
            am=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_start108); 
            match(input,39,FOLLOW_39_in_start112); 
            cm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_start116); 
            match(input,40,FOLLOW_40_in_start123); 
            match(input,LCURLY,FOLLOW_LCURLY_in_start125); 
            pushFollow(FOLLOW_directives_in_start129);
            pmpre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_start131); 
            match(input,41,FOLLOW_41_in_start135); 
            match(input,LCURLY,FOLLOW_LCURLY_in_start137); 
            pushFollow(FOLLOW_directives_in_start141);
            ampre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_start143); 
            match(input,42,FOLLOW_42_in_start148); 
            match(input,LCURLY,FOLLOW_LCURLY_in_start150); 
            pushFollow(FOLLOW_directives_in_start154);
            post=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_start156); 

            }


                ctx.setMetamodelName((ext!=null?ext.getText():null).substring(1, (ext!=null?ext.getText():null).length()-1));
                ctx.setAspectModelURI((am!=null?am.getText():null).substring(1, (am!=null?am.getText():null).length()-1));
                ctx.setPrimaryModelURI((pm!=null?pm.getText():null).substring(1, (pm!=null?pm.getText():null).length()-1));
                ctx.setComposedModelURI((cm!=null?cm.getText():null).substring(1, (cm!=null?cm.getText():null).length()-1));
                ctx.getPredirectivesPM().addAll(pmpre);
                ctx.getPredirectivesAM().addAll(ampre);
                ctx.getPostdirectives().addAll(post);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ctx;
    }
    // $ANTLR end "start"


    // $ANTLR start "directives"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:92:1: directives returns [ArrayList<ElementDirective> lst = new ArrayList<ElementDirective>()] : (d= directive )* ;
    public final ArrayList<ElementDirective> directives() throws RecognitionException {
        ArrayList<ElementDirective> lst =  new ArrayList<ElementDirective>();

        ElementDirective d = null;



            System.out.println("Directives");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:99:3: ( (d= directive )* )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:100:3: (d= directive )*
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:100:3: (d= directive )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CREATE||(LA3_0>=DESTROY && LA3_0<=MERGE)||(LA3_0>=DOLLAR && LA3_0<=ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:100:4: d= directive
            	    {
            	    pushFollow(FOLLOW_directive_in_directives188);
            	    d=directive();

            	    state._fsp--;

            	    lst.add(d);

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


                System.out.println("End Directives");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lst;
    }
    // $ANTLR end "directives"


    // $ANTLR start "directive"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:103:1: directive returns [ElementDirective d] : ( unaryDirective | binaryDirective );
    public final ElementDirective directive() throws RecognitionException {
        ElementDirective d = null;

        UnaryDirective unaryDirective1 = null;

        BinaryDirective binaryDirective2 = null;



            System.out.println("Directive");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:110:3: ( unaryDirective | binaryDirective )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CREATE||LA4_0==DESTROY) ) {
                alt4=1;
            }
            else if ( (LA4_0==MERGE||(LA4_0>=DOLLAR && LA4_0<=ID)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:111:3: unaryDirective
                    {
                    pushFollow(FOLLOW_unaryDirective_in_directive221);
                    unaryDirective1=unaryDirective();

                    state._fsp--;

                    d =unaryDirective1;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:111:44: binaryDirective
                    {
                    pushFollow(FOLLOW_binaryDirective_in_directive227);
                    binaryDirective2=binaryDirective();

                    state._fsp--;

                    d =binaryDirective2;

                    }
                    break;

            }

                System.out.println("End Directive");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "directive"


    // $ANTLR start "unaryDirective"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:114:1: unaryDirective returns [UnaryDirective d] : ( createD | destroyD );
    public final UnaryDirective unaryDirective() throws RecognitionException {
        UnaryDirective d = null;

        Create createD3 = null;

        Destroy destroyD4 = null;



            System.out.println("UnaryDirective");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:121:3: ( createD | destroyD )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CREATE) ) {
                alt5=1;
            }
            else if ( (LA5_0==DESTROY) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:122:3: createD
                    {
                    pushFollow(FOLLOW_createD_in_unaryDirective258);
                    createD3=createD();

                    state._fsp--;

                    d =createD3;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:122:31: destroyD
                    {
                    pushFollow(FOLLOW_destroyD_in_unaryDirective265);
                    destroyD4=destroyD();

                    state._fsp--;

                    d =destroyD4;

                    }
                    break;

            }

                System.out.println("End UnaryDirective");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "unaryDirective"


    // $ANTLR start "binaryDirective"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:125:1: binaryDirective returns [BinaryDirective d] : ( targetD | mergeD );
    public final BinaryDirective binaryDirective() throws RecognitionException {
        BinaryDirective d = null;

        BinaryDirective targetD5 = null;

        Merge mergeD6 = null;



            System.out.println("BinaryDirective");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:132:3: ( targetD | mergeD )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=DOLLAR && LA6_0<=ID)) ) {
                alt6=1;
            }
            else if ( (LA6_0==MERGE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:133:3: targetD
                    {
                    pushFollow(FOLLOW_targetD_in_binaryDirective297);
                    targetD5=targetD();

                    state._fsp--;

                    d =targetD5;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:133:31: mergeD
                    {
                    pushFollow(FOLLOW_mergeD_in_binaryDirective304);
                    mergeD6=mergeD();

                    state._fsp--;

                    d =mergeD6;

                    }
                    break;

            }

                System.out.println("End BinaryDirective");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "binaryDirective"


    // $ANTLR start "createD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:137:1: createD returns [Create d = directives_factory.createCreate()] : CREATE meta= metaRefD AS target= idRefD ;
    public final Create createD() throws RecognitionException {
        Create d =  directives_factory.createCreate();

        MetaRef meta = null;

        IDRef target = null;



            System.out.println("Create");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:146:3: ( CREATE meta= metaRefD AS target= idRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:147:3: CREATE meta= metaRefD AS target= idRefD
            {
            match(input,CREATE,FOLLOW_CREATE_in_createD336); 
            pushFollow(FOLLOW_metaRefD_in_createD340);
            meta=metaRefD();

            state._fsp--;

            d.setType(meta);
            match(input,AS,FOLLOW_AS_in_createD344); 
            pushFollow(FOLLOW_idRefD_in_createD348);
            target=idRefD();

            state._fsp--;

            d.setTarget(target);

            }


                d.setClassName(meta.getName());
                System.out.println("Create "+d.getType().getName()+" AS "+d.getTarget().toString());
                System.out.println("End Create");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "createD"


    // $ANTLR start "destroyD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:150:1: destroyD returns [Destroy d = directives_factory.createDestroy()] : DESTROY target= nameRefD ;
    public final Destroy destroyD() throws RecognitionException {
        Destroy d =  directives_factory.createDestroy();

        NameRef target = null;



            System.out.println("Destroy");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:157:3: ( DESTROY target= nameRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:158:3: DESTROY target= nameRefD
            {
            match(input,DESTROY,FOLLOW_DESTROY_in_destroyD379); 
            pushFollow(FOLLOW_nameRefD_in_destroyD383);
            target=nameRefD();

            state._fsp--;

            d.setTarget(target);

            }


                System.out.println("End Destroy");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "destroyD"


    // $ANTLR start "mergeD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:162:1: mergeD returns [Merge d = directives_factory.createMerge()] : MERGE LP target= nameRefD COMMA value= nameRefD RP ;
    public final Merge mergeD() throws RecognitionException {
        Merge d =  directives_factory.createMerge();

        NameRef target = null;

        NameRef value = null;



            System.out.println("Merge");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:169:3: ( MERGE LP target= nameRefD COMMA value= nameRefD RP )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:170:3: MERGE LP target= nameRefD COMMA value= nameRefD RP
            {
            match(input,MERGE,FOLLOW_MERGE_in_mergeD415); 
            match(input,LP,FOLLOW_LP_in_mergeD417); 
            pushFollow(FOLLOW_nameRefD_in_mergeD421);
            target=nameRefD();

            state._fsp--;

            d.setTarget(target);
            match(input,COMMA,FOLLOW_COMMA_in_mergeD425); 
            pushFollow(FOLLOW_nameRefD_in_mergeD429);
            value=nameRefD();

            state._fsp--;

            d.getValue().add(value);
            match(input,RP,FOLLOW_RP_in_mergeD433); 

            }


                System.out.println("End Merge");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "mergeD"


    // $ANTLR start "targetD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:173:1: targetD returns [BinaryDirective d] : target= targetRefD ( concatD | changeD ) ;
    public final BinaryDirective targetD() throws RecognitionException {
        BinaryDirective d = null;

        ElementRef target = null;

        Concat concatD7 = null;

        Change changeD8 = null;



            System.out.println("TargetD");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:181:3: (target= targetRefD ( concatD | changeD ) )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:182:3: target= targetRefD ( concatD | changeD )
            {
            pushFollow(FOLLOW_targetRefD_in_targetD465);
            target=targetRefD();

            state._fsp--;

            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:182:21: ( concatD | changeD )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CONCAT) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=EQUALS && LA7_0<=MINUS)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:182:22: concatD
                    {
                    pushFollow(FOLLOW_concatD_in_targetD468);
                    concatD7=concatD();

                    state._fsp--;

                    d=concatD7;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:182:48: changeD
                    {
                    pushFollow(FOLLOW_changeD_in_targetD474);
                    changeD8=changeD();

                    state._fsp--;

                    d=changeD8; ((Change)d).setPropertyName(getString(target));

                    }
                    break;

            }


            }


                System.out.println("End TargetD");
                d.setTarget(target);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "targetD"


    // $ANTLR start "concatD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:185:1: concatD returns [Concat d = directives_factory.createConcat()] : CONCAT r1= eltRefD_valueRefD_mandatory ( COMMA (rn= eltRefD_valueRefD_mandatory ) )* ;
    public final Concat concatD() throws RecognitionException {
        Concat d =  directives_factory.createConcat();

        ElementRef r1 = null;

        ElementRef rn = null;



            ArrayList<ElementRef> list = new ArrayList<ElementRef>();
            System.out.println("Concat");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:198:3: ( CONCAT r1= eltRefD_valueRefD_mandatory ( COMMA (rn= eltRefD_valueRefD_mandatory ) )* )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:199:3: CONCAT r1= eltRefD_valueRefD_mandatory ( COMMA (rn= eltRefD_valueRefD_mandatory ) )*
            {
            match(input,CONCAT,FOLLOW_CONCAT_in_concatD506); 
            pushFollow(FOLLOW_eltRefD_valueRefD_mandatory_in_concatD510);
            r1=eltRefD_valueRefD_mandatory();

            state._fsp--;

             list.add(r1); 
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:201:3: ( COMMA (rn= eltRefD_valueRefD_mandatory ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:201:4: COMMA (rn= eltRefD_valueRefD_mandatory )
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concatD519); 
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:201:10: (rn= eltRefD_valueRefD_mandatory )
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:201:11: rn= eltRefD_valueRefD_mandatory
            	    {
            	    pushFollow(FOLLOW_eltRefD_valueRefD_mandatory_in_concatD524);
            	    rn=eltRefD_valueRefD_mandatory();

            	    state._fsp--;

            	     list.add(rn); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


                for (ElementRef r: list) {
                  d.getPropertyNames().add(getString(r));
                  d.getValue().add(r);
                }
                //d.getPropertyNames().addAll(ElementRef);
                System.out.println("End Concat");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "concatD"


    // $ANTLR start "changeD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:223:1: changeD returns [Change d] : ( setD | addD | removeD );
    public final Change changeD() throws RecognitionException {
        Change d = null;

        Set setD9 = null;

        Add addD10 = null;

        Remove removeD11 = null;



            System.out.println("Change");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:230:3: ( setD | addD | removeD )
            int alt9=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt9=1;
                }
                break;
            case PLUS:
                {
                alt9=2;
                }
                break;
            case MINUS:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:231:3: setD
                    {
                    pushFollow(FOLLOW_setD_in_changeD569);
                    setD9=setD();

                    state._fsp--;

                    d =setD9;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:231:24: addD
                    {
                    pushFollow(FOLLOW_addD_in_changeD575);
                    addD10=addD();

                    state._fsp--;

                    d =addD10;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:231:45: removeD
                    {
                    pushFollow(FOLLOW_removeD_in_changeD581);
                    removeD11=removeD();

                    state._fsp--;

                    d =removeD11;

                    }
                    break;

            }

                System.out.println("End Change");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "changeD"


    // $ANTLR start "setD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:234:1: setD returns [Set d = directives_factory.createSet()] : EQUALS valueO= eltRefD ;
    public final Set setD() throws RecognitionException {
        Set d =  directives_factory.createSet();

        ElementRef valueO = null;



            System.out.println("Set");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:241:3: ( EQUALS valueO= eltRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:242:3: EQUALS valueO= eltRefD
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_setD612); 
            pushFollow(FOLLOW_eltRefD_in_setD616);
            valueO=eltRefD();

            state._fsp--;

            d.getValue().add(valueO);

            }


                System.out.println("End Set");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "setD"


    // $ANTLR start "addD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:245:1: addD returns [Add d = directives_factory.createAdd()] : PLUS value= eltRefD ;
    public final Add addD() throws RecognitionException {
        Add d =  directives_factory.createAdd();

        ElementRef value = null;



            System.out.println("Add");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:252:3: ( PLUS value= eltRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:253:3: PLUS value= eltRefD
            {
            match(input,PLUS,FOLLOW_PLUS_in_addD647); 
            pushFollow(FOLLOW_eltRefD_in_addD651);
            value=eltRefD();

            state._fsp--;

            d.getValue().add(value);

            }


                System.out.println("End Add");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "addD"


    // $ANTLR start "removeD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:256:1: removeD returns [Remove d = directives_factory.createRemove()] : MINUS value= eltRefD ;
    public final Remove removeD() throws RecognitionException {
        Remove d =  directives_factory.createRemove();

        ElementRef value = null;



            System.out.println("Remove");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:263:3: ( MINUS value= eltRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:264:3: MINUS value= eltRefD
            {
            match(input,MINUS,FOLLOW_MINUS_in_removeD682); 
            pushFollow(FOLLOW_eltRefD_in_removeD686);
            value=eltRefD();

            state._fsp--;

            d.getValue().add(value);

            }


                System.out.println("End Remove");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "removeD"


    // $ANTLR start "targetRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:268:1: targetRefD returns [ElementRef ref] : valueRefD ;
    public final ElementRef targetRefD() throws RecognitionException {
        ElementRef ref = null;

        ElementRef valueRefD12 = null;



            System.out.println("TargetRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:275:3: ( valueRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:276:3: valueRefD
            {
            pushFollow(FOLLOW_valueRefD_in_targetRefD718);
            valueRefD12=valueRefD();

            state._fsp--;

            ref =valueRefD12;

            }


                System.out.println("End TargetRef");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "targetRefD"


    // $ANTLR start "eltRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:279:1: eltRefD returns [ElementRef ref] : ( valueRefD | literalD );
    public final ElementRef eltRefD() throws RecognitionException {
        ElementRef ref = null;

        ElementRef valueRefD13 = null;

        Literal literalD14 = null;



            System.out.println("ElementRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:287:3: ( valueRefD | literalD )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=DOLLAR && LA10_0<=ID)) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING_LITERAL||LA10_0==MINUS||(LA10_0>=TRUE && LA10_0<=INT_LITERAL)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:288:3: valueRefD
                    {
                    pushFollow(FOLLOW_valueRefD_in_eltRefD749);
                    valueRefD13=valueRefD();

                    state._fsp--;

                    ref =valueRefD13;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:288:38: literalD
                    {
                    pushFollow(FOLLOW_literalD_in_eltRefD755);
                    literalD14=literalD();

                    state._fsp--;

                    ref =literalD14;

                    }
                    break;

            }

                System.out.println("End ElementRef");
                
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "eltRefD"


    // $ANTLR start "eltRefD_valueRefD_mandatory"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:291:1: eltRefD_valueRefD_mandatory returns [ElementRef ref] : ( valueRefD_prop_mandatory | literalD );
    public final ElementRef eltRefD_valueRefD_mandatory() throws RecognitionException {
        ElementRef ref = null;

        ElementRef valueRefD_prop_mandatory15 = null;

        Literal literalD16 = null;



            System.out.println("eltRefD_valueRefD_mandatory");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:299:3: ( valueRefD_prop_mandatory | literalD )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=DOLLAR && LA11_0<=ID)) ) {
                alt11=1;
            }
            else if ( (LA11_0==STRING_LITERAL||LA11_0==MINUS||(LA11_0>=TRUE && LA11_0<=INT_LITERAL)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:300:3: valueRefD_prop_mandatory
                    {
                    pushFollow(FOLLOW_valueRefD_prop_mandatory_in_eltRefD_valueRefD_mandatory786);
                    valueRefD_prop_mandatory15=valueRefD_prop_mandatory();

                    state._fsp--;

                    ref =valueRefD_prop_mandatory15;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:300:68: literalD
                    {
                    pushFollow(FOLLOW_literalD_in_eltRefD_valueRefD_mandatory792);
                    literalD16=literalD();

                    state._fsp--;

                    ref =literalD16;

                    }
                    break;

            }

                System.out.println("End eltRefD_valueRefD_mandatory");
                
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "eltRefD_valueRefD_mandatory"


    // $ANTLR start "valueRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:303:1: valueRefD returns [ElementRef ref] : refO= objectRefD (refP= propRefD )? ;
    public final ElementRef valueRefD() throws RecognitionException {
        ElementRef ref = null;

        ObjectRef refO = null;

        PropRef refP = null;



            System.out.println("valueRefD");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:319:3: (refO= objectRefD (refP= propRefD )? )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:320:3: refO= objectRefD (refP= propRefD )?
            {
            pushFollow(FOLLOW_objectRefD_in_valueRefD825);
            refO=objectRefD();

            state._fsp--;

            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:320:19: (refP= propRefD )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DOT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:320:20: refP= propRefD
                    {
                    pushFollow(FOLLOW_propRefD_in_valueRefD830);
                    refP=propRefD();

                    state._fsp--;


                    }
                    break;

            }


            }


                System.out.println("End valueRefD");
                if (refP != null){
                  System.out.println("propRef");
                  ref = refP;
                  ((PropRef)ref).setObject(refO);
                }
                else {
                  System.out.println("objRef only");
                  ref = refO;
                 }
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "valueRefD"


    // $ANTLR start "valueRefD_prop_mandatory"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:323:1: valueRefD_prop_mandatory returns [ElementRef ref] : refO= objectRefD refP= propRefD ;
    public final ElementRef valueRefD_prop_mandatory() throws RecognitionException {
        ElementRef ref = null;

        ObjectRef refO = null;

        PropRef refP = null;



            System.out.println("valueRefD_prop_mandatory");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:332:3: (refO= objectRefD refP= propRefD )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:333:3: refO= objectRefD refP= propRefD
            {
            pushFollow(FOLLOW_objectRefD_in_valueRefD_prop_mandatory863);
            refO=objectRefD();

            state._fsp--;

            pushFollow(FOLLOW_propRefD_in_valueRefD_prop_mandatory867);
            refP=propRefD();

            state._fsp--;


            }


                System.out.println("End valueRefD_prop_mandatory");
                ref = refP;
                ((PropRef)ref).setObject(refO);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "valueRefD_prop_mandatory"


    // $ANTLR start "objectRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:337:1: objectRefD returns [ObjectRef ref] : ( nameRefD | idRefD ) ;
    public final ObjectRef objectRefD() throws RecognitionException {
        ObjectRef ref = null;

        NameRef nameRefD17 = null;

        IDRef idRefD18 = null;



            System.out.println("ObjectRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:344:3: ( ( nameRefD | idRefD ) )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:345:3: ( nameRefD | idRefD )
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:345:3: ( nameRefD | idRefD )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==DOLLAR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:345:4: nameRefD
                    {
                    pushFollow(FOLLOW_nameRefD_in_objectRefD898);
                    nameRefD17=nameRefD();

                    state._fsp--;

                    ref =nameRefD17;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:345:37: idRefD
                    {
                    pushFollow(FOLLOW_idRefD_in_objectRefD904);
                    idRefD18=idRefD();

                    state._fsp--;

                    ref =idRefD18;

                    }
                    break;

            }


            }


                System.out.println("End ObjectRef");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "objectRefD"


    // $ANTLR start "metaRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:348:1: metaRefD returns [MetaRef ref = directives_factory.createMetaRef()] : name= META_ID ;
    public final MetaRef metaRefD() throws RecognitionException {
        MetaRef ref =  directives_factory.createMetaRef();

        Token name=null;


            System.out.println("MetaRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:355:3: (name= META_ID )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:356:3: name= META_ID
            {
            name=(Token)match(input,META_ID,FOLLOW_META_ID_in_metaRefD938); 
            ref.setName((name!=null?name.getText():null).substring(1, (name!=null?name.getText():null).length()-1));

            }


                System.out.println("End MetaRef");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "metaRefD"


    // $ANTLR start "idRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:359:1: idRefD returns [IDRef ref = directives_factory.createIDRef()] : DOLLAR id= ID ;
    public final IDRef idRefD() throws RecognitionException {
        IDRef ref =  directives_factory.createIDRef();

        Token id=null;


            System.out.println("IDRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:366:3: ( DOLLAR id= ID )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:367:3: DOLLAR id= ID
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_idRefD969); 
            id=(Token)match(input,ID,FOLLOW_ID_in_idRefD973); 
            ref.setIdentifier((id!=null?id.getText():null));

            }


                System.out.println("End IDRef");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "idRefD"


    // $ANTLR start "nameRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:370:1: nameRefD returns [NameRef ref = directives_factory.createNameRef()] : qname= qualifiedID ;
    public final NameRef nameRefD() throws RecognitionException {
        NameRef ref =  directives_factory.createNameRef();

        DirectivesParser.qualifiedID_return qname = null;



            System.out.println("NameRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:377:3: (qname= qualifiedID )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:378:3: qname= qualifiedID
            {
            pushFollow(FOLLOW_qualifiedID_in_nameRefD1006);
            qname=qualifiedID();

            state._fsp--;

            ref.setQname((qname!=null?input.toString(qname.start,qname.stop):null));

            }


                System.out.println("End NameRef "+(qname!=null?input.toString(qname.start,qname.stop):null));
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "nameRefD"

    public static class qualifiedID_return extends ParserRuleReturnScope {
        public String v = "";
    };

    // $ANTLR start "qualifiedID"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:381:1: qualifiedID returns [String v = \"\"] : qid= ID ( COL_COL strn= ID )* ;
    public final DirectivesParser.qualifiedID_return qualifiedID() throws RecognitionException {
        DirectivesParser.qualifiedID_return retval = new DirectivesParser.qualifiedID_return();
        retval.start = input.LT(1);

        Token qid=null;
        Token strn=null;


            System.out.println("QualifiedID");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:388:3: (qid= ID ( COL_COL strn= ID )* )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:389:3: qid= ID ( COL_COL strn= ID )*
            {
            qid=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID1039); 
            retval.v =(qid!=null?qid.getText():null);
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:389:26: ( COL_COL strn= ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COL_COL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:389:27: COL_COL strn= ID
            	    {
            	    match(input,COL_COL,FOLLOW_COL_COL_in_qualifiedID1044); 
            	    strn=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID1048); 
            	    retval.v ="::"+(strn!=null?strn.getText():null);

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


                System.out.println("End QualifiedID ");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qualifiedID"


    // $ANTLR start "propRefD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:392:1: propRefD returns [PropRef ref = directives_factory.createPropRef()] : DOT prop= ID ;
    public final PropRef propRefD() throws RecognitionException {
        PropRef ref =  directives_factory.createPropRef();

        Token prop=null;


            System.out.println("PropRef");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:399:3: ( DOT prop= ID )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:400:3: DOT prop= ID
            {
            match(input,DOT,FOLLOW_DOT_in_propRefD1081); 
            prop=(Token)match(input,ID,FOLLOW_ID_in_propRefD1085); 
            ref.setProperty((prop!=null?prop.getText():null));

            }


                System.out.println("End PropRef");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "propRefD"


    // $ANTLR start "literalD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:404:1: literalD returns [Literal l] : ( boolD | stringD | intD );
    public final Literal literalD() throws RecognitionException {
        Literal l = null;

        BooleanLiteral boolD19 = null;

        StringLiteral stringD20 = null;

        IntegerLiteral intD21 = null;



            System.out.println("Literal");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:411:3: ( boolD | stringD | intD )
            int alt15=3;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
                {
                alt15=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt15=2;
                }
                break;
            case MINUS:
            case INT_LITERAL:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:412:3: boolD
                    {
                    pushFollow(FOLLOW_boolD_in_literalD1117);
                    boolD19=boolD();

                    state._fsp--;

                    l =boolD19;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:412:26: stringD
                    {
                    pushFollow(FOLLOW_stringD_in_literalD1123);
                    stringD20=stringD();

                    state._fsp--;

                    l =stringD20;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:412:53: intD
                    {
                    pushFollow(FOLLOW_intD_in_literalD1129);
                    intD21=intD();

                    state._fsp--;

                    l =intD21;

                    }
                    break;

            }

                System.out.println("End Literal");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "literalD"


    // $ANTLR start "boolD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:415:1: boolD returns [BooleanLiteral l = directives_factory.createBooleanLiteral()] : ( TRUE | FALSE ) ;
    public final BooleanLiteral boolD() throws RecognitionException {
        BooleanLiteral l =  directives_factory.createBooleanLiteral();


            l.setValue(false);
            System.out.println("BooleanLiteral");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:423:3: ( ( TRUE | FALSE ) )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:424:3: ( TRUE | FALSE )
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:424:3: ( TRUE | FALSE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==TRUE) ) {
                alt16=1;
            }
            else if ( (LA16_0==FALSE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:424:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_boolD1161); 
                    l.setValue(true);

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:424:31: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_boolD1167); 

                    }
                    break;

            }


            }


                System.out.println("End BooleanLiteral");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "boolD"


    // $ANTLR start "stringD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:427:1: stringD returns [StringLiteral l = directives_factory.createStringLiteral()] : value= STRING_LITERAL ;
    public final StringLiteral stringD() throws RecognitionException {
        StringLiteral l =  directives_factory.createStringLiteral();

        Token value=null;


            System.out.println("StringLiteral");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:434:3: (value= STRING_LITERAL )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:435:3: value= STRING_LITERAL
            {
            value=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringD1200); 
            l.setValue((value!=null?value.getText():null).substring(1, (value!=null?value.getText():null).length()-1));

            }


                System.out.println("End StringLiteral");
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "stringD"


    // $ANTLR start "intD"
    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:438:1: intD returns [IntegerLiteral l = directives_factory.createIntegerLiteral()] : (sign= MINUS )? value= INT_LITERAL ;
    public final IntegerLiteral intD() throws RecognitionException {
        IntegerLiteral l =  directives_factory.createIntegerLiteral();

        Token sign=null;
        Token value=null;


            System.out.println("IntegerLiteral");
          
        try {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:449:3: ( (sign= MINUS )? value= INT_LITERAL )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:450:3: (sign= MINUS )? value= INT_LITERAL
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:450:3: (sign= MINUS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==MINUS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:450:4: sign= MINUS
                    {
                    sign=(Token)match(input,MINUS,FOLLOW_MINUS_in_intD1234); 

                    }
                    break;

            }

            value=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_intD1240); 
            l.setValue(Integer.parseInt((value!=null?value.getText():null)));

            }


                if (sign != null){
                  System.out.println("Negative value= "+(sign!=null?sign.getText():null)+(value!=null?value.getText():null));
                  l.setValue(Integer.parseInt((sign!=null?sign.getText():null)+(value!=null?value.getText():null)));
                  System.out.println("End IntegerLiteral");
                }
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "intD"

    // Delegated rules


 

    public static final BitSet FOLLOW_35_in_start69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_start73 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_start78 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_UNION_in_start81 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INTER_in_start87 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_start96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_start100 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_start104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_start108 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_start112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_start116 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_start123 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_start125 = new BitSet(new long[]{0x0000000000601B00L});
    public static final BitSet FOLLOW_directives_in_start129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_start131 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_start135 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_start137 = new BitSet(new long[]{0x0000000000601B00L});
    public static final BitSet FOLLOW_directives_in_start141 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_start143 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_start148 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_start150 = new BitSet(new long[]{0x0000000000601B00L});
    public static final BitSet FOLLOW_directives_in_start154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_start156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_directives188 = new BitSet(new long[]{0x0000000000601A02L});
    public static final BitSet FOLLOW_unaryDirective_in_directive221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryDirective_in_directive227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createD_in_unaryDirective258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroyD_in_unaryDirective265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_targetD_in_binaryDirective297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeD_in_binaryDirective304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createD336 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_metaRefD_in_createD340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_AS_in_createD344 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_idRefD_in_createD348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroyD379 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_nameRefD_in_destroyD383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_in_mergeD415 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LP_in_mergeD417 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_nameRefD_in_mergeD421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_mergeD425 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_nameRefD_in_mergeD429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RP_in_mergeD433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_targetRefD_in_targetD465 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_concatD_in_targetD468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeD_in_targetD474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCAT_in_concatD506 = new BitSet(new long[]{0x000000000E680010L});
    public static final BitSet FOLLOW_eltRefD_valueRefD_mandatory_in_concatD510 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMA_in_concatD519 = new BitSet(new long[]{0x000000000E680010L});
    public static final BitSet FOLLOW_eltRefD_valueRefD_mandatory_in_concatD524 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_setD_in_changeD569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addD_in_changeD575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeD_in_changeD581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_setD612 = new BitSet(new long[]{0x000000000E680010L});
    public static final BitSet FOLLOW_eltRefD_in_setD616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addD647 = new BitSet(new long[]{0x000000000E680010L});
    public static final BitSet FOLLOW_eltRefD_in_addD651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_removeD682 = new BitSet(new long[]{0x000000000E680010L});
    public static final BitSet FOLLOW_eltRefD_in_removeD686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueRefD_in_targetRefD718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueRefD_in_eltRefD749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalD_in_eltRefD755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueRefD_prop_mandatory_in_eltRefD_valueRefD_mandatory786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalD_in_eltRefD_valueRefD_mandatory792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectRefD_in_valueRefD825 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_propRefD_in_valueRefD830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectRefD_in_valueRefD_prop_mandatory863 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_propRefD_in_valueRefD_prop_mandatory867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRefD_in_objectRefD898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idRefD_in_objectRefD904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_META_ID_in_metaRefD938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_idRefD969 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_idRefD973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedID_in_nameRefD1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualifiedID1039 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COL_COL_in_qualifiedID1044 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_qualifiedID1048 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_DOT_in_propRefD1081 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_propRefD1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolD_in_literalD1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringD_in_literalD1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intD_in_literalD1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolD1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolD1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringD1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_intD1234 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_intD1240 = new BitSet(new long[]{0x0000000000000002L});

}