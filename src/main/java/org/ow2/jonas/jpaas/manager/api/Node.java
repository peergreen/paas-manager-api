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

public abstract class Node {
	
private String id;
private String name;
private int minSize;
private int maxSize;
private int currentSize;



public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMinSize() {
	return minSize;
}
public void setMinSize(int minSize) {
	this.minSize = minSize;
}
public int getMaxSize() {
	return maxSize;
}
public void setMaxSize(int maxSize) {
	this.maxSize = maxSize;
}
public int getCurrentSize() {
	return currentSize;
}
public void setCurrentSize(int currentSize) {
	this.currentSize = currentSize;
}


}
