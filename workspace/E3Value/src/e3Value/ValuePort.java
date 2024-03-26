/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ValuePort#getValueexchange <em>Valueexchange</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getValuePort()
 * @model
 * @generated
 */
public interface ValuePort extends EObject {
	/**
	 * Returns the value of the '<em><b>Valueexchange</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueExchange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueexchange</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getValuePort_Valueexchange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueExchange> getValueexchange();

} // ValuePort
