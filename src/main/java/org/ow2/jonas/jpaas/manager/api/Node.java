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
