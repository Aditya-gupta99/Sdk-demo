package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetAccountsTypeAccountIdResponse
import org.openapitools.client.models.GetAccountsTypeResponse
import org.openapitools.client.models.GetAccountsTypeTemplateResponse
import org.openapitools.client.models.PostAccountsTypeAccountIdRequest
import org.openapitools.client.models.PostAccountsTypeAccountIdResponse
import org.openapitools.client.models.PostAccountsTypeRequest
import org.openapitools.client.models.PostAccountsTypeResponse
import org.openapitools.client.models.PutAccountsTypeAccountIdRequest
import org.openapitools.client.models.PutAccountsTypeAccountIdResponse

import okhttp3.MultipartBody

interface ShareAccountApi {
    /**
     * Submit new share application
     * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param postAccountsTypeRequest 
     * @return [PostAccountsTypeResponse]
     */
    @POST("v1/accounts/{type}")
    suspend fun createAccount(@Path("type") type: kotlin.String, @Body postAccountsTypeRequest: PostAccountsTypeRequest): Response<PostAccountsTypeResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/accounts/{type}/downloadtemplate")
    suspend fun getSharedAccountsTemplate(@Path("type") type: kotlin.String, @Query("officeId") officeId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
     * Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#shareaccounts
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param accountId accountId
     * @param postAccountsTypeAccountIdRequest 
     * @param command command (optional)
     * @return [PostAccountsTypeAccountIdResponse]
     */
    @POST("v1/accounts/{type}/{accountId}")
    suspend fun handleCommands2(@Path("type") type: kotlin.String, @Path("accountId") accountId: kotlin.Long, @Body postAccountsTypeAccountIdRequest: PostAccountsTypeAccountIdRequest, @Query("command") command: kotlin.String? = null): Response<PostAccountsTypeAccountIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/accounts/{type}/uploadtemplate")
    suspend fun postSharedAccountsTemplate(@Path("type") type: kotlin.String, @Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * Retrieve a share application/account
     * Retrieves a share application/account  Example Requests :  shareaccount/1
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param type type
     * @return [GetAccountsTypeAccountIdResponse]
     */
    @GET("v1/accounts/{type}/{accountId}")
    suspend fun retrieveAccount(@Path("accountId") accountId: kotlin.Long, @Path("type") type: kotlin.String): Response<GetAccountsTypeAccountIdResponse>

    /**
     * List share applications/accounts
     * Lists share applications/accounts  Example Requests:  shareaccount
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetAccountsTypeResponse]
     */
    @GET("v1/accounts/{type}")
    suspend fun retrieveAllAccounts1(@Path("type") type: kotlin.String, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<GetAccountsTypeResponse>

    /**
     * Retrieve Share Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param clientId clientId (optional)
     * @param productId productId (optional)
     * @return [GetAccountsTypeTemplateResponse]
     */
    @GET("v1/accounts/{type}/template")
    suspend fun template7(@Path("type") type: kotlin.String, @Query("clientId") clientId: kotlin.Long? = null, @Query("productId") productId: kotlin.Long? = null): Response<GetAccountsTypeTemplateResponse>

    /**
     * Modify a share application
     * Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param accountId accountId
     * @param putAccountsTypeAccountIdRequest 
     * @return [PutAccountsTypeAccountIdResponse]
     */
    @PUT("v1/accounts/{type}/{accountId}")
    suspend fun updateAccount(@Path("type") type: kotlin.String, @Path("accountId") accountId: kotlin.Long, @Body putAccountsTypeAccountIdRequest: PutAccountsTypeAccountIdRequest): Response<PutAccountsTypeAccountIdResponse>

}
