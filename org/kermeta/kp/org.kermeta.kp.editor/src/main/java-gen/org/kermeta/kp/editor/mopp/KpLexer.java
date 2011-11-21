// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;

public class KpLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int QUOTED_34_34=4;
    public static final int SL_COMMENT=5;
    public static final int ML_COMMENT=6;
    public static final int FLOAT=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;
    public static final int LINEBREAK=10;

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public KpLexer() {;} 
    public KpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public KpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Kp.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:16:7: ( 'KermetaProject' )
            // Kp.g:16:9: 'KermetaProject'
            {
            match("KermetaProject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:17:7: ( 'groupId' )
            // Kp.g:17:9: 'groupId'
            {
            match("groupId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:18:7: ( '=' )
            // Kp.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:19:7: ( 'defaultMainClass' )
            // Kp.g:19:9: 'defaultMainClass'
            {
            match("defaultMainClass"); 


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
            // Kp.g:20:7: ( 'defaultMainOperation' )
            // Kp.g:20:9: 'defaultMainOperation'
            {
            match("defaultMainOperation"); 


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
            // Kp.g:21:7: ( 'dependencies' )
            // Kp.g:21:9: 'dependencies'
            {
            match("dependencies"); 


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
            // Kp.g:22:7: ( '{' )
            // Kp.g:22:9: '{'
            {
            match('{'); 

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
            // Kp.g:23:7: ( '}' )
            // Kp.g:23:9: '}'
            {
            match('}'); 

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
            // Kp.g:24:7: ( 'sources' )
            // Kp.g:24:9: 'sources'
            {
            match("sources"); 


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
            // Kp.g:25:7: ( 'options' )
            // Kp.g:25:9: 'options'
            {
            match("options"); 


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
            // Kp.g:26:7: ( 'weaveDirectives' )
            // Kp.g:26:9: 'weaveDirectives'
            {
            match("weaveDirectives"); 


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
            // Kp.g:27:7: ( 'require' )
            // Kp.g:27:9: 'require'
            {
            match("require"); 


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
            // Kp.g:28:7: ( 'source' )
            // Kp.g:28:9: 'source'
            {
            match("source"); 


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
            // Kp.g:29:7: ( 'byteCodeFromADependency' )
            // Kp.g:29:9: 'byteCodeFromADependency'
            {
            match("byteCodeFromADependency"); 


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
            // Kp.g:30:7: ( 'dependency' )
            // Kp.g:30:9: 'dependency'
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
            // Kp.g:31:7: ( 'URLs' )
            // Kp.g:31:9: 'URLs'
            {
            match("URLs"); 


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
            // Kp.g:32:7: ( ',' )
            // Kp.g:32:9: ','
            {
            match(','); 

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
            // Kp.g:33:7: ( 'ignoreByteCode' )
            // Kp.g:33:9: 'ignoreByteCode'
            {
            match("ignoreByteCode"); 


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
            // Kp.g:34:7: ( 'sourceOnly' )
            // Kp.g:34:9: 'sourceOnly'
            {
            match("sourceOnly"); 


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
            // Kp.g:35:7: ( 'weaver-directive' )
            // Kp.g:35:9: 'weaver-directive'
            {
            match("weaver-directive"); 


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
            // Kp.g:36:7: ( 'option' )
            // Kp.g:36:9: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:37:7: ( 'value' )
            // Kp.g:37:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:38:7: ( '(' )
            // Kp.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:39:7: ( ')' )
            // Kp.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:2201:11: ( ( '//' (~ ( '\\n' | '\\r' ) )* ) )
            // Kp.g:2202:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // Kp.g:2202:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // Kp.g:2202:3: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // Kp.g:2202:7: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kp.g:2202:8: ~ ( '\\n' | '\\r' )
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


            }

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
            // Kp.g:2205:11: ( ( '/*' ( . )* '*/' ) )
            // Kp.g:2206:2: ( '/*' ( . )* '*/' )
            {
            // Kp.g:2206:2: ( '/*' ( . )* '*/' )
            // Kp.g:2206:3: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Kp.g:2206:7: ( . )*
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
            	    // Kp.g:2206:7: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:2209:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // Kp.g:2210:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // Kp.g:2210:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Kp.g:2210:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Kp.g:2210:3: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Kp.g:2210:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Kp.g:2210:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='1' && LA5_0<='9')) ) {
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
                    // Kp.g:2210:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Kp.g:2210:10: ( '1' .. '9' )
                    // Kp.g:2210:11: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Kp.g:2210:21: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Kp.g:2210:22: '0' .. '9'
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
                    // Kp.g:2210:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // Kp.g:2210:44: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Kp.g:2210:45: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:2213:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Kp.g:2214:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Kp.g:2214:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Kp.g:2214:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Kp.g:2214:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Kp.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

             _channel = 99; 

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
            // Kp.g:2217:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Kp.g:2218:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Kp.g:2218:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Kp.g:2218:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

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
            // Kp.g:2221:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Kp.g:2222:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Kp.g:2222:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Kp.g:2222:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Kp.g:2222:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='\n') ) {
                    alt8=1;
                }
                else {
                    alt8=2;}
            }
            else if ( (LA8_0=='\n') ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Kp.g:2222:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Kp.g:2222:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Kp.g:2222:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


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
            // Kp.g:2225:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Kp.g:2226:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Kp.g:2226:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Kp.g:2226:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Kp.g:2226:3: ( '\"' )
            // Kp.g:2226:4: '\"'
            {
            match('\"'); 

            }

            // Kp.g:2226:8: (~ ( '\"' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Kp.g:2226:9: ~ ( '\"' )
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
            	    break loop9;
                }
            } while (true);

            // Kp.g:2226:17: ( '\"' )
            // Kp.g:2226:18: '\"'
            {
            match('\"'); 

            }


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
        // Kp.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt10=31;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Kp.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // Kp.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // Kp.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // Kp.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // Kp.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // Kp.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // Kp.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // Kp.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // Kp.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // Kp.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // Kp.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // Kp.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // Kp.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // Kp.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // Kp.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // Kp.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // Kp.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // Kp.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // Kp.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // Kp.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // Kp.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // Kp.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // Kp.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // Kp.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // Kp.g:1:154: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 26 :
                // Kp.g:1:165: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 27 :
                // Kp.g:1:176: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 28 :
                // Kp.g:1:182: TEXT
                {
                mTEXT(); 

                }
                break;
            case 29 :
                // Kp.g:1:187: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 30 :
                // Kp.g:1:198: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 31 :
                // Kp.g:1:208: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\2\26\1\uffff\1\26\2\uffff\6\26\1\uffff\2\26\3\uffff\3"+
        "\26\4\uffff\13\26\2\uffff\1\26\1\uffff\25\26\1\112\13\26\1\uffff"+
        "\1\26\1\130\4\26\1\137\1\141\5\26\1\uffff\1\26\1\150\2\26\1\153"+
        "\1\26\1\uffff\1\155\1\uffff\2\26\1\160\3\26\1\uffff\2\26\1\uffff"+
        "\1\26\1\uffff\2\26\1\uffff\15\26\1\u0087\1\u0088\7\26\2\uffff\7"+
        "\26\1\u0098\7\26\1\uffff\4\26\1\u00a4\5\26\1\u00aa\1\uffff\2\26"+
        "\1\u00ad\2\26\1\uffff\1\u00b0\1\26\1\uffff\1\u00b2\1\26\1\uffff"+
        "\1\26\1\uffff\5\26\1\u00ba\1\26\1\uffff\2\26\1\u00be\1\uffff";
    static final String DFA10_eofS =
        "\u00bf\uffff";
    static final String DFA10_minS =
        "\1\11\1\145\1\162\1\uffff\1\145\2\uffff\1\157\1\160\2\145\1\171"+
        "\1\122\1\uffff\1\147\1\141\2\uffff\1\52\1\60\2\56\4\uffff\1\162"+
        "\1\157\1\146\1\165\1\164\1\141\1\161\1\164\1\114\1\156\1\154\2\uffff"+
        "\1\56\1\uffff\1\155\1\165\1\141\1\145\1\162\1\151\1\166\1\165\1"+
        "\145\1\163\1\157\1\165\1\145\1\160\1\165\1\156\1\143\1\157\1\145"+
        "\1\151\1\103\1\55\1\162\1\145\1\164\1\111\1\154\1\144\1\145\1\156"+
        "\1\104\1\162\1\157\1\uffff\1\145\1\55\1\141\1\144\1\164\1\145\2"+
        "\55\1\151\1\55\1\145\1\144\1\102\1\uffff\1\120\1\55\1\115\1\156"+
        "\1\55\1\156\1\uffff\1\55\1\uffff\1\162\1\144\1\55\1\145\1\171\1"+
        "\162\1\uffff\1\141\1\143\1\uffff\1\154\1\uffff\1\145\1\151\1\uffff"+
        "\1\106\1\164\1\157\2\151\1\171\1\143\2\162\1\145\1\152\1\156\1\145"+
        "\2\55\1\164\1\145\1\157\1\103\1\145\1\103\1\163\2\uffff\1\151\1"+
        "\143\1\155\1\157\1\143\1\154\1\160\1\55\1\166\1\164\1\101\1\144"+
        "\1\164\1\141\1\145\1\uffff\1\145\1\151\1\104\1\145\1\55\1\163\1"+
        "\162\1\163\1\166\1\145\1\55\1\uffff\1\163\1\141\1\55\1\145\1\160"+
        "\1\uffff\1\55\1\164\1\uffff\1\55\1\145\1\uffff\1\151\1\uffff\1\156"+
        "\1\157\1\144\1\156\1\145\1\55\1\156\1\uffff\1\143\1\171\1\55\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\145\1\162\1\uffff\1\145\2\uffff\1\157\1\160\2\145\1\171"+
        "\1\122\1\uffff\1\147\1\141\2\uffff\1\57\2\71\1\56\4\uffff\1\162"+
        "\1\157\1\160\1\165\1\164\1\141\1\161\1\164\1\114\1\156\1\154\2\uffff"+
        "\1\71\1\uffff\1\155\1\165\1\141\1\145\1\162\1\151\1\166\1\165\1"+
        "\145\1\163\1\157\1\165\1\145\1\160\1\165\1\156\1\143\1\157\1\145"+
        "\1\151\1\103\1\172\1\162\1\145\1\164\1\111\1\154\1\144\1\145\1\156"+
        "\2\162\1\157\1\uffff\1\145\1\172\1\141\1\144\1\164\1\145\2\172\1"+
        "\151\1\55\1\145\1\144\1\102\1\uffff\1\120\1\172\1\115\1\156\1\172"+
        "\1\156\1\uffff\1\172\1\uffff\1\162\1\144\1\172\1\145\1\171\1\162"+
        "\1\uffff\1\141\1\143\1\uffff\1\154\1\uffff\1\145\1\151\1\uffff\1"+
        "\106\1\164\1\157\1\151\2\171\1\143\2\162\1\145\1\152\1\156\1\145"+
        "\2\172\1\164\1\145\1\157\1\103\1\145\1\117\1\163\2\uffff\1\151\1"+
        "\143\1\155\1\157\1\143\1\154\1\160\1\172\1\166\1\164\1\101\1\144"+
        "\1\164\1\141\1\145\1\uffff\1\145\1\151\1\104\1\145\1\172\1\163\1"+
        "\162\1\163\1\166\1\145\1\172\1\uffff\1\163\1\141\1\172\1\145\1\160"+
        "\1\uffff\1\172\1\164\1\uffff\1\172\1\145\1\uffff\1\151\1\uffff\1"+
        "\156\1\157\1\144\1\156\1\145\1\172\1\156\1\uffff\1\143\1\171\1\172"+
        "\1\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\3\1\uffff\1\7\1\10\6\uffff\1\21\2\uffff\1\27\1\30\4"+
        "\uffff\1\34\1\35\1\36\1\37\13\uffff\1\31\1\32\1\uffff\1\33\41\uffff"+
        "\1\20\15\uffff\1\26\6\uffff\1\15\1\uffff\1\25\6\uffff\1\2\2\uffff"+
        "\1\11\1\uffff\1\12\2\uffff\1\14\26\uffff\1\17\1\23\17\uffff\1\6"+
        "\13\uffff\1\1\5\uffff\1\22\2\uffff\1\13\2\uffff\1\4\1\uffff\1\24"+
        "\7\uffff\1\5\3\uffff\1\16";
    static final String DFA10_specialS =
        "\u00bf\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\27\1\30\1\uffff\1\27\1\30\22\uffff\1\27\1\uffff\1\31\5\uffff"+
            "\1\20\1\21\2\uffff\1\15\1\23\1\uffff\1\22\1\25\11\24\3\uffff"+
            "\1\3\3\uffff\12\26\1\1\11\26\1\14\5\26\4\uffff\1\26\1\uffff"+
            "\1\26\1\13\1\26\1\4\2\26\1\2\1\26\1\16\5\26\1\10\2\26\1\12\1"+
            "\7\2\26\1\17\1\11\3\26\1\5\1\uffff\1\6",
            "\1\32",
            "\1\33",
            "",
            "\1\34",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\46\4\uffff\1\45",
            "\1\25\11\24",
            "\1\50\1\uffff\12\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53\11\uffff\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\50\1\uffff\12\47",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\55\uffff\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\26\2\uffff\12\26\7\uffff\16\26\1\136\13\26\4\uffff\1\26"+
            "\1\uffff\22\26\1\135\7\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\22"+
            "\26\1\140\7\26",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\151",
            "\1\152",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\154",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\156",
            "\1\157",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175\17\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e\13\uffff\1\u008f",
            "\1\u0090",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00b1",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}