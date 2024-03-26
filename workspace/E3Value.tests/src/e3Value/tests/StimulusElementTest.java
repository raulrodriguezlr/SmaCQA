/**
 */
package e3Value.tests;

import e3Value.E3ValueFactory;
import e3Value.StimulusElement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stimulus Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StimulusElementTest extends PortElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StimulusElementTest.class);
	}

	/**
	 * Constructs a new Stimulus Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimulusElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stimulus Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StimulusElement getFixture() {
		return (StimulusElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(E3ValueFactory.eINSTANCE.createStimulusElement());
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

} //StimulusElementTest
