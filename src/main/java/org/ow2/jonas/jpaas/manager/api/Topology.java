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

public class Topology implements Serializable {

private static final long serialVersionUID = -8965856450333632569L;
private List<Node> nodeList=new ArrayList<Node>();
private List<Relationship> relationShipList =new ArrayList<Relationship>();


public List<Node> getNodeList() {
	return nodeList;
}
public void setNodeList(List<Node> nodeList) {
	this.nodeList = nodeList;
}
public List<Relationship> getRelationShipList() {
	return relationShipList;
}
public void setRelationShipList(List<Relationship> relationShipList) {
	this.relationShipList = relationShipList;
}

}
