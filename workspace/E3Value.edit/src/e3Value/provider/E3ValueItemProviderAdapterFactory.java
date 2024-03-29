/**
 */
package e3Value.provider;

import e3Value.util.E3ValueAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class E3ValueItemProviderAdapterFactory extends E3ValueAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.CompositeActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeActorItemProvider compositeActorItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.CompositeActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeActorAdapter() {
		if (compositeActorItemProvider == null) {
			compositeActorItemProvider = new CompositeActorItemProvider(this);
		}

		return compositeActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ElementaryActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryActorItemProvider elementaryActorItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ElementaryActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementaryActorAdapter() {
		if (elementaryActorItemProvider == null) {
			elementaryActorItemProvider = new ElementaryActorItemProvider(this);
		}

		return elementaryActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.E3ValueDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueDiagramItemProvider e3ValueDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.E3ValueDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createE3ValueDiagramAdapter() {
		if (e3ValueDiagramItemProvider == null) {
			e3ValueDiagramItemProvider = new E3ValueDiagramItemProvider(this);
		}

		return e3ValueDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.E3ValueModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueModelItemProvider e3ValueModelItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.E3ValueModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createE3ValueModelAdapter() {
		if (e3ValueModelItemProvider == null) {
			e3ValueModelItemProvider = new E3ValueModelItemProvider(this);
		}

		return e3ValueModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValueObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueObjectItemProvider valueObjectItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueObjectAdapter() {
		if (valueObjectItemProvider == null) {
			valueObjectItemProvider = new ValueObjectItemProvider(this);
		}

		return valueObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValueExchange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExchangeItemProvider valueExchangeItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValueExchange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueExchangeAdapter() {
		if (valueExchangeItemProvider == null) {
			valueExchangeItemProvider = new ValueExchangeItemProvider(this);
		}

		return valueExchangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValueInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInterfaceItemProvider valueInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValueInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueInterfaceAdapter() {
		if (valueInterfaceItemProvider == null) {
			valueInterfaceItemProvider = new ValueInterfaceItemProvider(this);
		}

		return valueInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValuePortIn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortInItemProvider valuePortInItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValuePortIn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValuePortInAdapter() {
		if (valuePortInItemProvider == null) {
			valuePortInItemProvider = new ValuePortInItemProvider(this);
		}

		return valuePortInItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValuePortOut} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortOutItemProvider valuePortOutItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValuePortOut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValuePortOutAdapter() {
		if (valuePortOutItemProvider == null) {
			valuePortOutItemProvider = new ValuePortOutItemProvider(this);
		}

		return valuePortOutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.StimulusElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StimulusElementItemProvider stimulusElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.StimulusElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStimulusElementAdapter() {
		if (stimulusElementItemProvider == null) {
			stimulusElementItemProvider = new StimulusElementItemProvider(this);
		}

		return stimulusElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.StartStimulus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartStimulusItemProvider startStimulusItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.StartStimulus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartStimulusAdapter() {
		if (startStimulusItemProvider == null) {
			startStimulusItemProvider = new StartStimulusItemProvider(this);
		}

		return startStimulusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.EndStimulus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndStimulusItemProvider endStimulusItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.EndStimulus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndStimulusAdapter() {
		if (endStimulusItemProvider == null) {
			endStimulusItemProvider = new EndStimulusItemProvider(this);
		}

		return endStimulusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValueActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueActivityItemProvider valueActivityItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValueActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueActivityAdapter() {
		if (valueActivityItemProvider == null) {
			valueActivityItemProvider = new ValueActivityItemProvider(this);
		}

		return valueActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.MarketSegment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketSegmentItemProvider marketSegmentItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.MarketSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarketSegmentAdapter() {
		if (marketSegmentItemProvider == null) {
			marketSegmentItemProvider = new MarketSegmentItemProvider(this);
		}

		return marketSegmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.BusinessActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessActorItemProvider businessActorItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.BusinessActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessActorAdapter() {
		if (businessActorItemProvider == null) {
			businessActorItemProvider = new BusinessActorItemProvider(this);
		}

		return businessActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ValuePort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePortItemProvider valuePortItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ValuePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValuePortAdapter() {
		if (valuePortItemProvider == null) {
			valuePortItemProvider = new ValuePortItemProvider(this);
		}

		return valuePortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ResponsabilityElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsabilityElementItemProvider responsabilityElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ResponsabilityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsabilityElementAdapter() {
		if (responsabilityElementItemProvider == null) {
			responsabilityElementItemProvider = new ResponsabilityElementItemProvider(this);
		}

		return responsabilityElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.AndFork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndForkItemProvider andForkItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.AndFork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndForkAdapter() {
		if (andForkItemProvider == null) {
			andForkItemProvider = new AndForkItemProvider(this);
		}

		return andForkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.AndJoin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndJoinItemProvider andJoinItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.AndJoin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndJoinAdapter() {
		if (andJoinItemProvider == null) {
			andJoinItemProvider = new AndJoinItemProvider(this);
		}

		return andJoinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.OrFork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrForkItemProvider orForkItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.OrFork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrForkAdapter() {
		if (orForkItemProvider == null) {
			orForkItemProvider = new OrForkItemProvider(this);
		}

		return orForkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.OrJoin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrJoinItemProvider orJoinItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.OrJoin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrJoinAdapter() {
		if (orJoinItemProvider == null) {
			orJoinItemProvider = new OrJoinItemProvider(this);
		}

		return orJoinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ForkElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkElementItemProvider forkElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ForkElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkElementAdapter() {
		if (forkElementItemProvider == null) {
			forkElementItemProvider = new ForkElementItemProvider(this);
		}

		return forkElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.JoinElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinElementItemProvider joinElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.JoinElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinElementAdapter() {
		if (joinElementItemProvider == null) {
			joinElementItemProvider = new JoinElementItemProvider(this);
		}

		return joinElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.ConnectionElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionElementItemProvider connectionElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.ConnectionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionElementAdapter() {
		if (connectionElementItemProvider == null) {
			connectionElementItemProvider = new ConnectionElementItemProvider(this);
		}

		return connectionElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.PortElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortElementItemProvider portElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.PortElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortElementAdapter() {
		if (portElementItemProvider == null) {
			portElementItemProvider = new PortElementItemProvider(this);
		}

		return portElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.DependencyElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyElementItemProvider dependencyElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.DependencyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyElementAdapter() {
		if (dependencyElementItemProvider == null) {
			dependencyElementItemProvider = new DependencyElementItemProvider(this);
		}

		return dependencyElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.LogicalElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalElementItemProvider logicalElementItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.LogicalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalElementAdapter() {
		if (logicalElementItemProvider == null) {
			logicalElementItemProvider = new LogicalElementItemProvider(this);
		}

		return logicalElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.OutputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPortItemProvider outputPortItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputPortAdapter() {
		if (outputPortItemProvider == null) {
			outputPortItemProvider = new OutputPortItemProvider(this);
		}

		return outputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link e3Value.InputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortItemProvider inputPortItemProvider;

	/**
	 * This creates an adapter for a {@link e3Value.InputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputPortAdapter() {
		if (inputPortItemProvider == null) {
			inputPortItemProvider = new InputPortItemProvider(this);
		}

		return inputPortItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (compositeActorItemProvider != null) compositeActorItemProvider.dispose();
		if (elementaryActorItemProvider != null) elementaryActorItemProvider.dispose();
		if (actorItemProvider != null) actorItemProvider.dispose();
		if (e3ValueDiagramItemProvider != null) e3ValueDiagramItemProvider.dispose();
		if (e3ValueModelItemProvider != null) e3ValueModelItemProvider.dispose();
		if (valueObjectItemProvider != null) valueObjectItemProvider.dispose();
		if (valueExchangeItemProvider != null) valueExchangeItemProvider.dispose();
		if (valueInterfaceItemProvider != null) valueInterfaceItemProvider.dispose();
		if (valuePortInItemProvider != null) valuePortInItemProvider.dispose();
		if (valuePortOutItemProvider != null) valuePortOutItemProvider.dispose();
		if (stimulusElementItemProvider != null) stimulusElementItemProvider.dispose();
		if (startStimulusItemProvider != null) startStimulusItemProvider.dispose();
		if (endStimulusItemProvider != null) endStimulusItemProvider.dispose();
		if (valueActivityItemProvider != null) valueActivityItemProvider.dispose();
		if (marketSegmentItemProvider != null) marketSegmentItemProvider.dispose();
		if (businessActorItemProvider != null) businessActorItemProvider.dispose();
		if (valuePortItemProvider != null) valuePortItemProvider.dispose();
		if (responsabilityElementItemProvider != null) responsabilityElementItemProvider.dispose();
		if (andForkItemProvider != null) andForkItemProvider.dispose();
		if (andJoinItemProvider != null) andJoinItemProvider.dispose();
		if (orForkItemProvider != null) orForkItemProvider.dispose();
		if (orJoinItemProvider != null) orJoinItemProvider.dispose();
		if (forkElementItemProvider != null) forkElementItemProvider.dispose();
		if (joinElementItemProvider != null) joinElementItemProvider.dispose();
		if (connectionElementItemProvider != null) connectionElementItemProvider.dispose();
		if (portElementItemProvider != null) portElementItemProvider.dispose();
		if (dependencyElementItemProvider != null) dependencyElementItemProvider.dispose();
		if (logicalElementItemProvider != null) logicalElementItemProvider.dispose();
		if (outputPortItemProvider != null) outputPortItemProvider.dispose();
		if (inputPortItemProvider != null) inputPortItemProvider.dispose();
	}

}
