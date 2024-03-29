/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dangerous Load Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.DangerousLoadQuestion#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.DangerousLoadQuestion#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.xtext.smaCQA.DangerousLoadQuestion#getSubSentenceSpecialMeasures <em>Sub Sentence Special Measures</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getDangerousLoadQuestion()
 * @model
 * @generated
 */
public interface DangerousLoadQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getDangerousLoadQuestion_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.DangerousLoadQuestion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getDangerousLoadQuestion_Answer()
	 * @model
	 * @generated
	 */
  String getAnswer();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.DangerousLoadQuestion#getAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #getAnswer()
	 * @generated
	 */
  void setAnswer(String value);

  /**
	 * Returns the value of the '<em><b>Sub Sentence Special Measures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sentence Special Measures</em>' containment reference.
	 * @see #setSubSentenceSpecialMeasures(SpecialMeasuresQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getDangerousLoadQuestion_SubSentenceSpecialMeasures()
	 * @model containment="true"
	 * @generated
	 */
  SpecialMeasuresQuestion getSubSentenceSpecialMeasures();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.DangerousLoadQuestion#getSubSentenceSpecialMeasures <em>Sub Sentence Special Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Sentence Special Measures</em>' containment reference.
	 * @see #getSubSentenceSpecialMeasures()
	 * @generated
	 */
  void setSubSentenceSpecialMeasures(SpecialMeasuresQuestion value);

} // DangerousLoadQuestion
