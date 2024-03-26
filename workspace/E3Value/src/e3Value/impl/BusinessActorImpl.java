/**
 */
package e3Value.impl;

import e3Value.BusinessActor;
import e3Value.DependencyElement;
import e3Value.E3ValuePackage;
import e3Value.StimulusElement;
import e3Value.ValueActivity;
import e3Value.ValueInterface;
import e3Value.ValueObject;

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
 * An implementation of the model object '<em><b>Business Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.BusinessActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link e3Value.impl.BusinessActorImpl#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 *   <li>{@link e3Value.impl.BusinessActorImpl#getHasStimulusElement <em>Has Stimulus Element</em>}</li>
 *   <li>{@link e3Value.impl.BusinessActorImpl#getHasValuesInterface <em>Has Values Interface</em>}</li>
 *   <li>{@link e3Value.impl.BusinessActorImpl#getBusinessActorsHasValueObjects <em>Business Actors Has Value Objects</em>}</li>
 *   <li>{@link e3Value.impl.BusinessActorImpl#getHasValueActivities <em>Has Value Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessActorImpl extends MinimalEObjectImpl.Container implements BusinessActor {
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
	 * The cached value of the '{@link #getHasDependenceElements() <em>Has Dependence Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDependenceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyElement> hasDependenceElements;

	/**
	 * The cached value of the '{@link #getHasStimulusElement() <em>Has Stimulus Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStimulusElement()
	 * @generated
	 * @ordered
	 */
	protected EList<StimulusElement> hasStimulusElement;

	/**
	 * The cached value of the '{@link #getHasValuesInterface() <em>Has Values Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuesInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueInterface> hasValuesInterface;

	/**
	 * The cached value of the '{@link #getBusinessActorsHasValueObjects() <em>Business Actors Has Value Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessActorsHasValueObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueObject> businessActorsHasValueObjects;

	/**
	 * The cached value of the '{@link #getHasValueActivities() <em>Has Value Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueActivity> hasValueActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.BUSINESS_ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.BUSINESS_ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DependencyElement> getHasDependenceElements() {
		if (hasDependenceElements == null) {
			hasDependenceElements = new EObjectContainmentEList<DependencyElement>(DependencyElement.class, this, E3ValuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS);
		}
		return hasDependenceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StimulusElement> getHasStimulusElement() {
		if (hasStimulusElement == null) {
			hasStimulusElement = new EObjectContainmentEList<StimulusElement>(StimulusElement.class, this, E3ValuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT);
		}
		return hasStimulusElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueInterface> getHasValuesInterface() {
		if (hasValuesInterface == null) {
			hasValuesInterface = new EObjectContainmentEList<ValueInterface>(ValueInterface.class, this, E3ValuePackage.BUSINESS_ACTOR__HAS_VALUES_INTERFACE);
		}
		return hasValuesInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueObject> getBusinessActorsHasValueObjects() {
		if (businessActorsHasValueObjects == null) {
			businessActorsHasValueObjects = new EObjectContainmentEList<ValueObject>(ValueObject.class, this, E3ValuePackage.BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS);
		}
		return businessActorsHasValueObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueActivity> getHasValueActivities() {
		if (hasValueActivities == null) {
			hasValueActivities = new EObjectContainmentEList<ValueActivity>(ValueActivity.class, this, E3ValuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES);
		}
		return hasValueActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E3ValuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return ((InternalEList<?>)getHasDependenceElements()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT:
				return ((InternalEList<?>)getHasStimulusElement()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUES_INTERFACE:
				return ((InternalEList<?>)getHasValuesInterface()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS:
				return ((InternalEList<?>)getBusinessActorsHasValueObjects()).basicRemove(otherEnd, msgs);
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return ((InternalEList<?>)getHasValueActivities()).basicRemove(otherEnd, msgs);
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
			case E3ValuePackage.BUSINESS_ACTOR__NAME:
				return getName();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return getHasDependenceElements();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT:
				return getHasStimulusElement();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUES_INTERFACE:
				return getHasValuesInterface();
			case E3ValuePackage.BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS:
				return getBusinessActorsHasValueObjects();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return getHasValueActivities();
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
			case E3ValuePackage.BUSINESS_ACTOR__NAME:
				setName((String)newValue);
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				getHasDependenceElements().addAll((Collection<? extends DependencyElement>)newValue);
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT:
				getHasStimulusElement().clear();
				getHasStimulusElement().addAll((Collection<? extends StimulusElement>)newValue);
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUES_INTERFACE:
				getHasValuesInterface().clear();
				getHasValuesInterface().addAll((Collection<? extends ValueInterface>)newValue);
				return;
			case E3ValuePackage.BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS:
				getBusinessActorsHasValueObjects().clear();
				getBusinessActorsHasValueObjects().addAll((Collection<? extends ValueObject>)newValue);
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				getHasValueActivities().clear();
				getHasValueActivities().addAll((Collection<? extends ValueActivity>)newValue);
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
			case E3ValuePackage.BUSINESS_ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				getHasDependenceElements().clear();
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT:
				getHasStimulusElement().clear();
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUES_INTERFACE:
				getHasValuesInterface().clear();
				return;
			case E3ValuePackage.BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS:
				getBusinessActorsHasValueObjects().clear();
				return;
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				getHasValueActivities().clear();
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
			case E3ValuePackage.BUSINESS_ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E3ValuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
				return hasDependenceElements != null && !hasDependenceElements.isEmpty();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT:
				return hasStimulusElement != null && !hasStimulusElement.isEmpty();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUES_INTERFACE:
				return hasValuesInterface != null && !hasValuesInterface.isEmpty();
			case E3ValuePackage.BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS:
				return businessActorsHasValueObjects != null && !businessActorsHasValueObjects.isEmpty();
			case E3ValuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
				return hasValueActivities != null && !hasValueActivities.isEmpty();
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

} //BusinessActorImpl
