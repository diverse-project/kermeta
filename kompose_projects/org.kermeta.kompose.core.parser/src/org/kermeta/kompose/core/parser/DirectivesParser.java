// $ANTLR 3.1.1 /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g 2009-07-30 11:03:56

package org.kermeta.kompose.core.parser;

import java.util.ArrayList;

import kompose.*;
import kompose.impl.KomposePackageImpl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DirectivesParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "LCURLY", "RCURLY", "CREATE", "ID", "AS", "DOLLAR", "DOT", "COMMA", "CONCAT", "EQUALS", "PLUS", "MINUS", "INT_LITERAL", "TRUE", "FALSE", "COL_COL", "PRE", "POST", "ESC", "DIGIT", "WS", "SingleLineComment", "MultiLineComment", "'EXT'", "'PM'", "'AM'", "'CM'", "'PMPre'", "'AMPre'", "'Post'"
    };
    public static final int DOLLAR=10;
    public static final int INT_LITERAL=17;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int SingleLineComment=26;
    public static final int CONCAT=13;
    public static final int ESC=23;
    public static final int COL_COL=20;
    public static final int LCURLY=5;
    public static final int PRE=21;
    public static final int EQUALS=14;
    public static final int MINUS=16;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int TRUE=18;
    public static final int T__30=30;
    public static final int AS=9;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int CREATE=7;
    public static final int WS=25;
    public static final int T__33=33;
    public static final int STRING_LITERAL=4;
    public static final int T__34=34;
    public static final int COMMA=12;
    public static final int RCURLY=6;
    public static final int POST=22;
    public static final int PLUS=15;
    public static final int DIGIT=24;
    public static final int DOT=11;
    public static final int FALSE=19;
    public static final int MultiLineComment=27;

    // delegates
    // delegators


        public DirectivesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DirectivesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DirectivesParser.tokenNames; }
    public String getGrammarFileName() { return "/home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g"; }


      private static KomposeFactory factory = KomposePackageImpl.init().getKomposeFactory();
      
      public static void main(String[] args) throws Exception {
        DirectivesLexer lexer = new DirectivesLexer(new ANTLRFileStream("kompose.kompt"));
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:51:1: dirUnit returns [Composer c = factory.createComposer();] : 'EXT' ext= STRING_LITERAL 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY ;
    public final Composer dirUnit() throws RecognitionException {
        Composer c =  factory.createComposer();;

        Token ext=null;
        Token pm=null;
        Token am=null;
        Token cm=null;
        ArrayList pmpre = null;

        ArrayList ampre = null;

        ArrayList post = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:61:3: ( 'EXT' ext= STRING_LITERAL 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:62:3: 'EXT' ext= STRING_LITERAL 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY
            {
            match(input,28,FOLLOW_28_in_dirUnit59); 
            ext=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit63); 
            match(input,29,FOLLOW_29_in_dirUnit67); 
            pm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit71); 
            match(input,30,FOLLOW_30_in_dirUnit75); 
            am=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit79); 
            match(input,31,FOLLOW_31_in_dirUnit83); 
            cm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit87); 
            match(input,32,FOLLOW_32_in_dirUnit94); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit96); 
            pushFollow(FOLLOW_directives_in_dirUnit100);
            pmpre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit102); 
            match(input,33,FOLLOW_33_in_dirUnit106); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit108); 
            pushFollow(FOLLOW_directives_in_dirUnit112);
            ampre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit114); 
            match(input,34,FOLLOW_34_in_dirUnit118); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit120); 
            pushFollow(FOLLOW_directives_in_dirUnit124);
            post=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit126); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:72:1: directives returns [ArrayList lst = new ArrayList()] : (d= directive )* ;
    public final ArrayList directives() throws RecognitionException {
        ArrayList lst =  new ArrayList();

        ElementDirective d = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:72:53: ( (d= directive )* )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:73:3: (d= directive )*
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:73:3: (d= directive )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING_LITERAL||(LA1_0>=CREATE && LA1_0<=ID)||LA1_0==DOLLAR||(LA1_0>=MINUS && LA1_0<=FALSE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:73:4: d= directive
            	    {
            	    pushFollow(FOLLOW_directive_in_directives143);
            	    d=directive();

            	    state._fsp--;

            	    lst.add(d);

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:76:1: directive returns [ElementDirective c] : ( concatD | createD | changeD ) ;
    public final ElementDirective directive() throws RecognitionException {
        ElementDirective c = null;

        Concat concatD1 = null;

        Create createD2 = null;

        Change changeD3 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:76:40: ( ( concatD | createD | changeD ) )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:77:3: ( concatD | createD | changeD )
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:77:3: ( concatD | createD | changeD )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:77:4: concatD
                    {
                    pushFollow(FOLLOW_concatD_in_directive163);
                    concatD1=concatD();

                    state._fsp--;

                    c =concatD1;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:77:31: createD
                    {
                    pushFollow(FOLLOW_createD_in_directive169);
                    createD2=createD();

                    state._fsp--;

                    c =createD2;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:77:57: changeD
                    {
                    pushFollow(FOLLOW_changeD_in_directive174);
                    changeD3=changeD();

                    state._fsp--;

                    c =changeD3;

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:80:1: createD returns [Create d = factory.createCreate()] : CREATE id= ID AS DOLLAR var= ID ;
    public final Create createD() throws RecognitionException {
        Create d =  factory.createCreate();

        Token id=null;
        Token var=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:85:3: ( CREATE id= ID AS DOLLAR var= ID )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:86:3: CREATE id= ID AS DOLLAR var= ID
            {
            match(input,CREATE,FOLLOW_CREATE_in_createD200); 
            id=(Token)match(input,ID,FOLLOW_ID_in_createD204); 
            match(input,AS,FOLLOW_AS_in_createD206); 
            match(input,DOLLAR,FOLLOW_DOLLAR_in_createD208); 
            var=(Token)match(input,ID,FOLLOW_ID_in_createD212); 

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


    // $ANTLR start "changeD"
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:89:1: changeD returns [Change d = null] : ref= refObj DOT prop= ID ( setD | addD | removeD ) ;
    public final Change changeD() throws RecognitionException {
        Change d =  null;

        Token prop=null;
        ElementRef ref = null;

        Set setD4 = null;

        Add addD5 = null;

        Remove removeD6 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:94:3: (ref= refObj DOT prop= ID ( setD | addD | removeD ) )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:95:3: ref= refObj DOT prop= ID ( setD | addD | removeD )
            {
            pushFollow(FOLLOW_refObj_in_changeD237);
            ref=refObj();

            state._fsp--;

            match(input,DOT,FOLLOW_DOT_in_changeD239); 
            prop=(Token)match(input,ID,FOLLOW_ID_in_changeD243); 
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:3: ( setD | addD | removeD )
            int alt3=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt3=1;
                }
                break;
            case PLUS:
                {
                alt3=2;
                }
                break;
            case MINUS:
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
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:4: setD
                    {
                    pushFollow(FOLLOW_setD_in_changeD249);
                    setD4=setD();

                    state._fsp--;

                    d =setD4;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:25: addD
                    {
                    pushFollow(FOLLOW_addD_in_changeD255);
                    addD5=addD();

                    state._fsp--;

                    d =addD5;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:97:3: removeD
                    {
                    pushFollow(FOLLOW_removeD_in_changeD264);
                    removeD6=removeD();

                    state._fsp--;

                    d =removeD6;

                    }
                    break;

            }


            }


                d.setPropertyName((prop!=null?prop.getText():null));
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:100:1: concatD returns [Concat d = factory.createConcat()] : first= concat_property ( COMMA property= concat_property )* CONCAT target= concat_property ;
    public final Concat concatD() throws RecognitionException {
        Concat d =  factory.createConcat();

        DirectivesParser.concat_property_return first = null;

        DirectivesParser.concat_property_return property = null;

        DirectivesParser.concat_property_return target = null;



            ArrayList<String> list = new ArrayList<String>();
            StringLiteral ref = factory.createStringLiteral();
          
        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:110:3: (first= concat_property ( COMMA property= concat_property )* CONCAT target= concat_property )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:111:3: first= concat_property ( COMMA property= concat_property )* CONCAT target= concat_property
            {
            pushFollow(FOLLOW_concat_property_in_concatD299);
            first=concat_property();

            state._fsp--;

            list.add((first!=null?input.toString(first.start,first.stop):null));
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:111:50: ( COMMA property= concat_property )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:111:51: COMMA property= concat_property
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concatD304); 
            	    pushFollow(FOLLOW_concat_property_in_concatD308);
            	    property=concat_property();

            	    state._fsp--;

            	    list.add((property!=null?input.toString(property.start,property.stop):null));

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,CONCAT,FOLLOW_CONCAT_in_concatD314); 
            pushFollow(FOLLOW_concat_property_in_concatD318);
            target=concat_property();

            state._fsp--;


            }


                ref.setValue((target!=null?input.toString(target.start,target.stop):null));
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:114:10: fragment concat_property returns [ElementRef ref = null] : ( ( nameRef DOT prop= ID ) | stringL );
    public final DirectivesParser.concat_property_return concat_property() throws RecognitionException {
        DirectivesParser.concat_property_return retval = new DirectivesParser.concat_property_return();
        retval.start = input.LT(1);

        Token prop=null;
        NameRef nameRef7 = null;

        StringLiteral stringL8 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:114:57: ( ( nameRef DOT prop= ID ) | stringL )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==STRING_LITERAL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:3: ( nameRef DOT prop= ID )
                    {
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:3: ( nameRef DOT prop= ID )
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:4: nameRef DOT prop= ID
                    {
                    pushFollow(FOLLOW_nameRef_in_concat_property335);
                    nameRef7=nameRef();

                    state._fsp--;

                    match(input,DOT,FOLLOW_DOT_in_concat_property337); 
                    prop=(Token)match(input,ID,FOLLOW_ID_in_concat_property341); 

                    }

                    retval.ref =nameRef7;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:115:48: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_concat_property348);
                    stringL8=stringL();

                    state._fsp--;

                    retval.ref =stringL8;

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:119:1: setD returns [Set d = factory.createSet()] : EQUALS ref= refObj ;
    public final Set setD() throws RecognitionException {
        Set d =  factory.createSet();

        ElementRef ref = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:119:43: ( EQUALS ref= refObj )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:120:3: EQUALS ref= refObj
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_setD367); 
            pushFollow(FOLLOW_refObj_in_setD371);
            ref=refObj();

            state._fsp--;

            d.setValue(ref);

            }

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:123:1: addD returns [Add d = factory.createAdd()] : PLUS ref= refObj ;
    public final Add addD() throws RecognitionException {
        Add d =  factory.createAdd();

        ElementRef ref = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:123:43: ( PLUS ref= refObj )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:124:3: PLUS ref= refObj
            {
            match(input,PLUS,FOLLOW_PLUS_in_addD387); 
            pushFollow(FOLLOW_refObj_in_addD391);
            ref=refObj();

            state._fsp--;

            d.setValue(ref);

            }

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:127:1: removeD returns [Remove d = factory.createRemove()] : MINUS ref= refObj ;
    public final Remove removeD() throws RecognitionException {
        Remove d =  factory.createRemove();

        ElementRef ref = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:127:52: ( MINUS ref= refObj )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:128:3: MINUS ref= refObj
            {
            match(input,MINUS,FOLLOW_MINUS_in_removeD407); 
            pushFollow(FOLLOW_refObj_in_removeD411);
            ref=refObj();

            state._fsp--;

            d.setValue(ref);

            }

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:131:1: refObj returns [ElementRef ref = null] : ( nameRef | idRef | stringL | booleanL | integerL );
    public final ElementRef refObj() throws RecognitionException {
        ElementRef ref =  null;

        NameRef nameRef9 = null;

        IDRef idRef10 = null;

        StringLiteral stringL11 = null;

        BooleanLiteral booleanL12 = null;

        IntegerLiteral integerL13 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:131:39: ( nameRef | idRef | stringL | booleanL | integerL )
            int alt6=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case DOLLAR:
                {
                alt6=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt6=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt6=4;
                }
                break;
            case MINUS:
            case INT_LITERAL:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:132:3: nameRef
                    {
                    pushFollow(FOLLOW_nameRef_in_refObj427);
                    nameRef9=nameRef();

                    state._fsp--;

                    ref =nameRef9;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:132:34: idRef
                    {
                    pushFollow(FOLLOW_idRef_in_refObj433);
                    idRef10=idRef();

                    state._fsp--;

                    ref =idRef10;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:133:3: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_refObj441);
                    stringL11=stringL();

                    state._fsp--;

                    ref =stringL11;

                    }
                    break;
                case 4 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:133:34: booleanL
                    {
                    pushFollow(FOLLOW_booleanL_in_refObj447);
                    booleanL12=booleanL();

                    state._fsp--;

                    ref =booleanL12;

                    }
                    break;
                case 5 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:134:3: integerL
                    {
                    pushFollow(FOLLOW_integerL_in_refObj456);
                    integerL13=integerL();

                    state._fsp--;

                    ref =integerL13;

                    }
                    break;

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
    // $ANTLR end "refObj"


    // $ANTLR start "nameRef"
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:137:1: nameRef returns [NameRef ref = factory.createNameRef()] : qname= qualifiedID ;
    public final NameRef nameRef() throws RecognitionException {
        NameRef ref =  factory.createNameRef();

        String qname = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:141:3: (qname= qualifiedID )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:142:4: qname= qualifiedID
            {
            pushFollow(FOLLOW_qualifiedID_in_nameRef486);
            qname=qualifiedID();

            state._fsp--;


            }


                ref.setQname(qname);
              
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:145:1: idRef returns [IDRef ref = factory.createIDRef()] : DOLLAR id= ID ;
    public final IDRef idRef() throws RecognitionException {
        IDRef ref =  factory.createIDRef();

        Token id=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:149:3: ( DOLLAR id= ID )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:150:4: DOLLAR id= ID
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_idRef510); 
            id=(Token)match(input,ID,FOLLOW_ID_in_idRef514); 

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


    // $ANTLR start "stringL"
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:153:1: stringL returns [StringLiteral ref = factory.createStringLiteral()] : v= STRING_LITERAL ;
    public final StringLiteral stringL() throws RecognitionException {
        StringLiteral ref =  factory.createStringLiteral();

        Token v=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:157:3: (v= STRING_LITERAL )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:158:5: v= STRING_LITERAL
            {
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringL541); 

            }


                ref.setValue((v!=null?v.getText():null).substring(1, (v!=null?v.getText():null).length()-1));
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ref;
    }
    // $ANTLR end "stringL"


    // $ANTLR start "integerL"
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:161:1: integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()] : str= integer ;
    public final IntegerLiteral integerL() throws RecognitionException {
        IntegerLiteral ref =  factory.createIntegerLiteral();

        DirectivesParser.integer_return str = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:165:3: (str= integer )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:166:3: str= integer
            {
            pushFollow(FOLLOW_integer_in_integerL566);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:169:1: integer returns [Integer str = null] : ( MINUS )? INT_LITERAL ;
    public final DirectivesParser.integer_return integer() throws RecognitionException {
        DirectivesParser.integer_return retval = new DirectivesParser.integer_return();
        retval.start = input.LT(1);

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:169:37: ( ( MINUS )? INT_LITERAL )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:170:3: ( MINUS )? INT_LITERAL
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:170:3: ( MINUS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MINUS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:170:4: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_integer582); 

                    }
                    break;

            }

            match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_integer586); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:173:1: booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()] : ( TRUE | FALSE ) ;
    public final BooleanLiteral booleanL() throws RecognitionException {
        BooleanLiteral ref =  factory.createBooleanLiteral();


            boolean val = false;
          
        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:180:3: ( ( TRUE | FALSE ) )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:5: ( TRUE | FALSE )
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:5: ( TRUE | FALSE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TRUE) ) {
                alt8=1;
            }
            else if ( (LA8_0==FALSE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:6: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanL618); 
                     val = true; 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:28: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanL623); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:184:1: qualifiedID returns [String val = \"\"] : str1= ID ( COL_COL strn= ID )* ;
    public final String qualifiedID() throws RecognitionException {
        String val =  "";

        Token str1=null;
        Token strn=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:184:38: (str1= ID ( COL_COL strn= ID )* )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:185:3: str1= ID ( COL_COL strn= ID )*
            {
            str1=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID640); 
            val+=(str1!=null?str1.getText():null);
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:185:30: ( COL_COL strn= ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COL_COL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:185:31: COL_COL strn= ID
            	    {
            	    match(input,COL_COL,FOLLOW_COL_COL_in_qualifiedID645); 
            	    strn=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID649); 
            	    val+="::"+(strn!=null?strn.getText():null);

            	    }
            	    break;

            	default :
            	    break loop9;
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
        return val;
    }
    // $ANTLR end "qualifiedID"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\4\2\13\2\uffff\2\10\1\uffff\1\13\1\14";
    static final String DFA2_maxS =
        "\1\23\1\24\1\15\2\uffff\2\10\1\uffff\1\24\1\20";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\3\2\uffff\1\1\2\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\2\uffff\1\3\1\1\1\uffff\1\4\5\uffff\4\4",
            "\1\6\10\uffff\1\5",
            "\1\4\2\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            "\1\6\10\uffff\1\5",
            "\2\7\3\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "77:3: ( concatD | createD | changeD )";
        }
    }
 

    public static final BitSet FOLLOW_28_in_dirUnit59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit63 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dirUnit67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit71 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_dirUnit75 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit79 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_dirUnit83 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit87 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dirUnit94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit96 = new BitSet(new long[]{0x00000000000F05D0L});
    public static final BitSet FOLLOW_directives_in_dirUnit100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit102 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_dirUnit106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit108 = new BitSet(new long[]{0x00000000000F05D0L});
    public static final BitSet FOLLOW_directives_in_dirUnit112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit114 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_dirUnit118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit120 = new BitSet(new long[]{0x00000000000F05D0L});
    public static final BitSet FOLLOW_directives_in_dirUnit124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_directives143 = new BitSet(new long[]{0x00000000000F0592L});
    public static final BitSet FOLLOW_concatD_in_directive163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createD_in_directive169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeD_in_directive174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createD200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_createD204 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_createD206 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOLLAR_in_createD208 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_createD212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refObj_in_changeD237 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_changeD239 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_changeD243 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_setD_in_changeD249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addD_in_changeD255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeD_in_changeD264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concat_property_in_concatD299 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_concatD304 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_concat_property_in_concatD308 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_CONCAT_in_concatD314 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_concat_property_in_concatD318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_concat_property335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_concat_property337 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_concat_property341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_concat_property348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_setD367 = new BitSet(new long[]{0x00000000000F0590L});
    public static final BitSet FOLLOW_refObj_in_setD371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addD387 = new BitSet(new long[]{0x00000000000F0590L});
    public static final BitSet FOLLOW_refObj_in_addD391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_removeD407 = new BitSet(new long[]{0x00000000000F0590L});
    public static final BitSet FOLLOW_refObj_in_removeD411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_refObj427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idRef_in_refObj433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_refObj441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanL_in_refObj447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerL_in_refObj456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedID_in_nameRef486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_idRef510 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idRef514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringL541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_integerL566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_integer582 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_integer586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanL618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanL623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualifiedID640 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COL_COL_in_qualifiedID645 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_qualifiedID649 = new BitSet(new long[]{0x0000000000100002L});

}