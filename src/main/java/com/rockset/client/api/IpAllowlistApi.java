/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.rockset.client.api;

import com.google.gson.reflect.TypeToken;
import com.rockset.client.ApiCallback;
import com.rockset.client.ApiClient;
import com.rockset.client.ApiResponse;
import com.rockset.client.Configuration;
import com.rockset.client.Pair;
import com.rockset.client.ProgressRequestBody;
import com.rockset.client.ProgressResponseBody;
import com.rockset.client.model.CreateIpAllowlistRequest;
import com.rockset.client.model.CreateIpAllowlistResponse;
import com.rockset.client.model.DeleteIpAllowlistResponse;
import com.rockset.client.model.GetIpAllowlistResponse;
import com.rockset.client.model.ListIpAllowlistsResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IpAllowlistApi {
  private ApiClient apiClient;

  public IpAllowlistApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpAllowlistApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for create
   *
   * @param body JSON object (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws Exception If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call createCall(
      CreateIpAllowlistRequest body,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/v1/orgs/self/ip/allowlist";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {};
    return apiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call createValidateBeforeCall(
      CreateIpAllowlistRequest body,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new Exception("Missing the required parameter 'body' when calling create(Async)");
    }

    com.squareup.okhttp.Call call = createCall(body, progressListener, progressRequestListener);
    return call;
  }

  /**
   * Create IP Allowlist Network Policy Create a new entry to allow an IP address
   *
   * @param body JSON object (required)
   * @return CreateIpAllowlistResponse
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public CreateIpAllowlistResponse create(CreateIpAllowlistRequest body) throws Exception {
    ApiResponse<CreateIpAllowlistResponse> resp = createWithHttpInfo(body);
    return resp.getData();
  }

  /**
   * Create IP Allowlist Network Policy Create a new entry to allow an IP address
   *
   * @param body JSON object (required)
   * @return ApiResponse&lt;CreateIpAllowlistResponse&gt;
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public ApiResponse<CreateIpAllowlistResponse> createWithHttpInfo(CreateIpAllowlistRequest body)
      throws Exception {
    com.squareup.okhttp.Call call = createValidateBeforeCall(body, null, null);
    Type localVarReturnType = new TypeToken<CreateIpAllowlistResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Create IP Allowlist Network Policy (asynchronously) Create a new entry to allow an IP address
   *
   * @param body JSON object (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws Exception If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call createAsync(
      CreateIpAllowlistRequest body, final ApiCallback<CreateIpAllowlistResponse> callback)
      throws Exception {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        createValidateBeforeCall(body, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<CreateIpAllowlistResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for delete
   *
   * @param name name of the IP allowlist network policy (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws Exception If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call deleteCall(
      String name,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/v1/orgs/self/ip/allowlist/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {};
    return apiClient.buildCall(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call deleteValidateBeforeCall(
      String name,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new Exception("Missing the required parameter 'name' when calling delete(Async)");
    }

    com.squareup.okhttp.Call call = deleteCall(name, progressListener, progressRequestListener);
    return call;
  }

  /**
   * Delete IP Allowlist Network Policy Delete an entry for IP allowlist network policy.
   *
   * @param name name of the IP allowlist network policy (required)
   * @return DeleteIpAllowlistResponse
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public DeleteIpAllowlistResponse delete(String name) throws Exception {
    ApiResponse<DeleteIpAllowlistResponse> resp = deleteWithHttpInfo(name);
    return resp.getData();
  }

  /**
   * Delete IP Allowlist Network Policy Delete an entry for IP allowlist network policy.
   *
   * @param name name of the IP allowlist network policy (required)
   * @return ApiResponse&lt;DeleteIpAllowlistResponse&gt;
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public ApiResponse<DeleteIpAllowlistResponse> deleteWithHttpInfo(String name) throws Exception {
    com.squareup.okhttp.Call call = deleteValidateBeforeCall(name, null, null);
    Type localVarReturnType = new TypeToken<DeleteIpAllowlistResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Delete IP Allowlist Network Policy (asynchronously) Delete an entry for IP allowlist network
   * policy.
   *
   * @param name name of the IP allowlist network policy (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws Exception If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call deleteAsync(
      String name, final ApiCallback<DeleteIpAllowlistResponse> callback) throws Exception {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        deleteValidateBeforeCall(name, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeleteIpAllowlistResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for get
   *
   * @param name name of the IP Allowlist network policy (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws Exception If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call getCall(
      String name,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/v1/orgs/self/ip/allowlist/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call getValidateBeforeCall(
      String name,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new Exception("Missing the required parameter 'name' when calling get(Async)");
    }

    com.squareup.okhttp.Call call = getCall(name, progressListener, progressRequestListener);
    return call;
  }

  /**
   * Get IP Allowlist Network Policy Get details about a IP Allowlist network policy
   *
   * @param name name of the IP Allowlist network policy (required)
   * @return GetIpAllowlistResponse
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public GetIpAllowlistResponse get(String name) throws Exception {
    ApiResponse<GetIpAllowlistResponse> resp = getWithHttpInfo(name);
    return resp.getData();
  }

  /**
   * Get IP Allowlist Network Policy Get details about a IP Allowlist network policy
   *
   * @param name name of the IP Allowlist network policy (required)
   * @return ApiResponse&lt;GetIpAllowlistResponse&gt;
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public ApiResponse<GetIpAllowlistResponse> getWithHttpInfo(String name) throws Exception {
    com.squareup.okhttp.Call call = getValidateBeforeCall(name, null, null);
    Type localVarReturnType = new TypeToken<GetIpAllowlistResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get IP Allowlist Network Policy (asynchronously) Get details about a IP Allowlist network
   * policy
   *
   * @param name name of the IP Allowlist network policy (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws Exception If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call getAsync(
      String name, final ApiCallback<GetIpAllowlistResponse> callback) throws Exception {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        getValidateBeforeCall(name, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<GetIpAllowlistResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  /**
   * Build call for list
   *
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws Exception If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call listCall(
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/v1/orgs/self/ip/allowlist";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(
                    com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                  com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call listValidateBeforeCall(
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws Exception {

    com.squareup.okhttp.Call call = listCall(progressListener, progressRequestListener);
    return call;
  }

  /**
   * List IP Allowlist Entries
   *
   * @return ListIpAllowlistsResponse
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public ListIpAllowlistsResponse list() throws Exception {
    ApiResponse<ListIpAllowlistsResponse> resp = listWithHttpInfo();
    return resp.getData();
  }

  /**
   * List IP Allowlist Entries
   *
   * @return ApiResponse&lt;ListIpAllowlistsResponse&gt;
   * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response
   *     body
   */
  public ApiResponse<ListIpAllowlistsResponse> listWithHttpInfo() throws Exception {
    com.squareup.okhttp.Call call = listValidateBeforeCall(null, null);
    Type localVarReturnType = new TypeToken<ListIpAllowlistsResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * List IP Allowlist Entries (asynchronously)
   *
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws Exception If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call listAsync(final ApiCallback<ListIpAllowlistsResponse> callback)
      throws Exception {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    com.squareup.okhttp.Call call =
        listValidateBeforeCall(progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ListIpAllowlistsResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
