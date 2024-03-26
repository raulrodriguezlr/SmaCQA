/**
 */
package e3Value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Port In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ValuePortIn#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}</li>
 *   <li>{@link e3Value.ValuePortIn#getPositionValuePort <em>Position Value Port</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getValuePortIn()
 * @model
 * @generated
 */
public interface ValuePortIn extends ValuePort {
	/**
	 * Returns the value of the '<em><b>In Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Connect With Value Exchange</em>' reference.
	 * @see #setInConnectWithValueExchange(ValueExchange)
	 * @see e3Value.E3ValuePackage#getValuePortIn_InConnectWithValueExchange()
	 * @model
	 * @generated
	 */
	ValueExchange getInConnectWithValueExchange();

	/**
	 * Sets the value of the '{@link e3Value.ValuePortIn#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Connect With Value Exchange</em>' reference.
	 * @see #getInConnectWithValueExchange()
	 * @generated
	 */
	void setInConnectWithValueExchange(ValueExchange value);

	/**
	 * Returns the value of the '<em><b>Position Value Port</b></em>' attribute.
	 * The literals are from the enumeration {@link e3Value.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Value Port</em>' attribute.
	 * @see e3Value.Position
	 * @see #setPositionValuePort(Position)
	 * @see e3Value.E3ValuePackage#getValuePortIn_PositionValuePort()
	 * @model
	 * @generated
	 */
	Position getPositionValuePort();

	/**
	 * Sets the value of the '{@link e3Value.ValuePortIn#getPositionValuePort <em>Position Value Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Value Port</em>' attribute.
	 * @see e3Value.Position
	 * @see #getPositionValuePort()
	 * @generated
	 */
	void setPositionValuePort(Position value);

} // ValuePortIn
