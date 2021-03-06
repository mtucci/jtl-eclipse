// $ANTLR 3.4

	package ASP.resource.asp.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AspLexer extends Lexer {
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
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int COMMENT=4;
    public static final int ELEMENT=5;
    public static final int LINEBREAK=6;
    public static final int QUOTED_40_41=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AspLexer() {} 
    public AspLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AspLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Asp.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:15:7: ( '!=' )
            // Asp.g:15:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:16:7: ( '(' )
            // Asp.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:17:7: ( ')' )
            // Asp.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:18:7: ( ').' )
            // Asp.g:18:9: ').'
            {
            match(")."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:19:7: ( ',' )
            // Asp.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:20:7: ( '.' )
            // Asp.g:20:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:21:7: ( ':-' )
            // Asp.g:21:9: ':-'
            {
            match(":-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:22:7: ( '==' )
            // Asp.g:22:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:23:7: ( 'edge(' )
            // Asp.g:23:9: 'edge('
            {
            match("edge("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:24:7: ( 'edgex(' )
            // Asp.g:24:9: 'edgex('
            {
            match("edgex("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:25:7: ( 'metaedge(' )
            // Asp.g:25:9: 'metaedge('
            {
            match("metaedge("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:26:7: ( 'metanode(' )
            // Asp.g:26:9: 'metanode('
            {
            match("metanode("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:27:7: ( 'metaprop(' )
            // Asp.g:27:9: 'metaprop('
            {
            match("metaprop("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:28:7: ( 'mmt=' )
            // Asp.g:28:9: 'mmt='
            {
            match("mmt="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:29:7: ( 'node(' )
            // Asp.g:29:9: 'node('
            {
            match("node("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:30:7: ( 'nodex(' )
            // Asp.g:30:9: 'nodex('
            {
            match("nodex("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:31:7: ( 'not' )
            // Asp.g:31:9: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:32:7: ( 'prop(' )
            // Asp.g:32:9: 'prop('
            {
            match("prop("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:33:7: ( 'propx(' )
            // Asp.g:33:9: 'propx('
            {
            match("propx("); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:34:7: ( 'relation_edge' )
            // Asp.g:34:9: 'relation_edge'
            {
            match("relation_edge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:35:7: ( 'relation_node' )
            // Asp.g:35:9: 'relation_node'
            {
            match("relation_node"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:36:7: ( 'relation_prop' )
            // Asp.g:36:9: 'relation_prop'
            {
            match("relation_prop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:3614:8: ( ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Asp.g:3615:2: ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Asp.g:3615:2: ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Asp.g:3615:3: '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match('%'); 

            // Asp.g:3615:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Asp.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:3618:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ ) )
            // Asp.g:3619:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ )
            {
            // Asp.g:3619:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ )
            // Asp.g:3619:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+
            {
            // Asp.g:3619:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='!'||LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= ':')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Asp.g:
            	    {
            	    if ( input.LA(1)=='!'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:3621:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Asp.g:3622:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Asp.g:3622:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Asp.g:3622:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Asp.g:3622:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\n') ) {
                    alt3=1;
                }
                else {
                    alt3=2;
                }
            }
            else if ( (LA3_0=='\n') ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Asp.g:3622:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Asp.g:3622:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Asp.g:3622:16: '\\n'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:3625:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Asp.g:3626:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "ELEMENT"
    public final void mELEMENT() throws RecognitionException {
        try {
            int _type = ELEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:3629:8: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ ( '(' ) ) )
            // Asp.g:3630:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ ( '(' ) )
            {
            // Asp.g:3630:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ ( '(' ) )
            // Asp.g:3630:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+ ( '(' )
            {
            // Asp.g:3630:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' | '!' | ':' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='!'||LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= ':')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Asp.g:
            	    {
            	    if ( input.LA(1)=='!'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // Asp.g:3630:48: ( '(' )
            // Asp.g:3630:49: '('
            {
            match('('); 

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELEMENT"

    // $ANTLR start "QUOTED_40_41"
    public final void mQUOTED_40_41() throws RecognitionException {
        try {
            int _type = QUOTED_40_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Asp.g:3633:13: ( ( ( '(' ) (~ ( ')' ) )* ( ')' ) ) )
            // Asp.g:3634:2: ( ( '(' ) (~ ( ')' ) )* ( ')' ) )
            {
            // Asp.g:3634:2: ( ( '(' ) (~ ( ')' ) )* ( ')' ) )
            // Asp.g:3634:3: ( '(' ) (~ ( ')' ) )* ( ')' )
            {
            // Asp.g:3634:3: ( '(' )
            // Asp.g:3634:4: '('
            {
            match('('); 

            }


            // Asp.g:3634:8: (~ ( ')' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\u0000' && LA5_0 <= '(')||(LA5_0 >= '*' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Asp.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '(')||(input.LA(1) >= '*' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // Asp.g:3634:17: ( ')' )
            // Asp.g:3634:18: ')'
            {
            match(')'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_40_41"

    public void mTokens() throws RecognitionException {
        // Asp.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | COMMENT | TEXT | LINEBREAK | WHITESPACE | ELEMENT | QUOTED_40_41 )
        int alt6=28;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // Asp.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // Asp.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // Asp.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // Asp.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // Asp.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // Asp.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // Asp.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // Asp.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // Asp.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // Asp.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // Asp.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // Asp.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // Asp.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // Asp.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // Asp.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // Asp.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // Asp.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // Asp.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // Asp.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // Asp.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // Asp.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // Asp.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // Asp.g:1:142: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 24 :
                // Asp.g:1:150: TEXT
                {
                mTEXT(); 


                }
                break;
            case 25 :
                // Asp.g:1:155: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 26 :
                // Asp.g:1:165: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 27 :
                // Asp.g:1:176: ELEMENT
                {
                mELEMENT(); 


                }
                break;
            case 28 :
                // Asp.g:1:184: QUOTED_40_41
                {
                mQUOTED_40_41(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\22\1\24\1\27\2\uffff\1\22\1\uffff\5\22\1\uffff\1\22\11"+
        "\uffff\1\37\6\22\1\uffff\4\22\1\53\4\22\1\uffff\1\22\1\uffff\2\22"+
        "\1\uffff\4\22\1\uffff\1\22\1\uffff\2\22\2\uffff\3\22\4\uffff\1\22"+
        "\1\uffff\3\22\2\uffff\5\22\3\uffff\1\22\3\uffff\11\22\1\140\1\141"+
        "\1\142\3\uffff";
    static final String DFA6_eofS =
        "\143\uffff";
    static final String DFA6_minS =
        "\1\11\1\41\1\0\1\56\2\uffff\1\41\1\uffff\5\41\1\uffff\1\41\11\uffff"+
        "\7\41\1\uffff\11\41\1\uffff\1\41\1\uffff\2\41\1\uffff\4\41\1\uffff"+
        "\1\41\1\uffff\2\41\2\uffff\3\41\4\uffff\1\41\1\uffff\3\41\2\uffff"+
        "\5\41\3\uffff\1\41\3\uffff\14\41\3\uffff";
    static final String DFA6_maxS =
        "\2\172\1\uffff\1\56\2\uffff\1\172\1\uffff\5\172\1\uffff\1\172\11"+
        "\uffff\7\172\1\uffff\11\172\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\4\172\1\uffff\1\172\1\uffff\2\172\2\uffff\3\172\4\uffff\1\172\1"+
        "\uffff\3\172\2\uffff\5\172\3\uffff\1\172\3\uffff\14\172\3\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\5\1\6\1\uffff\1\10\5\uffff\1\27\1\uffff\1\31\1\32\1\1"+
        "\1\30\1\33\1\2\1\34\1\4\1\3\7\uffff\1\7\11\uffff\1\16\1\uffff\1"+
        "\21\2\uffff\1\11\4\uffff\1\17\1\uffff\1\22\2\uffff\1\11\1\12\3\uffff"+
        "\1\17\1\20\1\22\1\23\1\uffff\1\12\3\uffff\1\20\1\23\5\uffff\1\13"+
        "\1\14\1\15\1\uffff\1\13\1\14\1\15\14\uffff\1\24\1\25\1\26";
    static final String DFA6_specialS =
        "\2\uffff\1\0\140\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\20\1\17\1\uffff\1\20\1\17\22\uffff\1\20\1\1\3\uffff\1\15"+
            "\2\uffff\1\2\1\3\2\uffff\1\4\1\16\1\5\1\uffff\12\16\1\6\2\uffff"+
            "\1\7\3\uffff\32\16\4\uffff\1\16\1\uffff\4\16\1\10\7\16\1\11"+
            "\1\12\1\16\1\13\1\16\1\14\10\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\2\uffff\1\21"+
            "\3\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\0\25",
            "\1\26",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\30\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\3\16\1\31\26\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\32\7\16\1\33\15\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\34\13\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\21\16\1\35\10\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\36\25\16",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\6\16\1\40\23\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\23\16\1\41\6\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\23\16\1\42\6\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\3\16\1\43\17\16\1\44\6\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\45\13\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\13\16\1\46\16\16",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\47\25\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\1\50\31\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\2\uffff\1\51"+
            "\3\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\52\25\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\17\16\1\54\12\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\1\55\31\16",
            "\1\16\6\uffff\1\56\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\27\16\1\57\2\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\60\10\16\1\61\1\16\1\62\12\16",
            "",
            "\1\16\6\uffff\1\63\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\27\16\1\64\2\16",
            "",
            "\1\16\6\uffff\1\65\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\27\16\1\66\2\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\23\16\1\67\6\16",
            "",
            "\1\16\6\uffff\1\71\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\3\16\1\72\26\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\73\13\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\21\16\1\74\10\16",
            "",
            "\1\16\6\uffff\1\76\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\16\6\uffff\1\100\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\10\16\1\101\21\16",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\6\16\1\103\23\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\3\16\1\104\26\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\105\13\16",
            "",
            "",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\110\13\16",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\111\25\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\112\25\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\17\16\1\113\12\16",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\15\16\1\114\14\16",
            "\1\16\6\uffff\1\115\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\116\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\117\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\120\1\uffff\32\16",
            "",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\124\10\16\1\125\1\16\1\126\12\16",
            "",
            "",
            "",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\3\16\1\127\26\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\130\13\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\21\16\1\131\10\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\6\16\1\132\23\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\3\16\1\133\26\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\16\16\1\134\13\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\135\25\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\4\16\1\136\25\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\17\16\1\137\12\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\16\6\uffff\1\23\4\uffff\1\16\2\uffff\13\16\6\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | COMMENT | TEXT | LINEBREAK | WHITESPACE | ELEMENT | QUOTED_40_41 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_2 = input.LA(1);

                        s = -1;
                        if ( ((LA6_2 >= '\u0000' && LA6_2 <= '\uFFFF')) ) {s = 21;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}