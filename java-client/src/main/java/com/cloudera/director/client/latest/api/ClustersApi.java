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

package com.cloudera.director.client.latest.api;

import com.cloudera.director.client.latest.common.ApiException;
import com.cloudera.director.client.latest.common.ApiClient;

import com.cloudera.director.client.latest.model.Status;
import com.cloudera.director.client.latest.model.Cluster;
import com.cloudera.director.client.latest.model.ClusterTemplate;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class ClustersApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public ClustersApi (ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new cluster
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  XRequestId  requestId
  * @param  clusterTemplate  clusterTemplate
  * status code: 400 reason: "Invalid cluster template"
  * status code: 201 reason: "Cluster template accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  * status code: 302 reason: "Cluster already exists"
  */
  public void create (String environment, String deployment, String XRequestId, ClusterTemplate clusterTemplate) throws ApiException {
    Object postBody = clusterTemplate;
    // verify required params are set
    if(environment == null || deployment == null || clusterTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    headerParams.put("X-Request-Id", XRequestId);
    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void create (String environment, String deployment, ClusterTemplate clusterTemplate) throws ApiException {
      create(environment, deployment, null, clusterTemplate);
    }
  /**
  * Delete a cluster by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  XRequestId  requestId
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 204 reason: "Delete request accepted"
  * status code: 404 reason: "Entity not found"
  */
  public void delete (String environment, String deployment, String cluster, String XRequestId) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters/{cluster}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString())).replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    headerParams.put("X-Request-Id", XRequestId);
    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void delete (String environment, String deployment, String cluster) throws ApiException {
      delete(environment, deployment, cluster, null);
    }
  /**
  * Get a cluster by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  * status code: 204 reason: "Cluster is in transition"
  */
  public Cluster get (String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters/{cluster}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString())).replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Cluster) ApiClient.deserialize(response, "", Cluster.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * Get a cluster status by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Status getStatus (String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/status".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString())).replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Status) ApiClient.deserialize(response, "", Status.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * Get a cluster template by name
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ClusterTemplate getTemplateRedacted (String environment, String deployment, String cluster) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null || cluster == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters/{cluster}/template".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString())).replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ClusterTemplate) ApiClient.deserialize(response, "", ClusterTemplate.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * List all clusters
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public List<String> list (String environment, String deployment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || deployment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<String>) ApiClient.deserialize(response, "List", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  /**
  * Update an existing cluster
  * @param  environment  environmentName
  * @param  deployment  deploymentName
  * @param  cluster  clusterName
  * @param  XRequestId  requestId
  * @param  desired  desired
  * status code: 400 reason: "Cluster update not supported"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not found"
  * status code: 201 reason: "Created"
  * status code: 202 reason: "Cluster update accepted"
  * status code: 204 reason: "Cluster is in transition"
  */
  public void update (String environment, String deployment, String cluster, String XRequestId, ClusterTemplate desired) throws ApiException {
    Object postBody = desired;
    // verify required params are set
    if(environment == null || deployment == null || cluster == null || desired == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/deployments/{deployment}/clusters/{cluster}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "deployment" + "\\}", apiClient.escapeString(deployment.toString())).replaceAll("\\{" + "cluster" + "\\}", apiClient.escapeString(cluster.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    headerParams.put("X-Request-Id", XRequestId);
    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void update (String environment, String deployment, String cluster, ClusterTemplate desired) throws ApiException {
      update(environment, deployment, cluster, null, desired);
    }
  }

