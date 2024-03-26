package org.xtext.ui;

import java.sql.Time;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.xtext.SmaCQA.*;
import org.xtext.smaCQA.TimeValueExchangeDurationQuestion;
import org.xtext.smaCQA.ValueExchange;
import org.xtext.smaCQA.impl.AgeQuestionImpl;
import org.xtext.smaCQA.impl.CustomsQuestionImpl;
import org.xtext.smaCQA.impl.ImportTaxQuestionImpl;
import org.xtext.smaCQA.impl.MinimumAmountQuestionImpl;
import org.xtext.smaCQA.impl.RepeatValueExchangeQuestionImpl;
import org.xtext.smaCQA.impl.TaxQuestionImpl;
import org.xtext.smaCQA.impl.TimeStartValueExchangeQuestionImpl;
import org.xtext.smaCQA.impl.TimeValueExchangeDurationQuestionImpl;
import org.xtext.smaCQA.impl.TokenERC20Impl;
import org.xtext.smaCQA.impl.TokenERC223Impl;
import org.xtext.smaCQA.impl.TokenERC721Impl;
import org.xtext.smaCQA.impl.ValueExchangeImpl;
import org.xtext.smaCQA.impl.*;

public class SmaCQADocumentationProvider implements IEObjectDocumentationProvider  {

	
	/*
	 * Parámetro de entrada: El objeto del modelo
	 * Descripción del método: Devuelve la información del objeto una vez que el usuario posa el ratón sobre el elemento (Info a modo de tooltip)
	 */
	
