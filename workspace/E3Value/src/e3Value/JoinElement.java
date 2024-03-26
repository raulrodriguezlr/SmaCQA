/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.JoinElement#getHasInputsPort <em>Has Inputs Port</em>}</li>
 *   <li>{@link e3Value.JoinElement#getHasOutputPort <em>Has Output Port</em>}</li>
 *   <li>{@link e3Value.JoinElement#getPositionJoin <em>Position Join</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getJoinElement()
 * @model
 * @generated
 */
public interface JoinElement extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Has Inputs Port</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.InputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inputs Port</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getJoinElement_HasInputsPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPort> getHasInputsPort();

	/**
	 * Returns the value of the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Port</em>' containment reference.
	 * @see #setHasOutputPort(OutputPort)
	 * @see e3Value.E3ValuePackage#getJoinElement_HasOutputPort()
	 * @model containment="true"
	 * @generated
	 */
	OutputPort getHasOutputPort();

	/**
	 * Sets the value of the '{@link e3Value.JoinElement#getHasOutputPort <em>Has Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output Port</em>' containment reference.
	 * @see #getHasOutputPort()
	 * @generated
	 */
	void setHasOutputPort(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Position Join</b></em>' attribute.
	 * The literals are from the enumeration {@link e3Value.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Join</em>' attribute.
	 * @see e3Value.Orientation
	 * @see #setPositionJoin(Orientation)
	 * @see e3Value.E3ValuePackage#getJoinElement_PositionJoin()
	 * @model
	 * @generated
	 */
	Orientation getPositionJoin();

	/**
	 * Sets the value of the '{@link e3Value.JoinElement#getPositionJoin <em>Position Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Join</em>' attribute.
	 * @see e3Value.Orientation
	 * @see #getPositionJoin()
	 * @generated
	 */
	void setPositionJoin(Orientation value);

} // JoinElement
