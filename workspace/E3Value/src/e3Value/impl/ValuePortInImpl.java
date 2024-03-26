/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.Position;
import e3Value.ValueExchange;
import e3Value.ValuePortIn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Port In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValuePortInImpl#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}</li>
 *   <li>{@link e3Value.impl.ValuePortInImpl#getPositionValuePort <em>Position Value Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePortInImpl extends ValuePortImpl implements ValuePortIn {
	/**
	 * The cached value of the '{@link #getInConnectWithValueExchange() <em>In Connect With Value Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInConnectWithValueExchange()
	 * @generated
	 * @ordered
	 */
	protected ValueExchange inConnectWithValueExchange;

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
	protected ValuePortInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_PORT_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueExchange getInConnectWithValueExchange() {
		if (inConnectWithValueExchange != null && inConnectWithValueExchange.eIsProxy()) {
			InternalEObject oldInConnectWithValueExchange = (InternalEObject)inConnectWithValueExchange;
			inConnectWithValueExchange = (ValueExchange)eResolveProxy(oldInConnectWithValueExchange);
			if (inConnectWithValueExchange != oldInConnectWithValueExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE, oldInConnectWithValueExchange, inConnectWithValueExchange));
			}
		}
		return inConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExchange basicGetInConnectWithValueExchange() {
		return inConnectWithValueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInConnectWithValueExchange(ValueExchange newInConnectWithValueExchange) {
		ValueExchange oldInConnectWithValueExchange = inConnectWithValueExchange;
		inConnectWithValueExchange = newInConnectWithValueExchange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE, oldInConnectWithValueExchange, inConnectWithValueExchange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_PORT_IN__POSITION_VALUE_PORT, oldPositionValuePort, positionValuePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3ValuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				if (resolve) return getInConnectWithValueExchange();
				return basicGetInConnectWithValueExchange();
			case E3ValuePackage.VALUE_PORT_IN__POSITION_VALUE_PORT:
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
			case E3ValuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				setInConnectWithValueExchange((ValueExchange)newValue);
				return;
			case E3ValuePackage.VALUE_PORT_IN__POSITION_VALUE_PORT:
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
			case E3ValuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				setInConnectWithValueExchange((ValueExchange)null);
				return;
			case E3ValuePackage.VALUE_PORT_IN__POSITION_VALUE_PORT:
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
			case E3ValuePackage.VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE:
				return inConnectWithValueExchange != null;
			case E3ValuePackage.VALUE_PORT_IN__POSITION_VALUE_PORT:
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

} //ValuePortInImpl
