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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ApplicationVersion implements Serializable{

  private static final long serialVersionUID = 5023584890222485816L;
  private String appId;
  private String versionId;
  private String versionLabel;
  private List<String> requirements = new ArrayList<String>() ;
  private List<Properties> capabilities= new ArrayList<Properties>();
  private List<Deployable> sortedDeployablesList =  new ArrayList <Deployable>();;
  private List<ApplicationVersionInstance> listApplicationVersionInstance = new  ArrayList<ApplicationVersionInstance>();

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

  public List<ApplicationVersionInstance> getListApplicationVersionInstance() {
    return listApplicationVersionInstance;
  }

  public void setListApplicationVersionInstance(List<ApplicationVersionInstance> listApplicationVersionInstance) {
    this.listApplicationVersionInstance = listApplicationVersionInstance;
  }
}
