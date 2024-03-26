/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.CompositeActor#getHasElementaryActors <em>Has Elementary Actors</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getCompositeActor()
 * @model
 * @generated
 */
public interface CompositeActor extends Actor {
	/**
	 * Returns the value of the '<em><b>Has Elementary Actors</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ElementaryActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elementary Actors</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getCompositeActor_HasElementaryActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementaryActor> getHasElementaryActors();

} // CompositeActor
