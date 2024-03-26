/**
 */
package e3Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see e3Value.E3ValueFactory
 * @model kind="package"
 * @generated
 */
public interface E3ValuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "e3Value";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/e3Value";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "e3Value";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	E3ValuePackage eINSTANCE = e3Value.impl.E3ValuePackageImpl.init();

	/**
	 * The meta object id for the '{@link e3Value.impl.BusinessActorImpl <em>Business Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.BusinessActorImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getBusinessActor()
	 * @generated
	 */
	int BUSINESS_ACTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Has Values Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_VALUES_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS = 4;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES = 5;

	/**
	 * The number of structural features of the '<em>Business Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Business Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ActorImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = BUSINESS_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_DEPENDENCE_ELEMENTS = BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_STIMULUS_ELEMENT = BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Has Values Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_VALUES_INTERFACE = BUSINESS_ACTOR__HAS_VALUES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS = BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_VALUE_ACTIVITIES = BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = BUSINESS_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = BUSINESS_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.CompositeActorImpl <em>Composite Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.CompositeActorImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getCompositeActor()
	 * @generated
	 */
	int COMPOSITE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_DEPENDENCE_ELEMENTS = ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_STIMULUS_ELEMENT = ACTOR__HAS_STIMULUS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Has Values Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_VALUES_INTERFACE = ACTOR__HAS_VALUES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS = ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_VALUE_ACTIVITIES = ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Has Elementary Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ElementaryActorImpl <em>Elementary Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ElementaryActorImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getElementaryActor()
	 * @generated
	 */
	int ELEMENTARY_ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_DEPENDENCE_ELEMENTS = ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_STIMULUS_ELEMENT = ACTOR__HAS_STIMULUS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Has Values Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_VALUES_INTERFACE = ACTOR__HAS_VALUES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS = ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR__HAS_VALUE_ACTIVITIES = ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Elementary Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elementary Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_ACTOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.E3ValueDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.E3ValueDiagramImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getE3ValueDiagram()
	 * @generated
	 */
	int E3_VALUE_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Has E3 Value Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.E3ValueModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.E3ValueModelImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getE3ValueModel()
	 * @generated
	 */
	int E3_VALUE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Has Value Exchanges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_VALUE_EXCHANGES = 0;

	/**
	 * The feature id for the '<em><b>E3value Modelhas Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__E3VALUE_MODELHAS_VALUE_OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Has Business Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_BUSINESS_ACTORS = 2;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E3_VALUE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValueObjectImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__IN_VALUE_EXCHANGE = 1;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValueExchangeImpl <em>Value Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValueExchangeImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValueExchange()
	 * @generated
	 */
	int VALUE_EXCHANGE = 6;

	/**
	 * The feature id for the '<em><b>Target Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__TARGET_VALUE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Source Value Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__SOURCE_VALUE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Value Exchange Has Value Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Value Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValueInterfaceImpl <em>Value Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValueInterfaceImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValueInterface()
	 * @generated
	 */
	int VALUE_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Binds Responsability Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Value Port Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__HAS_VALUE_PORT_OUT = 1;

	/**
	 * The feature id for the '<em><b>Has Value Port In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE__HAS_VALUE_PORT_IN = 2;

	/**
	 * The number of structural features of the '<em>Value Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValuePortImpl <em>Value Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValuePortImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValuePort()
	 * @generated
	 */
	int VALUE_PORT = 16;

	/**
	 * The feature id for the '<em><b>Valueexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT__VALUEEXCHANGE = 0;

	/**
	 * The number of structural features of the '<em>Value Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValuePortInImpl <em>Value Port In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValuePortInImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValuePortIn()
	 * @generated
	 */
	int VALUE_PORT_IN = 8;

	/**
	 * The feature id for the '<em><b>Valueexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN__VALUEEXCHANGE = VALUE_PORT__VALUEEXCHANGE;

	/**
	 * The feature id for the '<em><b>In Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE = VALUE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position Value Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN__POSITION_VALUE_PORT = VALUE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN_FEATURE_COUNT = VALUE_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_IN_OPERATION_COUNT = VALUE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValuePortOutImpl <em>Value Port Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValuePortOutImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValuePortOut()
	 * @generated
	 */
	int VALUE_PORT_OUT = 9;

	/**
	 * The feature id for the '<em><b>Valueexchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT__VALUEEXCHANGE = VALUE_PORT__VALUEEXCHANGE;

	/**
	 * The feature id for the '<em><b>Out Connect With Value Exchange</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE = VALUE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position Value Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT__POSITION_VALUE_PORT = VALUE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT_FEATURE_COUNT = VALUE_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PORT_OUT_OPERATION_COUNT = VALUE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.DependencyElementImpl <em>Dependency Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.DependencyElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getDependencyElement()
	 * @generated
	 */
	int DEPENDENCY_ELEMENT = 26;

	/**
	 * The number of structural features of the '<em>Dependency Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.PortElementImpl <em>Port Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.PortElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getPortElement()
	 * @generated
	 */
	int PORT_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT__CONNECTIONELEMENT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.StimulusElementImpl <em>Stimulus Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.StimulusElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getStimulusElement()
	 * @generated
	 */
	int STIMULUS_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT__CONNECTIONELEMENT = PORT_ELEMENT__CONNECTIONELEMENT;

	/**
	 * The number of structural features of the '<em>Stimulus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stimulus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_ELEMENT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.StartStimulusImpl <em>Start Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.StartStimulusImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getStartStimulus()
	 * @generated
	 */
	int START_STIMULUS = 11;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS__CONNECTIONELEMENT = STIMULUS_ELEMENT__CONNECTIONELEMENT;

	/**
	 * The number of structural features of the '<em>Start Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS_FEATURE_COUNT = STIMULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_STIMULUS_OPERATION_COUNT = STIMULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.EndStimulusImpl <em>End Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.EndStimulusImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getEndStimulus()
	 * @generated
	 */
	int END_STIMULUS = 12;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS__CONNECTIONELEMENT = STIMULUS_ELEMENT__CONNECTIONELEMENT;

	/**
	 * The number of structural features of the '<em>End Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS_FEATURE_COUNT = STIMULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STIMULUS_OPERATION_COUNT = STIMULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ValueActivityImpl <em>Value Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ValueActivityImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getValueActivity()
	 * @generated
	 */
	int VALUE_ACTIVITY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Valueinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY__VALUEINTERFACES = 3;

	/**
	 * The number of structural features of the '<em>Value Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Value Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.MarketSegmentImpl <em>Market Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.MarketSegmentImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getMarketSegment()
	 * @generated
	 */
	int MARKET_SEGMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__NAME = BUSINESS_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_DEPENDENCE_ELEMENTS = BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Has Stimulus Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_STIMULUS_ELEMENT = BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Has Values Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_VALUES_INTERFACE = BUSINESS_ACTOR__HAS_VALUES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__BUSINESS_ACTORS_HAS_VALUE_OBJECTS = BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS;

	/**
	 * The feature id for the '<em><b>Has Value Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT__HAS_VALUE_ACTIVITIES = BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Market Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT_FEATURE_COUNT = BUSINESS_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Market Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_SEGMENT_OPERATION_COUNT = BUSINESS_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ResponsabilityElementImpl <em>Responsability Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ResponsabilityElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getResponsabilityElement()
	 * @generated
	 */
	int RESPONSABILITY_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT__CONNECTIONELEMENT = PORT_ELEMENT__CONNECTIONELEMENT;

	/**
	 * The number of structural features of the '<em>Responsability Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsability Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABILITY_ELEMENT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.LogicalElementImpl <em>Logical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.LogicalElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getLogicalElement()
	 * @generated
	 */
	int LOGICAL_ELEMENT = 27;

	/**
	 * The number of structural features of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ForkElementImpl <em>Fork Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ForkElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getForkElement()
	 * @generated
	 */
	int FORK_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Has Outputs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__HAS_OUTPUTS_PORT = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__HAS_INPUT_PORT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT__POSITION_FORK = LOGICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fork Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fork Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ELEMENT_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.AndForkImpl <em>And Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.AndForkImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getAndFork()
	 * @generated
	 */
	int AND_FORK = 18;

	/**
	 * The feature id for the '<em><b>Has Outputs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__HAS_OUTPUTS_PORT = FORK_ELEMENT__HAS_OUTPUTS_PORT;

	/**
	 * The feature id for the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__HAS_INPUT_PORT = FORK_ELEMENT__HAS_INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Position Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__POSITION_FORK = FORK_ELEMENT__POSITION_FORK;

	/**
	 * The number of structural features of the '<em>And Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK_FEATURE_COUNT = FORK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK_OPERATION_COUNT = FORK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.JoinElementImpl <em>Join Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.JoinElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getJoinElement()
	 * @generated
	 */
	int JOIN_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Has Inputs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__HAS_INPUTS_PORT = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__HAS_OUTPUT_PORT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT__POSITION_JOIN = LOGICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Join Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Join Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ELEMENT_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.AndJoinImpl <em>And Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.AndJoinImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getAndJoin()
	 * @generated
	 */
	int AND_JOIN = 19;

	/**
	 * The feature id for the '<em><b>Has Inputs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__HAS_INPUTS_PORT = JOIN_ELEMENT__HAS_INPUTS_PORT;

	/**
	 * The feature id for the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__HAS_OUTPUT_PORT = JOIN_ELEMENT__HAS_OUTPUT_PORT;

	/**
	 * The feature id for the '<em><b>Position Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__POSITION_JOIN = JOIN_ELEMENT__POSITION_JOIN;

	/**
	 * The number of structural features of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_FEATURE_COUNT = JOIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_OPERATION_COUNT = JOIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.OrForkImpl <em>Or Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.OrForkImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getOrFork()
	 * @generated
	 */
	int OR_FORK = 20;

	/**
	 * The feature id for the '<em><b>Has Outputs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__HAS_OUTPUTS_PORT = FORK_ELEMENT__HAS_OUTPUTS_PORT;

	/**
	 * The feature id for the '<em><b>Has Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__HAS_INPUT_PORT = FORK_ELEMENT__HAS_INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Position Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__POSITION_FORK = FORK_ELEMENT__POSITION_FORK;

	/**
	 * The number of structural features of the '<em>Or Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK_FEATURE_COUNT = FORK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK_OPERATION_COUNT = FORK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.OrJoinImpl <em>Or Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.OrJoinImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getOrJoin()
	 * @generated
	 */
	int OR_JOIN = 21;

	/**
	 * The feature id for the '<em><b>Has Inputs Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__HAS_INPUTS_PORT = JOIN_ELEMENT__HAS_INPUTS_PORT;

	/**
	 * The feature id for the '<em><b>Has Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__HAS_OUTPUT_PORT = JOIN_ELEMENT__HAS_OUTPUT_PORT;

	/**
	 * The feature id for the '<em><b>Position Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__POSITION_JOIN = JOIN_ELEMENT__POSITION_JOIN;

	/**
	 * The number of structural features of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_FEATURE_COUNT = JOIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_OPERATION_COUNT = JOIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.ConnectionElementImpl <em>Connection Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.ConnectionElementImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getConnectionElement()
	 * @generated
	 */
	int CONNECTION_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Target Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Dependence Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT_FEATURE_COUNT = DEPENDENCY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ELEMENT_OPERATION_COUNT = DEPENDENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.OutputPortImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 28;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CONNECTIONELEMENT = PORT_ELEMENT__CONNECTIONELEMENT;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.impl.InputPortImpl
	 * @see e3Value.impl.E3ValuePackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 29;

	/**
	 * The feature id for the '<em><b>Connectionelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CONNECTIONELEMENT = PORT_ELEMENT__CONNECTIONELEMENT;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e3Value.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.Position
	 * @see e3Value.impl.E3ValuePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 30;

	/**
	 * The meta object id for the '{@link e3Value.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e3Value.Orientation
	 * @see e3Value.impl.E3ValuePackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 31;


	/**
	 * Returns the meta object for class '{@link e3Value.CompositeActor <em>Composite Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Actor</em>'.
	 * @see e3Value.CompositeActor
	 * @generated
	 */
	EClass getCompositeActor();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.CompositeActor#getHasElementaryActors <em>Has Elementary Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Elementary Actors</em>'.
	 * @see e3Value.CompositeActor#getHasElementaryActors()
	 * @see #getCompositeActor()
	 * @generated
	 */
	EReference getCompositeActor_HasElementaryActors();

	/**
	 * Returns the meta object for class '{@link e3Value.ElementaryActor <em>Elementary Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Actor</em>'.
	 * @see e3Value.ElementaryActor
	 * @generated
	 */
	EClass getElementaryActor();

	/**
	 * Returns the meta object for class '{@link e3Value.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see e3Value.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link e3Value.E3ValueDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see e3Value.E3ValueDiagram
	 * @generated
	 */
	EClass getE3ValueDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.E3ValueDiagram#getHasE3ValueModels <em>Has E3 Value Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has E3 Value Models</em>'.
	 * @see e3Value.E3ValueDiagram#getHasE3ValueModels()
	 * @see #getE3ValueDiagram()
	 * @generated
	 */
	EReference getE3ValueDiagram_HasE3ValueModels();

	/**
	 * Returns the meta object for class '{@link e3Value.E3ValueModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see e3Value.E3ValueModel
	 * @generated
	 */
	EClass getE3ValueModel();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.E3ValueModel#getHasValueExchanges <em>Has Value Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Exchanges</em>'.
	 * @see e3Value.E3ValueModel#getHasValueExchanges()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasValueExchanges();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.E3ValueModel#getE3valueModelhasValueObjects <em>E3value Modelhas Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>E3value Modelhas Value Objects</em>'.
	 * @see e3Value.E3ValueModel#getE3valueModelhasValueObjects()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_E3valueModelhasValueObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.E3ValueModel#getHasBusinessActors <em>Has Business Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Business Actors</em>'.
	 * @see e3Value.E3ValueModel#getHasBusinessActors()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasBusinessActors();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.E3ValueModel#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependence Elements</em>'.
	 * @see e3Value.E3ValueModel#getHasDependenceElements()
	 * @see #getE3ValueModel()
	 * @generated
	 */
	EReference getE3ValueModel_HasDependenceElements();

	/**
	 * Returns the meta object for class '{@link e3Value.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see e3Value.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.ValueObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see e3Value.ValueObject#getName()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Name();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ValueObject#getInValueExchange <em>In Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Value Exchange</em>'.
	 * @see e3Value.ValueObject#getInValueExchange()
	 * @see #getValueObject()
	 * @generated
	 */
	EReference getValueObject_InValueExchange();

	/**
	 * Returns the meta object for class '{@link e3Value.ValueExchange <em>Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Exchange</em>'.
	 * @see e3Value.ValueExchange
	 * @generated
	 */
	EClass getValueExchange();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ValueExchange#getTargetValuePort <em>Target Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value Port</em>'.
	 * @see e3Value.ValueExchange#getTargetValuePort()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_TargetValuePort();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ValueExchange#getSourceValuePort <em>Source Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Value Port</em>'.
	 * @see e3Value.ValueExchange#getSourceValuePort()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_SourceValuePort();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ValueExchange#getValueExchangeHasValueObject <em>Value Exchange Has Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Exchange Has Value Object</em>'.
	 * @see e3Value.ValueExchange#getValueExchangeHasValueObject()
	 * @see #getValueExchange()
	 * @generated
	 */
	EReference getValueExchange_ValueExchangeHasValueObject();

	/**
	 * Returns the meta object for class '{@link e3Value.ValueInterface <em>Value Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Interface</em>'.
	 * @see e3Value.ValueInterface
	 * @generated
	 */
	EClass getValueInterface();

	/**
	 * Returns the meta object for the containment reference '{@link e3Value.ValueInterface#getBindsResponsabilityElement <em>Binds Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binds Responsability Element</em>'.
	 * @see e3Value.ValueInterface#getBindsResponsabilityElement()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_BindsResponsabilityElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.ValueInterface#getHasValuePortOut <em>Has Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Port Out</em>'.
	 * @see e3Value.ValueInterface#getHasValuePortOut()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_HasValuePortOut();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.ValueInterface#getHasValuePortIn <em>Has Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Port In</em>'.
	 * @see e3Value.ValueInterface#getHasValuePortIn()
	 * @see #getValueInterface()
	 * @generated
	 */
	EReference getValueInterface_HasValuePortIn();

	/**
	 * Returns the meta object for class '{@link e3Value.ValuePortIn <em>Value Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Port In</em>'.
	 * @see e3Value.ValuePortIn
	 * @generated
	 */
	EClass getValuePortIn();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ValuePortIn#getInConnectWithValueExchange <em>In Connect With Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Connect With Value Exchange</em>'.
	 * @see e3Value.ValuePortIn#getInConnectWithValueExchange()
	 * @see #getValuePortIn()
	 * @generated
	 */
	EReference getValuePortIn_InConnectWithValueExchange();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.ValuePortIn#getPositionValuePort <em>Position Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Value Port</em>'.
	 * @see e3Value.ValuePortIn#getPositionValuePort()
	 * @see #getValuePortIn()
	 * @generated
	 */
	EAttribute getValuePortIn_PositionValuePort();

	/**
	 * Returns the meta object for class '{@link e3Value.ValuePortOut <em>Value Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Port Out</em>'.
	 * @see e3Value.ValuePortOut
	 * @generated
	 */
	EClass getValuePortOut();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ValuePortOut#getOutConnectWithValueExchange <em>Out Connect With Value Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Connect With Value Exchange</em>'.
	 * @see e3Value.ValuePortOut#getOutConnectWithValueExchange()
	 * @see #getValuePortOut()
	 * @generated
	 */
	EReference getValuePortOut_OutConnectWithValueExchange();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.ValuePortOut#getPositionValuePort <em>Position Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Value Port</em>'.
	 * @see e3Value.ValuePortOut#getPositionValuePort()
	 * @see #getValuePortOut()
	 * @generated
	 */
	EAttribute getValuePortOut_PositionValuePort();

	/**
	 * Returns the meta object for class '{@link e3Value.StimulusElement <em>Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Element</em>'.
	 * @see e3Value.StimulusElement
	 * @generated
	 */
	EClass getStimulusElement();

	/**
	 * Returns the meta object for class '{@link e3Value.StartStimulus <em>Start Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Stimulus</em>'.
	 * @see e3Value.StartStimulus
	 * @generated
	 */
	EClass getStartStimulus();

	/**
	 * Returns the meta object for class '{@link e3Value.EndStimulus <em>End Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Stimulus</em>'.
	 * @see e3Value.EndStimulus
	 * @generated
	 */
	EClass getEndStimulus();

	/**
	 * Returns the meta object for class '{@link e3Value.ValueActivity <em>Value Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Activity</em>'.
	 * @see e3Value.ValueActivity
	 * @generated
	 */
	EClass getValueActivity();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.ValueActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see e3Value.ValueActivity#getName()
	 * @see #getValueActivity()
	 * @generated
	 */
	EAttribute getValueActivity_Name();

	/**
	 * Returns the meta object for the reference list '{@link e3Value.ValueActivity#getHasStimulusElement <em>Has Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Stimulus Element</em>'.
	 * @see e3Value.ValueActivity#getHasStimulusElement()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_HasStimulusElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.ValueActivity#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependence Elements</em>'.
	 * @see e3Value.ValueActivity#getHasDependenceElements()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_HasDependenceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.ValueActivity#getValueinterfaces <em>Valueinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueinterfaces</em>'.
	 * @see e3Value.ValueActivity#getValueinterfaces()
	 * @see #getValueActivity()
	 * @generated
	 */
	EReference getValueActivity_Valueinterfaces();

	/**
	 * Returns the meta object for class '{@link e3Value.MarketSegment <em>Market Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Segment</em>'.
	 * @see e3Value.MarketSegment
	 * @generated
	 */
	EClass getMarketSegment();

	/**
	 * Returns the meta object for class '{@link e3Value.BusinessActor <em>Business Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Actor</em>'.
	 * @see e3Value.BusinessActor
	 * @generated
	 */
	EClass getBusinessActor();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.BusinessActor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see e3Value.BusinessActor#getName()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EAttribute getBusinessActor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.BusinessActor#getHasDependenceElements <em>Has Dependence Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependence Elements</em>'.
	 * @see e3Value.BusinessActor#getHasDependenceElements()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasDependenceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.BusinessActor#getHasStimulusElement <em>Has Stimulus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Stimulus Element</em>'.
	 * @see e3Value.BusinessActor#getHasStimulusElement()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasStimulusElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.BusinessActor#getHasValuesInterface <em>Has Values Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Values Interface</em>'.
	 * @see e3Value.BusinessActor#getHasValuesInterface()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasValuesInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.BusinessActor#getBusinessActorsHasValueObjects <em>Business Actors Has Value Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Actors Has Value Objects</em>'.
	 * @see e3Value.BusinessActor#getBusinessActorsHasValueObjects()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_BusinessActorsHasValueObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.BusinessActor#getHasValueActivities <em>Has Value Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Value Activities</em>'.
	 * @see e3Value.BusinessActor#getHasValueActivities()
	 * @see #getBusinessActor()
	 * @generated
	 */
	EReference getBusinessActor_HasValueActivities();

	/**
	 * Returns the meta object for class '{@link e3Value.ValuePort <em>Value Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Port</em>'.
	 * @see e3Value.ValuePort
	 * @generated
	 */
	EClass getValuePort();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.ValuePort#getValueexchange <em>Valueexchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueexchange</em>'.
	 * @see e3Value.ValuePort#getValueexchange()
	 * @see #getValuePort()
	 * @generated
	 */
	EReference getValuePort_Valueexchange();

	/**
	 * Returns the meta object for class '{@link e3Value.ResponsabilityElement <em>Responsability Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsability Element</em>'.
	 * @see e3Value.ResponsabilityElement
	 * @generated
	 */
	EClass getResponsabilityElement();

	/**
	 * Returns the meta object for class '{@link e3Value.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Fork</em>'.
	 * @see e3Value.AndFork
	 * @generated
	 */
	EClass getAndFork();

	/**
	 * Returns the meta object for class '{@link e3Value.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join</em>'.
	 * @see e3Value.AndJoin
	 * @generated
	 */
	EClass getAndJoin();

	/**
	 * Returns the meta object for class '{@link e3Value.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Fork</em>'.
	 * @see e3Value.OrFork
	 * @generated
	 */
	EClass getOrFork();

	/**
	 * Returns the meta object for class '{@link e3Value.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Join</em>'.
	 * @see e3Value.OrJoin
	 * @generated
	 */
	EClass getOrJoin();

	/**
	 * Returns the meta object for class '{@link e3Value.ForkElement <em>Fork Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Element</em>'.
	 * @see e3Value.ForkElement
	 * @generated
	 */
	EClass getForkElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.ForkElement#getHasOutputsPort <em>Has Outputs Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Outputs Port</em>'.
	 * @see e3Value.ForkElement#getHasOutputsPort()
	 * @see #getForkElement()
	 * @generated
	 */
	EReference getForkElement_HasOutputsPort();

	/**
	 * Returns the meta object for the containment reference '{@link e3Value.ForkElement#getHasInputPort <em>Has Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Input Port</em>'.
	 * @see e3Value.ForkElement#getHasInputPort()
	 * @see #getForkElement()
	 * @generated
	 */
	EReference getForkElement_HasInputPort();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.ForkElement#getPositionFork <em>Position Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Fork</em>'.
	 * @see e3Value.ForkElement#getPositionFork()
	 * @see #getForkElement()
	 * @generated
	 */
	EAttribute getForkElement_PositionFork();

	/**
	 * Returns the meta object for class '{@link e3Value.JoinElement <em>Join Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Element</em>'.
	 * @see e3Value.JoinElement
	 * @generated
	 */
	EClass getJoinElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.JoinElement#getHasInputsPort <em>Has Inputs Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Inputs Port</em>'.
	 * @see e3Value.JoinElement#getHasInputsPort()
	 * @see #getJoinElement()
	 * @generated
	 */
	EReference getJoinElement_HasInputsPort();

	/**
	 * Returns the meta object for the containment reference '{@link e3Value.JoinElement#getHasOutputPort <em>Has Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Output Port</em>'.
	 * @see e3Value.JoinElement#getHasOutputPort()
	 * @see #getJoinElement()
	 * @generated
	 */
	EReference getJoinElement_HasOutputPort();

	/**
	 * Returns the meta object for the attribute '{@link e3Value.JoinElement#getPositionJoin <em>Position Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Join</em>'.
	 * @see e3Value.JoinElement#getPositionJoin()
	 * @see #getJoinElement()
	 * @generated
	 */
	EAttribute getJoinElement_PositionJoin();

	/**
	 * Returns the meta object for class '{@link e3Value.ConnectionElement <em>Connection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Element</em>'.
	 * @see e3Value.ConnectionElement
	 * @generated
	 */
	EClass getConnectionElement();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ConnectionElement#getTargetDependenceElement <em>Target Dependence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Dependence Element</em>'.
	 * @see e3Value.ConnectionElement#getTargetDependenceElement()
	 * @see #getConnectionElement()
	 * @generated
	 */
	EReference getConnectionElement_TargetDependenceElement();

	/**
	 * Returns the meta object for the reference '{@link e3Value.ConnectionElement#getSourceDependenceElement <em>Source Dependence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Dependence Element</em>'.
	 * @see e3Value.ConnectionElement#getSourceDependenceElement()
	 * @see #getConnectionElement()
	 * @generated
	 */
	EReference getConnectionElement_SourceDependenceElement();

	/**
	 * Returns the meta object for class '{@link e3Value.PortElement <em>Port Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Element</em>'.
	 * @see e3Value.PortElement
	 * @generated
	 */
	EClass getPortElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e3Value.PortElement#getConnectionelement <em>Connectionelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectionelement</em>'.
	 * @see e3Value.PortElement#getConnectionelement()
	 * @see #getPortElement()
	 * @generated
	 */
	EReference getPortElement_Connectionelement();

	/**
	 * Returns the meta object for class '{@link e3Value.DependencyElement <em>Dependency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Element</em>'.
	 * @see e3Value.DependencyElement
	 * @generated
	 */
	EClass getDependencyElement();

	/**
	 * Returns the meta object for class '{@link e3Value.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Element</em>'.
	 * @see e3Value.LogicalElement
	 * @generated
	 */
	EClass getLogicalElement();

	/**
	 * Returns the meta object for class '{@link e3Value.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see e3Value.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link e3Value.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see e3Value.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for enum '{@link e3Value.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see e3Value.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link e3Value.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see e3Value.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	E3ValueFactory getE3ValueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link e3Value.impl.CompositeActorImpl <em>Composite Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.CompositeActorImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getCompositeActor()
		 * @generated
		 */
		EClass COMPOSITE_ACTOR = eINSTANCE.getCompositeActor();

		/**
		 * The meta object literal for the '<em><b>Has Elementary Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ACTOR__HAS_ELEMENTARY_ACTORS = eINSTANCE.getCompositeActor_HasElementaryActors();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ElementaryActorImpl <em>Elementary Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ElementaryActorImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getElementaryActor()
		 * @generated
		 */
		EClass ELEMENTARY_ACTOR = eINSTANCE.getElementaryActor();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ActorImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link e3Value.impl.E3ValueDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.E3ValueDiagramImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getE3ValueDiagram()
		 * @generated
		 */
		EClass E3_VALUE_DIAGRAM = eINSTANCE.getE3ValueDiagram();

		/**
		 * The meta object literal for the '<em><b>Has E3 Value Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_DIAGRAM__HAS_E3_VALUE_MODELS = eINSTANCE.getE3ValueDiagram_HasE3ValueModels();

		/**
		 * The meta object literal for the '{@link e3Value.impl.E3ValueModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.E3ValueModelImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getE3ValueModel()
		 * @generated
		 */
		EClass E3_VALUE_MODEL = eINSTANCE.getE3ValueModel();

		/**
		 * The meta object literal for the '<em><b>Has Value Exchanges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_VALUE_EXCHANGES = eINSTANCE.getE3ValueModel_HasValueExchanges();

		/**
		 * The meta object literal for the '<em><b>E3value Modelhas Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__E3VALUE_MODELHAS_VALUE_OBJECTS = eINSTANCE.getE3ValueModel_E3valueModelhasValueObjects();

		/**
		 * The meta object literal for the '<em><b>Has Business Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_BUSINESS_ACTORS = eINSTANCE.getE3ValueModel_HasBusinessActors();

		/**
		 * The meta object literal for the '<em><b>Has Dependence Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS = eINSTANCE.getE3ValueModel_HasDependenceElements();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValueObjectImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__NAME = eINSTANCE.getValueObject_Name();

		/**
		 * The meta object literal for the '<em><b>In Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OBJECT__IN_VALUE_EXCHANGE = eINSTANCE.getValueObject_InValueExchange();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValueExchangeImpl <em>Value Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValueExchangeImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValueExchange()
		 * @generated
		 */
		EClass VALUE_EXCHANGE = eINSTANCE.getValueExchange();

		/**
		 * The meta object literal for the '<em><b>Target Value Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__TARGET_VALUE_PORT = eINSTANCE.getValueExchange_TargetValuePort();

		/**
		 * The meta object literal for the '<em><b>Source Value Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__SOURCE_VALUE_PORT = eINSTANCE.getValueExchange_SourceValuePort();

		/**
		 * The meta object literal for the '<em><b>Value Exchange Has Value Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_EXCHANGE__VALUE_EXCHANGE_HAS_VALUE_OBJECT = eINSTANCE.getValueExchange_ValueExchangeHasValueObject();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValueInterfaceImpl <em>Value Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValueInterfaceImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValueInterface()
		 * @generated
		 */
		EClass VALUE_INTERFACE = eINSTANCE.getValueInterface();

		/**
		 * The meta object literal for the '<em><b>Binds Responsability Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT = eINSTANCE.getValueInterface_BindsResponsabilityElement();

		/**
		 * The meta object literal for the '<em><b>Has Value Port Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__HAS_VALUE_PORT_OUT = eINSTANCE.getValueInterface_HasValuePortOut();

		/**
		 * The meta object literal for the '<em><b>Has Value Port In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INTERFACE__HAS_VALUE_PORT_IN = eINSTANCE.getValueInterface_HasValuePortIn();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValuePortInImpl <em>Value Port In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValuePortInImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValuePortIn()
		 * @generated
		 */
		EClass VALUE_PORT_IN = eINSTANCE.getValuePortIn();

		/**
		 * The meta object literal for the '<em><b>In Connect With Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT_IN__IN_CONNECT_WITH_VALUE_EXCHANGE = eINSTANCE.getValuePortIn_InConnectWithValueExchange();

		/**
		 * The meta object literal for the '<em><b>Position Value Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PORT_IN__POSITION_VALUE_PORT = eINSTANCE.getValuePortIn_PositionValuePort();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValuePortOutImpl <em>Value Port Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValuePortOutImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValuePortOut()
		 * @generated
		 */
		EClass VALUE_PORT_OUT = eINSTANCE.getValuePortOut();

		/**
		 * The meta object literal for the '<em><b>Out Connect With Value Exchange</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT_OUT__OUT_CONNECT_WITH_VALUE_EXCHANGE = eINSTANCE.getValuePortOut_OutConnectWithValueExchange();

		/**
		 * The meta object literal for the '<em><b>Position Value Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PORT_OUT__POSITION_VALUE_PORT = eINSTANCE.getValuePortOut_PositionValuePort();

		/**
		 * The meta object literal for the '{@link e3Value.impl.StimulusElementImpl <em>Stimulus Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.StimulusElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getStimulusElement()
		 * @generated
		 */
		EClass STIMULUS_ELEMENT = eINSTANCE.getStimulusElement();

		/**
		 * The meta object literal for the '{@link e3Value.impl.StartStimulusImpl <em>Start Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.StartStimulusImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getStartStimulus()
		 * @generated
		 */
		EClass START_STIMULUS = eINSTANCE.getStartStimulus();

		/**
		 * The meta object literal for the '{@link e3Value.impl.EndStimulusImpl <em>End Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.EndStimulusImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getEndStimulus()
		 * @generated
		 */
		EClass END_STIMULUS = eINSTANCE.getEndStimulus();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValueActivityImpl <em>Value Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValueActivityImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValueActivity()
		 * @generated
		 */
		EClass VALUE_ACTIVITY = eINSTANCE.getValueActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ACTIVITY__NAME = eINSTANCE.getValueActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Has Stimulus Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT = eINSTANCE.getValueActivity_HasStimulusElement();

		/**
		 * The meta object literal for the '<em><b>Has Dependence Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS = eINSTANCE.getValueActivity_HasDependenceElements();

		/**
		 * The meta object literal for the '<em><b>Valueinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_ACTIVITY__VALUEINTERFACES = eINSTANCE.getValueActivity_Valueinterfaces();

		/**
		 * The meta object literal for the '{@link e3Value.impl.MarketSegmentImpl <em>Market Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.MarketSegmentImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getMarketSegment()
		 * @generated
		 */
		EClass MARKET_SEGMENT = eINSTANCE.getMarketSegment();

		/**
		 * The meta object literal for the '{@link e3Value.impl.BusinessActorImpl <em>Business Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.BusinessActorImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getBusinessActor()
		 * @generated
		 */
		EClass BUSINESS_ACTOR = eINSTANCE.getBusinessActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_ACTOR__NAME = eINSTANCE.getBusinessActor_Name();

		/**
		 * The meta object literal for the '<em><b>Has Dependence Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS = eINSTANCE.getBusinessActor_HasDependenceElements();

		/**
		 * The meta object literal for the '<em><b>Has Stimulus Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_STIMULUS_ELEMENT = eINSTANCE.getBusinessActor_HasStimulusElement();

		/**
		 * The meta object literal for the '<em><b>Has Values Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_VALUES_INTERFACE = eINSTANCE.getBusinessActor_HasValuesInterface();

		/**
		 * The meta object literal for the '<em><b>Business Actors Has Value Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__BUSINESS_ACTORS_HAS_VALUE_OBJECTS = eINSTANCE.getBusinessActor_BusinessActorsHasValueObjects();

		/**
		 * The meta object literal for the '<em><b>Has Value Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES = eINSTANCE.getBusinessActor_HasValueActivities();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ValuePortImpl <em>Value Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ValuePortImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getValuePort()
		 * @generated
		 */
		EClass VALUE_PORT = eINSTANCE.getValuePort();

		/**
		 * The meta object literal for the '<em><b>Valueexchange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PORT__VALUEEXCHANGE = eINSTANCE.getValuePort_Valueexchange();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ResponsabilityElementImpl <em>Responsability Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ResponsabilityElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getResponsabilityElement()
		 * @generated
		 */
		EClass RESPONSABILITY_ELEMENT = eINSTANCE.getResponsabilityElement();

		/**
		 * The meta object literal for the '{@link e3Value.impl.AndForkImpl <em>And Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.AndForkImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getAndFork()
		 * @generated
		 */
		EClass AND_FORK = eINSTANCE.getAndFork();

		/**
		 * The meta object literal for the '{@link e3Value.impl.AndJoinImpl <em>And Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.AndJoinImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getAndJoin()
		 * @generated
		 */
		EClass AND_JOIN = eINSTANCE.getAndJoin();

		/**
		 * The meta object literal for the '{@link e3Value.impl.OrForkImpl <em>Or Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.OrForkImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getOrFork()
		 * @generated
		 */
		EClass OR_FORK = eINSTANCE.getOrFork();

		/**
		 * The meta object literal for the '{@link e3Value.impl.OrJoinImpl <em>Or Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.OrJoinImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getOrJoin()
		 * @generated
		 */
		EClass OR_JOIN = eINSTANCE.getOrJoin();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ForkElementImpl <em>Fork Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ForkElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getForkElement()
		 * @generated
		 */
		EClass FORK_ELEMENT = eINSTANCE.getForkElement();

		/**
		 * The meta object literal for the '<em><b>Has Outputs Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ELEMENT__HAS_OUTPUTS_PORT = eINSTANCE.getForkElement_HasOutputsPort();

		/**
		 * The meta object literal for the '<em><b>Has Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ELEMENT__HAS_INPUT_PORT = eINSTANCE.getForkElement_HasInputPort();

		/**
		 * The meta object literal for the '<em><b>Position Fork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK_ELEMENT__POSITION_FORK = eINSTANCE.getForkElement_PositionFork();

		/**
		 * The meta object literal for the '{@link e3Value.impl.JoinElementImpl <em>Join Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.JoinElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getJoinElement()
		 * @generated
		 */
		EClass JOIN_ELEMENT = eINSTANCE.getJoinElement();

		/**
		 * The meta object literal for the '<em><b>Has Inputs Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ELEMENT__HAS_INPUTS_PORT = eINSTANCE.getJoinElement_HasInputsPort();

		/**
		 * The meta object literal for the '<em><b>Has Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ELEMENT__HAS_OUTPUT_PORT = eINSTANCE.getJoinElement_HasOutputPort();

		/**
		 * The meta object literal for the '<em><b>Position Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_ELEMENT__POSITION_JOIN = eINSTANCE.getJoinElement_PositionJoin();

		/**
		 * The meta object literal for the '{@link e3Value.impl.ConnectionElementImpl <em>Connection Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.ConnectionElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getConnectionElement()
		 * @generated
		 */
		EClass CONNECTION_ELEMENT = eINSTANCE.getConnectionElement();

		/**
		 * The meta object literal for the '<em><b>Target Dependence Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ELEMENT__TARGET_DEPENDENCE_ELEMENT = eINSTANCE.getConnectionElement_TargetDependenceElement();

		/**
		 * The meta object literal for the '<em><b>Source Dependence Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ELEMENT__SOURCE_DEPENDENCE_ELEMENT = eINSTANCE.getConnectionElement_SourceDependenceElement();

		/**
		 * The meta object literal for the '{@link e3Value.impl.PortElementImpl <em>Port Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.PortElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getPortElement()
		 * @generated
		 */
		EClass PORT_ELEMENT = eINSTANCE.getPortElement();

		/**
		 * The meta object literal for the '<em><b>Connectionelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_ELEMENT__CONNECTIONELEMENT = eINSTANCE.getPortElement_Connectionelement();

		/**
		 * The meta object literal for the '{@link e3Value.impl.DependencyElementImpl <em>Dependency Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.DependencyElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getDependencyElement()
		 * @generated
		 */
		EClass DEPENDENCY_ELEMENT = eINSTANCE.getDependencyElement();

		/**
		 * The meta object literal for the '{@link e3Value.impl.LogicalElementImpl <em>Logical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.LogicalElementImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getLogicalElement()
		 * @generated
		 */
		EClass LOGICAL_ELEMENT = eINSTANCE.getLogicalElement();

		/**
		 * The meta object literal for the '{@link e3Value.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.OutputPortImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link e3Value.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.impl.InputPortImpl
		 * @see e3Value.impl.E3ValuePackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '{@link e3Value.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.Position
		 * @see e3Value.impl.E3ValuePackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link e3Value.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e3Value.Orientation
		 * @see e3Value.impl.E3ValuePackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

	}

} //E3ValuePackage
