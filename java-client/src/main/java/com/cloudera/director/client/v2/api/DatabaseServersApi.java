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

package com.cloudera.director.client.v2.api;

import com.cloudera.director.client.v2.common.ApiException;
import com.cloudera.director.client.v2.common.ApiClient;

import com.cloudera.director.client.v2.model.Status;
import com.cloudera.director.client.v2.model.ExternalDatabaseServerTemplate;
import com.cloudera.director.client.v2.model.ExternalDatabaseServer;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class DatabaseServersApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public DatabaseServersApi (ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new external database server
  * @param  environment  environmentName
  * @param  XRequestId  requestId
  * @param  externalDatabaseServerTemplate  externalDatabaseServerTemplate
  * status code: 400 reason: "Invalid external database server template"
  * status code: 201 reason: "External database server template accepted"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  * status code: 302 reason: "External database server already exists"
  */
  public void create (String environment, String XRequestId, ExternalDatabaseServerTemplate externalDatabaseServerTemplate) throws ApiException {
    Object postBody = externalDatabaseServerTemplate;
    // verify required params are set
    if(environment == null || externalDatabaseServerTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

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
  
  public void create (String environment, ExternalDatabaseServerTemplate externalDatabaseServerTemplate) throws ApiException {
      create(environment, null, externalDatabaseServerTemplate);
    }
  /**
  * Delete an external database server by name
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * @param  XRequestId  requestId
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 204 reason: "Delete request accepted"
  * status code: 404 reason: "Entity not found"
  */
  public void delete (String environment, String externalDatabaseServer, String XRequestId) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers/{externalDatabaseServer}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
  
  public void delete (String environment, String externalDatabaseServer) throws ApiException {
      delete(environment, externalDatabaseServer, null);
    }
  /**
  * Get an external database server by name
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  * status code: 204 reason: "External database server is in transition (no content)"
  */
  public ExternalDatabaseServer getRedacted (String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers/{externalDatabaseServer}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExternalDatabaseServer) ApiClient.deserialize(response, "", ExternalDatabaseServer.class);
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
  * Get an external database server status by name
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public Status getStatus (String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers/{externalDatabaseServer}/status".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
  * Get an external database server template by name
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Entity not found"
  */
  public ExternalDatabaseServerTemplate getTemplateRedacted (String environment, String externalDatabaseServer) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null || externalDatabaseServer == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers/{externalDatabaseServer}/template".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExternalDatabaseServerTemplate) ApiClient.deserialize(response, "", ExternalDatabaseServerTemplate.class);
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
  * List all externalDatabaseServers
  * @param  environment  environmentName
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Environment not found"
  */
  public List<String> list (String environment) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(environment == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString()));

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
  * Update an existing external database server (unsupported)
  * @param  environment  environmentName
  * @param  externalDatabaseServer  externalDatabaseServerName
  * @param  XRequestId  requestId
  * @param  updatedTemplate  updatedTemplate
  * status code: 400 reason: "External database server update not supported"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public void update (String environment, String externalDatabaseServer, String XRequestId, ExternalDatabaseServerTemplate updatedTemplate) throws ApiException {
    Object postBody = updatedTemplate;
    // verify required params are set
    if(environment == null || externalDatabaseServer == null || updatedTemplate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v2/environments/{environment}/databaseServers/{externalDatabaseServer}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "environment" + "\\}", apiClient.escapeString(environment.toString())).replaceAll("\\{" + "externalDatabaseServer" + "\\}", apiClient.escapeString(externalDatabaseServer.toString()));

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
  
  public void update (String environment, String externalDatabaseServer, ExternalDatabaseServerTemplate updatedTemplate) throws ApiException {
      update(environment, externalDatabaseServer, null, updatedTemplate);
    }
  }

