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
