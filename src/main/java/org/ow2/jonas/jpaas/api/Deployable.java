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
import java.lang.Boolean;
import java.lang.String;

public class Deployable implements Serializable {

  private static final long serialVersionUID = 1470072383294447257L;
  private String deployabledId;
  private String deployableName;
  private String locationUrl;
  private Boolean isUploaded;
  private String requirements;
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

  public String getRequirements() {
    return requirements;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public String getSlaEnforcement() {
    return slaEnforcement;
  }

  public void setSlaEnforcement(String slaEnforcement) {
    this.slaEnforcement = slaEnforcement;
  }
}