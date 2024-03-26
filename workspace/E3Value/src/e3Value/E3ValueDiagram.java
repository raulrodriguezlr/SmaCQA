/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.E3ValueDiagram#getHasE3ValueModels <em>Has E3 Value Models</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getE3ValueDiagram()
 * @model
 * @generated
 */
public interface E3ValueDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Has E3 Value Models</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.E3ValueModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has E3 Value Models</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getE3ValueDiagram_HasE3ValueModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<E3ValueModel> getHasE3ValueModels();

} // E3ValueDiagram
