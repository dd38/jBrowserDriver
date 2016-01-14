/* 
 * jBrowserDriver (TM)
 * Copyright (C) 2014-2016 Machine Publishers, LLC
 * 
 * Sales and support: ops@machinepublishers.com
 * Updates: https://github.com/MachinePublishers/jBrowserDriver
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.machinepublishers.jbrowserdriver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.openqa.selenium.security.Credentials;

class AlertServer extends UnicastRemoteObject implements AlertRemote,
    org.openqa.selenium.Alert {

  protected AlertServer() throws RemoteException {
    super();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void accept() {
    // TODO Auto-generated method stub
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void authenticateUsing(Credentials arg0) {
    // TODO Auto-generated method stub
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dismiss() {
    // TODO Auto-generated method stub
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getText() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void sendKeys(String arg0) {
    // TODO Auto-generated method stub
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setCredentials(Credentials credentials) {
    // TODO Auto-generated method stub
  }
}
