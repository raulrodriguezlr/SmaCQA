/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaCQA.LegalQuestion#getAgeQuestion <em>Age Question</em>}</li>
 *   <li>{@link org.xtext.smaCQA.LegalQuestion#getTaxQuestion <em>Tax Question</em>}</li>
 *   <li>{@link org.xtext.smaCQA.LegalQuestion#getAdditionalLegalDocument <em>Additional Legal Document</em>}</li>
 *   <li>{@link org.xtext.smaCQA.LegalQuestion#getRegulatoryCompliance <em>Regulatory Compliance</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaCQA.SmaCQAPackage#getLegalQuestion()
 * @model
 * @generated
 */
public interface LegalQuestion extends EObject
{
  /**
	 * Returns the value of the '<em><b>Age Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Question</em>' containment reference.
	 * @see #setAgeQuestion(AgeQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getLegalQuestion_AgeQuestion()
	 * @model containment="true"
	 * @generated
	 */
  AgeQuestion getAgeQuestion();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.LegalQuestion#getAgeQuestion <em>Age Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Question</em>' containment reference.
	 * @see #getAgeQuestion()
	 * @generated
	 */
  void setAgeQuestion(AgeQuestion value);

  /**
	 * Returns the value of the '<em><b>Tax Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Question</em>' containment reference.
	 * @see #setTaxQuestion(TaxQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getLegalQuestion_TaxQuestion()
	 * @model containment="true"
	 * @generated
	 */
  TaxQuestion getTaxQuestion();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.LegalQuestion#getTaxQuestion <em>Tax Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Question</em>' containment reference.
	 * @see #getTaxQuestion()
	 * @generated
	 */
  void setTaxQuestion(TaxQuestion value);

  /**
	 * Returns the value of the '<em><b>Additional Legal Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Legal Document</em>' containment reference.
	 * @see #setAdditionalLegalDocument(AdditionalLegalDocumentQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getLegalQuestion_AdditionalLegalDocument()
	 * @model containment="true"
	 * @generated
	 */
  AdditionalLegalDocumentQuestion getAdditionalLegalDocument();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.LegalQuestion#getAdditionalLegalDocument <em>Additional Legal Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Legal Document</em>' containment reference.
	 * @see #getAdditionalLegalDocument()
	 * @generated
	 */
  void setAdditionalLegalDocument(AdditionalLegalDocumentQuestion value);

  /**
	 * Returns the value of the '<em><b>Regulatory Compliance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory Compliance</em>' containment reference.
	 * @see #setRegulatoryCompliance(RegulatoryComplianceQuestion)
	 * @see org.xtext.smaCQA.SmaCQAPackage#getLegalQuestion_RegulatoryCompliance()
	 * @model containment="true"
	 * @generated
	 */
  RegulatoryComplianceQuestion getRegulatoryCompliance();

  /**
	 * Sets the value of the '{@link org.xtext.smaCQA.LegalQuestion#getRegulatoryCompliance <em>Regulatory Compliance</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatory Compliance</em>' containment reference.
	 * @see #getRegulatoryCompliance()
	 * @generated
	 */
  void setRegulatoryCompliance(RegulatoryComplianceQuestion value);

} // LegalQuestion
