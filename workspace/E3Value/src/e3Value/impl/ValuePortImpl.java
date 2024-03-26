/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.ValueExchange;
import e3Value.ValuePort;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValuePortImpl#getValueexchange <em>Valueexchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePortImpl extends MinimalEObjectImpl.Container implements ValuePort {
	/**
	 * The cached value of the '{@link #getValueexchange() <em>Valueexchange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueexchange()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueExchange> valueexchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueExchange> getValueexchange() {
		if (valueexchange == null) {
			valueexchange = new EObjectContainmentEList<ValueExchange>(ValueExchange.class, this, E3ValuePackage.VALUE_PORT__VALUEEXCHANGE);
		}
		return valueexchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.VALUE_PORT__VALUEEXCHANGE:
				return ((InternalEList<?>)getValueexchange()).basicRemove(otherEnd, msgs);
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
			case E3ValuePackage.VALUE_PORT__VALUEEXCHANGE:
				return getValueexchange();
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
			case E3ValuePackage.VALUE_PORT__VALUEEXCHANGE:
				getValueexchange().clear();
				getValueexchange().addAll((Collection<? extends ValueExchange>)newValue);
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
			case E3ValuePackage.VALUE_PORT__VALUEEXCHANGE:
				getValueexchange().clear();
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
			case E3ValuePackage.VALUE_PORT__VALUEEXCHANGE:
				return valueexchange != null && !valueexchange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValuePortImpl
