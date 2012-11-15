/**
 * JPaaS
 * Copyright 2012 Bull S.A.S.
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
 * 
 * $Id:$
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
  
  
  private String stateStr;

  


  public String getStateStr() {
	return stateStr;
}

public void setStateStr(String stateStr) {
	this.stateStr = stateStr;
}

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
