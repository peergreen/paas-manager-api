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
import java.util.Properties;


public class RealJonasContainer implements Serializable{

private static final long serialVersionUID = -4117223587587794540L;
private String realName;
private List<Properties> capabilities= new ArrayList<Properties>();

private int state;
public static final int CONTAINER_STOPPED = 0;
public static final int CONTAINER_STARTED = 1;
public static final int CONTAINER_RUNNING = 2;
public static final int CONTAINER_FAILED = 3;


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
