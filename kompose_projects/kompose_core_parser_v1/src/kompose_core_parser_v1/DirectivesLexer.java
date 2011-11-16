// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g 2010-09-20 10:50:53

package kompose_core_parser_v1;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DirectivesLexer extends Lexer {
    public static final int DESTROY=11;
    public static final int T__42=42;
    public static final int DOLLAR=21;
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
    public static final int EQUALS=17;
    public static final int PRE=28;
    public static final int META_ID=20;
    public static final int MINUS=19;
    public static final int ID=22;
    public static final int EOF=-1;
    public static final int TRUE=25;
    public static final int UNION=5;
    public static final int AS=10;
    public static final int CREATE=9;
    public static final int STRING_LITERAL=4;
    public static final int WS=32;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int COMMA=14;
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

    public DirectivesLexer() {;} 
    public DirectivesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DirectivesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g"; }

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:11:7: ( 'EXT' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:11:9: 'EXT'
            {
            match("EXT"); 


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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:12:7: ( 'MODE' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:12:9: 'MODE'
            {
            match("MODE"); 


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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:13:7: ( 'PM' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:13:9: 'PM'
            {
            match("PM"); 


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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:14:7: ( 'AM' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:14:9: 'AM'
            {
            match("AM"); 


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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:15:7: ( 'CM' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:15:9: 'CM'
            {
            match("CM"); 


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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:16:7: ( 'PMPre' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:16:9: 'PMPre'
            {
            match("PMPre"); 


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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:17:7: ( 'AMPre' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:17:9: 'AMPre'
            {
            match("AMPre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:18:7: ( 'Post' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:18:9: 'Post'
            {
            match("Post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "PRE"
    public final void mPRE() throws RecognitionException {
        try {
            int _type = PRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:454:9: ( 'pre' | 'PRE' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                alt1=1;
            }
            else if ( (LA1_0=='P') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:454:11: 'pre'
                    {
                    match("pre"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:454:17: 'PRE'
                    {
                    match("PRE"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:455:9: ( 'post' | 'POST' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                alt2=1;
            }
            else if ( (LA2_0=='P') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:455:11: 'post'
                    {
                    match("post"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:455:18: 'POST'
                    {
                    match("POST"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:456:9: ( '.' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:456:11: '.'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:457:9: ( '{' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:457:11: '{'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:458:9: ( '}' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:458:11: '}'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:459:9: ( '+' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:459:11: '+'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:460:9: ( '-' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:460:11: '-'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:461:9: ( '+=' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:461:11: '+='
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:462:9: ( '=' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:462:11: '='
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:463:9: ( '$' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:463:11: '$'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:464:9: ( '::' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:464:11: '::'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:465:9: ( 'as' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:465:11: 'as'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:466:9: ( 'create' | 'CREATE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='c') ) {
                alt3=1;
            }
            else if ( (LA3_0=='C') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:466:11: 'create'
                    {
                    match("create"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:466:20: 'CREATE'
                    {
                    match("CREATE"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:467:9: ( 'true' | 'TRUE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='T') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:467:11: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:467:18: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:468:9: ( 'false' | 'FALSE' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='f') ) {
                alt5=1;
            }
            else if ( (LA5_0=='F') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:468:11: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:468:19: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:469:9: ( ',' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:469:11: ','
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:470:9: ( 'union' | 'UNION' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='u') ) {
                alt6=1;
            }
            else if ( (LA6_0=='U') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:470:11: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:470:19: 'UNION'
                    {
                    match("UNION"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:471:9: ( 'intersection' | 'INTERSECTION' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='i') ) {
                alt7=1;
            }
            else if ( (LA7_0=='I') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:471:11: 'intersection'
                    {
                    match("intersection"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:471:26: 'INTERSECTION'
                    {
                    match("INTERSECTION"); 


                    }
                    break;

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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:472:9: ( 'destroy' | 'DESTROY' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='d') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:472:11: 'destroy'
                    {
                    match("destroy"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:472:21: 'DESTROY'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:473:9: ( 'merge' | 'MERGE' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='m') ) {
                alt9=1;
            }
            else if ( (LA9_0=='M') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:473:11: 'merge'
                    {
                    match("merge"); 


                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:473:19: 'MERGE'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:474:9: ( '(' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:474:11: '('
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:475:9: ( ')' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:475:11: ')'
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

                System.out.println("STRING_LITERAL");
              
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:484:3: ( '\"' ( ESC | ~ ( '\"' | '\\\\' ) )* '\"' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:485:3: '\"' ( ESC | ~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:485:7: ( ESC | ~ ( '\"' | '\\\\' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:485:8: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:485:14: ~ ( '\"' | '\\\\' )
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
            	    break loop10;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;

                System.out.println("End STRING_LITERAL");
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

                System.out.println("INT_LITERAL");
              
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:494:3: ( ( DIGIT )* )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:495:3: ( DIGIT )*
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:495:3: ( DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:495:4: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;

                System.out.println("End INT_LITERAL");
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

                System.out.println("ID");
              
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:504:3: ( ( '~' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )+ )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:505:3: ( '~' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )+
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:505:3: ( '~' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='~') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:505:4: '~'
                    {
                    match('~'); 

                    }
                    break;

            }

            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:505:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:
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

                System.out.println("End ID");
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:15: ( '\\\\' ( 't' | 'f' | 'r' | 'n' | '\"' | '\\'' | '\\\\' | ( DIGIT DIGIT DIGIT ) ) )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:17: '\\\\' ( 't' | 'f' | 'r' | 'n' | '\"' | '\\'' | '\\\\' | ( DIGIT DIGIT DIGIT ) )
            {
            match('\\'); 
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:22: ( 't' | 'f' | 'r' | 'n' | '\"' | '\\'' | '\\\\' | ( DIGIT DIGIT DIGIT ) )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt14=1;
                }
                break;
            case 'f':
                {
                alt14=2;
                }
                break;
            case 'r':
                {
                alt14=3;
                }
                break;
            case 'n':
                {
                alt14=4;
                }
                break;
            case '\"':
                {
                alt14=5;
                }
                break;
            case '\'':
                {
                alt14=6;
                }
                break;
            case '\\':
                {
                alt14=7;
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
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:23: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:29: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 3 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:35: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 4 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:41: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:47: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 6 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:53: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 7 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:60: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 8 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:67: ( DIGIT DIGIT DIGIT )
                    {
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:67: ( DIGIT DIGIT DIGIT )
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:507:68: DIGIT DIGIT DIGIT
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:508:16: ( '0' .. '9' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:508:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "META_ID"
    public final void mMETA_ID() throws RecognitionException {
        try {
            int _type = META_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                System.out.println("META_ID");
              
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:516:3: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )+ '\\'' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:517:3: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )+ '\\''
            {
            match('\''); 
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:517:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;

                System.out.println("End META_ID");
                  }
        finally {
        }
    }
    // $ANTLR end "META_ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:522:4: ( ( ' ' | '\\t' | '\\f' | '\\n' )+ )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:522:6: ( ' ' | '\\t' | '\\f' | '\\n' )+
            {
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:522:6: ( ' ' | '\\t' | '\\f' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\f'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:19: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:21: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 

            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:26: (~ ( '\\n' | '\\r' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:27: ~ ( '\\n' | '\\r' )
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
            	    break loop17;
                }
            } while (true);

            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:42: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\r') ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:43: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:48: '\\r' ( '\\n' )?
                    {
                    match('\r'); 
                    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:52: ( '\\n' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\n') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:523:53: '\\n'
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
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:524:18: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:524:20: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:524:25: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:524:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
        // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | PRE | POST | DOT | LCURLY | RCURLY | PLUS | MINUS | CONCAT | EQUALS | DOLLAR | COL_COL | AS | CREATE | TRUE | FALSE | COMMA | UNION | INTER | DESTROY | MERGE | LP | RP | STRING_LITERAL | INT_LITERAL | ID | ESC | META_ID | WS | SingleLineComment | MultiLineComment )
        int alt21=38;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:28: T__38
                {
                mT__38(); 

                }
                break;
            case 5 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:34: T__39
                {
                mT__39(); 

                }
                break;
            case 6 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:40: T__40
                {
                mT__40(); 

                }
                break;
            case 7 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:46: T__41
                {
                mT__41(); 

                }
                break;
            case 8 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:52: T__42
                {
                mT__42(); 

                }
                break;
            case 9 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:58: PRE
                {
                mPRE(); 

                }
                break;
            case 10 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:62: POST
                {
                mPOST(); 

                }
                break;
            case 11 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:67: DOT
                {
                mDOT(); 

                }
                break;
            case 12 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:71: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 13 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:78: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 14 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:85: PLUS
                {
                mPLUS(); 

                }
                break;
            case 15 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:90: MINUS
                {
                mMINUS(); 

                }
                break;
            case 16 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:96: CONCAT
                {
                mCONCAT(); 

                }
                break;
            case 17 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:103: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 18 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:110: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 19 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:117: COL_COL
                {
                mCOL_COL(); 

                }
                break;
            case 20 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:125: AS
                {
                mAS(); 

                }
                break;
            case 21 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:128: CREATE
                {
                mCREATE(); 

                }
                break;
            case 22 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:135: TRUE
                {
                mTRUE(); 

                }
                break;
            case 23 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:140: FALSE
                {
                mFALSE(); 

                }
                break;
            case 24 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:146: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 25 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:152: UNION
                {
                mUNION(); 

                }
                break;
            case 26 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:158: INTER
                {
                mINTER(); 

                }
                break;
            case 27 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:164: DESTROY
                {
                mDESTROY(); 

                }
                break;
            case 28 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:172: MERGE
                {
                mMERGE(); 

                }
                break;
            case 29 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:178: LP
                {
                mLP(); 

                }
                break;
            case 30 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:181: RP
                {
                mRP(); 

                }
                break;
            case 31 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:184: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 32 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:199: INT_LITERAL
                {
                mINT_LITERAL(); 

                }
                break;
            case 33 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:211: ID
                {
                mID(); 

                }
                break;
            case 34 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:214: ESC
                {
                mESC(); 

                }
                break;
            case 35 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:218: META_ID
                {
                mMETA_ID(); 

                }
                break;
            case 36 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:226: WS
                {
                mWS(); 

                }
                break;
            case 37 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:229: SingleLineComment
                {
                mSingleLineComment(); 

                }
                break;
            case 38 :
                // /home/mclavreu/main_workspace_kompose/kompose_core_parser_v1/src/kompose_core_parser_v1/Directives.g:1:247: MultiLineComment
                {
                mMultiLineComment(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\41\6\42\3\uffff\1\64\4\uffff\6\42\1\uffff\7\42\3\uffff\1\41\6"+
        "\uffff\3\42\1\110\3\42\1\115\1\116\3\42\2\uffff\1\122\14\42\2\uffff"+
        "\1\137\3\42\1\uffff\1\42\1\144\2\42\2\uffff\1\42\1\144\1\42\1\uffff"+
        "\14\42\1\uffff\1\165\2\42\1\170\1\uffff\1\171\2\42\1\171\1\42\2"+
        "\175\11\42\1\uffff\1\u0087\1\u0088\2\uffff\1\u0089\2\42\1\uffff"+
        "\2\u008c\2\u008d\4\42\1\u0087\3\uffff\2\u0092\2\uffff\4\42\1\uffff"+
        "\2\42\2\u0099\2\42\1\uffff\6\42\2\u00a2\1\uffff";
    static final String DFA21_eofS =
        "\u00a3\uffff";
    static final String DFA21_minS =
        "\1\11\1\130\1\105\3\115\1\157\3\uffff\1\75\4\uffff\1\163\2\162\1"+
        "\122\1\141\1\101\1\uffff\1\156\1\116\1\156\1\116\1\145\1\105\1\145"+
        "\3\uffff\1\60\5\uffff\1\52\1\124\1\104\1\122\1\60\1\163\1\105\1"+
        "\123\2\60\1\105\1\145\1\163\2\uffff\1\60\1\145\1\165\1\125\1\154"+
        "\1\114\1\151\1\111\1\164\1\124\1\163\1\123\1\162\2\uffff\1\60\1"+
        "\105\1\107\1\162\1\uffff\1\164\1\60\1\124\1\162\2\uffff\1\101\1"+
        "\60\1\164\1\uffff\1\141\1\145\1\105\1\163\1\123\1\157\1\117\1\145"+
        "\1\105\1\164\1\124\1\147\1\uffff\1\60\1\105\1\145\1\60\1\uffff\1"+
        "\60\1\145\1\124\1\60\1\164\2\60\1\145\1\105\1\156\1\116\1\162\1"+
        "\122\1\162\1\122\1\145\1\uffff\2\60\2\uffff\1\60\1\105\1\145\1\uffff"+
        "\4\60\1\163\1\123\1\157\1\117\1\60\3\uffff\2\60\2\uffff\1\145\1"+
        "\105\1\171\1\131\1\uffff\1\143\1\103\2\60\1\164\1\124\1\uffff\1"+
        "\151\1\111\1\157\1\117\1\156\1\116\2\60\1\uffff";
    static final String DFA21_maxS =
        "\1\176\1\130\1\117\1\157\1\115\1\122\1\162\3\uffff\1\75\4\uffff"+
        "\1\163\2\162\1\122\1\141\1\101\1\uffff\1\156\1\116\1\156\1\116\1"+
        "\145\1\105\1\145\3\uffff\1\172\5\uffff\1\57\1\124\1\104\1\122\1"+
        "\172\1\163\1\105\1\123\2\172\1\105\1\145\1\163\2\uffff\1\172\1\145"+
        "\1\165\1\125\1\154\1\114\1\151\1\111\1\164\1\124\1\163\1\123\1\162"+
        "\2\uffff\1\172\1\105\1\107\1\162\1\uffff\1\164\1\172\1\124\1\162"+
        "\2\uffff\1\101\1\172\1\164\1\uffff\1\141\1\145\1\105\1\163\1\123"+
        "\1\157\1\117\1\145\1\105\1\164\1\124\1\147\1\uffff\1\172\1\105\1"+
        "\145\1\172\1\uffff\1\172\1\145\1\124\1\172\1\164\2\172\1\145\1\105"+
        "\1\156\1\116\1\162\1\122\1\162\1\122\1\145\1\uffff\2\172\2\uffff"+
        "\1\172\1\105\1\145\1\uffff\4\172\1\163\1\123\1\157\1\117\1\172\3"+
        "\uffff\2\172\2\uffff\1\145\1\105\1\171\1\131\1\uffff\1\143\1\103"+
        "\2\172\1\164\1\124\1\uffff\1\151\1\111\1\157\1\117\1\156\1\116\2"+
        "\172\1\uffff";
    static final String DFA21_acceptS =
        "\7\uffff\1\13\1\14\1\15\1\uffff\1\17\1\21\1\22\1\23\6\uffff\1\30"+
        "\7\uffff\1\35\1\36\1\37\1\uffff\1\40\1\41\1\42\1\43\1\44\15\uffff"+
        "\1\20\1\16\15\uffff\1\45\1\46\4\uffff\1\3\4\uffff\1\4\1\5\3\uffff"+
        "\1\24\14\uffff\1\1\4\uffff\1\11\20\uffff\1\2\2\uffff\1\10\1\12\3"+
        "\uffff\1\26\11\uffff\1\34\1\6\1\7\2\uffff\1\27\1\31\4\uffff\1\25"+
        "\6\uffff\1\33\10\uffff\1\32";
    static final String DFA21_specialS =
        "\u00a3\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\45\1\uffff\1\45\23\uffff\1\45\1\uffff\1\37\1\uffff\1\15\2"+
            "\uffff\1\44\1\35\1\36\1\uffff\1\12\1\25\1\13\1\7\1\46\12\40"+
            "\1\16\2\uffff\1\14\3\uffff\1\4\1\42\1\5\1\33\1\1\1\24\2\42\1"+
            "\31\3\42\1\2\2\42\1\3\3\42\1\22\1\27\5\42\1\uffff\1\43\2\uffff"+
            "\1\42\1\uffff\1\17\1\42\1\20\1\32\1\42\1\23\2\42\1\30\3\42\1"+
            "\34\2\42\1\6\3\42\1\21\1\26\5\42\1\10\1\uffff\1\11\1\42",
            "\1\47",
            "\1\51\11\uffff\1\50",
            "\1\52\1\uffff\1\55\2\uffff\1\54\34\uffff\1\53",
            "\1\56",
            "\1\57\4\uffff\1\60",
            "\1\62\2\uffff\1\61",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "\12\40\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\1\103\4\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\42\7\uffff\17\42\1\107\12\42\4\uffff\1\42\1\uffff\32\42",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\42\7\uffff\17\42\1\114\12\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\166",
            "\1\167",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\172",
            "\1\173",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\174",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008a",
            "\1\u008b",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | PRE | POST | DOT | LCURLY | RCURLY | PLUS | MINUS | CONCAT | EQUALS | DOLLAR | COL_COL | AS | CREATE | TRUE | FALSE | COMMA | UNION | INTER | DESTROY | MERGE | LP | RP | STRING_LITERAL | INT_LITERAL | ID | ESC | META_ID | WS | SingleLineComment | MultiLineComment );";
        }
    }
 

}