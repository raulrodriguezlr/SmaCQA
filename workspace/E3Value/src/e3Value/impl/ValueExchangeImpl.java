/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.ValueExchange;
import e3Value.ValueObject;
import e3Value.ValuePort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValueExchangeImpl#getTargetValuePort <em>Target Value Port</em>}</li>
 *   <li>{@link e3Value.impl.ValueExchangeImpl#getSourceValuePort <em>Source Value Port</em>}</li>
 *   <li>{@link e3Value.impl.ValueExchangeImpl#getValueExchangeHasValueObject <em>Value Exchange Has Value Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueExchangeImpl extends MinimalEObjectImpl.Container implements ValueExchange {
	/**
	 * The cached value of the '{@link #getTargetValuePort() <em>Target Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValuePort()
	 * @generated
	 * @ordered
	 */
	protected ValuePort targetValuePort;

	/**
	 * The cached value of the '{@link #getSourceValuePort() <em>Source Value Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceValuePort()
	 * @generated
	 * @ordered
	 */
	protected ValuePort sourceValuePort;

	/**
	 * The cached value of the '{@link #getValueExchangeHasValueObject() <em>Value Exchange Has Value Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExchangeHasValueObject()
	 * @generated
	 * @ordered
	 */
	protected ValueObject valueExchangeHasValueObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePort getTargetValuePort() {
		if (targetValuePort != null && targetValuePort.eIsProxy()) {
			InternalEObject oldTargetValuePort = (InternalEObject)targetValuePort;
			targetValuePort = (ValuePort)eResolveProxy(oldTargetValuePort);
			if (targetValuePort != oldTargetValuePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT, oldTargetValuePort, targetValuePort));
			}
		}
		return targetValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePort basicGetTargetValuePort() {
		return targetValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetValuePort(ValuePort newTargetValuePort) {
		ValuePort oldTargetValuePort = targetValuePort;
		targetValuePort = newTargetValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT, oldTargetValuePort, targetValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePort getSourceValuePort() {
		if (sourceValuePort != null && sourceValuePort.eIsProxy()) {
			InternalEObject oldSourceValuePort = (InternalEObject)sourceValuePort;
			sourceValuePort = (ValuePort)eResolveProxy(oldSourceValuePort);
			if (sourceValuePort != oldSourceValuePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT, oldSourceValuePort, sourceValuePort));
			}
		}
		return sourceValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePort basicGetSourceValuePort() {
		return sourceValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceValuePort(ValuePort newSourceValuePort) {
		ValuePort oldSourceValuePort = sourceValuePort;
		sourceValuePort = newSourceValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT, oldSourceValuePort, sourceValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject getValueExchangeHasValueObject() {
		if (valueExchangeHasValueObject != null && valueExchangeHasValueObject.eIsProxy()) {
			InternalEObject oldValueExchangeHasValueObject = (InternalEObject)valueExchangeHasValueObject;
			valueExchangeHasValueObject = (ValueObject)eResolveProxy(oldValueExchangeHasValueObject);
			if (valueExchangeHasValueObject != oldValueExchangeHasValueObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT, oldValueExchangeHasValueObject, valueExchangeHasValueObject));
			}
		}
		return valueExchangeHasValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject basicGetValueExchangeHasValueObject() {
		return valueExchangeHasValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueExchangeHasValueObject(ValueObject newValueExchangeHasValueObject) {
		ValueObject oldValueExchangeHasValueObject = valueExchangeHasValueObject;
		valueExchangeHasValueObject = newValueExchangeHasValueObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT, oldValueExchangeHasValueObject, valueExchangeHasValueObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3ValuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				if (resolve) return getTargetValuePort();
				return basicGetTargetValuePort();
			case E3ValuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				if (resolve) return getSourceValuePort();
				return basicGetSourceValuePort();
			case E3ValuePackage.VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT:
				if (resolve) return getValueExchangeHasValueObject();
				return basicGetValueExchangeHasValueObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case E3ValuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				setTargetValuePort((ValuePort)newValue);
				return;
			case E3ValuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				setSourceValuePort((ValuePort)newValue);
				return;
			case E3ValuePackage.VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT:
				setValueExchangeHasValueObject((ValueObject)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case E3ValuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				setTargetValuePort((ValuePort)null);
				return;
			case E3ValuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				setSourceValuePort((ValuePort)null);
				return;
			case E3ValuePackage.VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT:
				setValueExchangeHasValueObject((ValueObject)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case E3ValuePackage.VALUE_EXCHANGE__TARGET_VALUE_PORT:
				return targetValuePort != null;
			case E3ValuePackage.VALUE_EXCHANGE__SOURCE_VALUE_PORT:
				return sourceValuePort != null;
			case E3ValuePackage.VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT:
				return valueExchangeHasValueObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueExchangeImpl
