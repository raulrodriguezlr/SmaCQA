/**
 */
package e3Value.impl;

import e3Value.DependencyElement;
import e3Value.E3ValuePackage;
import e3Value.StimulusElement;
import e3Value.ValueActivity;
import e3Value.ValueInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValueActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link e3Value.impl.ValueActivityImpl#getHasStimulusElement <em>Has Stimulus Element</em>}</li>
 *   <li>{@link e3Value.impl.ValueActivityImpl#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 *   <li>{@link e3Value.impl.ValueActivityImpl#getValueinterfaces <em>Valueinterfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueActivityImpl extends MinimalEObjectImpl.Container implements ValueActivity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasStimulusElement() <em>Has Stimulus Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStimulusElement()
	 * @generated
	 * @ordered
	 */
	protected EList<StimulusElement> hasStimulusElement;

	/**
	 * The cached value of the '{@link #getHasDependenceElements() <em>Has Dependence Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDependenceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyElement> hasDependenceElements;

	/**
	 * The cached value of the '{@link #getValueinterfaces() <em>Valueinterfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueinterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueInterface> valueinterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StimulusElement> getHasStimulusElement() {
		if (hasStimulusElement == null) {
			hasStimulusElement = new EObjectResolvingEList<StimulusElement>(StimulusElement.class, this, E3ValuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT);
		}
		return hasStimulusElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DependencyElement> getHasDependenceElements() {
		if (hasDependenceElements == null) {
			hasDependenceElements = new EObjectContainmentEList<DependencyElement>(DependencyElement.class, this, E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS);
		}
		return hasDependenceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueInterface> getValueinterfaces() {
		if (valueinterfaces == null) {
			valueinterfaces = new EObjectContainmentEList<ValueInterface>(ValueInterface.class, this, E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES);
		}
		return valueinterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				return ((InternalEList<?>)getHasDependenceElements()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES:
				return ((InternalEList<?>)getValueinterfaces()).basicRemove(otherEnd, msgs);
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
			case E3ValuePackage.VALUE_ACTIVITY__NAME:
				return getName();
			case E3ValuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				return getHasStimulusElement();
			case E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				return getHasDependenceElements();
			case E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES:
				return getValueinterfaces();
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
			case E3ValuePackage.VALUE_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case E3ValuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				getHasStimulusElement().clear();
				getHasStimulusElement().addAll((Collection<? extends StimulusElement>)newValue);
				return;
			case E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				getHasDependenceElements().addAll((Collection<? extends DependencyElement>)newValue);
				return;
			case E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES:
				getValueinterfaces().clear();
				getValueinterfaces().addAll((Collection<? extends ValueInterface>)newValue);
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
			case E3ValuePackage.VALUE_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E3ValuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				getHasStimulusElement().clear();
				return;
			case E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				return;
			case E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES:
				getValueinterfaces().clear();
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
			case E3ValuePackage.VALUE_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E3ValuePackage.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT:
				return hasStimulusElement != null && !hasStimulusElement.isEmpty();
			case E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
				return hasDependenceElements != null && !hasDependenceElements.isEmpty();
			case E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES:
				return valueinterfaces != null && !valueinterfaces.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ValueActivityImpl
