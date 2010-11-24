// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime.*;

public class KptLexer extends Lexer {
    public static final int INTEGER=9;
    public static final int MAVEN=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=12;
    public static final int FLOAT=10;
    public static final int TEXT=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int ML_COMMENT=8;
    public static final int T__31=31;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int SL_COMMENT=7;
    public static final int NSURI=5;
    public static final int QUOTED_34_34=4;
    public static final int LINEBREAK=13;

    	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
    	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
    	
    	public void reportError(org.antlr.runtime.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public KptLexer() {;} 
    public KptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public KptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Kpt.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:16:7: ( 'KermetaProject' )
            // Kpt.g:16:9: 'KermetaProject'
            {
            match("KermetaProject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:17:7: ( ':' )
            // Kpt.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:18:7: ( 'version' )
            // Kpt.g:18:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:19:7: ( ': ' )
            // Kpt.g:19:9: ': '
            {
            match(": "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:20:7: ( 'group' )
            // Kpt.g:20:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:21:7: ( '{' )
            // Kpt.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:22:7: ( '}' )
            // Kpt.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:23:7: ( 'ref' )
            // Kpt.g:23:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:24:7: ( 'source' )
            // Kpt.g:24:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:25:7: ( '=' )
            // Kpt.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:26:7: ( 'from' )
            // Kpt.g:26:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:27:7: ( 'dependency' )
            // Kpt.g:27:9: 'dependency'
            {
            match("dependency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:28:7: ( 'weaver-directive' )
            // Kpt.g:28:9: 'weaver-directive'
            {
            match("weaver-directive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:29:7: ( 'merger-option' )
            // Kpt.g:29:9: 'merger-option'
            {
            match("merger-option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:30:7: ( '(' )
            // Kpt.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:31:7: ( ')' )
            // Kpt.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:32:7: ( '[' )
            // Kpt.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:33:7: ( ']' )
            // Kpt.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2314:11: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // Kpt.g:2315:2: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // Kpt.g:2315:6: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kpt.g:2315:7: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2318:11: ( '/*' ( . )* '*/' )
            // Kpt.g:2319:2: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Kpt.g:2319:6: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Kpt.g:2319:6: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2321:8: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-'||(LA5_0>='1' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='0') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Kpt.g:2322:2: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Kpt.g:2322:2: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Kpt.g:2322:3: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Kpt.g:2322:8: ( '1' .. '9' )
                    // Kpt.g:2322:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Kpt.g:2322:18: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Kpt.g:2322:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Kpt.g:2322:30: '0'
                    {
                    match('0'); 
                     _channel = 99; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2324:6: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Kpt.g:2325:2: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Kpt.g:2325:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kpt.g:2325:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Kpt.g:2325:8: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Kpt.g:2325:9: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Kpt.g:2325:9: ( '1' .. '9' )
                    // Kpt.g:2325:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Kpt.g:2325:20: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Kpt.g:2325:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Kpt.g:2325:34: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // Kpt.g:2325:43: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Kpt.g:2325:44: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "MAVEN"
    public final void mMAVEN() throws RecognitionException {
        try {
            int _type = MAVEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2327:6: ( '\"' ( 'A' .. 'Z' )* '\"' )
            // Kpt.g:2328:2: '\"' ( 'A' .. 'Z' )* '\"'
            {
            match('\"'); 
            // Kpt.g:2328:5: ( 'A' .. 'Z' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='A' && LA10_0<='Z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Kpt.g:2328:6: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\"'); 
             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAVEN"

    // $ANTLR start "NSURI"
    public final void mNSURI() throws RecognitionException {
        try {
            int _type = NSURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2330:6: ( ( 'A' .. 'Z' ) ( ( '_' )? ( 'A' .. 'Z' ) )* )
            // Kpt.g:2331:2: ( 'A' .. 'Z' ) ( ( '_' )? ( 'A' .. 'Z' ) )*
            {
            // Kpt.g:2331:2: ( 'A' .. 'Z' )
            // Kpt.g:2331:3: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // Kpt.g:2331:12: ( ( '_' )? ( 'A' .. 'Z' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Kpt.g:2331:13: ( '_' )? ( 'A' .. 'Z' )
            	    {
            	    // Kpt.g:2331:13: ( '_' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0=='_') ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // Kpt.g:2331:14: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    // Kpt.g:2331:19: ( 'A' .. 'Z' )
            	    // Kpt.g:2331:20: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NSURI"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2332:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Kpt.g:2333:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Kpt.g:2333:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='-'||(LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Kpt.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2334:11: ( ( ' ' | '\\t' | '\\f' ) )
            // Kpt.g:2335:2: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2338:10: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Kpt.g:2339:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Kpt.g:2339:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='\n') ) {
                    alt14=1;
                }
                else {
                    alt14=2;}
            }
            else if ( (LA14_0=='\n') ) {
                alt14=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // Kpt.g:2339:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Kpt.g:2339:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Kpt.g:2339:19: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kpt.g:2342:13: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Kpt.g:2343:2: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Kpt.g:2343:2: ( '\"' )
            // Kpt.g:2343:3: '\"'
            {
            match('\"'); 

            }

            // Kpt.g:2343:7: (~ ( '\"' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Kpt.g:2343:8: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // Kpt.g:2343:16: ( '\"' )
            // Kpt.g:2343:17: '\"'
            {
            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Kpt.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | SL_COMMENT | ML_COMMENT | INTEGER | FLOAT | MAVEN | NSURI | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt16=28;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // Kpt.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // Kpt.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // Kpt.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // Kpt.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // Kpt.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // Kpt.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // Kpt.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // Kpt.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // Kpt.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // Kpt.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // Kpt.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // Kpt.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // Kpt.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // Kpt.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // Kpt.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // Kpt.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // Kpt.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // Kpt.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // Kpt.g:1:118: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 20 :
                // Kpt.g:1:129: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 21 :
                // Kpt.g:1:140: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 22 :
                // Kpt.g:1:148: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 23 :
                // Kpt.g:1:154: MAVEN
                {
                mMAVEN(); 

                }
                break;
            case 24 :
                // Kpt.g:1:160: NSURI
                {
                mNSURI(); 

                }
                break;
            case 25 :
                // Kpt.g:1:166: TEXT
                {
                mTEXT(); 

                }
                break;
            case 26 :
                // Kpt.g:1:171: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 27 :
                // Kpt.g:1:182: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 28 :
                // Kpt.g:1:192: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\34\1\40\2\30\2\uffff\2\30\1\uffff\4\30\5\uffff\1\30\2"+
        "\55\1\uffff\1\34\3\uffff\1\30\1\uffff\1\30\1\34\2\uffff\10\30\2"+
        "\uffff\1\30\1\55\5\uffff\3\30\1\77\5\30\1\uffff\3\30\1\uffff\1\30"+
        "\1\111\5\30\1\117\1\30\1\uffff\5\30\1\uffff\1\126\4\30\1\133\1\uffff"+
        "\4\30\1\uffff\10\30\1\150\3\30\1\uffff\7\30\1\163\1\164\1\30\2\uffff"+
        "\1\30\1\167\1\uffff";
    static final String DFA16_eofS =
        "\170\uffff";
    static final String DFA16_minS =
        "\1\11\1\55\1\40\1\145\1\162\2\uffff\1\145\1\157\1\uffff\1\162\3"+
        "\145\4\uffff\1\52\1\60\2\55\1\0\1\55\3\uffff\1\162\1\uffff\1\101"+
        "\1\55\2\uffff\1\162\1\157\1\146\1\165\1\157\1\160\1\141\1\162\2"+
        "\uffff\1\56\1\55\2\uffff\1\0\2\uffff\1\155\1\163\1\165\1\55\1\162"+
        "\1\155\1\145\1\166\1\147\1\uffff\1\145\1\151\1\160\1\uffff\1\143"+
        "\1\55\1\156\2\145\1\164\1\157\1\55\1\145\1\uffff\1\144\2\162\1\141"+
        "\1\156\1\uffff\1\55\1\145\2\55\1\120\1\55\1\uffff\1\156\1\144\1"+
        "\157\1\162\1\uffff\1\143\1\151\1\160\1\157\1\171\1\162\1\164\1\152"+
        "\1\55\1\145\1\151\1\145\1\uffff\1\143\1\157\1\143\1\164\1\156\1"+
        "\164\1\151\2\55\1\166\2\uffff\1\145\1\55\1\uffff";
    static final String DFA16_maxS =
        "\1\175\1\172\1\40\1\145\1\162\2\uffff\1\145\1\157\1\uffff\1\162"+
        "\3\145\4\uffff\1\57\1\71\2\172\1\uffff\1\172\3\uffff\1\162\1\uffff"+
        "\1\132\1\172\2\uffff\1\162\1\157\1\146\1\165\1\157\1\160\1\141\1"+
        "\162\2\uffff\1\56\1\172\2\uffff\1\uffff\2\uffff\1\155\1\163\1\165"+
        "\1\172\1\162\1\155\1\145\1\166\1\147\1\uffff\1\145\1\151\1\160\1"+
        "\uffff\1\143\1\172\1\156\2\145\1\164\1\157\1\172\1\145\1\uffff\1"+
        "\144\2\162\1\141\1\156\1\uffff\1\172\1\145\2\55\1\120\1\172\1\uffff"+
        "\1\156\1\144\1\157\1\162\1\uffff\1\143\1\151\1\160\1\157\1\171\1"+
        "\162\1\164\1\152\1\172\1\145\1\151\1\145\1\uffff\1\143\1\157\1\143"+
        "\1\164\1\156\1\164\1\151\2\172\1\166\2\uffff\1\145\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\6\1\7\2\uffff\1\12\4\uffff\1\17\1\20\1\21\1\22\6\uffff"+
        "\1\31\1\32\1\33\1\uffff\1\30\2\uffff\1\4\1\2\10\uffff\1\23\1\24"+
        "\2\uffff\1\25\1\26\1\uffff\1\27\1\34\11\uffff\1\27\3\uffff\1\10"+
        "\11\uffff\1\13\5\uffff\1\5\6\uffff\1\11\4\uffff\1\3\14\uffff\1\14"+
        "\12\uffff\1\16\1\1\2\uffff\1\15";
    static final String DFA16_specialS =
        "\26\uffff\1\0\30\uffff\1\1\110\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\31\1\32\1\uffff\1\31\1\32\22\uffff\1\31\1\uffff\1\26\5\uffff"+
            "\1\16\1\17\3\uffff\1\23\1\uffff\1\22\1\25\11\24\1\2\2\uffff"+
            "\1\11\3\uffff\12\27\1\1\17\27\1\20\1\uffff\1\21\1\uffff\1\30"+
            "\1\uffff\3\30\1\13\1\30\1\12\1\4\5\30\1\15\4\30\1\7\1\10\2\30"+
            "\1\3\1\14\3\30\1\5\1\uffff\1\6",
            "\1\30\2\uffff\12\30\7\uffff\32\36\4\uffff\1\35\1\uffff\4\30"+
            "\1\33\25\30",
            "\1\37",
            "\1\41",
            "\1\42",
            "",
            "",
            "\1\43",
            "\1\44",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\52\4\uffff\1\51",
            "\1\53\11\24",
            "\1\30\1\56\1\uffff\12\54\7\uffff\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\1\30\1\56\1\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\42\61\1\60\36\61\32\57\uffa5\61",
            "\1\30\2\uffff\12\30\7\uffff\32\36\4\uffff\1\35\1\uffff\32\30",
            "",
            "",
            "",
            "\1\62",
            "",
            "\32\36",
            "\1\30\2\uffff\12\30\7\uffff\32\36\4\uffff\1\35\1\uffff\32\30",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\56",
            "\1\30\1\56\1\uffff\12\54\7\uffff\32\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "",
            "",
            "\42\61\1\60\36\61\32\57\uffa5\61",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\165",
            "",
            "",
            "\1\166",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | SL_COMMENT | ML_COMMENT | INTEGER | FLOAT | MAVEN | NSURI | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_22 = input.LA(1);

                        s = -1;
                        if ( ((LA16_22>='A' && LA16_22<='Z')) ) {s = 47;}

                        else if ( (LA16_22=='\"') ) {s = 48;}

                        else if ( ((LA16_22>='\u0000' && LA16_22<='!')||(LA16_22>='#' && LA16_22<='@')||(LA16_22>='[' && LA16_22<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_47 = input.LA(1);

                        s = -1;
                        if ( (LA16_47=='\"') ) {s = 48;}

                        else if ( ((LA16_47>='A' && LA16_47<='Z')) ) {s = 47;}

                        else if ( ((LA16_47>='\u0000' && LA16_47<='!')||(LA16_47>='#' && LA16_47<='@')||(LA16_47>='[' && LA16_47<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}