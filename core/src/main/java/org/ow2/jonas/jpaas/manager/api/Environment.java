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

public class Environment  implements Serializable{


  private static final long serialVersionUID = -1344009539198196461L;
  private String envId;
  private String envName;
  private String envDesc;
  private List<ApplicationVersionInstance> listApplicationVersionInstance = new  ArrayList<ApplicationVersionInstance>();
  private Topology topology;
  
  private int state;
  public static final int ENVIRONMENT_STOPPED = 0;
  public static final int ENVIRONMENT_STARTED = 1;
  public static final int ENVIRONMENT_RUNNING = 2;
  public static final int ENVIRONMENT_FAILED = 3;
  

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

public int getState() {
	return state;
}

public void setState(int state) {
	this.state = state;
}
}
