/**
 */
package e3Value.provider;


import e3Value.E3ValueFactory;
import e3Value.E3ValueModel;
import e3Value.E3ValuePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e3Value.E3ValueModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class E3ValueModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES);
			childrenFeatures.add(E3ValuePackage.Literals.E3_VALUE_MODEL__E3VALUE_MODELHAS_VALUE_OBJECTS);
			childrenFeatures.add(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS);
			childrenFeatures.add(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns E3ValueModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/E3ValueModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_E3ValueModel_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(E3ValueModel.class)) {
			case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
			case E3ValuePackage.E3_VALUE_MODEL__E3VALUE_MODELHAS_VALUE_OBJECTS:
			case E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
			case E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES,
				 E3ValueFactory.eINSTANCE.createValueExchange()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__E3VALUE_MODELHAS_VALUE_OBJECTS,
				 E3ValueFactory.eINSTANCE.createValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS,
				 E3ValueFactory.eINSTANCE.createBusinessActor()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS,
				 E3ValueFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS,
				 E3ValueFactory.eINSTANCE.createCompositeActor()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS,
				 E3ValueFactory.eINSTANCE.createElementaryActor()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS,
				 E3ValueFactory.eINSTANCE.createMarketSegment()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createDependencyElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createPortElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createStimulusElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createStartStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createEndStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createResponsabilityElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createLogicalElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createForkElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createAndFork()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createJoinElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createAndJoin()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createOrFork()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createOrJoin()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createConnectionElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createInputPort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return E3valueEditPlugin.INSTANCE;
	}

}
