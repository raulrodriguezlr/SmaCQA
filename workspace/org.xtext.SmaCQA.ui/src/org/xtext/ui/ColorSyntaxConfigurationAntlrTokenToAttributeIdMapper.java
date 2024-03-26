package org.xtext.ui;

import java.util.regex.Pattern;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class ColorSyntaxConfigurationAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper  {

	
	private static final Pattern Number = Pattern.compile("Number");
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(tokenName.equals("RULE_INT")) {
			return CLHighlightingConfiguration.INT;
		}
		else if(tokenName.equals("'Number'")){
			return CLHighlightingConfiguration.Number;
		}
		else if(tokenName.equals("'Text'")){
			return CLHighlightingConfiguration.Text;
		}
		else if(tokenName.equals("'TrueOrFalse'")){
			return CLHighlightingConfiguration.TF;
		}
		else if(tokenName.equals("RULE_FLOAT")) {
			return CLHighlightingConfiguration.FLOAT;
		}
		else if(tokenName.equals("ID")) {
			return CLHighlightingConfiguration.STRINGTEXT;
		}
		else if(tokenName.equals("RULE_ID")){
			return CLHighlightingConfiguration.STRINGTEXT;
		}
		else if(tokenName.equals("'yes'")) {
			return CLHighlightingConfiguration.YES;
		}
		else if(tokenName.equals("'no'")){
			return CLHighlightingConfiguration.NO;
		}
		else if(tokenName.equals("'minutes'")) {
			return CLHighlightingConfiguration.Minutes;
		}
		else if(tokenName.equals("'days'")){
			return CLHighlightingConfiguration.Days;
		}
		else if(tokenName.equals("'weeks'")) {
			return CLHighlightingConfiguration.Weeks;
		}
		else if(tokenName.equals("'years'")){
			return CLHighlightingConfiguration.Years;
		}
		
		return  super.calculateId(tokenName, tokenType);
	}

}
