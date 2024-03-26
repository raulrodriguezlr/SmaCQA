/**
 */
package e3Value.provider;


import e3Value.E3ValueFactory;
import e3Value.E3ValuePackage;
import e3Value.ValueActivity;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e3Value.ValueActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueActivityItemProvider 
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
	public ValueActivityItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addHasStimulusElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueActivity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueActivity_name_feature", "_UI_ValueActivity_type"),
				 E3ValuePackage.Literals.VALUE_ACTIVITY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Stimulus Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasStimulusElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueActivity_hasStimulusElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueActivity_hasStimulusElement_feature", "_UI_ValueActivity_type"),
				 E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_STIMULUS_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS);
			childrenFeatures.add(E3ValuePackage.Literals.VALUE_ACTIVITY__VALUEINTERFACES);
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
	 * This returns ValueActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ValueActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ValueActivity_type") :
			getString("_UI_ValueActivity_type") + " " + label;
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

		switch (notification.getFeatureID(ValueActivity.class)) {
			case E3ValuePackage.VALUE_ACTIVITY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case E3ValuePackage.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS:
			case E3ValuePackage.VALUE_ACTIVITY__VALUEINTERFACES:
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
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createDependencyElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createPortElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createStimulusElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createStartStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createEndStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createResponsabilityElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createLogicalElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createForkElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createAndFork()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createJoinElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createAndJoin()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createOrFork()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createOrJoin()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createConnectionElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__HAS_DEPENDENCE_ELEMENTS,
				 E3ValueFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(E3ValuePackage.Literals.VALUE_ACTIVITY__VALUEINTERFACES,
				 E3ValueFactory.eINSTANCE.createValueInterface()));
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
