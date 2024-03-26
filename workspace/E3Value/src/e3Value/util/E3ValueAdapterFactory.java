/**
 */
package e3Value.util;

import e3Value.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see e3Value.E3ValuePackage
 * @generated
 */
public class E3ValueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static E3ValuePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = E3ValuePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueSwitch<Adapter> modelSwitch =
		new E3ValueSwitch<Adapter>() {
			@Override
			public Adapter caseCompositeActor(CompositeActor object) {
				return createCompositeActorAdapter();
			}
			@Override
			public Adapter caseElementaryActor(ElementaryActor object) {
				return createElementaryActorAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseE3ValueDiagram(E3ValueDiagram object) {
				return createE3ValueDiagramAdapter();
			}
			@Override
			public Adapter caseE3ValueModel(E3ValueModel object) {
				return createE3ValueModelAdapter();
			}
			@Override
			public Adapter caseValueObject(ValueObject object) {
				return createValueObjectAdapter();
			}
			@Override
			public Adapter caseValueExchange(ValueExchange object) {
				return createValueExchangeAdapter();
			}
			@Override
			public Adapter caseValueInterface(ValueInterface object) {
				return createValueInterfaceAdapter();
			}
			@Override
			public Adapter caseValuePortIn(ValuePortIn object) {
				return createValuePortInAdapter();
			}
			@Override
			public Adapter caseValuePortOut(ValuePortOut object) {
				return createValuePortOutAdapter();
			}
			@Override
			public Adapter caseStimulusElement(StimulusElement object) {
				return createStimulusElementAdapter();
			}
			@Override
			public Adapter caseStartStimulus(StartStimulus object) {
				return createStartStimulusAdapter();
			}
			@Override
			public Adapter caseEndStimulus(EndStimulus object) {
				return createEndStimulusAdapter();
			}
			@Override
			public Adapter caseValueActivity(ValueActivity object) {
				return createValueActivityAdapter();
			}
			@Override
			public Adapter caseMarketSegment(MarketSegment object) {
				return createMarketSegmentAdapter();
			}
			@Override
			public Adapter caseBusinessActor(BusinessActor object) {
				return createBusinessActorAdapter();
			}
			@Override
			public Adapter caseValuePort(ValuePort object) {
				return createValuePortAdapter();
			}
			@Override
			public Adapter caseResponsabilityElement(ResponsabilityElement object) {
				return createResponsabilityElementAdapter();
			}
			@Override
			public Adapter caseAndFork(AndFork object) {
				return createAndForkAdapter();
			}
			@Override
			public Adapter caseAndJoin(AndJoin object) {
				return createAndJoinAdapter();
			}
			@Override
			public Adapter caseOrFork(OrFork object) {
				return createOrForkAdapter();
			}
			@Override
			public Adapter caseOrJoin(OrJoin object) {
				return createOrJoinAdapter();
			}
			@Override
			public Adapter caseForkElement(ForkElement object) {
				return createForkElementAdapter();
			}
			@Override
			public Adapter caseJoinElement(JoinElement object) {
				return createJoinElementAdapter();
			}
			@Override
			public Adapter caseConnectionElement(ConnectionElement object) {
				return createConnectionElementAdapter();
			}
			@Override
			public Adapter casePortElement(PortElement object) {
				return createPortElementAdapter();
			}
			@Override
			public Adapter caseDependencyElement(DependencyElement object) {
				return createDependencyElementAdapter();
			}
			@Override
			public Adapter caseLogicalElement(LogicalElement object) {
				return createLogicalElementAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link e3Value.CompositeActor <em>Composite Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.CompositeActor
	 * @generated
	 */
	public Adapter createCompositeActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ElementaryActor <em>Elementary Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ElementaryActor
	 * @generated
	 */
	public Adapter createElementaryActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.E3ValueDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.E3ValueDiagram
	 * @generated
	 */
	public Adapter createE3ValueDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.E3ValueModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.E3ValueModel
	 * @generated
	 */
	public Adapter createE3ValueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValueObject
	 * @generated
	 */
	public Adapter createValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValueExchange <em>Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValueExchange
	 * @generated
	 */
	public Adapter createValueExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValueInterface <em>Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValueInterface
	 * @generated
	 */
	public Adapter createValueInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValuePortIn <em>Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValuePortIn
	 * @generated
	 */
	public Adapter createValuePortInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValuePortOut <em>Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValuePortOut
	 * @generated
	 */
	public Adapter createValuePortOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.StimulusElement <em>Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.StimulusElement
	 * @generated
	 */
	public Adapter createStimulusElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.StartStimulus <em>Start Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.StartStimulus
	 * @generated
	 */
	public Adapter createStartStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.EndStimulus <em>End Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.EndStimulus
	 * @generated
	 */
	public Adapter createEndStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValueActivity <em>Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValueActivity
	 * @generated
	 */
	public Adapter createValueActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.MarketSegment <em>Market Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.MarketSegment
	 * @generated
	 */
	public Adapter createMarketSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.BusinessActor <em>Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.BusinessActor
	 * @generated
	 */
	public Adapter createBusinessActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ValuePort <em>Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ValuePort
	 * @generated
	 */
	public Adapter createValuePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ResponsabilityElement <em>Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ResponsabilityElement
	 * @generated
	 */
	public Adapter createResponsabilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.AndFork
	 * @generated
	 */
	public Adapter createAndForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.AndJoin
	 * @generated
	 */
	public Adapter createAndJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.OrFork
	 * @generated
	 */
	public Adapter createOrForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.OrJoin
	 * @generated
	 */
	public Adapter createOrJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ForkElement <em>Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ForkElement
	 * @generated
	 */
	public Adapter createForkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.JoinElement <em>Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.JoinElement
	 * @generated
	 */
	public Adapter createJoinElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.ConnectionElement <em>Connection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.ConnectionElement
	 * @generated
	 */
	public Adapter createConnectionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.PortElement <em>Port Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.PortElement
	 * @generated
	 */
	public Adapter createPortElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.DependencyElement <em>Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.DependencyElement
	 * @generated
	 */
	public Adapter createDependencyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.LogicalElement
	 * @generated
	 */
	public Adapter createLogicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e3Value.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e3Value.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //E3ValueAdapterFactory
