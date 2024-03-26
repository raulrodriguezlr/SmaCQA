/**
 */
package e3Value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.ConnectionElement#getTargetDependenceElement <em>Target Dependence Element</em>}</li>
 *   <li>{@link e3Value.ConnectionElement#getSourceDependenceElement <em>Source Dependence Element</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getConnectionElement()
 * @model
 * @generated
 */
public interface ConnectionElement extends DependencyElement {
	/**
	 * Returns the value of the '<em><b>Target Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Dependence Element</em>' reference.
	 * @see #setTargetDependenceElement(PortElement)
	 * @see e3Value.E3ValuePackage#getConnectionElement_TargetDependenceElement()
	 * @model required="true"
	 * @generated
	 */
	PortElement getTargetDependenceElement();

	/**
	 * Sets the value of the '{@link e3Value.ConnectionElement#getTargetDependenceElement <em>Target Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Dependence Element</em>' reference.
	 * @see #getTargetDependenceElement()
	 * @generated
	 */
	void setTargetDependenceElement(PortElement value);

	/**
	 * Returns the value of the '<em><b>Source Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Dependence Element</em>' reference.
	 * @see #setSourceDependenceElement(PortElement)
	 * @see e3Value.E3ValuePackage#getConnectionElement_SourceDependenceElement()
	 * @model required="true"
	 * @generated
	 */
	PortElement getSourceDependenceElement();

	/**
	 * Sets the value of the '{@link e3Value.ConnectionElement#getSourceDependenceElement <em>Source Dependence Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dependence Element</em>' reference.
	 * @see #getSourceDependenceElement()
	 * @generated
	 */
	void setSourceDependenceElement(PortElement value);

} // ConnectionElement
