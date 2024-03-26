/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.ForkElement;
import e3Value.InputPort;
import e3Value.OutputPort;
import e3Value.Position;

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
 * An implementation of the model object '<em><b>Fork Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ForkElementImpl#getHasOutputsPort <em>Has Outputs Port</em>}</li>
 *   <li>{@link e3Value.impl.ForkElementImpl#getHasInputPort <em>Has Input Port</em>}</li>
 *   <li>{@link e3Value.impl.ForkElementImpl#getPositionFork <em>Position Fork</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkElementImpl extends LogicalElementImpl implements ForkElement {
	/**
	 * The cached value of the '{@link #getHasOutputsPort() <em>Has Outputs Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputsPort()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> hasOutputsPort;

	/**
	 * The cached value of the '{@link #getHasInputPort() <em>Has Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort hasInputPort;

	/**
	 * The default value of the '{@link #getPositionFork() <em>Position Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionFork()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_FORK_EDEFAULT = Position.NORTH;

	/**
	 * The cached value of the '{@link #getPositionFork() <em>Position Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionFork()
	 * @generated
	 * @ordered
	 */
	protected Position positionFork = POSITION_FORK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.FORK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputPort> getHasOutputsPort() {
		if (hasOutputsPort == null) {
			hasOutputsPort = new EObjectContainmentEList<OutputPort>(OutputPort.class, this, E3ValuePackage.FORK_ELEMENT__HAS_OUTPUTS_PORT);
		}
		return hasOutputsPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPort getHasInputPort() {
		return hasInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInputPort(InputPort newHasInputPort, NotificationChain msgs) {
		InputPort oldHasInputPort = hasInputPort;
		hasInputPort = newHasInputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT, oldHasInputPort, newHasInputPort);
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
	public void setHasInputPort(InputPort newHasInputPort) {
		if (newHasInputPort != hasInputPort) {
			NotificationChain msgs = null;
			if (hasInputPort != null)
				msgs = ((InternalEObject)hasInputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT, null, msgs);
			if (newHasInputPort != null)
				msgs = ((InternalEObject)newHasInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT, null, msgs);
			msgs = basicSetHasInputPort(newHasInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT, newHasInputPort, newHasInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPositionFork() {
		return positionFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionFork(Position newPositionFork) {
		Position oldPositionFork = positionFork;
		positionFork = newPositionFork == null ? POSITION_FORK_EDEFAULT : newPositionFork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.FORK_ELEMENT__POSITION_FORK, oldPositionFork, positionFork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.FORK_ELEMENT__HAS_OUTPUTS_PORT:
				return ((InternalEList<?>)getHasOutputsPort()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				return basicSetHasInputPort(null, msgs);
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
			case E3ValuePackage.FORK_ELEMENT__HAS_OUTPUTS_PORT:
				return getHasOutputsPort();
			case E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				return getHasInputPort();
			case E3ValuePackage.FORK_ELEMENT__POSITION_FORK:
				return getPositionFork();
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
			case E3ValuePackage.FORK_ELEMENT__HAS_OUTPUTS_PORT:
				getHasOutputsPort().clear();
				getHasOutputsPort().addAll((Collection<? extends OutputPort>)newValue);
				return;
			case E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				setHasInputPort((InputPort)newValue);
				return;
			case E3ValuePackage.FORK_ELEMENT__POSITION_FORK:
				setPositionFork((Position)newValue);
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
			case E3ValuePackage.FORK_ELEMENT__HAS_OUTPUTS_PORT:
				getHasOutputsPort().clear();
				return;
			case E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				setHasInputPort((InputPort)null);
				return;
			case E3ValuePackage.FORK_ELEMENT__POSITION_FORK:
				setPositionFork(POSITION_FORK_EDEFAULT);
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
			case E3ValuePackage.FORK_ELEMENT__HAS_OUTPUTS_PORT:
				return hasOutputsPort != null && !hasOutputsPort.isEmpty();
			case E3ValuePackage.FORK_ELEMENT__HAS_INPUT_PORT:
				return hasInputPort != null;
			case E3ValuePackage.FORK_ELEMENT__POSITION_FORK:
				return positionFork != POSITION_FORK_EDEFAULT;
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
		result.append(" (positionFork: ");
		result.append(positionFork);
		result.append(')');
		return result.toString();
	}

} //ForkElementImpl
