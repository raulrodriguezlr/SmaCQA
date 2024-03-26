package org.xtext.ui;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import java.lang.*;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.util.CancelIndicator;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.RGBColor;
import org.xtext.services.SmaCQAGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings({ "deprecation", "unused" })

public class CLHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	@Inject
	SmaCQAGrammarAccess grammar;
	public static final String INT = "int";
	public static final String FLOAT = "float";
	public static final String STRINGTEXT = "stringtext";
	public static final String Text = "Text";
	public static final String Number = "Number";
	public static final String TF = "TrueOrFalse";
	public static final String YES = "yes";
	public static final String NO = "no";
	public static final String Minutes = "minutes";
	public static final String Days = "days";
	public static final String Weeks = "weeks";
	public static final String Years = "years";
	
	@Override 
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(INT, "integer", varTextNumberTypeStyle());
		acceptor.acceptDefaultHighlighting(FLOAT, "float", varTextNumberTypeStyle());
		acceptor.acceptDefaultHighlighting(STRINGTEXT, "stringtext", varTextStringTypeStyle());
		acceptor.acceptDefaultHighlighting(Text, "Text", varTextMSGVariablesStyle());
		acceptor.acceptDefaultHighlighting(Number, "Number", varTextMSGVariablesStyle());
		acceptor.acceptDefaultHighlighting(TF, "TrueOrFalse", varTextMSGVariablesStyle());
		acceptor.acceptDefaultHighlighting(YES, "yes", varTextBCKVariablesStyle());
		acceptor.acceptDefaultHighlighting(NO, "no", varTextBCKVariablesStyle());
		acceptor.acceptDefaultHighlighting(Minutes, "minutes", varTextTimeVariablesStyle());
		acceptor.acceptDefaultHighlighting(Days, "days", varTextTimeVariablesStyle());
		acceptor.acceptDefaultHighlighting(Weeks, "weeks", varTextTimeVariablesStyle());
		acceptor.acceptDefaultHighlighting(Years, "years", varTextTimeVariablesStyle());
	}
	
	private TextStyle varTextMSGVariablesStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(100,100,200));
		t.setStyle(SWT.ITALIC|SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextBCKVariablesStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(228, 119, 0));
		t.setStyle(SWT.ITALIC|SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextCrypthographicFunctions() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(228, 119, 0));
		t.setStyle(SWT.ITALIC|SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextTXVariablesStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(216,98,0));
		t.setStyle(SWT.ITALIC|SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextThisStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(110,3,144));
		t.setStyle(SWT.ITALIC|SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextWordsContractStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(127,0,85));
		t.setStyle(SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextCoinWordsContracStyle(){
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(215,99,2));
		t.setStyle(SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextNumberTypeStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(5,42,247));
		t.setStyle(SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextStringTypeStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(59,144,3));
		t.setStyle(SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextBooleanTypeStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(110,3,144));
		t.setStyle(SWT.BOLD);
		return t;
	}
	
	private TextStyle varTextTimeVariablesStyle() {
		TextStyle t = defaultTextStyle().copy();
		t.setColor(new RGB(88,85,83));
		t.setStyle(SWT.ITALIC|SWT.BOLD);
		return t;
	}
	



}
