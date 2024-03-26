/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.ResponsabilityElement;
import e3Value.ValueInterface;
import e3Value.ValuePortIn;
import e3Value.ValuePortOut;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValueInterfaceImpl#getBindsResponsabilityElement <em>Binds Responsability Element</em>}</li>
 *   <li>{@link e3Value.impl.ValueInterfaceImpl#getHasValuePortOut <em>Has Value Port Out</em>}</li>
 *   <li>{@link e3Value.impl.ValueInterfaceImpl#getHasValuePortIn <em>Has Value Port In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueInterfaceImpl extends MinimalEObjectImpl.Container implements ValueInterface {
	/**
	 * The cached value of the '{@link #getBindsResponsabilityElement() <em>Binds Responsability Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsResponsabilityElement()
	 * @generated
	 * @ordered
	 */
	protected ResponsabilityElement bindsResponsabilityElement;

	/**
	 * The cached value of the '{@link #getHasValuePortOut() <em>Has Value Port Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePortOut()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuePortOut> hasValuePortOut;

	/**
	 * The cached value of the '{@link #getHasValuePortIn() <em>Has Value Port In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePortIn()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuePortIn> hasValuePortIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsabilityElement getBindsResponsabilityElement() {
		return bindsResponsabilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindsResponsabilityElement(ResponsabilityElement newBindsResponsabilityElement, NotificationChain msgs) {
		ResponsabilityElement oldBindsResponsabilityElement = bindsResponsabilityElement;
		bindsResponsabilityElement = newBindsResponsabilityElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, oldBindsResponsabilityElement, newBindsResponsabilityElement);
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
	public void setBindsResponsabilityElement(ResponsabilityElement newBindsResponsabilityElement) {
		if (newBindsResponsabilityElement != bindsResponsabilityElement) {
			NotificationChain msgs = null;
			if (bindsResponsabilityElement != null)
				msgs = ((InternalEObject)bindsResponsabilityElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, null, msgs);
			if (newBindsResponsabilityElement != null)
				msgs = ((InternalEObject)newBindsResponsabilityElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, null, msgs);
			msgs = basicSetBindsResponsabilityElement(newBindsResponsabilityElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, newBindsResponsabilityElement, newBindsResponsabilityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValuePortOut> getHasValuePortOut() {
		if (hasValuePortOut == null) {
			hasValuePortOut = new EObjectContainmentEList<ValuePortOut>(ValuePortOut.class, this, E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT);
		}
		return hasValuePortOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValuePortIn> getHasValuePortIn() {
		if (hasValuePortIn == null) {
			hasValuePortIn = new EObjectContainmentEList<ValuePortIn>(ValuePortIn.class, this, E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN);
		}
		return hasValuePortIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				return basicSetBindsResponsabilityElement(null, msgs);
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				return ((InternalEList<?>)getHasValuePortOut()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				return ((InternalEList<?>)getHasValuePortIn()).basicRemove(otherEnd, msgs);
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
			case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				return getBindsResponsabilityElement();
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				return getHasValuePortOut();
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				return getHasValuePortIn();
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
			case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				setBindsResponsabilityElement((ResponsabilityElement)newValue);
				return;
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				getHasValuePortOut().clear();
				getHasValuePortOut().addAll((Collection<? extends ValuePortOut>)newValue);
				return;
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				getHasValuePortIn().clear();
				getHasValuePortIn().addAll((Collection<? extends ValuePortIn>)newValue);
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
			case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				setBindsResponsabilityElement((ResponsabilityElement)null);
				return;
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				getHasValuePortOut().clear();
				return;
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				getHasValuePortIn().clear();
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
			case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
				return bindsResponsabilityElement != null;
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
				return hasValuePortOut != null && !hasValuePortOut.isEmpty();
			case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
				return hasValuePortIn != null && !hasValuePortIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueInterfaceImpl
