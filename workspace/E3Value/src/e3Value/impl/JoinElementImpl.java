/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.InputPort;
import e3Value.JoinElement;
import e3Value.Orientation;
import e3Value.OutputPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.JoinElementImpl#getHasInputsPort <em>Has Inputs Port</em>}</li>
 *   <li>{@link e3Value.impl.JoinElementImpl#getHasOutputPort <em>Has Output Port</em>}</li>
 *   <li>{@link e3Value.impl.JoinElementImpl#getPositionJoin <em>Position Join</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinElementImpl extends LogicalElementImpl implements JoinElement {
	/**
	 * The cached value of the '{@link #getHasInputsPort() <em>Has Inputs Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputsPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> hasInputsPort;

	/**
	 * The cached value of the '{@link #getHasOutputPort() <em>Has Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputPort()
	 * @generated
	 * @ordered
	 */
	protected OutputPort hasOutputPort;

	/**
	 * The default value of the '{@link #getPositionJoin() <em>Position Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionJoin()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation POSITION_JOIN_EDEFAULT = Orientation.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getPositionJoin() <em>Position Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionJoin()
	 * @generated
	 * @ordered
	 */
	protected Orientation positionJoin = POSITION_JOIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.JOIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPort> getHasInputsPort() {
		if (hasInputsPort == null) {
			hasInputsPort = new EObjectContainmentEList<InputPort>(InputPort.class, this, E3ValuePackage.JOIN_ELEMENT__HAS_INPUTS_PORT);
		}
		return hasInputsPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPort getHasOutputPort() {
		return hasOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOutputPort(OutputPort newHasOutputPort, NotificationChain msgs) {
		OutputPort oldHasOutputPort = hasOutputPort;
		hasOutputPort = newHasOutputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, oldHasOutputPort, newHasOutputPort);
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
	public void setHasOutputPort(OutputPort newHasOutputPort) {
		if (newHasOutputPort != hasOutputPort) {
			NotificationChain msgs = null;
			if (hasOutputPort != null)
				msgs = ((InternalEObject)hasOutputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, null, msgs);
			if (newHasOutputPort != null)
				msgs = ((InternalEObject)newHasOutputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, null, msgs);
			msgs = basicSetHasOutputPort(newHasOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT, newHasOutputPort, newHasOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getPositionJoin() {
		return positionJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionJoin(Orientation newPositionJoin) {
		Orientation oldPositionJoin = positionJoin;
		positionJoin = newPositionJoin == null ? POSITION_JOIN_EDEFAULT : newPositionJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.JOIN_ELEMENT__POSITION_JOIN, oldPositionJoin, positionJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.JOIN_ELEMENT__HAS_INPUTS_PORT:
				return ((InternalEList<?>)getHasInputsPort()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				return basicSetHasOutputPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3ValuePackage.JOIN_ELEMENT__HAS_INPUTS_PORT:
				return getHasInputsPort();
			case E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				return getHasOutputPort();
			case E3ValuePackage.JOIN_ELEMENT__POSITION_JOIN:
				return getPositionJoin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case E3ValuePackage.JOIN_ELEMENT__HAS_INPUTS_PORT:
				getHasInputsPort().clear();
				getHasInputsPort().addAll((Collection<? extends InputPort>)newValue);
				return;
			case E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				setHasOutputPort((OutputPort)newValue);
				return;
			case E3ValuePackage.JOIN_ELEMENT__POSITION_JOIN:
				setPositionJoin((Orientation)newValue);
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
			case E3ValuePackage.JOIN_ELEMENT__HAS_INPUTS_PORT:
				getHasInputsPort().clear();
				return;
			case E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				setHasOutputPort((OutputPort)null);
				return;
			case E3ValuePackage.JOIN_ELEMENT__POSITION_JOIN:
				setPositionJoin(POSITION_JOIN_EDEFAULT);
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
			case E3ValuePackage.JOIN_ELEMENT__HAS_INPUTS_PORT:
				return hasInputsPort != null && !hasInputsPort.isEmpty();
			case E3ValuePackage.JOIN_ELEMENT__HAS_OUTPUT_PORT:
				return hasOutputPort != null;
			case E3ValuePackage.JOIN_ELEMENT__POSITION_JOIN:
				return positionJoin != POSITION_JOIN_EDEFAULT;
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
		result.append(" (positionJoin: ");
		result.append(positionJoin);
		result.append(')');
		return result.toString();
	}

} //JoinElementImpl
