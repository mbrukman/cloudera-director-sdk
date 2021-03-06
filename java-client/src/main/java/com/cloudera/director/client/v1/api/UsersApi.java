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
import com.cloudera.director.client.v1.model.PasswordChange;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class UsersApi {
  ApiClient apiClient;

  public ApiClient getClient() {
    return apiClient;
  }

  public UsersApi (ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
  * Create a new user
  * @param  user  user
  * status code: 400 reason: "Invalid user"
  * status code: 201 reason: "User created"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  * status code: 302 reason: "User already exists"
  */
  public void create (User user) throws ApiException {
    Object postBody = user;
    // verify required params are set
    if(user == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v1/users".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  /**
  * Get the current user
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public User currentRedacted () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/api/v1/users/current".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  * Delete a user by username
  * @param  username  username
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 204 reason: "User deleted"
  */
  public void delete (String username) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(username == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v1/users/{username}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  /**
  * Get a user by username
  * @param  username  username
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "User not found"
  */
  public User getRedacted (String username) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(username == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v1/users/{username}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
  * List all users
  * status code: 200 reason: "OK"
  * status code: 401 reason: "Unauthorized"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "Not Found"
  */
  public List<String> list () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/api/v1/users".replaceAll("\\{format\\}","json");

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
  * Update an existing user
  * @param  username  username
  * @param  user  user
  * status code: 400 reason: "Validation error or rename not allowed"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Unauthorized"
  * status code: 202 reason: "Updated user accepted"
  * status code: 403 reason: "Forbidden"
  * status code: 404 reason: "User not found"
  */
  public void update (String username, User user) throws ApiException {
    Object postBody = user;
    // verify required params are set
    if(username == null || user == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v1/users/{username}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  /**
  * Update the password of an existing user
  * @param  username  username
  * @param  passwords  passwords
  * status code: 400 reason: "Validation error or old password is missing or incorrect"
  * status code: 201 reason: "Created"
  * status code: 401 reason: "Unauthorized"
  * status code: 202 reason: "Updated password accepted"
  * status code: 403 reason: "May only change own password"
  * status code: 404 reason: "User not found"
  */
  public void updatePassword (String username, PasswordChange passwords) throws ApiException {
    Object postBody = passwords;
    // verify required params are set
    if(username == null || passwords == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/api/v1/users/{username}/password".replaceAll("\\{format\\}","json").replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

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
  
  }

