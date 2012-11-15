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

public class JkRouter extends Node implements Serializable {

private static final long serialVersionUID = -1223334805622186978L;
private String jkRef;
private List<RealJkRouter> listRealJkRouter = new ArrayList<RealJkRouter>();


public String getJkRef() {
	return jkRef;
}

public void setJkRef(String jkRef) {
	this.jkRef = jkRef;
}

public List<RealJkRouter> getListRealJkRouter() {
	return listRealJkRouter;
}

public void setListRealJkRouter(List<RealJkRouter> listRealJkRouter) {
	this.listRealJkRouter = listRealJkRouter;
}

}
