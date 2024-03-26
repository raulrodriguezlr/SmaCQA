package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SmaCQAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmaCQAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EOLINE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'================= Value Exchange ======================= \\r\\nThe exchange of value in which'", "'sends/grants'", "'the following object of value'", "'has the following associated questions and answers: '", "'--------- 1.Data Questions: -----------'", "'--------- 2.Legal Questions: -----------'", "'--------- 3.Economy Questions: -----------'", "'--------- 4. Shipment Questions:-----------'", "'--------- 5. Insurance shipment Questions:-----------'", "'--------- 6. Alimentary Cargo Questions:-----------'", "'================= Completion of the question process for this value exchange ================='", "'1.5 Is the object of value a right that can be reflected as active or inactive?'", "'answer = '", "'yes'", "'no'", "'1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?'", "'1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?'", "'Data Declaration: '", "'End Data Declaration'", "'Data name: '", "'Value: '", "'Data Declaration Token ERC20: '", "'Token ERC20 name: '", "'Token ERC20 Symbol: '", "'Token ERC20 decimals: '", "'Token ERC20 supply: '", "'1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?'", "'1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?'", "'End Data Declaration Token ERC20'", "'Data Declaration Token ERC223: '", "'Token ERC223 name: '", "'Token ERC223 Symbol: '", "'Token ERC223 decimals: '", "'Token ERC223 supply: '", "'End Data Declaration Token ERC223'", "'Data Declaration Non Fungible Token ERC721: '", "'Token ERC721 name: '", "'Token ERC721 Symbol: '", "'1.5.1 If it\\'s possible to mint more than one NFT at a time?'", "'1.5.2 Is it possible to remove/disable the token from circulation (burn token)?'", "'1.5.3 What is the price of this token?'", "'1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?'", "'1.5.5 Which data or properties are requiered for the NFT information?'", "'1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?'", "'total supply = '", "'End Data Declaration Token ERC721'", "'1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)'", "'unitTime = '", "'1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)'", "'1.3 Can the value exchange be repeated over time?'", "'1.4 Are the same conditions always maintained when exchanging value?'", "'2.1  What would be the minimum legal age if necessary in this exchange?'", "'2.2 What is the name of the tax?'", "'2.2.1 Who collects the tax?'", "'2.3 Is another legal document complementary to this SmartContract necessary?'", "'2.4 Who is responsible for ensuring compliance with regulations?'", "'3.1 Which would be the minimum amount if necessary in this exchange?'", "'3.2 Who is responsible for the transportation cost?'", "'responsible = '", "'3.3 What is the freight rate?'", "'cost = '", "'unitCoin='", "'3.4 What is the loading fee (on the ship)?'", "'3.5 What is the unloading fee?'", "'3.6 What is the transport rate?'", "'4.1 Is it an international shipment?'", "'internationalAnswer = '", "'4.2 Is the product subject to any sanitary control upon arrival at the destination country?'", "'sanitaryAnswer = '", "'4.3 Does the shipment have to go through customs?'", "'customsAnswer = '", "'4.4 Does it have to pay any import tax to the destination country?'", "'taxAnswer = '", "'4.4.1 How much does it have to pay in taxes?'", "'4.5 Are there geographical restrictions for the exchange?'", "'4.5.1 What are the geographical restrictions?'", "'restrictions = '", "'4.6 What is the pickup address for the cargo?'", "'address = '", "'4.7 What is the delivery address?'", "'4.8 What is the shipment tracking number?'", "'tracking number = '", "'4.9 Does the physical good represent a dangerous load or have special transportation needs?'", "'4.9.1 What special measures are needed for its proper transport?'", "'especial measures needed = '", "'4.10 Is it a perishable product?'", "'4.10.1 What is its expiration date?'", "'4.11 What is the type of cargo?'", "'4.12 How much does the cargo weight (kg)?'", "'4.13 What are the dimensions of the cargo (length x width x depth in cm)?'", "'cm x '", "'cm'", "'4.14 Is the shipment made by sea route?'", "'4.14.1 What is the name of the origin port?'", "'Origin Port = '", "'4.14.2 What is the name of the destination port?'", "'Destination Port = '", "'4.14.3 In case of need, does it leave the port agent the power to make key decisions?'", "'4.14.4 Is it a voyage charter or time charter party?'", "'type of voyage = '", "'4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)'", "'quantity = '", "'4.15 What is the means of transport?'", "'4.16 What is the name of the transport company?'", "'name = '", "'4.17 What is the deadline for delivery?'", "'deadline = '", "'4.18 Through what means will updates and monitoring data be received?'", "'4.19 In case of dispute, is it considered to appoint an external mediator?'", "'4.19.1 What is the name of the individual or company mediating external to the two parties?'", "'5.1 Is the cargo insured?'", "'5.1.1 What is the cost of insurance (per unit asset)?'", "'5.1.2 What cases are covered by the insurance (insurance clauses)?'", "'5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?'", "'5.2 Is the possibility of returns or cancellations in the exchange foreseen?'", "'5.2.1 How would returns or cancellations be managed according to the terms of the contract?'", "'5.3 What is the penalty in case of neglect or abandonment of duties?'", "'6.1 What is the agreed price per unit of product ?'", "'quanity = '", "'unitCoin'", "'6.2 What is the expected quality of the product?'", "'6.2.1 How will the quality of the product be determined?'", "'6.2.2 What happens if the delivered product does not meet the agreed quality?'", "'6.3 Does the merchandise have any international seal or distinction?'", "'6.3.1 What international seal or distinction does the cargo have?'", "'6.4 Has any health check or inspection been carried out at the production or storage site?'", "'6.4.1 What was the result of the inspection?'", "'result of inspection = '", "'6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?'", "'Number'", "'Text'", "'TrueOrFalse'", "'minutes'", "'days'", "'weeks'", "'years'", "'ether'", "'wei'", "'pwei'", "'gwei'", "'szabo'", "'time'", "'voyage'", "'favorable'", "'unfavorable'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_EOLINE=5;
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
    public static final int RULE_ID=4;
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


        public InternalSmaCQAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmaCQAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmaCQAParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmaCQA.g"; }



     	private SmaCQAGrammarAccess grammarAccess;

        public InternalSmaCQAParser(TokenStream input, SmaCQAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SmaCQAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSmaCQA.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSmaCQA.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSmaCQA.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSmaCQA.g:72:1: ruleModel returns [EObject current=null] : ( (lv_valueExchanges_0_0= ruleValueExchange ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_valueExchanges_0_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:78:2: ( ( (lv_valueExchanges_0_0= ruleValueExchange ) )+ )
            // InternalSmaCQA.g:79:2: ( (lv_valueExchanges_0_0= ruleValueExchange ) )+
            {
            // InternalSmaCQA.g:79:2: ( (lv_valueExchanges_0_0= ruleValueExchange ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmaCQA.g:80:3: (lv_valueExchanges_0_0= ruleValueExchange )
            	    {
            	    // InternalSmaCQA.g:80:3: (lv_valueExchanges_0_0= ruleValueExchange )
            	    // InternalSmaCQA.g:81:4: lv_valueExchanges_0_0= ruleValueExchange
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getValueExchangesValueExchangeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_valueExchanges_0_0=ruleValueExchange();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"valueExchanges",
            	    					lv_valueExchanges_0_0,
            	    					"org.xtext.SmaCQA.ValueExchange");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleValueExchange"
    // InternalSmaCQA.g:101:1: entryRuleValueExchange returns [EObject current=null] : iv_ruleValueExchange= ruleValueExchange EOF ;
    public final EObject entryRuleValueExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExchange = null;


        try {
            // InternalSmaCQA.g:101:54: (iv_ruleValueExchange= ruleValueExchange EOF )
            // InternalSmaCQA.g:102:2: iv_ruleValueExchange= ruleValueExchange EOF
            {
             newCompositeNode(grammarAccess.getValueExchangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueExchange=ruleValueExchange();

            state._fsp--;

             current =iv_ruleValueExchange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueExchange"


    // $ANTLR start "ruleValueExchange"
    // InternalSmaCQA.g:108:1: ruleValueExchange returns [EObject current=null] : (otherlv_0= '================= Value Exchange ======================= \\r\\nThe exchange of value in which' ( (lv_actorSend_1_0= RULE_ID ) ) otherlv_2= 'sends/grants' ( (lv_actorReceipt_3_0= RULE_ID ) ) otherlv_4= 'the following object of value' ( (lv_valueObject_5_0= RULE_ID ) ) otherlv_6= 'has the following associated questions and answers: ' (this_EOLINE_7= RULE_EOLINE )? (otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) ) )? (otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) ) )? (otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) ) )? (otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) ) )? (otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) ) )? (otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) ) )? otherlv_26= '================= Completion of the question process for this value exchange =================' ) ;
    public final EObject ruleValueExchange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_actorSend_1_0=null;
        Token otherlv_2=null;
        Token lv_actorReceipt_3_0=null;
        Token otherlv_4=null;
        Token lv_valueObject_5_0=null;
        Token otherlv_6=null;
        Token this_EOLINE_7=null;
        Token otherlv_8=null;
        Token this_EOLINE_9=null;
        Token otherlv_11=null;
        Token this_EOLINE_12=null;
        Token otherlv_14=null;
        Token this_EOLINE_15=null;
        Token otherlv_17=null;
        Token this_EOLINE_18=null;
        Token otherlv_20=null;
        Token this_EOLINE_21=null;
        Token otherlv_23=null;
        Token this_EOLINE_24=null;
        Token otherlv_26=null;
        EObject lv_dataQuestion_10_0 = null;

        EObject lv_legalQuestion_13_0 = null;

        EObject lv_economyQuestion_16_0 = null;

        EObject lv_shipmentQuestion_19_0 = null;

        EObject lv_insuranceQuestion_22_0 = null;

        EObject lv_alimentaryQuestion_25_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:114:2: ( (otherlv_0= '================= Value Exchange ======================= \\r\\nThe exchange of value in which' ( (lv_actorSend_1_0= RULE_ID ) ) otherlv_2= 'sends/grants' ( (lv_actorReceipt_3_0= RULE_ID ) ) otherlv_4= 'the following object of value' ( (lv_valueObject_5_0= RULE_ID ) ) otherlv_6= 'has the following associated questions and answers: ' (this_EOLINE_7= RULE_EOLINE )? (otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) ) )? (otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) ) )? (otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) ) )? (otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) ) )? (otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) ) )? (otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) ) )? otherlv_26= '================= Completion of the question process for this value exchange =================' ) )
            // InternalSmaCQA.g:115:2: (otherlv_0= '================= Value Exchange ======================= \\r\\nThe exchange of value in which' ( (lv_actorSend_1_0= RULE_ID ) ) otherlv_2= 'sends/grants' ( (lv_actorReceipt_3_0= RULE_ID ) ) otherlv_4= 'the following object of value' ( (lv_valueObject_5_0= RULE_ID ) ) otherlv_6= 'has the following associated questions and answers: ' (this_EOLINE_7= RULE_EOLINE )? (otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) ) )? (otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) ) )? (otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) ) )? (otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) ) )? (otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) ) )? (otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) ) )? otherlv_26= '================= Completion of the question process for this value exchange =================' )
            {
            // InternalSmaCQA.g:115:2: (otherlv_0= '================= Value Exchange ======================= \\r\\nThe exchange of value in which' ( (lv_actorSend_1_0= RULE_ID ) ) otherlv_2= 'sends/grants' ( (lv_actorReceipt_3_0= RULE_ID ) ) otherlv_4= 'the following object of value' ( (lv_valueObject_5_0= RULE_ID ) ) otherlv_6= 'has the following associated questions and answers: ' (this_EOLINE_7= RULE_EOLINE )? (otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) ) )? (otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) ) )? (otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) ) )? (otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) ) )? (otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) ) )? (otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) ) )? otherlv_26= '================= Completion of the question process for this value exchange =================' )
            // InternalSmaCQA.g:116:3: otherlv_0= '================= Value Exchange ======================= \\r\\nThe exchange of value in which' ( (lv_actorSend_1_0= RULE_ID ) ) otherlv_2= 'sends/grants' ( (lv_actorReceipt_3_0= RULE_ID ) ) otherlv_4= 'the following object of value' ( (lv_valueObject_5_0= RULE_ID ) ) otherlv_6= 'has the following associated questions and answers: ' (this_EOLINE_7= RULE_EOLINE )? (otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) ) )? (otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) ) )? (otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) ) )? (otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) ) )? (otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) ) )? (otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) ) )? otherlv_26= '================= Completion of the question process for this value exchange ================='
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getValueExchangeAccess().getValueExchangeTheExchangeOfValueInWhichKeyword_0());
            		
            // InternalSmaCQA.g:120:3: ( (lv_actorSend_1_0= RULE_ID ) )
            // InternalSmaCQA.g:121:4: (lv_actorSend_1_0= RULE_ID )
            {
            // InternalSmaCQA.g:121:4: (lv_actorSend_1_0= RULE_ID )
            // InternalSmaCQA.g:122:5: lv_actorSend_1_0= RULE_ID
            {
            lv_actorSend_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_actorSend_1_0, grammarAccess.getValueExchangeAccess().getActorSendIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueExchangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actorSend",
            						lv_actorSend_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getValueExchangeAccess().getSendsGrantsKeyword_2());
            		
            // InternalSmaCQA.g:142:3: ( (lv_actorReceipt_3_0= RULE_ID ) )
            // InternalSmaCQA.g:143:4: (lv_actorReceipt_3_0= RULE_ID )
            {
            // InternalSmaCQA.g:143:4: (lv_actorReceipt_3_0= RULE_ID )
            // InternalSmaCQA.g:144:5: lv_actorReceipt_3_0= RULE_ID
            {
            lv_actorReceipt_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_actorReceipt_3_0, grammarAccess.getValueExchangeAccess().getActorReceiptIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueExchangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actorReceipt",
            						lv_actorReceipt_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getValueExchangeAccess().getTheFollowingObjectOfValueKeyword_4());
            		
            // InternalSmaCQA.g:164:3: ( (lv_valueObject_5_0= RULE_ID ) )
            // InternalSmaCQA.g:165:4: (lv_valueObject_5_0= RULE_ID )
            {
            // InternalSmaCQA.g:165:4: (lv_valueObject_5_0= RULE_ID )
            // InternalSmaCQA.g:166:5: lv_valueObject_5_0= RULE_ID
            {
            lv_valueObject_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_valueObject_5_0, grammarAccess.getValueExchangeAccess().getValueObjectIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueExchangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valueObject",
            						lv_valueObject_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getValueExchangeAccess().getHasTheFollowingAssociatedQuestionsAndAnswersKeyword_6());
            		
            // InternalSmaCQA.g:186:3: (this_EOLINE_7= RULE_EOLINE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_EOLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmaCQA.g:187:4: this_EOLINE_7= RULE_EOLINE
                    {
                    this_EOLINE_7=(Token)match(input,RULE_EOLINE,FOLLOW_9); 

                    				newLeafNode(this_EOLINE_7, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_7());
                    			

                    }
                    break;

            }

            // InternalSmaCQA.g:192:3: (otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmaCQA.g:193:4: otherlv_8= '--------- 1.Data Questions: -----------' (this_EOLINE_9= RULE_EOLINE )? ( (lv_dataQuestion_10_0= ruleDataQuestion ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getValueExchangeAccess().getDataQuestionsKeyword_8_0());
                    			
                    // InternalSmaCQA.g:197:4: (this_EOLINE_9= RULE_EOLINE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_EOLINE) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSmaCQA.g:198:5: this_EOLINE_9= RULE_EOLINE
                            {
                            this_EOLINE_9=(Token)match(input,RULE_EOLINE,FOLLOW_11); 

                            					newLeafNode(this_EOLINE_9, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_8_1());
                            				

                            }
                            break;

                    }

                    // InternalSmaCQA.g:203:4: ( (lv_dataQuestion_10_0= ruleDataQuestion ) )
                    // InternalSmaCQA.g:204:5: (lv_dataQuestion_10_0= ruleDataQuestion )
                    {
                    // InternalSmaCQA.g:204:5: (lv_dataQuestion_10_0= ruleDataQuestion )
                    // InternalSmaCQA.g:205:6: lv_dataQuestion_10_0= ruleDataQuestion
                    {

                    						newCompositeNode(grammarAccess.getValueExchangeAccess().getDataQuestionDataQuestionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dataQuestion_10_0=ruleDataQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueExchangeRule());
                    						}
                    						set(
                    							current,
                    							"dataQuestion",
                    							lv_dataQuestion_10_0,
                    							"org.xtext.SmaCQA.DataQuestion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:223:3: (otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmaCQA.g:224:4: otherlv_11= '--------- 2.Legal Questions: -----------' (this_EOLINE_12= RULE_EOLINE )? ( (lv_legalQuestion_13_0= ruleLegalQuestion ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getValueExchangeAccess().getLegalQuestionsKeyword_9_0());
                    			
                    // InternalSmaCQA.g:228:4: (this_EOLINE_12= RULE_EOLINE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_EOLINE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSmaCQA.g:229:5: this_EOLINE_12= RULE_EOLINE
                            {
                            this_EOLINE_12=(Token)match(input,RULE_EOLINE,FOLLOW_14); 

                            					newLeafNode(this_EOLINE_12, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_9_1());
                            				

                            }
                            break;

                    }

                    // InternalSmaCQA.g:234:4: ( (lv_legalQuestion_13_0= ruleLegalQuestion ) )
                    // InternalSmaCQA.g:235:5: (lv_legalQuestion_13_0= ruleLegalQuestion )
                    {
                    // InternalSmaCQA.g:235:5: (lv_legalQuestion_13_0= ruleLegalQuestion )
                    // InternalSmaCQA.g:236:6: lv_legalQuestion_13_0= ruleLegalQuestion
                    {

                    						newCompositeNode(grammarAccess.getValueExchangeAccess().getLegalQuestionLegalQuestionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_legalQuestion_13_0=ruleLegalQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueExchangeRule());
                    						}
                    						set(
                    							current,
                    							"legalQuestion",
                    							lv_legalQuestion_13_0,
                    							"org.xtext.SmaCQA.LegalQuestion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:254:3: (otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmaCQA.g:255:4: otherlv_14= '--------- 3.Economy Questions: -----------' (this_EOLINE_15= RULE_EOLINE )? ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getValueExchangeAccess().getEconomyQuestionsKeyword_10_0());
                    			
                    // InternalSmaCQA.g:259:4: (this_EOLINE_15= RULE_EOLINE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_EOLINE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSmaCQA.g:260:5: this_EOLINE_15= RULE_EOLINE
                            {
                            this_EOLINE_15=(Token)match(input,RULE_EOLINE,FOLLOW_17); 

                            					newLeafNode(this_EOLINE_15, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_10_1());
                            				

                            }
                            break;

                    }

                    // InternalSmaCQA.g:265:4: ( (lv_economyQuestion_16_0= ruleEconomyQuestion ) )
                    // InternalSmaCQA.g:266:5: (lv_economyQuestion_16_0= ruleEconomyQuestion )
                    {
                    // InternalSmaCQA.g:266:5: (lv_economyQuestion_16_0= ruleEconomyQuestion )
                    // InternalSmaCQA.g:267:6: lv_economyQuestion_16_0= ruleEconomyQuestion
                    {

                    						newCompositeNode(grammarAccess.getValueExchangeAccess().getEconomyQuestionEconomyQuestionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_economyQuestion_16_0=ruleEconomyQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueExchangeRule());
                    						}
                    						set(
                    							current,
                    							"economyQuestion",
                    							lv_economyQuestion_16_0,
                    							"org.xtext.SmaCQA.EconomyQuestion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:285:3: (otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmaCQA.g:286:4: otherlv_17= '--------- 4. Shipment Questions:-----------' (this_EOLINE_18= RULE_EOLINE )? ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) )
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getValueExchangeAccess().getShipmentQuestionsKeyword_11_0());
                    			
                    // InternalSmaCQA.g:290:4: (this_EOLINE_18= RULE_EOLINE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_EOLINE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSmaCQA.g:291:5: this_EOLINE_18= RULE_EOLINE
                            {
                            this_EOLINE_18=(Token)match(input,RULE_EOLINE,FOLLOW_19); 

                            					newLeafNode(this_EOLINE_18, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_11_1());
                            				

                            }
                            break;

                    }

                    // InternalSmaCQA.g:296:4: ( (lv_shipmentQuestion_19_0= ruleShipmentQuestion ) )
                    // InternalSmaCQA.g:297:5: (lv_shipmentQuestion_19_0= ruleShipmentQuestion )
                    {
                    // InternalSmaCQA.g:297:5: (lv_shipmentQuestion_19_0= ruleShipmentQuestion )
                    // InternalSmaCQA.g:298:6: lv_shipmentQuestion_19_0= ruleShipmentQuestion
                    {

                    						newCompositeNode(grammarAccess.getValueExchangeAccess().getShipmentQuestionShipmentQuestionParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_shipmentQuestion_19_0=ruleShipmentQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueExchangeRule());
                    						}
                    						set(
                    							current,
                    							"shipmentQuestion",
                    							lv_shipmentQuestion_19_0,
                    							"org.xtext.SmaCQA.ShipmentQuestion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:316:3: (otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmaCQA.g:317:4: otherlv_20= '--------- 5. Insurance shipment Questions:-----------' (this_EOLINE_21= RULE_EOLINE )? ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) )
                    {
                    otherlv_20=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getValueExchangeAccess().getInsuranceShipmentQuestionsKeyword_12_0());
                    			
                    // InternalSmaCQA.g:321:4: (this_EOLINE_21= RULE_EOLINE )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_EOLINE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSmaCQA.g:322:5: this_EOLINE_21= RULE_EOLINE
                            {
                            this_EOLINE_21=(Token)match(input,RULE_EOLINE,FOLLOW_21); 

                            					newLeafNode(this_EOLINE_21, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_12_1());
                            				

                            }
                            break;

                    }

                    // InternalSmaCQA.g:327:4: ( (lv_insuranceQuestion_22_0= ruleInsuranceQuestion ) )
                    // InternalSmaCQA.g:328:5: (lv_insuranceQuestion_22_0= ruleInsuranceQuestion )
                    {
                    // InternalSmaCQA.g:328:5: (lv_insuranceQuestion_22_0= ruleInsuranceQuestion )
                    // InternalSmaCQA.g:329:6: lv_insuranceQuestion_22_0= ruleInsuranceQuestion
                    {

                    						newCompositeNode(grammarAccess.getValueExchangeAccess().getInsuranceQuestionInsuranceQuestionParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_insuranceQuestion_22_0=ruleInsuranceQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueExchangeRule());
                    						}
                    						set(
                    							current,
                    							"insuranceQuestion",
                    							lv_insuranceQuestion_22_0,
                    							"org.xtext.SmaCQA.InsuranceQuestion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:347:3: (otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmaCQA.g:348:4: otherlv_23= '--------- 6. Alimentary Cargo Questions:-----------' (this_EOLINE_24= RULE_EOLINE )? ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) )
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_23); 

                    				newLeafNode(otherlv_23, grammarAccess.getValueExchangeAccess().getAlimentaryCargoQuestionsKeyword_13_0());
                    			
                    // InternalSmaCQA.g:352:4: (this_EOLINE_24= RULE_EOLINE )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_EOLINE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSmaCQA.g:353:5: this_EOLINE_24= RULE_EOLINE
                            {
                            this_EOLINE_24=(Token)match(input,RULE_EOLINE,FOLLOW_24); 

                            					newLeafNode(this_EOLINE_24, grammarAccess.getValueExchangeAccess().getEOLINETerminalRuleCall_13_1());
                            				

                            }
                            break;

                    }

                    // InternalSmaCQA.g:358:4: ( (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion ) )
                    // InternalSmaCQA.g:359:5: (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion )
                    {
                    // InternalSmaCQA.g:359:5: (lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion )
                    // InternalSmaCQA.g:360:6: lv_alimentaryQuestion_25_0= ruleAlimentaryQuestion
                    {

                    						newCompositeNode(grammarAccess.getValueExchangeAccess().getAlimentaryQuestionAlimentaryQuestionParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_alimentaryQuestion_25_0=ruleAlimentaryQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueExchangeRule());
                    						}
                    						set(
                    							current,
                    							"alimentaryQuestion",
                    							lv_alimentaryQuestion_25_0,
                    							"org.xtext.SmaCQA.AlimentaryQuestion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getValueExchangeAccess().getCompletionOfTheQuestionProcessForThisValueExchangeKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueExchange"


    // $ANTLR start "entryRuleDataQuestion"
    // InternalSmaCQA.g:386:1: entryRuleDataQuestion returns [EObject current=null] : iv_ruleDataQuestion= ruleDataQuestion EOF ;
    public final EObject entryRuleDataQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataQuestion = null;


        try {
            // InternalSmaCQA.g:386:53: (iv_ruleDataQuestion= ruleDataQuestion EOF )
            // InternalSmaCQA.g:387:2: iv_ruleDataQuestion= ruleDataQuestion EOF
            {
             newCompositeNode(grammarAccess.getDataQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataQuestion=ruleDataQuestion();

            state._fsp--;

             current =iv_ruleDataQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataQuestion"


    // $ANTLR start "ruleDataQuestion"
    // InternalSmaCQA.g:393:1: ruleDataQuestion returns [EObject current=null] : ( ( (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion ) )? ( (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion ) )? ( (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion ) )? ( (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion ) )? ( (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion ) )? ) ;
    public final EObject ruleDataQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_timeDurationValueExchange_0_0 = null;

        EObject lv_timeStartValueExchange_1_0 = null;

        EObject lv_repeatValueExchange_2_0 = null;

        EObject lv_conditionValueExchange_3_0 = null;

        EObject lv_valueObjectTypeValueExchange_4_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:399:2: ( ( ( (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion ) )? ( (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion ) )? ( (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion ) )? ( (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion ) )? ( (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion ) )? ) )
            // InternalSmaCQA.g:400:2: ( ( (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion ) )? ( (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion ) )? ( (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion ) )? ( (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion ) )? ( (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion ) )? )
            {
            // InternalSmaCQA.g:400:2: ( ( (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion ) )? ( (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion ) )? ( (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion ) )? ( (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion ) )? ( (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion ) )? )
            // InternalSmaCQA.g:401:3: ( (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion ) )? ( (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion ) )? ( (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion ) )? ( (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion ) )? ( (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion ) )?
            {
            // InternalSmaCQA.g:401:3: ( (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==58) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmaCQA.g:402:4: (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion )
                    {
                    // InternalSmaCQA.g:402:4: (lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion )
                    // InternalSmaCQA.g:403:5: lv_timeDurationValueExchange_0_0= ruleTimeValueExchangeDurationQuestion
                    {

                    					newCompositeNode(grammarAccess.getDataQuestionAccess().getTimeDurationValueExchangeTimeValueExchangeDurationQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_timeDurationValueExchange_0_0=ruleTimeValueExchangeDurationQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataQuestionRule());
                    					}
                    					set(
                    						current,
                    						"timeDurationValueExchange",
                    						lv_timeDurationValueExchange_0_0,
                    						"org.xtext.SmaCQA.TimeValueExchangeDurationQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:420:3: ( (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==60) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmaCQA.g:421:4: (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion )
                    {
                    // InternalSmaCQA.g:421:4: (lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion )
                    // InternalSmaCQA.g:422:5: lv_timeStartValueExchange_1_0= ruleTimeStartValueExchangeQuestion
                    {

                    					newCompositeNode(grammarAccess.getDataQuestionAccess().getTimeStartValueExchangeTimeStartValueExchangeQuestionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_timeStartValueExchange_1_0=ruleTimeStartValueExchangeQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataQuestionRule());
                    					}
                    					set(
                    						current,
                    						"timeStartValueExchange",
                    						lv_timeStartValueExchange_1_0,
                    						"org.xtext.SmaCQA.TimeStartValueExchangeQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:439:3: ( (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==61) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmaCQA.g:440:4: (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion )
                    {
                    // InternalSmaCQA.g:440:4: (lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion )
                    // InternalSmaCQA.g:441:5: lv_repeatValueExchange_2_0= ruleRepeatValueExchangeQuestion
                    {

                    					newCompositeNode(grammarAccess.getDataQuestionAccess().getRepeatValueExchangeRepeatValueExchangeQuestionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_repeatValueExchange_2_0=ruleRepeatValueExchangeQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataQuestionRule());
                    					}
                    					set(
                    						current,
                    						"repeatValueExchange",
                    						lv_repeatValueExchange_2_0,
                    						"org.xtext.SmaCQA.RepeatValueExchangeQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:458:3: ( (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==62) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmaCQA.g:459:4: (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion )
                    {
                    // InternalSmaCQA.g:459:4: (lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion )
                    // InternalSmaCQA.g:460:5: lv_conditionValueExchange_3_0= ruleConditionsValueExchangeQuestion
                    {

                    					newCompositeNode(grammarAccess.getDataQuestionAccess().getConditionValueExchangeConditionsValueExchangeQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_conditionValueExchange_3_0=ruleConditionsValueExchangeQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataQuestionRule());
                    					}
                    					set(
                    						current,
                    						"conditionValueExchange",
                    						lv_conditionValueExchange_3_0,
                    						"org.xtext.SmaCQA.ConditionsValueExchangeQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:477:3: ( (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23||(LA19_0>=27 && LA19_0<=28)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmaCQA.g:478:4: (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion )
                    {
                    // InternalSmaCQA.g:478:4: (lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion )
                    // InternalSmaCQA.g:479:5: lv_valueObjectTypeValueExchange_4_0= ruleValueObjectQuestion
                    {

                    					newCompositeNode(grammarAccess.getDataQuestionAccess().getValueObjectTypeValueExchangeValueObjectQuestionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valueObjectTypeValueExchange_4_0=ruleValueObjectQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataQuestionRule());
                    					}
                    					set(
                    						current,
                    						"valueObjectTypeValueExchange",
                    						lv_valueObjectTypeValueExchange_4_0,
                    						"org.xtext.SmaCQA.ValueObjectQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataQuestion"


    // $ANTLR start "entryRuleShipmentQuestion"
    // InternalSmaCQA.g:500:1: entryRuleShipmentQuestion returns [EObject current=null] : iv_ruleShipmentQuestion= ruleShipmentQuestion EOF ;
    public final EObject entryRuleShipmentQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipmentQuestion = null;


        try {
            // InternalSmaCQA.g:500:57: (iv_ruleShipmentQuestion= ruleShipmentQuestion EOF )
            // InternalSmaCQA.g:501:2: iv_ruleShipmentQuestion= ruleShipmentQuestion EOF
            {
             newCompositeNode(grammarAccess.getShipmentQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipmentQuestion=ruleShipmentQuestion();

            state._fsp--;

             current =iv_ruleShipmentQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipmentQuestion"


    // $ANTLR start "ruleShipmentQuestion"
    // InternalSmaCQA.g:507:1: ruleShipmentQuestion returns [EObject current=null] : ( ( (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion ) ) ( (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion ) ) ( (lv_customs_2_0= ruleCustomsQuestion ) )? ( (lv_importTax_3_0= ruleImportTaxQuestion ) )? ( (lv_geographicalQuestion_4_0= ruleGeographicalQuestion ) )? ( (lv_addressPickup_5_0= ruleAddressPickupQuestion ) ) ( (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion ) ) ( (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion ) )? ( (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion ) )? ( (lv_perishable_9_0= rulePerishableQuestion ) )? ( (lv_cargoType_10_0= ruleCargoTypeQuestion ) ) ( (lv_cargoWeight_11_0= ruleCargoWeightQuestion ) ) ( (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion ) ) ( (lv_seaShipment_13_0= ruleSeaShipmentQuestion ) )? ( (lv_means_14_0= ruleMeansTransportQuestion ) )? ( (lv_company_15_0= ruleCompanyQuestion ) ) ( (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion ) )? ( (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion ) )? ( (lv_externalMediator_18_0= ruleExternalMediatorQuestion ) )? ) ;
    public final EObject ruleShipmentQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_shipmentDetails_0_0 = null;

        EObject lv_sanitaryControl_1_0 = null;

        EObject lv_customs_2_0 = null;

        EObject lv_importTax_3_0 = null;

        EObject lv_geographicalQuestion_4_0 = null;

        EObject lv_addressPickup_5_0 = null;

        EObject lv_addressDelivery_6_0 = null;

        EObject lv_shipmentTrackingNumber_7_0 = null;

        EObject lv_dangerousLoad_8_0 = null;

        EObject lv_perishable_9_0 = null;

        EObject lv_cargoType_10_0 = null;

        EObject lv_cargoWeight_11_0 = null;

        EObject lv_cargoDimensions_12_0 = null;

        EObject lv_seaShipment_13_0 = null;

        EObject lv_means_14_0 = null;

        EObject lv_company_15_0 = null;

        EObject lv_deliveryDeadline_16_0 = null;

        EObject lv_updatesAndMonitoring_17_0 = null;

        EObject lv_externalMediator_18_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:513:2: ( ( ( (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion ) ) ( (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion ) ) ( (lv_customs_2_0= ruleCustomsQuestion ) )? ( (lv_importTax_3_0= ruleImportTaxQuestion ) )? ( (lv_geographicalQuestion_4_0= ruleGeographicalQuestion ) )? ( (lv_addressPickup_5_0= ruleAddressPickupQuestion ) ) ( (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion ) ) ( (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion ) )? ( (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion ) )? ( (lv_perishable_9_0= rulePerishableQuestion ) )? ( (lv_cargoType_10_0= ruleCargoTypeQuestion ) ) ( (lv_cargoWeight_11_0= ruleCargoWeightQuestion ) ) ( (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion ) ) ( (lv_seaShipment_13_0= ruleSeaShipmentQuestion ) )? ( (lv_means_14_0= ruleMeansTransportQuestion ) )? ( (lv_company_15_0= ruleCompanyQuestion ) ) ( (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion ) )? ( (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion ) )? ( (lv_externalMediator_18_0= ruleExternalMediatorQuestion ) )? ) )
            // InternalSmaCQA.g:514:2: ( ( (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion ) ) ( (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion ) ) ( (lv_customs_2_0= ruleCustomsQuestion ) )? ( (lv_importTax_3_0= ruleImportTaxQuestion ) )? ( (lv_geographicalQuestion_4_0= ruleGeographicalQuestion ) )? ( (lv_addressPickup_5_0= ruleAddressPickupQuestion ) ) ( (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion ) ) ( (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion ) )? ( (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion ) )? ( (lv_perishable_9_0= rulePerishableQuestion ) )? ( (lv_cargoType_10_0= ruleCargoTypeQuestion ) ) ( (lv_cargoWeight_11_0= ruleCargoWeightQuestion ) ) ( (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion ) ) ( (lv_seaShipment_13_0= ruleSeaShipmentQuestion ) )? ( (lv_means_14_0= ruleMeansTransportQuestion ) )? ( (lv_company_15_0= ruleCompanyQuestion ) ) ( (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion ) )? ( (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion ) )? ( (lv_externalMediator_18_0= ruleExternalMediatorQuestion ) )? )
            {
            // InternalSmaCQA.g:514:2: ( ( (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion ) ) ( (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion ) ) ( (lv_customs_2_0= ruleCustomsQuestion ) )? ( (lv_importTax_3_0= ruleImportTaxQuestion ) )? ( (lv_geographicalQuestion_4_0= ruleGeographicalQuestion ) )? ( (lv_addressPickup_5_0= ruleAddressPickupQuestion ) ) ( (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion ) ) ( (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion ) )? ( (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion ) )? ( (lv_perishable_9_0= rulePerishableQuestion ) )? ( (lv_cargoType_10_0= ruleCargoTypeQuestion ) ) ( (lv_cargoWeight_11_0= ruleCargoWeightQuestion ) ) ( (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion ) ) ( (lv_seaShipment_13_0= ruleSeaShipmentQuestion ) )? ( (lv_means_14_0= ruleMeansTransportQuestion ) )? ( (lv_company_15_0= ruleCompanyQuestion ) ) ( (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion ) )? ( (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion ) )? ( (lv_externalMediator_18_0= ruleExternalMediatorQuestion ) )? )
            // InternalSmaCQA.g:515:3: ( (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion ) ) ( (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion ) ) ( (lv_customs_2_0= ruleCustomsQuestion ) )? ( (lv_importTax_3_0= ruleImportTaxQuestion ) )? ( (lv_geographicalQuestion_4_0= ruleGeographicalQuestion ) )? ( (lv_addressPickup_5_0= ruleAddressPickupQuestion ) ) ( (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion ) ) ( (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion ) )? ( (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion ) )? ( (lv_perishable_9_0= rulePerishableQuestion ) )? ( (lv_cargoType_10_0= ruleCargoTypeQuestion ) ) ( (lv_cargoWeight_11_0= ruleCargoWeightQuestion ) ) ( (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion ) ) ( (lv_seaShipment_13_0= ruleSeaShipmentQuestion ) )? ( (lv_means_14_0= ruleMeansTransportQuestion ) )? ( (lv_company_15_0= ruleCompanyQuestion ) ) ( (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion ) )? ( (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion ) )? ( (lv_externalMediator_18_0= ruleExternalMediatorQuestion ) )?
            {
            // InternalSmaCQA.g:515:3: ( (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion ) )
            // InternalSmaCQA.g:516:4: (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion )
            {
            // InternalSmaCQA.g:516:4: (lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion )
            // InternalSmaCQA.g:517:5: lv_shipmentDetails_0_0= ruleShipmentDetailsQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getShipmentDetailsShipmentDetailsQuestionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_shipmentDetails_0_0=ruleShipmentDetailsQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"shipmentDetails",
            						lv_shipmentDetails_0_0,
            						"org.xtext.SmaCQA.ShipmentDetailsQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:534:3: ( (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion ) )
            // InternalSmaCQA.g:535:4: (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion )
            {
            // InternalSmaCQA.g:535:4: (lv_sanitaryControl_1_0= ruleSanitaryControlQuestion )
            // InternalSmaCQA.g:536:5: lv_sanitaryControl_1_0= ruleSanitaryControlQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getSanitaryControlSanitaryControlQuestionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_sanitaryControl_1_0=ruleSanitaryControlQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"sanitaryControl",
            						lv_sanitaryControl_1_0,
            						"org.xtext.SmaCQA.SanitaryControlQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:553:3: ( (lv_customs_2_0= ruleCustomsQuestion ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==81) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmaCQA.g:554:4: (lv_customs_2_0= ruleCustomsQuestion )
                    {
                    // InternalSmaCQA.g:554:4: (lv_customs_2_0= ruleCustomsQuestion )
                    // InternalSmaCQA.g:555:5: lv_customs_2_0= ruleCustomsQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getCustomsCustomsQuestionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_customs_2_0=ruleCustomsQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"customs",
                    						lv_customs_2_0,
                    						"org.xtext.SmaCQA.CustomsQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:572:3: ( (lv_importTax_3_0= ruleImportTaxQuestion ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==83) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmaCQA.g:573:4: (lv_importTax_3_0= ruleImportTaxQuestion )
                    {
                    // InternalSmaCQA.g:573:4: (lv_importTax_3_0= ruleImportTaxQuestion )
                    // InternalSmaCQA.g:574:5: lv_importTax_3_0= ruleImportTaxQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getImportTaxImportTaxQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_importTax_3_0=ruleImportTaxQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"importTax",
                    						lv_importTax_3_0,
                    						"org.xtext.SmaCQA.ImportTaxQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:591:3: ( (lv_geographicalQuestion_4_0= ruleGeographicalQuestion ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==86) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSmaCQA.g:592:4: (lv_geographicalQuestion_4_0= ruleGeographicalQuestion )
                    {
                    // InternalSmaCQA.g:592:4: (lv_geographicalQuestion_4_0= ruleGeographicalQuestion )
                    // InternalSmaCQA.g:593:5: lv_geographicalQuestion_4_0= ruleGeographicalQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getGeographicalQuestionGeographicalQuestionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_geographicalQuestion_4_0=ruleGeographicalQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"geographicalQuestion",
                    						lv_geographicalQuestion_4_0,
                    						"org.xtext.SmaCQA.GeographicalQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:610:3: ( (lv_addressPickup_5_0= ruleAddressPickupQuestion ) )
            // InternalSmaCQA.g:611:4: (lv_addressPickup_5_0= ruleAddressPickupQuestion )
            {
            // InternalSmaCQA.g:611:4: (lv_addressPickup_5_0= ruleAddressPickupQuestion )
            // InternalSmaCQA.g:612:5: lv_addressPickup_5_0= ruleAddressPickupQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getAddressPickupAddressPickupQuestionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
            lv_addressPickup_5_0=ruleAddressPickupQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"addressPickup",
            						lv_addressPickup_5_0,
            						"org.xtext.SmaCQA.AddressPickupQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:629:3: ( (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion ) )
            // InternalSmaCQA.g:630:4: (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion )
            {
            // InternalSmaCQA.g:630:4: (lv_addressDelivery_6_0= ruleAddressDeliveryQuestion )
            // InternalSmaCQA.g:631:5: lv_addressDelivery_6_0= ruleAddressDeliveryQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getAddressDeliveryAddressDeliveryQuestionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_addressDelivery_6_0=ruleAddressDeliveryQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"addressDelivery",
            						lv_addressDelivery_6_0,
            						"org.xtext.SmaCQA.AddressDeliveryQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:648:3: ( (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==92) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmaCQA.g:649:4: (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion )
                    {
                    // InternalSmaCQA.g:649:4: (lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion )
                    // InternalSmaCQA.g:650:5: lv_shipmentTrackingNumber_7_0= ruleShipmentTrackingNumberQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getShipmentTrackingNumberShipmentTrackingNumberQuestionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_shipmentTrackingNumber_7_0=ruleShipmentTrackingNumberQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"shipmentTrackingNumber",
                    						lv_shipmentTrackingNumber_7_0,
                    						"org.xtext.SmaCQA.ShipmentTrackingNumberQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:667:3: ( (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==94) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmaCQA.g:668:4: (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion )
                    {
                    // InternalSmaCQA.g:668:4: (lv_dangerousLoad_8_0= ruleDangerousLoadQuestion )
                    // InternalSmaCQA.g:669:5: lv_dangerousLoad_8_0= ruleDangerousLoadQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getDangerousLoadDangerousLoadQuestionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_dangerousLoad_8_0=ruleDangerousLoadQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"dangerousLoad",
                    						lv_dangerousLoad_8_0,
                    						"org.xtext.SmaCQA.DangerousLoadQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:686:3: ( (lv_perishable_9_0= rulePerishableQuestion ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==97) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmaCQA.g:687:4: (lv_perishable_9_0= rulePerishableQuestion )
                    {
                    // InternalSmaCQA.g:687:4: (lv_perishable_9_0= rulePerishableQuestion )
                    // InternalSmaCQA.g:688:5: lv_perishable_9_0= rulePerishableQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getPerishablePerishableQuestionParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_perishable_9_0=rulePerishableQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"perishable",
                    						lv_perishable_9_0,
                    						"org.xtext.SmaCQA.PerishableQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:705:3: ( (lv_cargoType_10_0= ruleCargoTypeQuestion ) )
            // InternalSmaCQA.g:706:4: (lv_cargoType_10_0= ruleCargoTypeQuestion )
            {
            // InternalSmaCQA.g:706:4: (lv_cargoType_10_0= ruleCargoTypeQuestion )
            // InternalSmaCQA.g:707:5: lv_cargoType_10_0= ruleCargoTypeQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getCargoTypeCargoTypeQuestionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_34);
            lv_cargoType_10_0=ruleCargoTypeQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"cargoType",
            						lv_cargoType_10_0,
            						"org.xtext.SmaCQA.CargoTypeQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:724:3: ( (lv_cargoWeight_11_0= ruleCargoWeightQuestion ) )
            // InternalSmaCQA.g:725:4: (lv_cargoWeight_11_0= ruleCargoWeightQuestion )
            {
            // InternalSmaCQA.g:725:4: (lv_cargoWeight_11_0= ruleCargoWeightQuestion )
            // InternalSmaCQA.g:726:5: lv_cargoWeight_11_0= ruleCargoWeightQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getCargoWeightCargoWeightQuestionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_35);
            lv_cargoWeight_11_0=ruleCargoWeightQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"cargoWeight",
            						lv_cargoWeight_11_0,
            						"org.xtext.SmaCQA.CargoWeightQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:743:3: ( (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion ) )
            // InternalSmaCQA.g:744:4: (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion )
            {
            // InternalSmaCQA.g:744:4: (lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion )
            // InternalSmaCQA.g:745:5: lv_cargoDimensions_12_0= ruleCargoDimensionsQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getCargoDimensionsCargoDimensionsQuestionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_36);
            lv_cargoDimensions_12_0=ruleCargoDimensionsQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"cargoDimensions",
            						lv_cargoDimensions_12_0,
            						"org.xtext.SmaCQA.CargoDimensionsQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:762:3: ( (lv_seaShipment_13_0= ruleSeaShipmentQuestion ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==104) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSmaCQA.g:763:4: (lv_seaShipment_13_0= ruleSeaShipmentQuestion )
                    {
                    // InternalSmaCQA.g:763:4: (lv_seaShipment_13_0= ruleSeaShipmentQuestion )
                    // InternalSmaCQA.g:764:5: lv_seaShipment_13_0= ruleSeaShipmentQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getSeaShipmentSeaShipmentQuestionParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_seaShipment_13_0=ruleSeaShipmentQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"seaShipment",
                    						lv_seaShipment_13_0,
                    						"org.xtext.SmaCQA.SeaShipmentQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:781:3: ( (lv_means_14_0= ruleMeansTransportQuestion ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==114) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSmaCQA.g:782:4: (lv_means_14_0= ruleMeansTransportQuestion )
                    {
                    // InternalSmaCQA.g:782:4: (lv_means_14_0= ruleMeansTransportQuestion )
                    // InternalSmaCQA.g:783:5: lv_means_14_0= ruleMeansTransportQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getMeansMeansTransportQuestionParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_means_14_0=ruleMeansTransportQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"means",
                    						lv_means_14_0,
                    						"org.xtext.SmaCQA.MeansTransportQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:800:3: ( (lv_company_15_0= ruleCompanyQuestion ) )
            // InternalSmaCQA.g:801:4: (lv_company_15_0= ruleCompanyQuestion )
            {
            // InternalSmaCQA.g:801:4: (lv_company_15_0= ruleCompanyQuestion )
            // InternalSmaCQA.g:802:5: lv_company_15_0= ruleCompanyQuestion
            {

            					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getCompanyCompanyQuestionParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_37);
            lv_company_15_0=ruleCompanyQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
            					}
            					set(
            						current,
            						"company",
            						lv_company_15_0,
            						"org.xtext.SmaCQA.CompanyQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:819:3: ( (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==117) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmaCQA.g:820:4: (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion )
                    {
                    // InternalSmaCQA.g:820:4: (lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion )
                    // InternalSmaCQA.g:821:5: lv_deliveryDeadline_16_0= ruleDeliveryDeadlineQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getDeliveryDeadlineDeliveryDeadlineQuestionParserRuleCall_16_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_deliveryDeadline_16_0=ruleDeliveryDeadlineQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"deliveryDeadline",
                    						lv_deliveryDeadline_16_0,
                    						"org.xtext.SmaCQA.DeliveryDeadlineQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:838:3: ( (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==119) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSmaCQA.g:839:4: (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion )
                    {
                    // InternalSmaCQA.g:839:4: (lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion )
                    // InternalSmaCQA.g:840:5: lv_updatesAndMonitoring_17_0= ruleUpdatesAndMonitoringQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getUpdatesAndMonitoringUpdatesAndMonitoringQuestionParserRuleCall_17_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_updatesAndMonitoring_17_0=ruleUpdatesAndMonitoringQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"updatesAndMonitoring",
                    						lv_updatesAndMonitoring_17_0,
                    						"org.xtext.SmaCQA.UpdatesAndMonitoringQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:857:3: ( (lv_externalMediator_18_0= ruleExternalMediatorQuestion ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==120) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSmaCQA.g:858:4: (lv_externalMediator_18_0= ruleExternalMediatorQuestion )
                    {
                    // InternalSmaCQA.g:858:4: (lv_externalMediator_18_0= ruleExternalMediatorQuestion )
                    // InternalSmaCQA.g:859:5: lv_externalMediator_18_0= ruleExternalMediatorQuestion
                    {

                    					newCompositeNode(grammarAccess.getShipmentQuestionAccess().getExternalMediatorExternalMediatorQuestionParserRuleCall_18_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_externalMediator_18_0=ruleExternalMediatorQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"externalMediator",
                    						lv_externalMediator_18_0,
                    						"org.xtext.SmaCQA.ExternalMediatorQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipmentQuestion"


    // $ANTLR start "entryRuleInsuranceQuestion"
    // InternalSmaCQA.g:880:1: entryRuleInsuranceQuestion returns [EObject current=null] : iv_ruleInsuranceQuestion= ruleInsuranceQuestion EOF ;
    public final EObject entryRuleInsuranceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsuranceQuestion = null;


        try {
            // InternalSmaCQA.g:880:58: (iv_ruleInsuranceQuestion= ruleInsuranceQuestion EOF )
            // InternalSmaCQA.g:881:2: iv_ruleInsuranceQuestion= ruleInsuranceQuestion EOF
            {
             newCompositeNode(grammarAccess.getInsuranceQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsuranceQuestion=ruleInsuranceQuestion();

            state._fsp--;

             current =iv_ruleInsuranceQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsuranceQuestion"


    // $ANTLR start "ruleInsuranceQuestion"
    // InternalSmaCQA.g:887:1: ruleInsuranceQuestion returns [EObject current=null] : ( ( (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion ) )? ( (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion ) ) ( (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion ) )? ( (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion ) )? ) ;
    public final EObject ruleInsuranceQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_shipmentInsurance_0_0 = null;

        EObject lv_insuranceDetails_1_0 = null;

        EObject lv_returnsOrCancellations_2_0 = null;

        EObject lv_penaltyForNeglect_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:893:2: ( ( ( (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion ) )? ( (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion ) ) ( (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion ) )? ( (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion ) )? ) )
            // InternalSmaCQA.g:894:2: ( ( (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion ) )? ( (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion ) ) ( (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion ) )? ( (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion ) )? )
            {
            // InternalSmaCQA.g:894:2: ( ( (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion ) )? ( (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion ) ) ( (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion ) )? ( (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion ) )? )
            // InternalSmaCQA.g:895:3: ( (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion ) )? ( (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion ) ) ( (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion ) )? ( (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion ) )?
            {
            // InternalSmaCQA.g:895:3: ( (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==122) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSmaCQA.g:896:4: (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion )
                    {
                    // InternalSmaCQA.g:896:4: (lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion )
                    // InternalSmaCQA.g:897:5: lv_shipmentInsurance_0_0= ruleShipmentInsuranceQuestion
                    {

                    					newCompositeNode(grammarAccess.getInsuranceQuestionAccess().getShipmentInsuranceShipmentInsuranceQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_shipmentInsurance_0_0=ruleShipmentInsuranceQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInsuranceQuestionRule());
                    					}
                    					set(
                    						current,
                    						"shipmentInsurance",
                    						lv_shipmentInsurance_0_0,
                    						"org.xtext.SmaCQA.ShipmentInsuranceQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:914:3: ( (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion ) )
            // InternalSmaCQA.g:915:4: (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion )
            {
            // InternalSmaCQA.g:915:4: (lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion )
            // InternalSmaCQA.g:916:5: lv_insuranceDetails_1_0= ruleInsuranceDetailsQuestion
            {

            					newCompositeNode(grammarAccess.getInsuranceQuestionAccess().getInsuranceDetailsInsuranceDetailsQuestionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_insuranceDetails_1_0=ruleInsuranceDetailsQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsuranceQuestionRule());
            					}
            					set(
            						current,
            						"insuranceDetails",
            						lv_insuranceDetails_1_0,
            						"org.xtext.SmaCQA.InsuranceDetailsQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:933:3: ( (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==126) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSmaCQA.g:934:4: (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion )
                    {
                    // InternalSmaCQA.g:934:4: (lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion )
                    // InternalSmaCQA.g:935:5: lv_returnsOrCancellations_2_0= ruleReturnsOrCancellationsQuestion
                    {

                    					newCompositeNode(grammarAccess.getInsuranceQuestionAccess().getReturnsOrCancellationsReturnsOrCancellationsQuestionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_returnsOrCancellations_2_0=ruleReturnsOrCancellationsQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInsuranceQuestionRule());
                    					}
                    					set(
                    						current,
                    						"returnsOrCancellations",
                    						lv_returnsOrCancellations_2_0,
                    						"org.xtext.SmaCQA.ReturnsOrCancellationsQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:952:3: ( (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==128) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSmaCQA.g:953:4: (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion )
                    {
                    // InternalSmaCQA.g:953:4: (lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion )
                    // InternalSmaCQA.g:954:5: lv_penaltyForNeglect_3_0= rulePenaltyForNeglectQuestion
                    {

                    					newCompositeNode(grammarAccess.getInsuranceQuestionAccess().getPenaltyForNeglectPenaltyForNeglectQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_penaltyForNeglect_3_0=rulePenaltyForNeglectQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInsuranceQuestionRule());
                    					}
                    					set(
                    						current,
                    						"penaltyForNeglect",
                    						lv_penaltyForNeglect_3_0,
                    						"org.xtext.SmaCQA.PenaltyForNeglectQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsuranceQuestion"


    // $ANTLR start "entryRuleAlimentaryQuestion"
    // InternalSmaCQA.g:975:1: entryRuleAlimentaryQuestion returns [EObject current=null] : iv_ruleAlimentaryQuestion= ruleAlimentaryQuestion EOF ;
    public final EObject entryRuleAlimentaryQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlimentaryQuestion = null;


        try {
            // InternalSmaCQA.g:975:59: (iv_ruleAlimentaryQuestion= ruleAlimentaryQuestion EOF )
            // InternalSmaCQA.g:976:2: iv_ruleAlimentaryQuestion= ruleAlimentaryQuestion EOF
            {
             newCompositeNode(grammarAccess.getAlimentaryQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlimentaryQuestion=ruleAlimentaryQuestion();

            state._fsp--;

             current =iv_ruleAlimentaryQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlimentaryQuestion"


    // $ANTLR start "ruleAlimentaryQuestion"
    // InternalSmaCQA.g:982:1: ruleAlimentaryQuestion returns [EObject current=null] : ( ( (lv_agreedPrice_0_0= ruleAgreedPriceQuestion ) )? ( (lv_productQuality_1_0= ruleProductQualityQuestion ) )? ( (lv_internationalSeal_2_0= ruleInternationalSealQuestion ) )? ( (lv_healthInspection_3_0= ruleHealthInspectionQuestion ) )? ( (lv_storageConditions_4_0= ruleStorageConditionsQuestion ) )? ) ;
    public final EObject ruleAlimentaryQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_agreedPrice_0_0 = null;

        EObject lv_productQuality_1_0 = null;

        EObject lv_internationalSeal_2_0 = null;

        EObject lv_healthInspection_3_0 = null;

        EObject lv_storageConditions_4_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:988:2: ( ( ( (lv_agreedPrice_0_0= ruleAgreedPriceQuestion ) )? ( (lv_productQuality_1_0= ruleProductQualityQuestion ) )? ( (lv_internationalSeal_2_0= ruleInternationalSealQuestion ) )? ( (lv_healthInspection_3_0= ruleHealthInspectionQuestion ) )? ( (lv_storageConditions_4_0= ruleStorageConditionsQuestion ) )? ) )
            // InternalSmaCQA.g:989:2: ( ( (lv_agreedPrice_0_0= ruleAgreedPriceQuestion ) )? ( (lv_productQuality_1_0= ruleProductQualityQuestion ) )? ( (lv_internationalSeal_2_0= ruleInternationalSealQuestion ) )? ( (lv_healthInspection_3_0= ruleHealthInspectionQuestion ) )? ( (lv_storageConditions_4_0= ruleStorageConditionsQuestion ) )? )
            {
            // InternalSmaCQA.g:989:2: ( ( (lv_agreedPrice_0_0= ruleAgreedPriceQuestion ) )? ( (lv_productQuality_1_0= ruleProductQualityQuestion ) )? ( (lv_internationalSeal_2_0= ruleInternationalSealQuestion ) )? ( (lv_healthInspection_3_0= ruleHealthInspectionQuestion ) )? ( (lv_storageConditions_4_0= ruleStorageConditionsQuestion ) )? )
            // InternalSmaCQA.g:990:3: ( (lv_agreedPrice_0_0= ruleAgreedPriceQuestion ) )? ( (lv_productQuality_1_0= ruleProductQualityQuestion ) )? ( (lv_internationalSeal_2_0= ruleInternationalSealQuestion ) )? ( (lv_healthInspection_3_0= ruleHealthInspectionQuestion ) )? ( (lv_storageConditions_4_0= ruleStorageConditionsQuestion ) )?
            {
            // InternalSmaCQA.g:990:3: ( (lv_agreedPrice_0_0= ruleAgreedPriceQuestion ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==129) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSmaCQA.g:991:4: (lv_agreedPrice_0_0= ruleAgreedPriceQuestion )
                    {
                    // InternalSmaCQA.g:991:4: (lv_agreedPrice_0_0= ruleAgreedPriceQuestion )
                    // InternalSmaCQA.g:992:5: lv_agreedPrice_0_0= ruleAgreedPriceQuestion
                    {

                    					newCompositeNode(grammarAccess.getAlimentaryQuestionAccess().getAgreedPriceAgreedPriceQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_agreedPrice_0_0=ruleAgreedPriceQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlimentaryQuestionRule());
                    					}
                    					set(
                    						current,
                    						"agreedPrice",
                    						lv_agreedPrice_0_0,
                    						"org.xtext.SmaCQA.AgreedPriceQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:1009:3: ( (lv_productQuality_1_0= ruleProductQualityQuestion ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==132) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSmaCQA.g:1010:4: (lv_productQuality_1_0= ruleProductQualityQuestion )
                    {
                    // InternalSmaCQA.g:1010:4: (lv_productQuality_1_0= ruleProductQualityQuestion )
                    // InternalSmaCQA.g:1011:5: lv_productQuality_1_0= ruleProductQualityQuestion
                    {

                    					newCompositeNode(grammarAccess.getAlimentaryQuestionAccess().getProductQualityProductQualityQuestionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_productQuality_1_0=ruleProductQualityQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlimentaryQuestionRule());
                    					}
                    					set(
                    						current,
                    						"productQuality",
                    						lv_productQuality_1_0,
                    						"org.xtext.SmaCQA.ProductQualityQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:1028:3: ( (lv_internationalSeal_2_0= ruleInternationalSealQuestion ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==135) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSmaCQA.g:1029:4: (lv_internationalSeal_2_0= ruleInternationalSealQuestion )
                    {
                    // InternalSmaCQA.g:1029:4: (lv_internationalSeal_2_0= ruleInternationalSealQuestion )
                    // InternalSmaCQA.g:1030:5: lv_internationalSeal_2_0= ruleInternationalSealQuestion
                    {

                    					newCompositeNode(grammarAccess.getAlimentaryQuestionAccess().getInternationalSealInternationalSealQuestionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_45);
                    lv_internationalSeal_2_0=ruleInternationalSealQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlimentaryQuestionRule());
                    					}
                    					set(
                    						current,
                    						"internationalSeal",
                    						lv_internationalSeal_2_0,
                    						"org.xtext.SmaCQA.InternationalSealQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:1047:3: ( (lv_healthInspection_3_0= ruleHealthInspectionQuestion ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==137) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSmaCQA.g:1048:4: (lv_healthInspection_3_0= ruleHealthInspectionQuestion )
                    {
                    // InternalSmaCQA.g:1048:4: (lv_healthInspection_3_0= ruleHealthInspectionQuestion )
                    // InternalSmaCQA.g:1049:5: lv_healthInspection_3_0= ruleHealthInspectionQuestion
                    {

                    					newCompositeNode(grammarAccess.getAlimentaryQuestionAccess().getHealthInspectionHealthInspectionQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_46);
                    lv_healthInspection_3_0=ruleHealthInspectionQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlimentaryQuestionRule());
                    					}
                    					set(
                    						current,
                    						"healthInspection",
                    						lv_healthInspection_3_0,
                    						"org.xtext.SmaCQA.HealthInspectionQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:1066:3: ( (lv_storageConditions_4_0= ruleStorageConditionsQuestion ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==140) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSmaCQA.g:1067:4: (lv_storageConditions_4_0= ruleStorageConditionsQuestion )
                    {
                    // InternalSmaCQA.g:1067:4: (lv_storageConditions_4_0= ruleStorageConditionsQuestion )
                    // InternalSmaCQA.g:1068:5: lv_storageConditions_4_0= ruleStorageConditionsQuestion
                    {

                    					newCompositeNode(grammarAccess.getAlimentaryQuestionAccess().getStorageConditionsStorageConditionsQuestionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_storageConditions_4_0=ruleStorageConditionsQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlimentaryQuestionRule());
                    					}
                    					set(
                    						current,
                    						"storageConditions",
                    						lv_storageConditions_4_0,
                    						"org.xtext.SmaCQA.StorageConditionsQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlimentaryQuestion"


    // $ANTLR start "entryRuleValueObjectQuestion"
    // InternalSmaCQA.g:1089:1: entryRuleValueObjectQuestion returns [EObject current=null] : iv_ruleValueObjectQuestion= ruleValueObjectQuestion EOF ;
    public final EObject entryRuleValueObjectQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObjectQuestion = null;


        try {
            // InternalSmaCQA.g:1089:60: (iv_ruleValueObjectQuestion= ruleValueObjectQuestion EOF )
            // InternalSmaCQA.g:1090:2: iv_ruleValueObjectQuestion= ruleValueObjectQuestion EOF
            {
             newCompositeNode(grammarAccess.getValueObjectQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueObjectQuestion=ruleValueObjectQuestion();

            state._fsp--;

             current =iv_ruleValueObjectQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueObjectQuestion"


    // $ANTLR start "ruleValueObjectQuestion"
    // InternalSmaCQA.g:1096:1: ruleValueObjectQuestion returns [EObject current=null] : (this_ValueObjectTokenQuestion_0= ruleValueObjectTokenQuestion | this_ValueObjectRightQuestion_1= ruleValueObjectRightQuestion | this_ValueObjectTangibleQuestion_2= ruleValueObjectTangibleQuestion ) ;
    public final EObject ruleValueObjectQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_ValueObjectTokenQuestion_0 = null;

        EObject this_ValueObjectRightQuestion_1 = null;

        EObject this_ValueObjectTangibleQuestion_2 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:1102:2: ( (this_ValueObjectTokenQuestion_0= ruleValueObjectTokenQuestion | this_ValueObjectRightQuestion_1= ruleValueObjectRightQuestion | this_ValueObjectTangibleQuestion_2= ruleValueObjectTangibleQuestion ) )
            // InternalSmaCQA.g:1103:2: (this_ValueObjectTokenQuestion_0= ruleValueObjectTokenQuestion | this_ValueObjectRightQuestion_1= ruleValueObjectRightQuestion | this_ValueObjectTangibleQuestion_2= ruleValueObjectTangibleQuestion )
            {
            // InternalSmaCQA.g:1103:2: (this_ValueObjectTokenQuestion_0= ruleValueObjectTokenQuestion | this_ValueObjectRightQuestion_1= ruleValueObjectRightQuestion | this_ValueObjectTangibleQuestion_2= ruleValueObjectTangibleQuestion )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt39=1;
                }
                break;
            case 23:
                {
                alt39=2;
                }
                break;
            case 28:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSmaCQA.g:1104:3: this_ValueObjectTokenQuestion_0= ruleValueObjectTokenQuestion
                    {

                    			newCompositeNode(grammarAccess.getValueObjectQuestionAccess().getValueObjectTokenQuestionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueObjectTokenQuestion_0=ruleValueObjectTokenQuestion();

                    state._fsp--;


                    			current = this_ValueObjectTokenQuestion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1113:3: this_ValueObjectRightQuestion_1= ruleValueObjectRightQuestion
                    {

                    			newCompositeNode(grammarAccess.getValueObjectQuestionAccess().getValueObjectRightQuestionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueObjectRightQuestion_1=ruleValueObjectRightQuestion();

                    state._fsp--;


                    			current = this_ValueObjectRightQuestion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmaCQA.g:1122:3: this_ValueObjectTangibleQuestion_2= ruleValueObjectTangibleQuestion
                    {

                    			newCompositeNode(grammarAccess.getValueObjectQuestionAccess().getValueObjectTangibleQuestionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueObjectTangibleQuestion_2=ruleValueObjectTangibleQuestion();

                    state._fsp--;


                    			current = this_ValueObjectTangibleQuestion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueObjectQuestion"


    // $ANTLR start "entryRuleValueObjectRightQuestion"
    // InternalSmaCQA.g:1134:1: entryRuleValueObjectRightQuestion returns [EObject current=null] : iv_ruleValueObjectRightQuestion= ruleValueObjectRightQuestion EOF ;
    public final EObject entryRuleValueObjectRightQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObjectRightQuestion = null;


        try {
            // InternalSmaCQA.g:1134:65: (iv_ruleValueObjectRightQuestion= ruleValueObjectRightQuestion EOF )
            // InternalSmaCQA.g:1135:2: iv_ruleValueObjectRightQuestion= ruleValueObjectRightQuestion EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRightQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueObjectRightQuestion=ruleValueObjectRightQuestion();

            state._fsp--;

             current =iv_ruleValueObjectRightQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueObjectRightQuestion"


    // $ANTLR start "ruleValueObjectRightQuestion"
    // InternalSmaCQA.g:1141:1: ruleValueObjectRightQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleValueObjectRightQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:1147:2: ( ( ( (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:1148:2: ( ( (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:1148:2: ( ( (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:1149:3: ( (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:1149:3: ( (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' ) )
            // InternalSmaCQA.g:1150:4: (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' )
            {
            // InternalSmaCQA.g:1150:4: (lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?' )
            // InternalSmaCQA.g:1151:5: lv_name_0_0= '1.5 Is the object of value a right that can be reflected as active or inactive?'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getValueObjectRightQuestionAccess().getName15IsTheObjectOfValueARightThatCanBeReflectedAsActiveOrInactiveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueObjectRightQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.5 Is the object of value a right that can be reflected as active or inactive?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getValueObjectRightQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:1167:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:1168:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:1168:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:1169:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:1169:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            else if ( (LA40_0==26) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSmaCQA.g:1170:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getValueObjectRightQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueObjectRightQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1181:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getValueObjectRightQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueObjectRightQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueObjectRightQuestion"


    // $ANTLR start "entryRuleValueObjectTokenQuestion"
    // InternalSmaCQA.g:1198:1: entryRuleValueObjectTokenQuestion returns [EObject current=null] : iv_ruleValueObjectTokenQuestion= ruleValueObjectTokenQuestion EOF ;
    public final EObject entryRuleValueObjectTokenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObjectTokenQuestion = null;


        try {
            // InternalSmaCQA.g:1198:65: (iv_ruleValueObjectTokenQuestion= ruleValueObjectTokenQuestion EOF )
            // InternalSmaCQA.g:1199:2: iv_ruleValueObjectTokenQuestion= ruleValueObjectTokenQuestion EOF
            {
             newCompositeNode(grammarAccess.getValueObjectTokenQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueObjectTokenQuestion=ruleValueObjectTokenQuestion();

            state._fsp--;

             current =iv_ruleValueObjectTokenQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueObjectTokenQuestion"


    // $ANTLR start "ruleValueObjectTokenQuestion"
    // InternalSmaCQA.g:1205:1: ruleValueObjectTokenQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' ) ) ( (lv_answer_1_0= ruleToken ) ) ) ;
    public final EObject ruleValueObjectTokenQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_answer_1_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:1211:2: ( ( ( (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' ) ) ( (lv_answer_1_0= ruleToken ) ) ) )
            // InternalSmaCQA.g:1212:2: ( ( (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' ) ) ( (lv_answer_1_0= ruleToken ) ) )
            {
            // InternalSmaCQA.g:1212:2: ( ( (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' ) ) ( (lv_answer_1_0= ruleToken ) ) )
            // InternalSmaCQA.g:1213:3: ( (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' ) ) ( (lv_answer_1_0= ruleToken ) )
            {
            // InternalSmaCQA.g:1213:3: ( (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' ) )
            // InternalSmaCQA.g:1214:4: (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' )
            {
            // InternalSmaCQA.g:1214:4: (lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?' )
            // InternalSmaCQA.g:1215:5: lv_name_0_0= '1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_49); 

            					newLeafNode(lv_name_0_0, grammarAccess.getValueObjectTokenQuestionAccess().getName15IfTheObjectOfValueTradedOnTheValueExchangeIsADigitalTokenWhatAreThePropertiesOfSaidTokenKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueObjectTokenQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.5 If the object of value traded on the value exchange is a digital token. What are the properties of said token?");
            				

            }


            }

            // InternalSmaCQA.g:1227:3: ( (lv_answer_1_0= ruleToken ) )
            // InternalSmaCQA.g:1228:4: (lv_answer_1_0= ruleToken )
            {
            // InternalSmaCQA.g:1228:4: (lv_answer_1_0= ruleToken )
            // InternalSmaCQA.g:1229:5: lv_answer_1_0= ruleToken
            {

            					newCompositeNode(grammarAccess.getValueObjectTokenQuestionAccess().getAnswerTokenParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_answer_1_0=ruleToken();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueObjectTokenQuestionRule());
            					}
            					set(
            						current,
            						"answer",
            						lv_answer_1_0,
            						"org.xtext.SmaCQA.Token");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueObjectTokenQuestion"


    // $ANTLR start "entryRuleValueObjectTangibleQuestion"
    // InternalSmaCQA.g:1250:1: entryRuleValueObjectTangibleQuestion returns [EObject current=null] : iv_ruleValueObjectTangibleQuestion= ruleValueObjectTangibleQuestion EOF ;
    public final EObject entryRuleValueObjectTangibleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObjectTangibleQuestion = null;


        try {
            // InternalSmaCQA.g:1250:68: (iv_ruleValueObjectTangibleQuestion= ruleValueObjectTangibleQuestion EOF )
            // InternalSmaCQA.g:1251:2: iv_ruleValueObjectTangibleQuestion= ruleValueObjectTangibleQuestion EOF
            {
             newCompositeNode(grammarAccess.getValueObjectTangibleQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueObjectTangibleQuestion=ruleValueObjectTangibleQuestion();

            state._fsp--;

             current =iv_ruleValueObjectTangibleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueObjectTangibleQuestion"


    // $ANTLR start "ruleValueObjectTangibleQuestion"
    // InternalSmaCQA.g:1257:1: ruleValueObjectTangibleQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' ) ) otherlv_1= 'Data Declaration: ' ( (lv_answer_2_0= ruleDataRegister ) )+ otherlv_3= 'End Data Declaration' ) ;
    public final EObject ruleValueObjectTangibleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_answer_2_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:1263:2: ( ( ( (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' ) ) otherlv_1= 'Data Declaration: ' ( (lv_answer_2_0= ruleDataRegister ) )+ otherlv_3= 'End Data Declaration' ) )
            // InternalSmaCQA.g:1264:2: ( ( (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' ) ) otherlv_1= 'Data Declaration: ' ( (lv_answer_2_0= ruleDataRegister ) )+ otherlv_3= 'End Data Declaration' )
            {
            // InternalSmaCQA.g:1264:2: ( ( (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' ) ) otherlv_1= 'Data Declaration: ' ( (lv_answer_2_0= ruleDataRegister ) )+ otherlv_3= 'End Data Declaration' )
            // InternalSmaCQA.g:1265:3: ( (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' ) ) otherlv_1= 'Data Declaration: ' ( (lv_answer_2_0= ruleDataRegister ) )+ otherlv_3= 'End Data Declaration'
            {
            // InternalSmaCQA.g:1265:3: ( (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' ) )
            // InternalSmaCQA.g:1266:4: (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' )
            {
            // InternalSmaCQA.g:1266:4: (lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?' )
            // InternalSmaCQA.g:1267:5: lv_name_0_0= '1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_50); 

            					newLeafNode(lv_name_0_0, grammarAccess.getValueObjectTangibleQuestionAccess().getName15IfTheObjectOfValueNegotiatedInTheValueExchangeIsATangibleEntityThatCanBeRepresentedAsADigitalEntityNotATokenWhatAreThePropertiesOfThatObjectKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueObjectTangibleQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.5 If the object of value negotiated in the value exchange is a tangible entity that can be represented as a digital entity (not a token). What are the properties of that object?");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getValueObjectTangibleQuestionAccess().getDataDeclarationKeyword_1());
            		
            // InternalSmaCQA.g:1283:3: ( (lv_answer_2_0= ruleDataRegister ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==31) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSmaCQA.g:1284:4: (lv_answer_2_0= ruleDataRegister )
            	    {
            	    // InternalSmaCQA.g:1284:4: (lv_answer_2_0= ruleDataRegister )
            	    // InternalSmaCQA.g:1285:5: lv_answer_2_0= ruleDataRegister
            	    {

            	    					newCompositeNode(grammarAccess.getValueObjectTangibleQuestionAccess().getAnswerDataRegisterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_answer_2_0=ruleDataRegister();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValueObjectTangibleQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"answer",
            	    						lv_answer_2_0,
            	    						"org.xtext.SmaCQA.DataRegister");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getValueObjectTangibleQuestionAccess().getEndDataDeclarationKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueObjectTangibleQuestion"


    // $ANTLR start "entryRuleDataRegister"
    // InternalSmaCQA.g:1310:1: entryRuleDataRegister returns [EObject current=null] : iv_ruleDataRegister= ruleDataRegister EOF ;
    public final EObject entryRuleDataRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRegister = null;


        try {
            // InternalSmaCQA.g:1310:53: (iv_ruleDataRegister= ruleDataRegister EOF )
            // InternalSmaCQA.g:1311:2: iv_ruleDataRegister= ruleDataRegister EOF
            {
             newCompositeNode(grammarAccess.getDataRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataRegister=ruleDataRegister();

            state._fsp--;

             current =iv_ruleDataRegister; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataRegister"


    // $ANTLR start "ruleDataRegister"
    // InternalSmaCQA.g:1317:1: ruleDataRegister returns [EObject current=null] : (otherlv_0= 'Data name: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Value: ' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleDataRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:1323:2: ( (otherlv_0= 'Data name: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Value: ' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSmaCQA.g:1324:2: (otherlv_0= 'Data name: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Value: ' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSmaCQA.g:1324:2: (otherlv_0= 'Data name: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Value: ' ( (lv_type_3_0= ruleType ) ) )
            // InternalSmaCQA.g:1325:3: otherlv_0= 'Data name: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Value: ' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataRegisterAccess().getDataNameKeyword_0());
            		
            // InternalSmaCQA.g:1329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmaCQA.g:1330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmaCQA.g:1330:4: (lv_name_1_0= RULE_ID )
            // InternalSmaCQA.g:1331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataRegisterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getDataRegisterAccess().getValueKeyword_2());
            		
            // InternalSmaCQA.g:1351:3: ( (lv_type_3_0= ruleType ) )
            // InternalSmaCQA.g:1352:4: (lv_type_3_0= ruleType )
            {
            // InternalSmaCQA.g:1352:4: (lv_type_3_0= ruleType )
            // InternalSmaCQA.g:1353:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataRegisterAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRegisterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.SmaCQA.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataRegister"


    // $ANTLR start "entryRuleToken"
    // InternalSmaCQA.g:1374:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalSmaCQA.g:1374:46: (iv_ruleToken= ruleToken EOF )
            // InternalSmaCQA.g:1375:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalSmaCQA.g:1381:1: ruleToken returns [EObject current=null] : (this_TokenERC20_0= ruleTokenERC20 | this_TokenERC223_1= ruleTokenERC223 | this_TokenERC721_2= ruleTokenERC721 ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        EObject this_TokenERC20_0 = null;

        EObject this_TokenERC223_1 = null;

        EObject this_TokenERC721_2 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:1387:2: ( (this_TokenERC20_0= ruleTokenERC20 | this_TokenERC223_1= ruleTokenERC223 | this_TokenERC721_2= ruleTokenERC721 ) )
            // InternalSmaCQA.g:1388:2: (this_TokenERC20_0= ruleTokenERC20 | this_TokenERC223_1= ruleTokenERC223 | this_TokenERC721_2= ruleTokenERC721 )
            {
            // InternalSmaCQA.g:1388:2: (this_TokenERC20_0= ruleTokenERC20 | this_TokenERC223_1= ruleTokenERC223 | this_TokenERC721_2= ruleTokenERC721 )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt42=1;
                }
                break;
            case 41:
                {
                alt42=2;
                }
                break;
            case 47:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSmaCQA.g:1389:3: this_TokenERC20_0= ruleTokenERC20
                    {

                    			newCompositeNode(grammarAccess.getTokenAccess().getTokenERC20ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TokenERC20_0=ruleTokenERC20();

                    state._fsp--;


                    			current = this_TokenERC20_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1398:3: this_TokenERC223_1= ruleTokenERC223
                    {

                    			newCompositeNode(grammarAccess.getTokenAccess().getTokenERC223ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TokenERC223_1=ruleTokenERC223();

                    state._fsp--;


                    			current = this_TokenERC223_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmaCQA.g:1407:3: this_TokenERC721_2= ruleTokenERC721
                    {

                    			newCompositeNode(grammarAccess.getTokenAccess().getTokenERC721ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TokenERC721_2=ruleTokenERC721();

                    state._fsp--;


                    			current = this_TokenERC721_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleTokenERC20"
    // InternalSmaCQA.g:1419:1: entryRuleTokenERC20 returns [EObject current=null] : iv_ruleTokenERC20= ruleTokenERC20 EOF ;
    public final EObject entryRuleTokenERC20() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenERC20 = null;


        try {
            // InternalSmaCQA.g:1419:51: (iv_ruleTokenERC20= ruleTokenERC20 EOF )
            // InternalSmaCQA.g:1420:2: iv_ruleTokenERC20= ruleTokenERC20 EOF
            {
             newCompositeNode(grammarAccess.getTokenERC20Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenERC20=ruleTokenERC20();

            state._fsp--;

             current =iv_ruleTokenERC20; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokenERC20"


    // $ANTLR start "ruleTokenERC20"
    // InternalSmaCQA.g:1426:1: ruleTokenERC20 returns [EObject current=null] : (otherlv_0= 'Data Declaration Token ERC20: ' otherlv_1= 'Token ERC20 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC20 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC20 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC20 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC20' ) ;
    public final EObject ruleTokenERC20() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_symbol_4_0=null;
        Token otherlv_5=null;
        Token lv_decimals_6_0=null;
        Token otherlv_7=null;
        Token lv_supply_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_answerMintSentence_11_1=null;
        Token lv_answerMintSentence_11_2=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_answerBurnSentence_14_1=null;
        Token lv_answerBurnSentence_14_2=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:1432:2: ( (otherlv_0= 'Data Declaration Token ERC20: ' otherlv_1= 'Token ERC20 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC20 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC20 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC20 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC20' ) )
            // InternalSmaCQA.g:1433:2: (otherlv_0= 'Data Declaration Token ERC20: ' otherlv_1= 'Token ERC20 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC20 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC20 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC20 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC20' )
            {
            // InternalSmaCQA.g:1433:2: (otherlv_0= 'Data Declaration Token ERC20: ' otherlv_1= 'Token ERC20 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC20 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC20 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC20 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC20' )
            // InternalSmaCQA.g:1434:3: otherlv_0= 'Data Declaration Token ERC20: ' otherlv_1= 'Token ERC20 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC20 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC20 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC20 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC20'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenERC20Access().getDataDeclarationTokenERC20Keyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenERC20Access().getTokenERC20NameKeyword_1());
            		
            // InternalSmaCQA.g:1442:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmaCQA.g:1443:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:1443:4: (lv_name_2_0= RULE_ID )
            // InternalSmaCQA.g:1444:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTokenERC20Access().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC20Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTokenERC20Access().getTokenERC20SymbolKeyword_3());
            		
            // InternalSmaCQA.g:1464:3: ( (lv_symbol_4_0= RULE_ID ) )
            // InternalSmaCQA.g:1465:4: (lv_symbol_4_0= RULE_ID )
            {
            // InternalSmaCQA.g:1465:4: (lv_symbol_4_0= RULE_ID )
            // InternalSmaCQA.g:1466:5: lv_symbol_4_0= RULE_ID
            {
            lv_symbol_4_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(lv_symbol_4_0, grammarAccess.getTokenERC20Access().getSymbolIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC20Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_58); 

            			newLeafNode(otherlv_5, grammarAccess.getTokenERC20Access().getTokenERC20DecimalsKeyword_5());
            		
            // InternalSmaCQA.g:1486:3: ( (lv_decimals_6_0= RULE_INT ) )
            // InternalSmaCQA.g:1487:4: (lv_decimals_6_0= RULE_INT )
            {
            // InternalSmaCQA.g:1487:4: (lv_decimals_6_0= RULE_INT )
            // InternalSmaCQA.g:1488:5: lv_decimals_6_0= RULE_INT
            {
            lv_decimals_6_0=(Token)match(input,RULE_INT,FOLLOW_59); 

            					newLeafNode(lv_decimals_6_0, grammarAccess.getTokenERC20Access().getDecimalsINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC20Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"decimals",
            						lv_decimals_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getTokenERC20Access().getTokenERC20SupplyKeyword_7());
            		
            // InternalSmaCQA.g:1508:3: ( (lv_supply_8_0= RULE_INT ) )
            // InternalSmaCQA.g:1509:4: (lv_supply_8_0= RULE_INT )
            {
            // InternalSmaCQA.g:1509:4: (lv_supply_8_0= RULE_INT )
            // InternalSmaCQA.g:1510:5: lv_supply_8_0= RULE_INT
            {
            lv_supply_8_0=(Token)match(input,RULE_INT,FOLLOW_60); 

            					newLeafNode(lv_supply_8_0, grammarAccess.getTokenERC20Access().getSupplyINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC20Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"supply",
            						lv_supply_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_47); 

            			newLeafNode(otherlv_9, grammarAccess.getTokenERC20Access().getIsItPossibleToIncreaseTheTotalSupplyOnceItIsAlreadyInCirculationMintMoreKeyword_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_10, grammarAccess.getTokenERC20Access().getAnswerKeyword_10());
            		
            // InternalSmaCQA.g:1534:3: ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) )
            // InternalSmaCQA.g:1535:4: ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) )
            {
            // InternalSmaCQA.g:1535:4: ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) )
            // InternalSmaCQA.g:1536:5: (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' )
            {
            // InternalSmaCQA.g:1536:5: (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            else if ( (LA43_0==26) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalSmaCQA.g:1537:6: lv_answerMintSentence_11_1= 'yes'
                    {
                    lv_answerMintSentence_11_1=(Token)match(input,25,FOLLOW_61); 

                    						newLeafNode(lv_answerMintSentence_11_1, grammarAccess.getTokenERC20Access().getAnswerMintSentenceYesKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC20Rule());
                    						}
                    						setWithLastConsumed(current, "answerMintSentence", lv_answerMintSentence_11_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1548:6: lv_answerMintSentence_11_2= 'no'
                    {
                    lv_answerMintSentence_11_2=(Token)match(input,26,FOLLOW_61); 

                    						newLeafNode(lv_answerMintSentence_11_2, grammarAccess.getTokenERC20Access().getAnswerMintSentenceNoKeyword_11_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC20Rule());
                    						}
                    						setWithLastConsumed(current, "answerMintSentence", lv_answerMintSentence_11_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_12=(Token)match(input,39,FOLLOW_47); 

            			newLeafNode(otherlv_12, grammarAccess.getTokenERC20Access().getIsItPossibleToRemoveACertainAmountOfTokenFromCirculationBurnTokenKeyword_12());
            		
            otherlv_13=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_13, grammarAccess.getTokenERC20Access().getAnswerKeyword_13());
            		
            // InternalSmaCQA.g:1569:3: ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) )
            // InternalSmaCQA.g:1570:4: ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) )
            {
            // InternalSmaCQA.g:1570:4: ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) )
            // InternalSmaCQA.g:1571:5: (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' )
            {
            // InternalSmaCQA.g:1571:5: (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            else if ( (LA44_0==26) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSmaCQA.g:1572:6: lv_answerBurnSentence_14_1= 'yes'
                    {
                    lv_answerBurnSentence_14_1=(Token)match(input,25,FOLLOW_62); 

                    						newLeafNode(lv_answerBurnSentence_14_1, grammarAccess.getTokenERC20Access().getAnswerBurnSentenceYesKeyword_14_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC20Rule());
                    						}
                    						setWithLastConsumed(current, "answerBurnSentence", lv_answerBurnSentence_14_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1583:6: lv_answerBurnSentence_14_2= 'no'
                    {
                    lv_answerBurnSentence_14_2=(Token)match(input,26,FOLLOW_62); 

                    						newLeafNode(lv_answerBurnSentence_14_2, grammarAccess.getTokenERC20Access().getAnswerBurnSentenceNoKeyword_14_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC20Rule());
                    						}
                    						setWithLastConsumed(current, "answerBurnSentence", lv_answerBurnSentence_14_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_15=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTokenERC20Access().getEndDataDeclarationTokenERC20Keyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokenERC20"


    // $ANTLR start "entryRuleTokenERC223"
    // InternalSmaCQA.g:1604:1: entryRuleTokenERC223 returns [EObject current=null] : iv_ruleTokenERC223= ruleTokenERC223 EOF ;
    public final EObject entryRuleTokenERC223() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenERC223 = null;


        try {
            // InternalSmaCQA.g:1604:52: (iv_ruleTokenERC223= ruleTokenERC223 EOF )
            // InternalSmaCQA.g:1605:2: iv_ruleTokenERC223= ruleTokenERC223 EOF
            {
             newCompositeNode(grammarAccess.getTokenERC223Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenERC223=ruleTokenERC223();

            state._fsp--;

             current =iv_ruleTokenERC223; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokenERC223"


    // $ANTLR start "ruleTokenERC223"
    // InternalSmaCQA.g:1611:1: ruleTokenERC223 returns [EObject current=null] : (otherlv_0= 'Data Declaration Token ERC223: ' otherlv_1= 'Token ERC223 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC223 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC223 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC223 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC223' ) ;
    public final EObject ruleTokenERC223() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_symbol_4_0=null;
        Token otherlv_5=null;
        Token lv_decimals_6_0=null;
        Token otherlv_7=null;
        Token lv_supply_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_answerMintSentence_11_1=null;
        Token lv_answerMintSentence_11_2=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_answerBurnSentence_14_1=null;
        Token lv_answerBurnSentence_14_2=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:1617:2: ( (otherlv_0= 'Data Declaration Token ERC223: ' otherlv_1= 'Token ERC223 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC223 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC223 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC223 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC223' ) )
            // InternalSmaCQA.g:1618:2: (otherlv_0= 'Data Declaration Token ERC223: ' otherlv_1= 'Token ERC223 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC223 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC223 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC223 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC223' )
            {
            // InternalSmaCQA.g:1618:2: (otherlv_0= 'Data Declaration Token ERC223: ' otherlv_1= 'Token ERC223 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC223 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC223 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC223 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC223' )
            // InternalSmaCQA.g:1619:3: otherlv_0= 'Data Declaration Token ERC223: ' otherlv_1= 'Token ERC223 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC223 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= 'Token ERC223 decimals: ' ( (lv_decimals_6_0= RULE_INT ) ) otherlv_7= 'Token ERC223 supply: ' ( (lv_supply_8_0= RULE_INT ) ) otherlv_9= '1.5.1 Is it possible to increase the total supply once it is already in circulation (mint more)?' otherlv_10= 'answer = ' ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) ) otherlv_12= '1.5.2 Is it possible to remove a certain amount of token from circulation (burn token)?' otherlv_13= 'answer = ' ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) ) otherlv_15= 'End Data Declaration Token ERC223'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenERC223Access().getDataDeclarationTokenERC223Keyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenERC223Access().getTokenERC223NameKeyword_1());
            		
            // InternalSmaCQA.g:1627:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmaCQA.g:1628:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:1628:4: (lv_name_2_0= RULE_ID )
            // InternalSmaCQA.g:1629:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTokenERC223Access().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC223Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTokenERC223Access().getTokenERC223SymbolKeyword_3());
            		
            // InternalSmaCQA.g:1649:3: ( (lv_symbol_4_0= RULE_ID ) )
            // InternalSmaCQA.g:1650:4: (lv_symbol_4_0= RULE_ID )
            {
            // InternalSmaCQA.g:1650:4: (lv_symbol_4_0= RULE_ID )
            // InternalSmaCQA.g:1651:5: lv_symbol_4_0= RULE_ID
            {
            lv_symbol_4_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(lv_symbol_4_0, grammarAccess.getTokenERC223Access().getSymbolIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC223Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_58); 

            			newLeafNode(otherlv_5, grammarAccess.getTokenERC223Access().getTokenERC223DecimalsKeyword_5());
            		
            // InternalSmaCQA.g:1671:3: ( (lv_decimals_6_0= RULE_INT ) )
            // InternalSmaCQA.g:1672:4: (lv_decimals_6_0= RULE_INT )
            {
            // InternalSmaCQA.g:1672:4: (lv_decimals_6_0= RULE_INT )
            // InternalSmaCQA.g:1673:5: lv_decimals_6_0= RULE_INT
            {
            lv_decimals_6_0=(Token)match(input,RULE_INT,FOLLOW_66); 

            					newLeafNode(lv_decimals_6_0, grammarAccess.getTokenERC223Access().getDecimalsINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC223Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"decimals",
            						lv_decimals_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getTokenERC223Access().getTokenERC223SupplyKeyword_7());
            		
            // InternalSmaCQA.g:1693:3: ( (lv_supply_8_0= RULE_INT ) )
            // InternalSmaCQA.g:1694:4: (lv_supply_8_0= RULE_INT )
            {
            // InternalSmaCQA.g:1694:4: (lv_supply_8_0= RULE_INT )
            // InternalSmaCQA.g:1695:5: lv_supply_8_0= RULE_INT
            {
            lv_supply_8_0=(Token)match(input,RULE_INT,FOLLOW_60); 

            					newLeafNode(lv_supply_8_0, grammarAccess.getTokenERC223Access().getSupplyINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC223Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"supply",
            						lv_supply_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_47); 

            			newLeafNode(otherlv_9, grammarAccess.getTokenERC223Access().getIsItPossibleToIncreaseTheTotalSupplyOnceItIsAlreadyInCirculationMintMoreKeyword_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_10, grammarAccess.getTokenERC223Access().getAnswerKeyword_10());
            		
            // InternalSmaCQA.g:1719:3: ( ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) ) )
            // InternalSmaCQA.g:1720:4: ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) )
            {
            // InternalSmaCQA.g:1720:4: ( (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' ) )
            // InternalSmaCQA.g:1721:5: (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' )
            {
            // InternalSmaCQA.g:1721:5: (lv_answerMintSentence_11_1= 'yes' | lv_answerMintSentence_11_2= 'no' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            else if ( (LA45_0==26) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSmaCQA.g:1722:6: lv_answerMintSentence_11_1= 'yes'
                    {
                    lv_answerMintSentence_11_1=(Token)match(input,25,FOLLOW_61); 

                    						newLeafNode(lv_answerMintSentence_11_1, grammarAccess.getTokenERC223Access().getAnswerMintSentenceYesKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC223Rule());
                    						}
                    						setWithLastConsumed(current, "answerMintSentence", lv_answerMintSentence_11_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1733:6: lv_answerMintSentence_11_2= 'no'
                    {
                    lv_answerMintSentence_11_2=(Token)match(input,26,FOLLOW_61); 

                    						newLeafNode(lv_answerMintSentence_11_2, grammarAccess.getTokenERC223Access().getAnswerMintSentenceNoKeyword_11_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC223Rule());
                    						}
                    						setWithLastConsumed(current, "answerMintSentence", lv_answerMintSentence_11_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_12=(Token)match(input,39,FOLLOW_47); 

            			newLeafNode(otherlv_12, grammarAccess.getTokenERC223Access().getIsItPossibleToRemoveACertainAmountOfTokenFromCirculationBurnTokenKeyword_12());
            		
            otherlv_13=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_13, grammarAccess.getTokenERC223Access().getAnswerKeyword_13());
            		
            // InternalSmaCQA.g:1754:3: ( ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) ) )
            // InternalSmaCQA.g:1755:4: ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) )
            {
            // InternalSmaCQA.g:1755:4: ( (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' ) )
            // InternalSmaCQA.g:1756:5: (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' )
            {
            // InternalSmaCQA.g:1756:5: (lv_answerBurnSentence_14_1= 'yes' | lv_answerBurnSentence_14_2= 'no' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            else if ( (LA46_0==26) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSmaCQA.g:1757:6: lv_answerBurnSentence_14_1= 'yes'
                    {
                    lv_answerBurnSentence_14_1=(Token)match(input,25,FOLLOW_67); 

                    						newLeafNode(lv_answerBurnSentence_14_1, grammarAccess.getTokenERC223Access().getAnswerBurnSentenceYesKeyword_14_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC223Rule());
                    						}
                    						setWithLastConsumed(current, "answerBurnSentence", lv_answerBurnSentence_14_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1768:6: lv_answerBurnSentence_14_2= 'no'
                    {
                    lv_answerBurnSentence_14_2=(Token)match(input,26,FOLLOW_67); 

                    						newLeafNode(lv_answerBurnSentence_14_2, grammarAccess.getTokenERC223Access().getAnswerBurnSentenceNoKeyword_14_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC223Rule());
                    						}
                    						setWithLastConsumed(current, "answerBurnSentence", lv_answerBurnSentence_14_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_15=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTokenERC223Access().getEndDataDeclarationTokenERC223Keyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokenERC223"


    // $ANTLR start "entryRuleTokenERC721"
    // InternalSmaCQA.g:1789:1: entryRuleTokenERC721 returns [EObject current=null] : iv_ruleTokenERC721= ruleTokenERC721 EOF ;
    public final EObject entryRuleTokenERC721() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenERC721 = null;


        try {
            // InternalSmaCQA.g:1789:52: (iv_ruleTokenERC721= ruleTokenERC721 EOF )
            // InternalSmaCQA.g:1790:2: iv_ruleTokenERC721= ruleTokenERC721 EOF
            {
             newCompositeNode(grammarAccess.getTokenERC721Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenERC721=ruleTokenERC721();

            state._fsp--;

             current =iv_ruleTokenERC721; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokenERC721"


    // $ANTLR start "ruleTokenERC721"
    // InternalSmaCQA.g:1796:1: ruleTokenERC721 returns [EObject current=null] : (otherlv_0= 'Data Declaration Non Fungible Token ERC721: ' otherlv_1= 'Token ERC721 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC721 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= '1.5.1 If it\\'s possible to mint more than one NFT at a time?' otherlv_6= 'answer = ' ( ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) ) ) otherlv_8= '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?' otherlv_9= 'answer = ' ( ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) ) ) otherlv_11= '1.5.3 What is the price of this token?' otherlv_12= 'answer = ' ( (lv_answerUnitPrice_13_0= RULE_INT ) ) ( (lv_answerUnitCoin_14_0= ruleUnitCoin ) ) otherlv_15= '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?' otherlv_16= 'answer = ' ( ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) ) ) (otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration' )? (otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) ) )? otherlv_25= 'End Data Declaration Token ERC721' ) ;
    public final EObject ruleTokenERC721() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_symbol_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_answerMintSentence_7_1=null;
        Token lv_answerMintSentence_7_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_answerBurnSentence_10_1=null;
        Token lv_answerBurnSentence_10_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_answerUnitPrice_13_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_answerMetadataSentence_17_1=null;
        Token lv_answerMetadataSentence_17_2=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_supply_24_0=null;
        Token otherlv_25=null;
        Enumerator lv_answerUnitCoin_14_0 = null;

        EObject lv_answer_20_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:1802:2: ( (otherlv_0= 'Data Declaration Non Fungible Token ERC721: ' otherlv_1= 'Token ERC721 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC721 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= '1.5.1 If it\\'s possible to mint more than one NFT at a time?' otherlv_6= 'answer = ' ( ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) ) ) otherlv_8= '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?' otherlv_9= 'answer = ' ( ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) ) ) otherlv_11= '1.5.3 What is the price of this token?' otherlv_12= 'answer = ' ( (lv_answerUnitPrice_13_0= RULE_INT ) ) ( (lv_answerUnitCoin_14_0= ruleUnitCoin ) ) otherlv_15= '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?' otherlv_16= 'answer = ' ( ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) ) ) (otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration' )? (otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) ) )? otherlv_25= 'End Data Declaration Token ERC721' ) )
            // InternalSmaCQA.g:1803:2: (otherlv_0= 'Data Declaration Non Fungible Token ERC721: ' otherlv_1= 'Token ERC721 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC721 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= '1.5.1 If it\\'s possible to mint more than one NFT at a time?' otherlv_6= 'answer = ' ( ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) ) ) otherlv_8= '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?' otherlv_9= 'answer = ' ( ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) ) ) otherlv_11= '1.5.3 What is the price of this token?' otherlv_12= 'answer = ' ( (lv_answerUnitPrice_13_0= RULE_INT ) ) ( (lv_answerUnitCoin_14_0= ruleUnitCoin ) ) otherlv_15= '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?' otherlv_16= 'answer = ' ( ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) ) ) (otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration' )? (otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) ) )? otherlv_25= 'End Data Declaration Token ERC721' )
            {
            // InternalSmaCQA.g:1803:2: (otherlv_0= 'Data Declaration Non Fungible Token ERC721: ' otherlv_1= 'Token ERC721 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC721 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= '1.5.1 If it\\'s possible to mint more than one NFT at a time?' otherlv_6= 'answer = ' ( ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) ) ) otherlv_8= '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?' otherlv_9= 'answer = ' ( ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) ) ) otherlv_11= '1.5.3 What is the price of this token?' otherlv_12= 'answer = ' ( (lv_answerUnitPrice_13_0= RULE_INT ) ) ( (lv_answerUnitCoin_14_0= ruleUnitCoin ) ) otherlv_15= '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?' otherlv_16= 'answer = ' ( ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) ) ) (otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration' )? (otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) ) )? otherlv_25= 'End Data Declaration Token ERC721' )
            // InternalSmaCQA.g:1804:3: otherlv_0= 'Data Declaration Non Fungible Token ERC721: ' otherlv_1= 'Token ERC721 name: ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Token ERC721 Symbol: ' ( (lv_symbol_4_0= RULE_ID ) ) otherlv_5= '1.5.1 If it\\'s possible to mint more than one NFT at a time?' otherlv_6= 'answer = ' ( ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) ) ) otherlv_8= '1.5.2 Is it possible to remove/disable the token from circulation (burn token)?' otherlv_9= 'answer = ' ( ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) ) ) otherlv_11= '1.5.3 What is the price of this token?' otherlv_12= 'answer = ' ( (lv_answerUnitPrice_13_0= RULE_INT ) ) ( (lv_answerUnitCoin_14_0= ruleUnitCoin ) ) otherlv_15= '1.5.4 Is necessary attach metadata (Information about the token, example: url image) to the token?' otherlv_16= 'answer = ' ( ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) ) ) (otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration' )? (otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) ) )? otherlv_25= 'End Data Declaration Token ERC721'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenERC721Access().getDataDeclarationNonFungibleTokenERC721Keyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenERC721Access().getTokenERC721NameKeyword_1());
            		
            // InternalSmaCQA.g:1812:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmaCQA.g:1813:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:1813:4: (lv_name_2_0= RULE_ID )
            // InternalSmaCQA.g:1814:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTokenERC721Access().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC721Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getTokenERC721Access().getTokenERC721SymbolKeyword_3());
            		
            // InternalSmaCQA.g:1834:3: ( (lv_symbol_4_0= RULE_ID ) )
            // InternalSmaCQA.g:1835:4: (lv_symbol_4_0= RULE_ID )
            {
            // InternalSmaCQA.g:1835:4: (lv_symbol_4_0= RULE_ID )
            // InternalSmaCQA.g:1836:5: lv_symbol_4_0= RULE_ID
            {
            lv_symbol_4_0=(Token)match(input,RULE_ID,FOLLOW_70); 

            					newLeafNode(lv_symbol_4_0, grammarAccess.getTokenERC721Access().getSymbolIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC721Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getTokenERC721Access().getIfItSPossibleToMintMoreThanOneNFTAtATimeKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_6, grammarAccess.getTokenERC721Access().getAnswerKeyword_6());
            		
            // InternalSmaCQA.g:1860:3: ( ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) ) )
            // InternalSmaCQA.g:1861:4: ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) )
            {
            // InternalSmaCQA.g:1861:4: ( (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' ) )
            // InternalSmaCQA.g:1862:5: (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' )
            {
            // InternalSmaCQA.g:1862:5: (lv_answerMintSentence_7_1= 'yes' | lv_answerMintSentence_7_2= 'no' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            else if ( (LA47_0==26) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSmaCQA.g:1863:6: lv_answerMintSentence_7_1= 'yes'
                    {
                    lv_answerMintSentence_7_1=(Token)match(input,25,FOLLOW_71); 

                    						newLeafNode(lv_answerMintSentence_7_1, grammarAccess.getTokenERC721Access().getAnswerMintSentenceYesKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(current, "answerMintSentence", lv_answerMintSentence_7_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1874:6: lv_answerMintSentence_7_2= 'no'
                    {
                    lv_answerMintSentence_7_2=(Token)match(input,26,FOLLOW_71); 

                    						newLeafNode(lv_answerMintSentence_7_2, grammarAccess.getTokenERC721Access().getAnswerMintSentenceNoKeyword_7_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(current, "answerMintSentence", lv_answerMintSentence_7_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,51,FOLLOW_47); 

            			newLeafNode(otherlv_8, grammarAccess.getTokenERC721Access().getIsItPossibleToRemoveDisableTheTokenFromCirculationBurnTokenKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_9, grammarAccess.getTokenERC721Access().getAnswerKeyword_9());
            		
            // InternalSmaCQA.g:1895:3: ( ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) ) )
            // InternalSmaCQA.g:1896:4: ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) )
            {
            // InternalSmaCQA.g:1896:4: ( (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' ) )
            // InternalSmaCQA.g:1897:5: (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' )
            {
            // InternalSmaCQA.g:1897:5: (lv_answerBurnSentence_10_1= 'yes' | lv_answerBurnSentence_10_2= 'no' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            else if ( (LA48_0==26) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSmaCQA.g:1898:6: lv_answerBurnSentence_10_1= 'yes'
                    {
                    lv_answerBurnSentence_10_1=(Token)match(input,25,FOLLOW_72); 

                    						newLeafNode(lv_answerBurnSentence_10_1, grammarAccess.getTokenERC721Access().getAnswerBurnSentenceYesKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(current, "answerBurnSentence", lv_answerBurnSentence_10_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1909:6: lv_answerBurnSentence_10_2= 'no'
                    {
                    lv_answerBurnSentence_10_2=(Token)match(input,26,FOLLOW_72); 

                    						newLeafNode(lv_answerBurnSentence_10_2, grammarAccess.getTokenERC721Access().getAnswerBurnSentenceNoKeyword_10_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(current, "answerBurnSentence", lv_answerBurnSentence_10_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,52,FOLLOW_47); 

            			newLeafNode(otherlv_11, grammarAccess.getTokenERC721Access().getWhatIsThePriceOfThisTokenKeyword_11());
            		
            otherlv_12=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_12, grammarAccess.getTokenERC721Access().getAnswerKeyword_12());
            		
            // InternalSmaCQA.g:1930:3: ( (lv_answerUnitPrice_13_0= RULE_INT ) )
            // InternalSmaCQA.g:1931:4: (lv_answerUnitPrice_13_0= RULE_INT )
            {
            // InternalSmaCQA.g:1931:4: (lv_answerUnitPrice_13_0= RULE_INT )
            // InternalSmaCQA.g:1932:5: lv_answerUnitPrice_13_0= RULE_INT
            {
            lv_answerUnitPrice_13_0=(Token)match(input,RULE_INT,FOLLOW_73); 

            					newLeafNode(lv_answerUnitPrice_13_0, grammarAccess.getTokenERC721Access().getAnswerUnitPriceINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenERC721Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"answerUnitPrice",
            						lv_answerUnitPrice_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmaCQA.g:1948:3: ( (lv_answerUnitCoin_14_0= ruleUnitCoin ) )
            // InternalSmaCQA.g:1949:4: (lv_answerUnitCoin_14_0= ruleUnitCoin )
            {
            // InternalSmaCQA.g:1949:4: (lv_answerUnitCoin_14_0= ruleUnitCoin )
            // InternalSmaCQA.g:1950:5: lv_answerUnitCoin_14_0= ruleUnitCoin
            {

            					newCompositeNode(grammarAccess.getTokenERC721Access().getAnswerUnitCoinUnitCoinEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_74);
            lv_answerUnitCoin_14_0=ruleUnitCoin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenERC721Rule());
            					}
            					set(
            						current,
            						"answerUnitCoin",
            						lv_answerUnitCoin_14_0,
            						"org.xtext.SmaCQA.UnitCoin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,53,FOLLOW_47); 

            			newLeafNode(otherlv_15, grammarAccess.getTokenERC721Access().getIsNecessaryAttachMetadataInformationAboutTheTokenExampleUrlImageToTheTokenKeyword_15());
            		
            otherlv_16=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_16, grammarAccess.getTokenERC721Access().getAnswerKeyword_16());
            		
            // InternalSmaCQA.g:1975:3: ( ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) ) )
            // InternalSmaCQA.g:1976:4: ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) )
            {
            // InternalSmaCQA.g:1976:4: ( (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' ) )
            // InternalSmaCQA.g:1977:5: (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' )
            {
            // InternalSmaCQA.g:1977:5: (lv_answerMetadataSentence_17_1= 'yes' | lv_answerMetadataSentence_17_2= 'no' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            else if ( (LA49_0==26) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSmaCQA.g:1978:6: lv_answerMetadataSentence_17_1= 'yes'
                    {
                    lv_answerMetadataSentence_17_1=(Token)match(input,25,FOLLOW_75); 

                    						newLeafNode(lv_answerMetadataSentence_17_1, grammarAccess.getTokenERC721Access().getAnswerMetadataSentenceYesKeyword_17_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(current, "answerMetadataSentence", lv_answerMetadataSentence_17_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:1989:6: lv_answerMetadataSentence_17_2= 'no'
                    {
                    lv_answerMetadataSentence_17_2=(Token)match(input,26,FOLLOW_75); 

                    						newLeafNode(lv_answerMetadataSentence_17_2, grammarAccess.getTokenERC721Access().getAnswerMetadataSentenceNoKeyword_17_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(current, "answerMetadataSentence", lv_answerMetadataSentence_17_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:2002:3: (otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSmaCQA.g:2003:4: otherlv_18= '1.5.5 Which data or properties are requiered for the NFT information?' otherlv_19= 'Data Declaration: ' ( (lv_answer_20_0= ruleDataRegister ) )+ otherlv_21= 'End Data Declaration'
                    {
                    otherlv_18=(Token)match(input,54,FOLLOW_50); 

                    				newLeafNode(otherlv_18, grammarAccess.getTokenERC721Access().getWhichDataOrPropertiesAreRequieredForTheNFTInformationKeyword_18_0());
                    			
                    otherlv_19=(Token)match(input,29,FOLLOW_51); 

                    				newLeafNode(otherlv_19, grammarAccess.getTokenERC721Access().getDataDeclarationKeyword_18_1());
                    			
                    // InternalSmaCQA.g:2011:4: ( (lv_answer_20_0= ruleDataRegister ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==31) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalSmaCQA.g:2012:5: (lv_answer_20_0= ruleDataRegister )
                    	    {
                    	    // InternalSmaCQA.g:2012:5: (lv_answer_20_0= ruleDataRegister )
                    	    // InternalSmaCQA.g:2013:6: lv_answer_20_0= ruleDataRegister
                    	    {

                    	    						newCompositeNode(grammarAccess.getTokenERC721Access().getAnswerDataRegisterParserRuleCall_18_2_0());
                    	    					
                    	    pushFollow(FOLLOW_52);
                    	    lv_answer_20_0=ruleDataRegister();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTokenERC721Rule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"answer",
                    	    							lv_answer_20_0,
                    	    							"org.xtext.SmaCQA.DataRegister");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);

                    otherlv_21=(Token)match(input,30,FOLLOW_76); 

                    				newLeafNode(otherlv_21, grammarAccess.getTokenERC721Access().getEndDataDeclarationKeyword_18_3());
                    			

                    }
                    break;

            }

            // InternalSmaCQA.g:2035:3: (otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSmaCQA.g:2036:4: otherlv_22= '1.5.6 If it\\'s possible to define an amount to restrict the amount of NFTs that are minted. What is the maximum amount?' otherlv_23= 'total supply = ' ( (lv_supply_24_0= RULE_INT ) )
                    {
                    otherlv_22=(Token)match(input,55,FOLLOW_77); 

                    				newLeafNode(otherlv_22, grammarAccess.getTokenERC721Access().getIfItSPossibleToDefineAnAmountToRestrictTheAmountOfNFTsThatAreMintedWhatIsTheMaximumAmountKeyword_19_0());
                    			
                    otherlv_23=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_23, grammarAccess.getTokenERC721Access().getTotalSupplyKeyword_19_1());
                    			
                    // InternalSmaCQA.g:2044:4: ( (lv_supply_24_0= RULE_INT ) )
                    // InternalSmaCQA.g:2045:5: (lv_supply_24_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:2045:5: (lv_supply_24_0= RULE_INT )
                    // InternalSmaCQA.g:2046:6: lv_supply_24_0= RULE_INT
                    {
                    lv_supply_24_0=(Token)match(input,RULE_INT,FOLLOW_78); 

                    						newLeafNode(lv_supply_24_0, grammarAccess.getTokenERC721Access().getSupplyINTTerminalRuleCall_19_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTokenERC721Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"supply",
                    							lv_supply_24_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getTokenERC721Access().getEndDataDeclarationTokenERC721Keyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokenERC721"


    // $ANTLR start "entryRuleTimeValueExchangeDurationQuestion"
    // InternalSmaCQA.g:2071:1: entryRuleTimeValueExchangeDurationQuestion returns [EObject current=null] : iv_ruleTimeValueExchangeDurationQuestion= ruleTimeValueExchangeDurationQuestion EOF ;
    public final EObject entryRuleTimeValueExchangeDurationQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeValueExchangeDurationQuestion = null;


        try {
            // InternalSmaCQA.g:2071:74: (iv_ruleTimeValueExchangeDurationQuestion= ruleTimeValueExchangeDurationQuestion EOF )
            // InternalSmaCQA.g:2072:2: iv_ruleTimeValueExchangeDurationQuestion= ruleTimeValueExchangeDurationQuestion EOF
            {
             newCompositeNode(grammarAccess.getTimeValueExchangeDurationQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeValueExchangeDurationQuestion=ruleTimeValueExchangeDurationQuestion();

            state._fsp--;

             current =iv_ruleTimeValueExchangeDurationQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeValueExchangeDurationQuestion"


    // $ANTLR start "ruleTimeValueExchangeDurationQuestion"
    // InternalSmaCQA.g:2078:1: ruleTimeValueExchangeDurationQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) ) ;
    public final EObject ruleTimeValueExchangeDurationQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_answerUnitTime_4_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:2084:2: ( ( ( (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) ) )
            // InternalSmaCQA.g:2085:2: ( ( (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) )
            {
            // InternalSmaCQA.g:2085:2: ( ( (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) )
            // InternalSmaCQA.g:2086:3: ( (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) )
            {
            // InternalSmaCQA.g:2086:3: ( (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' ) )
            // InternalSmaCQA.g:2087:4: (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' )
            {
            // InternalSmaCQA.g:2087:4: (lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)' )
            // InternalSmaCQA.g:2088:5: lv_name_0_0= '1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)'
            {
            lv_name_0_0=(Token)match(input,58,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTimeValueExchangeDurationQuestionAccess().getName11IfTheExchangeOfValueIsSubjectToADurationOfTimeWhatWouldThisBeIndicatedInMinutesDaysWeeksOrYearsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeValueExchangeDurationQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.1 If the exchange of value is subject to a duration of time. What would this be?(indicated in minutes,days,weeks or years)");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeValueExchangeDurationQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2104:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:2105:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:2105:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:2106:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_79); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getTimeValueExchangeDurationQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeValueExchangeDurationQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeValueExchangeDurationQuestionAccess().getUnitTimeKeyword_3());
            		
            // InternalSmaCQA.g:2126:3: ( (lv_answerUnitTime_4_0= ruleUnitTime ) )
            // InternalSmaCQA.g:2127:4: (lv_answerUnitTime_4_0= ruleUnitTime )
            {
            // InternalSmaCQA.g:2127:4: (lv_answerUnitTime_4_0= ruleUnitTime )
            // InternalSmaCQA.g:2128:5: lv_answerUnitTime_4_0= ruleUnitTime
            {

            					newCompositeNode(grammarAccess.getTimeValueExchangeDurationQuestionAccess().getAnswerUnitTimeUnitTimeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_answerUnitTime_4_0=ruleUnitTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeValueExchangeDurationQuestionRule());
            					}
            					set(
            						current,
            						"answerUnitTime",
            						lv_answerUnitTime_4_0,
            						"org.xtext.SmaCQA.UnitTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeValueExchangeDurationQuestion"


    // $ANTLR start "entryRuleTimeStartValueExchangeQuestion"
    // InternalSmaCQA.g:2149:1: entryRuleTimeStartValueExchangeQuestion returns [EObject current=null] : iv_ruleTimeStartValueExchangeQuestion= ruleTimeStartValueExchangeQuestion EOF ;
    public final EObject entryRuleTimeStartValueExchangeQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeStartValueExchangeQuestion = null;


        try {
            // InternalSmaCQA.g:2149:71: (iv_ruleTimeStartValueExchangeQuestion= ruleTimeStartValueExchangeQuestion EOF )
            // InternalSmaCQA.g:2150:2: iv_ruleTimeStartValueExchangeQuestion= ruleTimeStartValueExchangeQuestion EOF
            {
             newCompositeNode(grammarAccess.getTimeStartValueExchangeQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeStartValueExchangeQuestion=ruleTimeStartValueExchangeQuestion();

            state._fsp--;

             current =iv_ruleTimeStartValueExchangeQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeStartValueExchangeQuestion"


    // $ANTLR start "ruleTimeStartValueExchangeQuestion"
    // InternalSmaCQA.g:2156:1: ruleTimeStartValueExchangeQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) ) ;
    public final EObject ruleTimeStartValueExchangeQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_answerUnitTime_4_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:2162:2: ( ( ( (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) ) )
            // InternalSmaCQA.g:2163:2: ( ( (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) )
            {
            // InternalSmaCQA.g:2163:2: ( ( (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) )
            // InternalSmaCQA.g:2164:3: ( (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) )
            {
            // InternalSmaCQA.g:2164:3: ( (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' ) )
            // InternalSmaCQA.g:2165:4: (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' )
            {
            // InternalSmaCQA.g:2165:4: (lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)' )
            // InternalSmaCQA.g:2166:5: lv_name_0_0= '1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)'
            {
            lv_name_0_0=(Token)match(input,60,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTimeStartValueExchangeQuestionAccess().getName12IfTheExchangeOfValueCouldOnlyTakePlaceAfterACertainTimeWhatWouldThisBeIndicatedInMinutesDaysWeeksOrYearsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeStartValueExchangeQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.2 If the exchange of value could only take place after a certain time. What would this be?(indicated in minutes,days,weeks or years)");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeStartValueExchangeQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2182:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:2183:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:2183:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:2184:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_79); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getTimeStartValueExchangeQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeStartValueExchangeQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeStartValueExchangeQuestionAccess().getUnitTimeKeyword_3());
            		
            // InternalSmaCQA.g:2204:3: ( (lv_answerUnitTime_4_0= ruleUnitTime ) )
            // InternalSmaCQA.g:2205:4: (lv_answerUnitTime_4_0= ruleUnitTime )
            {
            // InternalSmaCQA.g:2205:4: (lv_answerUnitTime_4_0= ruleUnitTime )
            // InternalSmaCQA.g:2206:5: lv_answerUnitTime_4_0= ruleUnitTime
            {

            					newCompositeNode(grammarAccess.getTimeStartValueExchangeQuestionAccess().getAnswerUnitTimeUnitTimeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_answerUnitTime_4_0=ruleUnitTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeStartValueExchangeQuestionRule());
            					}
            					set(
            						current,
            						"answerUnitTime",
            						lv_answerUnitTime_4_0,
            						"org.xtext.SmaCQA.UnitTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeStartValueExchangeQuestion"


    // $ANTLR start "entryRuleRepeatValueExchangeQuestion"
    // InternalSmaCQA.g:2227:1: entryRuleRepeatValueExchangeQuestion returns [EObject current=null] : iv_ruleRepeatValueExchangeQuestion= ruleRepeatValueExchangeQuestion EOF ;
    public final EObject entryRuleRepeatValueExchangeQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatValueExchangeQuestion = null;


        try {
            // InternalSmaCQA.g:2227:68: (iv_ruleRepeatValueExchangeQuestion= ruleRepeatValueExchangeQuestion EOF )
            // InternalSmaCQA.g:2228:2: iv_ruleRepeatValueExchangeQuestion= ruleRepeatValueExchangeQuestion EOF
            {
             newCompositeNode(grammarAccess.getRepeatValueExchangeQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatValueExchangeQuestion=ruleRepeatValueExchangeQuestion();

            state._fsp--;

             current =iv_ruleRepeatValueExchangeQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeatValueExchangeQuestion"


    // $ANTLR start "ruleRepeatValueExchangeQuestion"
    // InternalSmaCQA.g:2234:1: ruleRepeatValueExchangeQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleRepeatValueExchangeQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2240:2: ( ( ( (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:2241:2: ( ( (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:2241:2: ( ( (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:2242:3: ( (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:2242:3: ( (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' ) )
            // InternalSmaCQA.g:2243:4: (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' )
            {
            // InternalSmaCQA.g:2243:4: (lv_name_0_0= '1.3 Can the value exchange be repeated over time?' )
            // InternalSmaCQA.g:2244:5: lv_name_0_0= '1.3 Can the value exchange be repeated over time?'
            {
            lv_name_0_0=(Token)match(input,61,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRepeatValueExchangeQuestionAccess().getName13CanTheValueExchangeBeRepeatedOverTimeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatValueExchangeQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.3 Can the value exchange be repeated over time?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatValueExchangeQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2260:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:2261:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:2261:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:2262:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:2262:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==25) ) {
                alt53=1;
            }
            else if ( (LA53_0==26) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalSmaCQA.g:2263:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getRepeatValueExchangeQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRepeatValueExchangeQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:2274:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getRepeatValueExchangeQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRepeatValueExchangeQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeatValueExchangeQuestion"


    // $ANTLR start "entryRuleConditionsValueExchangeQuestion"
    // InternalSmaCQA.g:2291:1: entryRuleConditionsValueExchangeQuestion returns [EObject current=null] : iv_ruleConditionsValueExchangeQuestion= ruleConditionsValueExchangeQuestion EOF ;
    public final EObject entryRuleConditionsValueExchangeQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionsValueExchangeQuestion = null;


        try {
            // InternalSmaCQA.g:2291:72: (iv_ruleConditionsValueExchangeQuestion= ruleConditionsValueExchangeQuestion EOF )
            // InternalSmaCQA.g:2292:2: iv_ruleConditionsValueExchangeQuestion= ruleConditionsValueExchangeQuestion EOF
            {
             newCompositeNode(grammarAccess.getConditionsValueExchangeQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionsValueExchangeQuestion=ruleConditionsValueExchangeQuestion();

            state._fsp--;

             current =iv_ruleConditionsValueExchangeQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionsValueExchangeQuestion"


    // $ANTLR start "ruleConditionsValueExchangeQuestion"
    // InternalSmaCQA.g:2298:1: ruleConditionsValueExchangeQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleConditionsValueExchangeQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2304:2: ( ( ( (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:2305:2: ( ( (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:2305:2: ( ( (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:2306:3: ( (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:2306:3: ( (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' ) )
            // InternalSmaCQA.g:2307:4: (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' )
            {
            // InternalSmaCQA.g:2307:4: (lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?' )
            // InternalSmaCQA.g:2308:5: lv_name_0_0= '1.4 Are the same conditions always maintained when exchanging value?'
            {
            lv_name_0_0=(Token)match(input,62,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConditionsValueExchangeQuestionAccess().getName14AreTheSameConditionsAlwaysMaintainedWhenExchangingValueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionsValueExchangeQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "1.4 Are the same conditions always maintained when exchanging value?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionsValueExchangeQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2324:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:2325:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:2325:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:2326:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:2326:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            else if ( (LA54_0==26) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalSmaCQA.g:2327:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getConditionsValueExchangeQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionsValueExchangeQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:2338:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getConditionsValueExchangeQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionsValueExchangeQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionsValueExchangeQuestion"


    // $ANTLR start "entryRuleLegalQuestion"
    // InternalSmaCQA.g:2355:1: entryRuleLegalQuestion returns [EObject current=null] : iv_ruleLegalQuestion= ruleLegalQuestion EOF ;
    public final EObject entryRuleLegalQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegalQuestion = null;


        try {
            // InternalSmaCQA.g:2355:54: (iv_ruleLegalQuestion= ruleLegalQuestion EOF )
            // InternalSmaCQA.g:2356:2: iv_ruleLegalQuestion= ruleLegalQuestion EOF
            {
             newCompositeNode(grammarAccess.getLegalQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegalQuestion=ruleLegalQuestion();

            state._fsp--;

             current =iv_ruleLegalQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLegalQuestion"


    // $ANTLR start "ruleLegalQuestion"
    // InternalSmaCQA.g:2362:1: ruleLegalQuestion returns [EObject current=null] : ( ( (lv_ageQuestion_0_0= ruleAgeQuestion ) )? ( (lv_taxQuestion_1_0= ruleTaxQuestion ) )? ( (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion ) )? ( (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion ) )? ) ;
    public final EObject ruleLegalQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_ageQuestion_0_0 = null;

        EObject lv_taxQuestion_1_0 = null;

        EObject lv_additionalLegalDocument_2_0 = null;

        EObject lv_regulatoryCompliance_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:2368:2: ( ( ( (lv_ageQuestion_0_0= ruleAgeQuestion ) )? ( (lv_taxQuestion_1_0= ruleTaxQuestion ) )? ( (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion ) )? ( (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion ) )? ) )
            // InternalSmaCQA.g:2369:2: ( ( (lv_ageQuestion_0_0= ruleAgeQuestion ) )? ( (lv_taxQuestion_1_0= ruleTaxQuestion ) )? ( (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion ) )? ( (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion ) )? )
            {
            // InternalSmaCQA.g:2369:2: ( ( (lv_ageQuestion_0_0= ruleAgeQuestion ) )? ( (lv_taxQuestion_1_0= ruleTaxQuestion ) )? ( (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion ) )? ( (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion ) )? )
            // InternalSmaCQA.g:2370:3: ( (lv_ageQuestion_0_0= ruleAgeQuestion ) )? ( (lv_taxQuestion_1_0= ruleTaxQuestion ) )? ( (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion ) )? ( (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion ) )?
            {
            // InternalSmaCQA.g:2370:3: ( (lv_ageQuestion_0_0= ruleAgeQuestion ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==63) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSmaCQA.g:2371:4: (lv_ageQuestion_0_0= ruleAgeQuestion )
                    {
                    // InternalSmaCQA.g:2371:4: (lv_ageQuestion_0_0= ruleAgeQuestion )
                    // InternalSmaCQA.g:2372:5: lv_ageQuestion_0_0= ruleAgeQuestion
                    {

                    					newCompositeNode(grammarAccess.getLegalQuestionAccess().getAgeQuestionAgeQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_81);
                    lv_ageQuestion_0_0=ruleAgeQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLegalQuestionRule());
                    					}
                    					set(
                    						current,
                    						"ageQuestion",
                    						lv_ageQuestion_0_0,
                    						"org.xtext.SmaCQA.AgeQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:2389:3: ( (lv_taxQuestion_1_0= ruleTaxQuestion ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==64) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSmaCQA.g:2390:4: (lv_taxQuestion_1_0= ruleTaxQuestion )
                    {
                    // InternalSmaCQA.g:2390:4: (lv_taxQuestion_1_0= ruleTaxQuestion )
                    // InternalSmaCQA.g:2391:5: lv_taxQuestion_1_0= ruleTaxQuestion
                    {

                    					newCompositeNode(grammarAccess.getLegalQuestionAccess().getTaxQuestionTaxQuestionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_82);
                    lv_taxQuestion_1_0=ruleTaxQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLegalQuestionRule());
                    					}
                    					set(
                    						current,
                    						"taxQuestion",
                    						lv_taxQuestion_1_0,
                    						"org.xtext.SmaCQA.TaxQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:2408:3: ( (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==66) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSmaCQA.g:2409:4: (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion )
                    {
                    // InternalSmaCQA.g:2409:4: (lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion )
                    // InternalSmaCQA.g:2410:5: lv_additionalLegalDocument_2_0= ruleAdditionalLegalDocumentQuestion
                    {

                    					newCompositeNode(grammarAccess.getLegalQuestionAccess().getAdditionalLegalDocumentAdditionalLegalDocumentQuestionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_83);
                    lv_additionalLegalDocument_2_0=ruleAdditionalLegalDocumentQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLegalQuestionRule());
                    					}
                    					set(
                    						current,
                    						"additionalLegalDocument",
                    						lv_additionalLegalDocument_2_0,
                    						"org.xtext.SmaCQA.AdditionalLegalDocumentQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:2427:3: ( (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSmaCQA.g:2428:4: (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion )
                    {
                    // InternalSmaCQA.g:2428:4: (lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion )
                    // InternalSmaCQA.g:2429:5: lv_regulatoryCompliance_3_0= ruleRegulatoryComplianceQuestion
                    {

                    					newCompositeNode(grammarAccess.getLegalQuestionAccess().getRegulatoryComplianceRegulatoryComplianceQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_regulatoryCompliance_3_0=ruleRegulatoryComplianceQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLegalQuestionRule());
                    					}
                    					set(
                    						current,
                    						"regulatoryCompliance",
                    						lv_regulatoryCompliance_3_0,
                    						"org.xtext.SmaCQA.RegulatoryComplianceQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLegalQuestion"


    // $ANTLR start "entryRuleAgeQuestion"
    // InternalSmaCQA.g:2450:1: entryRuleAgeQuestion returns [EObject current=null] : iv_ruleAgeQuestion= ruleAgeQuestion EOF ;
    public final EObject entryRuleAgeQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgeQuestion = null;


        try {
            // InternalSmaCQA.g:2450:52: (iv_ruleAgeQuestion= ruleAgeQuestion EOF )
            // InternalSmaCQA.g:2451:2: iv_ruleAgeQuestion= ruleAgeQuestion EOF
            {
             newCompositeNode(grammarAccess.getAgeQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgeQuestion=ruleAgeQuestion();

            state._fsp--;

             current =iv_ruleAgeQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgeQuestion"


    // $ANTLR start "ruleAgeQuestion"
    // InternalSmaCQA.g:2457:1: ruleAgeQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAgeQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2463:2: ( ( ( (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) ) )
            // InternalSmaCQA.g:2464:2: ( ( (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) )
            {
            // InternalSmaCQA.g:2464:2: ( ( (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) )
            // InternalSmaCQA.g:2465:3: ( (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) )
            {
            // InternalSmaCQA.g:2465:3: ( (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' ) )
            // InternalSmaCQA.g:2466:4: (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' )
            {
            // InternalSmaCQA.g:2466:4: (lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?' )
            // InternalSmaCQA.g:2467:5: lv_name_0_0= '2.1 What would be the minimum legal age if necessary in this exchange?'
            {
            lv_name_0_0=(Token)match(input,63,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAgeQuestionAccess().getName21WhatWouldBeTheMinimumLegalAgeIfNecessaryInThisExchangeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgeQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "2.1  What would be the minimum legal age if necessary in this exchange?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getAgeQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2483:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:2484:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:2484:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:2485:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getAgeQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgeQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgeQuestion"


    // $ANTLR start "entryRuleTaxQuestion"
    // InternalSmaCQA.g:2505:1: entryRuleTaxQuestion returns [EObject current=null] : iv_ruleTaxQuestion= ruleTaxQuestion EOF ;
    public final EObject entryRuleTaxQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaxQuestion = null;


        try {
            // InternalSmaCQA.g:2505:52: (iv_ruleTaxQuestion= ruleTaxQuestion EOF )
            // InternalSmaCQA.g:2506:2: iv_ruleTaxQuestion= ruleTaxQuestion EOF
            {
             newCompositeNode(grammarAccess.getTaxQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaxQuestion=ruleTaxQuestion();

            state._fsp--;

             current =iv_ruleTaxQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaxQuestion"


    // $ANTLR start "ruleTaxQuestion"
    // InternalSmaCQA.g:2512:1: ruleTaxQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '2.2 What is the name of the tax?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ( (lv_subSentence_3_0= '2.2.1 Who collects the tax?' ) ) otherlv_4= 'answer = ' ( (lv_answerSubSentence_5_0= RULE_ID ) ) ) ;
    public final EObject ruleTaxQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;
        Token lv_subSentence_3_0=null;
        Token otherlv_4=null;
        Token lv_answerSubSentence_5_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2518:2: ( ( ( (lv_name_0_0= '2.2 What is the name of the tax?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ( (lv_subSentence_3_0= '2.2.1 Who collects the tax?' ) ) otherlv_4= 'answer = ' ( (lv_answerSubSentence_5_0= RULE_ID ) ) ) )
            // InternalSmaCQA.g:2519:2: ( ( (lv_name_0_0= '2.2 What is the name of the tax?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ( (lv_subSentence_3_0= '2.2.1 Who collects the tax?' ) ) otherlv_4= 'answer = ' ( (lv_answerSubSentence_5_0= RULE_ID ) ) )
            {
            // InternalSmaCQA.g:2519:2: ( ( (lv_name_0_0= '2.2 What is the name of the tax?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ( (lv_subSentence_3_0= '2.2.1 Who collects the tax?' ) ) otherlv_4= 'answer = ' ( (lv_answerSubSentence_5_0= RULE_ID ) ) )
            // InternalSmaCQA.g:2520:3: ( (lv_name_0_0= '2.2 What is the name of the tax?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ( (lv_subSentence_3_0= '2.2.1 Who collects the tax?' ) ) otherlv_4= 'answer = ' ( (lv_answerSubSentence_5_0= RULE_ID ) )
            {
            // InternalSmaCQA.g:2520:3: ( (lv_name_0_0= '2.2 What is the name of the tax?' ) )
            // InternalSmaCQA.g:2521:4: (lv_name_0_0= '2.2 What is the name of the tax?' )
            {
            // InternalSmaCQA.g:2521:4: (lv_name_0_0= '2.2 What is the name of the tax?' )
            // InternalSmaCQA.g:2522:5: lv_name_0_0= '2.2 What is the name of the tax?'
            {
            lv_name_0_0=(Token)match(input,64,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTaxQuestionAccess().getName22WhatIsTheNameOfTheTaxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "2.2 What is the name of the tax?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTaxQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2538:3: ( (lv_answer_2_0= RULE_ID ) )
            // InternalSmaCQA.g:2539:4: (lv_answer_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:2539:4: (lv_answer_2_0= RULE_ID )
            // InternalSmaCQA.g:2540:5: lv_answer_2_0= RULE_ID
            {
            lv_answer_2_0=(Token)match(input,RULE_ID,FOLLOW_84); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getTaxQuestionAccess().getAnswerIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmaCQA.g:2556:3: ( (lv_subSentence_3_0= '2.2.1 Who collects the tax?' ) )
            // InternalSmaCQA.g:2557:4: (lv_subSentence_3_0= '2.2.1 Who collects the tax?' )
            {
            // InternalSmaCQA.g:2557:4: (lv_subSentence_3_0= '2.2.1 Who collects the tax?' )
            // InternalSmaCQA.g:2558:5: lv_subSentence_3_0= '2.2.1 Who collects the tax?'
            {
            lv_subSentence_3_0=(Token)match(input,65,FOLLOW_47); 

            					newLeafNode(lv_subSentence_3_0, grammarAccess.getTaxQuestionAccess().getSubSentence221WhoCollectsTheTaxKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxQuestionRule());
            					}
            					setWithLastConsumed(current, "subSentence", lv_subSentence_3_0, "2.2.1 Who collects the tax?");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTaxQuestionAccess().getAnswerKeyword_4());
            		
            // InternalSmaCQA.g:2574:3: ( (lv_answerSubSentence_5_0= RULE_ID ) )
            // InternalSmaCQA.g:2575:4: (lv_answerSubSentence_5_0= RULE_ID )
            {
            // InternalSmaCQA.g:2575:4: (lv_answerSubSentence_5_0= RULE_ID )
            // InternalSmaCQA.g:2576:5: lv_answerSubSentence_5_0= RULE_ID
            {
            lv_answerSubSentence_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_answerSubSentence_5_0, grammarAccess.getTaxQuestionAccess().getAnswerSubSentenceIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answerSubSentence",
            						lv_answerSubSentence_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaxQuestion"


    // $ANTLR start "entryRuleAdditionalLegalDocumentQuestion"
    // InternalSmaCQA.g:2596:1: entryRuleAdditionalLegalDocumentQuestion returns [EObject current=null] : iv_ruleAdditionalLegalDocumentQuestion= ruleAdditionalLegalDocumentQuestion EOF ;
    public final EObject entryRuleAdditionalLegalDocumentQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalLegalDocumentQuestion = null;


        try {
            // InternalSmaCQA.g:2596:72: (iv_ruleAdditionalLegalDocumentQuestion= ruleAdditionalLegalDocumentQuestion EOF )
            // InternalSmaCQA.g:2597:2: iv_ruleAdditionalLegalDocumentQuestion= ruleAdditionalLegalDocumentQuestion EOF
            {
             newCompositeNode(grammarAccess.getAdditionalLegalDocumentQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalLegalDocumentQuestion=ruleAdditionalLegalDocumentQuestion();

            state._fsp--;

             current =iv_ruleAdditionalLegalDocumentQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalLegalDocumentQuestion"


    // $ANTLR start "ruleAdditionalLegalDocumentQuestion"
    // InternalSmaCQA.g:2603:1: ruleAdditionalLegalDocumentQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleAdditionalLegalDocumentQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2609:2: ( ( ( (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:2610:2: ( ( (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:2610:2: ( ( (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:2611:3: ( (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:2611:3: ( (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' ) )
            // InternalSmaCQA.g:2612:4: (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' )
            {
            // InternalSmaCQA.g:2612:4: (lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?' )
            // InternalSmaCQA.g:2613:5: lv_name_0_0= '2.3 Is another legal document complementary to this SmartContract necessary?'
            {
            lv_name_0_0=(Token)match(input,66,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAdditionalLegalDocumentQuestionAccess().getName23IsAnotherLegalDocumentComplementaryToThisSmartContractNecessaryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionalLegalDocumentQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "2.3 Is another legal document complementary to this SmartContract necessary?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalLegalDocumentQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2629:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:2630:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:2630:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:2631:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:2631:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            else if ( (LA59_0==26) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalSmaCQA.g:2632:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getAdditionalLegalDocumentQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionalLegalDocumentQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:2643:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getAdditionalLegalDocumentQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionalLegalDocumentQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalLegalDocumentQuestion"


    // $ANTLR start "entryRuleRegulatoryComplianceQuestion"
    // InternalSmaCQA.g:2660:1: entryRuleRegulatoryComplianceQuestion returns [EObject current=null] : iv_ruleRegulatoryComplianceQuestion= ruleRegulatoryComplianceQuestion EOF ;
    public final EObject entryRuleRegulatoryComplianceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegulatoryComplianceQuestion = null;


        try {
            // InternalSmaCQA.g:2660:69: (iv_ruleRegulatoryComplianceQuestion= ruleRegulatoryComplianceQuestion EOF )
            // InternalSmaCQA.g:2661:2: iv_ruleRegulatoryComplianceQuestion= ruleRegulatoryComplianceQuestion EOF
            {
             newCompositeNode(grammarAccess.getRegulatoryComplianceQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegulatoryComplianceQuestion=ruleRegulatoryComplianceQuestion();

            state._fsp--;

             current =iv_ruleRegulatoryComplianceQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegulatoryComplianceQuestion"


    // $ANTLR start "ruleRegulatoryComplianceQuestion"
    // InternalSmaCQA.g:2667:1: ruleRegulatoryComplianceQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRegulatoryComplianceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2673:2: ( ( ( (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ) )
            // InternalSmaCQA.g:2674:2: ( ( (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) )
            {
            // InternalSmaCQA.g:2674:2: ( ( (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) )
            // InternalSmaCQA.g:2675:3: ( (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) )
            {
            // InternalSmaCQA.g:2675:3: ( (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' ) )
            // InternalSmaCQA.g:2676:4: (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' )
            {
            // InternalSmaCQA.g:2676:4: (lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?' )
            // InternalSmaCQA.g:2677:5: lv_name_0_0= '2.4 Who is responsible for ensuring compliance with regulations?'
            {
            lv_name_0_0=(Token)match(input,67,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRegulatoryComplianceQuestionAccess().getName24WhoIsResponsibleForEnsuringComplianceWithRegulationsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryComplianceQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "2.4 Who is responsible for ensuring compliance with regulations?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRegulatoryComplianceQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2693:3: ( (lv_answer_2_0= RULE_ID ) )
            // InternalSmaCQA.g:2694:4: (lv_answer_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:2694:4: (lv_answer_2_0= RULE_ID )
            // InternalSmaCQA.g:2695:5: lv_answer_2_0= RULE_ID
            {
            lv_answer_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getRegulatoryComplianceQuestionAccess().getAnswerIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegulatoryComplianceQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegulatoryComplianceQuestion"


    // $ANTLR start "entryRuleEconomyQuestion"
    // InternalSmaCQA.g:2715:1: entryRuleEconomyQuestion returns [EObject current=null] : iv_ruleEconomyQuestion= ruleEconomyQuestion EOF ;
    public final EObject entryRuleEconomyQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEconomyQuestion = null;


        try {
            // InternalSmaCQA.g:2715:56: (iv_ruleEconomyQuestion= ruleEconomyQuestion EOF )
            // InternalSmaCQA.g:2716:2: iv_ruleEconomyQuestion= ruleEconomyQuestion EOF
            {
             newCompositeNode(grammarAccess.getEconomyQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEconomyQuestion=ruleEconomyQuestion();

            state._fsp--;

             current =iv_ruleEconomyQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEconomyQuestion"


    // $ANTLR start "ruleEconomyQuestion"
    // InternalSmaCQA.g:2722:1: ruleEconomyQuestion returns [EObject current=null] : ( ( (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion ) )? ( (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion ) )? ) ;
    public final EObject ruleEconomyQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_minimumAmountQuestion_0_0 = null;

        EObject lv_shipmentCostResponsibility_1_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:2728:2: ( ( ( (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion ) )? ( (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion ) )? ) )
            // InternalSmaCQA.g:2729:2: ( ( (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion ) )? ( (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion ) )? )
            {
            // InternalSmaCQA.g:2729:2: ( ( (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion ) )? ( (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion ) )? )
            // InternalSmaCQA.g:2730:3: ( (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion ) )? ( (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion ) )?
            {
            // InternalSmaCQA.g:2730:3: ( (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==68) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSmaCQA.g:2731:4: (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion )
                    {
                    // InternalSmaCQA.g:2731:4: (lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion )
                    // InternalSmaCQA.g:2732:5: lv_minimumAmountQuestion_0_0= ruleMinimumAmountQuestion
                    {

                    					newCompositeNode(grammarAccess.getEconomyQuestionAccess().getMinimumAmountQuestionMinimumAmountQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_85);
                    lv_minimumAmountQuestion_0_0=ruleMinimumAmountQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEconomyQuestionRule());
                    					}
                    					set(
                    						current,
                    						"minimumAmountQuestion",
                    						lv_minimumAmountQuestion_0_0,
                    						"org.xtext.SmaCQA.MinimumAmountQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:2749:3: ( (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSmaCQA.g:2750:4: (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion )
                    {
                    // InternalSmaCQA.g:2750:4: (lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion )
                    // InternalSmaCQA.g:2751:5: lv_shipmentCostResponsibility_1_0= ruleShipmentCostResponsibilityQuestion
                    {

                    					newCompositeNode(grammarAccess.getEconomyQuestionAccess().getShipmentCostResponsibilityShipmentCostResponsibilityQuestionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_shipmentCostResponsibility_1_0=ruleShipmentCostResponsibilityQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEconomyQuestionRule());
                    					}
                    					set(
                    						current,
                    						"shipmentCostResponsibility",
                    						lv_shipmentCostResponsibility_1_0,
                    						"org.xtext.SmaCQA.ShipmentCostResponsibilityQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEconomyQuestion"


    // $ANTLR start "entryRuleMinimumAmountQuestion"
    // InternalSmaCQA.g:2772:1: entryRuleMinimumAmountQuestion returns [EObject current=null] : iv_ruleMinimumAmountQuestion= ruleMinimumAmountQuestion EOF ;
    public final EObject entryRuleMinimumAmountQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumAmountQuestion = null;


        try {
            // InternalSmaCQA.g:2772:62: (iv_ruleMinimumAmountQuestion= ruleMinimumAmountQuestion EOF )
            // InternalSmaCQA.g:2773:2: iv_ruleMinimumAmountQuestion= ruleMinimumAmountQuestion EOF
            {
             newCompositeNode(grammarAccess.getMinimumAmountQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimumAmountQuestion=ruleMinimumAmountQuestion();

            state._fsp--;

             current =iv_ruleMinimumAmountQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimumAmountQuestion"


    // $ANTLR start "ruleMinimumAmountQuestion"
    // InternalSmaCQA.g:2779:1: ruleMinimumAmountQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMinimumAmountQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:2785:2: ( ( ( (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) ) )
            // InternalSmaCQA.g:2786:2: ( ( (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) )
            {
            // InternalSmaCQA.g:2786:2: ( ( (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) )
            // InternalSmaCQA.g:2787:3: ( (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) )
            {
            // InternalSmaCQA.g:2787:3: ( (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' ) )
            // InternalSmaCQA.g:2788:4: (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' )
            {
            // InternalSmaCQA.g:2788:4: (lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?' )
            // InternalSmaCQA.g:2789:5: lv_name_0_0= '3.1 Which would be the minimum amount if necessary in this exchange?'
            {
            lv_name_0_0=(Token)match(input,68,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMinimumAmountQuestionAccess().getName31WhichWouldBeTheMinimumAmountIfNecessaryInThisExchangeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinimumAmountQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "3.1 Which would be the minimum amount if necessary in this exchange?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getMinimumAmountQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:2805:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:2806:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:2806:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:2807:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getMinimumAmountQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinimumAmountQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimumAmountQuestion"


    // $ANTLR start "entryRuleShipmentCostResponsibilityQuestion"
    // InternalSmaCQA.g:2827:1: entryRuleShipmentCostResponsibilityQuestion returns [EObject current=null] : iv_ruleShipmentCostResponsibilityQuestion= ruleShipmentCostResponsibilityQuestion EOF ;
    public final EObject entryRuleShipmentCostResponsibilityQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipmentCostResponsibilityQuestion = null;


        try {
            // InternalSmaCQA.g:2827:75: (iv_ruleShipmentCostResponsibilityQuestion= ruleShipmentCostResponsibilityQuestion EOF )
            // InternalSmaCQA.g:2828:2: iv_ruleShipmentCostResponsibilityQuestion= ruleShipmentCostResponsibilityQuestion EOF
            {
             newCompositeNode(grammarAccess.getShipmentCostResponsibilityQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipmentCostResponsibilityQuestion=ruleShipmentCostResponsibilityQuestion();

            state._fsp--;

             current =iv_ruleShipmentCostResponsibilityQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipmentCostResponsibilityQuestion"


    // $ANTLR start "ruleShipmentCostResponsibilityQuestion"
    // InternalSmaCQA.g:2834:1: ruleShipmentCostResponsibilityQuestion returns [EObject current=null] : ( ( (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' ) ) otherlv_1= 'responsible = ' ( (lv_answer1_2_0= RULE_ID ) ) ( ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) ) )? ( ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) ) )? ( ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) ) )? ( ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) ) )? ) ;
    public final EObject ruleShipmentCostResponsibilityQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_q1_0_0=null;
        Token otherlv_1=null;
        Token lv_answer1_2_0=null;
        Token lv_q2_3_0=null;
        Token otherlv_4=null;
        Token lv_answer2_5_0=null;
        Token otherlv_6=null;
        Token lv_q3_8_0=null;
        Token otherlv_9=null;
        Token lv_answer3_10_0=null;
        Token otherlv_11=null;
        Token lv_q4_13_0=null;
        Token otherlv_14=null;
        Token lv_answer4_15_0=null;
        Token otherlv_16=null;
        Token lv_q5_18_0=null;
        Token otherlv_19=null;
        Token lv_answer5_20_0=null;
        Token otherlv_21=null;
        Enumerator lv_answerUnitCoinFreightRate_7_0 = null;

        Enumerator lv_loadingFeeAnswerUnitCoin_12_0 = null;

        Enumerator lv_unloadingFeeAnswerUnitCoin_17_0 = null;

        Enumerator lv_transportRateAnswerUnitCoin_22_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:2840:2: ( ( ( (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' ) ) otherlv_1= 'responsible = ' ( (lv_answer1_2_0= RULE_ID ) ) ( ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) ) )? ( ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) ) )? ( ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) ) )? ( ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) ) )? ) )
            // InternalSmaCQA.g:2841:2: ( ( (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' ) ) otherlv_1= 'responsible = ' ( (lv_answer1_2_0= RULE_ID ) ) ( ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) ) )? ( ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) ) )? ( ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) ) )? ( ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) ) )? )
            {
            // InternalSmaCQA.g:2841:2: ( ( (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' ) ) otherlv_1= 'responsible = ' ( (lv_answer1_2_0= RULE_ID ) ) ( ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) ) )? ( ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) ) )? ( ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) ) )? ( ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) ) )? )
            // InternalSmaCQA.g:2842:3: ( (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' ) ) otherlv_1= 'responsible = ' ( (lv_answer1_2_0= RULE_ID ) ) ( ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) ) )? ( ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) ) )? ( ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) ) )? ( ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) ) )?
            {
            // InternalSmaCQA.g:2842:3: ( (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' ) )
            // InternalSmaCQA.g:2843:4: (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' )
            {
            // InternalSmaCQA.g:2843:4: (lv_q1_0_0= '3.2 Who is responsible for the transportation cost?' )
            // InternalSmaCQA.g:2844:5: lv_q1_0_0= '3.2 Who is responsible for the transportation cost?'
            {
            lv_q1_0_0=(Token)match(input,69,FOLLOW_86); 

            					newLeafNode(lv_q1_0_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getQ132WhoIsResponsibleForTheTransportationCostKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
            					}
            					setWithLastConsumed(current, "q1", lv_q1_0_0, "3.2 Who is responsible for the transportation cost?");
            				

            }


            }

            otherlv_1=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getResponsibleKeyword_1());
            		
            // InternalSmaCQA.g:2860:3: ( (lv_answer1_2_0= RULE_ID ) )
            // InternalSmaCQA.g:2861:4: (lv_answer1_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:2861:4: (lv_answer1_2_0= RULE_ID )
            // InternalSmaCQA.g:2862:5: lv_answer1_2_0= RULE_ID
            {
            lv_answer1_2_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_answer1_2_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getAnswer1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer1",
            						lv_answer1_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmaCQA.g:2878:3: ( ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==71) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSmaCQA.g:2879:4: ( (lv_q2_3_0= '3.3 What is the freight rate?' ) ) otherlv_4= 'cost = ' ( (lv_answer2_5_0= RULE_INT ) ) otherlv_6= 'unitCoin=' ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) )
                    {
                    // InternalSmaCQA.g:2879:4: ( (lv_q2_3_0= '3.3 What is the freight rate?' ) )
                    // InternalSmaCQA.g:2880:5: (lv_q2_3_0= '3.3 What is the freight rate?' )
                    {
                    // InternalSmaCQA.g:2880:5: (lv_q2_3_0= '3.3 What is the freight rate?' )
                    // InternalSmaCQA.g:2881:6: lv_q2_3_0= '3.3 What is the freight rate?'
                    {
                    lv_q2_3_0=(Token)match(input,71,FOLLOW_88); 

                    						newLeafNode(lv_q2_3_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getQ233WhatIsTheFreightRateKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q2", lv_q2_3_0, "3.3 What is the freight rate?");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,72,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getCostKeyword_3_1());
                    			
                    // InternalSmaCQA.g:2897:4: ( (lv_answer2_5_0= RULE_INT ) )
                    // InternalSmaCQA.g:2898:5: (lv_answer2_5_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:2898:5: (lv_answer2_5_0= RULE_INT )
                    // InternalSmaCQA.g:2899:6: lv_answer2_5_0= RULE_INT
                    {
                    lv_answer2_5_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    						newLeafNode(lv_answer2_5_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getAnswer2INTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer2",
                    							lv_answer2_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,73,FOLLOW_73); 

                    				newLeafNode(otherlv_6, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getUnitCoinKeyword_3_3());
                    			
                    // InternalSmaCQA.g:2919:4: ( (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin ) )
                    // InternalSmaCQA.g:2920:5: (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin )
                    {
                    // InternalSmaCQA.g:2920:5: (lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin )
                    // InternalSmaCQA.g:2921:6: lv_answerUnitCoinFreightRate_7_0= ruleUnitCoin
                    {

                    						newCompositeNode(grammarAccess.getShipmentCostResponsibilityQuestionAccess().getAnswerUnitCoinFreightRateUnitCoinEnumRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_answerUnitCoinFreightRate_7_0=ruleUnitCoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						set(
                    							current,
                    							"answerUnitCoinFreightRate",
                    							lv_answerUnitCoinFreightRate_7_0,
                    							"org.xtext.SmaCQA.UnitCoin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:2939:3: ( ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==74) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSmaCQA.g:2940:4: ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) ) otherlv_9= 'cost = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) )
                    {
                    // InternalSmaCQA.g:2940:4: ( (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' ) )
                    // InternalSmaCQA.g:2941:5: (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' )
                    {
                    // InternalSmaCQA.g:2941:5: (lv_q3_8_0= '3.4 What is the loading fee (on the ship)?' )
                    // InternalSmaCQA.g:2942:6: lv_q3_8_0= '3.4 What is the loading fee (on the ship)?'
                    {
                    lv_q3_8_0=(Token)match(input,74,FOLLOW_88); 

                    						newLeafNode(lv_q3_8_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getQ334WhatIsTheLoadingFeeOnTheShipKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q3", lv_q3_8_0, "3.4 What is the loading fee (on the ship)?");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,72,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getCostKeyword_4_1());
                    			
                    // InternalSmaCQA.g:2958:4: ( (lv_answer3_10_0= RULE_INT ) )
                    // InternalSmaCQA.g:2959:5: (lv_answer3_10_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:2959:5: (lv_answer3_10_0= RULE_INT )
                    // InternalSmaCQA.g:2960:6: lv_answer3_10_0= RULE_INT
                    {
                    lv_answer3_10_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    						newLeafNode(lv_answer3_10_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getAnswer3INTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer3",
                    							lv_answer3_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,73,FOLLOW_73); 

                    				newLeafNode(otherlv_11, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getUnitCoinKeyword_4_3());
                    			
                    // InternalSmaCQA.g:2980:4: ( (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin ) )
                    // InternalSmaCQA.g:2981:5: (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin )
                    {
                    // InternalSmaCQA.g:2981:5: (lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin )
                    // InternalSmaCQA.g:2982:6: lv_loadingFeeAnswerUnitCoin_12_0= ruleUnitCoin
                    {

                    						newCompositeNode(grammarAccess.getShipmentCostResponsibilityQuestionAccess().getLoadingFeeAnswerUnitCoinUnitCoinEnumRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_loadingFeeAnswerUnitCoin_12_0=ruleUnitCoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						set(
                    							current,
                    							"loadingFeeAnswerUnitCoin",
                    							lv_loadingFeeAnswerUnitCoin_12_0,
                    							"org.xtext.SmaCQA.UnitCoin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:3000:3: ( ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSmaCQA.g:3001:4: ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) ) otherlv_14= 'cost = ' ( (lv_answer4_15_0= RULE_INT ) ) otherlv_16= 'unitCoin=' ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) )
                    {
                    // InternalSmaCQA.g:3001:4: ( (lv_q4_13_0= '3.5 What is the unloading fee?' ) )
                    // InternalSmaCQA.g:3002:5: (lv_q4_13_0= '3.5 What is the unloading fee?' )
                    {
                    // InternalSmaCQA.g:3002:5: (lv_q4_13_0= '3.5 What is the unloading fee?' )
                    // InternalSmaCQA.g:3003:6: lv_q4_13_0= '3.5 What is the unloading fee?'
                    {
                    lv_q4_13_0=(Token)match(input,75,FOLLOW_88); 

                    						newLeafNode(lv_q4_13_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getQ435WhatIsTheUnloadingFeeKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q4", lv_q4_13_0, "3.5 What is the unloading fee?");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,72,FOLLOW_58); 

                    				newLeafNode(otherlv_14, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getCostKeyword_5_1());
                    			
                    // InternalSmaCQA.g:3019:4: ( (lv_answer4_15_0= RULE_INT ) )
                    // InternalSmaCQA.g:3020:5: (lv_answer4_15_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:3020:5: (lv_answer4_15_0= RULE_INT )
                    // InternalSmaCQA.g:3021:6: lv_answer4_15_0= RULE_INT
                    {
                    lv_answer4_15_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    						newLeafNode(lv_answer4_15_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getAnswer4INTTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer4",
                    							lv_answer4_15_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,73,FOLLOW_73); 

                    				newLeafNode(otherlv_16, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getUnitCoinKeyword_5_3());
                    			
                    // InternalSmaCQA.g:3041:4: ( (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin ) )
                    // InternalSmaCQA.g:3042:5: (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin )
                    {
                    // InternalSmaCQA.g:3042:5: (lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin )
                    // InternalSmaCQA.g:3043:6: lv_unloadingFeeAnswerUnitCoin_17_0= ruleUnitCoin
                    {

                    						newCompositeNode(grammarAccess.getShipmentCostResponsibilityQuestionAccess().getUnloadingFeeAnswerUnitCoinUnitCoinEnumRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_unloadingFeeAnswerUnitCoin_17_0=ruleUnitCoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						set(
                    							current,
                    							"unloadingFeeAnswerUnitCoin",
                    							lv_unloadingFeeAnswerUnitCoin_17_0,
                    							"org.xtext.SmaCQA.UnitCoin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:3061:3: ( ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==76) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSmaCQA.g:3062:4: ( (lv_q5_18_0= '3.6 What is the transport rate?' ) ) otherlv_19= 'cost = ' ( (lv_answer5_20_0= RULE_INT ) ) otherlv_21= 'unitCoin=' ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) )
                    {
                    // InternalSmaCQA.g:3062:4: ( (lv_q5_18_0= '3.6 What is the transport rate?' ) )
                    // InternalSmaCQA.g:3063:5: (lv_q5_18_0= '3.6 What is the transport rate?' )
                    {
                    // InternalSmaCQA.g:3063:5: (lv_q5_18_0= '3.6 What is the transport rate?' )
                    // InternalSmaCQA.g:3064:6: lv_q5_18_0= '3.6 What is the transport rate?'
                    {
                    lv_q5_18_0=(Token)match(input,76,FOLLOW_88); 

                    						newLeafNode(lv_q5_18_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getQ536WhatIsTheTransportRateKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q5", lv_q5_18_0, "3.6 What is the transport rate?");
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,72,FOLLOW_58); 

                    				newLeafNode(otherlv_19, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getCostKeyword_6_1());
                    			
                    // InternalSmaCQA.g:3080:4: ( (lv_answer5_20_0= RULE_INT ) )
                    // InternalSmaCQA.g:3081:5: (lv_answer5_20_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:3081:5: (lv_answer5_20_0= RULE_INT )
                    // InternalSmaCQA.g:3082:6: lv_answer5_20_0= RULE_INT
                    {
                    lv_answer5_20_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    						newLeafNode(lv_answer5_20_0, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getAnswer5INTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer5",
                    							lv_answer5_20_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,73,FOLLOW_73); 

                    				newLeafNode(otherlv_21, grammarAccess.getShipmentCostResponsibilityQuestionAccess().getUnitCoinKeyword_6_3());
                    			
                    // InternalSmaCQA.g:3102:4: ( (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin ) )
                    // InternalSmaCQA.g:3103:5: (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin )
                    {
                    // InternalSmaCQA.g:3103:5: (lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin )
                    // InternalSmaCQA.g:3104:6: lv_transportRateAnswerUnitCoin_22_0= ruleUnitCoin
                    {

                    						newCompositeNode(grammarAccess.getShipmentCostResponsibilityQuestionAccess().getTransportRateAnswerUnitCoinUnitCoinEnumRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_transportRateAnswerUnitCoin_22_0=ruleUnitCoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipmentCostResponsibilityQuestionRule());
                    						}
                    						set(
                    							current,
                    							"transportRateAnswerUnitCoin",
                    							lv_transportRateAnswerUnitCoin_22_0,
                    							"org.xtext.SmaCQA.UnitCoin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipmentCostResponsibilityQuestion"


    // $ANTLR start "entryRuleShipmentDetailsQuestion"
    // InternalSmaCQA.g:3126:1: entryRuleShipmentDetailsQuestion returns [EObject current=null] : iv_ruleShipmentDetailsQuestion= ruleShipmentDetailsQuestion EOF ;
    public final EObject entryRuleShipmentDetailsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipmentDetailsQuestion = null;


        try {
            // InternalSmaCQA.g:3126:64: (iv_ruleShipmentDetailsQuestion= ruleShipmentDetailsQuestion EOF )
            // InternalSmaCQA.g:3127:2: iv_ruleShipmentDetailsQuestion= ruleShipmentDetailsQuestion EOF
            {
             newCompositeNode(grammarAccess.getShipmentDetailsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipmentDetailsQuestion=ruleShipmentDetailsQuestion();

            state._fsp--;

             current =iv_ruleShipmentDetailsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipmentDetailsQuestion"


    // $ANTLR start "ruleShipmentDetailsQuestion"
    // InternalSmaCQA.g:3133:1: ruleShipmentDetailsQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.1 Is it an international shipment?' ) ) otherlv_1= 'internationalAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleShipmentDetailsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3139:2: ( ( ( (lv_name_0_0= '4.1 Is it an international shipment?' ) ) otherlv_1= 'internationalAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:3140:2: ( ( (lv_name_0_0= '4.1 Is it an international shipment?' ) ) otherlv_1= 'internationalAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:3140:2: ( ( (lv_name_0_0= '4.1 Is it an international shipment?' ) ) otherlv_1= 'internationalAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:3141:3: ( (lv_name_0_0= '4.1 Is it an international shipment?' ) ) otherlv_1= 'internationalAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:3141:3: ( (lv_name_0_0= '4.1 Is it an international shipment?' ) )
            // InternalSmaCQA.g:3142:4: (lv_name_0_0= '4.1 Is it an international shipment?' )
            {
            // InternalSmaCQA.g:3142:4: (lv_name_0_0= '4.1 Is it an international shipment?' )
            // InternalSmaCQA.g:3143:5: lv_name_0_0= '4.1 Is it an international shipment?'
            {
            lv_name_0_0=(Token)match(input,77,FOLLOW_93); 

            					newLeafNode(lv_name_0_0, grammarAccess.getShipmentDetailsQuestionAccess().getName41IsItAnInternationalShipmentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShipmentDetailsQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.1 Is it an international shipment?");
            				

            }


            }

            otherlv_1=(Token)match(input,78,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getShipmentDetailsQuestionAccess().getInternationalAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3159:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3160:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3160:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3161:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3161:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==25) ) {
                alt66=1;
            }
            else if ( (LA66_0==26) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalSmaCQA.g:3162:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getShipmentDetailsQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3173:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getShipmentDetailsQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipmentDetailsQuestion"


    // $ANTLR start "entryRuleSanitaryControlQuestion"
    // InternalSmaCQA.g:3190:1: entryRuleSanitaryControlQuestion returns [EObject current=null] : iv_ruleSanitaryControlQuestion= ruleSanitaryControlQuestion EOF ;
    public final EObject entryRuleSanitaryControlQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSanitaryControlQuestion = null;


        try {
            // InternalSmaCQA.g:3190:64: (iv_ruleSanitaryControlQuestion= ruleSanitaryControlQuestion EOF )
            // InternalSmaCQA.g:3191:2: iv_ruleSanitaryControlQuestion= ruleSanitaryControlQuestion EOF
            {
             newCompositeNode(grammarAccess.getSanitaryControlQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSanitaryControlQuestion=ruleSanitaryControlQuestion();

            state._fsp--;

             current =iv_ruleSanitaryControlQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSanitaryControlQuestion"


    // $ANTLR start "ruleSanitaryControlQuestion"
    // InternalSmaCQA.g:3197:1: ruleSanitaryControlQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' ) ) otherlv_1= 'sanitaryAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleSanitaryControlQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3203:2: ( ( ( (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' ) ) otherlv_1= 'sanitaryAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:3204:2: ( ( (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' ) ) otherlv_1= 'sanitaryAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:3204:2: ( ( (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' ) ) otherlv_1= 'sanitaryAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:3205:3: ( (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' ) ) otherlv_1= 'sanitaryAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:3205:3: ( (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' ) )
            // InternalSmaCQA.g:3206:4: (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' )
            {
            // InternalSmaCQA.g:3206:4: (lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?' )
            // InternalSmaCQA.g:3207:5: lv_name_0_0= '4.2 Is the product subject to any sanitary control upon arrival at the destination country?'
            {
            lv_name_0_0=(Token)match(input,79,FOLLOW_94); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSanitaryControlQuestionAccess().getName42IsTheProductSubjectToAnySanitaryControlUponArrivalAtTheDestinationCountryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSanitaryControlQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.2 Is the product subject to any sanitary control upon arrival at the destination country?");
            				

            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getSanitaryControlQuestionAccess().getSanitaryAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3223:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3224:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3224:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3225:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3225:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==25) ) {
                alt67=1;
            }
            else if ( (LA67_0==26) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSmaCQA.g:3226:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getSanitaryControlQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSanitaryControlQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3237:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getSanitaryControlQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSanitaryControlQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSanitaryControlQuestion"


    // $ANTLR start "entryRuleCustomsQuestion"
    // InternalSmaCQA.g:3254:1: entryRuleCustomsQuestion returns [EObject current=null] : iv_ruleCustomsQuestion= ruleCustomsQuestion EOF ;
    public final EObject entryRuleCustomsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomsQuestion = null;


        try {
            // InternalSmaCQA.g:3254:56: (iv_ruleCustomsQuestion= ruleCustomsQuestion EOF )
            // InternalSmaCQA.g:3255:2: iv_ruleCustomsQuestion= ruleCustomsQuestion EOF
            {
             newCompositeNode(grammarAccess.getCustomsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomsQuestion=ruleCustomsQuestion();

            state._fsp--;

             current =iv_ruleCustomsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomsQuestion"


    // $ANTLR start "ruleCustomsQuestion"
    // InternalSmaCQA.g:3261:1: ruleCustomsQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.3 Does the shipment have to go through customs?' ) ) otherlv_1= 'customsAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleCustomsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3267:2: ( ( ( (lv_name_0_0= '4.3 Does the shipment have to go through customs?' ) ) otherlv_1= 'customsAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:3268:2: ( ( (lv_name_0_0= '4.3 Does the shipment have to go through customs?' ) ) otherlv_1= 'customsAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:3268:2: ( ( (lv_name_0_0= '4.3 Does the shipment have to go through customs?' ) ) otherlv_1= 'customsAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:3269:3: ( (lv_name_0_0= '4.3 Does the shipment have to go through customs?' ) ) otherlv_1= 'customsAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:3269:3: ( (lv_name_0_0= '4.3 Does the shipment have to go through customs?' ) )
            // InternalSmaCQA.g:3270:4: (lv_name_0_0= '4.3 Does the shipment have to go through customs?' )
            {
            // InternalSmaCQA.g:3270:4: (lv_name_0_0= '4.3 Does the shipment have to go through customs?' )
            // InternalSmaCQA.g:3271:5: lv_name_0_0= '4.3 Does the shipment have to go through customs?'
            {
            lv_name_0_0=(Token)match(input,81,FOLLOW_95); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCustomsQuestionAccess().getName43DoesTheShipmentHaveToGoThroughCustomsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomsQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.3 Does the shipment have to go through customs?");
            				

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomsQuestionAccess().getCustomsAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3287:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3288:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3288:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3289:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3289:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==25) ) {
                alt68=1;
            }
            else if ( (LA68_0==26) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalSmaCQA.g:3290:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getCustomsQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3301:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getCustomsQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomsQuestion"


    // $ANTLR start "entryRuleImportTaxQuestion"
    // InternalSmaCQA.g:3318:1: entryRuleImportTaxQuestion returns [EObject current=null] : iv_ruleImportTaxQuestion= ruleImportTaxQuestion EOF ;
    public final EObject entryRuleImportTaxQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportTaxQuestion = null;


        try {
            // InternalSmaCQA.g:3318:58: (iv_ruleImportTaxQuestion= ruleImportTaxQuestion EOF )
            // InternalSmaCQA.g:3319:2: iv_ruleImportTaxQuestion= ruleImportTaxQuestion EOF
            {
             newCompositeNode(grammarAccess.getImportTaxQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportTaxQuestion=ruleImportTaxQuestion();

            state._fsp--;

             current =iv_ruleImportTaxQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportTaxQuestion"


    // $ANTLR start "ruleImportTaxQuestion"
    // InternalSmaCQA.g:3325:1: ruleImportTaxQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' ) ) otherlv_1= 'taxAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion ) )? ) ;
    public final EObject ruleImportTaxQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subSentence_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:3331:2: ( ( ( (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' ) ) otherlv_1= 'taxAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion ) )? ) )
            // InternalSmaCQA.g:3332:2: ( ( (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' ) ) otherlv_1= 'taxAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion ) )? )
            {
            // InternalSmaCQA.g:3332:2: ( ( (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' ) ) otherlv_1= 'taxAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion ) )? )
            // InternalSmaCQA.g:3333:3: ( (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' ) ) otherlv_1= 'taxAnswer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion ) )?
            {
            // InternalSmaCQA.g:3333:3: ( (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' ) )
            // InternalSmaCQA.g:3334:4: (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' )
            {
            // InternalSmaCQA.g:3334:4: (lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?' )
            // InternalSmaCQA.g:3335:5: lv_name_0_0= '4.4 Does it have to pay any import tax to the destination country?'
            {
            lv_name_0_0=(Token)match(input,83,FOLLOW_96); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImportTaxQuestionAccess().getName44DoesItHaveToPayAnyImportTaxToTheDestinationCountryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportTaxQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.4 Does it have to pay any import tax to the destination country?");
            				

            }


            }

            otherlv_1=(Token)match(input,84,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getImportTaxQuestionAccess().getTaxAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3351:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3352:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3352:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3353:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3353:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            else if ( (LA69_0==26) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalSmaCQA.g:3354:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_97); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getImportTaxQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportTaxQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3365:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_97); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getImportTaxQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportTaxQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:3378:3: ( (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==85) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSmaCQA.g:3379:4: (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion )
                    {
                    // InternalSmaCQA.g:3379:4: (lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion )
                    // InternalSmaCQA.g:3380:5: lv_subSentence_3_0= ruleTaxShipmentDetailsQuestion
                    {

                    					newCompositeNode(grammarAccess.getImportTaxQuestionAccess().getSubSentenceTaxShipmentDetailsQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subSentence_3_0=ruleTaxShipmentDetailsQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImportTaxQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subSentence",
                    						lv_subSentence_3_0,
                    						"org.xtext.SmaCQA.TaxShipmentDetailsQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportTaxQuestion"


    // $ANTLR start "entryRuleTaxShipmentDetailsQuestion"
    // InternalSmaCQA.g:3401:1: entryRuleTaxShipmentDetailsQuestion returns [EObject current=null] : iv_ruleTaxShipmentDetailsQuestion= ruleTaxShipmentDetailsQuestion EOF ;
    public final EObject entryRuleTaxShipmentDetailsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaxShipmentDetailsQuestion = null;


        try {
            // InternalSmaCQA.g:3401:67: (iv_ruleTaxShipmentDetailsQuestion= ruleTaxShipmentDetailsQuestion EOF )
            // InternalSmaCQA.g:3402:2: iv_ruleTaxShipmentDetailsQuestion= ruleTaxShipmentDetailsQuestion EOF
            {
             newCompositeNode(grammarAccess.getTaxShipmentDetailsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaxShipmentDetailsQuestion=ruleTaxShipmentDetailsQuestion();

            state._fsp--;

             current =iv_ruleTaxShipmentDetailsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaxShipmentDetailsQuestion"


    // $ANTLR start "ruleTaxShipmentDetailsQuestion"
    // InternalSmaCQA.g:3408:1: ruleTaxShipmentDetailsQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' ) ) otherlv_1= 'cost = ' ( (lv_answer_2_0= RULE_INT ) ) ( (lv_answerUnitCoin_3_0= ruleUnitCoin ) ) ) ;
    public final EObject ruleTaxShipmentDetailsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;
        Enumerator lv_answerUnitCoin_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:3414:2: ( ( ( (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' ) ) otherlv_1= 'cost = ' ( (lv_answer_2_0= RULE_INT ) ) ( (lv_answerUnitCoin_3_0= ruleUnitCoin ) ) ) )
            // InternalSmaCQA.g:3415:2: ( ( (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' ) ) otherlv_1= 'cost = ' ( (lv_answer_2_0= RULE_INT ) ) ( (lv_answerUnitCoin_3_0= ruleUnitCoin ) ) )
            {
            // InternalSmaCQA.g:3415:2: ( ( (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' ) ) otherlv_1= 'cost = ' ( (lv_answer_2_0= RULE_INT ) ) ( (lv_answerUnitCoin_3_0= ruleUnitCoin ) ) )
            // InternalSmaCQA.g:3416:3: ( (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' ) ) otherlv_1= 'cost = ' ( (lv_answer_2_0= RULE_INT ) ) ( (lv_answerUnitCoin_3_0= ruleUnitCoin ) )
            {
            // InternalSmaCQA.g:3416:3: ( (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' ) )
            // InternalSmaCQA.g:3417:4: (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' )
            {
            // InternalSmaCQA.g:3417:4: (lv_name_0_0= '4.4.1 How much does it have to pay in taxes?' )
            // InternalSmaCQA.g:3418:5: lv_name_0_0= '4.4.1 How much does it have to pay in taxes?'
            {
            lv_name_0_0=(Token)match(input,85,FOLLOW_88); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTaxShipmentDetailsQuestionAccess().getName441HowMuchDoesItHaveToPayInTaxesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxShipmentDetailsQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.4.1 How much does it have to pay in taxes?");
            				

            }


            }

            otherlv_1=(Token)match(input,72,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getTaxShipmentDetailsQuestionAccess().getCostKeyword_1());
            		
            // InternalSmaCQA.g:3434:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:3435:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:3435:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:3436:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_73); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getTaxShipmentDetailsQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaxShipmentDetailsQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSmaCQA.g:3452:3: ( (lv_answerUnitCoin_3_0= ruleUnitCoin ) )
            // InternalSmaCQA.g:3453:4: (lv_answerUnitCoin_3_0= ruleUnitCoin )
            {
            // InternalSmaCQA.g:3453:4: (lv_answerUnitCoin_3_0= ruleUnitCoin )
            // InternalSmaCQA.g:3454:5: lv_answerUnitCoin_3_0= ruleUnitCoin
            {

            					newCompositeNode(grammarAccess.getTaxShipmentDetailsQuestionAccess().getAnswerUnitCoinUnitCoinEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_answerUnitCoin_3_0=ruleUnitCoin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaxShipmentDetailsQuestionRule());
            					}
            					set(
            						current,
            						"answerUnitCoin",
            						lv_answerUnitCoin_3_0,
            						"org.xtext.SmaCQA.UnitCoin");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaxShipmentDetailsQuestion"


    // $ANTLR start "entryRuleGeographicalQuestion"
    // InternalSmaCQA.g:3475:1: entryRuleGeographicalQuestion returns [EObject current=null] : iv_ruleGeographicalQuestion= ruleGeographicalQuestion EOF ;
    public final EObject entryRuleGeographicalQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeographicalQuestion = null;


        try {
            // InternalSmaCQA.g:3475:61: (iv_ruleGeographicalQuestion= ruleGeographicalQuestion EOF )
            // InternalSmaCQA.g:3476:2: iv_ruleGeographicalQuestion= ruleGeographicalQuestion EOF
            {
             newCompositeNode(grammarAccess.getGeographicalQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeographicalQuestion=ruleGeographicalQuestion();

            state._fsp--;

             current =iv_ruleGeographicalQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeographicalQuestion"


    // $ANTLR start "ruleGeographicalQuestion"
    // InternalSmaCQA.g:3482:1: ruleGeographicalQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion ) )? ) ;
    public final EObject ruleGeographicalQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subSentenceRestriction_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:3488:2: ( ( ( (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion ) )? ) )
            // InternalSmaCQA.g:3489:2: ( ( (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion ) )? )
            {
            // InternalSmaCQA.g:3489:2: ( ( (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion ) )? )
            // InternalSmaCQA.g:3490:3: ( (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion ) )?
            {
            // InternalSmaCQA.g:3490:3: ( (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' ) )
            // InternalSmaCQA.g:3491:4: (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' )
            {
            // InternalSmaCQA.g:3491:4: (lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?' )
            // InternalSmaCQA.g:3492:5: lv_name_0_0= '4.5 Are there geographical restrictions for the exchange?'
            {
            lv_name_0_0=(Token)match(input,86,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGeographicalQuestionAccess().getName45AreThereGeographicalRestrictionsForTheExchangeKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeographicalQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.5 Are there geographical restrictions for the exchange?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getGeographicalQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3508:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3509:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3509:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3510:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3510:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            else if ( (LA71_0==26) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalSmaCQA.g:3511:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_98); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getGeographicalQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeographicalQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3522:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_98); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getGeographicalQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeographicalQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:3535:3: ( (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==87) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSmaCQA.g:3536:4: (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion )
                    {
                    // InternalSmaCQA.g:3536:4: (lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion )
                    // InternalSmaCQA.g:3537:5: lv_subSentenceRestriction_3_0= ruleGeographicalRestrictionQuestion
                    {

                    					newCompositeNode(grammarAccess.getGeographicalQuestionAccess().getSubSentenceRestrictionGeographicalRestrictionQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subSentenceRestriction_3_0=ruleGeographicalRestrictionQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeographicalQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subSentenceRestriction",
                    						lv_subSentenceRestriction_3_0,
                    						"org.xtext.SmaCQA.GeographicalRestrictionQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeographicalQuestion"


    // $ANTLR start "entryRuleGeographicalRestrictionQuestion"
    // InternalSmaCQA.g:3558:1: entryRuleGeographicalRestrictionQuestion returns [EObject current=null] : iv_ruleGeographicalRestrictionQuestion= ruleGeographicalRestrictionQuestion EOF ;
    public final EObject entryRuleGeographicalRestrictionQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeographicalRestrictionQuestion = null;


        try {
            // InternalSmaCQA.g:3558:72: (iv_ruleGeographicalRestrictionQuestion= ruleGeographicalRestrictionQuestion EOF )
            // InternalSmaCQA.g:3559:2: iv_ruleGeographicalRestrictionQuestion= ruleGeographicalRestrictionQuestion EOF
            {
             newCompositeNode(grammarAccess.getGeographicalRestrictionQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeographicalRestrictionQuestion=ruleGeographicalRestrictionQuestion();

            state._fsp--;

             current =iv_ruleGeographicalRestrictionQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeographicalRestrictionQuestion"


    // $ANTLR start "ruleGeographicalRestrictionQuestion"
    // InternalSmaCQA.g:3565:1: ruleGeographicalRestrictionQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.5.1 What are the geographical restrictions?' ) ) otherlv_1= 'restrictions = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeographicalRestrictionQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3571:2: ( ( ( (lv_name_0_0= '4.5.1 What are the geographical restrictions?' ) ) otherlv_1= 'restrictions = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:3572:2: ( ( (lv_name_0_0= '4.5.1 What are the geographical restrictions?' ) ) otherlv_1= 'restrictions = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:3572:2: ( ( (lv_name_0_0= '4.5.1 What are the geographical restrictions?' ) ) otherlv_1= 'restrictions = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:3573:3: ( (lv_name_0_0= '4.5.1 What are the geographical restrictions?' ) ) otherlv_1= 'restrictions = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:3573:3: ( (lv_name_0_0= '4.5.1 What are the geographical restrictions?' ) )
            // InternalSmaCQA.g:3574:4: (lv_name_0_0= '4.5.1 What are the geographical restrictions?' )
            {
            // InternalSmaCQA.g:3574:4: (lv_name_0_0= '4.5.1 What are the geographical restrictions?' )
            // InternalSmaCQA.g:3575:5: lv_name_0_0= '4.5.1 What are the geographical restrictions?'
            {
            lv_name_0_0=(Token)match(input,87,FOLLOW_99); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGeographicalRestrictionQuestionAccess().getName451WhatAreTheGeographicalRestrictionsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeographicalRestrictionQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.5.1 What are the geographical restrictions?");
            				

            }


            }

            otherlv_1=(Token)match(input,88,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getGeographicalRestrictionQuestionAccess().getRestrictionsKeyword_1());
            		
            // InternalSmaCQA.g:3591:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:3592:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:3592:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:3593:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getGeographicalRestrictionQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeographicalRestrictionQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeographicalRestrictionQuestion"


    // $ANTLR start "entryRuleAddressPickupQuestion"
    // InternalSmaCQA.g:3613:1: entryRuleAddressPickupQuestion returns [EObject current=null] : iv_ruleAddressPickupQuestion= ruleAddressPickupQuestion EOF ;
    public final EObject entryRuleAddressPickupQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressPickupQuestion = null;


        try {
            // InternalSmaCQA.g:3613:62: (iv_ruleAddressPickupQuestion= ruleAddressPickupQuestion EOF )
            // InternalSmaCQA.g:3614:2: iv_ruleAddressPickupQuestion= ruleAddressPickupQuestion EOF
            {
             newCompositeNode(grammarAccess.getAddressPickupQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddressPickupQuestion=ruleAddressPickupQuestion();

            state._fsp--;

             current =iv_ruleAddressPickupQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressPickupQuestion"


    // $ANTLR start "ruleAddressPickupQuestion"
    // InternalSmaCQA.g:3620:1: ruleAddressPickupQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.6 What is the pickup address for the cargo?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddressPickupQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3626:2: ( ( ( (lv_name_0_0= '4.6 What is the pickup address for the cargo?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:3627:2: ( ( (lv_name_0_0= '4.6 What is the pickup address for the cargo?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:3627:2: ( ( (lv_name_0_0= '4.6 What is the pickup address for the cargo?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:3628:3: ( (lv_name_0_0= '4.6 What is the pickup address for the cargo?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:3628:3: ( (lv_name_0_0= '4.6 What is the pickup address for the cargo?' ) )
            // InternalSmaCQA.g:3629:4: (lv_name_0_0= '4.6 What is the pickup address for the cargo?' )
            {
            // InternalSmaCQA.g:3629:4: (lv_name_0_0= '4.6 What is the pickup address for the cargo?' )
            // InternalSmaCQA.g:3630:5: lv_name_0_0= '4.6 What is the pickup address for the cargo?'
            {
            lv_name_0_0=(Token)match(input,89,FOLLOW_101); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAddressPickupQuestionAccess().getName46WhatIsThePickupAddressForTheCargoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressPickupQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.6 What is the pickup address for the cargo?");
            				

            }


            }

            otherlv_1=(Token)match(input,90,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressPickupQuestionAccess().getAddressKeyword_1());
            		
            // InternalSmaCQA.g:3646:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:3647:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:3647:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:3648:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getAddressPickupQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressPickupQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressPickupQuestion"


    // $ANTLR start "entryRuleAddressDeliveryQuestion"
    // InternalSmaCQA.g:3668:1: entryRuleAddressDeliveryQuestion returns [EObject current=null] : iv_ruleAddressDeliveryQuestion= ruleAddressDeliveryQuestion EOF ;
    public final EObject entryRuleAddressDeliveryQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressDeliveryQuestion = null;


        try {
            // InternalSmaCQA.g:3668:64: (iv_ruleAddressDeliveryQuestion= ruleAddressDeliveryQuestion EOF )
            // InternalSmaCQA.g:3669:2: iv_ruleAddressDeliveryQuestion= ruleAddressDeliveryQuestion EOF
            {
             newCompositeNode(grammarAccess.getAddressDeliveryQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddressDeliveryQuestion=ruleAddressDeliveryQuestion();

            state._fsp--;

             current =iv_ruleAddressDeliveryQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressDeliveryQuestion"


    // $ANTLR start "ruleAddressDeliveryQuestion"
    // InternalSmaCQA.g:3675:1: ruleAddressDeliveryQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.7 What is the delivery address?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddressDeliveryQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3681:2: ( ( ( (lv_name_0_0= '4.7 What is the delivery address?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:3682:2: ( ( (lv_name_0_0= '4.7 What is the delivery address?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:3682:2: ( ( (lv_name_0_0= '4.7 What is the delivery address?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:3683:3: ( (lv_name_0_0= '4.7 What is the delivery address?' ) ) otherlv_1= 'address = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:3683:3: ( (lv_name_0_0= '4.7 What is the delivery address?' ) )
            // InternalSmaCQA.g:3684:4: (lv_name_0_0= '4.7 What is the delivery address?' )
            {
            // InternalSmaCQA.g:3684:4: (lv_name_0_0= '4.7 What is the delivery address?' )
            // InternalSmaCQA.g:3685:5: lv_name_0_0= '4.7 What is the delivery address?'
            {
            lv_name_0_0=(Token)match(input,91,FOLLOW_101); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAddressDeliveryQuestionAccess().getName47WhatIsTheDeliveryAddressKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressDeliveryQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.7 What is the delivery address?");
            				

            }


            }

            otherlv_1=(Token)match(input,90,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressDeliveryQuestionAccess().getAddressKeyword_1());
            		
            // InternalSmaCQA.g:3701:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:3702:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:3702:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:3703:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getAddressDeliveryQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressDeliveryQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressDeliveryQuestion"


    // $ANTLR start "entryRuleShipmentTrackingNumberQuestion"
    // InternalSmaCQA.g:3723:1: entryRuleShipmentTrackingNumberQuestion returns [EObject current=null] : iv_ruleShipmentTrackingNumberQuestion= ruleShipmentTrackingNumberQuestion EOF ;
    public final EObject entryRuleShipmentTrackingNumberQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipmentTrackingNumberQuestion = null;


        try {
            // InternalSmaCQA.g:3723:71: (iv_ruleShipmentTrackingNumberQuestion= ruleShipmentTrackingNumberQuestion EOF )
            // InternalSmaCQA.g:3724:2: iv_ruleShipmentTrackingNumberQuestion= ruleShipmentTrackingNumberQuestion EOF
            {
             newCompositeNode(grammarAccess.getShipmentTrackingNumberQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipmentTrackingNumberQuestion=ruleShipmentTrackingNumberQuestion();

            state._fsp--;

             current =iv_ruleShipmentTrackingNumberQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipmentTrackingNumberQuestion"


    // $ANTLR start "ruleShipmentTrackingNumberQuestion"
    // InternalSmaCQA.g:3730:1: ruleShipmentTrackingNumberQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.8 What is the shipment tracking number?' ) ) otherlv_1= 'tracking number = ' ( (lv_answer_2_0= RULE_INT ) ) ) ;
    public final EObject ruleShipmentTrackingNumberQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3736:2: ( ( ( (lv_name_0_0= '4.8 What is the shipment tracking number?' ) ) otherlv_1= 'tracking number = ' ( (lv_answer_2_0= RULE_INT ) ) ) )
            // InternalSmaCQA.g:3737:2: ( ( (lv_name_0_0= '4.8 What is the shipment tracking number?' ) ) otherlv_1= 'tracking number = ' ( (lv_answer_2_0= RULE_INT ) ) )
            {
            // InternalSmaCQA.g:3737:2: ( ( (lv_name_0_0= '4.8 What is the shipment tracking number?' ) ) otherlv_1= 'tracking number = ' ( (lv_answer_2_0= RULE_INT ) ) )
            // InternalSmaCQA.g:3738:3: ( (lv_name_0_0= '4.8 What is the shipment tracking number?' ) ) otherlv_1= 'tracking number = ' ( (lv_answer_2_0= RULE_INT ) )
            {
            // InternalSmaCQA.g:3738:3: ( (lv_name_0_0= '4.8 What is the shipment tracking number?' ) )
            // InternalSmaCQA.g:3739:4: (lv_name_0_0= '4.8 What is the shipment tracking number?' )
            {
            // InternalSmaCQA.g:3739:4: (lv_name_0_0= '4.8 What is the shipment tracking number?' )
            // InternalSmaCQA.g:3740:5: lv_name_0_0= '4.8 What is the shipment tracking number?'
            {
            lv_name_0_0=(Token)match(input,92,FOLLOW_102); 

            					newLeafNode(lv_name_0_0, grammarAccess.getShipmentTrackingNumberQuestionAccess().getName48WhatIsTheShipmentTrackingNumberKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShipmentTrackingNumberQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.8 What is the shipment tracking number?");
            				

            }


            }

            otherlv_1=(Token)match(input,93,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getShipmentTrackingNumberQuestionAccess().getTrackingNumberKeyword_1());
            		
            // InternalSmaCQA.g:3756:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:3757:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:3757:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:3758:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getShipmentTrackingNumberQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShipmentTrackingNumberQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipmentTrackingNumberQuestion"


    // $ANTLR start "entryRuleDangerousLoadQuestion"
    // InternalSmaCQA.g:3778:1: entryRuleDangerousLoadQuestion returns [EObject current=null] : iv_ruleDangerousLoadQuestion= ruleDangerousLoadQuestion EOF ;
    public final EObject entryRuleDangerousLoadQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDangerousLoadQuestion = null;


        try {
            // InternalSmaCQA.g:3778:62: (iv_ruleDangerousLoadQuestion= ruleDangerousLoadQuestion EOF )
            // InternalSmaCQA.g:3779:2: iv_ruleDangerousLoadQuestion= ruleDangerousLoadQuestion EOF
            {
             newCompositeNode(grammarAccess.getDangerousLoadQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDangerousLoadQuestion=ruleDangerousLoadQuestion();

            state._fsp--;

             current =iv_ruleDangerousLoadQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDangerousLoadQuestion"


    // $ANTLR start "ruleDangerousLoadQuestion"
    // InternalSmaCQA.g:3785:1: ruleDangerousLoadQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion ) )? ) ;
    public final EObject ruleDangerousLoadQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subSentenceSpecialMeasures_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:3791:2: ( ( ( (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion ) )? ) )
            // InternalSmaCQA.g:3792:2: ( ( (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion ) )? )
            {
            // InternalSmaCQA.g:3792:2: ( ( (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion ) )? )
            // InternalSmaCQA.g:3793:3: ( (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion ) )?
            {
            // InternalSmaCQA.g:3793:3: ( (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' ) )
            // InternalSmaCQA.g:3794:4: (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' )
            {
            // InternalSmaCQA.g:3794:4: (lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?' )
            // InternalSmaCQA.g:3795:5: lv_name_0_0= '4.9 Does the physical good represent a dangerous load or have special transportation needs?'
            {
            lv_name_0_0=(Token)match(input,94,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDangerousLoadQuestionAccess().getName49DoesThePhysicalGoodRepresentADangerousLoadOrHaveSpecialTransportationNeedsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDangerousLoadQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.9 Does the physical good represent a dangerous load or have special transportation needs?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getDangerousLoadQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3811:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3812:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3812:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3813:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3813:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25) ) {
                alt73=1;
            }
            else if ( (LA73_0==26) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalSmaCQA.g:3814:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_103); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getDangerousLoadQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDangerousLoadQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3825:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_103); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getDangerousLoadQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDangerousLoadQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:3838:3: ( (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==95) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSmaCQA.g:3839:4: (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion )
                    {
                    // InternalSmaCQA.g:3839:4: (lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion )
                    // InternalSmaCQA.g:3840:5: lv_subSentenceSpecialMeasures_3_0= ruleSpecialMeasuresQuestion
                    {

                    					newCompositeNode(grammarAccess.getDangerousLoadQuestionAccess().getSubSentenceSpecialMeasuresSpecialMeasuresQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subSentenceSpecialMeasures_3_0=ruleSpecialMeasuresQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDangerousLoadQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subSentenceSpecialMeasures",
                    						lv_subSentenceSpecialMeasures_3_0,
                    						"org.xtext.SmaCQA.SpecialMeasuresQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDangerousLoadQuestion"


    // $ANTLR start "entryRuleSpecialMeasuresQuestion"
    // InternalSmaCQA.g:3861:1: entryRuleSpecialMeasuresQuestion returns [EObject current=null] : iv_ruleSpecialMeasuresQuestion= ruleSpecialMeasuresQuestion EOF ;
    public final EObject entryRuleSpecialMeasuresQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialMeasuresQuestion = null;


        try {
            // InternalSmaCQA.g:3861:64: (iv_ruleSpecialMeasuresQuestion= ruleSpecialMeasuresQuestion EOF )
            // InternalSmaCQA.g:3862:2: iv_ruleSpecialMeasuresQuestion= ruleSpecialMeasuresQuestion EOF
            {
             newCompositeNode(grammarAccess.getSpecialMeasuresQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialMeasuresQuestion=ruleSpecialMeasuresQuestion();

            state._fsp--;

             current =iv_ruleSpecialMeasuresQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecialMeasuresQuestion"


    // $ANTLR start "ruleSpecialMeasuresQuestion"
    // InternalSmaCQA.g:3868:1: ruleSpecialMeasuresQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' ) ) otherlv_1= 'especial measures needed = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpecialMeasuresQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:3874:2: ( ( ( (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' ) ) otherlv_1= 'especial measures needed = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:3875:2: ( ( (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' ) ) otherlv_1= 'especial measures needed = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:3875:2: ( ( (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' ) ) otherlv_1= 'especial measures needed = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:3876:3: ( (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' ) ) otherlv_1= 'especial measures needed = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:3876:3: ( (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' ) )
            // InternalSmaCQA.g:3877:4: (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' )
            {
            // InternalSmaCQA.g:3877:4: (lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?' )
            // InternalSmaCQA.g:3878:5: lv_name_0_0= '4.9.1 What special measures are needed for its proper transport?'
            {
            lv_name_0_0=(Token)match(input,95,FOLLOW_104); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSpecialMeasuresQuestionAccess().getName491WhatSpecialMeasuresAreNeededForItsProperTransportKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecialMeasuresQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.9.1 What special measures are needed for its proper transport?");
            				

            }


            }

            otherlv_1=(Token)match(input,96,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecialMeasuresQuestionAccess().getEspecialMeasuresNeededKeyword_1());
            		
            // InternalSmaCQA.g:3894:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:3895:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:3895:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:3896:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getSpecialMeasuresQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecialMeasuresQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecialMeasuresQuestion"


    // $ANTLR start "entryRulePerishableQuestion"
    // InternalSmaCQA.g:3916:1: entryRulePerishableQuestion returns [EObject current=null] : iv_rulePerishableQuestion= rulePerishableQuestion EOF ;
    public final EObject entryRulePerishableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerishableQuestion = null;


        try {
            // InternalSmaCQA.g:3916:59: (iv_rulePerishableQuestion= rulePerishableQuestion EOF )
            // InternalSmaCQA.g:3917:2: iv_rulePerishableQuestion= rulePerishableQuestion EOF
            {
             newCompositeNode(grammarAccess.getPerishableQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerishableQuestion=rulePerishableQuestion();

            state._fsp--;

             current =iv_rulePerishableQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerishableQuestion"


    // $ANTLR start "rulePerishableQuestion"
    // InternalSmaCQA.g:3923:1: rulePerishableQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.10 Is it a perishable product?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion ) )? ) ;
    public final EObject rulePerishableQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subSentencePerishable_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:3929:2: ( ( ( (lv_name_0_0= '4.10 Is it a perishable product?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion ) )? ) )
            // InternalSmaCQA.g:3930:2: ( ( (lv_name_0_0= '4.10 Is it a perishable product?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion ) )? )
            {
            // InternalSmaCQA.g:3930:2: ( ( (lv_name_0_0= '4.10 Is it a perishable product?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion ) )? )
            // InternalSmaCQA.g:3931:3: ( (lv_name_0_0= '4.10 Is it a perishable product?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion ) )?
            {
            // InternalSmaCQA.g:3931:3: ( (lv_name_0_0= '4.10 Is it a perishable product?' ) )
            // InternalSmaCQA.g:3932:4: (lv_name_0_0= '4.10 Is it a perishable product?' )
            {
            // InternalSmaCQA.g:3932:4: (lv_name_0_0= '4.10 Is it a perishable product?' )
            // InternalSmaCQA.g:3933:5: lv_name_0_0= '4.10 Is it a perishable product?'
            {
            lv_name_0_0=(Token)match(input,97,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPerishableQuestionAccess().getName410IsItAPerishableProductKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerishableQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.10 Is it a perishable product?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getPerishableQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:3949:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:3950:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:3950:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:3951:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:3951:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==25) ) {
                alt75=1;
            }
            else if ( (LA75_0==26) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalSmaCQA.g:3952:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_105); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getPerishableQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPerishableQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:3963:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_105); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getPerishableQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPerishableQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:3976:3: ( (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==98) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSmaCQA.g:3977:4: (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion )
                    {
                    // InternalSmaCQA.g:3977:4: (lv_subSentencePerishable_3_0= ruleExpirationDateQuestion )
                    // InternalSmaCQA.g:3978:5: lv_subSentencePerishable_3_0= ruleExpirationDateQuestion
                    {

                    					newCompositeNode(grammarAccess.getPerishableQuestionAccess().getSubSentencePerishableExpirationDateQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subSentencePerishable_3_0=ruleExpirationDateQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPerishableQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subSentencePerishable",
                    						lv_subSentencePerishable_3_0,
                    						"org.xtext.SmaCQA.ExpirationDateQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerishableQuestion"


    // $ANTLR start "entryRuleExpirationDateQuestion"
    // InternalSmaCQA.g:3999:1: entryRuleExpirationDateQuestion returns [EObject current=null] : iv_ruleExpirationDateQuestion= ruleExpirationDateQuestion EOF ;
    public final EObject entryRuleExpirationDateQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpirationDateQuestion = null;


        try {
            // InternalSmaCQA.g:3999:63: (iv_ruleExpirationDateQuestion= ruleExpirationDateQuestion EOF )
            // InternalSmaCQA.g:4000:2: iv_ruleExpirationDateQuestion= ruleExpirationDateQuestion EOF
            {
             newCompositeNode(grammarAccess.getExpirationDateQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpirationDateQuestion=ruleExpirationDateQuestion();

            state._fsp--;

             current =iv_ruleExpirationDateQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpirationDateQuestion"


    // $ANTLR start "ruleExpirationDateQuestion"
    // InternalSmaCQA.g:4006:1: ruleExpirationDateQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.10.1 What is its expiration date?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleExpirationDateQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4012:2: ( ( ( (lv_name_0_0= '4.10.1 What is its expiration date?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:4013:2: ( ( (lv_name_0_0= '4.10.1 What is its expiration date?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:4013:2: ( ( (lv_name_0_0= '4.10.1 What is its expiration date?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:4014:3: ( (lv_name_0_0= '4.10.1 What is its expiration date?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:4014:3: ( (lv_name_0_0= '4.10.1 What is its expiration date?' ) )
            // InternalSmaCQA.g:4015:4: (lv_name_0_0= '4.10.1 What is its expiration date?' )
            {
            // InternalSmaCQA.g:4015:4: (lv_name_0_0= '4.10.1 What is its expiration date?' )
            // InternalSmaCQA.g:4016:5: lv_name_0_0= '4.10.1 What is its expiration date?'
            {
            lv_name_0_0=(Token)match(input,98,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExpirationDateQuestionAccess().getName4101WhatIsItsExpirationDateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpirationDateQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.10.1 What is its expiration date?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getExpirationDateQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4032:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4033:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4033:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:4034:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getExpirationDateQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpirationDateQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpirationDateQuestion"


    // $ANTLR start "entryRuleCargoTypeQuestion"
    // InternalSmaCQA.g:4054:1: entryRuleCargoTypeQuestion returns [EObject current=null] : iv_ruleCargoTypeQuestion= ruleCargoTypeQuestion EOF ;
    public final EObject entryRuleCargoTypeQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargoTypeQuestion = null;


        try {
            // InternalSmaCQA.g:4054:58: (iv_ruleCargoTypeQuestion= ruleCargoTypeQuestion EOF )
            // InternalSmaCQA.g:4055:2: iv_ruleCargoTypeQuestion= ruleCargoTypeQuestion EOF
            {
             newCompositeNode(grammarAccess.getCargoTypeQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCargoTypeQuestion=ruleCargoTypeQuestion();

            state._fsp--;

             current =iv_ruleCargoTypeQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCargoTypeQuestion"


    // $ANTLR start "ruleCargoTypeQuestion"
    // InternalSmaCQA.g:4061:1: ruleCargoTypeQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.11 What is the type of cargo?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCargoTypeQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4067:2: ( ( ( (lv_name_0_0= '4.11 What is the type of cargo?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:4068:2: ( ( (lv_name_0_0= '4.11 What is the type of cargo?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:4068:2: ( ( (lv_name_0_0= '4.11 What is the type of cargo?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:4069:3: ( (lv_name_0_0= '4.11 What is the type of cargo?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:4069:3: ( (lv_name_0_0= '4.11 What is the type of cargo?' ) )
            // InternalSmaCQA.g:4070:4: (lv_name_0_0= '4.11 What is the type of cargo?' )
            {
            // InternalSmaCQA.g:4070:4: (lv_name_0_0= '4.11 What is the type of cargo?' )
            // InternalSmaCQA.g:4071:5: lv_name_0_0= '4.11 What is the type of cargo?'
            {
            lv_name_0_0=(Token)match(input,99,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCargoTypeQuestionAccess().getName411WhatIsTheTypeOfCargoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoTypeQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.11 What is the type of cargo?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getCargoTypeQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4087:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4088:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4088:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:4089:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getCargoTypeQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoTypeQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCargoTypeQuestion"


    // $ANTLR start "entryRuleCargoWeightQuestion"
    // InternalSmaCQA.g:4109:1: entryRuleCargoWeightQuestion returns [EObject current=null] : iv_ruleCargoWeightQuestion= ruleCargoWeightQuestion EOF ;
    public final EObject entryRuleCargoWeightQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargoWeightQuestion = null;


        try {
            // InternalSmaCQA.g:4109:60: (iv_ruleCargoWeightQuestion= ruleCargoWeightQuestion EOF )
            // InternalSmaCQA.g:4110:2: iv_ruleCargoWeightQuestion= ruleCargoWeightQuestion EOF
            {
             newCompositeNode(grammarAccess.getCargoWeightQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCargoWeightQuestion=ruleCargoWeightQuestion();

            state._fsp--;

             current =iv_ruleCargoWeightQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCargoWeightQuestion"


    // $ANTLR start "ruleCargoWeightQuestion"
    // InternalSmaCQA.g:4116:1: ruleCargoWeightQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCargoWeightQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4122:2: ( ( ( (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) ) )
            // InternalSmaCQA.g:4123:2: ( ( (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) )
            {
            // InternalSmaCQA.g:4123:2: ( ( (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) ) )
            // InternalSmaCQA.g:4124:3: ( (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_INT ) )
            {
            // InternalSmaCQA.g:4124:3: ( (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' ) )
            // InternalSmaCQA.g:4125:4: (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' )
            {
            // InternalSmaCQA.g:4125:4: (lv_name_0_0= '4.12 How much does the cargo weight (kg)?' )
            // InternalSmaCQA.g:4126:5: lv_name_0_0= '4.12 How much does the cargo weight (kg)?'
            {
            lv_name_0_0=(Token)match(input,100,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCargoWeightQuestionAccess().getName412HowMuchDoesTheCargoWeightKgKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoWeightQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.12 How much does the cargo weight (kg)?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getCargoWeightQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4142:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:4143:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:4143:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:4144:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getCargoWeightQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoWeightQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCargoWeightQuestion"


    // $ANTLR start "entryRuleCargoDimensionsQuestion"
    // InternalSmaCQA.g:4164:1: entryRuleCargoDimensionsQuestion returns [EObject current=null] : iv_ruleCargoDimensionsQuestion= ruleCargoDimensionsQuestion EOF ;
    public final EObject entryRuleCargoDimensionsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCargoDimensionsQuestion = null;


        try {
            // InternalSmaCQA.g:4164:64: (iv_ruleCargoDimensionsQuestion= ruleCargoDimensionsQuestion EOF )
            // InternalSmaCQA.g:4165:2: iv_ruleCargoDimensionsQuestion= ruleCargoDimensionsQuestion EOF
            {
             newCompositeNode(grammarAccess.getCargoDimensionsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCargoDimensionsQuestion=ruleCargoDimensionsQuestion();

            state._fsp--;

             current =iv_ruleCargoDimensionsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCargoDimensionsQuestion"


    // $ANTLR start "ruleCargoDimensionsQuestion"
    // InternalSmaCQA.g:4171:1: ruleCargoDimensionsQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' ) ) otherlv_1= 'answer = ' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= 'cm x ' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'cm x ' ( (lv_depth_6_0= RULE_INT ) ) otherlv_7= 'cm' ) ;
    public final EObject ruleCargoDimensionsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token lv_depth_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4177:2: ( ( ( (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' ) ) otherlv_1= 'answer = ' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= 'cm x ' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'cm x ' ( (lv_depth_6_0= RULE_INT ) ) otherlv_7= 'cm' ) )
            // InternalSmaCQA.g:4178:2: ( ( (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' ) ) otherlv_1= 'answer = ' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= 'cm x ' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'cm x ' ( (lv_depth_6_0= RULE_INT ) ) otherlv_7= 'cm' )
            {
            // InternalSmaCQA.g:4178:2: ( ( (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' ) ) otherlv_1= 'answer = ' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= 'cm x ' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'cm x ' ( (lv_depth_6_0= RULE_INT ) ) otherlv_7= 'cm' )
            // InternalSmaCQA.g:4179:3: ( (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' ) ) otherlv_1= 'answer = ' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= 'cm x ' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'cm x ' ( (lv_depth_6_0= RULE_INT ) ) otherlv_7= 'cm'
            {
            // InternalSmaCQA.g:4179:3: ( (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' ) )
            // InternalSmaCQA.g:4180:4: (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' )
            {
            // InternalSmaCQA.g:4180:4: (lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?' )
            // InternalSmaCQA.g:4181:5: lv_name_0_0= '4.13 What are the dimensions of the cargo (length x width x depth in cm)?'
            {
            lv_name_0_0=(Token)match(input,101,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCargoDimensionsQuestionAccess().getName413WhatAreTheDimensionsOfTheCargoLengthXWidthXDepthInCmKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoDimensionsQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.13 What are the dimensions of the cargo (length x width x depth in cm)?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getCargoDimensionsQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4197:3: ( (lv_length_2_0= RULE_INT ) )
            // InternalSmaCQA.g:4198:4: (lv_length_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:4198:4: (lv_length_2_0= RULE_INT )
            // InternalSmaCQA.g:4199:5: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_106); 

            					newLeafNode(lv_length_2_0, grammarAccess.getCargoDimensionsQuestionAccess().getLengthINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoDimensionsQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,102,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getCargoDimensionsQuestionAccess().getCmXKeyword_3());
            		
            // InternalSmaCQA.g:4219:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalSmaCQA.g:4220:4: (lv_width_4_0= RULE_INT )
            {
            // InternalSmaCQA.g:4220:4: (lv_width_4_0= RULE_INT )
            // InternalSmaCQA.g:4221:5: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_106); 

            					newLeafNode(lv_width_4_0, grammarAccess.getCargoDimensionsQuestionAccess().getWidthINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoDimensionsQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,102,FOLLOW_58); 

            			newLeafNode(otherlv_5, grammarAccess.getCargoDimensionsQuestionAccess().getCmXKeyword_5());
            		
            // InternalSmaCQA.g:4241:3: ( (lv_depth_6_0= RULE_INT ) )
            // InternalSmaCQA.g:4242:4: (lv_depth_6_0= RULE_INT )
            {
            // InternalSmaCQA.g:4242:4: (lv_depth_6_0= RULE_INT )
            // InternalSmaCQA.g:4243:5: lv_depth_6_0= RULE_INT
            {
            lv_depth_6_0=(Token)match(input,RULE_INT,FOLLOW_107); 

            					newLeafNode(lv_depth_6_0, grammarAccess.getCargoDimensionsQuestionAccess().getDepthINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCargoDimensionsQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"depth",
            						lv_depth_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,103,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCargoDimensionsQuestionAccess().getCmKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCargoDimensionsQuestion"


    // $ANTLR start "entryRuleSeaShipmentQuestion"
    // InternalSmaCQA.g:4267:1: entryRuleSeaShipmentQuestion returns [EObject current=null] : iv_ruleSeaShipmentQuestion= ruleSeaShipmentQuestion EOF ;
    public final EObject entryRuleSeaShipmentQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeaShipmentQuestion = null;


        try {
            // InternalSmaCQA.g:4267:60: (iv_ruleSeaShipmentQuestion= ruleSeaShipmentQuestion EOF )
            // InternalSmaCQA.g:4268:2: iv_ruleSeaShipmentQuestion= ruleSeaShipmentQuestion EOF
            {
             newCompositeNode(grammarAccess.getSeaShipmentQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeaShipmentQuestion=ruleSeaShipmentQuestion();

            state._fsp--;

             current =iv_ruleSeaShipmentQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeaShipmentQuestion"


    // $ANTLR start "ruleSeaShipmentQuestion"
    // InternalSmaCQA.g:4274:1: ruleSeaShipmentQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.14 Is the shipment made by sea route?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_maritime_3_0= ruleMaritimeQuestion ) )? ) ;
    public final EObject ruleSeaShipmentQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_maritime_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:4280:2: ( ( ( (lv_name_0_0= '4.14 Is the shipment made by sea route?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_maritime_3_0= ruleMaritimeQuestion ) )? ) )
            // InternalSmaCQA.g:4281:2: ( ( (lv_name_0_0= '4.14 Is the shipment made by sea route?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_maritime_3_0= ruleMaritimeQuestion ) )? )
            {
            // InternalSmaCQA.g:4281:2: ( ( (lv_name_0_0= '4.14 Is the shipment made by sea route?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_maritime_3_0= ruleMaritimeQuestion ) )? )
            // InternalSmaCQA.g:4282:3: ( (lv_name_0_0= '4.14 Is the shipment made by sea route?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_maritime_3_0= ruleMaritimeQuestion ) )?
            {
            // InternalSmaCQA.g:4282:3: ( (lv_name_0_0= '4.14 Is the shipment made by sea route?' ) )
            // InternalSmaCQA.g:4283:4: (lv_name_0_0= '4.14 Is the shipment made by sea route?' )
            {
            // InternalSmaCQA.g:4283:4: (lv_name_0_0= '4.14 Is the shipment made by sea route?' )
            // InternalSmaCQA.g:4284:5: lv_name_0_0= '4.14 Is the shipment made by sea route?'
            {
            lv_name_0_0=(Token)match(input,104,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSeaShipmentQuestionAccess().getName414IsTheShipmentMadeBySeaRouteKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeaShipmentQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.14 Is the shipment made by sea route?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getSeaShipmentQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4300:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:4301:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:4301:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:4302:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:4302:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==25) ) {
                alt77=1;
            }
            else if ( (LA77_0==26) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalSmaCQA.g:4303:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_108); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getSeaShipmentQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeaShipmentQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:4314:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_108); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getSeaShipmentQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSeaShipmentQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:4327:3: ( (lv_maritime_3_0= ruleMaritimeQuestion ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==105) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSmaCQA.g:4328:4: (lv_maritime_3_0= ruleMaritimeQuestion )
                    {
                    // InternalSmaCQA.g:4328:4: (lv_maritime_3_0= ruleMaritimeQuestion )
                    // InternalSmaCQA.g:4329:5: lv_maritime_3_0= ruleMaritimeQuestion
                    {

                    					newCompositeNode(grammarAccess.getSeaShipmentQuestionAccess().getMaritimeMaritimeQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maritime_3_0=ruleMaritimeQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSeaShipmentQuestionRule());
                    					}
                    					set(
                    						current,
                    						"maritime",
                    						lv_maritime_3_0,
                    						"org.xtext.SmaCQA.MaritimeQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeaShipmentQuestion"


    // $ANTLR start "entryRuleMaritimeQuestion"
    // InternalSmaCQA.g:4350:1: entryRuleMaritimeQuestion returns [EObject current=null] : iv_ruleMaritimeQuestion= ruleMaritimeQuestion EOF ;
    public final EObject entryRuleMaritimeQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaritimeQuestion = null;


        try {
            // InternalSmaCQA.g:4350:57: (iv_ruleMaritimeQuestion= ruleMaritimeQuestion EOF )
            // InternalSmaCQA.g:4351:2: iv_ruleMaritimeQuestion= ruleMaritimeQuestion EOF
            {
             newCompositeNode(grammarAccess.getMaritimeQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaritimeQuestion=ruleMaritimeQuestion();

            state._fsp--;

             current =iv_ruleMaritimeQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaritimeQuestion"


    // $ANTLR start "ruleMaritimeQuestion"
    // InternalSmaCQA.g:4357:1: ruleMaritimeQuestion returns [EObject current=null] : ( ( (lv_q1_0_0= '4.14.1 What is the name of the origin port?' ) ) otherlv_1= 'Origin Port = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '4.14.2 What is the name of the destination port?' ) ) otherlv_4= 'Destination Port = ' ( (lv_answer2_5_0= RULE_STRING ) ) ( ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) ) )? ( (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' ) ) otherlv_10= 'type of voyage = ' ( (lv_answer4_11_0= ruleVoyagetype ) ) ( (lv_subSentence_12_0= ruleVoyageQuestion ) )? ) ;
    public final EObject ruleMaritimeQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_q1_0_0=null;
        Token otherlv_1=null;
        Token lv_answer1_2_0=null;
        Token lv_q2_3_0=null;
        Token otherlv_4=null;
        Token lv_answer2_5_0=null;
        Token lv_q3_6_0=null;
        Token otherlv_7=null;
        Token lv_answer3_8_1=null;
        Token lv_answer3_8_2=null;
        Token lv_q4_9_0=null;
        Token otherlv_10=null;
        Enumerator lv_answer4_11_0 = null;

        EObject lv_subSentence_12_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:4363:2: ( ( ( (lv_q1_0_0= '4.14.1 What is the name of the origin port?' ) ) otherlv_1= 'Origin Port = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '4.14.2 What is the name of the destination port?' ) ) otherlv_4= 'Destination Port = ' ( (lv_answer2_5_0= RULE_STRING ) ) ( ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) ) )? ( (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' ) ) otherlv_10= 'type of voyage = ' ( (lv_answer4_11_0= ruleVoyagetype ) ) ( (lv_subSentence_12_0= ruleVoyageQuestion ) )? ) )
            // InternalSmaCQA.g:4364:2: ( ( (lv_q1_0_0= '4.14.1 What is the name of the origin port?' ) ) otherlv_1= 'Origin Port = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '4.14.2 What is the name of the destination port?' ) ) otherlv_4= 'Destination Port = ' ( (lv_answer2_5_0= RULE_STRING ) ) ( ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) ) )? ( (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' ) ) otherlv_10= 'type of voyage = ' ( (lv_answer4_11_0= ruleVoyagetype ) ) ( (lv_subSentence_12_0= ruleVoyageQuestion ) )? )
            {
            // InternalSmaCQA.g:4364:2: ( ( (lv_q1_0_0= '4.14.1 What is the name of the origin port?' ) ) otherlv_1= 'Origin Port = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '4.14.2 What is the name of the destination port?' ) ) otherlv_4= 'Destination Port = ' ( (lv_answer2_5_0= RULE_STRING ) ) ( ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) ) )? ( (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' ) ) otherlv_10= 'type of voyage = ' ( (lv_answer4_11_0= ruleVoyagetype ) ) ( (lv_subSentence_12_0= ruleVoyageQuestion ) )? )
            // InternalSmaCQA.g:4365:3: ( (lv_q1_0_0= '4.14.1 What is the name of the origin port?' ) ) otherlv_1= 'Origin Port = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '4.14.2 What is the name of the destination port?' ) ) otherlv_4= 'Destination Port = ' ( (lv_answer2_5_0= RULE_STRING ) ) ( ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) ) )? ( (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' ) ) otherlv_10= 'type of voyage = ' ( (lv_answer4_11_0= ruleVoyagetype ) ) ( (lv_subSentence_12_0= ruleVoyageQuestion ) )?
            {
            // InternalSmaCQA.g:4365:3: ( (lv_q1_0_0= '4.14.1 What is the name of the origin port?' ) )
            // InternalSmaCQA.g:4366:4: (lv_q1_0_0= '4.14.1 What is the name of the origin port?' )
            {
            // InternalSmaCQA.g:4366:4: (lv_q1_0_0= '4.14.1 What is the name of the origin port?' )
            // InternalSmaCQA.g:4367:5: lv_q1_0_0= '4.14.1 What is the name of the origin port?'
            {
            lv_q1_0_0=(Token)match(input,105,FOLLOW_109); 

            					newLeafNode(lv_q1_0_0, grammarAccess.getMaritimeQuestionAccess().getQ14141WhatIsTheNameOfTheOriginPortKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaritimeQuestionRule());
            					}
            					setWithLastConsumed(current, "q1", lv_q1_0_0, "4.14.1 What is the name of the origin port?");
            				

            }


            }

            otherlv_1=(Token)match(input,106,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getMaritimeQuestionAccess().getOriginPortKeyword_1());
            		
            // InternalSmaCQA.g:4383:3: ( (lv_answer1_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4384:4: (lv_answer1_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4384:4: (lv_answer1_2_0= RULE_STRING )
            // InternalSmaCQA.g:4385:5: lv_answer1_2_0= RULE_STRING
            {
            lv_answer1_2_0=(Token)match(input,RULE_STRING,FOLLOW_110); 

            					newLeafNode(lv_answer1_2_0, grammarAccess.getMaritimeQuestionAccess().getAnswer1STRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaritimeQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer1",
            						lv_answer1_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSmaCQA.g:4401:3: ( (lv_q2_3_0= '4.14.2 What is the name of the destination port?' ) )
            // InternalSmaCQA.g:4402:4: (lv_q2_3_0= '4.14.2 What is the name of the destination port?' )
            {
            // InternalSmaCQA.g:4402:4: (lv_q2_3_0= '4.14.2 What is the name of the destination port?' )
            // InternalSmaCQA.g:4403:5: lv_q2_3_0= '4.14.2 What is the name of the destination port?'
            {
            lv_q2_3_0=(Token)match(input,107,FOLLOW_111); 

            					newLeafNode(lv_q2_3_0, grammarAccess.getMaritimeQuestionAccess().getQ24142WhatIsTheNameOfTheDestinationPortKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaritimeQuestionRule());
            					}
            					setWithLastConsumed(current, "q2", lv_q2_3_0, "4.14.2 What is the name of the destination port?");
            				

            }


            }

            otherlv_4=(Token)match(input,108,FOLLOW_100); 

            			newLeafNode(otherlv_4, grammarAccess.getMaritimeQuestionAccess().getDestinationPortKeyword_4());
            		
            // InternalSmaCQA.g:4419:3: ( (lv_answer2_5_0= RULE_STRING ) )
            // InternalSmaCQA.g:4420:4: (lv_answer2_5_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4420:4: (lv_answer2_5_0= RULE_STRING )
            // InternalSmaCQA.g:4421:5: lv_answer2_5_0= RULE_STRING
            {
            lv_answer2_5_0=(Token)match(input,RULE_STRING,FOLLOW_112); 

            					newLeafNode(lv_answer2_5_0, grammarAccess.getMaritimeQuestionAccess().getAnswer2STRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaritimeQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer2",
            						lv_answer2_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSmaCQA.g:4437:3: ( ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==109) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSmaCQA.g:4438:4: ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) ) otherlv_7= 'answer = ' ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) )
                    {
                    // InternalSmaCQA.g:4438:4: ( (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' ) )
                    // InternalSmaCQA.g:4439:5: (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' )
                    {
                    // InternalSmaCQA.g:4439:5: (lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?' )
                    // InternalSmaCQA.g:4440:6: lv_q3_6_0= '4.14.3 In case of need, does it leave the port agent the power to make key decisions?'
                    {
                    lv_q3_6_0=(Token)match(input,109,FOLLOW_47); 

                    						newLeafNode(lv_q3_6_0, grammarAccess.getMaritimeQuestionAccess().getQ34143InCaseOfNeedDoesItLeaveThePortAgentThePowerToMakeKeyDecisionsKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaritimeQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q3", lv_q3_6_0, "4.14.3 In case of need, does it leave the port agent the power to make key decisions?");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_48); 

                    				newLeafNode(otherlv_7, grammarAccess.getMaritimeQuestionAccess().getAnswerKeyword_6_1());
                    			
                    // InternalSmaCQA.g:4456:4: ( ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) ) )
                    // InternalSmaCQA.g:4457:5: ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) )
                    {
                    // InternalSmaCQA.g:4457:5: ( (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' ) )
                    // InternalSmaCQA.g:4458:6: (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' )
                    {
                    // InternalSmaCQA.g:4458:6: (lv_answer3_8_1= 'yes' | lv_answer3_8_2= 'no' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==25) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==26) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalSmaCQA.g:4459:7: lv_answer3_8_1= 'yes'
                            {
                            lv_answer3_8_1=(Token)match(input,25,FOLLOW_113); 

                            							newLeafNode(lv_answer3_8_1, grammarAccess.getMaritimeQuestionAccess().getAnswer3YesKeyword_6_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMaritimeQuestionRule());
                            							}
                            							setWithLastConsumed(current, "answer3", lv_answer3_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalSmaCQA.g:4470:7: lv_answer3_8_2= 'no'
                            {
                            lv_answer3_8_2=(Token)match(input,26,FOLLOW_113); 

                            							newLeafNode(lv_answer3_8_2, grammarAccess.getMaritimeQuestionAccess().getAnswer3NoKeyword_6_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMaritimeQuestionRule());
                            							}
                            							setWithLastConsumed(current, "answer3", lv_answer3_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:4484:3: ( (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' ) )
            // InternalSmaCQA.g:4485:4: (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' )
            {
            // InternalSmaCQA.g:4485:4: (lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?' )
            // InternalSmaCQA.g:4486:5: lv_q4_9_0= '4.14.4 Is it a voyage charter or time charter party?'
            {
            lv_q4_9_0=(Token)match(input,110,FOLLOW_114); 

            					newLeafNode(lv_q4_9_0, grammarAccess.getMaritimeQuestionAccess().getQ44144IsItAVoyageCharterOrTimeCharterPartyKeyword_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaritimeQuestionRule());
            					}
            					setWithLastConsumed(current, "q4", lv_q4_9_0, "4.14.4 Is it a voyage charter or time charter party?");
            				

            }


            }

            otherlv_10=(Token)match(input,111,FOLLOW_115); 

            			newLeafNode(otherlv_10, grammarAccess.getMaritimeQuestionAccess().getTypeOfVoyageKeyword_8());
            		
            // InternalSmaCQA.g:4502:3: ( (lv_answer4_11_0= ruleVoyagetype ) )
            // InternalSmaCQA.g:4503:4: (lv_answer4_11_0= ruleVoyagetype )
            {
            // InternalSmaCQA.g:4503:4: (lv_answer4_11_0= ruleVoyagetype )
            // InternalSmaCQA.g:4504:5: lv_answer4_11_0= ruleVoyagetype
            {

            					newCompositeNode(grammarAccess.getMaritimeQuestionAccess().getAnswer4VoyagetypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_116);
            lv_answer4_11_0=ruleVoyagetype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaritimeQuestionRule());
            					}
            					set(
            						current,
            						"answer4",
            						lv_answer4_11_0,
            						"org.xtext.SmaCQA.Voyagetype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmaCQA.g:4521:3: ( (lv_subSentence_12_0= ruleVoyageQuestion ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==112) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSmaCQA.g:4522:4: (lv_subSentence_12_0= ruleVoyageQuestion )
                    {
                    // InternalSmaCQA.g:4522:4: (lv_subSentence_12_0= ruleVoyageQuestion )
                    // InternalSmaCQA.g:4523:5: lv_subSentence_12_0= ruleVoyageQuestion
                    {

                    					newCompositeNode(grammarAccess.getMaritimeQuestionAccess().getSubSentenceVoyageQuestionParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subSentence_12_0=ruleVoyageQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaritimeQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subSentence",
                    						lv_subSentence_12_0,
                    						"org.xtext.SmaCQA.VoyageQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaritimeQuestion"


    // $ANTLR start "entryRuleVoyageQuestion"
    // InternalSmaCQA.g:4544:1: entryRuleVoyageQuestion returns [EObject current=null] : iv_ruleVoyageQuestion= ruleVoyageQuestion EOF ;
    public final EObject entryRuleVoyageQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoyageQuestion = null;


        try {
            // InternalSmaCQA.g:4544:55: (iv_ruleVoyageQuestion= ruleVoyageQuestion EOF )
            // InternalSmaCQA.g:4545:2: iv_ruleVoyageQuestion= ruleVoyageQuestion EOF
            {
             newCompositeNode(grammarAccess.getVoyageQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoyageQuestion=ruleVoyageQuestion();

            state._fsp--;

             current =iv_ruleVoyageQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoyageQuestion"


    // $ANTLR start "ruleVoyageQuestion"
    // InternalSmaCQA.g:4551:1: ruleVoyageQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'quantity = ' ( (lv_answerSubSentence_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) ) ;
    public final EObject ruleVoyageQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answerSubSentence_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_answerUnitTime_4_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:4557:2: ( ( ( (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'quantity = ' ( (lv_answerSubSentence_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) ) )
            // InternalSmaCQA.g:4558:2: ( ( (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'quantity = ' ( (lv_answerSubSentence_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) )
            {
            // InternalSmaCQA.g:4558:2: ( ( (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'quantity = ' ( (lv_answerSubSentence_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) ) )
            // InternalSmaCQA.g:4559:3: ( (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' ) ) otherlv_1= 'quantity = ' ( (lv_answerSubSentence_2_0= RULE_INT ) ) otherlv_3= 'unitTime = ' ( (lv_answerUnitTime_4_0= ruleUnitTime ) )
            {
            // InternalSmaCQA.g:4559:3: ( (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' ) )
            // InternalSmaCQA.g:4560:4: (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' )
            {
            // InternalSmaCQA.g:4560:4: (lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)' )
            // InternalSmaCQA.g:4561:5: lv_name_0_0= '4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)'
            {
            lv_name_0_0=(Token)match(input,112,FOLLOW_117); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVoyageQuestionAccess().getName41441ForHowLongIsTheShipRentedIndicatedInMinutesDaysWeeksOrYearsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVoyageQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.14.4.1 For how long is the ship rented (indicated in minutes,days,weeks or years)");
            				

            }


            }

            otherlv_1=(Token)match(input,113,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getVoyageQuestionAccess().getQuantityKeyword_1());
            		
            // InternalSmaCQA.g:4577:3: ( (lv_answerSubSentence_2_0= RULE_INT ) )
            // InternalSmaCQA.g:4578:4: (lv_answerSubSentence_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:4578:4: (lv_answerSubSentence_2_0= RULE_INT )
            // InternalSmaCQA.g:4579:5: lv_answerSubSentence_2_0= RULE_INT
            {
            lv_answerSubSentence_2_0=(Token)match(input,RULE_INT,FOLLOW_79); 

            					newLeafNode(lv_answerSubSentence_2_0, grammarAccess.getVoyageQuestionAccess().getAnswerSubSentenceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVoyageQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answerSubSentence",
            						lv_answerSubSentence_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_80); 

            			newLeafNode(otherlv_3, grammarAccess.getVoyageQuestionAccess().getUnitTimeKeyword_3());
            		
            // InternalSmaCQA.g:4599:3: ( (lv_answerUnitTime_4_0= ruleUnitTime ) )
            // InternalSmaCQA.g:4600:4: (lv_answerUnitTime_4_0= ruleUnitTime )
            {
            // InternalSmaCQA.g:4600:4: (lv_answerUnitTime_4_0= ruleUnitTime )
            // InternalSmaCQA.g:4601:5: lv_answerUnitTime_4_0= ruleUnitTime
            {

            					newCompositeNode(grammarAccess.getVoyageQuestionAccess().getAnswerUnitTimeUnitTimeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_answerUnitTime_4_0=ruleUnitTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVoyageQuestionRule());
            					}
            					set(
            						current,
            						"answerUnitTime",
            						lv_answerUnitTime_4_0,
            						"org.xtext.SmaCQA.UnitTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoyageQuestion"


    // $ANTLR start "entryRuleMeansTransportQuestion"
    // InternalSmaCQA.g:4622:1: entryRuleMeansTransportQuestion returns [EObject current=null] : iv_ruleMeansTransportQuestion= ruleMeansTransportQuestion EOF ;
    public final EObject entryRuleMeansTransportQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeansTransportQuestion = null;


        try {
            // InternalSmaCQA.g:4622:63: (iv_ruleMeansTransportQuestion= ruleMeansTransportQuestion EOF )
            // InternalSmaCQA.g:4623:2: iv_ruleMeansTransportQuestion= ruleMeansTransportQuestion EOF
            {
             newCompositeNode(grammarAccess.getMeansTransportQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeansTransportQuestion=ruleMeansTransportQuestion();

            state._fsp--;

             current =iv_ruleMeansTransportQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeansTransportQuestion"


    // $ANTLR start "ruleMeansTransportQuestion"
    // InternalSmaCQA.g:4629:1: ruleMeansTransportQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.15 What is the means of transport?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeansTransportQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4635:2: ( ( ( (lv_name_0_0= '4.15 What is the means of transport?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:4636:2: ( ( (lv_name_0_0= '4.15 What is the means of transport?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:4636:2: ( ( (lv_name_0_0= '4.15 What is the means of transport?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:4637:3: ( (lv_name_0_0= '4.15 What is the means of transport?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:4637:3: ( (lv_name_0_0= '4.15 What is the means of transport?' ) )
            // InternalSmaCQA.g:4638:4: (lv_name_0_0= '4.15 What is the means of transport?' )
            {
            // InternalSmaCQA.g:4638:4: (lv_name_0_0= '4.15 What is the means of transport?' )
            // InternalSmaCQA.g:4639:5: lv_name_0_0= '4.15 What is the means of transport?'
            {
            lv_name_0_0=(Token)match(input,114,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMeansTransportQuestionAccess().getName415WhatIsTheMeansOfTransportKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeansTransportQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.15 What is the means of transport?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getMeansTransportQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4655:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4656:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4656:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:4657:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getMeansTransportQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeansTransportQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeansTransportQuestion"


    // $ANTLR start "entryRuleCompanyQuestion"
    // InternalSmaCQA.g:4677:1: entryRuleCompanyQuestion returns [EObject current=null] : iv_ruleCompanyQuestion= ruleCompanyQuestion EOF ;
    public final EObject entryRuleCompanyQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompanyQuestion = null;


        try {
            // InternalSmaCQA.g:4677:56: (iv_ruleCompanyQuestion= ruleCompanyQuestion EOF )
            // InternalSmaCQA.g:4678:2: iv_ruleCompanyQuestion= ruleCompanyQuestion EOF
            {
             newCompositeNode(grammarAccess.getCompanyQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompanyQuestion=ruleCompanyQuestion();

            state._fsp--;

             current =iv_ruleCompanyQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompanyQuestion"


    // $ANTLR start "ruleCompanyQuestion"
    // InternalSmaCQA.g:4684:1: ruleCompanyQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.16 What is the name of the transport company?' ) ) otherlv_1= 'name = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCompanyQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4690:2: ( ( ( (lv_name_0_0= '4.16 What is the name of the transport company?' ) ) otherlv_1= 'name = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:4691:2: ( ( (lv_name_0_0= '4.16 What is the name of the transport company?' ) ) otherlv_1= 'name = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:4691:2: ( ( (lv_name_0_0= '4.16 What is the name of the transport company?' ) ) otherlv_1= 'name = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:4692:3: ( (lv_name_0_0= '4.16 What is the name of the transport company?' ) ) otherlv_1= 'name = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:4692:3: ( (lv_name_0_0= '4.16 What is the name of the transport company?' ) )
            // InternalSmaCQA.g:4693:4: (lv_name_0_0= '4.16 What is the name of the transport company?' )
            {
            // InternalSmaCQA.g:4693:4: (lv_name_0_0= '4.16 What is the name of the transport company?' )
            // InternalSmaCQA.g:4694:5: lv_name_0_0= '4.16 What is the name of the transport company?'
            {
            lv_name_0_0=(Token)match(input,115,FOLLOW_118); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCompanyQuestionAccess().getName416WhatIsTheNameOfTheTransportCompanyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.16 What is the name of the transport company?");
            				

            }


            }

            otherlv_1=(Token)match(input,116,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getCompanyQuestionAccess().getNameKeyword_1());
            		
            // InternalSmaCQA.g:4710:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4711:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4711:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:4712:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getCompanyQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompanyQuestion"


    // $ANTLR start "entryRuleDeliveryDeadlineQuestion"
    // InternalSmaCQA.g:4732:1: entryRuleDeliveryDeadlineQuestion returns [EObject current=null] : iv_ruleDeliveryDeadlineQuestion= ruleDeliveryDeadlineQuestion EOF ;
    public final EObject entryRuleDeliveryDeadlineQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryDeadlineQuestion = null;


        try {
            // InternalSmaCQA.g:4732:65: (iv_ruleDeliveryDeadlineQuestion= ruleDeliveryDeadlineQuestion EOF )
            // InternalSmaCQA.g:4733:2: iv_ruleDeliveryDeadlineQuestion= ruleDeliveryDeadlineQuestion EOF
            {
             newCompositeNode(grammarAccess.getDeliveryDeadlineQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeliveryDeadlineQuestion=ruleDeliveryDeadlineQuestion();

            state._fsp--;

             current =iv_ruleDeliveryDeadlineQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeliveryDeadlineQuestion"


    // $ANTLR start "ruleDeliveryDeadlineQuestion"
    // InternalSmaCQA.g:4739:1: ruleDeliveryDeadlineQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.17 What is the deadline for delivery?' ) ) otherlv_1= 'deadline = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeliveryDeadlineQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4745:2: ( ( ( (lv_name_0_0= '4.17 What is the deadline for delivery?' ) ) otherlv_1= 'deadline = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:4746:2: ( ( (lv_name_0_0= '4.17 What is the deadline for delivery?' ) ) otherlv_1= 'deadline = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:4746:2: ( ( (lv_name_0_0= '4.17 What is the deadline for delivery?' ) ) otherlv_1= 'deadline = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:4747:3: ( (lv_name_0_0= '4.17 What is the deadline for delivery?' ) ) otherlv_1= 'deadline = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:4747:3: ( (lv_name_0_0= '4.17 What is the deadline for delivery?' ) )
            // InternalSmaCQA.g:4748:4: (lv_name_0_0= '4.17 What is the deadline for delivery?' )
            {
            // InternalSmaCQA.g:4748:4: (lv_name_0_0= '4.17 What is the deadline for delivery?' )
            // InternalSmaCQA.g:4749:5: lv_name_0_0= '4.17 What is the deadline for delivery?'
            {
            lv_name_0_0=(Token)match(input,117,FOLLOW_119); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeliveryDeadlineQuestionAccess().getName417WhatIsTheDeadlineForDeliveryKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryDeadlineQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.17 What is the deadline for delivery?");
            				

            }


            }

            otherlv_1=(Token)match(input,118,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getDeliveryDeadlineQuestionAccess().getDeadlineKeyword_1());
            		
            // InternalSmaCQA.g:4765:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4766:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4766:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:4767:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getDeliveryDeadlineQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryDeadlineQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeliveryDeadlineQuestion"


    // $ANTLR start "entryRuleUpdatesAndMonitoringQuestion"
    // InternalSmaCQA.g:4787:1: entryRuleUpdatesAndMonitoringQuestion returns [EObject current=null] : iv_ruleUpdatesAndMonitoringQuestion= ruleUpdatesAndMonitoringQuestion EOF ;
    public final EObject entryRuleUpdatesAndMonitoringQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatesAndMonitoringQuestion = null;


        try {
            // InternalSmaCQA.g:4787:69: (iv_ruleUpdatesAndMonitoringQuestion= ruleUpdatesAndMonitoringQuestion EOF )
            // InternalSmaCQA.g:4788:2: iv_ruleUpdatesAndMonitoringQuestion= ruleUpdatesAndMonitoringQuestion EOF
            {
             newCompositeNode(grammarAccess.getUpdatesAndMonitoringQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdatesAndMonitoringQuestion=ruleUpdatesAndMonitoringQuestion();

            state._fsp--;

             current =iv_ruleUpdatesAndMonitoringQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdatesAndMonitoringQuestion"


    // $ANTLR start "ruleUpdatesAndMonitoringQuestion"
    // InternalSmaCQA.g:4794:1: ruleUpdatesAndMonitoringQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUpdatesAndMonitoringQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4800:2: ( ( ( (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:4801:2: ( ( (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:4801:2: ( ( (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:4802:3: ( (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:4802:3: ( (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' ) )
            // InternalSmaCQA.g:4803:4: (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' )
            {
            // InternalSmaCQA.g:4803:4: (lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?' )
            // InternalSmaCQA.g:4804:5: lv_name_0_0= '4.18 Through what means will updates and monitoring data be received?'
            {
            lv_name_0_0=(Token)match(input,119,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUpdatesAndMonitoringQuestionAccess().getName418ThroughWhatMeansWillUpdatesAndMonitoringDataBeReceivedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatesAndMonitoringQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.18 Through what means will updates and monitoring data be received?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdatesAndMonitoringQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4820:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:4821:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:4821:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:4822:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getUpdatesAndMonitoringQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatesAndMonitoringQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdatesAndMonitoringQuestion"


    // $ANTLR start "entryRuleExternalMediatorQuestion"
    // InternalSmaCQA.g:4842:1: entryRuleExternalMediatorQuestion returns [EObject current=null] : iv_ruleExternalMediatorQuestion= ruleExternalMediatorQuestion EOF ;
    public final EObject entryRuleExternalMediatorQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMediatorQuestion = null;


        try {
            // InternalSmaCQA.g:4842:65: (iv_ruleExternalMediatorQuestion= ruleExternalMediatorQuestion EOF )
            // InternalSmaCQA.g:4843:2: iv_ruleExternalMediatorQuestion= ruleExternalMediatorQuestion EOF
            {
             newCompositeNode(grammarAccess.getExternalMediatorQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalMediatorQuestion=ruleExternalMediatorQuestion();

            state._fsp--;

             current =iv_ruleExternalMediatorQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalMediatorQuestion"


    // $ANTLR start "ruleExternalMediatorQuestion"
    // InternalSmaCQA.g:4849:1: ruleExternalMediatorQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleMediatorNameQuestion ) )? ) ;
    public final EObject ruleExternalMediatorQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subsentence_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:4855:2: ( ( ( (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleMediatorNameQuestion ) )? ) )
            // InternalSmaCQA.g:4856:2: ( ( (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleMediatorNameQuestion ) )? )
            {
            // InternalSmaCQA.g:4856:2: ( ( (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleMediatorNameQuestion ) )? )
            // InternalSmaCQA.g:4857:3: ( (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleMediatorNameQuestion ) )?
            {
            // InternalSmaCQA.g:4857:3: ( (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' ) )
            // InternalSmaCQA.g:4858:4: (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' )
            {
            // InternalSmaCQA.g:4858:4: (lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?' )
            // InternalSmaCQA.g:4859:5: lv_name_0_0= '4.19 In case of dispute, is it considered to appoint an external mediator?'
            {
            lv_name_0_0=(Token)match(input,120,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExternalMediatorQuestionAccess().getName419InCaseOfDisputeIsItConsideredToAppointAnExternalMediatorKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalMediatorQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.19 In case of dispute, is it considered to appoint an external mediator?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalMediatorQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4875:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:4876:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:4876:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:4877:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:4877:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==25) ) {
                alt82=1;
            }
            else if ( (LA82_0==26) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalSmaCQA.g:4878:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_120); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getExternalMediatorQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalMediatorQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:4889:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_120); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getExternalMediatorQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalMediatorQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:4902:3: ( (lv_subsentence_3_0= ruleMediatorNameQuestion ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==121) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSmaCQA.g:4903:4: (lv_subsentence_3_0= ruleMediatorNameQuestion )
                    {
                    // InternalSmaCQA.g:4903:4: (lv_subsentence_3_0= ruleMediatorNameQuestion )
                    // InternalSmaCQA.g:4904:5: lv_subsentence_3_0= ruleMediatorNameQuestion
                    {

                    					newCompositeNode(grammarAccess.getExternalMediatorQuestionAccess().getSubsentenceMediatorNameQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subsentence_3_0=ruleMediatorNameQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalMediatorQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subsentence",
                    						lv_subsentence_3_0,
                    						"org.xtext.SmaCQA.MediatorNameQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalMediatorQuestion"


    // $ANTLR start "entryRuleMediatorNameQuestion"
    // InternalSmaCQA.g:4925:1: entryRuleMediatorNameQuestion returns [EObject current=null] : iv_ruleMediatorNameQuestion= ruleMediatorNameQuestion EOF ;
    public final EObject entryRuleMediatorNameQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediatorNameQuestion = null;


        try {
            // InternalSmaCQA.g:4925:61: (iv_ruleMediatorNameQuestion= ruleMediatorNameQuestion EOF )
            // InternalSmaCQA.g:4926:2: iv_ruleMediatorNameQuestion= ruleMediatorNameQuestion EOF
            {
             newCompositeNode(grammarAccess.getMediatorNameQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMediatorNameQuestion=ruleMediatorNameQuestion();

            state._fsp--;

             current =iv_ruleMediatorNameQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediatorNameQuestion"


    // $ANTLR start "ruleMediatorNameQuestion"
    // InternalSmaCQA.g:4932:1: ruleMediatorNameQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMediatorNameQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4938:2: ( ( ( (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) ) )
            // InternalSmaCQA.g:4939:2: ( ( (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) )
            {
            // InternalSmaCQA.g:4939:2: ( ( (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) ) )
            // InternalSmaCQA.g:4940:3: ( (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_ID ) )
            {
            // InternalSmaCQA.g:4940:3: ( (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' ) )
            // InternalSmaCQA.g:4941:4: (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' )
            {
            // InternalSmaCQA.g:4941:4: (lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?' )
            // InternalSmaCQA.g:4942:5: lv_name_0_0= '4.19.1 What is the name of the individual or company mediating external to the two parties?'
            {
            lv_name_0_0=(Token)match(input,121,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMediatorNameQuestionAccess().getName4191WhatIsTheNameOfTheIndividualOrCompanyMediatingExternalToTheTwoPartiesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMediatorNameQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "4.19.1 What is the name of the individual or company mediating external to the two parties?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMediatorNameQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:4958:3: ( (lv_answer_2_0= RULE_ID ) )
            // InternalSmaCQA.g:4959:4: (lv_answer_2_0= RULE_ID )
            {
            // InternalSmaCQA.g:4959:4: (lv_answer_2_0= RULE_ID )
            // InternalSmaCQA.g:4960:5: lv_answer_2_0= RULE_ID
            {
            lv_answer_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getMediatorNameQuestionAccess().getAnswerIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMediatorNameQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediatorNameQuestion"


    // $ANTLR start "entryRuleShipmentInsuranceQuestion"
    // InternalSmaCQA.g:4980:1: entryRuleShipmentInsuranceQuestion returns [EObject current=null] : iv_ruleShipmentInsuranceQuestion= ruleShipmentInsuranceQuestion EOF ;
    public final EObject entryRuleShipmentInsuranceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipmentInsuranceQuestion = null;


        try {
            // InternalSmaCQA.g:4980:66: (iv_ruleShipmentInsuranceQuestion= ruleShipmentInsuranceQuestion EOF )
            // InternalSmaCQA.g:4981:2: iv_ruleShipmentInsuranceQuestion= ruleShipmentInsuranceQuestion EOF
            {
             newCompositeNode(grammarAccess.getShipmentInsuranceQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipmentInsuranceQuestion=ruleShipmentInsuranceQuestion();

            state._fsp--;

             current =iv_ruleShipmentInsuranceQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipmentInsuranceQuestion"


    // $ANTLR start "ruleShipmentInsuranceQuestion"
    // InternalSmaCQA.g:4987:1: ruleShipmentInsuranceQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '5.1 Is the cargo insured?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleShipmentInsuranceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:4993:2: ( ( ( (lv_name_0_0= '5.1 Is the cargo insured?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:4994:2: ( ( (lv_name_0_0= '5.1 Is the cargo insured?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:4994:2: ( ( (lv_name_0_0= '5.1 Is the cargo insured?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:4995:3: ( (lv_name_0_0= '5.1 Is the cargo insured?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:4995:3: ( (lv_name_0_0= '5.1 Is the cargo insured?' ) )
            // InternalSmaCQA.g:4996:4: (lv_name_0_0= '5.1 Is the cargo insured?' )
            {
            // InternalSmaCQA.g:4996:4: (lv_name_0_0= '5.1 Is the cargo insured?' )
            // InternalSmaCQA.g:4997:5: lv_name_0_0= '5.1 Is the cargo insured?'
            {
            lv_name_0_0=(Token)match(input,122,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getShipmentInsuranceQuestionAccess().getName51IsTheCargoInsuredKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShipmentInsuranceQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "5.1 Is the cargo insured?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getShipmentInsuranceQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5013:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:5014:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:5014:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:5015:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:5015:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==25) ) {
                alt84=1;
            }
            else if ( (LA84_0==26) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalSmaCQA.g:5016:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getShipmentInsuranceQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentInsuranceQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:5027:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getShipmentInsuranceQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShipmentInsuranceQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipmentInsuranceQuestion"


    // $ANTLR start "entryRuleInsuranceDetailsQuestion"
    // InternalSmaCQA.g:5044:1: entryRuleInsuranceDetailsQuestion returns [EObject current=null] : iv_ruleInsuranceDetailsQuestion= ruleInsuranceDetailsQuestion EOF ;
    public final EObject entryRuleInsuranceDetailsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsuranceDetailsQuestion = null;


        try {
            // InternalSmaCQA.g:5044:65: (iv_ruleInsuranceDetailsQuestion= ruleInsuranceDetailsQuestion EOF )
            // InternalSmaCQA.g:5045:2: iv_ruleInsuranceDetailsQuestion= ruleInsuranceDetailsQuestion EOF
            {
             newCompositeNode(grammarAccess.getInsuranceDetailsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsuranceDetailsQuestion=ruleInsuranceDetailsQuestion();

            state._fsp--;

             current =iv_ruleInsuranceDetailsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsuranceDetailsQuestion"


    // $ANTLR start "ruleInsuranceDetailsQuestion"
    // InternalSmaCQA.g:5051:1: ruleInsuranceDetailsQuestion returns [EObject current=null] : ( ( ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) ) )? ( ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) ) )? ( ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) ) )? ) ;
    public final EObject ruleInsuranceDetailsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_q1_0_0=null;
        Token otherlv_1=null;
        Token lv_answer1_2_0=null;
        Token otherlv_3=null;
        Token lv_q2_5_0=null;
        Token otherlv_6=null;
        Token lv_answer2_7_0=null;
        Token lv_q3_8_0=null;
        Token otherlv_9=null;
        Token lv_answer3_10_0=null;
        Token otherlv_11=null;
        Enumerator lv_answerUnitCoin1_4_0 = null;

        Enumerator lv_answerUnitCoin3_12_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5057:2: ( ( ( ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) ) )? ( ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) ) )? ( ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) ) )? ) )
            // InternalSmaCQA.g:5058:2: ( ( ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) ) )? ( ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) ) )? ( ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) ) )? )
            {
            // InternalSmaCQA.g:5058:2: ( ( ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) ) )? ( ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) ) )? ( ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) ) )? )
            // InternalSmaCQA.g:5059:3: ( ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) ) )? ( ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) ) )? ( ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) ) )?
            {
            // InternalSmaCQA.g:5059:3: ( ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==123) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSmaCQA.g:5060:4: ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) ) otherlv_1= 'quantity = ' ( (lv_answer1_2_0= RULE_INT ) ) otherlv_3= 'unitCoin=' ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) )
                    {
                    // InternalSmaCQA.g:5060:4: ( (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' ) )
                    // InternalSmaCQA.g:5061:5: (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' )
                    {
                    // InternalSmaCQA.g:5061:5: (lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?' )
                    // InternalSmaCQA.g:5062:6: lv_q1_0_0= '5.1.1 What is the cost of insurance (per unit asset)?'
                    {
                    lv_q1_0_0=(Token)match(input,123,FOLLOW_117); 

                    						newLeafNode(lv_q1_0_0, grammarAccess.getInsuranceDetailsQuestionAccess().getQ1511WhatIsTheCostOfInsurancePerUnitAssetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q1", lv_q1_0_0, "5.1.1 What is the cost of insurance (per unit asset)?");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,113,FOLLOW_58); 

                    				newLeafNode(otherlv_1, grammarAccess.getInsuranceDetailsQuestionAccess().getQuantityKeyword_0_1());
                    			
                    // InternalSmaCQA.g:5078:4: ( (lv_answer1_2_0= RULE_INT ) )
                    // InternalSmaCQA.g:5079:5: (lv_answer1_2_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:5079:5: (lv_answer1_2_0= RULE_INT )
                    // InternalSmaCQA.g:5080:6: lv_answer1_2_0= RULE_INT
                    {
                    lv_answer1_2_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    						newLeafNode(lv_answer1_2_0, grammarAccess.getInsuranceDetailsQuestionAccess().getAnswer1INTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer1",
                    							lv_answer1_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,73,FOLLOW_73); 

                    				newLeafNode(otherlv_3, grammarAccess.getInsuranceDetailsQuestionAccess().getUnitCoinKeyword_0_3());
                    			
                    // InternalSmaCQA.g:5100:4: ( (lv_answerUnitCoin1_4_0= ruleUnitCoin ) )
                    // InternalSmaCQA.g:5101:5: (lv_answerUnitCoin1_4_0= ruleUnitCoin )
                    {
                    // InternalSmaCQA.g:5101:5: (lv_answerUnitCoin1_4_0= ruleUnitCoin )
                    // InternalSmaCQA.g:5102:6: lv_answerUnitCoin1_4_0= ruleUnitCoin
                    {

                    						newCompositeNode(grammarAccess.getInsuranceDetailsQuestionAccess().getAnswerUnitCoin1UnitCoinEnumRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_121);
                    lv_answerUnitCoin1_4_0=ruleUnitCoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						set(
                    							current,
                    							"answerUnitCoin1",
                    							lv_answerUnitCoin1_4_0,
                    							"org.xtext.SmaCQA.UnitCoin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:5120:3: ( ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==124) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSmaCQA.g:5121:4: ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) ) otherlv_6= 'answer = ' ( (lv_answer2_7_0= RULE_STRING ) )
                    {
                    // InternalSmaCQA.g:5121:4: ( (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' ) )
                    // InternalSmaCQA.g:5122:5: (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' )
                    {
                    // InternalSmaCQA.g:5122:5: (lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?' )
                    // InternalSmaCQA.g:5123:6: lv_q2_5_0= '5.1.2 What cases are covered by the insurance (insurance clauses)?'
                    {
                    lv_q2_5_0=(Token)match(input,124,FOLLOW_47); 

                    						newLeafNode(lv_q2_5_0, grammarAccess.getInsuranceDetailsQuestionAccess().getQ2512WhatCasesAreCoveredByTheInsuranceInsuranceClausesKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q2", lv_q2_5_0, "5.1.2 What cases are covered by the insurance (insurance clauses)?");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_100); 

                    				newLeafNode(otherlv_6, grammarAccess.getInsuranceDetailsQuestionAccess().getAnswerKeyword_1_1());
                    			
                    // InternalSmaCQA.g:5139:4: ( (lv_answer2_7_0= RULE_STRING ) )
                    // InternalSmaCQA.g:5140:5: (lv_answer2_7_0= RULE_STRING )
                    {
                    // InternalSmaCQA.g:5140:5: (lv_answer2_7_0= RULE_STRING )
                    // InternalSmaCQA.g:5141:6: lv_answer2_7_0= RULE_STRING
                    {
                    lv_answer2_7_0=(Token)match(input,RULE_STRING,FOLLOW_122); 

                    						newLeafNode(lv_answer2_7_0, grammarAccess.getInsuranceDetailsQuestionAccess().getAnswer2STRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer2",
                    							lv_answer2_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmaCQA.g:5158:3: ( ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==125) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSmaCQA.g:5159:4: ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) ) otherlv_9= 'answer = ' ( (lv_answer3_10_0= RULE_INT ) ) otherlv_11= 'unitCoin=' ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) )
                    {
                    // InternalSmaCQA.g:5159:4: ( (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' ) )
                    // InternalSmaCQA.g:5160:5: (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' )
                    {
                    // InternalSmaCQA.g:5160:5: (lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?' )
                    // InternalSmaCQA.g:5161:6: lv_q3_8_0= '5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?'
                    {
                    lv_q3_8_0=(Token)match(input,125,FOLLOW_47); 

                    						newLeafNode(lv_q3_8_0, grammarAccess.getInsuranceDetailsQuestionAccess().getQ3513HowMuchWouldBeTheRefundPaidInCaseOfLossOrCargoDeliveredInPoorConditionKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "q3", lv_q3_8_0, "5.1.3 How much would be the refund paid in case of loss or cargo delivered in poor condition?");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getInsuranceDetailsQuestionAccess().getAnswerKeyword_2_1());
                    			
                    // InternalSmaCQA.g:5177:4: ( (lv_answer3_10_0= RULE_INT ) )
                    // InternalSmaCQA.g:5178:5: (lv_answer3_10_0= RULE_INT )
                    {
                    // InternalSmaCQA.g:5178:5: (lv_answer3_10_0= RULE_INT )
                    // InternalSmaCQA.g:5179:6: lv_answer3_10_0= RULE_INT
                    {
                    lv_answer3_10_0=(Token)match(input,RULE_INT,FOLLOW_89); 

                    						newLeafNode(lv_answer3_10_0, grammarAccess.getInsuranceDetailsQuestionAccess().getAnswer3INTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"answer3",
                    							lv_answer3_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,73,FOLLOW_73); 

                    				newLeafNode(otherlv_11, grammarAccess.getInsuranceDetailsQuestionAccess().getUnitCoinKeyword_2_3());
                    			
                    // InternalSmaCQA.g:5199:4: ( (lv_answerUnitCoin3_12_0= ruleUnitCoin ) )
                    // InternalSmaCQA.g:5200:5: (lv_answerUnitCoin3_12_0= ruleUnitCoin )
                    {
                    // InternalSmaCQA.g:5200:5: (lv_answerUnitCoin3_12_0= ruleUnitCoin )
                    // InternalSmaCQA.g:5201:6: lv_answerUnitCoin3_12_0= ruleUnitCoin
                    {

                    						newCompositeNode(grammarAccess.getInsuranceDetailsQuestionAccess().getAnswerUnitCoin3UnitCoinEnumRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_answerUnitCoin3_12_0=ruleUnitCoin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsuranceDetailsQuestionRule());
                    						}
                    						set(
                    							current,
                    							"answerUnitCoin3",
                    							lv_answerUnitCoin3_12_0,
                    							"org.xtext.SmaCQA.UnitCoin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsuranceDetailsQuestion"


    // $ANTLR start "entryRuleReturnsOrCancellationsQuestion"
    // InternalSmaCQA.g:5223:1: entryRuleReturnsOrCancellationsQuestion returns [EObject current=null] : iv_ruleReturnsOrCancellationsQuestion= ruleReturnsOrCancellationsQuestion EOF ;
    public final EObject entryRuleReturnsOrCancellationsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsOrCancellationsQuestion = null;


        try {
            // InternalSmaCQA.g:5223:71: (iv_ruleReturnsOrCancellationsQuestion= ruleReturnsOrCancellationsQuestion EOF )
            // InternalSmaCQA.g:5224:2: iv_ruleReturnsOrCancellationsQuestion= ruleReturnsOrCancellationsQuestion EOF
            {
             newCompositeNode(grammarAccess.getReturnsOrCancellationsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnsOrCancellationsQuestion=ruleReturnsOrCancellationsQuestion();

            state._fsp--;

             current =iv_ruleReturnsOrCancellationsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnsOrCancellationsQuestion"


    // $ANTLR start "ruleReturnsOrCancellationsQuestion"
    // InternalSmaCQA.g:5230:1: ruleReturnsOrCancellationsQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleReturnsManagementQuestion ) )? ) ;
    public final EObject ruleReturnsOrCancellationsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subsentence_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5236:2: ( ( ( (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleReturnsManagementQuestion ) )? ) )
            // InternalSmaCQA.g:5237:2: ( ( (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleReturnsManagementQuestion ) )? )
            {
            // InternalSmaCQA.g:5237:2: ( ( (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleReturnsManagementQuestion ) )? )
            // InternalSmaCQA.g:5238:3: ( (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleReturnsManagementQuestion ) )?
            {
            // InternalSmaCQA.g:5238:3: ( (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' ) )
            // InternalSmaCQA.g:5239:4: (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' )
            {
            // InternalSmaCQA.g:5239:4: (lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?' )
            // InternalSmaCQA.g:5240:5: lv_name_0_0= '5.2 Is the possibility of returns or cancellations in the exchange foreseen?'
            {
            lv_name_0_0=(Token)match(input,126,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReturnsOrCancellationsQuestionAccess().getName52IsThePossibilityOfReturnsOrCancellationsInTheExchangeForeseenKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnsOrCancellationsQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "5.2 Is the possibility of returns or cancellations in the exchange foreseen?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnsOrCancellationsQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5256:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:5257:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:5257:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:5258:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:5258:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==25) ) {
                alt88=1;
            }
            else if ( (LA88_0==26) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalSmaCQA.g:5259:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_123); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getReturnsOrCancellationsQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReturnsOrCancellationsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:5270:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_123); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getReturnsOrCancellationsQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReturnsOrCancellationsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:5283:3: ( (lv_subsentence_3_0= ruleReturnsManagementQuestion ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==127) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSmaCQA.g:5284:4: (lv_subsentence_3_0= ruleReturnsManagementQuestion )
                    {
                    // InternalSmaCQA.g:5284:4: (lv_subsentence_3_0= ruleReturnsManagementQuestion )
                    // InternalSmaCQA.g:5285:5: lv_subsentence_3_0= ruleReturnsManagementQuestion
                    {

                    					newCompositeNode(grammarAccess.getReturnsOrCancellationsQuestionAccess().getSubsentenceReturnsManagementQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subsentence_3_0=ruleReturnsManagementQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReturnsOrCancellationsQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subsentence",
                    						lv_subsentence_3_0,
                    						"org.xtext.SmaCQA.ReturnsManagementQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnsOrCancellationsQuestion"


    // $ANTLR start "entryRuleReturnsManagementQuestion"
    // InternalSmaCQA.g:5306:1: entryRuleReturnsManagementQuestion returns [EObject current=null] : iv_ruleReturnsManagementQuestion= ruleReturnsManagementQuestion EOF ;
    public final EObject entryRuleReturnsManagementQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnsManagementQuestion = null;


        try {
            // InternalSmaCQA.g:5306:66: (iv_ruleReturnsManagementQuestion= ruleReturnsManagementQuestion EOF )
            // InternalSmaCQA.g:5307:2: iv_ruleReturnsManagementQuestion= ruleReturnsManagementQuestion EOF
            {
             newCompositeNode(grammarAccess.getReturnsManagementQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnsManagementQuestion=ruleReturnsManagementQuestion();

            state._fsp--;

             current =iv_ruleReturnsManagementQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnsManagementQuestion"


    // $ANTLR start "ruleReturnsManagementQuestion"
    // InternalSmaCQA.g:5313:1: ruleReturnsManagementQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleReturnsManagementQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:5319:2: ( ( ( (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:5320:2: ( ( (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:5320:2: ( ( (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:5321:3: ( (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:5321:3: ( (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' ) )
            // InternalSmaCQA.g:5322:4: (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' )
            {
            // InternalSmaCQA.g:5322:4: (lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?' )
            // InternalSmaCQA.g:5323:5: lv_name_0_0= '5.2.1 How would returns or cancellations be managed according to the terms of the contract?'
            {
            lv_name_0_0=(Token)match(input,127,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReturnsManagementQuestionAccess().getName521HowWouldReturnsOrCancellationsBeManagedAccordingToTheTermsOfTheContractKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnsManagementQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "5.2.1 How would returns or cancellations be managed according to the terms of the contract?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnsManagementQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5339:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:5340:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:5340:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:5341:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getReturnsManagementQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnsManagementQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnsManagementQuestion"


    // $ANTLR start "entryRulePenaltyForNeglectQuestion"
    // InternalSmaCQA.g:5361:1: entryRulePenaltyForNeglectQuestion returns [EObject current=null] : iv_rulePenaltyForNeglectQuestion= rulePenaltyForNeglectQuestion EOF ;
    public final EObject entryRulePenaltyForNeglectQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenaltyForNeglectQuestion = null;


        try {
            // InternalSmaCQA.g:5361:66: (iv_rulePenaltyForNeglectQuestion= rulePenaltyForNeglectQuestion EOF )
            // InternalSmaCQA.g:5362:2: iv_rulePenaltyForNeglectQuestion= rulePenaltyForNeglectQuestion EOF
            {
             newCompositeNode(grammarAccess.getPenaltyForNeglectQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenaltyForNeglectQuestion=rulePenaltyForNeglectQuestion();

            state._fsp--;

             current =iv_rulePenaltyForNeglectQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenaltyForNeglectQuestion"


    // $ANTLR start "rulePenaltyForNeglectQuestion"
    // InternalSmaCQA.g:5368:1: rulePenaltyForNeglectQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePenaltyForNeglectQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:5374:2: ( ( ( (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:5375:2: ( ( (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:5375:2: ( ( (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:5376:3: ( (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:5376:3: ( (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' ) )
            // InternalSmaCQA.g:5377:4: (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' )
            {
            // InternalSmaCQA.g:5377:4: (lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?' )
            // InternalSmaCQA.g:5378:5: lv_name_0_0= '5.3 What is the penalty in case of neglect or abandonment of duties?'
            {
            lv_name_0_0=(Token)match(input,128,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPenaltyForNeglectQuestionAccess().getName53WhatIsThePenaltyInCaseOfNeglectOrAbandonmentOfDutiesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPenaltyForNeglectQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "5.3 What is the penalty in case of neglect or abandonment of duties?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getPenaltyForNeglectQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5394:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:5395:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:5395:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:5396:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getPenaltyForNeglectQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPenaltyForNeglectQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenaltyForNeglectQuestion"


    // $ANTLR start "entryRuleAgreedPriceQuestion"
    // InternalSmaCQA.g:5416:1: entryRuleAgreedPriceQuestion returns [EObject current=null] : iv_ruleAgreedPriceQuestion= ruleAgreedPriceQuestion EOF ;
    public final EObject entryRuleAgreedPriceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgreedPriceQuestion = null;


        try {
            // InternalSmaCQA.g:5416:60: (iv_ruleAgreedPriceQuestion= ruleAgreedPriceQuestion EOF )
            // InternalSmaCQA.g:5417:2: iv_ruleAgreedPriceQuestion= ruleAgreedPriceQuestion EOF
            {
             newCompositeNode(grammarAccess.getAgreedPriceQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgreedPriceQuestion=ruleAgreedPriceQuestion();

            state._fsp--;

             current =iv_ruleAgreedPriceQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgreedPriceQuestion"


    // $ANTLR start "ruleAgreedPriceQuestion"
    // InternalSmaCQA.g:5423:1: ruleAgreedPriceQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' ) ) otherlv_1= 'quanity = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitCoin' ( (lv_answerUnitCoin_4_0= ruleUnitCoin ) ) ) ;
    public final EObject ruleAgreedPriceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_answerUnitCoin_4_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5429:2: ( ( ( (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' ) ) otherlv_1= 'quanity = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitCoin' ( (lv_answerUnitCoin_4_0= ruleUnitCoin ) ) ) )
            // InternalSmaCQA.g:5430:2: ( ( (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' ) ) otherlv_1= 'quanity = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitCoin' ( (lv_answerUnitCoin_4_0= ruleUnitCoin ) ) )
            {
            // InternalSmaCQA.g:5430:2: ( ( (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' ) ) otherlv_1= 'quanity = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitCoin' ( (lv_answerUnitCoin_4_0= ruleUnitCoin ) ) )
            // InternalSmaCQA.g:5431:3: ( (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' ) ) otherlv_1= 'quanity = ' ( (lv_answer_2_0= RULE_INT ) ) otherlv_3= 'unitCoin' ( (lv_answerUnitCoin_4_0= ruleUnitCoin ) )
            {
            // InternalSmaCQA.g:5431:3: ( (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' ) )
            // InternalSmaCQA.g:5432:4: (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' )
            {
            // InternalSmaCQA.g:5432:4: (lv_name_0_0= '6.1 What is the agreed price per unit of product ?' )
            // InternalSmaCQA.g:5433:5: lv_name_0_0= '6.1 What is the agreed price per unit of product ?'
            {
            lv_name_0_0=(Token)match(input,129,FOLLOW_124); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAgreedPriceQuestionAccess().getName61WhatIsTheAgreedPricePerUnitOfProductKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgreedPriceQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.1 What is the agreed price per unit of product ?");
            				

            }


            }

            otherlv_1=(Token)match(input,130,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getAgreedPriceQuestionAccess().getQuanityKeyword_1());
            		
            // InternalSmaCQA.g:5449:3: ( (lv_answer_2_0= RULE_INT ) )
            // InternalSmaCQA.g:5450:4: (lv_answer_2_0= RULE_INT )
            {
            // InternalSmaCQA.g:5450:4: (lv_answer_2_0= RULE_INT )
            // InternalSmaCQA.g:5451:5: lv_answer_2_0= RULE_INT
            {
            lv_answer_2_0=(Token)match(input,RULE_INT,FOLLOW_125); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getAgreedPriceQuestionAccess().getAnswerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgreedPriceQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,131,FOLLOW_73); 

            			newLeafNode(otherlv_3, grammarAccess.getAgreedPriceQuestionAccess().getUnitCoinKeyword_3());
            		
            // InternalSmaCQA.g:5471:3: ( (lv_answerUnitCoin_4_0= ruleUnitCoin ) )
            // InternalSmaCQA.g:5472:4: (lv_answerUnitCoin_4_0= ruleUnitCoin )
            {
            // InternalSmaCQA.g:5472:4: (lv_answerUnitCoin_4_0= ruleUnitCoin )
            // InternalSmaCQA.g:5473:5: lv_answerUnitCoin_4_0= ruleUnitCoin
            {

            					newCompositeNode(grammarAccess.getAgreedPriceQuestionAccess().getAnswerUnitCoinUnitCoinEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_answerUnitCoin_4_0=ruleUnitCoin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgreedPriceQuestionRule());
            					}
            					set(
            						current,
            						"answerUnitCoin",
            						lv_answerUnitCoin_4_0,
            						"org.xtext.SmaCQA.UnitCoin");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgreedPriceQuestion"


    // $ANTLR start "entryRuleProductQualityQuestion"
    // InternalSmaCQA.g:5494:1: entryRuleProductQualityQuestion returns [EObject current=null] : iv_ruleProductQualityQuestion= ruleProductQualityQuestion EOF ;
    public final EObject entryRuleProductQualityQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductQualityQuestion = null;


        try {
            // InternalSmaCQA.g:5494:63: (iv_ruleProductQualityQuestion= ruleProductQualityQuestion EOF )
            // InternalSmaCQA.g:5495:2: iv_ruleProductQualityQuestion= ruleProductQualityQuestion EOF
            {
             newCompositeNode(grammarAccess.getProductQualityQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductQualityQuestion=ruleProductQualityQuestion();

            state._fsp--;

             current =iv_ruleProductQualityQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductQualityQuestion"


    // $ANTLR start "ruleProductQualityQuestion"
    // InternalSmaCQA.g:5501:1: ruleProductQualityQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.2 What is the expected quality of the product?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_expectedQuality_3_0= ruleExpectedQualityQuestion ) )? ) ;
    public final EObject ruleProductQualityQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;
        EObject lv_expectedQuality_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5507:2: ( ( ( (lv_name_0_0= '6.2 What is the expected quality of the product?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_expectedQuality_3_0= ruleExpectedQualityQuestion ) )? ) )
            // InternalSmaCQA.g:5508:2: ( ( (lv_name_0_0= '6.2 What is the expected quality of the product?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_expectedQuality_3_0= ruleExpectedQualityQuestion ) )? )
            {
            // InternalSmaCQA.g:5508:2: ( ( (lv_name_0_0= '6.2 What is the expected quality of the product?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_expectedQuality_3_0= ruleExpectedQualityQuestion ) )? )
            // InternalSmaCQA.g:5509:3: ( (lv_name_0_0= '6.2 What is the expected quality of the product?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ( (lv_expectedQuality_3_0= ruleExpectedQualityQuestion ) )?
            {
            // InternalSmaCQA.g:5509:3: ( (lv_name_0_0= '6.2 What is the expected quality of the product?' ) )
            // InternalSmaCQA.g:5510:4: (lv_name_0_0= '6.2 What is the expected quality of the product?' )
            {
            // InternalSmaCQA.g:5510:4: (lv_name_0_0= '6.2 What is the expected quality of the product?' )
            // InternalSmaCQA.g:5511:5: lv_name_0_0= '6.2 What is the expected quality of the product?'
            {
            lv_name_0_0=(Token)match(input,132,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProductQualityQuestionAccess().getName62WhatIsTheExpectedQualityOfTheProductKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductQualityQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.2 What is the expected quality of the product?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getProductQualityQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5527:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:5528:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:5528:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:5529:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_126); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getProductQualityQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductQualityQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSmaCQA.g:5545:3: ( (lv_expectedQuality_3_0= ruleExpectedQualityQuestion ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==133) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSmaCQA.g:5546:4: (lv_expectedQuality_3_0= ruleExpectedQualityQuestion )
                    {
                    // InternalSmaCQA.g:5546:4: (lv_expectedQuality_3_0= ruleExpectedQualityQuestion )
                    // InternalSmaCQA.g:5547:5: lv_expectedQuality_3_0= ruleExpectedQualityQuestion
                    {

                    					newCompositeNode(grammarAccess.getProductQualityQuestionAccess().getExpectedQualityExpectedQualityQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expectedQuality_3_0=ruleExpectedQualityQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProductQualityQuestionRule());
                    					}
                    					set(
                    						current,
                    						"expectedQuality",
                    						lv_expectedQuality_3_0,
                    						"org.xtext.SmaCQA.ExpectedQualityQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductQualityQuestion"


    // $ANTLR start "entryRuleExpectedQualityQuestion"
    // InternalSmaCQA.g:5568:1: entryRuleExpectedQualityQuestion returns [EObject current=null] : iv_ruleExpectedQualityQuestion= ruleExpectedQualityQuestion EOF ;
    public final EObject entryRuleExpectedQualityQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectedQualityQuestion = null;


        try {
            // InternalSmaCQA.g:5568:64: (iv_ruleExpectedQualityQuestion= ruleExpectedQualityQuestion EOF )
            // InternalSmaCQA.g:5569:2: iv_ruleExpectedQualityQuestion= ruleExpectedQualityQuestion EOF
            {
             newCompositeNode(grammarAccess.getExpectedQualityQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpectedQualityQuestion=ruleExpectedQualityQuestion();

            state._fsp--;

             current =iv_ruleExpectedQualityQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpectedQualityQuestion"


    // $ANTLR start "ruleExpectedQualityQuestion"
    // InternalSmaCQA.g:5575:1: ruleExpectedQualityQuestion returns [EObject current=null] : ( ( (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' ) ) otherlv_1= 'answer = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' ) ) otherlv_4= 'answer = ' ( (lv_answer2_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleExpectedQualityQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_q1_0_0=null;
        Token otherlv_1=null;
        Token lv_answer1_2_0=null;
        Token lv_q2_3_0=null;
        Token otherlv_4=null;
        Token lv_answer2_5_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:5581:2: ( ( ( (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' ) ) otherlv_1= 'answer = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' ) ) otherlv_4= 'answer = ' ( (lv_answer2_5_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:5582:2: ( ( (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' ) ) otherlv_1= 'answer = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' ) ) otherlv_4= 'answer = ' ( (lv_answer2_5_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:5582:2: ( ( (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' ) ) otherlv_1= 'answer = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' ) ) otherlv_4= 'answer = ' ( (lv_answer2_5_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:5583:3: ( (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' ) ) otherlv_1= 'answer = ' ( (lv_answer1_2_0= RULE_STRING ) ) ( (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' ) ) otherlv_4= 'answer = ' ( (lv_answer2_5_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:5583:3: ( (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' ) )
            // InternalSmaCQA.g:5584:4: (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' )
            {
            // InternalSmaCQA.g:5584:4: (lv_q1_0_0= '6.2.1 How will the quality of the product be determined?' )
            // InternalSmaCQA.g:5585:5: lv_q1_0_0= '6.2.1 How will the quality of the product be determined?'
            {
            lv_q1_0_0=(Token)match(input,133,FOLLOW_47); 

            					newLeafNode(lv_q1_0_0, grammarAccess.getExpectedQualityQuestionAccess().getQ1621HowWillTheQualityOfTheProductBeDeterminedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectedQualityQuestionRule());
            					}
            					setWithLastConsumed(current, "q1", lv_q1_0_0, "6.2.1 How will the quality of the product be determined?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getExpectedQualityQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5601:3: ( (lv_answer1_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:5602:4: (lv_answer1_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:5602:4: (lv_answer1_2_0= RULE_STRING )
            // InternalSmaCQA.g:5603:5: lv_answer1_2_0= RULE_STRING
            {
            lv_answer1_2_0=(Token)match(input,RULE_STRING,FOLLOW_127); 

            					newLeafNode(lv_answer1_2_0, grammarAccess.getExpectedQualityQuestionAccess().getAnswer1STRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectedQualityQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer1",
            						lv_answer1_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSmaCQA.g:5619:3: ( (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' ) )
            // InternalSmaCQA.g:5620:4: (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' )
            {
            // InternalSmaCQA.g:5620:4: (lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?' )
            // InternalSmaCQA.g:5621:5: lv_q2_3_0= '6.2.2 What happens if the delivered product does not meet the agreed quality?'
            {
            lv_q2_3_0=(Token)match(input,134,FOLLOW_47); 

            					newLeafNode(lv_q2_3_0, grammarAccess.getExpectedQualityQuestionAccess().getQ2622WhatHappensIfTheDeliveredProductDoesNotMeetTheAgreedQualityKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectedQualityQuestionRule());
            					}
            					setWithLastConsumed(current, "q2", lv_q2_3_0, "6.2.2 What happens if the delivered product does not meet the agreed quality?");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_4, grammarAccess.getExpectedQualityQuestionAccess().getAnswerKeyword_4());
            		
            // InternalSmaCQA.g:5637:3: ( (lv_answer2_5_0= RULE_STRING ) )
            // InternalSmaCQA.g:5638:4: (lv_answer2_5_0= RULE_STRING )
            {
            // InternalSmaCQA.g:5638:4: (lv_answer2_5_0= RULE_STRING )
            // InternalSmaCQA.g:5639:5: lv_answer2_5_0= RULE_STRING
            {
            lv_answer2_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer2_5_0, grammarAccess.getExpectedQualityQuestionAccess().getAnswer2STRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectedQualityQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer2",
            						lv_answer2_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpectedQualityQuestion"


    // $ANTLR start "entryRuleInternationalSealQuestion"
    // InternalSmaCQA.g:5659:1: entryRuleInternationalSealQuestion returns [EObject current=null] : iv_ruleInternationalSealQuestion= ruleInternationalSealQuestion EOF ;
    public final EObject entryRuleInternationalSealQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternationalSealQuestion = null;


        try {
            // InternalSmaCQA.g:5659:66: (iv_ruleInternationalSealQuestion= ruleInternationalSealQuestion EOF )
            // InternalSmaCQA.g:5660:2: iv_ruleInternationalSealQuestion= ruleInternationalSealQuestion EOF
            {
             newCompositeNode(grammarAccess.getInternationalSealQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternationalSealQuestion=ruleInternationalSealQuestion();

            state._fsp--;

             current =iv_ruleInternationalSealQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternationalSealQuestion"


    // $ANTLR start "ruleInternationalSealQuestion"
    // InternalSmaCQA.g:5666:1: ruleInternationalSealQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInternacionalSealNameQuestion ) )? ) ;
    public final EObject ruleInternationalSealQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subsentence_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5672:2: ( ( ( (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInternacionalSealNameQuestion ) )? ) )
            // InternalSmaCQA.g:5673:2: ( ( (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInternacionalSealNameQuestion ) )? )
            {
            // InternalSmaCQA.g:5673:2: ( ( (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInternacionalSealNameQuestion ) )? )
            // InternalSmaCQA.g:5674:3: ( (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInternacionalSealNameQuestion ) )?
            {
            // InternalSmaCQA.g:5674:3: ( (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' ) )
            // InternalSmaCQA.g:5675:4: (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' )
            {
            // InternalSmaCQA.g:5675:4: (lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?' )
            // InternalSmaCQA.g:5676:5: lv_name_0_0= '6.3 Does the merchandise have any international seal or distinction?'
            {
            lv_name_0_0=(Token)match(input,135,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInternationalSealQuestionAccess().getName63DoesTheMerchandiseHaveAnyInternationalSealOrDistinctionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInternationalSealQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.3 Does the merchandise have any international seal or distinction?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getInternationalSealQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5692:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:5693:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:5693:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:5694:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:5694:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==25) ) {
                alt91=1;
            }
            else if ( (LA91_0==26) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalSmaCQA.g:5695:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_128); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getInternationalSealQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternationalSealQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:5706:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_128); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getInternationalSealQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternationalSealQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:5719:3: ( (lv_subsentence_3_0= ruleInternacionalSealNameQuestion ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==136) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSmaCQA.g:5720:4: (lv_subsentence_3_0= ruleInternacionalSealNameQuestion )
                    {
                    // InternalSmaCQA.g:5720:4: (lv_subsentence_3_0= ruleInternacionalSealNameQuestion )
                    // InternalSmaCQA.g:5721:5: lv_subsentence_3_0= ruleInternacionalSealNameQuestion
                    {

                    					newCompositeNode(grammarAccess.getInternationalSealQuestionAccess().getSubsentenceInternacionalSealNameQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subsentence_3_0=ruleInternacionalSealNameQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternationalSealQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subsentence",
                    						lv_subsentence_3_0,
                    						"org.xtext.SmaCQA.InternacionalSealNameQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternationalSealQuestion"


    // $ANTLR start "entryRuleInternacionalSealNameQuestion"
    // InternalSmaCQA.g:5742:1: entryRuleInternacionalSealNameQuestion returns [EObject current=null] : iv_ruleInternacionalSealNameQuestion= ruleInternacionalSealNameQuestion EOF ;
    public final EObject entryRuleInternacionalSealNameQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternacionalSealNameQuestion = null;


        try {
            // InternalSmaCQA.g:5742:70: (iv_ruleInternacionalSealNameQuestion= ruleInternacionalSealNameQuestion EOF )
            // InternalSmaCQA.g:5743:2: iv_ruleInternacionalSealNameQuestion= ruleInternacionalSealNameQuestion EOF
            {
             newCompositeNode(grammarAccess.getInternacionalSealNameQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternacionalSealNameQuestion=ruleInternacionalSealNameQuestion();

            state._fsp--;

             current =iv_ruleInternacionalSealNameQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternacionalSealNameQuestion"


    // $ANTLR start "ruleInternacionalSealNameQuestion"
    // InternalSmaCQA.g:5749:1: ruleInternacionalSealNameQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInternacionalSealNameQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_0=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:5755:2: ( ( ( (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) ) )
            // InternalSmaCQA.g:5756:2: ( ( (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            {
            // InternalSmaCQA.g:5756:2: ( ( (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) ) )
            // InternalSmaCQA.g:5757:3: ( (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' ) ) otherlv_1= 'answer = ' ( (lv_answer_2_0= RULE_STRING ) )
            {
            // InternalSmaCQA.g:5757:3: ( (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' ) )
            // InternalSmaCQA.g:5758:4: (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' )
            {
            // InternalSmaCQA.g:5758:4: (lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?' )
            // InternalSmaCQA.g:5759:5: lv_name_0_0= '6.3.1 What international seal or distinction does the cargo have?'
            {
            lv_name_0_0=(Token)match(input,136,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInternacionalSealNameQuestionAccess().getName631WhatInternationalSealOrDistinctionDoesTheCargoHaveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInternacionalSealNameQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.3.1 What international seal or distinction does the cargo have?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getInternacionalSealNameQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5775:3: ( (lv_answer_2_0= RULE_STRING ) )
            // InternalSmaCQA.g:5776:4: (lv_answer_2_0= RULE_STRING )
            {
            // InternalSmaCQA.g:5776:4: (lv_answer_2_0= RULE_STRING )
            // InternalSmaCQA.g:5777:5: lv_answer_2_0= RULE_STRING
            {
            lv_answer_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_answer_2_0, grammarAccess.getInternacionalSealNameQuestionAccess().getAnswerSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInternacionalSealNameQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternacionalSealNameQuestion"


    // $ANTLR start "entryRuleHealthInspectionQuestion"
    // InternalSmaCQA.g:5797:1: entryRuleHealthInspectionQuestion returns [EObject current=null] : iv_ruleHealthInspectionQuestion= ruleHealthInspectionQuestion EOF ;
    public final EObject entryRuleHealthInspectionQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthInspectionQuestion = null;


        try {
            // InternalSmaCQA.g:5797:65: (iv_ruleHealthInspectionQuestion= ruleHealthInspectionQuestion EOF )
            // InternalSmaCQA.g:5798:2: iv_ruleHealthInspectionQuestion= ruleHealthInspectionQuestion EOF
            {
             newCompositeNode(grammarAccess.getHealthInspectionQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthInspectionQuestion=ruleHealthInspectionQuestion();

            state._fsp--;

             current =iv_ruleHealthInspectionQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHealthInspectionQuestion"


    // $ANTLR start "ruleHealthInspectionQuestion"
    // InternalSmaCQA.g:5804:1: ruleHealthInspectionQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInspectionResultQuestion ) )? ) ;
    public final EObject ruleHealthInspectionQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;
        EObject lv_subsentence_3_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5810:2: ( ( ( (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInspectionResultQuestion ) )? ) )
            // InternalSmaCQA.g:5811:2: ( ( (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInspectionResultQuestion ) )? )
            {
            // InternalSmaCQA.g:5811:2: ( ( (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInspectionResultQuestion ) )? )
            // InternalSmaCQA.g:5812:3: ( (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ( (lv_subsentence_3_0= ruleInspectionResultQuestion ) )?
            {
            // InternalSmaCQA.g:5812:3: ( (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' ) )
            // InternalSmaCQA.g:5813:4: (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' )
            {
            // InternalSmaCQA.g:5813:4: (lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?' )
            // InternalSmaCQA.g:5814:5: lv_name_0_0= '6.4 Has any health check or inspection been carried out at the production or storage site?'
            {
            lv_name_0_0=(Token)match(input,137,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getHealthInspectionQuestionAccess().getName64HasAnyHealthCheckOrInspectionBeenCarriedOutAtTheProductionOrStorageSiteKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthInspectionQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.4 Has any health check or inspection been carried out at the production or storage site?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getHealthInspectionQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5830:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:5831:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:5831:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:5832:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:5832:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==25) ) {
                alt93=1;
            }
            else if ( (LA93_0==26) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalSmaCQA.g:5833:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_129); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getHealthInspectionQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHealthInspectionQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:5844:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_129); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getHealthInspectionQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHealthInspectionQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSmaCQA.g:5857:3: ( (lv_subsentence_3_0= ruleInspectionResultQuestion ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==138) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSmaCQA.g:5858:4: (lv_subsentence_3_0= ruleInspectionResultQuestion )
                    {
                    // InternalSmaCQA.g:5858:4: (lv_subsentence_3_0= ruleInspectionResultQuestion )
                    // InternalSmaCQA.g:5859:5: lv_subsentence_3_0= ruleInspectionResultQuestion
                    {

                    					newCompositeNode(grammarAccess.getHealthInspectionQuestionAccess().getSubsentenceInspectionResultQuestionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subsentence_3_0=ruleInspectionResultQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHealthInspectionQuestionRule());
                    					}
                    					set(
                    						current,
                    						"subsentence",
                    						lv_subsentence_3_0,
                    						"org.xtext.SmaCQA.InspectionResultQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHealthInspectionQuestion"


    // $ANTLR start "entryRuleInspectionResultQuestion"
    // InternalSmaCQA.g:5880:1: entryRuleInspectionResultQuestion returns [EObject current=null] : iv_ruleInspectionResultQuestion= ruleInspectionResultQuestion EOF ;
    public final EObject entryRuleInspectionResultQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInspectionResultQuestion = null;


        try {
            // InternalSmaCQA.g:5880:65: (iv_ruleInspectionResultQuestion= ruleInspectionResultQuestion EOF )
            // InternalSmaCQA.g:5881:2: iv_ruleInspectionResultQuestion= ruleInspectionResultQuestion EOF
            {
             newCompositeNode(grammarAccess.getInspectionResultQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInspectionResultQuestion=ruleInspectionResultQuestion();

            state._fsp--;

             current =iv_ruleInspectionResultQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInspectionResultQuestion"


    // $ANTLR start "ruleInspectionResultQuestion"
    // InternalSmaCQA.g:5887:1: ruleInspectionResultQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.4.1 What was the result of the inspection?' ) ) otherlv_1= 'result of inspection = ' ( (lv_answer_2_0= ruleinspectionResult ) ) ) ;
    public final EObject ruleInspectionResultQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_answer_2_0 = null;



        	enterRule();

        try {
            // InternalSmaCQA.g:5893:2: ( ( ( (lv_name_0_0= '6.4.1 What was the result of the inspection?' ) ) otherlv_1= 'result of inspection = ' ( (lv_answer_2_0= ruleinspectionResult ) ) ) )
            // InternalSmaCQA.g:5894:2: ( ( (lv_name_0_0= '6.4.1 What was the result of the inspection?' ) ) otherlv_1= 'result of inspection = ' ( (lv_answer_2_0= ruleinspectionResult ) ) )
            {
            // InternalSmaCQA.g:5894:2: ( ( (lv_name_0_0= '6.4.1 What was the result of the inspection?' ) ) otherlv_1= 'result of inspection = ' ( (lv_answer_2_0= ruleinspectionResult ) ) )
            // InternalSmaCQA.g:5895:3: ( (lv_name_0_0= '6.4.1 What was the result of the inspection?' ) ) otherlv_1= 'result of inspection = ' ( (lv_answer_2_0= ruleinspectionResult ) )
            {
            // InternalSmaCQA.g:5895:3: ( (lv_name_0_0= '6.4.1 What was the result of the inspection?' ) )
            // InternalSmaCQA.g:5896:4: (lv_name_0_0= '6.4.1 What was the result of the inspection?' )
            {
            // InternalSmaCQA.g:5896:4: (lv_name_0_0= '6.4.1 What was the result of the inspection?' )
            // InternalSmaCQA.g:5897:5: lv_name_0_0= '6.4.1 What was the result of the inspection?'
            {
            lv_name_0_0=(Token)match(input,138,FOLLOW_130); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInspectionResultQuestionAccess().getName641WhatWasTheResultOfTheInspectionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInspectionResultQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.4.1 What was the result of the inspection?");
            				

            }


            }

            otherlv_1=(Token)match(input,139,FOLLOW_131); 

            			newLeafNode(otherlv_1, grammarAccess.getInspectionResultQuestionAccess().getResultOfInspectionKeyword_1());
            		
            // InternalSmaCQA.g:5913:3: ( (lv_answer_2_0= ruleinspectionResult ) )
            // InternalSmaCQA.g:5914:4: (lv_answer_2_0= ruleinspectionResult )
            {
            // InternalSmaCQA.g:5914:4: (lv_answer_2_0= ruleinspectionResult )
            // InternalSmaCQA.g:5915:5: lv_answer_2_0= ruleinspectionResult
            {

            					newCompositeNode(grammarAccess.getInspectionResultQuestionAccess().getAnswerInspectionResultEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_answer_2_0=ruleinspectionResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInspectionResultQuestionRule());
            					}
            					set(
            						current,
            						"answer",
            						lv_answer_2_0,
            						"org.xtext.SmaCQA.inspectionResult");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInspectionResultQuestion"


    // $ANTLR start "entryRuleStorageConditionsQuestion"
    // InternalSmaCQA.g:5936:1: entryRuleStorageConditionsQuestion returns [EObject current=null] : iv_ruleStorageConditionsQuestion= ruleStorageConditionsQuestion EOF ;
    public final EObject entryRuleStorageConditionsQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStorageConditionsQuestion = null;


        try {
            // InternalSmaCQA.g:5936:66: (iv_ruleStorageConditionsQuestion= ruleStorageConditionsQuestion EOF )
            // InternalSmaCQA.g:5937:2: iv_ruleStorageConditionsQuestion= ruleStorageConditionsQuestion EOF
            {
             newCompositeNode(grammarAccess.getStorageConditionsQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStorageConditionsQuestion=ruleStorageConditionsQuestion();

            state._fsp--;

             current =iv_ruleStorageConditionsQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStorageConditionsQuestion"


    // $ANTLR start "ruleStorageConditionsQuestion"
    // InternalSmaCQA.g:5943:1: ruleStorageConditionsQuestion returns [EObject current=null] : ( ( (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) ;
    public final EObject ruleStorageConditionsQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_answer_2_1=null;
        Token lv_answer_2_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:5949:2: ( ( ( (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) ) )
            // InternalSmaCQA.g:5950:2: ( ( (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            {
            // InternalSmaCQA.g:5950:2: ( ( (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) ) )
            // InternalSmaCQA.g:5951:3: ( (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' ) ) otherlv_1= 'answer = ' ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            {
            // InternalSmaCQA.g:5951:3: ( (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' ) )
            // InternalSmaCQA.g:5952:4: (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' )
            {
            // InternalSmaCQA.g:5952:4: (lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?' )
            // InternalSmaCQA.g:5953:5: lv_name_0_0= '6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?'
            {
            lv_name_0_0=(Token)match(input,140,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStorageConditionsQuestionAccess().getName65HasTheMerchandiseBeenStoredAtAllTimesInOptimalHumidityAndTemperatureConditionsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStorageConditionsQuestionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "6.5 Has the merchandise been stored at all times in optimal humidity and temperature conditions?");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getStorageConditionsQuestionAccess().getAnswerKeyword_1());
            		
            // InternalSmaCQA.g:5969:3: ( ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) ) )
            // InternalSmaCQA.g:5970:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            {
            // InternalSmaCQA.g:5970:4: ( (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' ) )
            // InternalSmaCQA.g:5971:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            {
            // InternalSmaCQA.g:5971:5: (lv_answer_2_1= 'yes' | lv_answer_2_2= 'no' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==25) ) {
                alt95=1;
            }
            else if ( (LA95_0==26) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalSmaCQA.g:5972:6: lv_answer_2_1= 'yes'
                    {
                    lv_answer_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_1, grammarAccess.getStorageConditionsQuestionAccess().getAnswerYesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStorageConditionsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:5983:6: lv_answer_2_2= 'no'
                    {
                    lv_answer_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_answer_2_2, grammarAccess.getStorageConditionsQuestionAccess().getAnswerNoKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStorageConditionsQuestionRule());
                    						}
                    						setWithLastConsumed(current, "answer", lv_answer_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStorageConditionsQuestion"


    // $ANTLR start "ruleType"
    // InternalSmaCQA.g:6000:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Number' ) | (enumLiteral_1= 'Text' ) | (enumLiteral_2= 'TrueOrFalse' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:6006:2: ( ( (enumLiteral_0= 'Number' ) | (enumLiteral_1= 'Text' ) | (enumLiteral_2= 'TrueOrFalse' ) ) )
            // InternalSmaCQA.g:6007:2: ( (enumLiteral_0= 'Number' ) | (enumLiteral_1= 'Text' ) | (enumLiteral_2= 'TrueOrFalse' ) )
            {
            // InternalSmaCQA.g:6007:2: ( (enumLiteral_0= 'Number' ) | (enumLiteral_1= 'Text' ) | (enumLiteral_2= 'TrueOrFalse' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt96=1;
                }
                break;
            case 142:
                {
                alt96=2;
                }
                break;
            case 143:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalSmaCQA.g:6008:3: (enumLiteral_0= 'Number' )
                    {
                    // InternalSmaCQA.g:6008:3: (enumLiteral_0= 'Number' )
                    // InternalSmaCQA.g:6009:4: enumLiteral_0= 'Number'
                    {
                    enumLiteral_0=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNumberEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getNumberEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:6016:3: (enumLiteral_1= 'Text' )
                    {
                    // InternalSmaCQA.g:6016:3: (enumLiteral_1= 'Text' )
                    // InternalSmaCQA.g:6017:4: enumLiteral_1= 'Text'
                    {
                    enumLiteral_1=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTextEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmaCQA.g:6024:3: (enumLiteral_2= 'TrueOrFalse' )
                    {
                    // InternalSmaCQA.g:6024:3: (enumLiteral_2= 'TrueOrFalse' )
                    // InternalSmaCQA.g:6025:4: enumLiteral_2= 'TrueOrFalse'
                    {
                    enumLiteral_2=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTrueOrFalseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getTrueOrFalseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleUnitTime"
    // InternalSmaCQA.g:6035:1: ruleUnitTime returns [Enumerator current=null] : ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) ) ;
    public final Enumerator ruleUnitTime() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:6041:2: ( ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) ) )
            // InternalSmaCQA.g:6042:2: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) )
            {
            // InternalSmaCQA.g:6042:2: ( (enumLiteral_0= 'minutes' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) )
            int alt97=4;
            switch ( input.LA(1) ) {
            case 144:
                {
                alt97=1;
                }
                break;
            case 145:
                {
                alt97=2;
                }
                break;
            case 146:
                {
                alt97=3;
                }
                break;
            case 147:
                {
                alt97=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalSmaCQA.g:6043:3: (enumLiteral_0= 'minutes' )
                    {
                    // InternalSmaCQA.g:6043:3: (enumLiteral_0= 'minutes' )
                    // InternalSmaCQA.g:6044:4: enumLiteral_0= 'minutes'
                    {
                    enumLiteral_0=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getUnitTimeAccess().getMinutesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitTimeAccess().getMinutesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:6051:3: (enumLiteral_1= 'days' )
                    {
                    // InternalSmaCQA.g:6051:3: (enumLiteral_1= 'days' )
                    // InternalSmaCQA.g:6052:4: enumLiteral_1= 'days'
                    {
                    enumLiteral_1=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getUnitTimeAccess().getDaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitTimeAccess().getDaysEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmaCQA.g:6059:3: (enumLiteral_2= 'weeks' )
                    {
                    // InternalSmaCQA.g:6059:3: (enumLiteral_2= 'weeks' )
                    // InternalSmaCQA.g:6060:4: enumLiteral_2= 'weeks'
                    {
                    enumLiteral_2=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getUnitTimeAccess().getWeeksEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitTimeAccess().getWeeksEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmaCQA.g:6067:3: (enumLiteral_3= 'years' )
                    {
                    // InternalSmaCQA.g:6067:3: (enumLiteral_3= 'years' )
                    // InternalSmaCQA.g:6068:4: enumLiteral_3= 'years'
                    {
                    enumLiteral_3=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getUnitTimeAccess().getYearsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitTimeAccess().getYearsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitTime"


    // $ANTLR start "ruleUnitCoin"
    // InternalSmaCQA.g:6078:1: ruleUnitCoin returns [Enumerator current=null] : ( (enumLiteral_0= 'ether' ) | (enumLiteral_1= 'wei' ) | (enumLiteral_2= 'pwei' ) | (enumLiteral_3= 'gwei' ) | (enumLiteral_4= 'szabo' ) ) ;
    public final Enumerator ruleUnitCoin() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:6084:2: ( ( (enumLiteral_0= 'ether' ) | (enumLiteral_1= 'wei' ) | (enumLiteral_2= 'pwei' ) | (enumLiteral_3= 'gwei' ) | (enumLiteral_4= 'szabo' ) ) )
            // InternalSmaCQA.g:6085:2: ( (enumLiteral_0= 'ether' ) | (enumLiteral_1= 'wei' ) | (enumLiteral_2= 'pwei' ) | (enumLiteral_3= 'gwei' ) | (enumLiteral_4= 'szabo' ) )
            {
            // InternalSmaCQA.g:6085:2: ( (enumLiteral_0= 'ether' ) | (enumLiteral_1= 'wei' ) | (enumLiteral_2= 'pwei' ) | (enumLiteral_3= 'gwei' ) | (enumLiteral_4= 'szabo' ) )
            int alt98=5;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt98=1;
                }
                break;
            case 149:
                {
                alt98=2;
                }
                break;
            case 150:
                {
                alt98=3;
                }
                break;
            case 151:
                {
                alt98=4;
                }
                break;
            case 152:
                {
                alt98=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalSmaCQA.g:6086:3: (enumLiteral_0= 'ether' )
                    {
                    // InternalSmaCQA.g:6086:3: (enumLiteral_0= 'ether' )
                    // InternalSmaCQA.g:6087:4: enumLiteral_0= 'ether'
                    {
                    enumLiteral_0=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getUnitCoinAccess().getEtherEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitCoinAccess().getEtherEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:6094:3: (enumLiteral_1= 'wei' )
                    {
                    // InternalSmaCQA.g:6094:3: (enumLiteral_1= 'wei' )
                    // InternalSmaCQA.g:6095:4: enumLiteral_1= 'wei'
                    {
                    enumLiteral_1=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getUnitCoinAccess().getWeiEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitCoinAccess().getWeiEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmaCQA.g:6102:3: (enumLiteral_2= 'pwei' )
                    {
                    // InternalSmaCQA.g:6102:3: (enumLiteral_2= 'pwei' )
                    // InternalSmaCQA.g:6103:4: enumLiteral_2= 'pwei'
                    {
                    enumLiteral_2=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getUnitCoinAccess().getPweiEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitCoinAccess().getPweiEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSmaCQA.g:6110:3: (enumLiteral_3= 'gwei' )
                    {
                    // InternalSmaCQA.g:6110:3: (enumLiteral_3= 'gwei' )
                    // InternalSmaCQA.g:6111:4: enumLiteral_3= 'gwei'
                    {
                    enumLiteral_3=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getUnitCoinAccess().getGweiEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitCoinAccess().getGweiEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSmaCQA.g:6118:3: (enumLiteral_4= 'szabo' )
                    {
                    // InternalSmaCQA.g:6118:3: (enumLiteral_4= 'szabo' )
                    // InternalSmaCQA.g:6119:4: enumLiteral_4= 'szabo'
                    {
                    enumLiteral_4=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getUnitCoinAccess().getSzaboEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitCoinAccess().getSzaboEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitCoin"


    // $ANTLR start "ruleVoyagetype"
    // InternalSmaCQA.g:6129:1: ruleVoyagetype returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'voyage' ) ) ;
    public final Enumerator ruleVoyagetype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:6135:2: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'voyage' ) ) )
            // InternalSmaCQA.g:6136:2: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'voyage' ) )
            {
            // InternalSmaCQA.g:6136:2: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'voyage' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==153) ) {
                alt99=1;
            }
            else if ( (LA99_0==154) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalSmaCQA.g:6137:3: (enumLiteral_0= 'time' )
                    {
                    // InternalSmaCQA.g:6137:3: (enumLiteral_0= 'time' )
                    // InternalSmaCQA.g:6138:4: enumLiteral_0= 'time'
                    {
                    enumLiteral_0=(Token)match(input,153,FOLLOW_2); 

                    				current = grammarAccess.getVoyagetypeAccess().getTimeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVoyagetypeAccess().getTimeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:6145:3: (enumLiteral_1= 'voyage' )
                    {
                    // InternalSmaCQA.g:6145:3: (enumLiteral_1= 'voyage' )
                    // InternalSmaCQA.g:6146:4: enumLiteral_1= 'voyage'
                    {
                    enumLiteral_1=(Token)match(input,154,FOLLOW_2); 

                    				current = grammarAccess.getVoyagetypeAccess().getVoyageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVoyagetypeAccess().getVoyageEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoyagetype"


    // $ANTLR start "ruleinspectionResult"
    // InternalSmaCQA.g:6156:1: ruleinspectionResult returns [Enumerator current=null] : ( (enumLiteral_0= 'favorable' ) | (enumLiteral_1= 'unfavorable' ) ) ;
    public final Enumerator ruleinspectionResult() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmaCQA.g:6162:2: ( ( (enumLiteral_0= 'favorable' ) | (enumLiteral_1= 'unfavorable' ) ) )
            // InternalSmaCQA.g:6163:2: ( (enumLiteral_0= 'favorable' ) | (enumLiteral_1= 'unfavorable' ) )
            {
            // InternalSmaCQA.g:6163:2: ( (enumLiteral_0= 'favorable' ) | (enumLiteral_1= 'unfavorable' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==155) ) {
                alt100=1;
            }
            else if ( (LA100_0==156) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalSmaCQA.g:6164:3: (enumLiteral_0= 'favorable' )
                    {
                    // InternalSmaCQA.g:6164:3: (enumLiteral_0= 'favorable' )
                    // InternalSmaCQA.g:6165:4: enumLiteral_0= 'favorable'
                    {
                    enumLiteral_0=(Token)match(input,155,FOLLOW_2); 

                    				current = grammarAccess.getInspectionResultAccess().getFavorableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInspectionResultAccess().getFavorableEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmaCQA.g:6172:3: (enumLiteral_1= 'unfavorable' )
                    {
                    // InternalSmaCQA.g:6172:3: (enumLiteral_1= 'unfavorable' )
                    // InternalSmaCQA.g:6173:4: enumLiteral_1= 'unfavorable'
                    {
                    enumLiteral_1=(Token)match(input,156,FOLLOW_2); 

                    				current = grammarAccess.getInspectionResultAccess().getUnfavorableEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInspectionResultAccess().getUnfavorableEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinspectionResult"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007F0020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x7400000018FE0020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x7400000018FE0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x80000000007C0020L,0x000000000000000DL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x80000000007C0000L,0x000000000000000DL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000780020L,0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000780000L,0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L,0x7C00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400020L,0x0000000000000000L,0x0000000000001292L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000001292L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x7000000018800002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x6000000018800002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000000018800002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000018800002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000024A0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000A50000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000C010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x01A0000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x7800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001290L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001280L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000820200000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x02C0000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000DL});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C80L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000018000000L});

}