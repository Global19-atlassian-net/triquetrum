/*******************************************************************************
 * Copyright (c) 2015,2019 iSencia Belgium NV.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Erwin De Ley - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.triquetrum.workflow.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Location</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.triquetrum.workflow.model.Location#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.triquetrum.workflow.model.TriqPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Attribute {
  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.eclipse.triquetrum.workflow.model.TriqPackage#getLocation_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.eclipse.triquetrum.workflow.model.Location#getExpression <em>Expression</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @model kind="operation"
   * @generated
   */
  EList<Double> getLocation();

} // Location
