/*******************************************************************************
 * Copyright (c) 2014, 2019  Diamond Light Source Ltd.,
 *                          Kichwa Coders & iSencia Belgium NV.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    DLS, Kichwa Coders - initial API and implementation and/or initial documentation
 *    Erwin De Ley - extraction from DAWN to ease reuse in other contexts
 *******************************************************************************/
package org.eclipse.triquetrum.python.service.util;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;

public class NetUtils {

  /**
   * Attempts to get a free port starting at the passed in port and working up.
   *
   * @param startPort
   * @return
   */
  public static synchronized int getFreePort(final int startPort) {
    int port = startPort;
    while (!NetUtils.isPortFree(port))
      port++;
    return port;
  }

  /**
   * Checks if a port is free.
   *
   * @param port
   * @return
   */
  public static synchronized boolean isPortFree(int port) {
    ServerSocket ss = null;
    DatagramSocket ds = null;
    try {
      ss = new ServerSocket(port);
      ss.setReuseAddress(true);
      ds = new DatagramSocket(port);
      ds.setReuseAddress(true);
      return true;
    } catch (IOException e) {
    } finally {
      if (ds != null) {
        ds.close();
      }
      if (ss != null) {
        try {
          ss.close();
        } catch (IOException e) {
          /* should not be thrown */
        }
      }
    }
    return false;
  }
}
