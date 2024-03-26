/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ForkElement#getHasOutputsPort <em>Has Outputs Port</em>}</li>
 *   <li>{@link e3Value.ForkElement#getHasInputPort <em>Has Input Port</em>}</li>
 *   <li>{@link e3Value.ForkElement#getPositionFork <em>Position Fork</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getForkElement()
 * @model
 * @generated
 */
public interface ForkElement extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Has Outputs Port</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Outputs Port</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getForkElement_HasOutputsPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPort> getHasOutputsPort();

	/**
	 * Returns the value of the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Port</em>' containment reference.
	 * @see #setHasInputPort(InputPort)
	 * @see e3Value.E3ValuePackage#getForkElement_HasInputPort()
	 * @model containment="true"
	 * @generated
	 */
	InputPort getHasInputPort();

	/**
	 * Sets the value of the '{@link e3Value.ForkElement#getHasInputPort <em>Has Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input Port</em>' containment reference.
	 * @see #getHasInputPort()
	 * @generated
	 */
	void setHasInputPort(InputPort value);

	/**
	 * Returns the value of the '<em><b>Position Fork</b></em>' attribute.
	 * The literals are from the enumeration {@link e3Value.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Fork</em>' attribute.
	 * @see e3Value.Position
	 * @see #setPositionFork(Position)
	 * @see e3Value.E3ValuePackage#getForkElement_PositionFork()
	 * @model
	 * @generated
	 */
	Position getPositionFork();

	/**
	 * Sets the value of the '{@link e3Value.ForkElement#getPositionFork <em>Position Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Fork</em>' attribute.
	 * @see e3Value.Position
	 * @see #getPositionFork()
	 * @generated
	 */
	void setPositionFork(Position value);

} // ForkElement
