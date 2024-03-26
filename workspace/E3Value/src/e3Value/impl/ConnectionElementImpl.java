/**
 */
package e3Value.impl;

import e3Value.ConnectionElement;
import e3Value.E3ValuePackage;
import e3Value.PortElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ConnectionElementImpl#getTargetDependenceElement <em>Target Dependence Element</em>}</li>
 *   <li>{@link e3Value.impl.ConnectionElementImpl#getSourceDependenceElement <em>Source Dependence Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionElementImpl extends DependencyElementImpl implements ConnectionElement {
	/**
	 * The cached value of the '{@link #getTargetDependenceElement() <em>Target Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDependenceElement()
	 * @generated
	 * @ordered
	 */
	protected PortElement targetDependenceElement;

	/**
	 * The cached value of the '{@link #getSourceDependenceElement() <em>Source Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDependenceElement()
	 * @generated
	 * @ordered
	 */
	protected PortElement sourceDependenceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.CONNECTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortElement getTargetDependenceElement() {
		if (targetDependenceElement != null && targetDependenceElement.eIsProxy()) {
			InternalEObject oldTargetDependenceElement = (InternalEObject)targetDependenceElement;
			targetDependenceElement = (PortElement)eResolveProxy(oldTargetDependenceElement);
			if (targetDependenceElement != oldTargetDependenceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT, oldTargetDependenceElement, targetDependenceElement));
			}
		}
		return targetDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortElement basicGetTargetDependenceElement() {
		return targetDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDependenceElement(PortElement newTargetDependenceElement) {
		PortElement oldTargetDependenceElement = targetDependenceElement;
		targetDependenceElement = newTargetDependenceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT, oldTargetDependenceElement, targetDependenceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortElement getSourceDependenceElement() {
		if (sourceDependenceElement != null && sourceDependenceElement.eIsProxy()) {
			InternalEObject oldSourceDependenceElement = (InternalEObject)sourceDependenceElement;
			sourceDependenceElement = (PortElement)eResolveProxy(oldSourceDependenceElement);
			if (sourceDependenceElement != oldSourceDependenceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E3ValuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT, oldSourceDependenceElement, sourceDependenceElement));
			}
		}
		return sourceDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortElement basicGetSourceDependenceElement() {
		return sourceDependenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDependenceElement(PortElement newSourceDependenceElement) {
		PortElement oldSourceDependenceElement = sourceDependenceElement;
		sourceDependenceElement = newSourceDependenceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT, oldSourceDependenceElement, sourceDependenceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E3ValuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				if (resolve) return getTargetDependenceElement();
				return basicGetTargetDependenceElement();
			case E3ValuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				if (resolve) return getSourceDependenceElement();
				return basicGetSourceDependenceElement();
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
			case E3ValuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				setTargetDependenceElement((PortElement)newValue);
				return;
			case E3ValuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				setSourceDependenceElement((PortElement)newValue);
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
			case E3ValuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				setTargetDependenceElement((PortElement)null);
				return;
			case E3ValuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				setSourceDependenceElement((PortElement)null);
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
			case E3ValuePackage.CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT:
				return targetDependenceElement != null;
			case E3ValuePackage.CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT:
				return sourceDependenceElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionElementImpl
