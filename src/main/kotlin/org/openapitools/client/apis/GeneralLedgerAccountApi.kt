package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteGLAccountsRequest
import org.openapitools.client.models.GetGLAccountsResponse
import org.openapitools.client.models.GetGLAccountsTemplateResponse
import org.openapitools.client.models.PostGLAccountsRequest
import org.openapitools.client.models.PostGLAccountsResponse
import org.openapitools.client.models.PutGLAccountsRequest
import org.openapitools.client.models.PutGLAccountsResponse

import okhttp3.MultipartBody

interface GeneralLedgerAccountApi {
    /**
     * Create a General Ledger Account
     * Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed
     * Responses:
     *  - 200: OK
     *
     * @param postGLAccountsRequest  (optional)
     * @return [PostGLAccountsResponse]
     */
    @POST("v1/glaccounts")
    suspend fun createGLAccount1(@Body postGLAccountsRequest: PostGLAccountsRequest? = null): Response<PostGLAccountsResponse>

    /**
     * Delete a GL Account
     * Deletes a GL Account
     * Responses:
     *  - 200: OK
     *
     * @param glAccountId glAccountId
     * @return [DeleteGLAccountsRequest]
     */
    @DELETE("v1/glaccounts/{glAccountId}")
    suspend fun deleteGLAccount1(@Path("glAccountId") glAccountId: kotlin.Long): Response<DeleteGLAccountsRequest>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/glaccounts/downloadtemplate")
    suspend fun getGlAccountsTemplate(@Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/glaccounts/uploadtemplate")
    suspend fun postGlAccountsTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * Retrieve a General Ledger Account
     * Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param glAccountId glAccountId
     * @param fetchRunningBalance fetchRunningBalance (optional)
     * @return [GetGLAccountsResponse]
     */
    @GET("v1/glaccounts/{glAccountId}")
    suspend fun retreiveAccount(@Path("glAccountId") glAccountId: kotlin.Long, @Query("fetchRunningBalance") fetchRunningBalance: kotlin.Boolean? = null): Response<GetGLAccountsResponse>

    /**
     * List General Ledger Accounts
     * ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param type type (optional)
     * @param searchParam searchParam (optional)
     * @param usage usage (optional)
     * @param manualEntriesAllowed manualEntriesAllowed (optional)
     * @param disabled disabled (optional)
     * @param fetchRunningBalance fetchRunningBalance (optional)
     * @return [kotlin.collections.List<GetGLAccountsResponse>]
     */
    @GET("v1/glaccounts")
    suspend fun retrieveAllAccounts(@Query("type") type: kotlin.Int? = null, @Query("searchParam") searchParam: kotlin.String? = null, @Query("usage") usage: kotlin.Int? = null, @Query("manualEntriesAllowed") manualEntriesAllowed: kotlin.Boolean? = null, @Query("disabled") disabled: kotlin.Boolean? = null, @Query("fetchRunningBalance") fetchRunningBalance: kotlin.Boolean? = null): Response<kotlin.collections.List<GetGLAccountsResponse>>

    /**
     * Retrieve GL Accounts Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses
     * Responses:
     *  - 200: OK
     *
     * @param type type (optional)
     * @return [GetGLAccountsTemplateResponse]
     */
    @GET("v1/glaccounts/template")
    suspend fun retrieveNewAccountDetails(@Query("type") type: kotlin.Int? = null): Response<GetGLAccountsTemplateResponse>

    /**
     * Update a GL Account
     * Updates a GL Account
     * Responses:
     *  - 200: OK
     *
     * @param glAccountId glAccountId
     * @param putGLAccountsRequest  (optional)
     * @return [PutGLAccountsResponse]
     */
    @PUT("v1/glaccounts/{glAccountId}")
    suspend fun updateGLAccount1(@Path("glAccountId") glAccountId: kotlin.Long, @Body putGLAccountsRequest: PutGLAccountsRequest? = null): Response<PutGLAccountsResponse>

}
