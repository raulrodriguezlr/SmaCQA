/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token ERC20</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.TokenERC20#getDecimals <em>Decimals</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getTokenERC20()
 * @model
 * @generated
 */
public interface TokenERC20 extends Token
{
  /**
	 * Returns the value of the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimals</em>' attribute.
	 * @see #setDecimals(int)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getTokenERC20_Decimals()
	 * @model
	 * @generated
	 */
  int getDecimals();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.TokenERC20#getDecimals <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimals</em>' attribute.
	 * @see #getDecimals()
	 * @generated
	 */
  void setDecimals(int value);

} // TokenERC20