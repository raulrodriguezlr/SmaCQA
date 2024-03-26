/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.Position;
import e3Value.ValueExchange;
import e3Value.ValuePortOut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Port Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValuePortOutImpl#getOutConnectWithValueExchange <em>Out Connect With Value Exchange</em>}</li>
 *   <li>{@link e3Value.impl.ValuePortOutImpl#getPositionValuePort <em>Position Value Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePortOutImpl extends ValuePortImpl implements ValuePortOut {
	/**
	 * The cached value of the '{@link #getOutConnectWithValueExchange() <em>Out Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutConnectWithValueExchange()
	 * @generated
	 * @ordered
	 */
	protected ValueExchange outConnectWithValueExchange;

	/**
	 * The default value of the '{@link #getPositionValuePort() <em>Position Value Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionValuePort()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_VALUE_PORT_EDEFAULT = Position.NORTH;

	/**
	 * The cached value of the '{@link #getPositionValuePort() <em>Position Value Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionValuePort()
	 * @generated
	 * @ordered
	 */
	protected Position positionValuePort = POSITION_VALUE_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_PORT_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueExchange getOutConnectWithValueExchange() {
		if (outConnectWithValueExchange != null && outConnectWithValueExchange.eIsProxy()) {
			InternalEObject oldOutConnectWithValueExchange = (InternalEObject)outConnectWithValueExchange;
			outConnectWithValueExchange = (ValueExchange)eResolveProxy(oldOutConnectWithValueExchange);
			if (outConnectWithValueExchange != oldOutConnectWithValueExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE, oldOutConnectWithValueExchange, outConnectWithValueExchange));
			}
		}
		return outConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange basicGetOutConnectWithValueExchange() {
		return outConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutConnectWithValueExchange(ValueExchange newOutConnectWithValueExchange) {
		ValueExchange oldOutConnectWithValueExchange = outConnectWithValueExchange;
		outConnectWithValueExchange = newOutConnectWithValueExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE, oldOutConnectWithValueExchange, outConnectWithValueExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPositionValuePort() {
		return positionValuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionValuePort(Position newPositionValuePort) {
		Position oldPositionValuePort = positionValuePort;
		positionValuePort = newPositionValuePort == null ? POSITION_VALUE_PORT_EDEFAULT : newPositionValuePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_PORT_OUT__POSITION_VALUE_PORT, oldPositionValuePort, positionValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3ValuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				if (resolve) return getOutConnectWithValueExchange();
				return basicGetOutConnectWithValueExchange();
			case E3ValuePackage.VALUE_PORT_OUT__POSITION_VALUE_PORT:
				return getPositionValuePort();
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
			case E3ValuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				setOutConnectWithValueExchange((ValueExchange)newValue);
				return;
			case E3ValuePackage.VALUE_PORT_OUT__POSITION_VALUE_PORT:
				setPositionValuePort((Position)newValue);
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
			case E3ValuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				setOutConnectWithValueExchange((ValueExchange)null);
				return;
			case E3ValuePackage.VALUE_PORT_OUT__POSITION_VALUE_PORT:
				setPositionValuePort(POSITION_VALUE_PORT_EDEFAULT);
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
			case E3ValuePackage.VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE:
				return outConnectWithValueExchange != null;
			case E3ValuePackage.VALUE_PORT_OUT__POSITION_VALUE_PORT:
				return positionValuePort != POSITION_VALUE_PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (positionValuePort: ");
		result.append(positionValuePort);
		result.append(')');
		return result.toString();
	}

} //ValuePortOutImpl