	 @Override
	    public String getDocumentation(EObject o) {
	        if (o instanceof ValueExchangeImpl) {
	            return "This element represents a value exchange between actors. Value exchanges require some questions and answers to complete the information.<br> \r\n"
	            		+ " The questions to complete the information about the exchange of value will be presented to you in the following order:<br> \r\n" +
            			"<b>1 Data Questions.</b><br> \r\n" +
            			"<b>2 Legal Questions.</b><br> \r\n" +
            			"<b>3 Economy Questions´.</b><br> \r\n" +
                        "<b>4 Shipment Questions.</b><br> \r\n" +
                        "<b>5 Insurance Questions.</b><br> \r\n" +
                        "<b>6 Alimentary Cargo Questions.</b><br> \r\n" +
            			"You are free to select one (or several) categories to complete the information. If you do not answer any questions from a certain category for the value exchange, the tool will not show you that category for the current value exchange as a suggestion";
	        }	        	             
	        if (o instanceof RepeatValueExchangeQuestionImpl) {
	        	 return "This <b>question</b> is asked to find out if the exchange of value can be repeated over time.\r\n" + 
	        	 		" The <b>answer must be <i>yes</i> or <i>no</i></b>";
	        }
	        if (o instanceof TimeValueExchangeDurationQuestionImpl) {
	        	 return "This <b>question</b> is formulated to find out if the exchange of value has a certain validity of time to be carried out.\r\n" + 
	        	 		" The <b>answer must be a <b><i>number</i></b> to represent the number of minutes, days, weeks or years</b>";
	        }	
	        if (o instanceof TimeStartValueExchangeQuestionImpl) {
	        	 return "This <b>question</b> is formulated to find out if the exchange of value can only be carried out after a certain time. To determine the time, it can be specified numerically along with the unit of time (minutes, days, weeks or years).\r\n"
	        	 		+ "<b>Important</b>: This time measurement is specified from the date the contract is displayed.";
	        }
	        if (o instanceof ValueObjectTangibleQuestionImpl) {
	        	 return "This <b>question</b> is formulated to find out if the value object (tangible) negotiated can be represented as a digital object/element <b>(NOT TOKEN)</b> that has a series of properties that describe it.\r\n" + 
	        	 		"You can specify the properties of a physical object to represent it digitally.\r\n" +
	        	 		"These <b>properties require a <i>name</i> and a <i>value</i> </b>. Example a physical object that measures X meters, you can define the meters property whose value can be a number.";
	        }
	        if (o instanceof ValueObjectTokenQuestionImpl) {
	        	 return "This <b>question</b> asks whether the traded value object can be represented as a security, utility, intellectual or unique property token. Tokens can be fungible (following ERC20 and ERC223 standard) or non-fungible, <i>alias <b>NFT</b></i> (following ERC721 standard). \r\n "
	        	 		+ "A <b><i>token fungible</i></b> is a <b>digital asset</b> or <b>financial value</b> that allows users who own this <b><i>decision making, remuneration, exchanges for others, etc.</i></b>\r\n" 
	        	 		+ "A <b><i>non fungible token</i></b> is a <b>digital asset</b> represents a intellectual or unique property.\r\n";
	        }
	        if (o instanceof TokenERC20Impl) {
	        	 return "This <b>question</b> asks whether the traded value object can be represented as a security or utility fungible token. A <b><i>token</i></b> is a <b>digital asset</b> or <b>financial value</b> that allows users who own this <b><i>decision making, remuneration, exchanges for others, etc.</i></b>\r\n" + 
	        	 		"To complete the Token information, the following fields must be filled in in order as indicated by the tool:<br> \r\n" + 
	        			"<b>Name</b>: Represents the Token's name.<br>\r\n" +
	        	 		"<b>Symbol</b>: Represents the Token's symbol. It is similar to an identifier versus other tokens. It usually consists of 3 or 5 characters (in uppercase).<br>\r\n" +
	        	 		"<b>Decimals</b>: Returns the number of decimals used to get its user representation. For example, if `decimals` equals `2`, a balance of `505` tokens should be displayed to a user as `5.05` (`505 / 10 ** 2`) Tokens usually opt for a value of 18, imitating the relationship between Ether and Wei.<br>\r\n" + 
	        			"<b>Supply</b>: Number of tokens that will be issued and that will circulate as value negotiated by the network.<br>" +
	        	 		"Subsequently, two questions will be asked:<br>\r\n" + 
	        	 		"The first <b>question</b> is to know if there is the possibility of <b>minting more tokens</b> after having defined the total number of tokens in circulation.<br>\r\n" +
	        	 		"The second <b>question</b> is to know if there is the possibility of <b>burn tokens</b>  to remove them from circulation.\r\n";
	        }
	        if (o instanceof TokenERC223Impl) {
	        	 return "This <b>question</b> asks whether the traded value object can be represented as a security or utility fungible token. A <b><i>token</i></b> is a <b>digital asset</b> or <b>financial value</b> that allows users who own this <b><i>decision making, remuneration, exchanges for others, etc.</i></b>\r\n" + 
	        	 		"To complete the Token information, the following fields must be filled in in order as indicated by the tool:<br> \r\n" + 
	        			"<b>Name</b>: Represents the Token's name.<br>\r\n" +
	        	 		"<b>Symbol</b>: Represents the Token's symbol. It is similar to an identifier versus other tokens. It usually consists of 3 or 5 characters (in uppercase).<br>\r\n" +
	        	 		"<b>Decimals</b>: Returns the number of decimals used to get its user representation. For example, if `decimals` equals `2`, a balance of `505` tokens should be displayed to a user as `5.05` (`505 / 10 ** 2`) Tokens usually opt for a value of 18, imitating the relationship between Ether and Wei.<br>\r\n" + 
	        			"<b>Supply</b>: Number of tokens that will be issued and that will circulate as value negotiated by the network.<br>" +
	        	 		"Subsequently, two questions will be asked:<br>\r\n" + 
	        	 		"The first <b>question</b> is to know if there is the possibility of <b>minting more tokens</b> after having defined the total number of tokens in circulation.<br>\r\n" +
	        	 		"The second <b>question</b> is to know if there is the possibility of <b>burn tokens</b>  to remove them from circulation.\r\n";
	        }
	        if (o instanceof TokenERC721Impl) {
	        	 return "This <b>question</b> asks whether the traded value object can be represented as an unique property represented by a non fungible token (NFT). A <b><i>non fungible token</i></b> is a <b>digital asset</b> represents a intellectual or unique property.\r\n" + 
	        	 		"To complete the NFT information, the following fields must be filled in in order as indicated by the tool:<br> \r\n" + 
	        			"<b>Name</b>: Represents the Token's name.<br>\r\n" +
	        	 		"<b>Symbol</b>: Represents the Token's symbol. It is similar to an identifier versus other tokens. It usually consists of 3 or 5 characters (in uppercase).<br>\r\n" +
	        			"<b>Supply</b>: Number of tokens that will be issued and that will circulate as value negotiated by the network.<br>" +
	        	 		"Subsequently, two questions will be asked:<br>\r\n" + 
	        	 		"The first <b>question</b> is to know if there is the possibility of minting a certain amount of nft (define a specific number of items in a collection) for a certain address.<br>\r\n" +
	        	 		"The second <b>question</b> is to know if there is the possibility of <b>burn tokens</b>  to remove them from circulation.\r\n" +
	        	 		"The third <b>question</b> is to <b>associate a url<b> pointing to a JSON metadata file with publicly exposed ERC-721 information.\r\n" +
	        	 		"The fourth <b>question</b> refers to the price to acquire the NFT.\r\n";
	        }
	        if (o instanceof AgeQuestionImpl) {
	            return "This <b>question</b> mentions the need to demand a minimum legal age for the actors to carry out the exchange of value between them.\r\n" + 
	            		" The answer to be entered by the user <b> must be a number between 16 and 110 years </b> to reflect the <b><i>legal minimum age</i></b>.";
	        }
	        if (o instanceof TaxQuestionImpl) {
	            return "This <b>question</b> mentions the need to specify fee or supplement name in relation to the exchange of value that will take place between the actors.\r\n" +
	            	   " Next, you will be asked to specify <b> which actor is the beneficiary of this fee </b>.";
	        }
	        if (o instanceof MinimumAmountQuestionImpl) {
	        	return "This <b>question</b> is formulated to find out if a minimum amount is necessary from one of the actors to carry out the exchange of value.\r\n"+
	        	" The answer must be a <b><i>number</i></b> to represent the <b><i>minimum amount needed</i></b>.";
	        }
	        //Ampliation of Legal Questions
	        
	        if(o instanceof AdditionalLegalDocumentQuestionImpl)
	        	return "This <b>question</b> is formulated to specify an additional document is needed to complement the current smart contract.\r\n"+
	        			"The answer must be yes or no\r\n";
	        
	        if(o instanceof RegulatoryComplianceQuestionImpl)
	        	return "This <b>question</b> is formulated to determine who is responsible of ensuring compliance with the regulations related to this exchange.\r\n"+
	        			"The answer must be a single word with the id of the responsible\r\n";
	        //Shipment Cost Responsibility Questions
	        if(o instanceof ShipmentCostResponsibilityQuestionImpl) {
	        	return "This <b><b>question</b> is formulated to detail who is responsable for the different shipments rates.\r\n"+
	        			"The first is mandatory to <b>answer</b> , while the rest are optional and depends on the existence of those costs.\r\n"+
	        			"The first <b>subquestion</b> referes to the freight rate. The <b>answer</b> must be a <b>single word</b> with the id of the resposible of paying this rate.\r\n"+
	        			"The second <b>subquestion</b> referes to the loading rate. The <b>answer</b> must be a <b>natural number</b> with its currency unit.\r\n"+
	        			"The third <b>subquestion</b> referes to the freight rate. The <b>answer</b> must be a <b>natural number</b> with its currency unit.\r\n"+
	        			"The fourth <b>subquestion</b> referes to the unloading rate. The <b>answer</b> must be a <b>natural number</b>r with its currency coin.\r\n"+
	        			"The fifth <b>subquestion</b> referes to the transport rate. The <b>answer</b> must be a <b>natural number</b> with its currency unit.\r\n";

	        }
	        
	        //Shipment Questions
	        if (o instanceof ShipmentDetailsQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the shipment is international or local.\r\n"+
	                   " The <b>answer</b> must be yes or no\r\n";
	       }
	       if (o instanceof SanitaryControlQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the shipment is subject to any sanitary control or special hygiene requirements at the destination country.\r\n"+
	                   "The <b>answer</b> must be yes or no\r\n";
	       }
	       if (o instanceof CustomsQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the shipment is subject to go through customs procedures.\r\n"+
	                   "The <b>answer</b> must be yes or no\r\n";
	       }
	       if (o instanceof ImportTaxQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the shipment is subject to any import taxes at the destination.\r\n"+
	                   "The <b>answer</b> must be yes or no\r\n"+
	                   "The <b>subquestion</b> is to determine, if <b>applicable</b>, how much the taxes are. The <b>answer</b> must be a <b>natural number</b> representing the amount and the currency unit\r\n";
	       }
	       if (o instanceof GeographicalQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if there are geograpical restrinctions for the exchange to be made."+
	                   "The <b>answer</b> must be yes or no\r\n"+
	                   "The <b>subquestion</b> is to determine, if <b>applicable</b>, what are the restrictions . The <b>answer</b> must be a a <b>sentence(string)</b>\r\n";
	       }

	       //ME HE QUEDADO POR AQUI
	       if (o instanceof AddressPickupQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the pickup address for the cargo.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the pickup address .\r\n";
	       }
	       if (o instanceof AddressDeliveryQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the delivery address.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the delivery address.\r\n";
	       }
	       if (o instanceof ShipmentTrackingNumberQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the shipment tracking <b>natural number</b>.\r\n"+
	                  "The <b>answer</b> must be a <b>natural number</b>.\r\n";
	       }
	       if (o instanceof DangerousLoadQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the physical good represents a dangerous load or has special transportation needs.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The <b>subquestion</b>, if <b>applicable</b>, is to determine what special measures are needed for its proper transport.The <b>answer</b> must be a <b>sentence(string)</b>\r\n";
	       }

	       if (o instanceof PerishableQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if it's a perishable product.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The <b>subquestion</b>, if <b>applicable</b>, is to determine its expiration date.The <b>answer</b> must be a <b>sentence(string)</b>\r\n";
	       }
	       if (o instanceof CargoTypeQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the type of cargo.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the type of cargo.\r\n";
	       }
	       if (o instanceof CargoWeightQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the weight of the cargo expressed in Kilograms(Kg).\r\n"+
	                  "The <b>answer</b> must be the weight expressed with one <b>natural number</b>.\r\n";
	       }
	       if (o instanceof CargoDimensionsQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the dimensions of the cargo.\r\n"+
	                  "The <b>answer</b> must be the dimensions of the cargo (length x width x depth) as three <b>natural number</b>s representing the length, width, and depth in centimeters(cm).\r\n";
	       }
	       if(o instanceof SeaShipmentQuestionImpl){
	           return "This <b>question</b> is formulated to determine if the shipment will be made by sea.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The first <b>subquestion</b>, if <b>applicable</b>, is to specify the origin port. The <b>answer</b> must be a <b>sentence(string)</b>.\r\n"+
	                  "The second <b>subquestion</b>, if <b>applicable</b>, is to specify the destination port. The <b>answer</b> must be a <b>sentence(string)</b>.\r\n"+
	                  "The third <b>subquestion</b>, if <b>applicable</b>, is to specify if the port agent has the privilegees to make key decisions in the name of the costumer. The <b>answer</b> must be yes or no.\r\n"+
	                  "The fourth <b>subquestion</b>, if <b>applicable</b>, is to specify if it is a voyage charter or time charter party. The <b>answer</b> must be a \"voyage\" or \"time\" .\r\n"+
	                  "\tIf the <b>answer</b> is time, how long is the ship rented?. The <b>answer</b> must be a <b>natural number</b> and the unit time( minutes, days,weeks or years) .\r\n";
	       }

	       if (o instanceof MeansTransportQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the means of transport(by train, by truck, by plane...).\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the means of transport.\r\n";
	       }
	       if (o instanceof CompanyQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the name of the transport company.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the name of the transport company.\r\n";
	       }
	       if (o instanceof DeliveryDeadlineQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the deadline for delivery.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the deadline for delivery.\r\n";
	       }


	       if (o instanceof UpdatesAndMonitoringQuestionImpl) {
	           return "This <b>question</b> is formulated to determine how updates and monitoring data will be received.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with the means through which updates and monitoring data will be received.\r\n";
	       }
	       if (o instanceof ExternalMediatorQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if an external mediator is considered in case of dispute.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The <b>subquestion</b>, if <b>applicable</b>, is to determine the name of the individual or company mediating external to the two parties.The <b>answer</b> must be the name of the mediator as a single word(identifier).\r\n";
	       }
	       //Insurance Questions
	       if (o instanceof InsuranceQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the cargo is insured.\r\n"+
	                  "And to obtain more insurance details, returns or cancellations information, and penalty for neglect.\r\n";
	       }
	       if (o instanceof ShipmentInsuranceQuestionImpl) {
	           return "This <b>question</b> isformulated to determine if the cargo is insured.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The first <b>subquestion</b>, if <b>applicable</b>, is to specify the cost of insurance per unit. The <b>answer</b> must be a <b>natural number</b> and the coin asset.\r\n"+
	                  "The second <b>subquestion</b>, if <b>applicable</b>, is to specify the insurance cover. The <b>answer</b> must be a <b>sentence(string)</b> with all the insurance clauses.\r\n"+
	                  "The third <b>subquestion</b>, if <b>applicable</b>, is to specify how much would be the refund paid in case one clause is contempled. The <b>answer</b> must be a <b>natural number</b> followd by the asset unit.\r\n";
	       }

	       if (o instanceof ReturnsOrCancellationsQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the possibility of returns or cancellations in the exchange is foreseen.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The <b>subquestion</b>, if <b>applicable</b>, is to determine how returns or cancellations would be managed according to the terms of the contract.\r\n"+
	                  "\tThe <b>answer</b> to this <b>subquestion</b> must be a <b>sentence(string)</b> describing how returns or cancellations would be managed according to the terms of the contract.\r\n";
	       }

	       if (o instanceof PenaltyForNeglectQuestionImpl) {
	           return "This <b>question</b> is formulated to determine the penalty in case of neglect or abandonment of duties.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> explaining the penalty.\r\n";
	       }

	       //Alimentary <b>question</b>
	       if (o instanceof AlimentaryQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain information related to alimentary products, such as agreed price, product quality, international seals, health inspections, and storage conditions.\r\n";
	       }
	       if (o instanceof AgreedPriceQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the agreed price per unit of product.\r\n"+
	                  "The <b>answer</b> must be the agreed price as a <b>natural number</b> along with the asset unit.\r\n";
	       }
	       if (o instanceof ProductQualityQuestionImpl) {
	           return "This <b>question</b> is formulated to obtain the expected quality of the product.\r\n"+
	                  "The <b>answer</b> must be a <b>sentence(string)</b> with expected quality.\r\n"+
	                  "The first <b>subquestion</b>, if appliacable, is to determine how the quality of the product will be determined. The <b>answer</b> must be a <b>sentence(string)</b> explaining how.\r\n"+
	                  "The second <b>subquestion</b>, if <b>applicable</b>, is to determine what happens if the delivered product does not meet the agreed quality.The <b>answer</b> must be a <b>sentence(string)</b> explaining what would happen.\r\n";
	       }

	       if (o instanceof InternationalSealQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the merchandise has any international seal or distinction.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The <b>subquestion</b>, if <b>applicable</b>, is to determine what international seal or distinction the cargo has.The <b>answer</b> must be the international seal or distinction as a little <b>sentence(string)</b>.\r\n";
	       }

	       if (o instanceof HealthInspectionQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if any health check or inspection has been carried out at the production or storage site.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n"+
	                  "The <b>subquestion</b>, if <b>applicable</b>, is to determine the result of the inspection.The <b>answer</b> must be the result of the inspection(favorable or unfavorable).\r\n";
	       }

	       if (o instanceof StorageConditionsQuestionImpl) {
	           return "This <b>question</b> is formulated to determine if the merchandise has been stored at all times in optimal humidity and temperature conditions.\r\n"+
	                  "The <b>answer</b> must be yes or no.\r\n";
	       }  

			
	        return null;
	        
    }
		
}
