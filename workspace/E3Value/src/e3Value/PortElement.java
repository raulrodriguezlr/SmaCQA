/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.PortElement#getConnectionelement <em>Connectionelement</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getPortElement()
 * @model
 * @generated
 */
public interface PortElement extends DependencyElement {
	/**
	 * Returns the value of the '<em><b>Connectionelement</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ConnectionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionelement</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getPortElement_Connectionelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionElement> getConnectionelement();

} // PortElement
