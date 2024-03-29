/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alimentary Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.AlimentaryQuestion#getAgreedPrice <em>Agreed Price</em>}</li>
 *   <li>{@link org.xtext.smaCQA.AlimentaryQuestion#getProductQuality <em>Product Quality</em>}</li>
 *   <li>{@link org.xtext.smaCQA.AlimentaryQuestion#getInternationalSeal <em>International Seal</em>}</li>
 *   <li>{@link org.xtext.smaCQA.AlimentaryQuestion#getHealthInspection <em>Health Inspection</em>}</li>
 *   <li>{@link org.xtext.smaCQA.AlimentaryQuestion#getStorageConditions <em>Storage Conditions</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getAlimentaryQuestion()
 * @model
 * @generated
 */
public interface AlimentaryQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Agreed Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreed Price</em>' containment reference.
	 * @see #setAgreedPrice(AgreedPriceQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getAlimentaryQuestion_AgreedPrice()
	 * @model containment="true"
	 * @generated
	 */
  AgreedPriceQuestion getAgreedPrice();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.AlimentaryQuestion#getAgreedPrice <em>Agreed Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreed Price</em>' containment reference.
	 * @see #getAgreedPrice()
	 * @generated
	 */
  void setAgreedPrice(AgreedPriceQuestion value);

  /**
	 * Returns the value of the '<em><b>Product Quality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Quality</em>' containment reference.
	 * @see #setProductQuality(ProductQualityQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getAlimentaryQuestion_ProductQuality()
	 * @model containment="true"
	 * @generated
	 */
  ProductQualityQuestion getProductQuality();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.AlimentaryQuestion#getProductQuality <em>Product Quality</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Quality</em>' containment reference.
	 * @see #getProductQuality()
	 * @generated
	 */
  void setProductQuality(ProductQualityQuestion value);

  /**
	 * Returns the value of the '<em><b>International Seal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>International Seal</em>' containment reference.
	 * @see #setInternationalSeal(InternationalSealQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getAlimentaryQuestion_InternationalSeal()
	 * @model containment="true"
	 * @generated
	 */
  InternationalSealQuestion getInternationalSeal();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.AlimentaryQuestion#getInternationalSeal <em>International Seal</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>International Seal</em>' containment reference.
	 * @see #getInternationalSeal()
	 * @generated
	 */
  void setInternationalSeal(InternationalSealQuestion value);

  /**
	 * Returns the value of the '<em><b>Health Inspection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Inspection</em>' containment reference.
	 * @see #setHealthInspection(HealthInspectionQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getAlimentaryQuestion_HealthInspection()
	 * @model containment="true"
	 * @generated
	 */
  HealthInspectionQuestion getHealthInspection();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.AlimentaryQuestion#getHealthInspection <em>Health Inspection</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Inspection</em>' containment reference.
	 * @see #getHealthInspection()
	 * @generated
	 */
  void setHealthInspection(HealthInspectionQuestion value);

  /**
	 * Returns the value of the '<em><b>Storage Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Conditions</em>' containment reference.
	 * @see #setStorageConditions(StorageConditionsQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getAlimentaryQuestion_StorageConditions()
	 * @model containment="true"
	 * @generated
	 */
  StorageConditionsQuestion getStorageConditions();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.AlimentaryQuestion#getStorageConditions <em>Storage Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Conditions</em>' containment reference.
	 * @see #getStorageConditions()
	 * @generated
	 */
  void setStorageConditions(StorageConditionsQuestion value);

} // AlimentaryQuestion
