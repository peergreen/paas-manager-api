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

public class JonasContainer extends Node implements Serializable {

private static final long serialVersionUID = -1372599585748988130L;
private String javaRef;
private String javaOptions;
private String jonasRef;
private List<RealJonasContainer> listRealJonasContainer= new ArrayList<RealJonasContainer> ();

public String getJavaRef() {
	return javaRef;
}
public void setJavaRef(String javaRef) {
	this.javaRef = javaRef;
}
public String getJavaOptions() {
	return javaOptions;
}
public void setJavaOptions(String javaOptions) {
	this.javaOptions = javaOptions;
}
public String getJonasRef() {
	return jonasRef;
}
public void setJonasRef(String jonasRef) {
	this.jonasRef = jonasRef;
}
public List<RealJonasContainer> getListRealJonasContainer() {
	return listRealJonasContainer;
}
public void setListRealJonasContainer(List<RealJonasContainer> listRealJonasContainer) {
	this.listRealJonasContainer = listRealJonasContainer;
}



}
