/**
 */
package e3Value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ValueObject#getName <em>Name</em>}</li>
 *   <li>{@link e3Value.ValueObject#getInValueExchange <em>In Value Exchange</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getValueObject()
 * @model
 * @generated
 */
public interface ValueObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see e3Value.E3ValuePackage#getValueObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link e3Value.ValueObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Value Exchange</em>' reference.
	 * @see #setInValueExchange(ValueExchange)
	 * @see e3Value.E3ValuePackage#getValueObject_InValueExchange()
	 * @model required="true"
	 * @generated
	 */
	ValueExchange getInValueExchange();

	/**
	 * Sets the value of the '{@link e3Value.ValueObject#getInValueExchange <em>In Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Value Exchange</em>' reference.
	 * @see #getInValueExchange()
	 * @generated
	 */
	void setInValueExchange(ValueExchange value);

} // ValueObject
