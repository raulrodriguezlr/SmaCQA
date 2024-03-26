/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smaCQA.ConditionsValueExchangeQuestion;
import org.xtext.smaCQA.DataQuestion;
import org.xtext.smaCQA.RepeatValueExchangeQuestion;
import org.xtext.smaCQA.SmaCQAPackage;
import org.xtext.smaCQA.TimeStartValueExchangeQuestion;
import org.xtext.smaCQA.TimeValueExchangeDurationQuestion;
import org.xtext.smaCQA.ValueObjectQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.impl.DataQuestionImpl#getTimeDurationValueExchange <em>Time Duration Value Exchange</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.DataQuestionImpl#getTimeStartValueExchange <em>Time Start Value Exchange</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.DataQuestionImpl#getRepeatValueExchange <em>Repeat Value Exchange</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.DataQuestionImpl#getConditionValueExchange <em>Condition Value Exchange</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.DataQuestionImpl#getValueObjectTypeValueExchange <em>Value Object Type Value Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataQuestionImpl extends MinimalEObjectImpl.Container implements DataQuestion
{
  /**
	 * The cached value of the '{@link #getTimeDurationValueExchange() <em>Time Duration Value Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTimeDurationValueExchange()
	 * @generated
	 * @ordered
	 */
  protected TimeValueExchangeDurationQuestion timeDurationValueExchange;

  /**
	 * The cached value of the '{@link #getTimeStartValueExchange() <em>Time Start Value Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTimeStartValueExchange()
	 * @generated
	 * @ordered
	 */
  protected TimeStartValueExchangeQuestion timeStartValueExchange;

  /**
	 * The cached value of the '{@link #getRepeatValueExchange() <em>Repeat Value Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRepeatValueExchange()
	 * @generated
	 * @ordered
	 */
  protected RepeatValueExchangeQuestion repeatValueExchange;

  /**
	 * The cached value of the '{@link #getConditionValueExchange() <em>Condition Value Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConditionValueExchange()
	 * @generated
	 * @ordered
	 */
  protected ConditionsValueExchangeQuestion conditionValueExchange;

  /**
	 * The cached value of the '{@link #getValueObjectTypeValueExchange() <em>Value Object Type Value Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValueObjectTypeValueExchange()
	 * @generated
	 * @ordered
	 */
  protected ValueObjectQuestion valueObjectTypeValueExchange;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DataQuestionImpl()
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
		return SmaCQAPackage.Literals.DATA_QUESTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public TimeValueExchangeDurationQuestion getTimeDurationValueExchange()
  {
		return timeDurationValueExchange;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTimeDurationValueExchange(TimeValueExchangeDurationQuestion newTimeDurationValueExchange, NotificationChain msgs)
  {
		TimeValueExchangeDurationQuestion oldTimeDurationValueExchange = timeDurationValueExchange;
		timeDurationValueExchange = newTimeDurationValueExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE, oldTimeDurationValueExchange, newTimeDurationValueExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setTimeDurationValueExchange(TimeValueExchangeDurationQuestion newTimeDurationValueExchange)
  {
		if (newTimeDurationValueExchange != timeDurationValueExchange) {
			NotificationChain msgs = null;
			if (timeDurationValueExchange != null)
				msgs = ((InternalEObject)timeDurationValueExchange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE, null, msgs);
			if (newTimeDurationValueExchange != null)
				msgs = ((InternalEObject)newTimeDurationValueExchange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE, null, msgs);
			msgs = basicSetTimeDurationValueExchange(newTimeDurationValueExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE, newTimeDurationValueExchange, newTimeDurationValueExchange));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public TimeStartValueExchangeQuestion getTimeStartValueExchange()
  {
		return timeStartValueExchange;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTimeStartValueExchange(TimeStartValueExchangeQuestion newTimeStartValueExchange, NotificationChain msgs)
  {
		TimeStartValueExchangeQuestion oldTimeStartValueExchange = timeStartValueExchange;
		timeStartValueExchange = newTimeStartValueExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE, oldTimeStartValueExchange, newTimeStartValueExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setTimeStartValueExchange(TimeStartValueExchangeQuestion newTimeStartValueExchange)
  {
		if (newTimeStartValueExchange != timeStartValueExchange) {
			NotificationChain msgs = null;
			if (timeStartValueExchange != null)
				msgs = ((InternalEObject)timeStartValueExchange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE, null, msgs);
			if (newTimeStartValueExchange != null)
				msgs = ((InternalEObject)newTimeStartValueExchange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE, null, msgs);
			msgs = basicSetTimeStartValueExchange(newTimeStartValueExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE, newTimeStartValueExchange, newTimeStartValueExchange));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public RepeatValueExchangeQuestion getRepeatValueExchange()
  {
		return repeatValueExchange;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRepeatValueExchange(RepeatValueExchangeQuestion newRepeatValueExchange, NotificationChain msgs)
  {
		RepeatValueExchangeQuestion oldRepeatValueExchange = repeatValueExchange;
		repeatValueExchange = newRepeatValueExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE, oldRepeatValueExchange, newRepeatValueExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setRepeatValueExchange(RepeatValueExchangeQuestion newRepeatValueExchange)
  {
		if (newRepeatValueExchange != repeatValueExchange) {
			NotificationChain msgs = null;
			if (repeatValueExchange != null)
				msgs = ((InternalEObject)repeatValueExchange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE, null, msgs);
			if (newRepeatValueExchange != null)
				msgs = ((InternalEObject)newRepeatValueExchange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE, null, msgs);
			msgs = basicSetRepeatValueExchange(newRepeatValueExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE, newRepeatValueExchange, newRepeatValueExchange));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ConditionsValueExchangeQuestion getConditionValueExchange()
  {
		return conditionValueExchange;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetConditionValueExchange(ConditionsValueExchangeQuestion newConditionValueExchange, NotificationChain msgs)
  {
		ConditionsValueExchangeQuestion oldConditionValueExchange = conditionValueExchange;
		conditionValueExchange = newConditionValueExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE, oldConditionValueExchange, newConditionValueExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setConditionValueExchange(ConditionsValueExchangeQuestion newConditionValueExchange)
  {
		if (newConditionValueExchange != conditionValueExchange) {
			NotificationChain msgs = null;
			if (conditionValueExchange != null)
				msgs = ((InternalEObject)conditionValueExchange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE, null, msgs);
			if (newConditionValueExchange != null)
				msgs = ((InternalEObject)newConditionValueExchange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE, null, msgs);
			msgs = basicSetConditionValueExchange(newConditionValueExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE, newConditionValueExchange, newConditionValueExchange));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ValueObjectQuestion getValueObjectTypeValueExchange()
  {
		return valueObjectTypeValueExchange;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValueObjectTypeValueExchange(ValueObjectQuestion newValueObjectTypeValueExchange, NotificationChain msgs)
  {
		ValueObjectQuestion oldValueObjectTypeValueExchange = valueObjectTypeValueExchange;
		valueObjectTypeValueExchange = newValueObjectTypeValueExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE, oldValueObjectTypeValueExchange, newValueObjectTypeValueExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setValueObjectTypeValueExchange(ValueObjectQuestion newValueObjectTypeValueExchange)
  {
		if (newValueObjectTypeValueExchange != valueObjectTypeValueExchange) {
			NotificationChain msgs = null;
			if (valueObjectTypeValueExchange != null)
				msgs = ((InternalEObject)valueObjectTypeValueExchange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE, null, msgs);
			if (newValueObjectTypeValueExchange != null)
				msgs = ((InternalEObject)newValueObjectTypeValueExchange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE, null, msgs);
			msgs = basicSetValueObjectTypeValueExchange(newValueObjectTypeValueExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE, newValueObjectTypeValueExchange, newValueObjectTypeValueExchange));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE:
				return basicSetTimeDurationValueExchange(null, msgs);
			case SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE:
				return basicSetTimeStartValueExchange(null, msgs);
			case SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE:
				return basicSetRepeatValueExchange(null, msgs);
			case SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE:
				return basicSetConditionValueExchange(null, msgs);
			case SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE:
				return basicSetValueObjectTypeValueExchange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE:
				return getTimeDurationValueExchange();
			case SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE:
				return getTimeStartValueExchange();
			case SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE:
				return getRepeatValueExchange();
			case SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE:
				return getConditionValueExchange();
			case SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE:
				return getValueObjectTypeValueExchange();
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
			case SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE:
				setTimeDurationValueExchange((TimeValueExchangeDurationQuestion)newValue);
				return;
			case SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE:
				setTimeStartValueExchange((TimeStartValueExchangeQuestion)newValue);
				return;
			case SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE:
				setRepeatValueExchange((RepeatValueExchangeQuestion)newValue);
				return;
			case SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE:
				setConditionValueExchange((ConditionsValueExchangeQuestion)newValue);
				return;
			case SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE:
				setValueObjectTypeValueExchange((ValueObjectQuestion)newValue);
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
			case SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE:
				setTimeDurationValueExchange((TimeValueExchangeDurationQuestion)null);
				return;
			case SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE:
				setTimeStartValueExchange((TimeStartValueExchangeQuestion)null);
				return;
			case SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE:
				setRepeatValueExchange((RepeatValueExchangeQuestion)null);
				return;
			case SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE:
				setConditionValueExchange((ConditionsValueExchangeQuestion)null);
				return;
			case SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE:
				setValueObjectTypeValueExchange((ValueObjectQuestion)null);
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
			case SmaCQAPackage.DATA_QUESTION__TIME_DURATION_VALUE_EXCHANGE:
				return timeDurationValueExchange != null;
			case SmaCQAPackage.DATA_QUESTION__TIME_START_VALUE_EXCHANGE:
				return timeStartValueExchange != null;
			case SmaCQAPackage.DATA_QUESTION__REPEAT_VALUE_EXCHANGE:
				return repeatValueExchange != null;
			case SmaCQAPackage.DATA_QUESTION__CONDITION_VALUE_EXCHANGE:
				return conditionValueExchange != null;
			case SmaCQAPackage.DATA_QUESTION__VALUE_OBJECT_TYPE_VALUE_EXCHANGE:
				return valueObjectTypeValueExchange != null;
		}
		return super.eIsSet(featureID);
	}

} //DataQuestionImpl