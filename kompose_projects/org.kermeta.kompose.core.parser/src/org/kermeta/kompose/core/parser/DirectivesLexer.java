// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g 2010-06-24 12:03:27

package org.kermeta.kompose.core.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DirectivesLexer extends Lexer {
    public static final int DOLLAR=12;
    public static final int DESTROY=17;
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
    public static final int STRING_LITERAL=4;
    public static final int WS=31;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int COMMA=15;
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

    public DirectivesLexer() {;} 
    public DirectivesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DirectivesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g"; }

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:11:7: ( 'EXT' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:11:9: 'EXT'
            {
            match("EXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:12:7: ( 'MODE' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:12:9: 'MODE'
            {
            match("MODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:13:7: ( 'PM' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:13:9: 'PM'
            {
            match("PM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:14:7: ( 'AM' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:14:9: 'AM'
            {
            match("AM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:15:7: ( 'CM' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:15:9: 'CM'
            {
            match("CM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:16:7: ( 'PMPre' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:16:9: 'PMPre'
            {
            match("PMPre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:17:7: ( 'AMPre' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:17:9: 'AMPre'
            {
            match("AMPre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:18:7: ( 'Post' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:18:9: 'Post'
            {
            match("Post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "PRE"
    public final void mPRE() throws RecognitionException {
        try {
            int _type = PRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:283:9: ( 'pre' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:283:11: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRE"

    // $ANTLR start "POST"
    public final void mPOST() throws RecognitionException {
        try {
            int _type = POST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:284:9: ( 'post' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:284:11: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POST"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:285:9: ( '.' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:285:11: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:286:9: ( '{' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:286:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:287:9: ( '}' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:287:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:288:9: ( '+' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:288:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:289:9: ( '-' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:289:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:290:9: ( '+=' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:290:11: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:291:9: ( '=' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:291:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:292:9: ( '$' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:292:11: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "COL_COL"
    public final void mCOL_COL() throws RecognitionException {
        try {
            int _type = COL_COL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:293:9: ( '::' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:293:11: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COL_COL"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:294:9: ( 'as' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:294:11: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:295:9: ( 'create' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:295:11: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:296:9: ( 'true' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:296:11: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:297:9: ( 'false' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:297:11: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:298:9: ( ',' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:298:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:299:9: ( 'UNION' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:299:11: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "INTER"
    public final void mINTER() throws RecognitionException {
        try {
            int _type = INTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:300:9: ( 'INTERSECTION' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:300:11: 'INTERSECTION'
            {
            match("INTERSECTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTER"

    // $ANTLR start "DESTROY"
    public final void mDESTROY() throws RecognitionException {
        try {
            int _type = DESTROY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:301:9: ( 'destroy' | 'DESTROY' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='d') ) {
                alt1=1;
            }
            else if ( (LA1_0=='D') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:301:11: 'destroy'
                    {
                    match("destroy"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:301:21: 'DESTROY'
                    {
                    match("DESTROY"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESTROY"

    // $ANTLR start "MERGE"
    public final void mMERGE() throws RecognitionException {
        try {
            int _type = MERGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:302:9: ( 'merge' | 'MERGE' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='m') ) {
                alt2=1;
            }
            else if ( (LA2_0=='M') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:302:11: 'merge'
                    {
                    match("merge"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:302:19: 'MERGE'
                    {
                    match("MERGE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MERGE"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:303:9: ( '(' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:303:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:304:9: ( ')' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:304:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:306:16: ( '\"' ( ESC | ~ ( '\"' | '\\\\' ) )* '\"' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:306:18: '\"' ( ESC | ~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:306:22: ( ESC | ~ ( '\"' | '\\\\' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:306:23: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:306:29: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "INT_LITERAL"
    public final void mINT_LITERAL() throws RecognitionException {
        try {
            int _type = INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:307:12: ( ( DIGIT )* )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:307:14: ( DIGIT )*
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:307:14: ( DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:307:15: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_LITERAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:308:4: ( ( '~' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )* )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:308:6: ( '~' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )*
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:308:6: ( '~' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='~') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:308:7: '~'
                    {
                    match('~'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:308:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            int _type = ESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:15: ( '\\\\' ( 't' | 'f' | 'r' | 'n' | '\"' | '\\'' | '\\\\' | ( DIGIT DIGIT DIGIT ) ) )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:17: '\\\\' ( 't' | 'f' | 'r' | 'n' | '\"' | '\\'' | '\\\\' | ( DIGIT DIGIT DIGIT ) )
            {
            match('\\'); 
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:22: ( 't' | 'f' | 'r' | 'n' | '\"' | '\\'' | '\\\\' | ( DIGIT DIGIT DIGIT ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt7=1;
                }
                break;
            case 'f':
                {
                alt7=2;
                }
                break;
            case 'r':
                {
                alt7=3;
                }
                break;
            case 'n':
                {
                alt7=4;
                }
                break;
            case '\"':
                {
                alt7=5;
                }
                break;
            case '\'':
                {
                alt7=6;
                }
                break;
            case '\\':
                {
                alt7=7;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:23: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:29: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:35: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 4 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:41: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:47: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 6 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:53: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 7 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:60: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 8 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:67: ( DIGIT DIGIT DIGIT )
                    {
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:67: ( DIGIT DIGIT DIGIT )
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:309:68: DIGIT DIGIT DIGIT
                    {
                    mDIGIT(); 
                    mDIGIT(); 
                    mDIGIT(); 

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:310:16: ( '0' .. '9' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:310:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:315:4: ( ( ' ' | '\\t' | '\\f' | '\\n' )+ )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:315:6: ( ' ' | '\\t' | '\\f' | '\\n' )+
            {
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:315:6: ( ' ' | '\\t' | '\\f' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\f'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SingleLineComment"
    public final void mSingleLineComment() throws RecognitionException {
        try {
            int _type = SingleLineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:19: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:21: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 

            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:26: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:27: ~ ( '\\n' | '\\r' )
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
            	    break loop9;
                }
            } while (true);

            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:42: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\r') ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:43: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:48: '\\r' ( '\\n' )?
                    {
                    match('\r'); 
                    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:52: ( '\\n' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\n') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:316:53: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SingleLineComment"

    // $ANTLR start "MultiLineComment"
    public final void mMultiLineComment() throws RecognitionException {
        try {
            int _type = MultiLineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:317:18: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:317:20: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:317:25: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:317:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MultiLineComment"

    public void mTokens() throws RecognitionException {
        // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | PRE | POST | DOT | LCURLY | RCURLY | PLUS | MINUS | CONCAT | EQUALS | DOLLAR | COL_COL | AS | CREATE | TRUE | FALSE | COMMA | UNION | INTER | DESTROY | MERGE | LP | RP | STRING_LITERAL | INT_LITERAL | ID | ESC | WS | SingleLineComment | MultiLineComment )
        int alt13=37;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:10: T__34
                {
                mT__34(); 

                }
                break;
            case 2 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:16: T__35
                {
                mT__35(); 

                }
                break;
            case 3 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:22: T__36
                {
                mT__36(); 

                }
                break;
            case 4 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:28: T__37
                {
                mT__37(); 

                }
                break;
            case 5 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:34: T__38
                {
                mT__38(); 

                }
                break;
            case 6 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:40: T__39
                {
                mT__39(); 

                }
                break;
            case 7 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:46: T__40
                {
                mT__40(); 

                }
                break;
            case 8 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:52: T__41
                {
                mT__41(); 

                }
                break;
            case 9 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:58: PRE
                {
                mPRE(); 

                }
                break;
            case 10 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:62: POST
                {
                mPOST(); 

                }
                break;
            case 11 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:67: DOT
                {
                mDOT(); 

                }
                break;
            case 12 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:71: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 13 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:78: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 14 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:85: PLUS
                {
                mPLUS(); 

                }
                break;
            case 15 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:90: MINUS
                {
                mMINUS(); 

                }
                break;
            case 16 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:96: CONCAT
                {
                mCONCAT(); 

                }
                break;
            case 17 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:103: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 18 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:110: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 19 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:117: COL_COL
                {
                mCOL_COL(); 

                }
                break;
            case 20 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:125: AS
                {
                mAS(); 

                }
                break;
            case 21 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:128: CREATE
                {
                mCREATE(); 

                }
                break;
            case 22 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:135: TRUE
                {
                mTRUE(); 

                }
                break;
            case 23 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:140: FALSE
                {
                mFALSE(); 

                }
                break;
            case 24 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:146: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 25 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:152: UNION
                {
                mUNION(); 

                }
                break;
            case 26 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:158: INTER
                {
                mINTER(); 

                }
                break;
            case 27 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:164: DESTROY
                {
                mDESTROY(); 

                }
                break;
            case 28 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:172: MERGE
                {
                mMERGE(); 

                }
                break;
            case 29 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:178: LP
                {
                mLP(); 

                }
                break;
            case 30 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:181: RP
                {
                mRP(); 

                }
                break;
            case 31 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:184: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 32 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:199: INT_LITERAL
                {
                mINT_LITERAL(); 

                }
                break;
            case 33 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:211: ID
                {
                mID(); 

                }
                break;
            case 34 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:214: ESC
                {
                mESC(); 

                }
                break;
            case 35 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:218: WS
                {
                mWS(); 

                }
                break;
            case 36 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:221: SingleLineComment
                {
                mSingleLineComment(); 

                }
                break;
            case 37 :
                // /home/mclavreu/main_workspace/org.kermeta.kompose.core.parser/src/org/kermeta/kompose/core/parser/Directives.g:1:239: MultiLineComment
                {
                mMultiLineComment(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\34\6\35\3\uffff\1\53\4\uffff\4\35\1\uffff\5\35\10\uffff\3\35"+
        "\1\73\1\35\1\76\1\77\2\35\2\uffff\1\102\10\35\2\uffff\1\113\3\35"+
        "\1\uffff\2\35\2\uffff\1\121\1\35\1\uffff\10\35\1\uffff\1\133\2\35"+
        "\1\136\1\35\1\uffff\1\140\1\35\1\142\6\35\1\uffff\1\151\1\152\1"+
        "\uffff\1\153\1\uffff\1\35\1\uffff\1\155\1\156\3\35\1\151\3\uffff"+
        "\1\162\2\uffff\3\35\1\uffff\1\35\2\167\1\35\1\uffff\3\35\1\174\1"+
        "\uffff";
    static final String DFA13_eofS =
        "\175\uffff";
    static final String DFA13_minS =
        "\1\11\1\130\1\105\3\115\1\157\3\uffff\1\75\4\uffff\1\163\2\162\1"+
        "\141\1\uffff\2\116\1\145\1\105\1\145\7\uffff\1\52\1\124\1\104\1"+
        "\122\1\60\1\163\2\60\1\145\1\163\2\uffff\1\60\1\145\1\165\1\154"+
        "\1\111\1\124\1\163\1\123\1\162\2\uffff\1\60\1\105\1\107\1\162\1"+
        "\uffff\1\164\1\162\2\uffff\1\60\1\164\1\uffff\1\141\1\145\1\163"+
        "\1\117\1\105\1\164\1\124\1\147\1\uffff\1\60\1\105\1\145\1\60\1\145"+
        "\1\uffff\1\60\1\164\1\60\1\145\1\116\1\122\1\162\1\122\1\145\1\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\1\145\1\uffff\2\60\1\123\1\157\1\117"+
        "\1\60\3\uffff\1\60\2\uffff\1\105\1\171\1\131\1\uffff\1\103\2\60"+
        "\1\124\1\uffff\1\111\1\117\1\116\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\176\1\130\1\117\1\157\2\115\1\162\3\uffff\1\75\4\uffff\1\163"+
        "\2\162\1\141\1\uffff\2\116\1\145\1\105\1\145\7\uffff\1\57\1\124"+
        "\1\104\1\122\1\172\1\163\2\172\1\145\1\163\2\uffff\1\172\1\145\1"+
        "\165\1\154\1\111\1\124\1\163\1\123\1\162\2\uffff\1\172\1\105\1\107"+
        "\1\162\1\uffff\1\164\1\162\2\uffff\1\172\1\164\1\uffff\1\141\1\145"+
        "\1\163\1\117\1\105\1\164\1\124\1\147\1\uffff\1\172\1\105\1\145\1"+
        "\172\1\145\1\uffff\1\172\1\164\1\172\1\145\1\116\1\122\1\162\1\122"+
        "\1\145\1\uffff\2\172\1\uffff\1\172\1\uffff\1\145\1\uffff\2\172\1"+
        "\123\1\157\1\117\1\172\3\uffff\1\172\2\uffff\1\105\1\171\1\131\1"+
        "\uffff\1\103\2\172\1\124\1\uffff\1\111\1\117\1\116\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\7\uffff\1\13\1\14\1\15\1\uffff\1\17\1\21\1\22\1\23\4\uffff\1\30"+
        "\5\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\12\uffff\1\20\1\16\11"+
        "\uffff\1\44\1\45\4\uffff\1\3\2\uffff\1\4\1\5\2\uffff\1\24\10\uffff"+
        "\1\1\5\uffff\1\11\11\uffff\1\2\2\uffff\1\10\1\uffff\1\12\1\uffff"+
        "\1\26\6\uffff\1\34\1\6\1\7\1\uffff\1\27\1\31\3\uffff\1\25\4\uffff"+
        "\1\33\4\uffff\1\32";
    static final String DFA13_specialS =
        "\175\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\37\1\uffff\1\37\23\uffff\1\37\1\uffff\1\33\1\uffff\1\15\3"+
            "\uffff\1\31\1\32\1\uffff\1\12\1\23\1\13\1\7\1\40\12\uffff\1"+
            "\16\2\uffff\1\14\3\uffff\1\4\1\35\1\5\1\27\1\1\3\35\1\25\3\35"+
            "\1\2\2\35\1\3\4\35\1\24\5\35\1\uffff\1\36\2\uffff\1\35\1\uffff"+
            "\1\17\1\35\1\20\1\26\1\35\1\22\6\35\1\30\2\35\1\6\3\35\1\21"+
            "\6\35\1\10\1\uffff\1\11\1\35",
            "\1\41",
            "\1\43\11\uffff\1\42",
            "\1\44\41\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\51\2\uffff\1\50",
            "",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\4\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\71",
            "\12\35\7\uffff\17\35\1\72\12\35\4\uffff\1\35\1\uffff\32\35",
            "\1\74",
            "\12\35\7\uffff\17\35\1\75\12\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\100",
            "\1\101",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\134",
            "\1\135",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\137",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\141",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\154",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | PRE | POST | DOT | LCURLY | RCURLY | PLUS | MINUS | CONCAT | EQUALS | DOLLAR | COL_COL | AS | CREATE | TRUE | FALSE | COMMA | UNION | INTER | DESTROY | MERGE | LP | RP | STRING_LITERAL | INT_LITERAL | ID | ESC | WS | SingleLineComment | MultiLineComment );";
        }
    }
 

}