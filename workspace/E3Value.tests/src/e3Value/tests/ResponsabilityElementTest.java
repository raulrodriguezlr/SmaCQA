/**
 */
package e3Value.tests;

import e3Value.E3ValueFactory;
import e3Value.ResponsabilityElement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Responsability Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsabilityElementTest extends PortElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResponsabilityElementTest.class);
	}

	/**
	 * Constructs a new Responsability Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsabilityElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Responsability Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResponsabilityElement getFixture() {
		return (ResponsabilityElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(E3ValueFactory.eINSTANCE.createResponsabilityElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ResponsabilityElementTest
