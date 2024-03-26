/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voyage Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.VoyageQuestion#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.smaCQA.VoyageQuestion#getAnswerSubSentence <em>Answer Sub Sentence</em>}</li>
 *   <li>{@link org.xtext.smaCQA.VoyageQuestion#getAnswerUnitTime <em>Answer Unit Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getVoyageQuestion()
 * @model
 * @generated
 */
public interface VoyageQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getVoyageQuestion_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.VoyageQuestion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Answer Sub Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Sub Sentence</em>' attribute.
	 * @see #setAnswerSubSentence(int)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getVoyageQuestion_AnswerSubSentence()
	 * @model
	 * @generated
	 */
  int getAnswerSubSentence();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.VoyageQuestion#getAnswerSubSentence <em>Answer Sub Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Sub Sentence</em>' attribute.
	 * @see #getAnswerSubSentence()
	 * @generated
	 */
  void setAnswerSubSentence(int value);

  /**
	 * Returns the value of the '<em><b>Answer Unit Time</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtext.smaCQA.UnitTime}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Unit Time</em>' attribute.
	 * @see org.xtext.smaCQA.UnitTime
	 * @see #setAnswerUnitTime(UnitTime)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getVoyageQuestion_AnswerUnitTime()
	 * @model
	 * @generated
	 */
  UnitTime getAnswerUnitTime();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.VoyageQuestion#getAnswerUnitTime <em>Answer Unit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Unit Time</em>' attribute.
	 * @see org.xtext.smaCQA.UnitTime
	 * @see #getAnswerUnitTime()
	 * @generated
	 */
  void setAnswerUnitTime(UnitTime value);

} // VoyageQuestion