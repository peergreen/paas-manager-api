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

public class Environment  implements Serializable{


  private static final long serialVersionUID = -1344009539198196461L;
  private String envId;
  private String envName;
  private String envDesc;
  private List<ApplicationVersionInstance> listApplicationVersionInstance = new  ArrayList<ApplicationVersionInstance>();

  private enum stateEnv {
		running, stop, start, failed;
	};
  private stateEnv state;
  private Topology topology;

  public String getEnvId() {
    return envId;
  }

  public void setEnvId(String envId) {
    this.envId = envId;
  }

  public String getEnvName() {
    return envName;
  }

  public void setEnvName(String envName) {
    this.envName = envName;
  }

  public String getEnvDesc() {
    return envDesc;
  }

  public void setEnvDesc(String envDesc) {
    this.envDesc = envDesc;
  }

  public stateEnv getState() {
    return state;
  }

  public void setState(stateEnv state) {
    this.state = state;
  }


  public Topology getTopology() {
	return topology;
  }

  public void setTopology(Topology topology) {
	this.topology = topology;
  }

  public List<ApplicationVersionInstance> getListApplicationVersionInstance() {
	return listApplicationVersionInstance;
  }

  public void setListApplicationVersionInstance(List<ApplicationVersionInstance> listApplicationVersionInstance) {
	this.listApplicationVersionInstance = listApplicationVersionInstance;
  }
}
