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

package com.cloudera.director.client.v1.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class VirtualInstanceGroup {
  private Integer minCount;
  private String name;
  private Map<String,Map<String,Map<String,String>>> roleTypesConfigs;
  private Map<String,List<String>> serviceTypeToRoleTypes;
  private List<VirtualInstance> virtualInstances;
  public VirtualInstanceGroup() {} 

  private VirtualInstanceGroup(Integer minCount, String name, Map<String,Map<String,Map<String,String>>> roleTypesConfigs, Map<String,List<String>> serviceTypeToRoleTypes, List<VirtualInstance> virtualInstances) {
    this.minCount = minCount;
    this.name = name;
    this.roleTypesConfigs = roleTypesConfigs;
    this.serviceTypeToRoleTypes = serviceTypeToRoleTypes;
    this.virtualInstances = virtualInstances;
    
  }
  
  private VirtualInstanceGroup (VirtualInstanceGroupBuilder builder) {
    this.minCount = builder.minCount;
    this.name = builder.name;
    this.roleTypesConfigs = builder.roleTypesConfigs;
    this.serviceTypeToRoleTypes = builder.serviceTypeToRoleTypes;
    this.virtualInstances = builder.virtualInstances;
    
  }

  public static VirtualInstanceGroupBuilder builder() {
    return new VirtualInstanceGroupBuilder();
  }

  
  public static class VirtualInstanceGroupBuilder {
    private Integer minCount = null;
    private String name = null;
    private Map<String,Map<String,Map<String,String>>> roleTypesConfigs = new HashMap<String,Map<String,Map<String,String>>>();
    private Map<String,List<String>> serviceTypeToRoleTypes = new HashMap<String,List<String>>();
    private List<VirtualInstance> virtualInstances = new ArrayList<VirtualInstance>();
    
    public VirtualInstanceGroupBuilder minCount(Integer minCount) {
      this.minCount = minCount;
      return this;
    }

    public VirtualInstanceGroupBuilder name(String name) {
      this.name = name;
      return this;
    }

    public VirtualInstanceGroupBuilder roleTypesConfigs(Map<String,Map<String,Map<String,String>>> roleTypesConfigs) {
      this.roleTypesConfigs = roleTypesConfigs;
      return this;
    }

    public VirtualInstanceGroupBuilder serviceTypeToRoleTypes(Map<String,List<String>> serviceTypeToRoleTypes) {
      this.serviceTypeToRoleTypes = serviceTypeToRoleTypes;
      return this;
    }

    public VirtualInstanceGroupBuilder virtualInstances(List<VirtualInstance> virtualInstances) {
      this.virtualInstances = virtualInstances;
      return this;
    }

    public VirtualInstanceGroup build(){
      return new VirtualInstanceGroup(this);
    }
  }

  public VirtualInstanceGroupBuilder toBuilder() {
    return builder()
      .minCount(minCount)
      .name(name)
      .roleTypesConfigs(roleTypesConfigs)
      .serviceTypeToRoleTypes(serviceTypeToRoleTypes)
      .virtualInstances(virtualInstances)
      ;
  }
  public Integer getMinCount() {
    return minCount;
  }
  public void setMinCount(Integer minCount) {
    this.minCount = minCount;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Map<String,Map<String,Map<String,String>>> getRoleTypesConfigs() {
    return roleTypesConfigs;
  }
  public void setRoleTypesConfigs(Map<String,Map<String,Map<String,String>>> roleTypesConfigs) {
    this.roleTypesConfigs = roleTypesConfigs;
  }

  public Map<String,List<String>> getServiceTypeToRoleTypes() {
    return serviceTypeToRoleTypes;
  }
  public void setServiceTypeToRoleTypes(Map<String,List<String>> serviceTypeToRoleTypes) {
    this.serviceTypeToRoleTypes = serviceTypeToRoleTypes;
  }

  public List<VirtualInstance> getVirtualInstances() {
    return virtualInstances;
  }
  public void setVirtualInstances(List<VirtualInstance> virtualInstances) {
    this.virtualInstances = virtualInstances;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    String newLine = System.getProperty("line.separator");
    sb.append("class VirtualInstanceGroup {" + newLine);
    sb.append("  minCount: ").append(minCount).append(newLine);
    sb.append("  name: ").append(name).append(newLine);
    sb.append("  roleTypesConfigs: ").append(roleTypesConfigs).append(newLine);
    sb.append("  serviceTypeToRoleTypes: ").append(serviceTypeToRoleTypes).append(newLine);
    sb.append("  virtualInstances: ").append(virtualInstances).append(newLine);
    sb.append("}" + newLine);
    return sb.toString();
  }
}

