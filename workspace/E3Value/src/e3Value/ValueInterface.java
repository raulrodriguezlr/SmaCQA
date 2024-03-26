/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}</li>
 *   <li>{@link e3Value.ValueInterface#getHasValuePortOut <em>Has Value Port Out</em>}</li>
 *   <li>{@link e3Value.ValueInterface#getHasValuePortIn <em>Has Value Port In</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getValueInterface()
 * @model
 * @generated
 */
public interface ValueInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Binds Responsability Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds Responsability Element</em>' containment reference.
	 * @see #setBindsResponsabilityElement(ResponsabilityElement)
	 * @see e3Value.E3ValuePackage#getValueInterface_BindsResponsabilityElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResponsabilityElement getBindsResponsabilityElement();

	/**
	 * Sets the value of the '{@link e3Value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binds Responsability Element</em>' containment reference.
	 * @see #getBindsResponsabilityElement()
	 * @generated
	 */
	void setBindsResponsabilityElement(ResponsabilityElement value);

	/**
	 * Returns the value of the '<em><b>Has Value Port Out</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValuePortOut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Port Out</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getValueInterface_HasValuePortOut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValuePortOut> getHasValuePortOut();

	/**
	 * Returns the value of the '<em><b>Has Value Port In</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValuePortIn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Port In</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getValueInterface_HasValuePortIn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValuePortIn> getHasValuePortIn();

} // ValueInterface
