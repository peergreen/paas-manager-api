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