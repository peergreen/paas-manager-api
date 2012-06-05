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
import java.lang.String;
import java.net.URI;
import java.util.List;

public class ApplicationVersionInstance implements Serializable {

  private static final long serialVersionUID = -2161092164213063410L;
  private String appId;
  private String versionId;
  private String instanceId;
  private String instanceName;
  private String requirements;
  private String capabilities;
  private List<Deployable> sortedDeployablesList;
  private Environment targetEnvId;
  private String deployableTopologyMapping;
  private enum stateApp {
		stop, start;
	};
  private stateApp state;
  private List<URI> urlList;


  public List<URI> getUrlList() {
    return urlList;
  }

  public void setUrlList(List<URI> urlList) {
    this.urlList = urlList;
  }

  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
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

  public void setSortedDeployablesList(List<Deployable> sortedDeployablesList) {
    this.sortedDeployablesList = sortedDeployablesList;
  }

  public Environment getTargetEnvId() {
    return targetEnvId;
  }

  public void setTargetEnvId(Environment targetEnvId) {
    this.targetEnvId = targetEnvId;
  }

  public String getDeployableTopologyMapping() {
    return deployableTopologyMapping;
  }

  public void setDeployableTopologyMapping(String deployableTopologyMapping) {
    this.deployableTopologyMapping = deployableTopologyMapping;
  }

  public stateApp getState() {
    return state;
  }

  public void setState(stateApp state) {
    this.state = state;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }
}