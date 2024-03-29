/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.smaCQA.SmaCQAPackage;
import org.xtext.smaCQA.ValueObjectRightQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Object Right Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.impl.ValueObjectRightQuestionImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueObjectRightQuestionImpl extends ValueObjectQuestionImpl implements ValueObjectRightQuestion
{
  /**
	 * The default value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
  protected static final String ANSWER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
  protected String answer = ANSWER_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ValueObjectRightQuestionImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SmaCQAPackage.Literals.VALUE_OBJECT_RIGHT_QUESTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getAnswer()
  {
		return answer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setAnswer(String newAnswer)
  {
		String oldAnswer = answer;
		answer = newAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.VALUE_OBJECT_RIGHT_QUESTION__ANSWER, oldAnswer, answer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SmaCQAPackage.VALUE_OBJECT_RIGHT_QUESTION__ANSWER:
				return getAnswer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SmaCQAPackage.VALUE_OBJECT_RIGHT_QUESTION__ANSWER:
				setAnswer((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SmaCQAPackage.VALUE_OBJECT_RIGHT_QUESTION__ANSWER:
				setAnswer(ANSWER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SmaCQAPackage.VALUE_OBJECT_RIGHT_QUESTION__ANSWER:
				return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (answer: ");
		result.append(answer);
		result.append(')');
		return result.toString();
	}

} //ValueObjectRightQuestionImpl
