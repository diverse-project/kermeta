package org.kermeta.alf.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int RULE_INTEGERVALUE=5;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=9;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalAlfLexer() {;} 
    public InternalAlfLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlfLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:11:7: ( 'class' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:11:9: 'class'
            {
            match("class"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:12:7: ( '{' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:12:9: '{'
            {
            match('{'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:13:7: ( '}' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:13:9: '}'
            {
            match('}'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:14:7: ( 'void ' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:14:9: 'void '
            {
            match("void "); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:15:7: ( '(){' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:15:9: '(){'
            {
            match("(){"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:16:7: ( '*' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:16:9: '*'
            {
            match('*'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:17:7: ( '++' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:17:9: '++'
            {
            match("++"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:18:7: ( '--' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:18:9: '--'
            {
            match("--"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:19:7: ( '::' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:19:9: '::'
            {
            match("::"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:20:7: ( '<' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:20:9: '<'
            {
            match('<'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:21:7: ( ',' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:21:9: ','
            {
            match(','); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:22:7: ( '>' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:22:9: '>'
            {
            match('>'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:23:7: ( '=>' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:23:9: '=>'
            {
            match("=>"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:24:7: ( '(' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:24:9: '('
            {
            match('('); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:25:7: ( ')' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:25:9: ')'
            {
            match(')'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:26:7: ( '?' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:26:9: '?'
            {
            match('?'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:27:7: ( ':' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:27:9: ':'
            {
            match(':'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:28:7: ( '||' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:28:9: '||'
            {
            match("||"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:29:7: ( '&&' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:29:9: '&&'
            {
            match("&&"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:30:7: ( '|' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:30:9: '|'
            {
            match('|'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:31:7: ( '^' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:31:9: '^'
            {
            match('^'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:32:7: ( '&' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:32:9: '&'
            {
            match('&'); 

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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:33:7: ( '==' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:33:9: '=='
            {
            match("=="); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:34:7: ( '!=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:34:9: '!='
            {
            match("!="); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:35:7: ( 'instanceof' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:35:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:36:7: ( 'hastype' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:36:9: 'hastype'
            {
            match("hastype"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:37:7: ( '<=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:37:9: '<='
            {
            match("<="); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:38:7: ( '>=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:38:9: '>='
            {
            match(">="); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:39:7: ( '<<' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:39:9: '<<'
            {
            match("<<"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:40:7: ( '>>' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:40:9: '>>'
            {
            match(">>"); 


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
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:41:7: ( '>>>' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:41:9: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:42:7: ( '+' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:42:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:43:7: ( '-' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:43:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:44:7: ( '/' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:44:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:45:7: ( '%' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:45:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:46:7: ( '!' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:46:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:47:7: ( '$' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:47:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:48:7: ( '~' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:48:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:49:7: ( '.' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:49:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:50:7: ( '[' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:50:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:51:7: ( ']' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:51:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:52:7: ( '->' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:52:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:53:7: ( 'reduce' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:53:9: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:54:7: ( 'ordered' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:54:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:55:7: ( 'isUnique' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:55:9: 'isUnique'
            {
            match("isUnique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:56:7: ( 'null' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:56:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:57:7: ( 'this' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:57:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:58:7: ( 'super' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:58:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:59:7: ( 'new' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:59:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:60:7: ( '..' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:60:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:61:7: ( 'allInstances' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:61:9: 'allInstances'
            {
            match("allInstances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:62:7: ( '/*@' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:62:9: '/*@'
            {
            match("/*@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:63:7: ( 'inline' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:63:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:64:7: ( '*/' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:64:9: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:65:7: ( '//@' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:65:9: '//@'
            {
            match("//@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:66:7: ( ';' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:66:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:67:7: ( 'let' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:67:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:68:7: ( '=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:68:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:69:7: ( 'if' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:69:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:70:7: ( 'else' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:70:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:71:7: ( 'or' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:71:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:72:7: ( 'switch' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:72:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:73:7: ( 'case' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:73:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:74:7: ( 'default' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:74:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:75:7: ( 'while' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:75:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:76:7: ( 'do' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:76:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:77:7: ( 'for' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:77:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:78:7: ( 'in' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:78:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:79:7: ( 'break' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:79:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:80:7: ( 'return' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:80:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:81:7: ( 'accept' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:81:9: 'accept'
            {
            match("accept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:82:7: ( 'classify' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:82:9: 'classify'
            {
            match("classify"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:83:7: ( 'from' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:83:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:84:7: ( 'to' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:84:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:85:7: ( 'true' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:85:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:86:7: ( 'false' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:86:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:87:7: ( 'createLink' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:87:9: 'createLink'
            {
            match("createLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:88:7: ( 'destroyLink' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:88:9: 'destroyLink'
            {
            match("destroyLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:89:7: ( 'clearAssoc' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:89:9: 'clearAssoc'
            {
            match("clearAssoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:90:7: ( 'select' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:90:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:91:7: ( 'reject' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:91:9: 'reject'
            {
            match("reject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:92:7: ( 'collect' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:92:9: 'collect'
            {
            match("collect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:93:7: ( 'iterate' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:93:9: 'iterate'
            {
            match("iterate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:94:7: ( 'forAll' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:94:9: 'forAll'
            {
            match("forAll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:95:7: ( 'exists' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:95:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:96:7: ( 'one' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:96:9: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:97:7: ( 'isolated' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:97:9: 'isolated'
            {
            match("isolated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:98:7: ( 'determined' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:98:9: 'determined'
            {
            match("determined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:99:8: ( 'assured' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:99:10: 'assured'
            {
            match("assured"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:100:8: ( 'parallel' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:100:10: 'parallel'
            {
            match("parallel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:101:8: ( '+=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:101:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:102:8: ( '-=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:102:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:103:8: ( '*=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:103:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:104:8: ( '%=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:104:10: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:105:8: ( '/=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:105:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:106:8: ( '&=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:106:10: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:107:8: ( '|=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:107:10: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:108:8: ( '^=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:108:10: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:109:8: ( '<<=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:109:10: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:110:8: ( '>>=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:110:10: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:111:8: ( '>>>=' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:111:10: '>>>='
            {
            match(">>>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "RULE_INTEGERVALUE"
    public final void mRULE_INTEGERVALUE() throws RecognitionException {
        try {
            int _type = RULE_INTEGERVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:19: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'B':
                case 'b':
                    {
                    alt13=2;
                    }
                    break;
                case 'X':
                case 'x':
                    {
                    alt13=3;
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
                case '_':
                    {
                    alt13=4;
                    }
                    break;
                default:
                    alt13=1;}

            }
            else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='0') ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:23: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:27: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:36: ( ( '_' )? '0' .. '9' )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')||LA2_0=='_') ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:37: ( '_' )? '0' .. '9'
                            	    {
                            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:37: ( '_' )?
                            	    int alt1=2;
                            	    int LA1_0 = input.LA(1);

                            	    if ( (LA1_0=='_') ) {
                            	        alt1=1;
                            	    }
                            	    switch (alt1) {
                            	        case 1 :
                            	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:37: '_'
                            	            {
                            	            match('_'); 

                            	            }
                            	            break;

                            	    }

                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:54: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:54: ( '0b' | '0B' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='0') ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1=='b') ) {
                            alt4=1;
                        }
                        else if ( (LA4_1=='B') ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:55: '0b'
                            {
                            match("0b"); 


                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:60: '0B'
                            {
                            match("0B"); 


                            }
                            break;

                    }

                    matchRange('0','1'); 
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:75: ( ( '_' )? '0' .. '1' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='1')||LA6_0=='_') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:76: ( '_' )? '0' .. '1'
                    	    {
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:76: ( '_' )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0=='_') ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:76: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:92: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:92: ( '0x' | '0X' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='0') ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1=='x') ) {
                            alt7=1;
                        }
                        else if ( (LA7_1=='X') ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:93: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:98: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:133: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:134: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:134: ( '_' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0=='_') ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:134: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
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


                    }
                    break;
                case 4 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:170: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
                    {
                    match('0'); 
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:174: ( '_' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='_') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:174: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }

                    matchRange('0','7'); 
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:188: ( ( '_' )? '0' .. '7' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='7')||LA12_0=='_') ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:189: ( '_' )? '0' .. '7'
                    	    {
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:189: ( '_' )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0=='_') ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7461:189: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_INTEGERVALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '\\'' ( options {greedy=false; } : . )* '\\'' ) )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:70: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:75: ( options {greedy=false; } : . )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\'') ) {
                            alt15=2;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7463:103: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7465:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7465:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7465:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7465:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7465:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop17;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7467:17: ( '/*' (~ ( '@' ) )* '*/' )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7467:19: '/*' (~ ( '@' ) )* '*/'
            {
            match("/*"); 

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7467:24: (~ ( '@' ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        int LA18_3 = input.LA(3);

                        if ( ((LA18_3>='\u0000' && LA18_3<='?')||(LA18_3>='A' && LA18_3<='\uFFFF')) ) {
                            alt18=1;
                        }


                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='?')||(LA18_1>='A' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='?')||(LA18_0>='A' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7467:24: ~ ( '@' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:17: ( '//' (~ ( ( '\\n' | '\\r' | '@' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:19: '//' (~ ( ( '\\n' | '\\r' | '@' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:24: (~ ( ( '\\n' | '\\r' | '@' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='?')||(LA19_0>='A' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:24: ~ ( ( '\\n' | '\\r' | '@' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:44: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:45: ( '\\r' )? '\\n'
                    {
                    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:45: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7469:45: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7471:10: ( ( '0' .. '9' )+ )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7471:12: ( '0' .. '9' )+
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7471:12: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7471:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7473:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7473:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7473:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7475:16: ( . )
            // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:7475:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | RULE_INTEGERVALUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_WS | RULE_ANY_OTHER )
        int alt24=109;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:629: RULE_INTEGERVALUE
                {
                mRULE_INTEGERVALUE(); 

                }
                break;
            case 103 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:647: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 104 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:655: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 105 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:667: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 106 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:683: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 107 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:699: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 108 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:708: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 109 :
                // ../org.kermeta.alf.xtext/src-gen/org/kermeta/alf/xtext/parser/antlr/internal/InternalAlf.g:1:716: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\1\66\2\uffff\1\66\1\73\1\76\1\101\1\105\1\107\1\112\1\uffff"+
        "\1\116\1\121\2\uffff\1\126\1\131\1\133\1\135\2\66\1\146\1\150\2"+
        "\uffff\1\154\2\uffff\6\66\1\uffff\7\66\2\u0089\1\uffff\2\61\2\uffff"+
        "\4\66\3\uffff\1\66\17\uffff\1\u0096\3\uffff\1\u0099\20\uffff\1\u009c"+
        "\1\66\1\u009f\2\66\1\uffff\1\u00a5\12\uffff\1\66\1\u00aa\4\66\1"+
        "\u00af\7\66\1\uffff\4\66\1\u00bd\6\66\1\uffff\1\u0089\1\uffff\1"+
        "\u0089\2\uffff\6\66\2\uffff\1\u00cc\2\uffff\2\66\1\uffff\2\66\1"+
        "\uffff\2\66\4\uffff\4\66\1\uffff\1\u00d7\1\66\1\u00d9\1\66\1\uffff"+
        "\7\66\1\u00e2\5\66\1\uffff\1\66\1\u00ea\4\66\1\u0089\2\66\1\u00f1"+
        "\3\66\2\uffff\12\66\1\uffff\1\u00ff\1\uffff\1\u0100\1\u0101\6\66"+
        "\1\uffff\1\u0108\6\66\1\uffff\1\u010f\3\66\1\u0114\1\66\1\uffff"+
        "\2\66\1\uffff\12\66\3\uffff\1\u0122\5\66\1\uffff\4\66\1\u012c\1"+
        "\66\1\uffff\1\u012e\1\u012f\2\66\1\uffff\4\66\1\u0136\4\66\1\u013b"+
        "\1\u013c\1\u013d\1\66\1\uffff\1\u013f\1\u0140\1\66\1\u0142\1\66"+
        "\1\u0144\3\66\1\uffff\1\u0148\2\uffff\4\66\1\u014d\1\66\1\uffff"+
        "\2\66\1\u0151\1\u0152\3\uffff\1\u0153\2\uffff\1\66\1\uffff\1\u0155"+
        "\1\uffff\1\u0156\2\66\1\uffff\1\66\1\u015a\2\66\1\uffff\1\66\1\u015e"+
        "\1\u015f\3\uffff\1\66\2\uffff\2\66\1\u0163\1\uffff\3\66\2\uffff"+
        "\3\66\1\uffff\1\u016a\1\u016b\1\u016c\2\66\1\u016f\3\uffff\1\66"+
        "\1\u0171\1\uffff\1\u0172\2\uffff";
    static final String DFA24_eofS =
        "\u0173\uffff";
    static final String DFA24_minS =
        "\1\0\1\141\2\uffff\1\157\1\51\1\57\1\53\1\55\1\72\1\74\1\uffff\2"+
        "\75\2\uffff\1\75\1\46\2\75\1\146\1\141\1\52\1\75\2\uffff\1\56\2"+
        "\uffff\1\145\1\156\1\145\1\150\1\145\1\143\1\uffff\1\145\1\154\1"+
        "\145\1\150\1\141\1\162\1\141\2\60\1\uffff\2\0\2\uffff\1\141\1\163"+
        "\1\145\1\154\3\uffff\1\151\17\uffff\1\75\3\uffff\1\75\20\uffff\1"+
        "\60\1\125\1\60\1\145\1\163\1\0\1\100\12\uffff\1\144\1\60\1\145\1"+
        "\154\1\167\1\151\1\60\1\165\1\160\1\151\2\154\1\143\1\163\1\uffff"+
        "\1\164\1\163\1\151\1\146\1\60\1\151\1\162\1\157\1\154\1\145\1\162"+
        "\1\uffff\1\60\1\uffff\1\60\2\uffff\1\163\1\141\1\145\1\141\1\154"+
        "\1\144\2\uffff\1\75\2\uffff\1\164\1\151\1\uffff\1\156\1\154\1\uffff"+
        "\1\162\1\164\4\uffff\2\165\2\145\1\uffff\1\60\1\154\1\60\1\163\1"+
        "\uffff\2\145\1\164\1\145\1\111\1\145\1\165\1\60\1\145\1\163\1\141"+
        "\1\164\1\145\1\uffff\1\154\1\60\1\155\1\163\2\141\1\60\1\163\1\162"+
        "\1\60\1\164\1\145\1\40\2\uffff\1\141\1\156\1\151\2\141\1\171\1\143"+
        "\1\162\1\143\1\162\1\uffff\1\60\1\uffff\2\60\1\162\2\143\1\156\1"+
        "\160\1\162\1\uffff\1\60\1\164\1\165\2\162\1\145\1\154\1\uffff\1"+
        "\60\1\145\1\153\1\154\1\60\1\101\1\uffff\1\145\1\143\1\uffff\1\156"+
        "\1\145\1\161\2\164\1\160\1\145\1\156\1\164\1\145\3\uffff\1\60\1"+
        "\150\1\164\1\163\1\164\1\145\1\uffff\1\163\1\154\1\157\1\155\1\60"+
        "\1\154\1\uffff\2\60\1\154\1\146\1\uffff\1\163\1\114\1\164\1\143"+
        "\1\60\1\165\3\145\3\60\1\144\1\uffff\2\60\1\164\1\60\1\144\1\60"+
        "\1\164\1\171\1\151\1\uffff\1\60\2\uffff\1\145\1\171\1\163\1\151"+
        "\1\60\1\145\1\uffff\1\145\1\144\2\60\3\uffff\1\60\2\uffff\1\141"+
        "\1\uffff\1\60\1\uffff\1\60\1\114\1\156\1\uffff\1\154\1\60\1\157"+
        "\1\156\1\uffff\1\157\2\60\3\uffff\1\156\2\uffff\1\151\1\145\1\60"+
        "\1\uffff\1\143\1\153\1\146\2\uffff\1\143\1\156\1\144\1\uffff\3\60"+
        "\1\145\1\153\1\60\3\uffff\1\163\1\60\1\uffff\1\60\2\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\162\2\uffff\1\157\1\51\2\75\1\76\1\72\1\75\1\uffff\2"+
        "\76\2\uffff\1\174\3\75\1\164\1\141\2\75\2\uffff\1\56\2\uffff\1\145"+
        "\1\162\1\165\1\162\1\167\1\163\1\uffff\1\145\1\170\1\157\1\150\2"+
        "\162\1\141\2\71\1\uffff\2\uffff\2\uffff\1\145\1\163\1\145\1\154"+
        "\3\uffff\1\151\17\uffff\1\75\3\uffff\1\76\20\uffff\1\172\1\157\1"+
        "\172\1\145\1\163\1\uffff\1\100\12\uffff\1\164\1\172\1\145\1\154"+
        "\1\167\1\151\1\172\1\165\1\160\1\151\2\154\1\143\1\163\1\uffff\1"+
        "\164\1\163\1\151\1\164\1\172\1\151\1\162\1\157\1\154\1\145\1\162"+
        "\1\uffff\1\71\1\uffff\1\71\2\uffff\1\163\1\141\1\145\1\141\1\154"+
        "\1\144\2\uffff\1\75\2\uffff\1\164\1\151\1\uffff\1\156\1\154\1\uffff"+
        "\1\162\1\164\4\uffff\2\165\2\145\1\uffff\1\172\1\154\1\172\1\163"+
        "\1\uffff\2\145\1\164\1\145\1\111\1\145\1\165\1\172\1\145\1\163\1"+
        "\141\1\164\1\145\1\uffff\1\154\1\172\1\155\1\163\2\141\1\71\1\163"+
        "\1\162\1\172\1\164\1\145\1\40\2\uffff\1\141\1\156\1\151\2\141\1"+
        "\171\1\143\1\162\1\143\1\162\1\uffff\1\172\1\uffff\2\172\1\162\2"+
        "\143\1\156\1\160\1\162\1\uffff\1\172\1\164\1\165\2\162\1\145\1\154"+
        "\1\uffff\1\172\1\145\1\153\1\154\1\172\1\101\1\uffff\1\145\1\143"+
        "\1\uffff\1\156\1\145\1\161\2\164\1\160\1\145\1\156\1\164\1\145\3"+
        "\uffff\1\172\1\150\1\164\1\163\1\164\1\145\1\uffff\1\163\1\154\1"+
        "\157\1\155\1\172\1\154\1\uffff\2\172\1\154\1\146\1\uffff\1\163\1"+
        "\114\1\164\1\143\1\172\1\165\3\145\3\172\1\144\1\uffff\2\172\1\164"+
        "\1\172\1\144\1\172\1\164\1\171\1\151\1\uffff\1\172\2\uffff\1\145"+
        "\1\171\1\163\1\151\1\172\1\145\1\uffff\1\145\1\144\2\172\3\uffff"+
        "\1\172\2\uffff\1\141\1\uffff\1\172\1\uffff\1\172\1\114\1\156\1\uffff"+
        "\1\154\1\172\1\157\1\156\1\uffff\1\157\2\172\3\uffff\1\156\2\uffff"+
        "\1\151\1\145\1\172\1\uffff\1\143\1\153\1\146\2\uffff\1\143\1\156"+
        "\1\144\1\uffff\3\172\1\145\1\153\1\172\3\uffff\1\163\1\172\1\uffff"+
        "\1\172\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\7\uffff\1\13\2\uffff\1\17\1\20\10\uffff\1\45\1"+
        "\46\1\uffff\1\50\1\51\6\uffff\1\70\11\uffff\1\147\2\uffff\1\154"+
        "\1\155\4\uffff\1\147\1\2\1\3\1\uffff\1\5\1\16\1\66\1\135\1\6\1\7"+
        "\1\133\1\40\1\10\1\52\1\134\1\41\1\11\1\21\1\33\1\uffff\1\12\1\13"+
        "\1\34\1\uffff\1\14\1\15\1\27\1\72\1\17\1\20\1\22\1\141\1\24\1\23"+
        "\1\140\1\26\1\142\1\25\1\30\1\44\7\uffff\1\137\1\42\1\136\1\43\1"+
        "\45\1\46\1\62\1\47\1\50\1\51\16\uffff\1\70\13\uffff\1\146\1\uffff"+
        "\1\153\1\uffff\1\150\1\154\6\uffff\1\143\1\35\1\uffff\1\144\1\36"+
        "\2\uffff\1\104\2\uffff\1\73\2\uffff\1\64\1\151\1\67\1\152\4\uffff"+
        "\1\75\4\uffff\1\112\15\uffff\1\102\15\uffff\1\145\1\37\12\uffff"+
        "\1\126\1\uffff\1\61\10\uffff\1\71\7\uffff\1\103\6\uffff\1\77\2\uffff"+
        "\1\4\12\uffff\1\56\1\57\1\113\6\uffff\1\74\6\uffff\1\111\4\uffff"+
        "\1\1\15\uffff\1\60\11\uffff\1\101\1\uffff\1\114\1\105\6\uffff\1"+
        "\65\4\uffff\1\53\1\106\1\121\1\uffff\1\76\1\120\1\uffff\1\107\1"+
        "\uffff\1\125\3\uffff\1\124\4\uffff\1\122\3\uffff\1\123\1\32\1\54"+
        "\1\uffff\1\131\1\100\3\uffff\1\110\3\uffff\1\55\1\127\3\uffff\1"+
        "\132\6\uffff\1\117\1\115\1\31\2\uffff\1\130\1\uffff\1\116\1\63";
    static final String DFA24_specialS =
        "\1\1\55\uffff\1\3\1\0\63\uffff\1\2\u010f\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\23\1\57\1\61\1\30\1\27\1"+
            "\21\1\56\1\5\1\16\1\6\1\7\1\13\1\10\1\32\1\26\1\53\11\54\1\11"+
            "\1\43\1\12\1\15\1\14\1\17\1\61\32\55\1\33\1\61\1\34\1\22\1\55"+
            "\1\61\1\42\1\51\1\1\1\46\1\45\1\50\1\55\1\25\1\24\2\55\1\44"+
            "\1\55\1\37\1\36\1\52\1\55\1\35\1\41\1\40\1\55\1\4\1\47\3\55"+
            "\1\2\1\20\1\3\1\31\uff81\61",
            "\1\63\12\uffff\1\62\2\uffff\1\65\2\uffff\1\64",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\74\15\uffff\1\75",
            "\1\77\21\uffff\1\100",
            "\1\102\17\uffff\1\104\1\103",
            "\1\106",
            "\1\111\1\110",
            "",
            "\1\114\1\115",
            "\1\120\1\117",
            "",
            "",
            "\1\125\76\uffff\1\124",
            "\1\127\26\uffff\1\130",
            "\1\132",
            "\1\134",
            "\1\140\7\uffff\1\136\4\uffff\1\137\1\141",
            "\1\142",
            "\1\143\4\uffff\1\144\15\uffff\1\145",
            "\1\147",
            "",
            "",
            "\1\153",
            "",
            "",
            "\1\157",
            "\1\161\3\uffff\1\160",
            "\1\163\17\uffff\1\162",
            "\1\164\6\uffff\1\165\2\uffff\1\166",
            "\1\171\17\uffff\1\167\1\uffff\1\170",
            "\1\173\10\uffff\1\172\6\uffff\1\174",
            "",
            "\1\176",
            "\1\177\13\uffff\1\u0080",
            "\1\u0081\11\uffff\1\u0082",
            "\1\u0083",
            "\1\u0086\15\uffff\1\u0084\2\uffff\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "\10\u008a\2\u008b",
            "\12\u008c",
            "",
            "\0\66",
            "\0\u008d",
            "",
            "",
            "\1\u008f\3\uffff\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "",
            "\1\u0094",
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
            "",
            "\1\u0095",
            "",
            "",
            "",
            "\1\u0098\1\u0097",
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
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\u009b\6\66"+
            "\1\u009a\7\66",
            "\1\u009d\31\uffff\1\u009e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00a0",
            "\1\u00a1",
            "\100\u00a3\1\u00a2\uffbf\u00a3",
            "\1\u00a4",
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
            "\1\u00a6\5\uffff\1\u00a8\11\uffff\1\u00a7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u00a9\26\66",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\14\uffff\1\u00bb\1\u00bc",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\10\u00c4\2\u008b",
            "",
            "\12\u008c",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "\1\u00cb",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\12\66\7\uffff\1\u00e9\31\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\10\u00c4\2\u008b",
            "\1\u00ef",
            "\1\u00f0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\10\66\1\u0113\21"+
            "\66",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012d",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013e",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0141",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0143",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0154",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u0160",
            "",
            "",
            "\1\u0161",
            "\1\u0162",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u016d",
            "\1\u016e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u0170",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | RULE_INTEGERVALUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_47 = input.LA(1);

                        s = -1;
                        if ( ((LA24_47>='\u0000' && LA24_47<='\uFFFF')) ) {s = 141;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='c') ) {s = 1;}

                        else if ( (LA24_0=='{') ) {s = 2;}

                        else if ( (LA24_0=='}') ) {s = 3;}

                        else if ( (LA24_0=='v') ) {s = 4;}

                        else if ( (LA24_0=='(') ) {s = 5;}

                        else if ( (LA24_0=='*') ) {s = 6;}

                        else if ( (LA24_0=='+') ) {s = 7;}

                        else if ( (LA24_0=='-') ) {s = 8;}

                        else if ( (LA24_0==':') ) {s = 9;}

                        else if ( (LA24_0=='<') ) {s = 10;}

                        else if ( (LA24_0==',') ) {s = 11;}

                        else if ( (LA24_0=='>') ) {s = 12;}

                        else if ( (LA24_0=='=') ) {s = 13;}

                        else if ( (LA24_0==')') ) {s = 14;}

                        else if ( (LA24_0=='?') ) {s = 15;}

                        else if ( (LA24_0=='|') ) {s = 16;}

                        else if ( (LA24_0=='&') ) {s = 17;}

                        else if ( (LA24_0=='^') ) {s = 18;}

                        else if ( (LA24_0=='!') ) {s = 19;}

                        else if ( (LA24_0=='i') ) {s = 20;}

                        else if ( (LA24_0=='h') ) {s = 21;}

                        else if ( (LA24_0=='/') ) {s = 22;}

                        else if ( (LA24_0=='%') ) {s = 23;}

                        else if ( (LA24_0=='$') ) {s = 24;}

                        else if ( (LA24_0=='~') ) {s = 25;}

                        else if ( (LA24_0=='.') ) {s = 26;}

                        else if ( (LA24_0=='[') ) {s = 27;}

                        else if ( (LA24_0==']') ) {s = 28;}

                        else if ( (LA24_0=='r') ) {s = 29;}

                        else if ( (LA24_0=='o') ) {s = 30;}

                        else if ( (LA24_0=='n') ) {s = 31;}

                        else if ( (LA24_0=='t') ) {s = 32;}

                        else if ( (LA24_0=='s') ) {s = 33;}

                        else if ( (LA24_0=='a') ) {s = 34;}

                        else if ( (LA24_0==';') ) {s = 35;}

                        else if ( (LA24_0=='l') ) {s = 36;}

                        else if ( (LA24_0=='e') ) {s = 37;}

                        else if ( (LA24_0=='d') ) {s = 38;}

                        else if ( (LA24_0=='w') ) {s = 39;}

                        else if ( (LA24_0=='f') ) {s = 40;}

                        else if ( (LA24_0=='b') ) {s = 41;}

                        else if ( (LA24_0=='p') ) {s = 42;}

                        else if ( (LA24_0=='0') ) {s = 43;}

                        else if ( ((LA24_0>='1' && LA24_0<='9')) ) {s = 44;}

                        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='g'||(LA24_0>='j' && LA24_0<='k')||LA24_0=='m'||LA24_0=='q'||LA24_0=='u'||(LA24_0>='x' && LA24_0<='z')) ) {s = 45;}

                        else if ( (LA24_0=='\'') ) {s = 46;}

                        else if ( (LA24_0=='\"') ) {s = 47;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 48;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='#'||LA24_0=='@'||LA24_0=='\\'||LA24_0=='`'||(LA24_0>='\u007F' && LA24_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_99 = input.LA(1);

                        s = -1;
                        if ( (LA24_99=='@') ) {s = 162;}

                        else if ( ((LA24_99>='\u0000' && LA24_99<='?')||(LA24_99>='A' && LA24_99<='\uFFFF')) ) {s = 163;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_46 = input.LA(1);

                        s = -1;
                        if ( ((LA24_46>='\u0000' && LA24_46<='\uFFFF')) ) {s = 54;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}