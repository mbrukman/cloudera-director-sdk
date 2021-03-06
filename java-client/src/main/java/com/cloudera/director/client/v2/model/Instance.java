// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Note: This file is auto generated. Do not edit manually.

package com.cloudera.director.client.v2.model;

import com.cloudera.director.client.v2.model.Health;
import com.cloudera.director.client.v2.model.VirtualInstance;
import com.cloudera.director.client.v2.model.Capabilities;
public class Instance {
  private Capabilities capabilities;
  private Health health;
  private String ipAddress;
  private VirtualInstance virtualInstance;
  public Instance() {} 

  private Instance(Capabilities capabilities, Health health, String ipAddress, VirtualInstance virtualInstance) {
    this.capabilities = capabilities;
    this.health = health;
    this.ipAddress = ipAddress;
    this.virtualInstance = virtualInstance;
    
  }
  
  private Instance (InstanceBuilder builder) {
    this.capabilities = builder.capabilities;
    this.health = builder.health;
    this.ipAddress = builder.ipAddress;
    this.virtualInstance = builder.virtualInstance;
    
  }

  public static InstanceBuilder builder() {
    return new InstanceBuilder();
  }

  
  public static class InstanceBuilder {
    private Capabilities capabilities = null;
    private Health health = null;
    private String ipAddress = null;
    private VirtualInstance virtualInstance = null;
    
    public InstanceBuilder capabilities(Capabilities capabilities) {
      this.capabilities = capabilities;
      return this;
    }

    public InstanceBuilder health(Health health) {
      this.health = health;
      return this;
    }

    public InstanceBuilder ipAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    public InstanceBuilder virtualInstance(VirtualInstance virtualInstance) {
      this.virtualInstance = virtualInstance;
      return this;
    }

    public Instance build(){
      return new Instance(this);
    }
  }

  public InstanceBuilder toBuilder() {
    return builder()
      .capabilities(capabilities)
      .health(health)
      .ipAddress(ipAddress)
      .virtualInstance(virtualInstance)
      ;
  }
  public Capabilities getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public Health getHealth() {
    return health;
  }
  public void setHealth(Health health) {
    this.health = health;
  }

  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public VirtualInstance getVirtualInstance() {
    return virtualInstance;
  }
  public void setVirtualInstance(VirtualInstance virtualInstance) {
    this.virtualInstance = virtualInstance;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class Instance {" + newLine);
    sb.append("  capabilities: ").append(capabilities).append(newLine);
    sb.append("  health: ").append(health).append(newLine);
    sb.append("  ipAddress: ").append(ipAddress).append(newLine);
    sb.append("  virtualInstance: ").append(virtualInstance).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

