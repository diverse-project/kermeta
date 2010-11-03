// $ANTLR ${project.version} ${buildNumber}

	package art.resource.artext.mopp;


import org.antlr.runtime3_2_0.*;

public class ArtextLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int ANNOTATION=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T_OPTIONAL=13;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int LINEBREAKS=15;
    public static final int EOF=-1;
    public static final int T_PORT_KIND=7;
    public static final int T__55=55;
    public static final int ML_COMMENT=11;
    public static final int MULTIPLICITY=8;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int STRING_LITERAL=5;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T_IMPLEM=9;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int T_INSTANCE_STATE=6;
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
    public static final int WHITESPACE=14;
    public static final int TEXT=4;
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
    public static final int SL_COMMENT=10;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public ArtextLexer() {;} 
    public ArtextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArtextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Artext.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:16:7: ( 'system' )
            // Artext.g:16:9: 'system'
            {
            match("system"); 


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
            // Artext.g:17:7: ( ';' )
            // Artext.g:17:9: ';'
            {
            match(';'); 

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
            // Artext.g:18:7: ( 'datatype' )
            // Artext.g:18:9: 'datatype'
            {
            match("datatype"); 


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
            // Artext.g:19:7: ( 'node' )
            // Artext.g:19:9: 'node'
            {
            match("node"); 


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
            // Artext.g:20:7: ( 'uri' )
            // Artext.g:20:9: 'uri'
            {
            match("uri"); 


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
            // Artext.g:21:7: ( '=' )
            // Artext.g:21:9: '='
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
            // Artext.g:22:7: ( '{' )
            // Artext.g:22:9: '{'
            {
            match('{'); 

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
            // Artext.g:23:7: ( '}' )
            // Artext.g:23:9: '}'
            {
            match('}'); 

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
            // Artext.g:24:7: ( 'primitive' )
            // Artext.g:24:9: 'primitive'
            {
            match("primitive"); 


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
            // Artext.g:25:7: ( 'instance' )
            // Artext.g:25:9: 'instance'
            {
            match("instance"); 


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
            // Artext.g:26:7: ( ':' )
            // Artext.g:26:9: ':'
            {
            match(':'); 

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
            // Artext.g:27:7: ( 'implementation' )
            // Artext.g:27:9: 'implementation'
            {
            match("implementation"); 


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
            // Artext.g:28:7: ( 'composite' )
            // Artext.g:28:9: 'composite'
            {
            match("composite"); 


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
            // Artext.g:29:7: ( 'bind' )
            // Artext.g:29:9: 'bind'
            {
            match("bind"); 


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
            // Artext.g:30:7: ( 'to' )
            // Artext.g:30:9: 'to'
            {
            match("to"); 


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
            // Artext.g:31:7: ( '::' )
            // Artext.g:31:9: '::'
            {
            match("::"); 


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
            // Artext.g:32:7: ( '(' )
            // Artext.g:32:9: '('
            {
            match('('); 

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
            // Artext.g:33:7: ( 'id' )
            // Artext.g:33:9: 'id'
            {
            match("id"); 


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
            // Artext.g:34:7: ( ')' )
            // Artext.g:34:9: ')'
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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:35:7: ( 'delegate' )
            // Artext.g:35:9: 'delegate'
            {
            match("delegate"); 


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
            // Artext.g:36:7: ( ':=' )
            // Artext.g:36:9: ':='
            {
            match(":="); 


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
            // Artext.g:37:7: ( ',' )
            // Artext.g:37:9: ','
            {
            match(','); 

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
            // Artext.g:38:7: ( '[' )
            // Artext.g:38:9: '['
            {
            match('['); 

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
            // Artext.g:39:7: ( '->' )
            // Artext.g:39:9: '->'
            {
            match("->"); 


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
            // Artext.g:40:7: ( ']' )
            // Artext.g:40:9: ']'
            {
            match(']'); 

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
            // Artext.g:41:7: ( 'type' )
            // Artext.g:41:9: 'type'
            {
            match("type"); 


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
            // Artext.g:42:7: ( 'compositetype' )
            // Artext.g:42:9: 'compositetype'
            {
            match("compositetype"); 


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
            // Artext.g:43:7: ( 'operation' )
            // Artext.g:43:9: 'operation'
            {
            match("operation"); 


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
            // Artext.g:44:7: ( 'functional' )
            // Artext.g:44:9: 'functional'
            {
            match("functional"); 


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
            // Artext.g:45:7: ( 'service' )
            // Artext.g:45:9: 'service'
            {
            match("service"); 


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
            // Artext.g:46:7: ( 'control' )
            // Artext.g:46:9: 'control'
            {
            match("control"); 


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
            // Artext.g:47:7: ( 'port' )
            // Artext.g:47:9: 'port'
            {
            match("port"); 


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
            // Artext.g:48:7: ( '..' )
            // Artext.g:48:9: '..'
            {
            match(".."); 


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
            // Artext.g:49:7: ( 'protocol' )
            // Artext.g:49:9: 'protocol'
            {
            match("protocol"); 


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
            // Artext.g:50:7: ( 'FractalComponent' )
            // Artext.g:50:9: 'FractalComponent'
            {
            match("FractalComponent"); 


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
            // Artext.g:51:7: ( '<' )
            // Artext.g:51:9: '<'
            {
            match('<'); 

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
            // Artext.g:52:7: ( 'controllerDesc' )
            // Artext.g:52:9: 'controllerDesc'
            {
            match("controllerDesc"); 


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
            // Artext.g:53:7: ( 'contentDesc' )
            // Artext.g:53:9: 'contentDesc'
            {
            match("contentDesc"); 


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
            // Artext.g:54:7: ( '>' )
            // Artext.g:54:9: '>'
            {
            match('>'); 

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
            // Artext.g:55:7: ( 'OSGiComponent' )
            // Artext.g:55:9: 'OSGiComponent'
            {
            match("OSGiComponent"); 


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
            // Artext.g:56:7: ( 'typegroup' )
            // Artext.g:56:9: 'typegroup'
            {
            match("typegroup"); 


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
            // Artext.g:57:7: ( 'types' )
            // Artext.g:57:9: 'types'
            {
            match("types"); 


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
            // Artext.g:58:7: ( 'instancegroup' )
            // Artext.g:58:9: 'instancegroup'
            {
            match("instancegroup"); 


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
            // Artext.g:59:7: ( 'instances' )
            // Artext.g:59:9: 'instances'
            {
            match("instances"); 


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
            // Artext.g:60:7: ( 'attribute' )
            // Artext.g:60:9: 'attribute'
            {
            match("attribute"); 


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
            // Artext.g:61:7: ( 'default' )
            // Artext.g:61:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6313:11: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Artext.g:6314:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 

            // Artext.g:6314:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Artext.g:6314:7: ~ ( '\\n' | '\\r' | '\\uffff' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
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
            // Artext.g:6317:11: ( '/*' ( . )* '*/' )
            // Artext.g:6318:2: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Artext.g:6318:6: ( . )*
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
            	    // Artext.g:6318:6: .
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

    // $ANTLR start "ANNOTATION"
    public final void mANNOTATION() throws RecognitionException {
        try {
            int _type = ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6320:11: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Artext.g:6321:2: '@' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            match('@'); 
            // Artext.g:6321:5: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
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
            	    // Artext.g:
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

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANNOTATION"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6323:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) | ~ ( '\\\\' | '\"' ) )* '\"' )
            // Artext.g:6324:2: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // Artext.g:6324:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ) | '\\\\' ( '0' .. '7' ) | ~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=5;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\"':
                    case '\'':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't':
                        {
                        alt4=1;
                        }
                        break;
                    case 'u':
                        {
                        alt4=2;
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
                        {
                        alt4=3;
                        }
                        break;

                    }

                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=4;
                }


                switch (alt4) {
            	case 1 :
            	    // Artext.g:6324:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            	    // Artext.g:6324:47: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    {
            	    // Artext.g:6324:47: ( '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            	    // Artext.g:6324:48: '\\\\' 'u' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    {
            	    match('\\'); 
            	    match('u'); 
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }


            	    }
            	    break;
            	case 3 :
            	    // Artext.g:6324:169: '\\\\' ( '0' .. '7' )
            	    {
            	    match('\\'); 
            	    // Artext.g:6324:173: ( '0' .. '7' )
            	    // Artext.g:6324:174: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }


            	    }
            	    break;
            	case 4 :
            	    // Artext.g:6324:184: ~ ( '\\\\' | '\"' )
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
            	    break loop4;
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

    // $ANTLR start "T_INSTANCE_STATE"
    public final void mT_INSTANCE_STATE() throws RecognitionException {
        try {
            int _type = T_INSTANCE_STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6325:17: ( '#ON' | '#OFF' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='#') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='O') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='N') ) {
                        alt5=1;
                    }
                    else if ( (LA5_2=='F') ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Artext.g:6326:2: '#ON'
                    {
                    match("#ON"); 


                    }
                    break;
                case 2 :
                    // Artext.g:6326:8: '#OFF'
                    {
                    match("#OFF"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_INSTANCE_STATE"

    // $ANTLR start "T_PORT_KIND"
    public final void mT_PORT_KIND() throws RecognitionException {
        try {
            int _type = T_PORT_KIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6327:12: ( 'provided' | 'required' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='p') ) {
                alt6=1;
            }
            else if ( (LA6_0=='r') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Artext.g:6328:2: 'provided'
                    {
                    match("provided"); 


                    }
                    break;
                case 2 :
                    // Artext.g:6328:13: 'required'
                    {
                    match("required"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_PORT_KIND"

    // $ANTLR start "T_IMPLEM"
    public final void mT_IMPLEM() throws RecognitionException {
        try {
            int _type = T_IMPLEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6329:9: ( 'bundle' | 'memory' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='b') ) {
                alt7=1;
            }
            else if ( (LA7_0=='m') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Artext.g:6330:2: 'bundle'
                    {
                    match("bundle"); 


                    }
                    break;
                case 2 :
                    // Artext.g:6330:11: 'memory'
                    {
                    match("memory"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_IMPLEM"

    // $ANTLR start "T_OPTIONAL"
    public final void mT_OPTIONAL() throws RecognitionException {
        try {
            int _type = T_OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6331:11: ( 'optional' )
            // Artext.g:6332:2: 'optional'
            {
            match("optional"); 

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_OPTIONAL"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6334:11: ( ( ' ' | '\\t' | '\\f' ) )
            // Artext.g:6335:2: ( ' ' | '\\t' | '\\f' )
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

    // $ANTLR start "LINEBREAKS"
    public final void mLINEBREAKS() throws RecognitionException {
        try {
            int _type = LINEBREAKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6338:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Artext.g:6339:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Artext.g:6339:2: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // Artext.g:6339:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Artext.g:6339:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Artext.g:6339:15: '\\n'
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
    // $ANTLR end "LINEBREAKS"

    // $ANTLR start "MULTIPLICITY"
    public final void mMULTIPLICITY() throws RecognitionException {
        try {
            int _type = MULTIPLICITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6342:13: ( ( ( '*' ) | ( ( '0' .. '9' )+ ) ) )
            // Artext.g:6343:2: ( ( '*' ) | ( ( '0' .. '9' )+ ) )
            {
            // Artext.g:6343:2: ( ( '*' ) | ( ( '0' .. '9' )+ ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='*') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Artext.g:6343:4: ( '*' )
                    {
                    // Artext.g:6343:4: ( '*' )
                    // Artext.g:6343:5: '*'
                    {
                    match('*'); 

                    }


                    }
                    break;
                case 2 :
                    // Artext.g:6343:12: ( ( '0' .. '9' )+ )
                    {
                    // Artext.g:6343:12: ( ( '0' .. '9' )+ )
                    // Artext.g:6343:13: ( '0' .. '9' )+
                    {
                    // Artext.g:6343:13: ( '0' .. '9' )+
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
                    	    // Artext.g:6343:14: '0' .. '9'
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
    // $ANTLR end "MULTIPLICITY"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Artext.g:6345:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* ( '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )* )
            // Artext.g:6346:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )* ( '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Artext.g:6346:30: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='-'||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Artext.g:
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
            	    break loop11;
                }
            } while (true);

            // Artext.g:6346:77: ( '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='.') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Artext.g:6346:78: '.' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            	    {
            	    match('.'); 
            	    // Artext.g:6346:81: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0=='-'||(LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // Artext.g:
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
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    public void mTokens() throws RecognitionException {
        // Artext.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | SL_COMMENT | ML_COMMENT | ANNOTATION | STRING_LITERAL | T_INSTANCE_STATE | T_PORT_KIND | T_IMPLEM | T_OPTIONAL | WHITESPACE | LINEBREAKS | MULTIPLICITY | TEXT )
        int alt14=58;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // Artext.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // Artext.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // Artext.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // Artext.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // Artext.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // Artext.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // Artext.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // Artext.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // Artext.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // Artext.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // Artext.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // Artext.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // Artext.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // Artext.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // Artext.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // Artext.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // Artext.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // Artext.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // Artext.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // Artext.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // Artext.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // Artext.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // Artext.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // Artext.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // Artext.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // Artext.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // Artext.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // Artext.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // Artext.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // Artext.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // Artext.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // Artext.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // Artext.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // Artext.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // Artext.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // Artext.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // Artext.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // Artext.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // Artext.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // Artext.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // Artext.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // Artext.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // Artext.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // Artext.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // Artext.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // Artext.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // Artext.g:1:286: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 48 :
                // Artext.g:1:297: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 49 :
                // Artext.g:1:308: ANNOTATION
                {
                mANNOTATION(); 

                }
                break;
            case 50 :
                // Artext.g:1:319: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 51 :
                // Artext.g:1:334: T_INSTANCE_STATE
                {
                mT_INSTANCE_STATE(); 

                }
                break;
            case 52 :
                // Artext.g:1:351: T_PORT_KIND
                {
                mT_PORT_KIND(); 

                }
                break;
            case 53 :
                // Artext.g:1:363: T_IMPLEM
                {
                mT_IMPLEM(); 

                }
                break;
            case 54 :
                // Artext.g:1:372: T_OPTIONAL
                {
                mT_OPTIONAL(); 

                }
                break;
            case 55 :
                // Artext.g:1:383: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 56 :
                // Artext.g:1:394: LINEBREAKS
                {
                mLINEBREAKS(); 

                }
                break;
            case 57 :
                // Artext.g:1:405: MULTIPLICITY
                {
                mMULTIPLICITY(); 

                }
                break;
            case 58 :
                // Artext.g:1:418: TEXT
                {
                mTEXT(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\46\1\uffff\3\46\3\uffff\2\46\1\64\3\46\6\uffff\2\46\1"+
        "\uffff\1\46\2\uffff\2\46\4\uffff\2\46\4\uffff\12\46\1\117\3\uffff"+
        "\3\46\1\124\6\46\2\uffff\10\46\1\144\5\46\1\uffff\4\46\1\uffff\16"+
        "\46\1\175\1\uffff\3\46\1\u0081\4\46\1\u0087\1\46\1\u008b\15\46\1"+
        "\uffff\3\46\1\uffff\5\46\1\uffff\2\46\1\u00a3\1\uffff\10\46\1\u00ac"+
        "\14\46\1\u00b9\1\46\1\uffff\7\46\1\u00b9\1\uffff\1\u00c2\2\46\1"+
        "\u00c5\6\46\1\u00cd\1\46\1\uffff\10\46\1\uffff\1\u00d7\1\u00d8\1"+
        "\uffff\1\46\1\u00da\1\u00db\1\u00de\3\46\1\uffff\3\46\1\u00e5\4"+
        "\46\1\u00db\2\uffff\1\u00ea\2\uffff\1\46\1\u00ec\1\uffff\1\46\1"+
        "\u00ef\2\46\1\u00f2\1\u00f3\1\uffff\3\46\1\u00f7\1\uffff\1\46\1"+
        "\uffff\2\46\1\uffff\2\46\2\uffff\1\u00fd\2\46\1\uffff\4\46\1\u0104"+
        "\1\uffff\6\46\1\uffff\2\46\1\u010d\1\46\1\u010f\2\46\1\u0112\1\uffff"+
        "\1\u0113\1\uffff\1\u0114\1\46\3\uffff\1\46\1\u0117\1\uffff";
    static final String DFA14_eofS =
        "\u0118\uffff";
    static final String DFA14_minS =
        "\1\11\1\145\1\uffff\1\141\1\157\1\162\3\uffff\1\157\1\144\1\72\1"+
        "\157\1\151\1\157\6\uffff\1\160\1\165\1\uffff\1\162\2\uffff\1\123"+
        "\1\164\1\52\3\uffff\2\145\4\uffff\1\163\1\162\1\164\1\146\1\144"+
        "\2\151\1\162\1\163\1\160\1\55\3\uffff\1\155\2\156\1\55\1\160\1\145"+
        "\1\156\1\141\1\107\1\164\2\uffff\1\161\1\155\1\164\1\166\1\141\1"+
        "\145\1\141\1\145\1\55\1\155\3\164\1\154\1\uffff\1\160\1\164\2\144"+
        "\1\uffff\1\145\1\162\1\151\2\143\1\151\1\162\1\165\1\157\1\145\1"+
        "\151\1\164\1\147\1\165\1\55\1\uffff\1\151\1\157\1\151\1\55\1\141"+
        "\1\145\1\157\1\145\1\55\1\154\1\55\1\141\1\157\2\164\1\103\2\151"+
        "\1\162\1\155\1\143\1\171\1\141\1\154\1\uffff\1\164\1\143\1\144\1"+
        "\uffff\1\156\1\155\1\163\1\157\1\156\1\uffff\1\145\1\162\1\55\1"+
        "\uffff\1\164\1\156\1\151\1\141\1\157\1\142\1\162\1\171\1\55\1\145"+
        "\1\160\2\164\1\151\1\157\1\145\1\143\1\145\1\151\1\154\1\164\1\55"+
        "\1\157\1\uffff\1\151\1\141\1\157\1\154\1\155\1\165\1\145\1\55\1"+
        "\uffff\1\55\2\145\1\55\1\166\1\154\1\144\1\145\1\156\1\164\1\55"+
        "\1\104\1\uffff\1\165\1\157\1\154\1\156\1\103\1\160\1\164\1\144\1"+
        "\uffff\2\55\1\uffff\1\145\3\55\1\164\2\145\1\uffff\1\145\1\160\1"+
        "\156\1\55\1\141\2\157\1\145\1\55\2\uffff\1\55\2\uffff\1\162\1\55"+
        "\1\uffff\1\141\1\55\1\162\1\163\2\55\1\uffff\1\154\1\155\1\156\1"+
        "\55\1\uffff\1\157\1\uffff\1\164\1\171\1\uffff\1\104\1\143\2\uffff"+
        "\1\55\1\160\1\145\1\uffff\1\165\1\151\1\160\1\145\1\55\1\uffff\1"+
        "\157\1\156\1\160\1\157\1\145\1\163\1\uffff\1\156\1\164\1\55\1\156"+
        "\1\55\1\143\1\145\1\55\1\uffff\1\55\1\uffff\1\55\1\156\3\uffff\1"+
        "\164\1\55\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\171\1\uffff\1\145\1\157\1\162\3\uffff\1\162\1\156\1\75"+
        "\1\157\1\165\1\171\6\uffff\1\160\1\165\1\uffff\1\162\2\uffff\1\123"+
        "\1\164\1\57\3\uffff\2\145\4\uffff\1\163\1\162\1\164\1\154\1\144"+
        "\1\151\1\157\1\162\1\163\1\160\1\172\3\uffff\3\156\1\172\1\160\1"+
        "\164\1\156\1\141\1\107\1\164\2\uffff\1\161\1\155\1\164\1\166\1\141"+
        "\1\145\1\141\1\145\1\172\1\155\1\166\2\164\1\154\1\uffff\1\160\1"+
        "\164\2\144\1\uffff\1\145\1\162\1\151\2\143\1\151\1\162\1\165\1\157"+
        "\1\145\1\151\1\164\1\147\1\165\1\172\1\uffff\1\151\1\157\1\151\1"+
        "\172\1\141\1\145\1\157\1\162\1\172\1\154\1\172\1\141\1\157\2\164"+
        "\1\103\2\151\1\162\1\155\1\143\1\171\1\141\1\154\1\uffff\1\164\1"+
        "\143\1\144\1\uffff\1\156\1\155\1\163\1\157\1\156\1\uffff\1\145\1"+
        "\162\1\172\1\uffff\1\164\1\156\1\151\1\141\1\157\1\142\1\162\1\171"+
        "\1\172\1\145\1\160\2\164\1\151\1\157\1\145\1\143\1\145\1\151\1\154"+
        "\1\164\1\172\1\157\1\uffff\1\151\1\141\1\157\1\154\1\155\1\165\1"+
        "\145\1\172\1\uffff\1\172\2\145\1\172\1\166\1\154\1\144\1\145\1\156"+
        "\1\164\1\172\1\104\1\uffff\1\165\1\157\1\154\1\156\1\103\1\160\1"+
        "\164\1\144\1\uffff\2\172\1\uffff\1\145\3\172\1\164\2\145\1\uffff"+
        "\1\145\1\160\1\156\1\172\1\141\2\157\1\145\1\172\2\uffff\1\172\2"+
        "\uffff\1\162\1\172\1\uffff\1\141\1\172\1\162\1\163\2\172\1\uffff"+
        "\1\154\1\155\1\156\1\172\1\uffff\1\157\1\uffff\1\164\1\171\1\uffff"+
        "\1\104\1\143\2\uffff\1\172\1\160\1\145\1\uffff\1\165\1\151\1\160"+
        "\1\145\1\172\1\uffff\1\157\1\156\1\160\1\157\1\145\1\163\1\uffff"+
        "\1\156\1\164\1\172\1\156\1\172\1\143\1\145\1\172\1\uffff\1\172\1"+
        "\uffff\1\172\1\156\3\uffff\1\164\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\1\10\6\uffff\1\21\1\23\1\26\1\27\1"+
        "\30\1\31\2\uffff\1\41\1\uffff\1\44\1\47\3\uffff\1\61\1\62\1\63\2"+
        "\uffff\1\67\1\70\1\71\1\72\13\uffff\1\20\1\25\1\13\12\uffff\1\57"+
        "\1\60\16\uffff\1\22\4\uffff\1\17\17\uffff\1\5\30\uffff\1\4\3\uffff"+
        "\1\40\5\uffff\1\16\3\uffff\1\32\27\uffff\1\52\10\uffff\1\1\14\uffff"+
        "\1\65\10\uffff\1\36\2\uffff\1\56\7\uffff\1\37\11\uffff\1\3\1\24"+
        "\1\uffff\1\42\1\64\2\uffff\1\12\6\uffff\1\66\4\uffff\1\11\1\uffff"+
        "\1\54\2\uffff\1\15\2\uffff\1\51\1\34\3\uffff\1\55\5\uffff\1\35\6"+
        "\uffff\1\46\10\uffff\1\53\1\uffff\1\33\2\uffff\1\50\1\14\1\45\2"+
        "\uffff\1\43";
    static final String DFA14_specialS =
        "\u0118\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\43\1\44\1\uffff\1\43\1\44\22\uffff\1\43\1\uffff\1\37\1\40"+
            "\4\uffff\1\17\1\20\1\45\1\uffff\1\21\1\23\1\27\1\35\12\45\1"+
            "\13\1\2\1\31\1\6\1\32\1\uffff\1\36\5\46\1\30\10\46\1\33\13\46"+
            "\1\22\1\uffff\1\24\1\uffff\1\46\1\uffff\1\34\1\15\1\14\1\3\1"+
            "\46\1\26\2\46\1\12\3\46\1\42\1\4\1\25\1\11\1\46\1\41\1\1\1\16"+
            "\1\5\5\46\1\7\1\uffff\1\10",
            "\1\50\23\uffff\1\47",
            "",
            "\1\51\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "\1\56\2\uffff\1\55",
            "\1\61\10\uffff\1\60\1\57",
            "\1\62\2\uffff\1\63",
            "\1\65",
            "\1\66\13\uffff\1\67",
            "\1\70\11\uffff\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\100\4\uffff\1\77",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\107\5\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112\5\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\120\1\121",
            "\1\122",
            "\1\123",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\125",
            "\1\126\16\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\145",
            "\1\146\1\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0086\14\uffff\1\u0085",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0088",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\u0089\13\46\1\u008a\7\46",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c3",
            "\1\u00c4",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46"+
            "\1\u00cc\16\46",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00d9",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\u00dc\13\46\1\u00dd\7\46",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00eb",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00ed",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\u00ee\6\46",
            "\1\u00f0",
            "\1\u00f1",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010e",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0110",
            "\1\u0111",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0115",
            "",
            "",
            "",
            "\1\u0116",
            "\2\46\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | SL_COMMENT | ML_COMMENT | ANNOTATION | STRING_LITERAL | T_INSTANCE_STATE | T_PORT_KIND | T_IMPLEM | T_OPTIONAL | WHITESPACE | LINEBREAKS | MULTIPLICITY | TEXT );";
        }
    }
 

}