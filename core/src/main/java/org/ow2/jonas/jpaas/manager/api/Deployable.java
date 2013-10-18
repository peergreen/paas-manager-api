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
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Deployable implements Serializable {

  private static final long serialVersionUID = -1185638223191519832L;
  private String deployabledId;
  private String deployableName;
  private String locationUrl;
  private Boolean isUploaded;
  private List<String> requirements = new ArrayList<String> () ;
  private String slaEnforcement;

  public String getDeployabledId() {
    return deployabledId;
  }

  public void setDeployabledId(String deployabledId) {
    this.deployabledId = deployabledId;
  }

  public String getDeployableName() {
    return deployableName;
  }

  public void setDeployableName(String deployableName) {
    this.deployableName = deployableName;
  }

  public String getLocationUrl() {
    return locationUrl;
  }

  public void setLocationUrl(String locationUrl) {
    this.locationUrl = locationUrl;
  }

  public Boolean getUploaded() {
    return isUploaded;
  }

  public void setUploaded(Boolean uploaded) {
    isUploaded = uploaded;
  }

  public String getSlaEnforcement() {
    return slaEnforcement;
  }

  public void setSlaEnforcement(String slaEnforcement) {
    this.slaEnforcement = slaEnforcement;
  }

public List<String> getRequirements() {
	return requirements;
}

public void setRequirements(List<String> requirements) {
	this.requirements = requirements;
}
}
