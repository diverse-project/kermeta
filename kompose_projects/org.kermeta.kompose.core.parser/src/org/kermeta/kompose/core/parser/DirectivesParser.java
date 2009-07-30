// $ANTLR 3.1.1 /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g 2009-07-30 15:20:27

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
    public String getGrammarFileName() { return "/home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g"; }


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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:51:1: dirUnit returns [Composer c = factory.createComposer();] : 'EXT' ext= STRING_LITERAL ( 'MODE' mode= ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY ;
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
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:62:3: ( 'EXT' ext= STRING_LITERAL ( 'MODE' mode= ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:63:3: 'EXT' ext= STRING_LITERAL ( 'MODE' mode= ( UNION | INTER ) )? 'PM' pm= STRING_LITERAL 'AM' am= STRING_LITERAL 'CM' cm= STRING_LITERAL 'PMPre' LCURLY pmpre= directives RCURLY 'AMPre' LCURLY ampre= directives RCURLY 'Post' LCURLY post= directives RCURLY
            {
            match(input,30,FOLLOW_30_in_dirUnit59); 
            ext=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit63); 
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:3: ( 'MODE' mode= ( UNION | INTER ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:4: 'MODE' mode= ( UNION | INTER )
                    {
                    match(input,31,FOLLOW_31_in_dirUnit68); 
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:16: ( UNION | INTER )
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
                            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:17: UNION
                            {
                            match(input,UNION,FOLLOW_UNION_in_dirUnit73); 
                            c.setMode(Modes.UNION);

                            }
                            break;
                        case 2 :
                            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:64:51: INTER
                            {
                            match(input,INTER,FOLLOW_INTER_in_dirUnit79); 
                            c.setMode(Modes.INTERSECTION);

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_dirUnit88); 
            pm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit92); 
            match(input,33,FOLLOW_33_in_dirUnit96); 
            am=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit100); 
            match(input,34,FOLLOW_34_in_dirUnit104); 
            cm=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dirUnit108); 
            match(input,35,FOLLOW_35_in_dirUnit115); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit117); 
            pushFollow(FOLLOW_directives_in_dirUnit121);
            pmpre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit123); 
            match(input,36,FOLLOW_36_in_dirUnit127); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit129); 
            pushFollow(FOLLOW_directives_in_dirUnit133);
            ampre=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit135); 
            match(input,37,FOLLOW_37_in_dirUnit139); 
            match(input,LCURLY,FOLLOW_LCURLY_in_dirUnit141); 
            pushFollow(FOLLOW_directives_in_dirUnit145);
            post=directives();

            state._fsp--;

            match(input,RCURLY,FOLLOW_RCURLY_in_dirUnit147); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:74:1: directives returns [ArrayList lst = new ArrayList()] : (d= directive )* ;
    public final ArrayList directives() throws RecognitionException {
        ArrayList lst =  new ArrayList();

        ElementDirective d = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:74:53: ( (d= directive )* )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:75:3: (d= directive )*
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:75:3: (d= directive )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==STRING_LITERAL||(LA3_0>=CREATE && LA3_0<=ID)||LA3_0==DOLLAR||(LA3_0>=MINUS && LA3_0<=FALSE)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:75:4: d= directive
            	    {
            	    pushFollow(FOLLOW_directive_in_directives164);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:78:1: directive returns [ElementDirective c] : ( concatD | createD | changeD ) ;
    public final ElementDirective directive() throws RecognitionException {
        ElementDirective c = null;

        Concat concatD1 = null;

        Create createD2 = null;

        Change changeD3 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:78:40: ( ( concatD | createD | changeD ) )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:79:3: ( concatD | createD | changeD )
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:79:3: ( concatD | createD | changeD )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:79:4: concatD
                    {
                    pushFollow(FOLLOW_concatD_in_directive184);
                    concatD1=concatD();

                    state._fsp--;

                    c =concatD1;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:79:31: createD
                    {
                    pushFollow(FOLLOW_createD_in_directive190);
                    createD2=createD();

                    state._fsp--;

                    c =createD2;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:79:57: changeD
                    {
                    pushFollow(FOLLOW_changeD_in_directive195);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:82:1: createD returns [Create d = factory.createCreate()] : CREATE id= ID AS DOLLAR var= ID ;
    public final Create createD() throws RecognitionException {
        Create d =  factory.createCreate();

        Token id=null;
        Token var=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:87:3: ( CREATE id= ID AS DOLLAR var= ID )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:88:3: CREATE id= ID AS DOLLAR var= ID
            {
            match(input,CREATE,FOLLOW_CREATE_in_createD221); 
            id=(Token)match(input,ID,FOLLOW_ID_in_createD225); 
            match(input,AS,FOLLOW_AS_in_createD227); 
            match(input,DOLLAR,FOLLOW_DOLLAR_in_createD229); 
            var=(Token)match(input,ID,FOLLOW_ID_in_createD233); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:91:1: changeD returns [Change d = null] : ref= refObj DOT prop= ID ( setD | addD | removeD ) ;
    public final Change changeD() throws RecognitionException {
        Change d =  null;

        Token prop=null;
        ElementRef ref = null;

        Set setD4 = null;

        Add addD5 = null;

        Remove removeD6 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:96:3: (ref= refObj DOT prop= ID ( setD | addD | removeD ) )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:97:3: ref= refObj DOT prop= ID ( setD | addD | removeD )
            {
            pushFollow(FOLLOW_refObj_in_changeD258);
            ref=refObj();

            state._fsp--;

            match(input,DOT,FOLLOW_DOT_in_changeD260); 
            prop=(Token)match(input,ID,FOLLOW_ID_in_changeD264); 
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:98:3: ( setD | addD | removeD )
            int alt5=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt5=1;
                }
                break;
            case PLUS:
                {
                alt5=2;
                }
                break;
            case MINUS:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:98:4: setD
                    {
                    pushFollow(FOLLOW_setD_in_changeD270);
                    setD4=setD();

                    state._fsp--;

                    d =setD4;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:98:25: addD
                    {
                    pushFollow(FOLLOW_addD_in_changeD276);
                    addD5=addD();

                    state._fsp--;

                    d =addD5;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:99:3: removeD
                    {
                    pushFollow(FOLLOW_removeD_in_changeD285);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:102:1: concatD returns [Concat d = factory.createConcat()] : first= concat_property ( COMMA property= concat_property )* CONCAT target= concat_property ;
    public final Concat concatD() throws RecognitionException {
        Concat d =  factory.createConcat();

        DirectivesParser.concat_property_return first = null;

        DirectivesParser.concat_property_return property = null;

        DirectivesParser.concat_property_return target = null;



            ArrayList<String> list = new ArrayList<String>();
            StringLiteral ref = factory.createStringLiteral();
          
        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:112:3: (first= concat_property ( COMMA property= concat_property )* CONCAT target= concat_property )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:113:3: first= concat_property ( COMMA property= concat_property )* CONCAT target= concat_property
            {
            pushFollow(FOLLOW_concat_property_in_concatD320);
            first=concat_property();

            state._fsp--;

            list.add((first!=null?input.toString(first.start,first.stop):null));
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:113:50: ( COMMA property= concat_property )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:113:51: COMMA property= concat_property
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concatD325); 
            	    pushFollow(FOLLOW_concat_property_in_concatD329);
            	    property=concat_property();

            	    state._fsp--;

            	    list.add((property!=null?input.toString(property.start,property.stop):null));

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,CONCAT,FOLLOW_CONCAT_in_concatD335); 
            pushFollow(FOLLOW_concat_property_in_concatD339);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:116:10: fragment concat_property returns [ElementRef ref = null] : ( ( nameRef DOT prop= ID ) | stringL );
    public final DirectivesParser.concat_property_return concat_property() throws RecognitionException {
        DirectivesParser.concat_property_return retval = new DirectivesParser.concat_property_return();
        retval.start = input.LT(1);

        Token prop=null;
        NameRef nameRef7 = null;

        StringLiteral stringL8 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:116:57: ( ( nameRef DOT prop= ID ) | stringL )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==STRING_LITERAL) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:117:3: ( nameRef DOT prop= ID )
                    {
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:117:3: ( nameRef DOT prop= ID )
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:117:4: nameRef DOT prop= ID
                    {
                    pushFollow(FOLLOW_nameRef_in_concat_property356);
                    nameRef7=nameRef();

                    state._fsp--;

                    match(input,DOT,FOLLOW_DOT_in_concat_property358); 
                    prop=(Token)match(input,ID,FOLLOW_ID_in_concat_property362); 

                    }

                    retval.ref =nameRef7;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:117:48: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_concat_property369);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:120:1: setD returns [Set d = factory.createSet()] : EQUALS ref= refObj ;
    public final Set setD() throws RecognitionException {
        Set d =  factory.createSet();

        ElementRef ref = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:120:43: ( EQUALS ref= refObj )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:121:3: EQUALS ref= refObj
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_setD385); 
            pushFollow(FOLLOW_refObj_in_setD389);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:124:1: addD returns [Add d = factory.createAdd()] : PLUS ref= refObj ;
    public final Add addD() throws RecognitionException {
        Add d =  factory.createAdd();

        ElementRef ref = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:124:43: ( PLUS ref= refObj )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:125:3: PLUS ref= refObj
            {
            match(input,PLUS,FOLLOW_PLUS_in_addD405); 
            pushFollow(FOLLOW_refObj_in_addD409);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:128:1: removeD returns [Remove d = factory.createRemove()] : MINUS ref= refObj ;
    public final Remove removeD() throws RecognitionException {
        Remove d =  factory.createRemove();

        ElementRef ref = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:128:52: ( MINUS ref= refObj )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:129:3: MINUS ref= refObj
            {
            match(input,MINUS,FOLLOW_MINUS_in_removeD425); 
            pushFollow(FOLLOW_refObj_in_removeD429);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:132:1: refObj returns [ElementRef ref = null] : ( nameRef | idRef | stringL | booleanL | integerL );
    public final ElementRef refObj() throws RecognitionException {
        ElementRef ref =  null;

        NameRef nameRef9 = null;

        IDRef idRef10 = null;

        StringLiteral stringL11 = null;

        BooleanLiteral booleanL12 = null;

        IntegerLiteral integerL13 = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:132:39: ( nameRef | idRef | stringL | booleanL | integerL )
            int alt8=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt8=1;
                }
                break;
            case DOLLAR:
                {
                alt8=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt8=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt8=4;
                }
                break;
            case MINUS:
            case INT_LITERAL:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:133:3: nameRef
                    {
                    pushFollow(FOLLOW_nameRef_in_refObj445);
                    nameRef9=nameRef();

                    state._fsp--;

                    ref =nameRef9;

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:133:34: idRef
                    {
                    pushFollow(FOLLOW_idRef_in_refObj451);
                    idRef10=idRef();

                    state._fsp--;

                    ref =idRef10;

                    }
                    break;
                case 3 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:134:3: stringL
                    {
                    pushFollow(FOLLOW_stringL_in_refObj459);
                    stringL11=stringL();

                    state._fsp--;

                    ref =stringL11;

                    }
                    break;
                case 4 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:134:34: booleanL
                    {
                    pushFollow(FOLLOW_booleanL_in_refObj465);
                    booleanL12=booleanL();

                    state._fsp--;

                    ref =booleanL12;

                    }
                    break;
                case 5 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:135:3: integerL
                    {
                    pushFollow(FOLLOW_integerL_in_refObj474);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:138:1: nameRef returns [NameRef ref = factory.createNameRef()] : qname= qualifiedID ;
    public final NameRef nameRef() throws RecognitionException {
        NameRef ref =  factory.createNameRef();

        String qname = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:142:3: (qname= qualifiedID )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:143:4: qname= qualifiedID
            {
            pushFollow(FOLLOW_qualifiedID_in_nameRef504);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:146:1: idRef returns [IDRef ref = factory.createIDRef()] : DOLLAR id= ID ;
    public final IDRef idRef() throws RecognitionException {
        IDRef ref =  factory.createIDRef();

        Token id=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:150:3: ( DOLLAR id= ID )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:151:4: DOLLAR id= ID
            {
            match(input,DOLLAR,FOLLOW_DOLLAR_in_idRef528); 
            id=(Token)match(input,ID,FOLLOW_ID_in_idRef532); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:154:1: stringL returns [StringLiteral ref = factory.createStringLiteral()] : v= STRING_LITERAL ;
    public final StringLiteral stringL() throws RecognitionException {
        StringLiteral ref =  factory.createStringLiteral();

        Token v=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:158:3: (v= STRING_LITERAL )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:159:5: v= STRING_LITERAL
            {
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringL559); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:162:1: integerL returns [IntegerLiteral ref = factory.createIntegerLiteral()] : str= integer ;
    public final IntegerLiteral integerL() throws RecognitionException {
        IntegerLiteral ref =  factory.createIntegerLiteral();

        DirectivesParser.integer_return str = null;


        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:166:3: (str= integer )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:167:3: str= integer
            {
            pushFollow(FOLLOW_integer_in_integerL584);
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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:170:1: integer returns [Integer str = null] : ( MINUS )? INT_LITERAL ;
    public final DirectivesParser.integer_return integer() throws RecognitionException {
        DirectivesParser.integer_return retval = new DirectivesParser.integer_return();
        retval.start = input.LT(1);

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:170:37: ( ( MINUS )? INT_LITERAL )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:171:3: ( MINUS )? INT_LITERAL
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:171:3: ( MINUS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==MINUS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:171:4: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_integer600); 

                    }
                    break;

            }

            match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_integer604); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:174:1: booleanL returns [BooleanLiteral ref = factory.createBooleanLiteral()] : ( TRUE | FALSE ) ;
    public final BooleanLiteral booleanL() throws RecognitionException {
        BooleanLiteral ref =  factory.createBooleanLiteral();


            boolean val = false;
          
        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:181:3: ( ( TRUE | FALSE ) )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:182:5: ( TRUE | FALSE )
            {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:182:5: ( TRUE | FALSE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TRUE) ) {
                alt10=1;
            }
            else if ( (LA10_0==FALSE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:182:6: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleanL636); 
                     val = true; 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:182:28: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleanL641); 

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
    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:185:1: qualifiedID returns [String val = \"\"] : str1= ID ( COL_COL strn= ID )* ;
    public final String qualifiedID() throws RecognitionException {
        String val =  "";

        Token str1=null;
        Token strn=null;

        try {
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:185:38: (str1= ID ( COL_COL strn= ID )* )
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:186:3: str1= ID ( COL_COL strn= ID )*
            {
            str1=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID658); 
            val+=(str1!=null?str1.getText():null);
            // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:186:30: ( COL_COL strn= ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COL_COL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/mclavreu/Desktop/OpenEmbeDD-1.3-antlr2/workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:186:31: COL_COL strn= ID
            	    {
            	    match(input,COL_COL,FOLLOW_COL_COL_in_qualifiedID663); 
            	    strn=(Token)match(input,ID,FOLLOW_ID_in_qualifiedID667); 
            	    val+="::"+(strn!=null?strn.getText():null);

            	    }
            	    break;

            	default :
            	    break loop11;
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\4\2\15\2\uffff\2\12\1\uffff\1\15\1\16";
    static final String DFA4_maxS =
        "\1\25\1\26\1\17\2\uffff\2\12\1\uffff\1\26\1\22";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\1\3\2\uffff\1\1\2\uffff";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\4\uffff\1\3\1\1\1\uffff\1\4\5\uffff\4\4",
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
            return "79:3: ( concatD | createD | changeD )";
        }
    }
 

    public static final BitSet FOLLOW_30_in_dirUnit59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit63 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_dirUnit68 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_UNION_in_dirUnit73 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTER_in_dirUnit79 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dirUnit88 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit92 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_dirUnit96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit100 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_dirUnit104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_dirUnit108 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_dirUnit115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit117 = new BitSet(new long[]{0x00000000003C1710L});
    public static final BitSet FOLLOW_directives_in_dirUnit121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit123 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dirUnit127 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit129 = new BitSet(new long[]{0x00000000003C1710L});
    public static final BitSet FOLLOW_directives_in_dirUnit133 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit135 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_dirUnit139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LCURLY_in_dirUnit141 = new BitSet(new long[]{0x00000000003C1710L});
    public static final BitSet FOLLOW_directives_in_dirUnit145 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RCURLY_in_dirUnit147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_directives164 = new BitSet(new long[]{0x00000000003C1612L});
    public static final BitSet FOLLOW_concatD_in_directive184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createD_in_directive190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_changeD_in_directive195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_createD221 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_createD225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_createD227 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DOLLAR_in_createD229 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_createD233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_refObj_in_changeD258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_changeD260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_changeD264 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_setD_in_changeD270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addD_in_changeD276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_removeD_in_changeD285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concat_property_in_concatD320 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_COMMA_in_concatD325 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_concat_property_in_concatD329 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_CONCAT_in_concatD335 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_concat_property_in_concatD339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_concat_property356 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_concat_property358 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_concat_property362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_concat_property369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_setD385 = new BitSet(new long[]{0x00000000003C1610L});
    public static final BitSet FOLLOW_refObj_in_setD389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_addD405 = new BitSet(new long[]{0x00000000003C1610L});
    public static final BitSet FOLLOW_refObj_in_addD409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_removeD425 = new BitSet(new long[]{0x00000000003C1610L});
    public static final BitSet FOLLOW_refObj_in_removeD429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameRef_in_refObj445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idRef_in_refObj451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringL_in_refObj459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanL_in_refObj465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerL_in_refObj474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedID_in_nameRef504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_in_idRef528 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idRef532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringL559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_integerL584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_integer600 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_integer604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanL636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanL641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qualifiedID658 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_COL_COL_in_qualifiedID663 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_qualifiedID667 = new BitSet(new long[]{0x0000000000400002L});

}