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

public class Connector extends Relationship implements Serializable {

private static final long serialVersionUID = 5605133133611249856L;
private String routerId;
private String containerId;


public String getRouterId() {
	return routerId;
}
public void setRouterId(String routerId) {
	this.routerId = routerId;
}
public String getContainerId() {
	return containerId;
}
public void setContainerId(String containerId) {
	this.containerId = containerId;
}


}
