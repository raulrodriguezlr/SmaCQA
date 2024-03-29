/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.Model#getValueExchanges <em>Value Exchanges</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
	 * Returns the value of the '<em><b>Value Exchanges</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.smaCQA.ValueExchange}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Exchanges</em>' containment reference list.
	 * @see org.xtext.smaCQA.SmaCQAPackage#getModel_ValueExchanges()
	 * @model containment="true"
	 * @generated
	 */
  EList<ValueExchange> getValueExchanges();

} // Model
