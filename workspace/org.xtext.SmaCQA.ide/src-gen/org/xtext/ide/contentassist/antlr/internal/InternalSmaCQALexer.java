package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmaCQALexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_EOLINE=4;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalSmaCQALexer() {;} 
    public InternalSmaCQALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSmaCQALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSmaCQA.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:11:7: ( 'yes' )
            // InternalSmaCQA.g:11:9: 'yes'
            {
            match("yes"); 


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
            // InternalSmaCQA.g:12:7: ( 'no' )
            // InternalSmaCQA.g:12:9: 'no'
            {
            match("no"); 


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
            // InternalSmaCQA.g:13:7: ( 'Number' )
            // InternalSmaCQA.g:13:9: 'Number'
            {
            match("Number"); 


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
            // InternalSmaCQA.g:14:7: ( 'Text' )
            // InternalSmaCQA.g:14:9: 'Text'
            {
            match("Text"); 


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
            // InternalSmaCQA.g:15:7: ( 'TrueOrFalse' )
            // InternalSmaCQA.g:15:9: 'TrueOrFalse'
            {
            match("TrueOrFalse"); 


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
            // InternalSmaCQA.g:16:7: ( 'minutes' )
            // InternalSmaCQA.g:16:9: 'minutes'
            {
            match("minutes"); 


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
            // InternalSmaCQA.g:17:7: ( 'days' )
            // InternalSmaCQA.g:17:9: 'days'
            {
            match("days"); 


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
            // InternalSmaCQA.g:18:7: ( 'weeks' )
            // InternalSmaCQA.g:18:9: 'weeks'
            {
            match("weeks"); 


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
            // InternalSmaCQA.g:19:7: ( 'years' )
            // InternalSmaCQA.g:19:9: 'years'
            {
            match("years"); 


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
            // InternalSmaCQA.g:20:7: ( 'ether' )
            // InternalSmaCQA.g:20:9: 'ether'
            {
            match("ether"); 


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
            // InternalSmaCQA.g:21:7: ( 'wei' )
            // InternalSmaCQA.g:21:9: 'wei'
            {
            match("wei"); 


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
            // InternalSmaCQA.g:22:7: ( 'pwei' )
            // InternalSmaCQA.g:22:9: 'pwei'
            {
            match("pwei"); 


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
            // InternalSmaCQA.g:23:7: ( 'gwei' )
            // InternalSmaCQA.g:23:9: 'gwei'
            {
            match("gwei"); 


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
            // InternalSmaCQA.g:24:7: ( 'szabo' )
            // InternalSmaCQA.g:24:9: 'szabo'
            {
            match("szabo"); 


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
            // InternalSmaCQA.g:25:7: ( 'time' )
            // InternalSmaCQA.g:25:9: 'time'
            {
            match("time"); 


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
            // InternalSmaCQA.g:26:7: ( 'voyage' )
            // InternalSmaCQA.g:26:9: 'voyage'
            {
            match("voyage"); 


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
            // InternalSmaCQA.g:27:7: ( 'favorable' )
            // InternalSmaCQA.g:27:9: 'favorable'
            {
            match("favorable"); 


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
            // InternalSmaCQA.g:28:7: ( 'unfavorable' )
            // InternalSmaCQA.g:28:9: 'unfavorable'
            {
            match("unfavorable"); 


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
            // InternalSmaCQA.g:29:7: ( '================= Value Exchange ======================= \\r\\nThe exchange of value in which' )
            // InternalSmaCQA.g:29:9: '================= Value Exchange ======================= \\r\\nThe exchange of value in which'
            {
            match("================= Value Exchange ======================= \r\nThe exchange of value in which"); 


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
            // InternalSmaCQA.g:30:7: ( 'sends/grants' )
            // InternalSmaCQA.g:30:9: 'sends/grants'
            {
            match("sends/grants"); 


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
            // InternalSmaCQA.g:31:7: ( 'the following object of value' )
            // InternalSmaCQA.g:31:9: 'the following object of value'
            {
            match("the following object of value"); 


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
            // InternalSmaCQA.g:32:7: ( 'has the following associated questions and answers: ' )
            // InternalSmaCQA.g:32:9: 'has the following associated questions and answers: '
            {
            match("has the following associated questions and answers: "); 


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
            // InternalSmaCQA.g:33:7: ( '================= Completion of the question process for this value exchange =================' )
            // InternalSmaCQA.g:33:9: '================= Completion of the question process for this value exchange ================='
            {
            match("================= Completion of the question process for this value exchange ================="); 


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
            // InternalSmaCQA.g:34:7: ( '--------- 1.Data Questions: -----------' )
            // InternalSmaCQA.g:34:9: '--------- 1.Data Questions: -----------'
            {
            match("--------- 1.Data Questions: -----------"); 


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
            // InternalSmaCQA.g:35:7: ( '--------- 2.Legal Questions: -----------' )
            // InternalSmaCQA.g:35:9: '--------- 2.Legal Questions: -----------'
            {
            match("--------- 2.Legal Questions: -----------"); 


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
            // InternalSmaCQA.g:36:7: ( '--------- 3.Economy Questions: -----------' )
            // InternalSmaCQA.g:36:9: '--------- 3.Economy Questions: -----------'
            {
            match("--------- 3.Economy Questions: -----------"); 


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
            // InternalSmaCQA.g:37:7: ( '--------- 4. Shipment Questions:-----------' )
            // InternalSmaCQA.g:37:9: '--------- 4. Shipment Questions:-----------'
            {
            match("--------- 4. Shipment Questions:-----------"); 


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
            // InternalSmaCQA.g:38:7: ( '--------- 5. Insurance shipment Questions:-----------' )
            // InternalSmaCQA.g:38:9: '--------- 5. Insurance shipment Questions:-----------'
            {
            match("--------- 5. Insurance shipment Questions:-----------"); 


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
            // InternalSmaCQA.g:39:7: ( '--------- 6. Alimentary Cargo Questions:-----------' )
            // InternalSmaCQA.g:39:9: '--------- 6. Alimentary Cargo Questions:-----------'
            {
            match("--------- 6. Alimentary Cargo Questions:-----------"); 


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
            // InternalSmaCQA.g:40:7: ( 'answer = ' )
            // InternalSmaCQA.g:40:9: 'answer = '
            {
            match("answer = "); 


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
            // InternalSmaCQA.g:41:7: ( 'Data Declaration: ' )
            // InternalSmaCQA.g:41:9: 'Data Declaration: '
            {
            match("Data Declaration: "); 


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
            // InternalSmaCQA.g:42:7: ( 'End Data Declaration' )
            // InternalSmaCQA.g:42:9: 'End Data Declaration'
            {
            match("End Data Declaration"); 


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
            // InternalSmaCQA.g:43:7: ( 'Data name: ' )
            // InternalSmaCQA.g:43:9: 'Data name: '
            {
            match("Data name: "); 


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
            // InternalSmaCQA.g:44:7: ( 'Value: ' )
            // InternalSmaCQA.g:44:9: 'Value: '
            {
            match("Value: "); 


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
            // InternalSmaCQA.g:45:7: ( 'Data Declaration Token ERC20: ' )
            // InternalSmaCQA.g:45:9: 'Data Declaration Token ERC20: '
            {
            match("Data Declaration Token ERC20: "); 


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
            // InternalSmaCQA.g:46:7: ( 'Token ERC20 name: ' )
            // InternalSmaCQA.g:46:9: 'Token ERC20 name: '
            {
            match("Token ERC20 name: "); 


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
            // InternalSmaCQA.g:47:7: ( 'Token ERC20 Symbol: ' )
            // InternalSmaCQA.g:47:9: 'Token ERC20 Symbol: '
            {
            match("Token ERC20 Symbol: "); 


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
            // InternalSmaCQA.g:48:7: ( 'Token ERC20 decimals: ' )
            // InternalSmaCQA.g:48:9: 'Token ERC20 decimals: '
            {
            match("Token ERC20 decimals: "); 


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
            // InternalSmaCQA.g:49:7: ( 'Token ERC20 supply: ' )
            // InternalSmaCQA.g:49:9: 'Token ERC20 supply: '
            {
            match("Token ERC20 supply: "); 


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
            // InternalSmaCQA.g:50:7: ( '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' )
            // InternalSmaCQA.g:50:9: '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?'
            {
            match("1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?"); 


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
            // InternalSmaCQA.g:51:7: ( '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' )
            // InternalSmaCQA.g:51:9: '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?'
            {
            match("1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?"); 


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
            // InternalSmaCQA.g:52:7: ( 'End Data Declaration Token ERC20' )
            // InternalSmaCQA.g:52:9: 'End Data Declaration Token ERC20'
            {
            match("End Data Declaration Token ERC20"); 


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
            // InternalSmaCQA.g:53:7: ( 'Data Declaration Token ERC223: ' )
            // InternalSmaCQA.g:53:9: 'Data Declaration Token ERC223: '
            {
            match("Data Declaration Token ERC223: "); 


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
            // InternalSmaCQA.g:54:7: ( 'Token ERC223 name: ' )
            // InternalSmaCQA.g:54:9: 'Token ERC223 name: '
            {
            match("Token ERC223 name: "); 


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
            // InternalSmaCQA.g:55:7: ( 'Token ERC223 Symbol: ' )
            // InternalSmaCQA.g:55:9: 'Token ERC223 Symbol: '
            {
            match("Token ERC223 Symbol: "); 


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
            // InternalSmaCQA.g:56:7: ( 'Token ERC223 decimals: ' )
            // InternalSmaCQA.g:56:9: 'Token ERC223 decimals: '
            {
            match("Token ERC223 decimals: "); 


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
            // InternalSmaCQA.g:57:7: ( 'Token ERC223 supply: ' )
            // InternalSmaCQA.g:57:9: 'Token ERC223 supply: '
            {
            match("Token ERC223 supply: "); 


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
            // InternalSmaCQA.g:58:7: ( 'End Data Declaration Token ERC223' )
            // InternalSmaCQA.g:58:9: 'End Data Declaration Token ERC223'
            {
            match("End Data Declaration Token ERC223"); 


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
            // InternalSmaCQA.g:59:7: ( 'Data Declaration Non Fungible Token ERC721: ' )
            // InternalSmaCQA.g:59:9: 'Data Declaration Non Fungible Token ERC721: '
            {
            match("Data Declaration Non Fungible Token ERC721: "); 


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
            // InternalSmaCQA.g:60:7: ( 'Token ERC721 name: ' )
            // InternalSmaCQA.g:60:9: 'Token ERC721 name: '
            {
            match("Token ERC721 name: "); 


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
            // InternalSmaCQA.g:61:7: ( 'Token ERC721 Symbol: ' )
            // InternalSmaCQA.g:61:9: 'Token ERC721 Symbol: '
            {
            match("Token ERC721 Symbol: "); 


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
            // InternalSmaCQA.g:62:7: ( '1.5.1 If it\\'s possible to mint more than one NFT at a time?' )
            // InternalSmaCQA.g:62:9: '1.5.1 If it\\'s possible to mint more than one NFT at a time?'
            {
            match("1.5.1 If it's possible to mint more than one NFT at a time?"); 


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
            // InternalSmaCQA.g:63:7: ( '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?' )
            // InternalSmaCQA.g:63:9: '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?'
            {
            match("1.5.2 Is it possible to remove/disable the token from circulation (burn token)?"); 


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
            // InternalSmaCQA.g:64:7: ( '1.5.3 What is the price of this token?' )
            // InternalSmaCQA.g:64:9: '1.5.3 What is the price of this token?'
            {
            match("1.5.3 What is the price of this token?"); 


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
            // InternalSmaCQA.g:65:7: ( '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?' )
            // InternalSmaCQA.g:65:9: '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?'
            {
            match("1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?"); 


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
            // InternalSmaCQA.g:66:7: ( 'End Data Declaration Token ERC721' )
            // InternalSmaCQA.g:66:9: 'End Data Declaration Token ERC721'
            {
            match("End Data Declaration Token ERC721"); 


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
            // InternalSmaCQA.g:67:7: ( '1.5.5 Which data or properties are requiered for the NFT information?' )
            // InternalSmaCQA.g:67:9: '1.5.5 Which data or properties are requiered for the NFT information?'
            {
            match("1.5.5 Which data or properties are requiered for the NFT information?"); 


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
            // InternalSmaCQA.g:68:7: ( '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' )
            // InternalSmaCQA.g:68:9: '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?'
            {
            match("1.5.6 If it's possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?"); 


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
            // InternalSmaCQA.g:69:7: ( 'total supply = ' )
            // InternalSmaCQA.g:69:9: 'total supply = '
            {
            match("total supply = "); 


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
            // InternalSmaCQA.g:70:7: ( 'unitTime = ' )
            // InternalSmaCQA.g:70:9: 'unitTime = '
            {
            match("unitTime = "); 


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
            // InternalSmaCQA.g:71:7: ( 'responsible = ' )
            // InternalSmaCQA.g:71:9: 'responsible = '
            {
            match("responsible = "); 


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
            // InternalSmaCQA.g:72:7: ( 'cost = ' )
            // InternalSmaCQA.g:72:9: 'cost = '
            {
            match("cost = "); 


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
            // InternalSmaCQA.g:73:7: ( 'unitCoin=' )
            // InternalSmaCQA.g:73:9: 'unitCoin='
            {
            match("unitCoin="); 


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
            // InternalSmaCQA.g:74:7: ( 'internationalAnswer = ' )
            // InternalSmaCQA.g:74:9: 'internationalAnswer = '
            {
            match("internationalAnswer = "); 


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
            // InternalSmaCQA.g:75:7: ( 'sanitaryAnswer = ' )
            // InternalSmaCQA.g:75:9: 'sanitaryAnswer = '
            {
            match("sanitaryAnswer = "); 


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
            // InternalSmaCQA.g:76:7: ( 'customsAnswer = ' )
            // InternalSmaCQA.g:76:9: 'customsAnswer = '
            {
            match("customsAnswer = "); 


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
            // InternalSmaCQA.g:77:7: ( 'taxAnswer = ' )
            // InternalSmaCQA.g:77:9: 'taxAnswer = '
            {
            match("taxAnswer = "); 


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
            // InternalSmaCQA.g:78:7: ( 'restrictions = ' )
            // InternalSmaCQA.g:78:9: 'restrictions = '
            {
            match("restrictions = "); 


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
            // InternalSmaCQA.g:79:7: ( 'address = ' )
            // InternalSmaCQA.g:79:9: 'address = '
            {
            match("address = "); 


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
            // InternalSmaCQA.g:80:7: ( 'tracking number = ' )
            // InternalSmaCQA.g:80:9: 'tracking number = '
            {
            match("tracking number = "); 


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
            // InternalSmaCQA.g:81:7: ( 'especial measures needed = ' )
            // InternalSmaCQA.g:81:9: 'especial measures needed = '
            {
            match("especial measures needed = "); 


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
            // InternalSmaCQA.g:82:7: ( 'cm x ' )
            // InternalSmaCQA.g:82:9: 'cm x '
            {
            match("cm x "); 


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
            // InternalSmaCQA.g:83:7: ( 'cm' )
            // InternalSmaCQA.g:83:9: 'cm'
            {
            match("cm"); 


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
            // InternalSmaCQA.g:84:7: ( 'Origin Port = ' )
            // InternalSmaCQA.g:84:9: 'Origin Port = '
            {
            match("Origin Port = "); 


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
            // InternalSmaCQA.g:85:7: ( 'Destination Port = ' )
            // InternalSmaCQA.g:85:9: 'Destination Port = '
            {
            match("Destination Port = "); 


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
            // InternalSmaCQA.g:86:7: ( 'type of voyage = ' )
            // InternalSmaCQA.g:86:9: 'type of voyage = '
            {
            match("type of voyage = "); 


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
            // InternalSmaCQA.g:87:7: ( 'quantity = ' )
            // InternalSmaCQA.g:87:9: 'quantity = '
            {
            match("quantity = "); 


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
            // InternalSmaCQA.g:88:7: ( 'name = ' )
            // InternalSmaCQA.g:88:9: 'name = '
            {
            match("name = "); 


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
            // InternalSmaCQA.g:89:7: ( 'deadline = ' )
            // InternalSmaCQA.g:89:9: 'deadline = '
            {
            match("deadline = "); 


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
            // InternalSmaCQA.g:90:7: ( 'quanity = ' )
            // InternalSmaCQA.g:90:9: 'quanity = '
            {
            match("quanity = "); 


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
            // InternalSmaCQA.g:91:7: ( 'unitCoin' )
            // InternalSmaCQA.g:91:9: 'unitCoin'
            {
            match("unitCoin"); 


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
            // InternalSmaCQA.g:92:7: ( 'result of inspection = ' )
            // InternalSmaCQA.g:92:9: 'result of inspection = '
            {
            match("result of inspection = "); 


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
            // InternalSmaCQA.g:93:7: ( '1.5 Is the object of value a right that can be reflected as active or inactive?' )
            // InternalSmaCQA.g:93:9: '1.5 Is the object of value a right that can be reflected as active or inactive?'
            {
            match("1.5 Is the object of value a right that can be reflected as active or inactive?"); 


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
            // InternalSmaCQA.g:94:7: ( '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' )
            // InternalSmaCQA.g:94:9: '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?'
            {
            match("1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?"); 


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
            // InternalSmaCQA.g:95:7: ( '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' )
            // InternalSmaCQA.g:95:9: '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?'
            {
            match("1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?"); 


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
            // InternalSmaCQA.g:96:7: ( '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' )
            // InternalSmaCQA.g:96:9: '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)'
            {
            match("1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)"); 


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
            // InternalSmaCQA.g:97:7: ( '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' )
            // InternalSmaCQA.g:97:9: '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)'
            {
            match("1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)"); 


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
            // InternalSmaCQA.g:98:7: ( '1.3 Can the value exchange be repeated over time?' )
            // InternalSmaCQA.g:98:9: '1.3 Can the value exchange be repeated over time?'
            {
            match("1.3 Can the value exchange be repeated over time?"); 


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
            // InternalSmaCQA.g:99:8: ( '1.4 Are the same conditions always maintained when exchanging value?' )
            // InternalSmaCQA.g:99:10: '1.4 Are the same conditions always maintained when exchanging value?'
            {
            match("1.4 Are the same conditions always maintained when exchanging value?"); 


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
            // InternalSmaCQA.g:100:8: ( '2.1 What would be the minimum legal age if necessary in this exchange?' )
            // InternalSmaCQA.g:100:10: '2.1 What would be the minimum legal age if necessary in this exchange?'
            {
            match("2.1  What would be the minimum legal age if necessary in this exchange?"); 


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
            // InternalSmaCQA.g:101:8: ( '2.2 What is the name of the tax?' )
            // InternalSmaCQA.g:101:10: '2.2 What is the name of the tax?'
            {
            match("2.2 What is the name of the tax?"); 


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
            // InternalSmaCQA.g:102:8: ( '2.2.1 Who collects the tax?' )
            // InternalSmaCQA.g:102:10: '2.2.1 Who collects the tax?'
            {
            match("2.2.1 Who collects the tax?"); 


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
            // InternalSmaCQA.g:103:8: ( '2.3 Is another legal document complementary to this SmartContract necessary?' )
            // InternalSmaCQA.g:103:10: '2.3 Is another legal document complementary to this SmartContract necessary?'
            {
            match("2.3 Is another legal document complementary to this SmartContract necessary?"); 


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
            // InternalSmaCQA.g:104:8: ( '2.4 Who is responsible for ensuring compliance with regulations?' )
            // InternalSmaCQA.g:104:10: '2.4 Who is responsible for ensuring compliance with regulations?'
            {
            match("2.4 Who is responsible for ensuring compliance with regulations?"); 


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
            // InternalSmaCQA.g:105:8: ( '3.1 Which would be the minimum amount if necessary in this exchange?' )
            // InternalSmaCQA.g:105:10: '3.1 Which would be the minimum amount if necessary in this exchange?'
            {
            match("3.1 Which would be the minimum amount if necessary in this exchange?"); 


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
            // InternalSmaCQA.g:106:8: ( '3.2 Who is responsible for the transportation cost?' )
            // InternalSmaCQA.g:106:10: '3.2 Who is responsible for the transportation cost?'
            {
            match("3.2 Who is responsible for the transportation cost?"); 


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
            // InternalSmaCQA.g:107:8: ( '3.3 What is the freight rate?' )
            // InternalSmaCQA.g:107:10: '3.3 What is the freight rate?'
            {
            match("3.3 What is the freight rate?"); 


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
            // InternalSmaCQA.g:108:8: ( '3.4 What is the loading fee (on the ship)?' )
            // InternalSmaCQA.g:108:10: '3.4 What is the loading fee (on the ship)?'
            {
            match("3.4 What is the loading fee (on the ship)?"); 


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
            // InternalSmaCQA.g:109:8: ( '3.5 What is the unloading fee?' )
            // InternalSmaCQA.g:109:10: '3.5 What is the unloading fee?'
            {
            match("3.5 What is the unloading fee?"); 


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
            // InternalSmaCQA.g:110:8: ( '3.6 What is the transport rate?' )
            // InternalSmaCQA.g:110:10: '3.6 What is the transport rate?'
            {
            match("3.6 What is the transport rate?"); 


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
            // InternalSmaCQA.g:111:8: ( '4.1 Is it an international shipment?' )
            // InternalSmaCQA.g:111:10: '4.1 Is it an international shipment?'
            {
            match("4.1 Is it an international shipment?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:112:8: ( '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' )
            // InternalSmaCQA.g:112:10: '4.2 Is the product subject to any sanitary control upon arrival at the destination country?'
            {
            match("4.2 Is the product subject to any sanitary control upon arrival at the destination country?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:113:8: ( '4.3 Does the shipment have to go through customs?' )
            // InternalSmaCQA.g:113:10: '4.3 Does the shipment have to go through customs?'
            {
            match("4.3 Does the shipment have to go through customs?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:114:8: ( '4.4 Does it have to pay any import tax to the destination country?' )
            // InternalSmaCQA.g:114:10: '4.4 Does it have to pay any import tax to the destination country?'
            {
            match("4.4 Does it have to pay any import tax to the destination country?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:115:8: ( '4.4.1 How much does it have to pay in taxes?' )
            // InternalSmaCQA.g:115:10: '4.4.1 How much does it have to pay in taxes?'
            {
            match("4.4.1 How much does it have to pay in taxes?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:116:8: ( '4.5 Are there geographical restrictions for the exchange?' )
            // InternalSmaCQA.g:116:10: '4.5 Are there geographical restrictions for the exchange?'
            {
            match("4.5 Are there geographical restrictions for the exchange?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:117:8: ( '4.5.1 What are the geographical restrictions?' )
            // InternalSmaCQA.g:117:10: '4.5.1 What are the geographical restrictions?'
            {
            match("4.5.1 What are the geographical restrictions?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:118:8: ( '4.6 What is the pickup address for the cargo?' )
            // InternalSmaCQA.g:118:10: '4.6 What is the pickup address for the cargo?'
            {
            match("4.6 What is the pickup address for the cargo?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:119:8: ( '4.7 What is the delivery address?' )
            // InternalSmaCQA.g:119:10: '4.7 What is the delivery address?'
            {
            match("4.7 What is the delivery address?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:120:8: ( '4.8 What is the shipment tracking number?' )
            // InternalSmaCQA.g:120:10: '4.8 What is the shipment tracking number?'
            {
            match("4.8 What is the shipment tracking number?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:121:8: ( '4.9 Does the physical good represent a dangerous load or have special transportation needs?' )
            // InternalSmaCQA.g:121:10: '4.9 Does the physical good represent a dangerous load or have special transportation needs?'
            {
            match("4.9 Does the physical good represent a dangerous load or have special transportation needs?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:122:8: ( '4.9.1 What special measures are needed for its proper transport?' )
            // InternalSmaCQA.g:122:10: '4.9.1 What special measures are needed for its proper transport?'
            {
            match("4.9.1 What special measures are needed for its proper transport?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:123:8: ( '4.10 Is it a perishable product?' )
            // InternalSmaCQA.g:123:10: '4.10 Is it a perishable product?'
            {
            match("4.10 Is it a perishable product?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:124:8: ( '4.10.1 What is its expiration date?' )
            // InternalSmaCQA.g:124:10: '4.10.1 What is its expiration date?'
            {
            match("4.10.1 What is its expiration date?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:125:8: ( '4.11 What is the type of cargo?' )
            // InternalSmaCQA.g:125:10: '4.11 What is the type of cargo?'
            {
            match("4.11 What is the type of cargo?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:126:8: ( '4.12 How much does the cargo weight (kg)?' )
            // InternalSmaCQA.g:126:10: '4.12 How much does the cargo weight (kg)?'
            {
            match("4.12 How much does the cargo weight (kg)?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:127:8: ( '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' )
            // InternalSmaCQA.g:127:10: '4.13 What are the dimensions of the cargo (length x width x depth in cm)?'
            {
            match("4.13 What are the dimensions of the cargo (length x width x depth in cm)?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:128:8: ( '4.14 Is the shipment made by sea route?' )
            // InternalSmaCQA.g:128:10: '4.14 Is the shipment made by sea route?'
            {
            match("4.14 Is the shipment made by sea route?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:129:8: ( '4.14.1 What is the name of the origin port?' )
            // InternalSmaCQA.g:129:10: '4.14.1 What is the name of the origin port?'
            {
            match("4.14.1 What is the name of the origin port?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:130:8: ( '4.14.2 What is the name of the destination port?' )
            // InternalSmaCQA.g:130:10: '4.14.2 What is the name of the destination port?'
            {
            match("4.14.2 What is the name of the destination port?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:131:8: ( '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' )
            // InternalSmaCQA.g:131:10: '4.14.3 In case of need, does it leave the port agent the power to make key decisions?'
            {
            match("4.14.3 In case of need, does it leave the port agent the power to make key decisions?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:132:8: ( '4.14.4 Is it a voyage charter or time charter party?' )
            // InternalSmaCQA.g:132:10: '4.14.4 Is it a voyage charter or time charter party?'
            {
            match("4.14.4 Is it a voyage charter or time charter party?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:133:8: ( '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' )
            // InternalSmaCQA.g:133:10: '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)'
            {
            match("4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:134:8: ( '4.15 What is the means of transport?' )
            // InternalSmaCQA.g:134:10: '4.15 What is the means of transport?'
            {
            match("4.15 What is the means of transport?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:135:8: ( '4.16 What is the name of the transport company?' )
            // InternalSmaCQA.g:135:10: '4.16 What is the name of the transport company?'
            {
            match("4.16 What is the name of the transport company?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:136:8: ( '4.17 What is the deadline for delivery?' )
            // InternalSmaCQA.g:136:10: '4.17 What is the deadline for delivery?'
            {
            match("4.17 What is the deadline for delivery?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:137:8: ( '4.18 Through what means will updates and monitoring data be received?' )
            // InternalSmaCQA.g:137:10: '4.18 Through what means will updates and monitoring data be received?'
            {
            match("4.18 Through what means will updates and monitoring data be received?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:138:8: ( '4.19 In case of dispute, is it considered to appoint an external mediator?' )
            // InternalSmaCQA.g:138:10: '4.19 In case of dispute, is it considered to appoint an external mediator?'
            {
            match("4.19 In case of dispute, is it considered to appoint an external mediator?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:139:8: ( '4.19.1 What is the name of the individual or company mediating external to the two parties?' )
            // InternalSmaCQA.g:139:10: '4.19.1 What is the name of the individual or company mediating external to the two parties?'
            {
            match("4.19.1 What is the name of the individual or company mediating external to the two parties?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:140:8: ( '5.1 Is the cargo insured?' )
            // InternalSmaCQA.g:140:10: '5.1 Is the cargo insured?'
            {
            match("5.1 Is the cargo insured?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:141:8: ( '5.1.1 What is the cost of insurance (per unit asset)?' )
            // InternalSmaCQA.g:141:10: '5.1.1 What is the cost of insurance (per unit asset)?'
            {
            match("5.1.1 What is the cost of insurance (per unit asset)?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:142:8: ( '5.1.2 What cases are covered by the insurance (insurance clauses)?' )
            // InternalSmaCQA.g:142:10: '5.1.2 What cases are covered by the insurance (insurance clauses)?'
            {
            match("5.1.2 What cases are covered by the insurance (insurance clauses)?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:143:8: ( '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' )
            // InternalSmaCQA.g:143:10: '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?'
            {
            match("5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:144:8: ( '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' )
            // InternalSmaCQA.g:144:10: '5.2 Is the possibility of returns or cancellations in the exchange foreseen?'
            {
            match("5.2 Is the possibility of returns or cancellations in the exchange foreseen?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:145:8: ( '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' )
            // InternalSmaCQA.g:145:10: '5.2.1 How would returns or cancellations be managed according to the terms of the contract?'
            {
            match("5.2.1 How would returns or cancellations be managed according to the terms of the contract?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:146:8: ( '5.3 What is the penalty in case of neglect or abandonment of duties?' )
            // InternalSmaCQA.g:146:10: '5.3 What is the penalty in case of neglect or abandonment of duties?'
            {
            match("5.3 What is the penalty in case of neglect or abandonment of duties?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:147:8: ( '6.1 What is the agreed price per unit of product ?' )
            // InternalSmaCQA.g:147:10: '6.1 What is the agreed price per unit of product ?'
            {
            match("6.1 What is the agreed price per unit of product ?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:148:8: ( '6.2 What is the expected quality of the product?' )
            // InternalSmaCQA.g:148:10: '6.2 What is the expected quality of the product?'
            {
            match("6.2 What is the expected quality of the product?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:149:8: ( '6.2.1 How will the quality of the product be determined?' )
            // InternalSmaCQA.g:149:10: '6.2.1 How will the quality of the product be determined?'
            {
            match("6.2.1 How will the quality of the product be determined?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:150:8: ( '6.2.2 What happens if the delivered product does not meet the agreed quality?' )
            // InternalSmaCQA.g:150:10: '6.2.2 What happens if the delivered product does not meet the agreed quality?'
            {
            match("6.2.2 What happens if the delivered product does not meet the agreed quality?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:151:8: ( '6.3 Does the merchandise have any international seal or distinction?' )
            // InternalSmaCQA.g:151:10: '6.3 Does the merchandise have any international seal or distinction?'
            {
            match("6.3 Does the merchandise have any international seal or distinction?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:152:8: ( '6.3.1 What international seal or distinction does the cargo have?' )
            // InternalSmaCQA.g:152:10: '6.3.1 What international seal or distinction does the cargo have?'
            {
            match("6.3.1 What international seal or distinction does the cargo have?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:153:8: ( '6.4 Has any health check or inspection been carried out at the production or storage site?' )
            // InternalSmaCQA.g:153:10: '6.4 Has any health check or inspection been carried out at the production or storage site?'
            {
            match("6.4 Has any health check or inspection been carried out at the production or storage site?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:154:8: ( '6.4.1 What was the result of the inspection?' )
            // InternalSmaCQA.g:154:10: '6.4.1 What was the result of the inspection?'
            {
            match("6.4.1 What was the result of the inspection?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:155:8: ( '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' )
            // InternalSmaCQA.g:155:10: '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?'
            {
            match("6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "RULE_EOLINE"
    public final void mRULE_EOLINE() throws RecognitionException {
        try {
            int _type = RULE_EOLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:16116:13: ( '/n' )
            // InternalSmaCQA.g:16116:15: '/n'
            {
            match("/n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:16118:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSmaCQA.g:16118:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSmaCQA.g:16118:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmaCQA.g:16118:11: '^'
                    {
                    match('^'); 

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

            // InternalSmaCQA.g:16118:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmaCQA.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:16120:10: ( ( '0' .. '9' )+ )
            // InternalSmaCQA.g:16120:12: ( '0' .. '9' )+
            {
            // InternalSmaCQA.g:16120:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmaCQA.g:16120:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:16122:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSmaCQA.g:16122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSmaCQA.g:16122:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmaCQA.g:16122:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSmaCQA.g:16122:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSmaCQA.g:16122:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmaCQA.g:16122:28: ~ ( ( '\\\\' | '\"' ) )
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
                    break;
                case 2 :
                    // InternalSmaCQA.g:16122:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSmaCQA.g:16122:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSmaCQA.g:16122:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSmaCQA.g:16122:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:16124:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSmaCQA.g:16124:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSmaCQA.g:16124:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmaCQA.g:16124:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalSmaCQA.g:16126:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSmaCQA.g:16126:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSmaCQA.g:16126:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmaCQA.g:16126:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalSmaCQA.g:16126:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmaCQA.g:16126:41: ( '\\r' )? '\\n'
                    {
                    // InternalSmaCQA.g:16126:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSmaCQA.g:16126:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSmaCQA.g:16128:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSmaCQA.g:16128:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSmaCQA.g:16128:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmaCQA.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalSmaCQA.g:16130:16: ( . )
            // InternalSmaCQA.g:16130:18: .
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
        // InternalSmaCQA.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | RULE_EOLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=153;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSmaCQA.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSmaCQA.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSmaCQA.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSmaCQA.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSmaCQA.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSmaCQA.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSmaCQA.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSmaCQA.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSmaCQA.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSmaCQA.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSmaCQA.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSmaCQA.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSmaCQA.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSmaCQA.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSmaCQA.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSmaCQA.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalSmaCQA.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalSmaCQA.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalSmaCQA.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalSmaCQA.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalSmaCQA.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalSmaCQA.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalSmaCQA.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalSmaCQA.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalSmaCQA.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalSmaCQA.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalSmaCQA.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalSmaCQA.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalSmaCQA.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalSmaCQA.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalSmaCQA.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalSmaCQA.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalSmaCQA.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalSmaCQA.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalSmaCQA.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalSmaCQA.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalSmaCQA.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalSmaCQA.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalSmaCQA.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalSmaCQA.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalSmaCQA.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalSmaCQA.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalSmaCQA.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalSmaCQA.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalSmaCQA.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalSmaCQA.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalSmaCQA.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalSmaCQA.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalSmaCQA.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalSmaCQA.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalSmaCQA.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalSmaCQA.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalSmaCQA.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalSmaCQA.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalSmaCQA.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalSmaCQA.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalSmaCQA.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalSmaCQA.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalSmaCQA.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalSmaCQA.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalSmaCQA.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalSmaCQA.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalSmaCQA.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalSmaCQA.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalSmaCQA.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalSmaCQA.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalSmaCQA.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalSmaCQA.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalSmaCQA.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalSmaCQA.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // InternalSmaCQA.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // InternalSmaCQA.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // InternalSmaCQA.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // InternalSmaCQA.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // InternalSmaCQA.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // InternalSmaCQA.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // InternalSmaCQA.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // InternalSmaCQA.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // InternalSmaCQA.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // InternalSmaCQA.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // InternalSmaCQA.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // InternalSmaCQA.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // InternalSmaCQA.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // InternalSmaCQA.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // InternalSmaCQA.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // InternalSmaCQA.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // InternalSmaCQA.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // InternalSmaCQA.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // InternalSmaCQA.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // InternalSmaCQA.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // InternalSmaCQA.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // InternalSmaCQA.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // InternalSmaCQA.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // InternalSmaCQA.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // InternalSmaCQA.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // InternalSmaCQA.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // InternalSmaCQA.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // InternalSmaCQA.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // InternalSmaCQA.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // InternalSmaCQA.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // InternalSmaCQA.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // InternalSmaCQA.g:1:629: T__113
                {
                mT__113(); 

                }
                break;
            case 103 :
                // InternalSmaCQA.g:1:636: T__114
                {
                mT__114(); 

                }
                break;
            case 104 :
                // InternalSmaCQA.g:1:643: T__115
                {
                mT__115(); 

                }
                break;
            case 105 :
                // InternalSmaCQA.g:1:650: T__116
                {
                mT__116(); 

                }
                break;
            case 106 :
                // InternalSmaCQA.g:1:657: T__117
                {
                mT__117(); 

                }
                break;
            case 107 :
                // InternalSmaCQA.g:1:664: T__118
                {
                mT__118(); 

                }
                break;
            case 108 :
                // InternalSmaCQA.g:1:671: T__119
                {
                mT__119(); 

                }
                break;
            case 109 :
                // InternalSmaCQA.g:1:678: T__120
                {
                mT__120(); 

                }
                break;
            case 110 :
                // InternalSmaCQA.g:1:685: T__121
                {
                mT__121(); 

                }
                break;
            case 111 :
                // InternalSmaCQA.g:1:692: T__122
                {
                mT__122(); 

                }
                break;
            case 112 :
                // InternalSmaCQA.g:1:699: T__123
                {
                mT__123(); 

                }
                break;
            case 113 :
                // InternalSmaCQA.g:1:706: T__124
                {
                mT__124(); 

                }
                break;
            case 114 :
                // InternalSmaCQA.g:1:713: T__125
                {
                mT__125(); 

                }
                break;
            case 115 :
                // InternalSmaCQA.g:1:720: T__126
                {
                mT__126(); 

                }
                break;
            case 116 :
                // InternalSmaCQA.g:1:727: T__127
                {
                mT__127(); 

                }
                break;
            case 117 :
                // InternalSmaCQA.g:1:734: T__128
                {
                mT__128(); 

                }
                break;
            case 118 :
                // InternalSmaCQA.g:1:741: T__129
                {
                mT__129(); 

                }
                break;
            case 119 :
                // InternalSmaCQA.g:1:748: T__130
                {
                mT__130(); 

                }
                break;
            case 120 :
                // InternalSmaCQA.g:1:755: T__131
                {
                mT__131(); 

                }
                break;
            case 121 :
                // InternalSmaCQA.g:1:762: T__132
                {
                mT__132(); 

                }
                break;
            case 122 :
                // InternalSmaCQA.g:1:769: T__133
                {
                mT__133(); 

                }
                break;
            case 123 :
                // InternalSmaCQA.g:1:776: T__134
                {
                mT__134(); 

                }
                break;
            case 124 :
                // InternalSmaCQA.g:1:783: T__135
                {
                mT__135(); 

                }
                break;
            case 125 :
                // InternalSmaCQA.g:1:790: T__136
                {
                mT__136(); 

                }
                break;
            case 126 :
                // InternalSmaCQA.g:1:797: T__137
                {
                mT__137(); 

                }
                break;
            case 127 :
                // InternalSmaCQA.g:1:804: T__138
                {
                mT__138(); 

                }
                break;
            case 128 :
                // InternalSmaCQA.g:1:811: T__139
                {
                mT__139(); 

                }
                break;
            case 129 :
                // InternalSmaCQA.g:1:818: T__140
                {
                mT__140(); 

                }
                break;
            case 130 :
                // InternalSmaCQA.g:1:825: T__141
                {
                mT__141(); 

                }
                break;
            case 131 :
                // InternalSmaCQA.g:1:832: T__142
                {
                mT__142(); 

                }
                break;
            case 132 :
                // InternalSmaCQA.g:1:839: T__143
                {
                mT__143(); 

                }
                break;
            case 133 :
                // InternalSmaCQA.g:1:846: T__144
                {
                mT__144(); 

                }
                break;
            case 134 :
                // InternalSmaCQA.g:1:853: T__145
                {
                mT__145(); 

                }
                break;
            case 135 :
                // InternalSmaCQA.g:1:860: T__146
                {
                mT__146(); 

                }
                break;
            case 136 :
                // InternalSmaCQA.g:1:867: T__147
                {
                mT__147(); 

                }
                break;
            case 137 :
                // InternalSmaCQA.g:1:874: T__148
                {
                mT__148(); 

                }
                break;
            case 138 :
                // InternalSmaCQA.g:1:881: T__149
                {
                mT__149(); 

                }
                break;
            case 139 :
                // InternalSmaCQA.g:1:888: T__150
                {
                mT__150(); 

                }
                break;
            case 140 :
                // InternalSmaCQA.g:1:895: T__151
                {
                mT__151(); 

                }
                break;
            case 141 :
                // InternalSmaCQA.g:1:902: T__152
                {
                mT__152(); 

                }
                break;
            case 142 :
                // InternalSmaCQA.g:1:909: T__153
                {
                mT__153(); 

                }
                break;
            case 143 :
                // InternalSmaCQA.g:1:916: T__154
                {
                mT__154(); 

                }
                break;
            case 144 :
                // InternalSmaCQA.g:1:923: T__155
                {
                mT__155(); 

                }
                break;
            case 145 :
                // InternalSmaCQA.g:1:930: T__156
                {
                mT__156(); 

                }
                break;
            case 146 :
                // InternalSmaCQA.g:1:937: RULE_EOLINE
                {
                mRULE_EOLINE(); 

                }
                break;
            case 147 :
                // InternalSmaCQA.g:1:949: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 148 :
                // InternalSmaCQA.g:1:957: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 149 :
                // InternalSmaCQA.g:1:966: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 150 :
                // InternalSmaCQA.g:1:978: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 151 :
                // InternalSmaCQA.g:1:994: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 152 :
                // InternalSmaCQA.g:1:1010: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 153 :
                // InternalSmaCQA.g:1:1018: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\17\53\1\51\1\53\1\51\4\53\1\120\5\53\5\120\2\51\2\uffff\2\51\2\uffff\1\53\1\uffff\1\144\31\53\1\uffff\1\53\1\uffff\6\53\2\uffff\3\53\1\u0092\3\53\12\uffff\1\u00b1\1\53\1\uffff\11\53\1\u00bc\21\53\1\uffff\1\53\1\uffff\6\53\5\uffff\3\53\2\uffff\3\53\34\uffff\3\53\1\u0101\3\53\1\u0105\2\53\1\uffff\2\53\1\u010a\1\u010b\3\53\1\u010f\1\uffff\10\53\3\uffff\4\53\1\uffff\1\53\2\uffff\10\53\35\uffff\1\u013c\1\uffff\1\53\1\uffff\3\53\1\uffff\1\53\1\u0142\1\u0143\1\53\2\uffff\1\u0145\2\53\1\uffff\3\53\1\uffff\5\53\2\uffff\2\53\1\uffff\1\53\1\uffff\1\53\7\uffff\3\53\1\uffff\5\53\14\uffff\1\u0169\1\53\1\uffff\2\53\2\uffff\1\53\2\uffff\1\53\1\uffff\2\53\1\u0172\4\53\2\uffff\2\53\2\uffff\1\53\6\uffff\10\53\5\uffff\1\53\1\uffff\1\u018d\5\53\1\uffff\4\53\3\uffff\1\53\1\uffff\1\53\4\uffff\2\53\1\uffff\2\53\1\uffff\2\53\2\uffff\1\53\2\uffff\10\53\1\u01b2\4\uffff\1\53\5\uffff\5\53\1\uffff\1\53\3\uffff\2\53\1\uffff\1\u01c4\1\53\6\uffff\1\53\3\uffff\4\53\1\uffff\1\53\2\uffff\1\53\2\uffff\1\53\3\uffff\1\53\3\uffff\4\53\1\u01e7\3\uffff\1\53\1\u01ec\10\uffff\1\53\3\uffff\4\53\4\uffff\1\53\10\uffff\3\53\6\uffff\1\53\6\uffff\2\53\6\uffff\1\53\6\uffff\1\53\6\uffff\1\53\5\uffff\1\53\6\uffff\1\53\6\uffff\1\53\6\uffff\1\53\1\uffff\1\u023d\60\uffff";
    static final String DFA12_eofS =
        "\u0268\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\141\1\165\1\145\1\151\1\141\1\145\1\163\2\167\2\141\1\157\1\141\1\156\1\75\1\141\1\55\1\144\1\141\1\156\1\141\1\56\1\145\1\155\1\156\1\162\1\165\5\56\1\52\1\101\2\uffff\2\0\2\uffff\1\141\1\uffff\1\60\2\155\1\170\1\165\1\153\1\156\1\171\1\141\1\145\1\150\1\160\2\145\1\141\2\156\1\155\1\145\1\164\1\170\1\141\1\160\1\171\1\166\1\146\1\75\1\163\1\55\1\163\1\144\1\164\1\163\1\144\1\154\1\61\1\uffff\3\163\1\40\1\164\1\151\1\141\5\61\5\uffff\1\60\1\162\1\uffff\1\145\1\142\1\164\2\145\1\165\1\163\1\144\1\153\1\60\2\145\2\151\1\142\1\144\1\151\1\145\1\40\1\141\1\101\1\143\1\145\1\141\1\157\1\141\1\164\1\75\1\40\1\55\1\167\1\162\1\141\1\164\1\40\1\165\1\40\4\uffff\1\160\2\164\2\uffff\1\145\1\147\1\156\1\uffff\1\40\10\uffff\1\40\2\uffff\2\40\3\uffff\3\40\2\uffff\3\40\2\uffff\1\163\1\40\1\145\1\60\1\117\1\156\1\164\1\60\1\154\1\163\1\uffff\1\162\1\143\2\60\1\157\1\163\1\164\1\60\1\uffff\1\154\1\156\1\153\1\40\1\147\1\162\1\166\1\103\1\75\1\uffff\1\55\2\145\1\40\1\151\1\104\1\145\1\61\1\111\1\157\1\162\1\154\1\40\1\157\1\162\2\151\3\uffff\1\40\3\uffff\1\40\4\uffff\1\40\7\uffff\1\61\3\uffff\1\61\4\uffff\1\60\1\uffff\1\162\1\uffff\1\162\1\40\1\145\1\uffff\1\151\2\60\1\151\2\uffff\1\60\1\57\1\141\1\uffff\1\40\1\163\1\151\1\uffff\1\145\1\141\1\157\1\151\1\157\1\75\1\55\1\162\1\163\1\104\1\156\1\141\1\72\2\40\4\uffff\1\146\1\156\1\151\1\164\1\uffff\1\155\2\156\1\151\1\164\3\uffff\1\61\10\uffff\1\60\1\106\1\105\1\163\1\156\2\uffff\1\141\2\uffff\1\162\1\uffff\1\167\1\156\1\60\1\142\1\162\1\155\1\151\1\75\1\55\1\40\1\163\1\145\1\uffff\1\141\1\164\1\uffff\2\111\1\uffff\1\40\1\163\1\143\1\40\1\163\1\141\1\40\1\164\1\171\3\uffff\1\40\1\uffff\1\141\1\122\1\60\1\145\1\154\1\171\1\145\1\147\1\uffff\1\154\1\141\1\145\1\156\1\75\1\55\1\uffff\1\40\1\143\1\164\1\141\1\146\1\163\1\164\1\151\1\164\1\uffff\1\101\1\164\1\uffff\1\171\1\40\2\uffff\1\154\1\103\1\uffff\2\40\1\101\1\162\1\40\1\145\1\142\1\40\1\60\1\75\1\55\1\uffff\1\154\1\151\1\40\2\uffff\1\40\1\150\1\142\1\151\1\156\1\151\1\40\1\uffff\1\163\1\62\2\uffff\1\156\1\40\1\uffff\1\60\1\154\3\uffff\1\75\1\40\1\141\1\157\1\104\1\151\1\145\1\154\1\157\1\163\1\157\1\uffff\1\145\1\60\1\62\1\163\2\uffff\1\145\1\75\1\61\1\162\1\156\1\145\1\164\1\40\1\145\1\156\1\167\1\156\1\60\1\40\1\63\1\61\1\167\1\60\1\75\6\uffff\1\141\1\40\1\143\1\40\1\157\1\40\1\163\1\145\1\141\1\uffff\1\123\2\40\1\145\1\uffff\1\75\1\164\1\uffff\1\154\1\160\1\142\1\uffff\1\40\1\162\1\154\4\uffff\2\123\1\162\1\75\1\151\1\141\1\157\1\152\1\uffff\1\40\1\101\6\uffff\1\40\1\75\1\157\1\162\1\163\1\145\1\uffff\1\156\1\uffff\1\75\1\156\1\141\1\163\1\143\1\163\1\75\1\40\1\164\1\151\1\164\1\167\1\40\1\uffff\1\116\1\151\1\142\1\40\1\145\1\103\1\157\1\uffff\1\157\1\154\1\157\1\162\2\uffff\1\153\1\156\1\145\1\146\1\40\1\145\3\40\1\uffff\1\156\1\124\1\uffff\1\164\1\166\1\40\2\157\1\141\1\105\1\153\1\40\1\154\1\122\1\145\1\162\1\165\1\103\1\156\2\145\1\62\1\40\1\155\1\40\1\60\1\105\1\157\1\156\2\uffff\1\122\1\166\2\uffff\1\103\1\145\1\62\1\40\1\60\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\157\1\165\1\162\1\151\2\145\1\164\2\167\1\172\1\171\1\157\1\141\1\156\1\75\1\141\1\55\1\156\1\145\1\156\1\141\1\56\1\145\1\165\1\156\1\162\1\165\5\56\1\156\1\172\2\uffff\2\uffff\2\uffff\1\163\1\uffff\1\172\2\155\1\170\1\165\1\153\1\156\1\171\1\141\1\151\1\150\1\160\2\145\1\141\2\156\1\155\1\145\1\164\1\170\1\141\1\160\1\171\1\166\1\151\1\75\1\163\1\55\1\163\1\144\1\164\1\163\1\144\1\154\1\65\1\uffff\3\163\1\172\1\164\1\151\1\141\1\64\1\66\1\71\1\63\1\65\5\uffff\1\172\1\162\1\uffff\1\145\1\142\1\164\2\145\1\165\1\163\1\144\1\153\1\172\2\145\2\151\1\142\1\144\1\151\1\145\1\40\1\141\1\101\1\143\1\145\1\141\1\157\1\141\1\164\1\75\1\40\1\55\1\167\1\162\1\141\1\164\1\40\1\165\1\56\4\uffff\1\165\2\164\2\uffff\1\145\1\147\1\156\1\uffff\1\56\10\uffff\1\71\2\uffff\2\56\3\uffff\3\56\2\uffff\3\56\2\uffff\1\163\1\40\1\145\1\172\1\117\1\156\1\164\1\172\1\154\1\163\1\uffff\1\162\1\143\2\172\1\157\1\163\1\164\1\172\1\uffff\1\154\1\156\1\153\1\40\1\147\1\162\1\166\1\124\1\75\1\uffff\1\55\2\145\1\40\1\151\1\104\1\145\1\66\1\111\1\157\1\162\1\154\1\40\1\157\1\162\1\151\1\164\3\uffff\1\56\3\uffff\1\56\4\uffff\1\56\7\uffff\1\63\3\uffff\1\62\4\uffff\1\172\1\uffff\1\162\1\uffff\1\162\1\40\1\145\1\uffff\1\151\2\172\1\151\2\uffff\1\172\1\57\1\141\1\uffff\1\40\1\163\1\151\1\uffff\1\145\1\141\1\157\1\151\1\157\1\75\1\55\1\162\1\163\2\156\1\141\1\72\2\40\4\uffff\1\163\1\156\1\151\1\164\1\uffff\1\155\2\156\1\151\1\164\3\uffff\1\64\10\uffff\1\172\1\106\1\105\1\163\1\156\2\uffff\1\141\2\uffff\1\162\1\uffff\1\167\1\156\1\172\1\142\1\162\1\155\1\151\1\75\1\55\1\40\1\163\1\145\1\uffff\1\141\1\164\1\uffff\2\111\1\uffff\1\40\1\163\1\143\1\40\1\163\1\141\1\40\1\164\1\171\3\uffff\1\56\1\uffff\1\141\1\122\1\172\1\145\1\154\1\171\1\145\1\147\1\uffff\1\154\1\141\1\145\1\156\1\75\1\55\1\uffff\1\40\1\143\1\164\1\141\2\163\1\164\1\151\1\164\1\uffff\1\101\1\164\1\uffff\1\171\1\40\2\uffff\1\154\1\103\1\uffff\2\40\1\101\1\162\1\40\1\145\1\142\1\40\1\172\1\75\1\55\1\uffff\1\154\1\151\1\40\2\uffff\1\40\1\150\1\142\1\151\1\156\1\151\1\40\1\uffff\1\163\1\67\2\uffff\1\156\1\40\1\uffff\1\172\1\154\3\uffff\1\75\1\40\1\141\1\157\1\104\1\151\1\145\1\154\1\157\1\163\1\157\1\uffff\1\145\2\62\1\163\2\uffff\1\145\1\75\1\66\1\162\1\156\1\145\1\164\1\40\1\145\1\156\1\167\1\156\1\172\1\40\1\63\1\61\1\167\1\172\1\75\6\uffff\1\141\1\40\1\143\1\40\1\157\1\40\1\163\1\145\1\141\1\uffff\1\163\2\40\1\145\1\uffff\1\75\1\164\1\uffff\1\154\1\160\1\142\1\uffff\1\40\1\162\1\154\4\uffff\1\163\1\156\1\162\1\75\1\151\1\141\1\157\1\152\1\uffff\1\40\1\101\6\uffff\1\40\1\75\1\157\1\162\1\163\1\145\1\uffff\1\156\1\uffff\1\75\1\156\1\141\1\163\1\143\1\163\1\75\1\72\1\164\1\151\1\164\1\167\1\40\1\uffff\1\124\1\151\1\142\1\40\1\145\1\126\1\157\1\uffff\1\157\1\154\1\157\1\162\2\uffff\1\153\1\156\1\145\1\146\1\40\1\145\3\40\1\uffff\1\156\1\124\1\uffff\1\164\1\166\1\40\2\157\1\141\1\105\1\153\1\40\1\154\1\122\1\145\1\162\1\165\1\103\1\156\2\145\1\62\1\40\1\155\1\40\1\62\1\105\1\157\1\164\2\uffff\1\122\1\166\2\uffff\1\103\1\145\1\67\1\57\1\62\5\uffff";
    static final String DFA12_acceptS =
        "\44\uffff\1\u0093\1\u0094\2\uffff\1\u0098\1\u0099\1\uffff\1\u0093\44\uffff\1\u0094\14\uffff\1\u0092\1\u0096\1\u0097\1\u0095\1\u0098\2\uffff\1\2\45\uffff\1\126\1\127\1\130\1\131\3\uffff\1\110\1\111\3\uffff\1\132\1\uffff\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\uffff\1\146\1\147\2\uffff\1\154\1\155\1\156\3\uffff\1\u0088\1\u0089\3\uffff\1\u0091\1\1\12\uffff\1\13\10\uffff\1\25\11\uffff\1\26\21\uffff\1\133\1\134\1\145\1\uffff\1\163\1\164\1\165\1\uffff\1\174\1\175\1\176\1\177\1\uffff\1\150\1\151\1\152\1\153\1\157\1\160\1\u0082\1\uffff\1\u0086\1\u0087\1\u008a\1\uffff\1\u008d\1\u008e\1\u008f\1\u0090\1\uffff\1\116\1\uffff\1\4\3\uffff\1\7\4\uffff\1\14\1\15\3\uffff\1\17\3\uffff\1\114\17\uffff\1\66\1\67\1\71\1\72\4\uffff\1\76\5\uffff\1\161\1\162\1\166\1\uffff\1\u0080\1\u0081\1\u0083\1\u0084\1\u0085\1\u008b\1\u008c\1\11\5\uffff\1\10\1\12\1\uffff\1\16\1\24\1\uffff\1\73\14\uffff\1\41\2\uffff\1\42\2\uffff\1\123\11\uffff\1\167\1\170\1\171\1\uffff\1\3\10\uffff\1\20\6\uffff\1\36\11\uffff\1\122\2\uffff\1\112\2\uffff\1\172\1\173\2\uffff\1\6\13\uffff\1\105\3\uffff\1\50\1\64\7\uffff\1\120\2\uffff\1\117\1\107\2\uffff\1\106\2\uffff\1\74\1\77\1\121\13\uffff\1\115\4\uffff\1\103\1\21\23\uffff\1\30\1\31\1\32\1\33\1\34\1\35\11\uffff\1\5\4\uffff\1\22\2\uffff\1\113\3\uffff\1\75\3\uffff\1\44\1\45\1\46\1\47\10\uffff\1\104\2\uffff\1\54\1\55\1\56\1\57\1\62\1\63\6\uffff\1\102\1\uffff\1\101\15\uffff\1\37\7\uffff\1\61\4\uffff\1\23\1\27\11\uffff\1\100\2\uffff\1\40\32\uffff\1\43\1\53\2\uffff\1\124\1\125\5\uffff\1\70\1\51\1\65\1\52\1\60";
    static final String DFA12_specialS =
        "\1\0\45\uffff\1\1\1\2\u0240\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\46\4\51\1\47\5\51\1\22\1\51\1\42\1\45\1\27\1\35\1\36\1\37\1\40\1\41\3\45\3\51\1\20\3\51\3\44\1\24\1\25\10\44\1\3\1\33\4\44\1\4\1\44\1\26\4\44\3\51\1\43\1\44\1\51\1\23\1\44\1\31\1\6\1\10\1\16\1\12\1\21\1\32\3\44\1\5\1\2\1\44\1\11\1\34\1\30\1\13\1\14\1\17\1\15\1\7\1\44\1\1\1\44\uff85\51",
            "\1\52",
            "\1\55\15\uffff\1\54",
            "\1\56",
            "\1\57\11\uffff\1\61\2\uffff\1\60",
            "\1\62",
            "\1\63\3\uffff\1\64",
            "\1\65",
            "\1\67\1\66",
            "\1\70",
            "\1\71",
            "\1\74\3\uffff\1\73\24\uffff\1\72",
            "\1\100\6\uffff\1\76\1\75\5\uffff\1\77\2\uffff\1\101\6\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\112\11\uffff\1\111",
            "\1\113\3\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121",
            "\1\124\1\uffff\1\122\5\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\136\4\uffff\1\137\76\uffff\1\135",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\140",
            "\0\140",
            "",
            "",
            "\1\143\21\uffff\1\142",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\3\uffff\1\156",
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
            "\1\175",
            "\1\176\2\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\1\u008b\1\u008c\1\u008d\1\u0089",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\17\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\1\u0097\1\u0098\1\u0099",
            "\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f",
            "\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8",
            "\1\u00a9\1\u00aa\1\u00ab",
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d8\15\uffff\1\u00d7",
            "",
            "",
            "",
            "",
            "\1\u00d9\3\uffff\1\u00da\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1\15\uffff\1\u00e2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e3\17\uffff\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed",
            "",
            "",
            "\1\u00ee\15\uffff\1\u00ef",
            "\1\u00f0\15\uffff\1\u00f1",
            "",
            "",
            "",
            "\1\u00f2\15\uffff\1\u00f3",
            "\1\u00f4\15\uffff\1\u00f5",
            "\1\u00f6\15\uffff\1\u00f7",
            "",
            "",
            "\1\u00f8\15\uffff\1\u00f9",
            "\1\u00fa\15\uffff\1\u00fb",
            "\1\u00fc\15\uffff\1\u00fd",
            "",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0118\20\uffff\1\u0117",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u0130\12\uffff\1\u012f",
            "",
            "",
            "",
            "\1\u0131\15\uffff\1\u0132",
            "",
            "",
            "",
            "\1\u0133\15\uffff\1\u0134",
            "",
            "",
            "",
            "",
            "\1\u0135\15\uffff\1\u0136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0137\1\u0138\1\u0139",
            "",
            "",
            "",
            "\1\u013a\1\u013b",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0144",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154\51\uffff\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "",
            "",
            "\1\u015c\14\uffff\1\u015b",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "",
            "\1\u0165\1\u0166\1\u0167\1\u0168",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "",
            "",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "",
            "",
            "\1\u0189\15\uffff\1\u018a",
            "",
            "\1\u018b",
            "\1\u018c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019e\14\uffff\1\u019d",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\53\3\uffff\1\u01b1\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "",
            "\1\u01bf",
            "\1\u01c0\4\uffff\1\u01c1",
            "",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01c5",
            "",
            "",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\1\u01d2\1\uffff\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8\1\u01d9\1\u01da\1\u01db\1\u01dc\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01ed",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "",
            "\1\u01f8\20\uffff\1\u01f9\11\uffff\1\u01f7\4\uffff\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "",
            "\1\u01fe",
            "\1\u01ff",
            "",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "",
            "",
            "",
            "",
            "\1\u0207\20\uffff\1\u0208\11\uffff\1\u0206\4\uffff\1\u0209",
            "\1\u020b\32\uffff\1\u020a",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "",
            "\1\u0212",
            "\1\u0213",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "",
            "\1\u021a",
            "",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0223\31\uffff\1\u0222",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "",
            "\1\u022a\5\uffff\1\u0229",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u0230\22\uffff\1\u022f",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023e",
            "\1\u023f",
            "",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258\1\uffff\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025d\5\uffff\1\u025c",
            "",
            "",
            "\1\u025e",
            "\1\u025f",
            "",
            "",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262\4\uffff\1\u0263",
            "\1\u0264\16\uffff\1\u0265",
            "\1\u0266\1\uffff\1\u0267",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | RULE_EOLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='y') ) {s = 1;}

                        else if ( (LA12_0=='n') ) {s = 2;}

                        else if ( (LA12_0=='N') ) {s = 3;}

                        else if ( (LA12_0=='T') ) {s = 4;}

                        else if ( (LA12_0=='m') ) {s = 5;}

                        else if ( (LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='w') ) {s = 7;}

                        else if ( (LA12_0=='e') ) {s = 8;}

                        else if ( (LA12_0=='p') ) {s = 9;}

                        else if ( (LA12_0=='g') ) {s = 10;}

                        else if ( (LA12_0=='s') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='v') ) {s = 13;}

                        else if ( (LA12_0=='f') ) {s = 14;}

                        else if ( (LA12_0=='u') ) {s = 15;}

                        else if ( (LA12_0=='=') ) {s = 16;}

                        else if ( (LA12_0=='h') ) {s = 17;}

                        else if ( (LA12_0=='-') ) {s = 18;}

                        else if ( (LA12_0=='a') ) {s = 19;}

                        else if ( (LA12_0=='D') ) {s = 20;}

                        else if ( (LA12_0=='E') ) {s = 21;}

                        else if ( (LA12_0=='V') ) {s = 22;}

                        else if ( (LA12_0=='1') ) {s = 23;}

                        else if ( (LA12_0=='r') ) {s = 24;}

                        else if ( (LA12_0=='c') ) {s = 25;}

                        else if ( (LA12_0=='i') ) {s = 26;}

                        else if ( (LA12_0=='O') ) {s = 27;}

                        else if ( (LA12_0=='q') ) {s = 28;}

                        else if ( (LA12_0=='2') ) {s = 29;}

                        else if ( (LA12_0=='3') ) {s = 30;}

                        else if ( (LA12_0=='4') ) {s = 31;}

                        else if ( (LA12_0=='5') ) {s = 32;}

                        else if ( (LA12_0=='6') ) {s = 33;}

                        else if ( (LA12_0=='/') ) {s = 34;}

                        else if ( (LA12_0=='^') ) {s = 35;}

                        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='F' && LA12_0<='M')||(LA12_0>='P' && LA12_0<='S')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='j' && LA12_0<='l')||LA12_0=='o'||LA12_0=='x'||LA12_0=='z') ) {s = 36;}

                        else if ( (LA12_0=='0'||(LA12_0>='7' && LA12_0<='9')) ) {s = 37;}

                        else if ( (LA12_0=='\"') ) {s = 38;}

                        else if ( (LA12_0=='\'') ) {s = 39;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 40;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFF')) ) {s = 96;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFF')) ) {s = 96;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}