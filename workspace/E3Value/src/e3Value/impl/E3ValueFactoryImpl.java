/**
 */
package e3Value.impl;

import e3Value.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class E3ValueFactoryImpl extends EFactoryImpl implements E3ValueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static E3ValueFactory init() {
		try {
			E3ValueFactory theE3ValueFactory = (E3ValueFactory)EPackage.Registry.INSTANCE.getEFactory(E3ValuePackage.eNS_URI);
			if (theE3ValueFactory != null) {
				return theE3ValueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new E3ValueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case E3ValuePackage.COMPOSITE_ACTOR: return createCompositeActor();
			case E3ValuePackage.ELEMENTARY_ACTOR: return createElementaryActor();
			case E3ValuePackage.ACTOR: return createActor();
			case E3ValuePackage.E3_VALUE_DIAGRAM: return createE3ValueDiagram();
			case E3ValuePackage.E3_VALUE_MODEL: return createE3ValueModel();
			case E3ValuePackage.VALUE_OBJECT: return createValueObject();
			case E3ValuePackage.VALUE_EXCHANGE: return createValueExchange();
			case E3ValuePackage.VALUE_INTERFACE: return createValueInterface();
			case E3ValuePackage.VALUE_PORT_IN: return createValuePortIn();
			case E3ValuePackage.VALUE_PORT_OUT: return createValuePortOut();
			case E3ValuePackage.STIMULUS_ELEMENT: return createStimulusElement();
			case E3ValuePackage.START_STIMULUS: return createStartStimulus();
			case E3ValuePackage.END_STIMULUS: return createEndStimulus();
			case E3ValuePackage.VALUE_ACTIVITY: return createValueActivity();
			case E3ValuePackage.MARKET_SEGMENT: return createMarketSegment();
			case E3ValuePackage.BUSINESS_ACTOR: return createBusinessActor();
			case E3ValuePackage.VALUE_PORT: return createValuePort();
			case E3ValuePackage.RESPONSABILITY_ELEMENT: return createResponsabilityElement();
			case E3ValuePackage.AND_FORK: return createAndFork();
			case E3ValuePackage.AND_JOIN: return createAndJoin();
			case E3ValuePackage.OR_FORK: return createOrFork();
			case E3ValuePackage.OR_JOIN: return createOrJoin();
			case E3ValuePackage.FORK_ELEMENT: return createForkElement();
			case E3ValuePackage.JOIN_ELEMENT: return createJoinElement();
			case E3ValuePackage.CONNECTION_ELEMENT: return createConnectionElement();
			case E3ValuePackage.PORT_ELEMENT: return createPortElement();
			case E3ValuePackage.DEPENDENCY_ELEMENT: return createDependencyElement();
			case E3ValuePackage.LOGICAL_ELEMENT: return createLogicalElement();
			case E3ValuePackage.OUTPUT_PORT: return createOutputPort();
			case E3ValuePackage.INPUT_PORT: return createInputPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case E3ValuePackage.POSITION:
				return createPositionFromString(eDataType, initialValue);
			case E3ValuePackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case E3ValuePackage.POSITION:
				return convertPositionToString(eDataType, instanceValue);
			case E3ValuePackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeActor createCompositeActor() {
		CompositeActorImpl compositeActor = new CompositeActorImpl();
		return compositeActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementaryActor createElementaryActor() {
		ElementaryActorImpl elementaryActor = new ElementaryActorImpl();
		return elementaryActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E3ValueDiagram createE3ValueDiagram() {
		E3ValueDiagramImpl e3ValueDiagram = new E3ValueDiagramImpl();
		return e3ValueDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E3ValueModel createE3ValueModel() {
		E3ValueModelImpl e3ValueModel = new E3ValueModelImpl();
		return e3ValueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueExchange createValueExchange() {
		ValueExchangeImpl valueExchange = new ValueExchangeImpl();
		return valueExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInterface createValueInterface() {
		ValueInterfaceImpl valueInterface = new ValueInterfaceImpl();
		return valueInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePortIn createValuePortIn() {
		ValuePortInImpl valuePortIn = new ValuePortInImpl();
		return valuePortIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePortOut createValuePortOut() {
		ValuePortOutImpl valuePortOut = new ValuePortOutImpl();
		return valuePortOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StimulusElement createStimulusElement() {
		StimulusElementImpl stimulusElement = new StimulusElementImpl();
		return stimulusElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartStimulus createStartStimulus() {
		StartStimulusImpl startStimulus = new StartStimulusImpl();
		return startStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndStimulus createEndStimulus() {
		EndStimulusImpl endStimulus = new EndStimulusImpl();
		return endStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueActivity createValueActivity() {
		ValueActivityImpl valueActivity = new ValueActivityImpl();
		return valueActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketSegment createMarketSegment() {
		MarketSegmentImpl marketSegment = new MarketSegmentImpl();
		return marketSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessActor createBusinessActor() {
		BusinessActorImpl businessActor = new BusinessActorImpl();
		return businessActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePort createValuePort() {
		ValuePortImpl valuePort = new ValuePortImpl();
		return valuePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsabilityElement createResponsabilityElement() {
		ResponsabilityElementImpl responsabilityElement = new ResponsabilityElementImpl();
		return responsabilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndFork createAndFork() {
		AndForkImpl andFork = new AndForkImpl();
		return andFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndJoin createAndJoin() {
		AndJoinImpl andJoin = new AndJoinImpl();
		return andJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrFork createOrFork() {
		OrForkImpl orFork = new OrForkImpl();
		return orFork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrJoin createOrJoin() {
		OrJoinImpl orJoin = new OrJoinImpl();
		return orJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkElement createForkElement() {
		ForkElementImpl forkElement = new ForkElementImpl();
		return forkElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoinElement createJoinElement() {
		JoinElementImpl joinElement = new JoinElementImpl();
		return joinElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionElement createConnectionElement() {
		ConnectionElementImpl connectionElement = new ConnectionElementImpl();
		return connectionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortElement createPortElement() {
		PortElementImpl portElement = new PortElementImpl();
		return portElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyElement createDependencyElement() {
		DependencyElementImpl dependencyElement = new DependencyElementImpl();
		return dependencyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalElement createLogicalElement() {
		LogicalElementImpl logicalElement = new LogicalElementImpl();
		return logicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPositionFromString(EDataType eDataType, String initialValue) {
		Position result = Position.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E3ValuePackage getE3ValuePackage() {
		return (E3ValuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static E3ValuePackage getPackage() {
		return E3ValuePackage.eINSTANCE;
	}

} //E3ValueFactoryImpl
