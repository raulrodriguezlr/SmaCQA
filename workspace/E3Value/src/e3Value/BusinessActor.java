/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.BusinessActor#getName <em>Name</em>}</li>
 *   <li>{@link e3Value.BusinessActor#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 *   <li>{@link e3Value.BusinessActor#getHasStimulusElement <em>Has Stimulus Element</em>}</li>
 *   <li>{@link e3Value.BusinessActor#getHasValuesInterface <em>Has Values Interface</em>}</li>
 *   <li>{@link e3Value.BusinessActor#getBusinessActorsHasValueObjects <em>Business Actors Has Value Objects</em>}</li>
 *   <li>{@link e3Value.BusinessActor#getHasValueActivities <em>Has Value Activities</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getBusinessActor()
 * @model
 * @generated
 */
public interface BusinessActor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see e3Value.E3ValuePackage#getBusinessActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link e3Value.BusinessActor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.DependencyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependence Elements</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getBusinessActor_HasDependenceElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyElement> getHasDependenceElements();

	/**
	 * Returns the value of the '<em><b>Has Stimulus Element</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.StimulusElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stimulus Element</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getBusinessActor_HasStimulusElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<StimulusElement> getHasStimulusElement();

	/**
	 * Returns the value of the '<em><b>Has Values Interface</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Values Interface</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getBusinessActor_HasValuesInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueInterface> getHasValuesInterface();

	/**
	 * Returns the value of the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Actors Has Value Objects</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getBusinessActor_BusinessActorsHasValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getBusinessActorsHasValueObjects();

	/**
	 * Returns the value of the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Activities</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getBusinessActor_HasValueActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueActivity> getHasValueActivities();

} // BusinessActor
