package org.xtext.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.internal.Model;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.xtext.services.SmaCQAGrammarAccess;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator  extends DefaultSemanticHighlightingCalculator {
		
		@Inject 
		private SmaCQAGrammarAccess grammar;
		
		@Inject
		private OperationCanceledManager operationCanceledManager;
		
		@Override
		protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
				CancelIndicator cancelIndicator) {
			if (object instanceof Model) {
				ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
				handlePathNode(node,acceptor,cancelIndicator);
			}
			return super.highlightElement(object, acceptor, cancelIndicator);
		}
		
		private void handlePathNode(INode n, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
	                acceptor.addPosition(n.getOffset(), n.getLength()-1, HighlightingStyles.STRING_ID);
			BidiTreeIterable<INode> iterable = n.getAsTreeIterable();
			for (INode nx : iterable) {
				operationCanceledManager.checkCanceled(cancelIndicator);
				EObject grammarElement = nx.getGrammarElement();
				if (grammarElement instanceof RuleCall) {
					if (grammar.getDataRegisterRule() == ((RuleCall) grammarElement).getRule()) {
						acceptor.addPosition(nx.getOffset(), nx.getLength(), HighlightingStyles.KEYWORD_ID);
					}
				}
			}
		}
		
}
