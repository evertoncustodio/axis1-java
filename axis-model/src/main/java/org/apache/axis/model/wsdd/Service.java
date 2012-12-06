/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.axis.model.wsdd;

import java.util.List;
import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getUse <em>Use</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getStyle <em>Style</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getBeanMappings <em>Bean Mappings</em>}</li>
 *   <li>{@link org.apache.axis.model.wsdd.Service#getArrayMappings <em>Array Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 */
public interface Service extends DeployableItem {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.apache.axis.model.wsdd.Service#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' attribute.
     * @see #setProvider(QName)
     * @model dataType="org.apache.axis.model.xml.QName"
     * @generated
     */
    QName getProvider();

    /**
     * Sets the value of the '{@link org.apache.axis.model.wsdd.Service#getProvider <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' attribute.
     * @see #getProvider()
     * @generated
     */
    void setProvider(QName value);

    /**
     * Returns the value of the '<em><b>Use</b></em>' attribute.
     * The literals are from the enumeration {@link org.apache.axis.model.wsdd.Use}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use</em>' attribute.
     * @see org.apache.axis.model.wsdd.Use
     * @see #setUse(Use)
     * @model
     * @generated
     */
    Use getUse();

    /**
     * Sets the value of the '{@link org.apache.axis.model.wsdd.Service#getUse <em>Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use</em>' attribute.
     * @see org.apache.axis.model.wsdd.Use
     * @see #getUse()
     * @generated
     */
    void setUse(Use value);

    /**
     * Returns the value of the '<em><b>Style</b></em>' attribute.
     * The literals are from the enumeration {@link org.apache.axis.model.wsdd.Style}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' attribute.
     * @see org.apache.axis.model.wsdd.Style
     * @see #setStyle(Style)
     * @model
     * @generated
     */
    Style getStyle();

    /**
     * Sets the value of the '{@link org.apache.axis.model.wsdd.Service#getStyle <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see org.apache.axis.model.wsdd.Style
     * @see #getStyle()
     * @generated
     */
    void setStyle(Style value);

    /**
     * Returns the value of the '<em><b>Namespaces</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespaces</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespaces</em>' attribute list.
     * @model extendedMetaData="kind='element' name='namespace' namespace='##targetNamespace'"
     * @generated
     */
    List getNamespaces();

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
     * The list contents are of type {@link org.apache.axis.model.wsdd.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference list.
     * @model type="org.apache.axis.model.wsdd.Operation" containment="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
    List getOperations();

    /**
     * Returns the value of the '<em><b>Type Mappings</b></em>' containment reference list.
     * The list contents are of type {@link org.apache.axis.model.wsdd.TypeMapping}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Mappings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Mappings</em>' containment reference list.
     * @model type="org.apache.axis.model.wsdd.TypeMapping" containment="true"
     *        extendedMetaData="kind='element' name='typeMapping' namespace='##targetNamespace'"
     * @generated
     */
    List getTypeMappings();

    /**
     * Returns the value of the '<em><b>Bean Mappings</b></em>' containment reference list.
     * The list contents are of type {@link org.apache.axis.model.wsdd.BeanMapping}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bean Mappings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bean Mappings</em>' containment reference list.
     * @model type="org.apache.axis.model.wsdd.BeanMapping" containment="true"
     *        extendedMetaData="kind='element' name='beanMapping' namespace='##targetNamespace'"
     * @generated
     */
    List getBeanMappings();

    /**
     * Returns the value of the '<em><b>Array Mappings</b></em>' containment reference list.
     * The list contents are of type {@link org.apache.axis.model.wsdd.ArrayMapping}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Array Mappings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array Mappings</em>' containment reference list.
     * @model type="org.apache.axis.model.wsdd.ArrayMapping" containment="true"
     *        extendedMetaData="kind='element' name='arrayMapping' namespace='##targetNamespace'"
     * @generated
     */
    List getArrayMappings();

} // Service
