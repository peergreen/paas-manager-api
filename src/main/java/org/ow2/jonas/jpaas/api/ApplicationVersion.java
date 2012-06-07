/**
 * JPaaS Util
 * Copyright (C) 2012 Bull S.A.S.
 * Contact: jasmine@ow2.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 * --------------------------------------------------------------------------
 * $Id$
 * --------------------------------------------------------------------------
 */

package org.ow2.jonas.jpaas.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ApplicationVersion implements Serializable {

  private static final long serialVersionUID = 2013336660087003313L;
  private String appId;
  private String versionId;
  private String versionLabel;
  private String requirements;
  private String capabilities;
  private ArrayList<Deployable> sortedDeployablesList;
  private ArrayList<ApplicationVersionInstance> listApplicationVersionInstance;

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public String getVersionLabel() {
    return versionLabel;
  }

  public void setVersionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
  }

  public String getRequirements() {
    return requirements;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public String getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(String capabilities) {
    this.capabilities = capabilities;
  }

  public List<Deployable> getSortedDeployablesList() {
    return sortedDeployablesList;
  }

  public void setSortedDeployablesList(ArrayList<Deployable> sortedDeployablesList) {
    this.sortedDeployablesList = sortedDeployablesList;
  }

  public ArrayList<ApplicationVersionInstance> getListApplicationVersionInstance() {
    return listApplicationVersionInstance;
  }

  public void setListApplicationVersionInstance(ArrayList<ApplicationVersionInstance> listApplicationVersionInstance) {
    this.listApplicationVersionInstance = listApplicationVersionInstance;
  }
}