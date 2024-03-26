/**
 */
package e3Value;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see e3Value.E3ValuePackage
 * @generated
 */
public interface E3ValueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	E3ValueFactory eINSTANCE = e3Value.impl.E3ValueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Actor</em>'.
	 * @generated
	 */
	CompositeActor createCompositeActor();

	/**
	 * Returns a new object of class '<em>Elementary Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Actor</em>'.
	 * @generated
	 */
	ElementaryActor createElementaryActor();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	E3ValueDiagram createE3ValueDiagram();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	E3ValueModel createE3ValueModel();

	/**
	 * Returns a new object of class '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Object</em>'.
	 * @generated
	 */
	ValueObject createValueObject();

	/**
	 * Returns a new object of class '<em>Value Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Exchange</em>'.
	 * @generated
	 */
	ValueExchange createValueExchange();

	/**
	 * Returns a new object of class '<em>Value Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Interface</em>'.
	 * @generated
	 */
	ValueInterface createValueInterface();

	/**
	 * Returns a new object of class '<em>Value Port In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Port In</em>'.
	 * @generated
	 */
	ValuePortIn createValuePortIn();

	/**
	 * Returns a new object of class '<em>Value Port Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Port Out</em>'.
	 * @generated
	 */
	ValuePortOut createValuePortOut();

	/**
	 * Returns a new object of class '<em>Stimulus Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus Element</em>'.
	 * @generated
	 */
	StimulusElement createStimulusElement();

	/**
	 * Returns a new object of class '<em>Start Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Stimulus</em>'.
	 * @generated
	 */
	StartStimulus createStartStimulus();

	/**
	 * Returns a new object of class '<em>End Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Stimulus</em>'.
	 * @generated
	 */
	EndStimulus createEndStimulus();

	/**
	 * Returns a new object of class '<em>Value Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Activity</em>'.
	 * @generated
	 */
	ValueActivity createValueActivity();

	/**
	 * Returns a new object of class '<em>Market Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Market Segment</em>'.
	 * @generated
	 */
	MarketSegment createMarketSegment();

	/**
	 * Returns a new object of class '<em>Business Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Actor</em>'.
	 * @generated
	 */
	BusinessActor createBusinessActor();

	/**
	 * Returns a new object of class '<em>Value Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Port</em>'.
	 * @generated
	 */
	ValuePort createValuePort();

	/**
	 * Returns a new object of class '<em>Responsability Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsability Element</em>'.
	 * @generated
	 */
	ResponsabilityElement createResponsabilityElement();

	/**
	 * Returns a new object of class '<em>And Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Fork</em>'.
	 * @generated
	 */
	AndFork createAndFork();

	/**
	 * Returns a new object of class '<em>And Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Join</em>'.
	 * @generated
	 */
	AndJoin createAndJoin();

	/**
	 * Returns a new object of class '<em>Or Fork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Fork</em>'.
	 * @generated
	 */
	OrFork createOrFork();

	/**
	 * Returns a new object of class '<em>Or Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Join</em>'.
	 * @generated
	 */
	OrJoin createOrJoin();

	/**
	 * Returns a new object of class '<em>Fork Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Element</em>'.
	 * @generated
	 */
	ForkElement createForkElement();

	/**
	 * Returns a new object of class '<em>Join Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Element</em>'.
	 * @generated
	 */
	JoinElement createJoinElement();

	/**
	 * Returns a new object of class '<em>Connection Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Element</em>'.
	 * @generated
	 */
	ConnectionElement createConnectionElement();

	/**
	 * Returns a new object of class '<em>Port Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Element</em>'.
	 * @generated
	 */
	PortElement createPortElement();

	/**
	 * Returns a new object of class '<em>Dependency Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Element</em>'.
	 * @generated
	 */
	DependencyElement createDependencyElement();

	/**
	 * Returns a new object of class '<em>Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Element</em>'.
	 * @generated
	 */
	LogicalElement createLogicalElement();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	E3ValuePackage getE3ValuePackage();

} //E3ValueFactory
