/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.smaCQA.InsuranceDetailsQuestion;
import org.xtext.smaCQA.InsuranceQuestion;
import org.xtext.smaCQA.PenaltyForNeglectQuestion;
import org.xtext.smaCQA.ReturnsOrCancellationsQuestion;
import org.xtext.smaCQA.ShipmentInsuranceQuestion;
import org.xtext.smaCQA.SmaCQAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.impl.InsuranceQuestionImpl#getShipmentInsurance <em>Shipment Insurance</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.InsuranceQuestionImpl#getInsuranceDetails <em>Insurance Details</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.InsuranceQuestionImpl#getReturnsOrCancellations <em>Returns Or Cancellations</em>}</li>
 *   <li>{@link org.xtext.smaCQA.impl.InsuranceQuestionImpl#getPenaltyForNeglect <em>Penalty For Neglect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsuranceQuestionImpl extends MinimalEObjectImpl.Container implements InsuranceQuestion
{
  /**
	 * The cached value of the '{@link #getShipmentInsurance() <em>Shipment Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getShipmentInsurance()
	 * @generated
	 * @ordered
	 */
  protected ShipmentInsuranceQuestion shipmentInsurance;

  /**
	 * The cached value of the '{@link #getInsuranceDetails() <em>Insurance Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInsuranceDetails()
	 * @generated
	 * @ordered
	 */
  protected InsuranceDetailsQuestion insuranceDetails;

  /**
	 * The cached value of the '{@link #getReturnsOrCancellations() <em>Returns Or Cancellations</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReturnsOrCancellations()
	 * @generated
	 * @ordered
	 */
  protected ReturnsOrCancellationsQuestion returnsOrCancellations;

  /**
	 * The cached value of the '{@link #getPenaltyForNeglect() <em>Penalty For Neglect</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPenaltyForNeglect()
	 * @generated
	 * @ordered
	 */
  protected PenaltyForNeglectQuestion penaltyForNeglect;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InsuranceQuestionImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SmaCQAPackage.Literals.INSURANCE_QUESTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ShipmentInsuranceQuestion getShipmentInsurance()
  {
		return shipmentInsurance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetShipmentInsurance(ShipmentInsuranceQuestion newShipmentInsurance, NotificationChain msgs)
  {
		ShipmentInsuranceQuestion oldShipmentInsurance = shipmentInsurance;
		shipmentInsurance = newShipmentInsurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE, oldShipmentInsurance, newShipmentInsurance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setShipmentInsurance(ShipmentInsuranceQuestion newShipmentInsurance)
  {
		if (newShipmentInsurance != shipmentInsurance) {
			NotificationChain msgs = null;
			if (shipmentInsurance != null)
				msgs = ((InternalEObject)shipmentInsurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE, null, msgs);
			if (newShipmentInsurance != null)
				msgs = ((InternalEObject)newShipmentInsurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE, null, msgs);
			msgs = basicSetShipmentInsurance(newShipmentInsurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE, newShipmentInsurance, newShipmentInsurance));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public InsuranceDetailsQuestion getInsuranceDetails()
  {
		return insuranceDetails;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInsuranceDetails(InsuranceDetailsQuestion newInsuranceDetails, NotificationChain msgs)
  {
		InsuranceDetailsQuestion oldInsuranceDetails = insuranceDetails;
		insuranceDetails = newInsuranceDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS, oldInsuranceDetails, newInsuranceDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setInsuranceDetails(InsuranceDetailsQuestion newInsuranceDetails)
  {
		if (newInsuranceDetails != insuranceDetails) {
			NotificationChain msgs = null;
			if (insuranceDetails != null)
				msgs = ((InternalEObject)insuranceDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS, null, msgs);
			if (newInsuranceDetails != null)
				msgs = ((InternalEObject)newInsuranceDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS, null, msgs);
			msgs = basicSetInsuranceDetails(newInsuranceDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS, newInsuranceDetails, newInsuranceDetails));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ReturnsOrCancellationsQuestion getReturnsOrCancellations()
  {
		return returnsOrCancellations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReturnsOrCancellations(ReturnsOrCancellationsQuestion newReturnsOrCancellations, NotificationChain msgs)
  {
		ReturnsOrCancellationsQuestion oldReturnsOrCancellations = returnsOrCancellations;
		returnsOrCancellations = newReturnsOrCancellations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS, oldReturnsOrCancellations, newReturnsOrCancellations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setReturnsOrCancellations(ReturnsOrCancellationsQuestion newReturnsOrCancellations)
  {
		if (newReturnsOrCancellations != returnsOrCancellations) {
			NotificationChain msgs = null;
			if (returnsOrCancellations != null)
				msgs = ((InternalEObject)returnsOrCancellations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS, null, msgs);
			if (newReturnsOrCancellations != null)
				msgs = ((InternalEObject)newReturnsOrCancellations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS, null, msgs);
			msgs = basicSetReturnsOrCancellations(newReturnsOrCancellations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS, newReturnsOrCancellations, newReturnsOrCancellations));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public PenaltyForNeglectQuestion getPenaltyForNeglect()
  {
		return penaltyForNeglect;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPenaltyForNeglect(PenaltyForNeglectQuestion newPenaltyForNeglect, NotificationChain msgs)
  {
		PenaltyForNeglectQuestion oldPenaltyForNeglect = penaltyForNeglect;
		penaltyForNeglect = newPenaltyForNeglect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT, oldPenaltyForNeglect, newPenaltyForNeglect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setPenaltyForNeglect(PenaltyForNeglectQuestion newPenaltyForNeglect)
  {
		if (newPenaltyForNeglect != penaltyForNeglect) {
			NotificationChain msgs = null;
			if (penaltyForNeglect != null)
				msgs = ((InternalEObject)penaltyForNeglect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT, null, msgs);
			if (newPenaltyForNeglect != null)
				msgs = ((InternalEObject)newPenaltyForNeglect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT, null, msgs);
			msgs = basicSetPenaltyForNeglect(newPenaltyForNeglect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT, newPenaltyForNeglect, newPenaltyForNeglect));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE:
				return basicSetShipmentInsurance(null, msgs);
			case SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS:
				return basicSetInsuranceDetails(null, msgs);
			case SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS:
				return basicSetReturnsOrCancellations(null, msgs);
			case SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT:
				return basicSetPenaltyForNeglect(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE:
				return getShipmentInsurance();
			case SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS:
				return getInsuranceDetails();
			case SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS:
				return getReturnsOrCancellations();
			case SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT:
				return getPenaltyForNeglect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE:
				setShipmentInsurance((ShipmentInsuranceQuestion)newValue);
				return;
			case SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS:
				setInsuranceDetails((InsuranceDetailsQuestion)newValue);
				return;
			case SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS:
				setReturnsOrCancellations((ReturnsOrCancellationsQuestion)newValue);
				return;
			case SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT:
				setPenaltyForNeglect((PenaltyForNeglectQuestion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE:
				setShipmentInsurance((ShipmentInsuranceQuestion)null);
				return;
			case SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS:
				setInsuranceDetails((InsuranceDetailsQuestion)null);
				return;
			case SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS:
				setReturnsOrCancellations((ReturnsOrCancellationsQuestion)null);
				return;
			case SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT:
				setPenaltyForNeglect((PenaltyForNeglectQuestion)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SmaCQAPackage.INSURANCE_QUESTION__SHIPMENT_INSURANCE:
				return shipmentInsurance != null;
			case SmaCQAPackage.INSURANCE_QUESTION__INSURANCE_DETAILS:
				return insuranceDetails != null;
			case SmaCQAPackage.INSURANCE_QUESTION__RETURNS_OR_CANCELLATIONS:
				return returnsOrCancellations != null;
			case SmaCQAPackage.INSURANCE_QUESTION__PENALTY_FOR_NEGLECT:
				return penaltyForNeglect != null;
		}
		return super.eIsSet(featureID);
	}

} //InsuranceQuestionImpl