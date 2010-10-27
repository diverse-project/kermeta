// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g 2010-06-24 12:03:26

package org.kermeta.kompose.core.parser;

import kompose.*;
import kompose.impl.KomposePackageImpl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DirectivesParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "UNION", "INTER", "LCURLY", "RCURLY", "CREATE", "ID", "AS", "DOLLAR", "MERGE", "LP", "COMMA", "RP", "DESTROY", "DOT", "CONCAT", "EQUALS", "PLUS", "MINUS", "INT_LITERAL", "TRUE", "FALSE", "COL_COL", "PRE", "POST", "ESC", "DIGIT", "WS", "SingleLineComment", "MultiLineComment", "'EXT'", "'MODE'", "'PM'", "'AM'", "'CM'", "'PMPre'", "'AMPre'", "'Post'"
    };
    public static final int DESTROY=17;
    public static final int DOLLAR=12;
    public static final int T__40=40;
    public static final int INT_LITERAL=23;
    public static final int T__41=41;
    public static final int SingleLineComment=32;
    public static final int CONCAT=19;
    public static final int RP=16;
    public static final int ESC=29;
    public static final int MERGE=13;
    public static final int LP=14;
    public static final int COL_COL=26;
    public static final int INTER=6;
    public static final int LCURLY=7;
    public static final int PRE=27;
    public static final int EQUALS=20;
    public static final int MINUS=22;
    public static final int ID=10;
    public static final int EOF=-1;
    public static final int TRUE=24;
    public static final int UNION=5;
    public static final int AS=11;
    public static final int CREATE=9;
    public static final int WS=31;
    public static final int STRING_LITERAL=4;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int COMMA=15;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RCURLY=8;
    public static final int POST=28;
    public static final int PLUS=21;
    public static final int DIGIT=30;
    public static final int DOT=18;
    public static final int FALSE=25;
    public static final int MultiLineComment=33;

    // delegates
    // delegators


        public DirectivesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DirectivesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DirectivesParser.tokenNames; }
    public String getGrammarFileName() { return "/home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g"; }


      private static KomposeFactory factory = KomposePackageImpl.init().getKomposeFactory();
      
      public static void main(String[] args) throws Exception {
        DirectivesLexer lexer = new DirectivesLexer(new ANTLRFileStream("/home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/kompose.kompt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DirectivesParser parser = new DirectivesParser(tokens);
        try {
          parser.dirUnit();
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



    // $ANTLR start "dirUnit"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:43:1: dirUnit returns [Composer c = factory.createComposer();] : 'EXT' ext= STRING_LITERAL ( 'MODE' ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY ;
    public final Composer dirUnit() throws RecognitionException {
        Composer c =  factory.createComposer();;

        Token ext=null;
        Token pm=null;
        Token am=null;
        Token cm=null;
        ArrayList<ElementDirective> pmpre = null;

        ArrayList<ElementDirective> ampre = null;

        ArrayList<ElementDirective> post = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:53:3: ( 'EXT' ext= STRING_LITERAL ( 'MODE' ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:54:3: 'EXT' ext= STRING_LITERAL ( 'MODE' ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY
            {
            match(input,34,FOLLOW_34_in_dirUnit63); 
            ext=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit67); 
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:55:3: ( 'MODE' ( UNION | INTER ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:55:4: 'MODE' ( UNION | INTER )
                    {
                    match(input,35,FOLLOW_35_in_dirUnit72); 
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:55:11: ( UNION | INTER )
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
                            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:55:12: UNION
                            {
                            match(input,UNION,FOLLOW_UNION_in_dirUnit75); 
                            c.setMode(Modes.UNION);

                            }
                            break;
                        case 2 :
                            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:55:46: INTER
                            {
                            match(input,INTER,FOLLOW_INTER_in_dirUnit81); 
                            c.setMode(Modes.INTERSECTION);

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_dirUnit90); 
            pm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit94); 
            match(input,37,FOLLOW_37_in_dirUnit98); 
            am=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit102); 
            match(input,38,FOLLOW_38_in_dirUnit106); 
            cm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit110); 
            match(input,39,FOLLOW_39_in_dirUnit117); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit119); 
            pushFollow(FOLLOW_directives_in_dirUnit123);
            pmpre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit125); 
            match(input,40,FOLLOW_40_in_dirUnit129); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit131); 
            pushFollow(FOLLOW_directives_in_dirUnit135);
            ampre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit137); 
            match(input,41,FOLLOW_41_in_dirUnit142); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit144); 
            pushFollow(FOLLOW_directives_in_dirUnit148);
            post=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit150); 

            }


                c.setMetamodelName((ext!=null?ext.getText():null).substring(1, (ext!=null?ext.getText():null).length()-1));
                c.setAspectModelURI((am!=null?am.getText():null).substring(1, (am!=null?am.getText():null).length()-1));
                c.setPrimaryModelURI((pm!=null?pm.getText():null).substring(1, (pm!=null?pm.getText():null).length()-1));
                c.setComposedModelURI((cm!=null?cm.getText():null).substring(1, (cm!=null?cm.getText():null).length()-1));
                c.getPredirectivesPM().addAll(pmpre);
                c.getPredirectivesAM().addAll(ampre);
                c.getPostdirectives().addAll(post);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "dirUnit"


    // $ANTLR start "directives"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:66:1: directives returns [ArrayList<ElementDirective> lst = new ArrayList<ElementDirective>()] : (d= directive )* ;
    public final ArrayList<ElementDirective> directives() throws RecognitionException {
        ArrayList<ElementDirective> lst =  new ArrayList<ElementDirective>();

        ElementDirective d = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:66:89: ( (d= directive )* )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:67:3: (d= directive )*
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:67:3: (d= directive )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:67:4: d= directive
            	    {
            	    pushFollow(FOLLOW_directive_in_directives167);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:70:1: directive returns [ElementDirective c] : ( destroyD | propertyD | stringD | createD | mergeD ) ;
    public final ElementDirective directive() throws RecognitionException {
        ElementDirective c = null;

        Destroy destroyD1 = null;

        ElementDirective propertyD2 = null;

        ElementDirective stringD3 = null;

        Create createD4 = null;

        Merge mergeD5 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:70:40: ( ( destroyD | propertyD | stringD | createD | mergeD ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:3: ( destroyD | propertyD | stringD | createD | mergeD )
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:3: ( destroyD | propertyD | stringD | createD | mergeD )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:4: destroyD
                    {
                    pushFollow(FOLLOW_destroyD_in_directive187);
                    destroyD1=destroyD();

                    state._fsp--;

                    c =destroyD1;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:32: propertyD
                    {
                    pushFollow(FOLLOW_propertyD_in_directive192);
                    propertyD2=propertyD();

                    state._fsp--;

                    c =propertyD2;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:63: stringD
                    {
                    pushFollow(FOLLOW_stringD_in_directive198);
                    stringD3=stringD();

                    state._fsp--;

                    c =stringD3;

                    }
                    break;
                case 4 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:90: createD
                    {
                    pushFollow(FOLLOW_createD_in_directive204);
                    createD4=createD();

                    state._fsp--;

                    c =createD4;

                    }
                    break;
                case 5 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:71:116: mergeD
                    {
                    pushFollow(FOLLOW_mergeD_in_directive209);
                    mergeD5=mergeD();

                    state._fsp--;

                    c =mergeD5;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "directive"


    // $ANTLR start "createD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:74:1: createD returns [Create d = factory.createCreate()] : CREATE id= ID AS DOLLAR var= ID ;
    public final Create createD() throws RecognitionException {
        Create d =  factory.createCreate();

        Token id=null;
        Token var=null;


            System.out.println("CREATE "+(id!=null?id.getText():null)+" AS $"+(var!=null?var.getText():null));
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:82:3: ( CREATE id= ID AS DOLLAR var= ID )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:83:3: CREATE id= ID AS DOLLAR var= ID
            {
            match(input,CREATE,FOLLOW_CREATE_in_createD241); 
            id=(Token)match(input,ID,FOLLOW_ID_in_createD245); 
            match(input,AS,FOLLOW_AS_in_createD247); 
            match(input,DOLLAR,FOLLOW_DOLLAR_in_createD249); 
            var=(Token)match(input,ID,FOLLOW_ID_in_createD253); 

            }


                d.setClassName((id!=null?id.getText():null));
                d.setIdentifier((var!=null?var.getText():null));
              
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


    // $ANTLR start "mergeD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:86:1: mergeD returns [Merge d = factory.createMerge()] : MERGE LP refL= nameRef COMMA refR= nameRef RP ;
    public final Merge mergeD() throws RecognitionException {
        Merge d =  factory.createMerge();

        NameRef refL = null;

        NameRef refR = null;



            System.out.println("MERGED ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:93:3: ( MERGE LP refL= nameRef COMMA refR= nameRef RP )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:94:3: MERGE LP refL= nameRef COMMA refR= nameRef RP
            {
            match(input,MERGE,FOLLOW_MERGE_in_mergeD282); 
            match(input,LP,FOLLOW_LP_in_mergeD284); 
            pushFollow(FOLLOW_nameRef_in_mergeD288);
            refL=nameRef();

            state._fsp--;

            d.setLeft(refL);
            match(input,COMMA,FOLLOW_COMMA_in_mergeD292); 
            pushFollow(FOLLOW_nameRef_in_mergeD296);
            refR=nameRef();

            state._fsp--;

            d.setRight(refR);
            match(input,RP,FOLLOW_RP_in_mergeD300); 

            }


                System.out.println("MERGE ");
              
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


    // $ANTLR start "destroyD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:97:1: destroyD returns [Destroy d = factory.createDestroy()] : DESTROY ref= nameRef ;
    public final Destroy destroyD() throws RecognitionException {
        Destroy d =  factory.createDestroy();

        NameRef ref = null;



            System.out.println("DESTROYD ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:104:3: ( DESTROY ref= nameRef )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:105:3: DESTROY ref= nameRef
            {
            match(input,DESTROY,FOLLOW_DESTROY_in_destroyD328); 
            pushFollow(FOLLOW_nameRef_in_destroyD332);
            ref=nameRef();

            state._fsp--;

            d.setValue(ref);

            }


                System.out.println("DESTROY "+ref.getQname());
              
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


    // $ANTLR start "propertyD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:107:1: propertyD returns [ElementDirective c = null] : ref= refObj DOT prop= ID ( changeD[$prop.text, ref] | concatD[$prop.text, ref] ) ;
    public final ElementDirective propertyD() throws RecognitionException {
        ElementDirective c =  null;

        Token prop=null;
        ElementRef ref = null;

        Change changeD6 = null;

        Concat concatD7 = null;



            System.out.println("PROPERTYD ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:114:3: (ref= refObj DOT prop= ID ( changeD[$prop.text, ref] | concatD[$prop.text, ref] ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:3: ref= refObj DOT prop= ID ( changeD[$prop.text, ref] | concatD[$prop.text, ref] )
            {
            pushFollow(FOLLOW_refObj_in_propertyD364);
            ref=refObj();

            state._fsp--;

            match(input,DOT,FOLLOW_DOT_in_propertyD366); 
            prop=(Token)match(input,ID,FOLLOW_ID_in_propertyD370); 
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:26: ( changeD[$prop.text, ref] | concatD[$prop.text, ref] )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=EQUALS && LA5_0<=MINUS)) ) {
                alt5=1;
            }
            else if ( (LA5_0==COMMA||LA5_0==CONCAT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:27: changeD[$prop.text, ref]
                    {
                    pushFollow(FOLLOW_changeD_in_propertyD373);
                    changeD6=changeD((prop!=null?prop.getText():null), ref);

                    state._fsp--;

                    c =changeD6;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:70: concatD[$prop.text, ref]
                    {
                    pushFollow(FOLLOW_concatD_in_propertyD379);
                    concatD7=concatD((prop!=null?prop.getText():null), ref);

                    state._fsp--;

                    c =concatD7;

                    }
                    break;

            }


            }


                System.out.println(" PROP "+ref.toString());
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "propertyD"


    // $ANTLR start "stringD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:118:1: stringD returns [ElementDirective c = null] : ref= stringL concatD[$ref.text,null] ;
    public final ElementDirective stringD() throws RecognitionException {
        ElementDirective c =  null;

        DirectivesParser.stringL_return ref = null;

        Concat concatD8 = null;



        	  System.out.println("STRINGD "+(ref!=null?input.toString(ref.start,ref.stop):null));
        	
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:122:3: (ref= stringL concatD[$ref.text,null] )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:123:3: ref= stringL concatD[$ref.text,null]
            {
            pushFollow(FOLLOW_stringL_in_stringD406);
            ref=stringL();

            state._fsp--;

            pushFollow(FOLLOW_concatD_in_stringD408);
            concatD8=concatD((ref!=null?input.toString(ref.start,ref.stop):null), null);

            state._fsp--;

            c =concatD8;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return c;
    }
    // $ANTLR end "stringD"


    // $ANTLR start "changeD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:126:1: changeD[String prop, ElementRef ref] returns [Change d = null] : ( setD | addD | removeD ) ;
    public final Change changeD(String prop, ElementRef ref) throws RecognitionException {
        Change d =  null;

        Set setD9 = null;

        Add addD10 = null;

        Remove removeD11 = null;



        	  System.out.println("CHANGED "+prop);
        	
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:134:3: ( ( setD | addD | removeD ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:3: ( setD | addD | removeD )
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:3: ( setD | addD | removeD )
            int alt6=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt6=1;
                }
                break;
            case PLUS:
                {
                alt6=2;
                }
                break;
            case MINUS:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:4: setD
                    {
                    pushFollow(FOLLOW_setD_in_changeD441);
                    setD9=setD();

                    state._fsp--;

                    d =setD9;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:25: addD
                    {
                    pushFollow(FOLLOW_addD_in_changeD447);
                    addD10=addD();

                    state._fsp--;

                    d =addD10;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:46: removeD
                    {
                    pushFollow(FOLLOW_removeD_in_changeD453);
                    removeD11=removeD();

                    state._fsp--;

                    d =removeD11;

                    }
                    break;

            }


            }


                d.setPropertyName(prop);
                d.setTarget(ref);
              
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


    // $ANTLR start "concatD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:138:1: concatD[String prop, ElementRef ref] returns [Concat d = factory.createConcat()] : ( COMMA property= concat_property )* CONCAT target= concat_property ;
    public final Concat concatD(String prop, ElementRef ref) throws RecognitionException {
        Concat d =  factory.createConcat();

        DirectivesParser.concat_property_return property = null;

        DirectivesParser.concat_property_return target = null;



            ArrayList<String> list = new ArrayList<String>();
            list.add(prop);
            System.out.println("CONCAT "+prop+" to "+ref);
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:149:3: ( ( COMMA property= concat_property )* CONCAT target= concat_property )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:150:3: ( COMMA property= concat_property )* CONCAT target= concat_property
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:150:3: ( COMMA property= concat_property )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:150:4: COMMA property= concat_property
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concatD488); 
            	    pushFollow(FOLLOW_concat_property_in_concatD492);
            	    property=concat_property();

            	    state._fsp--;

            	    list.add((property!=null?input.toString(property.start,property.stop):null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,CONCAT,FOLLOW_CONCAT_in_concatD498); 
            pushFollow(FOLLOW_concat_property_in_concatD502);
            target=concat_property();

            state._fsp--;


            }


                d.setValue((target!=null?target.ref:null));
                d.getPropertyNames().addAll(list);
                d.setTarget(ref);
              
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

    public static class concat_property_return extends ParserRuleReturnScope {
        public ElementRef ref = null;
    };

    // $ANTLR start "concat_property"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:153:10: fragment concat_property returns [ElementRef ref = null] : ( ( nameRef DOT ID ) | stringL );
    public final DirectivesParser.concat_property_return concat_property() throws RecognitionException {
        DirectivesParser.concat_property_return retval = new DirectivesParser.concat_property_return();
        retval.start = input.LT(1);

        NameRef nameRef12 = null;

        DirectivesParser.stringL_return stringL13 = null;



            System.out.println("FRAGMENT CONCAT");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:157:3: ( ( nameRef DOT ID ) | stringL )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==STRING_LITERAL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:158:3: ( nameRef DOT ID )
                    {
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:158:3: ( nameRef DOT ID )
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:158:4: nameRef DOT ID
                    {
                    pushFollow(FOLLOW_nameRef_in_concat_property528);
                    nameRef12=nameRef();

                    state._fsp--;

                    match(input,DOT,FOLLOW_DOT_in_concat_property530); 
                    match(input,ID,FOLLOW_ID_in_concat_property532); 

                    }

                    retval.ref =nameRef12;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:158:43: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_concat_property539);
                    stringL13=stringL();

                    state._fsp--;

                    retval.ref =(stringL13!=null?stringL13.ref:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "concat_property"


    // $ANTLR start "setD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:161:1: setD returns [Set d = factory.createSet()] : EQUALS ref= refObj ;
    public final Set setD() throws RecognitionException {
        Set d =  factory.createSet();

        ElementRef ref = null;



            System.out.println("SETD ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:168:3: ( EQUALS ref= refObj )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:169:3: EQUALS ref= refObj
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_setD570); 
            pushFollow(FOLLOW_refObj_in_setD574);
            ref=refObj();

            state._fsp--;

            d.setValue(ref);

            }


                System.out.println("SET "+ref.toString());
              
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:172:1: addD returns [Add d = factory.createAdd()] : PLUS ref= refObj ;
    public final Add addD() throws RecognitionException {
        Add d =  factory.createAdd();

        ElementRef ref = null;



            System.out.println("ADDD ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:179:3: ( PLUS ref= refObj )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:180:3: PLUS ref= refObj
            {
            match(input,PLUS,FOLLOW_PLUS_in_addD605); 
            pushFollow(FOLLOW_refObj_in_addD609);
            ref=refObj();

            state._fsp--;

            d.setValue(ref);

            }


                System.out.println("ADD "+ref.toString());
              
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:183:1: removeD returns [Remove d = factory.createRemove()] : MINUS ref= refObj ;
    public final Remove removeD() throws RecognitionException {
        Remove d =  factory.createRemove();

        ElementRef ref = null;



            System.out.println("REMOVED ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:190:3: ( MINUS ref= refObj )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:191:3: MINUS ref= refObj
            {
            match(input,MINUS,FOLLOW_MINUS_in_removeD640); 
            pushFollow(FOLLOW_refObj_in_removeD644);
            ref=refObj();

            state._fsp--;

            d.setValue(ref);

            }


                System.out.println("REMOVE "+ref.toString());
              
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


    // $ANTLR start "refObj"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:194:1: refObj returns [ElementRef ref = null] : ( nameRef | idRef | stringL | booleanL | integerL );
    public final ElementRef refObj() throws RecognitionException {
        ElementRef ref =  null;

        NameRef nameRef14 = null;

        IDRef idRef15 = null;

        DirectivesParser.stringL_return stringL16 = null;

        BooleanLiteral booleanL17 = null;

        IntegerLiteral integerL18 = null;



            System.out.println("REFOBJ ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:201:3: ( nameRef | idRef | stringL | booleanL | integerL )
            int alt9=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case DOLLAR:
                {
                alt9=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt9=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt9=4;
                }
                break;
            case MINUS:
            case INT_LITERAL:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:202:3: nameRef
                    {
                    pushFollow(FOLLOW_nameRef_in_refObj675);
                    nameRef14=nameRef();

                    state._fsp--;

                    ref =nameRef14;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:202:34: idRef
                    {
                    pushFollow(FOLLOW_idRef_in_refObj681);
                    idRef15=idRef();

                    state._fsp--;

                    ref =idRef15;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:203:3: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_refObj689);
                    stringL16=stringL();

                    state._fsp--;

                    ref =(stringL16!=null?stringL16.ref:null);

                    }
                    break;
                case 4 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:203:34: booleanL
                    {
                    pushFollow(FOLLOW_booleanL_in_refObj695);
                    booleanL17=booleanL();

                    state._fsp--;

                    ref =booleanL17;

                    }
                    break;
                case 5 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:204:3: integerL
                    {
                    pushFollow(FOLLOW_integerL_in_refObj704);
                    integerL18=integerL();

                    state._fsp--;

                    ref =integerL18;

                    }
                    break;

            }

                System.out.println("REFOBJ "+ref.toString());
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "refObj"


    // $ANTLR start "nameRef"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:207:1: nameRef returns [NameRef ref = factory.createNameRef()] : qname= qualifiedID ;
    public final NameRef nameRef() throws RecognitionException {
        NameRef ref =  factory.createNameRef();

        String qname = null;



            System.out.println("NAMEREF ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:215:3: (qname= qualifiedID )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:216:4: qname= qualifiedID
            {
            pushFollow(FOLLOW_qualifiedID_in_nameRef740);
            qname=qualifiedID();

            state._fsp--;


            }


                ref.setQname(qname);
                System.out.println("NAMEREF "+qname);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "nameRef"


    // $ANTLR start "idRef"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:219:1: idRef returns [IDRef ref = factory.createIDRef()] : DOLLAR id= ID ;
    public final IDRef idRef() throws RecognitionException {
        IDRef ref =  factory.createIDRef();

        Token id=null;


            System.out.println("IDREF "+(id!=null?id.getText():null));
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:226:3: ( DOLLAR id= ID )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:227:4: DOLLAR id= ID
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_idRef770); 
            id=(Token)match(input,ID,FOLLOW_ID_in_idRef774); 

            }


                ref.setIdentifier((id!=null?id.getText():null));
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "idRef"

    public static class stringL_return extends ParserRuleReturnScope {
        public StringLiteral ref = factory.createStringLiteral();
    };

    // $ANTLR start "stringL"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:230:1: stringL returns [StringLiteral ref = factory.createStringLiteral()] : v= STRING_LITERAL ;
    public final DirectivesParser.stringL_return stringL() throws RecognitionException {
        DirectivesParser.stringL_return retval = new DirectivesParser.stringL_return();
        retval.start = input.LT(1);

        Token v=null;


            System.out.println("STRINGL "+v);
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:237:3: (v= STRING_LITERAL )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:238:5: v= STRING_LITERAL
            {
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringL807); 

            }

            retval.stop = input.LT(-1);


                retval.ref.setValue((v!=null?v.getText():null).substring(1, (v!=null?v.getText():null).length()-1));
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stringL"


    // $ANTLR start "integerL"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:241:1: integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()] : str= integer ;
    public final IntegerLiteral integerL() throws RecognitionException {
        IntegerLiteral ref =  factory.createIntegerLiteral();

        DirectivesParser.integer_return str = null;



            System.out.println("INTL "+str);
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:248:3: (str= integer )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:249:3: str= integer
            {
            pushFollow(FOLLOW_integer_in_integerL838);
            str=integer();

            state._fsp--;


            }


                ref.setValue(Integer.parseInt((str!=null?input.toString(str.start,str.stop):null)));
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "integerL"

    public static class integer_return extends ParserRuleReturnScope {
        public Integer str = null;
    };

    // $ANTLR start "integer"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:252:1: integer returns [Integer str = null] : ( MINUS )? INT_LITERAL ;
    public final DirectivesParser.integer_return integer() throws RecognitionException {
        DirectivesParser.integer_return retval = new DirectivesParser.integer_return();
        retval.start = input.LT(1);


            System.out.println("INT ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:256:3: ( ( MINUS )? INT_LITERAL )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:257:3: ( MINUS )? INT_LITERAL
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:257:3: ( MINUS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==MINUS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:257:4: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_integer862); 

                    }
                    break;

            }

            match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_integer866); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer"


    // $ANTLR start "booleanL"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:260:1: booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()] : ( TRUE | FALSE ) ;
    public final BooleanLiteral booleanL() throws RecognitionException {
        BooleanLiteral ref =  factory.createBooleanLiteral();


            boolean val = false;
            System.out.println("BOOL "+val);
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:268:3: ( ( TRUE | FALSE ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:269:5: ( TRUE | FALSE )
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:269:5: ( TRUE | FALSE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TRUE) ) {
                alt11=1;
            }
            else if ( (LA11_0==FALSE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:269:6: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanL898); 
                     val = true; 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:269:28: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanL903); 

                    }
                    break;

            }


            }


                ref.setValue(val);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "booleanL"


    // $ANTLR start "qualifiedID"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:272:1: qualifiedID returns [String val = \"\"] : str1= ID ( COL_COL strn= ID )* ;
    public final String qualifiedID() throws RecognitionException {
        String val =  "";

        Token str1=null;
        Token strn=null;


            System.out.println("QID ");
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:279:1: (str1= ID ( COL_COL strn= ID )* )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:280:3: str1= ID ( COL_COL strn= ID )*
            {
            str1=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID933); 
            val+=(str1!=null?str1.getText():null);
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:280:30: ( COL_COL strn= ID )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:280:31: COL_COL strn= ID
            	    {
            	    match(input,COL_COL,FOLLOW_COL_COL_in_qualifiedID938); 
            	    strn=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID942); 
            	    val+="::"+(strn!=null?strn.getText():null);

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


                System.out.println("QUALID "+(str1!=null?str1.getText():null));
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "qualifiedID"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\1\4\13\uffff";
    static final String DFA3_maxS =
        "\1\31\13\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\1\1\11\uffff";
    static final String DFA3_specialS =
        "\14\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\3\uffff\1\1\2\2\1\uffff\2\2\3\uffff\1\2\4\uffff\4\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 67:3: (d= directive )*";
        }
    }
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\4\3\uffff\1\17\11\uffff";
    static final String DFA4_maxS =
        "\1\31\3\uffff\1\23\11\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\6\uffff\1\4\1\5\1\3\2\uffff";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\4\uffff\1\11\1\2\1\uffff\1\2\1\12\3\uffff\1\1\4\uffff\4"+
            "\2",
            "",
            "",
            "",
            "\1\13\2\uffff\1\2\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "71:3: ( destroyD | propertyD | stringD | createD | mergeD )";
        }
    }
    static final String DFA12_eotS =
        "\20\uffff";
    static final String DFA12_eofS =
        "\20\uffff";
    static final String DFA12_minS =
        "\1\4\17\uffff";
    static final String DFA12_maxS =
        "\1\32\17\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA12_specialS =
        "\20\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\3\uffff\3\1\1\uffff\2\1\1\uffff\4\1\3\uffff\4\1\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 280:30: ( COL_COL strn= ID )*";
        }
    }
 

    public static final BitSet FOLLOW_34_in_dirUnit63 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit67 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_dirUnit72 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_UNION_in_dirUnit75 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INTER_in_dirUnit81 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dirUnit90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit94 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_dirUnit98 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit102 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_dirUnit106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit110 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_dirUnit117 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit119 = new BitSet(new long[]{0x0000000003C23710L});
    public static final BitSet FOLLOW_directives_in_dirUnit123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit125 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_dirUnit129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit131 = new BitSet(new long[]{0x0000000003C23710L});
    public static final BitSet FOLLOW_directives_in_dirUnit135 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit137 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_dirUnit142 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit144 = new BitSet(new long[]{0x0000000003C23710L});
    public static final BitSet FOLLOW_directives_in_dirUnit148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_directives167 = new BitSet(new long[]{0x0000000003C23612L});
    public static final BitSet FOLLOW_destroyD_in_directive187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyD_in_directive192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringD_in_directive198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createD_in_directive204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeD_in_directive209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createD241 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_createD245 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_createD247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DOLLAR_in_createD249 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_createD253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_in_mergeD282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LP_in_mergeD284 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_nameRef_in_mergeD288 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_mergeD292 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_nameRef_in_mergeD296 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RP_in_mergeD300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroyD328 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_nameRef_in_destroyD332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refObj_in_propertyD364 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_propertyD366 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_propertyD370 = new BitSet(new long[]{0x0000000000788000L});
    public static final BitSet FOLLOW_changeD_in_propertyD373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatD_in_propertyD379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_stringD406 = new BitSet(new long[]{0x0000000000788000L});
    public static final BitSet FOLLOW_concatD_in_stringD408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setD_in_changeD441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addD_in_changeD447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeD_in_changeD453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_concatD488 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_concat_property_in_concatD492 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_CONCAT_in_concatD498 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_concat_property_in_concatD502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_concat_property528 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOT_in_concat_property530 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_concat_property532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_concat_property539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_setD570 = new BitSet(new long[]{0x0000000003C01410L});
    public static final BitSet FOLLOW_refObj_in_setD574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addD605 = new BitSet(new long[]{0x0000000003C01410L});
    public static final BitSet FOLLOW_refObj_in_addD609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_removeD640 = new BitSet(new long[]{0x0000000003C01410L});
    public static final BitSet FOLLOW_refObj_in_removeD644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_refObj675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idRef_in_refObj681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_refObj689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanL_in_refObj695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerL_in_refObj704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedID_in_nameRef740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_idRef770 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idRef774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringL807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_integerL838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_integer862 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_integer866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanL898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanL903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualifiedID933 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COL_COL_in_qualifiedID938 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_qualifiedID942 = new BitSet(new long[]{0x0000000004000002L});

}