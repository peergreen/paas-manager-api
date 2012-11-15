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



public class RealJkRouter implements Serializable{

private static final long serialVersionUID = 6895976827054398348L;
private String realName;
private List<Properties> capabilities= new ArrayList<Properties>();

private int state;
public static final int ROUTER_STOPPED = 0;
public static final int ROUTER_STARTED = 1;
public static final int ROUTER_RUNNING = 2;
public static final int ROUTER_FAILED = 3;

public String getRealName() {
	return realName;
}
public void setRealName(String realName) {
	this.realName = realName;
}

public List<Properties> getCapabilities() {
	return capabilities;
}
public void setCapabilities(List<Properties> capabilities) {
	this.capabilities = capabilities;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}


}
