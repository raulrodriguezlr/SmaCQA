/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ValueActivity#getName <em>Name</em>}</li>
 *   <li>{@link e3Value.ValueActivity#getHasStimulusElement <em>Has Stimulus Element</em>}</li>
 *   <li>{@link e3Value.ValueActivity#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 *   <li>{@link e3Value.ValueActivity#getValueinterfaces <em>Valueinterfaces</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getValueActivity()
 * @model
 * @generated
 */
public interface ValueActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see e3Value.E3ValuePackage#getValueActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link e3Value.ValueActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Stimulus Element</b></em>' reference list.
	 * The list contents are of type {@link e3Value.StimulusElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stimulus Element</em>' reference list.
	 * @see e3Value.E3ValuePackage#getValueActivity_HasStimulusElement()
	 * @model
	 * @generated
	 */
	EList<StimulusElement> getHasStimulusElement();

	/**
	 * Returns the value of the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.DependencyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependence Elements</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getValueActivity_HasDependenceElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyElement> getHasDependenceElements();

	/**
	 * Returns the value of the '<em><b>Valueinterfaces</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueinterfaces</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getValueActivity_Valueinterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueInterface> getValueinterfaces();

} // ValueActivity
