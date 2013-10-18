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

public class Application  implements Serializable{

  private static final long serialVersionUID = -3934908049928752934L;
  private String appId;
  private String name;
  private String description;
  private List<String> requirements = new ArrayList<String> () ;
  private List<Properties> capabilities= new ArrayList<Properties>();
  private List<ApplicationVersion> listApplicationVersion = new ArrayList<ApplicationVersion> ();

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public List<ApplicationVersion> getListApplicationVersion() {
    return listApplicationVersion;
  }

  public void setListApplicationVersion(List<ApplicationVersion> listApplicationVersion) {
    this.listApplicationVersion = listApplicationVersion;
  }
}
