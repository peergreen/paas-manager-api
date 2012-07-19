/**
 * JPaaS Manager Api
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

package org.ow2.jonas.jpaas.manager.api;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ApplicationVersionInstance implements Serializable{

  private static final long serialVersionUID = 134774512401344219L;
  private String appId;
  private String versionId;
  private String instanceId;
  private String instanceName;
  private List<String> requirements = new ArrayList<String>() ;
  private List<Properties> capabilities= new ArrayList<Properties>();
  private List <Deployable> sortedDeployablesList = new ArrayList <Deployable>();
  private String targetEnvId;
  private Map <Deployable,Node> deployableTopologyMapping = new HashMap <Deployable,Node>();
  private List<URI> urlList = new ArrayList<URI>();
  
  private int state;
  public static final int INSTANCE_STOPPED = 0;
  public static final int INSTANCE_STARTED = 1;
  public static final int INSTANCE_RUNNING = 2;
  public static final int INSTANCE_FAILED = 3;
  
  


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


  public List<String> getRequirements() {
	return requirements;
  }

  public void setRequirements(List<String> requirements) {
	this.requirements = requirements;
  }

  public List<Properties> getCapabilities() {
	return capabilities;
  }

  public void setCapabilities(List<Properties> capabilities) {
	this.capabilities = capabilities;
  }

  public List<Deployable> getSortedDeployablesList() {
    return sortedDeployablesList;
  }

  public void setSortedDeployablesList(List<Deployable> sortedDeployablesList) {
    this.sortedDeployablesList = sortedDeployablesList;
  }
  
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Map <Deployable,Node> getDeployableTopologyMapping() {
	return deployableTopologyMapping;
  }

  public void setDeployableTopologyMapping(Map <Deployable,Node> deployableTopologyMapping) {
	this.deployableTopologyMapping = deployableTopologyMapping;
  }

public int getState() {
	return state;
}

public void setState(int state) {
	this.state = state;
}

public String getTargetEnvId() {
	return targetEnvId;
}

public void setTargetEnvId(String targetEnvId) {
	this.targetEnvId = targetEnvId;
}


}