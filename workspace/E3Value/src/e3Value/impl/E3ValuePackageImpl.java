/**
 */
package e3Value.impl;

import e3Value.Actor;
import e3Value.AndFork;
import e3Value.AndJoin;
import e3Value.BusinessActor;
import e3Value.CompositeActor;
import e3Value.ConnectionElement;
import e3Value.DependencyElement;
import e3Value.E3ValueDiagram;
import e3Value.E3ValueFactory;
import e3Value.E3ValueModel;
import e3Value.E3ValuePackage;
import e3Value.ElementaryActor;
import e3Value.EndStimulus;
import e3Value.ForkElement;
import e3Value.InputPort;
import e3Value.JoinElement;
import e3Value.LogicalElement;
import e3Value.MarketSegment;
import e3Value.OrFork;
import e3Value.OrJoin;
import e3Value.Orientation;
import e3Value.OutputPort;
import e3Value.PortElement;
import e3Value.Position;
import e3Value.ResponsabilityElement;
import e3Value.StartStimulus;
import e3Value.StimulusElement;
import e3Value.ValueActivity;
import e3Value.ValueExchange;
import e3Value.ValueInterface;
import e3Value.ValueObject;
import e3Value.ValuePort;
import e3Value.ValuePortIn;
import e3Value.ValuePortOut;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class E3ValuePackageImpl extends EPackageImpl implements E3ValuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e3ValueDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e3ValueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePortInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePortOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimulusElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsabilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see e3Value.E3ValuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private E3ValuePackageImpl() {
		super(eNS_URI, E3ValueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link E3ValuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static E3ValuePackage init() {
		if (isInited) return (E3ValuePackage)EPackage.Registry.INSTANCE.getEPackage(E3ValuePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredE3ValuePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		E3ValuePackageImpl theE3ValuePackage = registeredE3ValuePackage instanceof E3ValuePackageImpl ? (E3ValuePackageImpl)registeredE3ValuePackage : new E3ValuePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theE3ValuePackage.createPackageContents();

		// Initialize created meta-data
		theE3ValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theE3ValuePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(E3ValuePackage.eNS_URI, theE3ValuePackage);
		return theE3ValuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeActor() {
		return compositeActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeActor_HasElementaryActors() {
		return (EReference)compositeActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementaryActor() {
		return elementaryActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getE3ValueDiagram() {
		return e3ValueDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE3ValueDiagram_HasE3ValueModels() {
		return (EReference)e3ValueDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getE3ValueModel() {
		return e3ValueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE3ValueModel_HasValueExchanges() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE3ValueModel_E3valueModelhasValueObjects() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE3ValueModel_HasBusinessActors() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getE3ValueModel_HasDependenceElements() {
		return (EReference)e3ValueModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueObject() {
		return valueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueObject_Name() {
		return (EAttribute)valueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueObject_InValueExchange() {
		return (EReference)valueObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueExchange() {
		return valueExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueExchange_TargetValuePort() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueExchange_SourceValuePort() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueExchange_ValueExchangeHasValueObject() {
		return (EReference)valueExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueInterface() {
		return valueInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueInterface_BindsResponsabilityElement() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueInterface_HasValuePortOut() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueInterface_HasValuePortIn() {
		return (EReference)valueInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValuePortIn() {
		return valuePortInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValuePortIn_InConnectWithValueExchange() {
		return (EReference)valuePortInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValuePortIn_PositionValuePort() {
		return (EAttribute)valuePortInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValuePortOut() {
		return valuePortOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValuePortOut_OutConnectWithValueExchange() {
		return (EReference)valuePortOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValuePortOut_PositionValuePort() {
		return (EAttribute)valuePortOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStimulusElement() {
		return stimulusElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartStimulus() {
		return startStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndStimulus() {
		return endStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueActivity() {
		return valueActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueActivity_Name() {
		return (EAttribute)valueActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueActivity_HasStimulusElement() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueActivity_HasDependenceElements() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueActivity_Valueinterfaces() {
		return (EReference)valueActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarketSegment() {
		return marketSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessActor() {
		return businessActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessActor_Name() {
		return (EAttribute)businessActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessActor_HasDependenceElements() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessActor_HasStimulusElement() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessActor_HasValuesInterface() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessActor_BusinessActorsHasValueObjects() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessActor_HasValueActivities() {
		return (EReference)businessActorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValuePort() {
		return valuePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValuePort_Valueexchange() {
		return (EReference)valuePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsabilityElement() {
		return responsabilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndFork() {
		return andForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndJoin() {
		return andJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrFork() {
		return orForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrJoin() {
		return orJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkElement() {
		return forkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForkElement_HasOutputsPort() {
		return (EReference)forkElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForkElement_HasInputPort() {
		return (EReference)forkElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForkElement_PositionFork() {
		return (EAttribute)forkElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoinElement() {
		return joinElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinElement_HasInputsPort() {
		return (EReference)joinElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinElement_HasOutputPort() {
		return (EReference)joinElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJoinElement_PositionJoin() {
		return (EAttribute)joinElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionElement() {
		return connectionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionElement_TargetDependenceElement() {
		return (EReference)connectionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionElement_SourceDependenceElement() {
		return (EReference)connectionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortElement() {
		return portElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortElement_Connectionelement() {
		return (EReference)portElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyElement() {
		return dependencyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalElement() {
		return logicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E3ValueFactory getE3ValueFactory() {
		return (E3ValueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compositeActorEClass = createEClass(COMPOSITE_ACTOR);
		createEReference(compositeActorEClass, COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS);

		elementaryActorEClass = createEClass(ELEMENTARY_ACTOR);

		actorEClass = createEClass(ACTOR);

		e3ValueDiagramEClass = createEClass(E3_VALUE_DIAGRAM);
		createEReference(e3ValueDiagramEClass, E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS);

		e3ValueModelEClass = createEClass(E3_VALUE_MODEL);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_VALUE_EXCHANGES);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__E3VALUE_MODELHAS_VALUE_OBJECTS);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_BUSINESS_ACTORS);
		createEReference(e3ValueModelEClass, E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS);

		valueObjectEClass = createEClass(VALUE_OBJECT);
		createEAttribute(valueObjectEClass, VALUE_OBJECT__NAME);
		createEReference(valueObjectEClass, VALUE_OBJECT__IN_VALUE_EXCHANGE);

		valueExchangeEClass = createEClass(VALUE_EXCHANGE);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__TARGET_VALUE_PORT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__SOURCE_VALUE_PORT);
		createEReference(valueExchangeEClass, VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT);

		valueInterfaceEClass = createEClass(VALUE_INTERFACE);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__HAS_VALUE_PORT_OUT);
		createEReference(valueInterfaceEClass, VALUE_INTERFACE__HAS_VALUE_PORT_IN);

		valuePortInEClass = createEClass(VALUE_PORT_IN);
		createEReference(valuePortInEClass, VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE);
		createEAttribute(valuePortInEClass, VALUE_PORT_IN__POSITION_VALUE_PORT);

		valuePortOutEClass = createEClass(VALUE_PORT_OUT);
		createEReference(valuePortOutEClass, VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE);
		createEAttribute(valuePortOutEClass, VALUE_PORT_OUT__POSITION_VALUE_PORT);

		stimulusElementEClass = createEClass(STIMULUS_ELEMENT);

		startStimulusEClass = createEClass(START_STIMULUS);

		endStimulusEClass = createEClass(END_STIMULUS);

		valueActivityEClass = createEClass(VALUE_ACTIVITY);
		createEAttribute(valueActivityEClass, VALUE_ACTIVITY__NAME);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS);
		createEReference(valueActivityEClass, VALUE_ACTIVITY__VALUEINTERFACES);

		marketSegmentEClass = createEClass(MARKET_SEGMENT);

		businessActorEClass = createEClass(BUSINESS_ACTOR);
		createEAttribute(businessActorEClass, BUSINESS_ACTOR__NAME);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_VALUES_INTERFACE);
		createEReference(businessActorEClass, BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS);
		createEReference(businessActorEClass, BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES);

		valuePortEClass = createEClass(VALUE_PORT);
		createEReference(valuePortEClass, VALUE_PORT__VALUEEXCHANGE);

		responsabilityElementEClass = createEClass(RESPONSABILITY_ELEMENT);

		andForkEClass = createEClass(AND_FORK);

		andJoinEClass = createEClass(AND_JOIN);

		orForkEClass = createEClass(OR_FORK);

		orJoinEClass = createEClass(OR_JOIN);

		forkElementEClass = createEClass(FORK_ELEMENT);
		createEReference(forkElementEClass, FORK_ELEMENT__HAS_OUTPUTS_PORT);
		createEReference(forkElementEClass, FORK_ELEMENT__HAS_INPUT_PORT);
		createEAttribute(forkElementEClass, FORK_ELEMENT__POSITION_FORK);

		joinElementEClass = createEClass(JOIN_ELEMENT);
		createEReference(joinElementEClass, JOIN_ELEMENT__HAS_INPUTS_PORT);
		createEReference(joinElementEClass, JOIN_ELEMENT__HAS_OUTPUT_PORT);
		createEAttribute(joinElementEClass, JOIN_ELEMENT__POSITION_JOIN);

		connectionElementEClass = createEClass(CONNECTION_ELEMENT);
		createEReference(connectionElementEClass, CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT);
		createEReference(connectionElementEClass, CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT);

		portElementEClass = createEClass(PORT_ELEMENT);
		createEReference(portElementEClass, PORT_ELEMENT__CONNECTIONELEMENT);

		dependencyElementEClass = createEClass(DEPENDENCY_ELEMENT);

		logicalElementEClass = createEClass(LOGICAL_ELEMENT);

		outputPortEClass = createEClass(OUTPUT_PORT);

		inputPortEClass = createEClass(INPUT_PORT);

		// Create enums
		positionEEnum = createEEnum(POSITION);
		orientationEEnum = createEEnum(ORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeActorEClass.getESuperTypes().add(this.getActor());
		elementaryActorEClass.getESuperTypes().add(this.getActor());
		actorEClass.getESuperTypes().add(this.getBusinessActor());
		valuePortInEClass.getESuperTypes().add(this.getValuePort());
		valuePortOutEClass.getESuperTypes().add(this.getValuePort());
		stimulusElementEClass.getESuperTypes().add(this.getPortElement());
		stimulusElementEClass.getESuperTypes().add(this.getDependencyElement());
		startStimulusEClass.getESuperTypes().add(this.getStimulusElement());
		endStimulusEClass.getESuperTypes().add(this.getStimulusElement());
		marketSegmentEClass.getESuperTypes().add(this.getBusinessActor());
		responsabilityElementEClass.getESuperTypes().add(this.getPortElement());
		andForkEClass.getESuperTypes().add(this.getForkElement());
		andJoinEClass.getESuperTypes().add(this.getJoinElement());
		orForkEClass.getESuperTypes().add(this.getForkElement());
		orJoinEClass.getESuperTypes().add(this.getJoinElement());
		forkElementEClass.getESuperTypes().add(this.getLogicalElement());
		joinElementEClass.getESuperTypes().add(this.getLogicalElement());
		connectionElementEClass.getESuperTypes().add(this.getDependencyElement());
		portElementEClass.getESuperTypes().add(this.getDependencyElement());
		logicalElementEClass.getESuperTypes().add(this.getDependencyElement());
		outputPortEClass.getESuperTypes().add(this.getPortElement());
		inputPortEClass.getESuperTypes().add(this.getPortElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(compositeActorEClass, CompositeActor.class, "CompositeActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeActor_HasElementaryActors(), this.getElementaryActor(), null, "hasElementaryActors", null, 0, -1, CompositeActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryActorEClass, ElementaryActor.class, "ElementaryActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(e3ValueDiagramEClass, E3ValueDiagram.class, "E3ValueDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE3ValueDiagram_HasE3ValueModels(), this.getE3ValueModel(), null, "hasE3ValueModels", null, 0, -1, E3ValueDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(e3ValueModelEClass, E3ValueModel.class, "E3ValueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE3ValueModel_HasValueExchanges(), this.getValueExchange(), null, "hasValueExchanges", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_E3valueModelhasValueObjects(), this.getValueObject(), null, "E3valueModelhasValueObjects", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_HasBusinessActors(), this.getBusinessActor(), null, "hasBusinessActors", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE3ValueModel_HasDependenceElements(), this.getDependencyElement(), null, "hasDependenceElements", null, 0, -1, E3ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueObjectEClass, ValueObject.class, "ValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueObject_InValueExchange(), this.getValueExchange(), null, "inValueExchange", null, 1, 1, ValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExchangeEClass, ValueExchange.class, "ValueExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueExchange_TargetValuePort(), this.getValuePort(), null, "targetValuePort", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_SourceValuePort(), this.getValuePort(), null, "sourceValuePort", null, 0, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueExchange_ValueExchangeHasValueObject(), this.getValueObject(), null, "valueExchangeHasValueObject", null, 1, 1, ValueExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueInterfaceEClass, ValueInterface.class, "ValueInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueInterface_BindsResponsabilityElement(), this.getResponsabilityElement(), null, "bindsResponsabilityElement", null, 1, 1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInterface_HasValuePortOut(), this.getValuePortOut(), null, "hasValuePortOut", null, 1, -1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueInterface_HasValuePortIn(), this.getValuePortIn(), null, "hasValuePortIn", null, 1, -1, ValueInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePortInEClass, ValuePortIn.class, "ValuePortIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePortIn_InConnectWithValueExchange(), this.getValueExchange(), null, "inConnectWithValueExchange", null, 0, 1, ValuePortIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuePortIn_PositionValuePort(), this.getPosition(), "positionValuePort", null, 0, 1, ValuePortIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePortOutEClass, ValuePortOut.class, "ValuePortOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePortOut_OutConnectWithValueExchange(), this.getValueExchange(), null, "outConnectWithValueExchange", null, 0, 1, ValuePortOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuePortOut_PositionValuePort(), this.getPosition(), "positionValuePort", null, 0, 1, ValuePortOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusElementEClass, StimulusElement.class, "StimulusElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startStimulusEClass, StartStimulus.class, "StartStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endStimulusEClass, EndStimulus.class, "EndStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueActivityEClass, ValueActivity.class, "ValueActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_HasStimulusElement(), this.getStimulusElement(), null, "hasStimulusElement", null, 0, -1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_HasDependenceElements(), this.getDependencyElement(), null, "hasDependenceElements", null, 0, -1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueActivity_Valueinterfaces(), this.getValueInterface(), null, "valueinterfaces", null, 0, -1, ValueActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marketSegmentEClass, MarketSegment.class, "MarketSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessActorEClass, BusinessActor.class, "BusinessActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasDependenceElements(), this.getDependencyElement(), null, "hasDependenceElements", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasStimulusElement(), this.getStimulusElement(), null, "hasStimulusElement", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasValuesInterface(), this.getValueInterface(), null, "hasValuesInterface", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_BusinessActorsHasValueObjects(), this.getValueObject(), null, "businessActorsHasValueObjects", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessActor_HasValueActivities(), this.getValueActivity(), null, "hasValueActivities", null, 0, -1, BusinessActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePortEClass, ValuePort.class, "ValuePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePort_Valueexchange(), this.getValueExchange(), null, "valueexchange", null, 0, -1, ValuePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsabilityElementEClass, ResponsabilityElement.class, "ResponsabilityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andForkEClass, AndFork.class, "AndFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andJoinEClass, AndJoin.class, "AndJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orForkEClass, OrFork.class, "OrFork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orJoinEClass, OrJoin.class, "OrJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkElementEClass, ForkElement.class, "ForkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkElement_HasOutputsPort(), this.getOutputPort(), null, "hasOutputsPort", null, 0, -1, ForkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkElement_HasInputPort(), this.getInputPort(), null, "hasInputPort", null, 0, 1, ForkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkElement_PositionFork(), this.getPosition(), "positionFork", null, 0, 1, ForkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinElementEClass, JoinElement.class, "JoinElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinElement_HasInputsPort(), this.getInputPort(), null, "hasInputsPort", null, 0, -1, JoinElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinElement_HasOutputPort(), this.getOutputPort(), null, "hasOutputPort", null, 0, 1, JoinElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinElement_PositionJoin(), this.getOrientation(), "positionJoin", null, 0, 1, JoinElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionElementEClass, ConnectionElement.class, "ConnectionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionElement_TargetDependenceElement(), this.getPortElement(), null, "targetDependenceElement", null, 1, 1, ConnectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionElement_SourceDependenceElement(), this.getPortElement(), null, "sourceDependenceElement", null, 1, 1, ConnectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portElementEClass, PortElement.class, "PortElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortElement_Connectionelement(), this.getConnectionElement(), null, "connectionelement", null, 0, -1, PortElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyElementEClass, DependencyElement.class, "DependencyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalElementEClass, LogicalElement.class, "LogicalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.NORTH);
		addEEnumLiteral(positionEEnum, Position.SOUTH);
		addEEnumLiteral(positionEEnum, Position.EAST);
		addEEnumLiteral(positionEEnum, Position.WEST);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);

		// Create resource
		createResource(eNS_URI);
	}

} //E3ValuePackageImpl
