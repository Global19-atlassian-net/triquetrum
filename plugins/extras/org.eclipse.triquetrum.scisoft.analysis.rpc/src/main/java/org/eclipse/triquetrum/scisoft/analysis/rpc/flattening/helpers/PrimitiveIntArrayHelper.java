/*******************************************************************************
 *  Copyright (c) 2012-2016 Diamond Light Source Ltd.,
 *                           Kichwa Coders & iSencia Belgium NV.
 *                           
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0.
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      DLS, Kichwa Coders - initial API and implementation and/or initial documentation
 *      Erwin De Ley - extraction from DAWN to ease reuse in other contexts
 *******************************************************************************/

package org.eclipse.triquetrum.scisoft.analysis.rpc.flattening.helpers;

import org.eclipse.triquetrum.scisoft.analysis.rpc.flattening.IRootFlattener;

public class PrimitiveIntArrayHelper extends PrimitiveArrayHelper {

  @Override
  public Object unflatten(Object obj, IRootFlattener rootFlattener) {
    Object[] array = (Object[]) obj;
    int[] intArray = new int[array.length];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (Integer) array[i];
    }
    return intArray;
  }

  @Override
  public boolean canUnFlatten(Object obj) {
    if (!(obj instanceof Object[])) {
      return false;
    }
    Object[] array = (Object[]) obj;
    for (int i = 0; i < array.length; i++) {
      if (!(array[i] instanceof Integer)) {
        return false;
      }
    }
    return array.length > 0;

  }

}
