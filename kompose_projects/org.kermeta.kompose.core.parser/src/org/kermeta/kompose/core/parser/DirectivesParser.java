// $ANTLR 3.1.1 /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g 2009-07-31 17:16:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING_LITERAL", "UNION", "INTER", "LCURLY", "RCURLY", "CREATE", "ID", "AS", "DOLLAR", "DOT", "COMMA", "CONCAT", "EQUALS", "PLUS", "MINUS", "INT_LITERAL", "TRUE", "FALSE", "COL_COL", "PRE", "POST", "ESC", "DIGIT", "WS", "SingleLineComment", "MultiLineComment", "'EXT'", "'MODE'", "'PM'", "'AM'", "'CM'", "'PMPre'", "'AMPre'", "'Post'"
    };
    public static final int DOLLAR=12;
    public static final int INT_LITERAL=19;
    public static final int SingleLineComment=28;
    public static final int CONCAT=15;
    public static final int ESC=25;
    public static final int COL_COL=22;
    public static final int INTER=6;
    public static final int LCURLY=7;
    public static final int PRE=23;
    public static final int EQUALS=16;
    public static final int MINUS=18;
    public static final int ID=10;
    public static final int EOF=-1;
    public static final int TRUE=20;
    public static final int UNION=5;
    public static final int T__30=30;
    public static final int AS=11;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int CREATE=9;
    public static final int WS=27;
    public static final int T__33=33;
    public static final int STRING_LITERAL=4;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int COMMA=14;
    public static final int RCURLY=8;
    public static final int POST=24;
    public static final int PLUS=17;
    public static final int DIGIT=26;
    public static final int DOT=13;
    public static final int FALSE=21;
    public static final int MultiLineComment=29;

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:52:1: dirUnit returns [Composer c = factory.createComposer();] : 'EXT' ext= STRING_LITERAL ( 'MODE' mode= ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY ;
    public final Composer dirUnit() throws RecognitionException {
        Composer c =  factory.createComposer();;

        Token ext=null;
        Token mode=null;
        Token pm=null;
        Token am=null;
        Token cm=null;
        ArrayList pmpre = null;

        ArrayList ampre = null;

        ArrayList post = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:62:3: ( 'EXT' ext= STRING_LITERAL ( 'MODE' mode= ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:63:3: 'EXT' ext= STRING_LITERAL ( 'MODE' mode= ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY
            {
            match(input,30,FOLLOW_30_in_dirUnit66); 
            ext=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit70); 
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:3: ( 'MODE' mode= ( UNION | INTER ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:4: 'MODE' mode= ( UNION | INTER )
                    {
                    match(input,31,FOLLOW_31_in_dirUnit75); 
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:16: ( UNION | INTER )
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
                            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:17: UNION
                            {
                            match(input,UNION,FOLLOW_UNION_in_dirUnit80); 
                            c.setMode(Modes.UNION);

                            }
                            break;
                        case 2 :
                            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:51: INTER
                            {
                            match(input,INTER,FOLLOW_INTER_in_dirUnit86); 
                            c.setMode(Modes.INTERSECTION);

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_dirUnit95); 
            pm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit99); 
            match(input,33,FOLLOW_33_in_dirUnit103); 
            am=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit107); 
            match(input,34,FOLLOW_34_in_dirUnit111); 
            cm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit115); 
            match(input,35,FOLLOW_35_in_dirUnit122); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit124); 
            pushFollow(FOLLOW_directives_in_dirUnit128);
            pmpre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit130); 
            match(input,36,FOLLOW_36_in_dirUnit134); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit136); 
            pushFollow(FOLLOW_directives_in_dirUnit140);
            ampre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit142); 
            match(input,37,FOLLOW_37_in_dirUnit146); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit148); 
            pushFollow(FOLLOW_directives_in_dirUnit152);
            post=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit154); 

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:74:1: directives returns [ArrayList lst = new ArrayList()] : (d= directive )* ;
    public final ArrayList directives() throws RecognitionException {
        ArrayList lst =  new ArrayList();

        ElementDirective d = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:74:53: ( (d= directive )* )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:75:3: (d= directive )*
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:75:3: (d= directive )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:75:4: d= directive
            	    {
            	    pushFollow(FOLLOW_directive_in_directives171);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:82:1: directive returns [ElementDirective c] : ( propertyD | stringD | createD ) ;
    public final ElementDirective directive() throws RecognitionException {
        ElementDirective c = null;

        ElementDirective propertyD1 = null;

        ElementDirective stringD2 = null;

        Create createD3 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:82:40: ( ( propertyD | stringD | createD ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:83:3: ( propertyD | stringD | createD )
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:83:3: ( propertyD | stringD | createD )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:83:4: propertyD
                    {
                    pushFollow(FOLLOW_propertyD_in_directive194);
                    propertyD1=propertyD();

                    state._fsp--;

                    c =propertyD1;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:83:35: stringD
                    {
                    pushFollow(FOLLOW_stringD_in_directive200);
                    stringD2=stringD();

                    state._fsp--;

                    c =stringD2;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:83:62: createD
                    {
                    pushFollow(FOLLOW_createD_in_directive206);
                    createD3=createD();

                    state._fsp--;

                    c =createD3;

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:86:1: createD returns [Create d = factory.createCreate()] : CREATE id= ID AS DOLLAR var= ID ;
    public final Create createD() throws RecognitionException {
        Create d =  factory.createCreate();

        Token id=null;
        Token var=null;

        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:91:3: ( CREATE id= ID AS DOLLAR var= ID )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:92:3: CREATE id= ID AS DOLLAR var= ID
            {
            match(input,CREATE,FOLLOW_CREATE_in_createD231); 
            id=(Token)match(input,ID,FOLLOW_ID_in_createD235); 
            match(input,AS,FOLLOW_AS_in_createD237); 
            match(input,DOLLAR,FOLLOW_DOLLAR_in_createD239); 
            var=(Token)match(input,ID,FOLLOW_ID_in_createD243); 

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


    // $ANTLR start "propertyD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:95:1: propertyD returns [ElementDirective c = null] : ref= refObj DOT prop= ID ( changeD[$prop.text, ref] | concatD[$prop.text, ref] ) ;
    public final ElementDirective propertyD() throws RecognitionException {
        ElementDirective c =  null;

        Token prop=null;
        ElementRef ref = null;

        Change changeD4 = null;

        Concat concatD5 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:95:46: (ref= refObj DOT prop= ID ( changeD[$prop.text, ref] | concatD[$prop.text, ref] ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:3: ref= refObj DOT prop= ID ( changeD[$prop.text, ref] | concatD[$prop.text, ref] )
            {
            pushFollow(FOLLOW_refObj_in_propertyD259);
            ref=refObj();

            state._fsp--;

            match(input,DOT,FOLLOW_DOT_in_propertyD261); 
            prop=(Token)match(input,ID,FOLLOW_ID_in_propertyD265); 
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:26: ( changeD[$prop.text, ref] | concatD[$prop.text, ref] )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=EQUALS && LA5_0<=MINUS)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=COMMA && LA5_0<=CONCAT)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:27: changeD[$prop.text, ref]
                    {
                    pushFollow(FOLLOW_changeD_in_propertyD268);
                    changeD4=changeD((prop!=null?prop.getText():null), ref);

                    state._fsp--;

                    c =changeD4;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:70: concatD[$prop.text, ref]
                    {
                    pushFollow(FOLLOW_concatD_in_propertyD274);
                    concatD5=concatD((prop!=null?prop.getText():null), ref);

                    state._fsp--;

                    c =concatD5;

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
    // $ANTLR end "propertyD"


    // $ANTLR start "stringD"
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:99:1: stringD returns [ElementDirective c = null] : ref= stringL concatD[$ref.text,null] ;
    public final ElementDirective stringD() throws RecognitionException {
        ElementDirective c =  null;

        DirectivesParser.stringL_return ref = null;

        Concat concatD6 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:99:44: (ref= stringL concatD[$ref.text,null] )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:100:3: ref= stringL concatD[$ref.text,null]
            {
            pushFollow(FOLLOW_stringL_in_stringD293);
            ref=stringL();

            state._fsp--;

            pushFollow(FOLLOW_concatD_in_stringD295);
            concatD6=concatD((ref!=null?input.toString(ref.start,ref.stop):null), null);

            state._fsp--;

            c =concatD6;

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:103:1: changeD[String prop, ElementRef ref] returns [Change d = null] : ( setD | addD | removeD ) ;
    public final Change changeD(String prop, ElementRef ref) throws RecognitionException {
        Change d =  null;

        Set setD7 = null;

        Add addD8 = null;

        Remove removeD9 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:108:3: ( ( setD | addD | removeD ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:109:3: ( setD | addD | removeD )
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:109:3: ( setD | addD | removeD )
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
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:109:4: setD
                    {
                    pushFollow(FOLLOW_setD_in_changeD323);
                    setD7=setD();

                    state._fsp--;

                    d =setD7;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:109:25: addD
                    {
                    pushFollow(FOLLOW_addD_in_changeD329);
                    addD8=addD();

                    state._fsp--;

                    d =addD8;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:109:46: removeD
                    {
                    pushFollow(FOLLOW_removeD_in_changeD335);
                    removeD9=removeD();

                    state._fsp--;

                    d =removeD9;

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:112:1: concatD[String prop, ElementRef ref] returns [Concat d = factory.createConcat()] : ( COMMA property= concat_property )* CONCAT target= concat_property ;
    public final Concat concatD(String prop, ElementRef ref) throws RecognitionException {
        Concat d =  factory.createConcat();

        DirectivesParser.concat_property_return property = null;

        DirectivesParser.concat_property_return target = null;



            ArrayList<String> list = new ArrayList<String>();
            list.add(prop);
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:122:3: ( ( COMMA property= concat_property )* CONCAT target= concat_property )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:123:3: ( COMMA property= concat_property )* CONCAT target= concat_property
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:123:3: ( COMMA property= concat_property )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:123:4: COMMA property= concat_property
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concatD370); 
            	    pushFollow(FOLLOW_concat_property_in_concatD374);
            	    property=concat_property();

            	    state._fsp--;

            	    list.add((property!=null?input.toString(property.start,property.stop):null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,CONCAT,FOLLOW_CONCAT_in_concatD380); 
            pushFollow(FOLLOW_concat_property_in_concatD384);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:126:10: fragment concat_property returns [ElementRef ref = null] : ( ( nameRef DOT prop= ID ) | stringL );
    public final DirectivesParser.concat_property_return concat_property() throws RecognitionException {
        DirectivesParser.concat_property_return retval = new DirectivesParser.concat_property_return();
        retval.start = input.LT(1);

        Token prop=null;
        NameRef nameRef10 = null;

        DirectivesParser.stringL_return stringL11 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:126:57: ( ( nameRef DOT prop= ID ) | stringL )
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
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:127:3: ( nameRef DOT prop= ID )
                    {
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:127:3: ( nameRef DOT prop= ID )
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:127:4: nameRef DOT prop= ID
                    {
                    pushFollow(FOLLOW_nameRef_in_concat_property401);
                    nameRef10=nameRef();

                    state._fsp--;

                    match(input,DOT,FOLLOW_DOT_in_concat_property403); 
                    prop=(Token)match(input,ID,FOLLOW_ID_in_concat_property407); 

                    }

                    retval.ref =nameRef10;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:127:48: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_concat_property414);
                    stringL11=stringL();

                    state._fsp--;

                    retval.ref =(stringL11!=null?stringL11.ref:null);

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:130:1: setD returns [Set d = factory.createSet()] : EQUALS ref= refObj ;
    public final Set setD() throws RecognitionException {
        Set d =  factory.createSet();

        ElementRef ref = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:130:43: ( EQUALS ref= refObj )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:131:3: EQUALS ref= refObj
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_setD430); 
            pushFollow(FOLLOW_refObj_in_setD434);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:134:1: addD returns [Add d = factory.createAdd()] : PLUS ref= refObj ;
    public final Add addD() throws RecognitionException {
        Add d =  factory.createAdd();

        ElementRef ref = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:134:43: ( PLUS ref= refObj )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:3: PLUS ref= refObj
            {
            match(input,PLUS,FOLLOW_PLUS_in_addD450); 
            pushFollow(FOLLOW_refObj_in_addD454);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:138:1: removeD returns [Remove d = factory.createRemove()] : MINUS ref= refObj ;
    public final Remove removeD() throws RecognitionException {
        Remove d =  factory.createRemove();

        ElementRef ref = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:138:52: ( MINUS ref= refObj )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:139:3: MINUS ref= refObj
            {
            match(input,MINUS,FOLLOW_MINUS_in_removeD470); 
            pushFollow(FOLLOW_refObj_in_removeD474);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:142:1: refObj returns [ElementRef ref = null] : ( nameRef | idRef | stringL | booleanL | integerL );
    public final ElementRef refObj() throws RecognitionException {
        ElementRef ref =  null;

        NameRef nameRef12 = null;

        IDRef idRef13 = null;

        DirectivesParser.stringL_return stringL14 = null;

        BooleanLiteral booleanL15 = null;

        IntegerLiteral integerL16 = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:142:39: ( nameRef | idRef | stringL | booleanL | integerL )
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
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:143:3: nameRef
                    {
                    pushFollow(FOLLOW_nameRef_in_refObj490);
                    nameRef12=nameRef();

                    state._fsp--;

                    ref =nameRef12;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:143:34: idRef
                    {
                    pushFollow(FOLLOW_idRef_in_refObj496);
                    idRef13=idRef();

                    state._fsp--;

                    ref =idRef13;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:144:3: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_refObj504);
                    stringL14=stringL();

                    state._fsp--;

                    ref =(stringL14!=null?stringL14.ref:null);

                    }
                    break;
                case 4 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:144:34: booleanL
                    {
                    pushFollow(FOLLOW_booleanL_in_refObj510);
                    booleanL15=booleanL();

                    state._fsp--;

                    ref =booleanL15;

                    }
                    break;
                case 5 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:145:3: integerL
                    {
                    pushFollow(FOLLOW_integerL_in_refObj519);
                    integerL16=integerL();

                    state._fsp--;

                    ref =integerL16;

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:148:1: nameRef returns [NameRef ref = factory.createNameRef()] : qname= qualifiedID ;
    public final NameRef nameRef() throws RecognitionException {
        NameRef ref =  factory.createNameRef();

        String qname = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:152:3: (qname= qualifiedID )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:153:4: qname= qualifiedID
            {
            pushFollow(FOLLOW_qualifiedID_in_nameRef549);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:156:1: idRef returns [IDRef ref = factory.createIDRef()] : DOLLAR id= ID ;
    public final IDRef idRef() throws RecognitionException {
        IDRef ref =  factory.createIDRef();

        Token id=null;

        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:160:3: ( DOLLAR id= ID )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:161:4: DOLLAR id= ID
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_idRef573); 
            id=(Token)match(input,ID,FOLLOW_ID_in_idRef577); 

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:164:1: stringL returns [StringLiteral ref = factory.createStringLiteral()] : v= STRING_LITERAL ;
    public final DirectivesParser.stringL_return stringL() throws RecognitionException {
        DirectivesParser.stringL_return retval = new DirectivesParser.stringL_return();
        retval.start = input.LT(1);

        Token v=null;

        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:168:3: (v= STRING_LITERAL )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:169:5: v= STRING_LITERAL
            {
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringL604); 

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:172:1: integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()] : str= integer ;
    public final IntegerLiteral integerL() throws RecognitionException {
        IntegerLiteral ref =  factory.createIntegerLiteral();

        DirectivesParser.integer_return str = null;


        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:176:3: (str= integer )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:177:3: str= integer
            {
            pushFollow(FOLLOW_integer_in_integerL629);
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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:180:1: integer returns [Integer str = null] : ( MINUS )? INT_LITERAL ;
    public final DirectivesParser.integer_return integer() throws RecognitionException {
        DirectivesParser.integer_return retval = new DirectivesParser.integer_return();
        retval.start = input.LT(1);

        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:180:37: ( ( MINUS )? INT_LITERAL )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:3: ( MINUS )? INT_LITERAL
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:3: ( MINUS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==MINUS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:4: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_integer645); 

                    }
                    break;

            }

            match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_integer649); 

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:184:1: booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()] : ( TRUE | FALSE ) ;
    public final BooleanLiteral booleanL() throws RecognitionException {
        BooleanLiteral ref =  factory.createBooleanLiteral();


            boolean val = false;
          
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:191:3: ( ( TRUE | FALSE ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:192:5: ( TRUE | FALSE )
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:192:5: ( TRUE | FALSE )
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
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:192:6: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanL681); 
                     val = true; 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:192:28: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanL686); 

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
    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:195:1: qualifiedID returns [String val = \"\"] : str1= ID ( COL_COL strn= ID )* ;
    public final String qualifiedID() throws RecognitionException {
        String val =  "";

        Token str1=null;
        Token strn=null;

        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:195:38: (str1= ID ( COL_COL strn= ID )* )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:196:3: str1= ID ( COL_COL strn= ID )*
            {
            str1=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID703); 
            val+=(str1!=null?str1.getText():null);
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:196:30: ( COL_COL strn= ID )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:196:31: COL_COL strn= ID
            	    {
            	    match(input,COL_COL,FOLLOW_COL_COL_in_qualifiedID708); 
            	    strn=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID712); 
            	    val+="::"+(strn!=null?strn.getText():null);

            	    }
            	    break;

            	default :
            	    break loop12;
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\4\11\uffff";
    static final String DFA3_maxS =
        "\1\25\11\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\1\1\7\uffff";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\3\uffff\1\1\2\2\1\uffff\1\2\5\uffff\4\2",
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
            return "()* loopback of 75:3: (d= directive )*";
        }
    }
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\4\2\uffff\1\15\10\uffff";
    static final String DFA4_maxS =
        "\1\25\2\uffff\1\17\10\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\6\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\4\uffff\1\10\1\1\1\uffff\1\1\5\uffff\4\1",
            "",
            "",
            "\1\1\2\12",
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
            return "83:3: ( propertyD | stringD | createD )";
        }
    }
    static final String DFA12_eotS =
        "\14\uffff";
    static final String DFA12_eofS =
        "\14\uffff";
    static final String DFA12_minS =
        "\1\4\13\uffff";
    static final String DFA12_maxS =
        "\1\26\13\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA12_specialS =
        "\14\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\3\uffff\3\1\1\uffff\2\1\4\uffff\4\1\1\13",
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
            return "()* loopback of 196:30: ( COL_COL strn= ID )*";
        }
    }
 

    public static final BitSet FOLLOW_30_in_dirUnit66 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit70 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_dirUnit75 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_UNION_in_dirUnit80 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTER_in_dirUnit86 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dirUnit95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit99 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_dirUnit103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit107 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_dirUnit111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit115 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_dirUnit122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit124 = new BitSet(new long[]{0x00000000003C1710L});
    public static final BitSet FOLLOW_directives_in_dirUnit128 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit130 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dirUnit134 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit136 = new BitSet(new long[]{0x00000000003C1710L});
    public static final BitSet FOLLOW_directives_in_dirUnit140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit142 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_dirUnit146 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit148 = new BitSet(new long[]{0x00000000003C1710L});
    public static final BitSet FOLLOW_directives_in_dirUnit152 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_directives171 = new BitSet(new long[]{0x00000000003C1612L});
    public static final BitSet FOLLOW_propertyD_in_directive194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringD_in_directive200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createD_in_directive206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createD231 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_createD235 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_createD237 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DOLLAR_in_createD239 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_createD243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refObj_in_propertyD259 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_propertyD261 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_propertyD265 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_changeD_in_propertyD268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concatD_in_propertyD274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_stringD293 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_concatD_in_stringD295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setD_in_changeD323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addD_in_changeD329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeD_in_changeD335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_concatD370 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_concat_property_in_concatD374 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_CONCAT_in_concatD380 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_concat_property_in_concatD384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_concat_property401 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_concat_property403 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_concat_property407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_concat_property414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_setD430 = new BitSet(new long[]{0x00000000003C1410L});
    public static final BitSet FOLLOW_refObj_in_setD434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addD450 = new BitSet(new long[]{0x00000000003C1410L});
    public static final BitSet FOLLOW_refObj_in_addD454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_removeD470 = new BitSet(new long[]{0x00000000003C1410L});
    public static final BitSet FOLLOW_refObj_in_removeD474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_refObj490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idRef_in_refObj496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_refObj504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanL_in_refObj510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerL_in_refObj519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedID_in_nameRef549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_idRef573 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idRef577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringL604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_integerL629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_integer645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_integer649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanL681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanL686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualifiedID703 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COL_COL_in_qualifiedID708 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_qualifiedID712 = new BitSet(new long[]{0x0000000000400002L});

}