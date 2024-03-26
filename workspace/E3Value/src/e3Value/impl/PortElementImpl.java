/**
 */
package e3Value.impl;

import e3Value.ConnectionElement;
import e3Value.E3ValuePackage;
import e3Value.PortElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.PortElementImpl#getConnectionelement <em>Connectionelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortElementImpl extends DependencyElementImpl implements PortElement {
	/**
	 * The cached value of the '{@link #getConnectionelement() <em>Connectionelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionElement> connectionelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.PORT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionElement> getConnectionelement() {
		if (connectionelement == null) {
			connectionelement = new EObjectContainmentEList<ConnectionElement>(ConnectionElement.class, this, E3ValuePackage.PORT_ELEMENT__CONNECTIONELEMENT);
		}
		return connectionelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.PORT_ELEMENT__CONNECTIONELEMENT:
				return ((InternalEList<?>)getConnectionelement()).basicRemove(otherEnd, msgs);
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
			case E3ValuePackage.PORT_ELEMENT__CONNECTIONELEMENT:
				return getConnectionelement();
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
			case E3ValuePackage.PORT_ELEMENT__CONNECTIONELEMENT:
				getConnectionelement().clear();
				getConnectionelement().addAll((Collection<? extends ConnectionElement>)newValue);
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
			case E3ValuePackage.PORT_ELEMENT__CONNECTIONELEMENT:
				getConnectionelement().clear();
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
			case E3ValuePackage.PORT_ELEMENT__CONNECTIONELEMENT:
				return connectionelement != null && !connectionelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortElementImpl
