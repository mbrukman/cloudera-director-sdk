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

package com.cloudera.director.client.v1.api;

import com.cloudera.director.client.v1.common.ApiException;
import com.cloudera.director.client.v1.common.ApiClient;

import com.cloudera.director.client.v1.model.User;
import com.cloudera.director.client.v1.model.Login;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class AuthenticationApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public AuthenticationApi (ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Log in to the API
  * @param  login  login
  * status code: 200 reason: "Login successful"
  * status code: 400 reason: "Invalid login"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Login failed"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public User login (Login login) throws ApiException {
    Object postBody = login;
    // verify required params are set
    if(login == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v1/login".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiClient.deserialize(response, "", User.class);
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
  * Log out from the API
  * status code: 200 reason: "Logout successful"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Not logged in"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public Boolean logout () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/api/v1/logout".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiClient.deserialize(response, "", Boolean.class);
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
  
  }

