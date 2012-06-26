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
