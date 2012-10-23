// $ANTLR ${project.version} ${buildNumber}

	package org.kermeta.kp.editor.mopp;


import org.antlr.runtime3_3_0.*;

public class KpLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
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
    public static final int QUOTED_34_34=4;
    public static final int TEXT=5;
    public static final int SL_COMMENT=6;
    public static final int ML_COMMENT=7;
    public static final int WHITESPACE=8;
    public static final int LINEBREAK=9;

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

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:17:7: ( 'defaultMainClass' )
            // Kp.g:17:9: 'defaultMainClass'
            {
            match("defaultMainClass"); 


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
            // Kp.g:18:7: ( 'defaultMainOperation' )
            // Kp.g:18:9: 'defaultMainOperation'
            {
            match("defaultMainOperation"); 


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
            // Kp.g:19:7: ( 'javaBasePackage' )
            // Kp.g:19:9: 'javaBasePackage'
            {
            match("javaBasePackage"); 


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
            // Kp.g:20:7: ( 'packageEquivalence' )
            // Kp.g:20:9: 'packageEquivalence'
            {
            match("packageEquivalence"); 


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
            // Kp.g:21:7: ( '=' )
            // Kp.g:21:9: '='
            {
            match('='); 

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
            // Kp.g:22:7: ( 'importFile' )
            // Kp.g:22:9: 'importFile'
            {
            match("importFile"); 


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
            // Kp.g:23:7: ( 'withBytecodeFrom' )
            // Kp.g:23:9: 'withBytecodeFrom'
            {
            match("withBytecodeFrom"); 


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
            // Kp.g:24:7: ( 'importProjectJar' )
            // Kp.g:24:9: 'importProjectJar'
            {
            match("importProjectJar"); 


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
            // Kp.g:25:7: ( 'importProjectSource' )
            // Kp.g:25:9: 'importProjectSource'
            {
            match("importProjectSource"); 


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
            // Kp.g:26:7: ( 'importBytecodeJar' )
            // Kp.g:26:9: 'importBytecodeJar'
            {
            match("importBytecodeJar"); 


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
            // Kp.g:27:7: ( 'resource' )
            // Kp.g:27:9: 'resource'
            {
            match("resource"); 


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
            // Kp.g:28:7: ( 'alternative' )
            // Kp.g:28:9: 'alternative'
            {
            match("alternative"); 


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
            // Kp.g:29:7: ( ',' )
            // Kp.g:29:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:1702:11: ( ( '//' (~ ( '\\n' | '\\r' ) )* ) )
            // Kp.g:1703:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // Kp.g:1703:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // Kp.g:1703:3: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // Kp.g:1703:7: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kp.g:1703:8: ~ ( '\\n' | '\\r' )
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
            // Kp.g:1706:11: ( ( '/*' ( . )* '*/' ) )
            // Kp.g:1707:2: ( '/*' ( . )* '*/' )
            {
            // Kp.g:1707:2: ( '/*' ( . )* '*/' )
            // Kp.g:1707:3: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Kp.g:1707:7: ( . )*
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
            	    // Kp.g:1707:7: .
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

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kp.g:1710:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Kp.g:1711:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Kp.g:1711:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Kp.g:1711:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Kp.g:1711:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


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
            // Kp.g:1713:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Kp.g:1714:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Kp.g:1714:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Kp.g:1714:3: ( ' ' | '\\t' | '\\f' )
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
            // Kp.g:1717:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Kp.g:1718:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Kp.g:1718:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Kp.g:1718:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Kp.g:1718:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\n') ) {
                    alt4=1;
                }
                else {
                    alt4=2;}
            }
            else if ( (LA4_0=='\n') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Kp.g:1718:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Kp.g:1718:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Kp.g:1718:20: '\\n'
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
            // Kp.g:1721:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Kp.g:1722:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Kp.g:1722:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Kp.g:1722:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Kp.g:1722:3: ( '\"' )
            // Kp.g:1722:4: '\"'
            {
            match('\"'); 

            }

            // Kp.g:1722:8: (~ ( '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Kp.g:1722:9: ~ ( '\"' )
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
            	    break loop5;
                }
            } while (true);

            // Kp.g:1722:17: ( '\"' )
            // Kp.g:1722:18: '\"'
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
        // Kp.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | SL_COMMENT | ML_COMMENT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt6=20;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // Kp.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // Kp.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // Kp.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // Kp.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // Kp.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // Kp.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // Kp.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // Kp.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // Kp.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // Kp.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // Kp.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // Kp.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // Kp.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // Kp.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // Kp.g:1:94: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 16 :
                // Kp.g:1:105: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 17 :
                // Kp.g:1:116: TEXT
                {
                mTEXT(); 

                }
                break;
            case 18 :
                // Kp.g:1:121: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 19 :
                // Kp.g:1:132: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 20 :
                // Kp.g:1:142: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\4\14\1\uffff\4\14\6\uffff\10\14\2\uffff\62\14\1\126\11"+
        "\14\1\uffff\5\14\1\145\10\14\1\uffff\3\14\1\162\10\14\1\uffff\10"+
        "\14\1\u0084\10\14\1\uffff\2\14\1\u008f\5\14\1\u0095\1\14\1\uffff"+
        "\1\14\1\u0098\2\14\1\u009b\1\uffff\2\14\1\uffff\1\14\1\u009f\1\uffff"+
        "\1\14\1\u00a1\1\14\1\uffff\1\14\1\uffff\1\u00a4\1\u00a5\2\uffff";
    static final String DFA6_eofS =
        "\u00a6\uffff";
    static final String DFA6_minS =
        "\1\11\2\145\2\141\1\uffff\1\155\1\151\1\145\1\154\1\uffff\1\52"+
        "\4\uffff\1\162\1\146\1\166\1\143\1\160\1\164\1\163\1\164\2\uffff"+
        "\1\155\2\141\1\153\1\157\1\150\1\157\2\145\1\165\1\102\1\141\1\162"+
        "\1\102\1\165\1\162\1\164\1\154\1\141\1\147\1\164\1\171\1\162\1\156"+
        "\1\141\1\164\1\163\1\145\1\102\1\164\1\143\1\141\1\120\1\115\1\145"+
        "\1\105\1\151\1\162\1\171\2\145\1\164\1\162\1\141\1\120\1\161\1\154"+
        "\1\157\1\164\1\143\1\55\1\151\1\157\1\151\1\141\1\165\1\145\1\152"+
        "\1\145\1\157\1\uffff\1\166\1\152\1\156\1\143\1\151\1\55\1\145\1"+
        "\143\1\144\2\145\1\103\1\153\1\166\1\uffff\1\143\1\157\1\145\1\55"+
        "\1\143\1\154\1\160\2\141\1\164\1\144\1\106\1\uffff\1\164\1\141\1"+
        "\145\1\147\1\154\1\112\1\145\1\162\1\55\1\163\1\162\2\145\1\141"+
        "\1\157\1\112\1\157\1\uffff\1\163\1\141\1\55\1\156\1\162\1\165\1"+
        "\141\1\155\1\55\1\164\1\uffff\1\143\1\55\2\162\1\55\1\uffff\1\151"+
        "\1\145\1\uffff\1\143\1\55\1\uffff\1\157\1\55\1\145\1\uffff\1\156"+
        "\1\uffff\2\55\2\uffff";
    static final String DFA6_maxS =
        "\1\172\2\145\2\141\1\uffff\1\155\1\151\1\145\1\154\1\uffff\1\57"+
        "\4\uffff\1\162\1\146\1\166\1\143\1\160\1\164\1\163\1\164\2\uffff"+
        "\1\155\2\141\1\153\1\157\1\150\1\157\2\145\1\165\1\102\1\141\1\162"+
        "\1\102\1\165\1\162\1\164\1\154\1\141\1\147\1\164\1\171\1\162\1\156"+
        "\1\141\1\164\1\163\1\145\1\120\1\164\1\143\1\141\1\120\1\115\1\145"+
        "\1\105\1\151\1\162\1\171\2\145\1\164\1\162\1\141\1\120\1\161\1\154"+
        "\1\157\1\164\1\143\1\172\1\151\1\157\1\151\1\141\1\165\1\145\1\152"+
        "\1\145\1\157\1\uffff\1\166\1\152\1\156\1\143\1\151\1\172\1\145\1"+
        "\143\1\144\2\145\1\117\1\153\1\166\1\uffff\1\143\1\157\1\145\1\172"+
        "\1\143\1\154\1\160\2\141\1\164\1\144\1\106\1\uffff\1\164\1\141\1"+
        "\145\1\147\1\154\1\123\1\145\1\162\1\172\1\163\1\162\2\145\1\141"+
        "\1\157\1\112\1\157\1\uffff\1\163\1\141\1\172\1\156\1\162\1\165\1"+
        "\141\1\155\1\172\1\164\1\uffff\1\143\1\172\2\162\1\172\1\uffff\1"+
        "\151\1\145\1\uffff\1\143\1\172\1\uffff\1\157\1\172\1\145\1\uffff"+
        "\1\156\1\uffff\2\172\2\uffff";
    static final String DFA6_acceptS =
        "\5\uffff\1\6\4\uffff\1\16\1\uffff\1\21\1\22\1\23\1\24\10\uffff"+
        "\1\17\1\20\74\uffff\1\14\16\uffff\1\7\14\uffff\1\15\21\uffff\1\1"+
        "\12\uffff\1\4\5\uffff\1\2\2\uffff\1\11\2\uffff\1\10\3\uffff\1\13"+
        "\1\uffff\1\5\2\uffff\1\12\1\3";
    static final String DFA6_specialS =
        "\u00a6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\15\1\16\1\uffff\1\15\1\16\22\uffff\1\15\1\uffff\1\17\11"+
            "\uffff\1\12\1\14\1\uffff\1\13\12\14\3\uffff\1\5\3\uffff\12\14"+
            "\1\1\17\14\4\uffff\1\14\1\uffff\1\11\2\14\1\2\4\14\1\6\1\3\5"+
            "\14\1\4\1\14\1\10\4\14\1\7\3\14",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "\1\31\4\uffff\1\30",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
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
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\100\3\uffff\1\76\11\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
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
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\13\uffff\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080\10\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\u0099",
            "\1\u009a",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "",
            "\1\u00a0",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32"+
            "\14",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | SL_COMMENT | ML_COMMENT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}