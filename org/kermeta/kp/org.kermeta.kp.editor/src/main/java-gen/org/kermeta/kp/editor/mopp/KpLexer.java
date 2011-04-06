// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_2_0.*;

public class KpLexer extends Lexer {
    public static final int INTEGER=7;
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
    public static final int WHITESPACE=10;
    public static final int FLOAT=8;
    public static final int TEXT=9;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int ML_COMMENT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int SL_COMMENT=5;
    public static final int QUOTED_34_34=4;
    public static final int LINEBREAK=11;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:17:7: ( ':' )
            // Kp.g:17:9: ':'
            {
            match(':'); 

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
            // Kp.g:18:7: ( 'version' )
            // Kp.g:18:9: 'version'
            {
            match("version"); 


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
            // Kp.g:19:7: ( ': ' )
            // Kp.g:19:9: ': '
            {
            match(": "); 


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
            // Kp.g:20:7: ( 'group' )
            // Kp.g:20:9: 'group'
            {
            match("group"); 


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
            // Kp.g:21:7: ( '{' )
            // Kp.g:21:9: '{'
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
            // Kp.g:22:7: ( '}' )
            // Kp.g:22:9: '}'
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
            // Kp.g:23:7: ( 'ref' )
            // Kp.g:23:9: 'ref'
            {
            match("ref"); 


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
            // Kp.g:24:7: ( 'source' )
            // Kp.g:24:9: 'source'
            {
            match("source"); 


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
            // Kp.g:25:7: ( '=' )
            // Kp.g:25:9: '='
            {
            match('='); 

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
            // Kp.g:26:7: ( 'srcDir' )
            // Kp.g:26:9: 'srcDir'
            {
            match("srcDir"); 


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
            // Kp.g:27:7: ( 'srcFile' )
            // Kp.g:27:9: 'srcFile'
            {
            match("srcFile"); 


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
            // Kp.g:28:7: ( 'srcNSURI' )
            // Kp.g:28:9: 'srcNSURI'
            {
            match("srcNSURI"); 


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
            // Kp.g:29:7: ( 'from' )
            // Kp.g:29:9: 'from'
            {
            match("from"); 


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
            // Kp.g:30:7: ( 'srcQuery' )
            // Kp.g:30:9: 'srcQuery'
            {
            match("srcQuery"); 


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
            // Kp.g:31:7: ( 'URL' )
            // Kp.g:31:9: 'URL'
            {
            match("URL"); 


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
            // Kp.g:32:7: ( 'dependency' )
            // Kp.g:32:9: 'dependency'
            {
            match("dependency"); 


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
            // Kp.g:33:7: ( 'weaver-directive' )
            // Kp.g:33:9: 'weaver-directive'
            {
            match("weaver-directive"); 


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
            // Kp.g:34:7: ( 'merger-option' )
            // Kp.g:34:9: 'merger-option'
            {
            match("merger-option"); 


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
            // Kp.g:35:7: ( '(' )
            // Kp.g:35:9: '('
            {
            match('('); 

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
            // Kp.g:36:7: ( ')' )
            // Kp.g:36:9: ')'
            {
            match(')'); 

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
            // Kp.g:37:7: ( '[' )
            // Kp.g:37:9: '['
            {
            match('['); 

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
            // Kp.g:38:7: ( ']' )
            // Kp.g:38:9: ']'
            {
            match(']'); 

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
            // Kp.g:2900:11: ( ( '//' (~ ( '\\n' | '\\r' ) )* ) )
            // Kp.g:2901:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // Kp.g:2901:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // Kp.g:2901:3: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // Kp.g:2901:7: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kp.g:2901:8: ~ ( '\\n' | '\\r' )
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
            // Kp.g:2904:11: ( ( '/*' ( . )* '*/' ) )
            // Kp.g:2905:2: ( '/*' ( . )* '*/' )
            {
            // Kp.g:2905:2: ( '/*' ( . )* '*/' )
            // Kp.g:2905:3: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Kp.g:2905:7: ( . )*
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
            	    // Kp.g:2905:7: .
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:2908:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // Kp.g:2909:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // Kp.g:2909:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // Kp.g:2909:3: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Kp.g:2909:3: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Kp.g:2909:4: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Kp.g:2909:9: ( '1' .. '9' )
                    // Kp.g:2909:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Kp.g:2909:19: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Kp.g:2909:20: '0' .. '9'
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
                    // Kp.g:2909:31: '0'
                    {
                    match('0'); 

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
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:2912:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // Kp.g:2913:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // Kp.g:2913:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Kp.g:2913:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Kp.g:2913:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kp.g:2913:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Kp.g:2913:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // Kp.g:2913:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Kp.g:2913:10: ( '1' .. '9' )
                    // Kp.g:2913:11: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Kp.g:2913:21: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Kp.g:2913:22: '0' .. '9'
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
                    // Kp.g:2913:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // Kp.g:2913:44: ( '0' .. '9' )+
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
            	    // Kp.g:2913:45: '0' .. '9'
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
            // Kp.g:2916:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Kp.g:2917:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Kp.g:2917:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Kp.g:2917:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Kp.g:2917:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='-'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // Kp.g:2920:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Kp.g:2921:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Kp.g:2921:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Kp.g:2921:3: ( ' ' | '\\t' | '\\f' )
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
            // Kp.g:2924:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Kp.g:2925:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Kp.g:2925:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Kp.g:2925:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Kp.g:2925:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\n') ) {
                    alt11=1;
                }
                else {
                    alt11=2;}
            }
            else if ( (LA11_0=='\n') ) {
                alt11=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // Kp.g:2925:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Kp.g:2925:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Kp.g:2925:20: '\\n'
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
            // Kp.g:2928:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Kp.g:2929:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Kp.g:2929:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Kp.g:2929:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Kp.g:2929:3: ( '\"' )
            // Kp.g:2929:4: '\"'
            {
            match('\"'); 

            }

            // Kp.g:2929:8: (~ ( '\"' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Kp.g:2929:9: ~ ( '\"' )
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
            	    break loop12;
                }
            } while (true);

            // Kp.g:2929:17: ( '\"' )
            // Kp.g:2929:18: '\"'
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
        // Kp.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt13=31;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // Kp.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // Kp.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // Kp.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // Kp.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // Kp.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // Kp.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // Kp.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // Kp.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // Kp.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // Kp.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // Kp.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // Kp.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // Kp.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // Kp.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // Kp.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // Kp.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // Kp.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // Kp.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // Kp.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // Kp.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // Kp.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // Kp.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // Kp.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // Kp.g:1:148: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 25 :
                // Kp.g:1:159: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 26 :
                // Kp.g:1:170: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 27 :
                // Kp.g:1:178: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 28 :
                // Kp.g:1:184: TEXT
                {
                mTEXT(); 

                }
                break;
            case 29 :
                // Kp.g:1:189: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 30 :
                // Kp.g:1:200: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 31 :
                // Kp.g:1:210: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\27\1\35\2\27\2\uffff\2\27\1\uffff\5\27\5\uffff\1\27"+
        "\2\54\4\uffff\1\27\2\uffff\12\27\2\uffff\1\27\1\54\2\uffff\3\27"+
        "\1\74\3\27\1\103\6\27\1\uffff\5\27\1\117\1\uffff\5\27\1\125\5\27"+
        "\1\uffff\5\27\1\uffff\1\140\1\141\7\27\1\151\2\uffff\1\152\6\27"+
        "\2\uffff\1\161\1\162\4\27\2\uffff\4\27\1\173\3\27\1\uffff\7\27\1"+
        "\u0086\1\u0087\1\27\2\uffff\1\27\1\u008a\1\uffff";
    static final String DFA13_eofS =
        "\u008b\uffff";
    static final String DFA13_minS =
        "\1\11\1\145\1\40\1\145\1\162\2\uffff\1\145\1\157\1\uffff\1\162"+
        "\1\122\3\145\4\uffff\1\52\1\60\2\55\4\uffff\1\162\2\uffff\1\162"+
        "\1\157\1\146\1\165\1\143\1\157\1\114\1\160\1\141\1\162\2\uffff\1"+
        "\56\1\55\2\uffff\1\155\1\163\1\165\1\55\1\162\1\104\1\155\1\55\1"+
        "\145\1\166\1\147\1\145\1\151\1\160\1\uffff\1\143\2\151\1\123\1\165"+
        "\1\55\1\uffff\1\156\2\145\1\164\1\157\1\55\1\145\1\162\1\154\1\125"+
        "\1\145\1\uffff\1\144\2\162\1\141\1\156\1\uffff\2\55\1\145\1\122"+
        "\1\162\1\145\2\55\1\120\1\55\2\uffff\1\55\1\111\1\171\1\156\1\144"+
        "\1\157\1\162\2\uffff\2\55\1\143\1\151\1\160\1\157\2\uffff\1\171"+
        "\1\162\1\164\1\152\1\55\1\145\1\151\1\145\1\uffff\1\143\1\157\1"+
        "\143\1\164\1\156\1\164\1\151\2\55\1\166\2\uffff\1\145\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\175\1\145\1\40\1\145\1\162\2\uffff\1\145\1\162\1\uffff\1\162"+
        "\1\122\3\145\4\uffff\1\57\1\71\2\172\4\uffff\1\162\2\uffff\1\162"+
        "\1\157\1\146\1\165\1\143\1\157\1\114\1\160\1\141\1\162\2\uffff\1"+
        "\56\1\172\2\uffff\1\155\1\163\1\165\1\172\1\162\1\121\1\155\1\172"+
        "\1\145\1\166\1\147\1\145\1\151\1\160\1\uffff\1\143\2\151\1\123\1"+
        "\165\1\172\1\uffff\1\156\2\145\1\164\1\157\1\172\1\145\1\162\1\154"+
        "\1\125\1\145\1\uffff\1\144\2\162\1\141\1\156\1\uffff\2\172\1\145"+
        "\1\122\1\162\1\145\2\55\1\120\1\172\2\uffff\1\172\1\111\1\171\1"+
        "\156\1\144\1\157\1\162\2\uffff\2\172\1\143\1\151\1\160\1\157\2\uffff"+
        "\1\171\1\162\1\164\1\152\1\172\1\145\1\151\1\145\1\uffff\1\143\1"+
        "\157\1\143\1\164\1\156\1\164\1\151\2\172\1\166\2\uffff\1\145\1\172"+
        "\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\6\1\7\2\uffff\1\12\5\uffff\1\24\1\25\1\26\1\27\4\uffff"+
        "\1\34\1\35\1\36\1\37\1\uffff\1\4\1\2\12\uffff\1\30\1\31\2\uffff"+
        "\1\32\1\33\16\uffff\1\10\6\uffff\1\20\13\uffff\1\16\5\uffff\1\5"+
        "\12\uffff\1\11\1\13\7\uffff\1\3\1\14\6\uffff\1\15\1\17\10\uffff"+
        "\1\21\12\uffff\1\23\1\1\2\uffff\1\22";
    static final String DFA13_specialS =
        "\u008b\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\30\1\31\1\uffff\1\30\1\31\22\uffff\1\30\1\uffff\1\32\5\uffff"+
            "\1\17\1\20\3\uffff\1\24\1\uffff\1\23\1\26\11\25\1\2\2\uffff"+
            "\1\11\3\uffff\12\27\1\1\11\27\1\13\5\27\1\21\1\uffff\1\22\1"+
            "\uffff\1\27\1\uffff\3\27\1\14\1\27\1\12\1\4\5\27\1\16\4\27\1"+
            "\7\1\10\2\27\1\3\1\15\3\27\1\5\1\uffff\1\6",
            "\1\33",
            "\1\34",
            "\1\36",
            "\1\37",
            "",
            "",
            "\1\40",
            "\1\41\2\uffff\1\42",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\51\4\uffff\1\50",
            "\1\52\11\25",
            "\1\27\1\55\1\uffff\12\53\7\uffff\32\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "\1\27\1\55\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "",
            "",
            "",
            "\1\56",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\55",
            "\1\27\1\55\1\uffff\12\53\7\uffff\32\27\4\uffff\1\27\1\uffff"+
            "\32\27",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\75",
            "\1\76\1\uffff\1\77\7\uffff\1\100\2\uffff\1\101",
            "\1\102",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "",
            "",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "\1\27\2\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}