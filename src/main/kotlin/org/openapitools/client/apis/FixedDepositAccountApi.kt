package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteFixedDepositAccountsAccountIdResponse
import org.openapitools.client.models.GetFixedDepositAccountsAccountIdResponse
import org.openapitools.client.models.GetFixedDepositAccountsResponse
import org.openapitools.client.models.GetFixedDepositAccountsTemplateResponse
import org.openapitools.client.models.PostFixedDepositAccountsAccountIdResponse
import org.openapitools.client.models.PostFixedDepositAccountsRequest
import org.openapitools.client.models.PostFixedDepositAccountsResponse
import org.openapitools.client.models.PutFixedDepositAccountsAccountIdRequest
import org.openapitools.client.models.PutFixedDepositAccountsAccountIdResponse

import okhttp3.MultipartBody

interface FixedDepositAccountApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @param command command (optional)
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{accountId}/template")
    suspend fun accountClosureTemplate(@Path("accountId") accountId: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<kotlin.String>

    /**
     * Delete a fixed deposit application
     * At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [DeleteFixedDepositAccountsAccountIdResponse]
     */
    @DELETE("v1/fixeddepositaccounts/{accountId}")
    suspend fun delete15(@Path("accountId") accountId: kotlin.Long): Response<DeleteFixedDepositAccountsAccountIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/fixeddepositaccounts/downloadtemplate")
    suspend fun getFixedDepositTemplate(@Query("officeId") officeId: kotlin.Long? = null, @Query("staffId") staffId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/fixeddepositaccounts/transaction/downloadtemplate")
    suspend fun getFixedDepositTransactionTemplate(@Query("officeId") officeId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
     * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param body 
     * @param command command (optional)
     * @return [PostFixedDepositAccountsAccountIdResponse]
     */
    @POST("v1/fixeddepositaccounts/{accountId}")
    suspend fun handleCommands4(@Path("accountId") accountId: kotlin.Long, @Body body: kotlin.Any, @Query("command") command: kotlin.String? = null): Response<PostFixedDepositAccountsAccountIdResponse>

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
    @POST("v1/fixeddepositaccounts/uploadtemplate")
    suspend fun postFixedDepositTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

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
    @POST("v1/fixeddepositaccounts/transaction/uploadtemplate")
    suspend fun postFixedDepositTransactionTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * List Fixed deposit applications/accounts
     * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param paged paged (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetFixedDepositAccountsResponse>]
     */
    @GET("v1/fixeddepositaccounts")
    suspend fun retrieveAll29(@Query("paged") paged: kotlin.Boolean? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<kotlin.collections.List<GetFixedDepositAccountsResponse>>

    /**
     * Retrieve a fixed deposit application/account
     * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetFixedDepositAccountsAccountIdResponse]
     */
    @GET("v1/fixeddepositaccounts/{accountId}")
    suspend fun retrieveOne19(@Path("accountId") accountId: kotlin.Long, @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: kotlin.Boolean? = false, @Query("chargeStatus") chargeStatus: kotlin.String? = "all"): Response<GetFixedDepositAccountsAccountIdResponse>

    /**
     * Submit new fixed deposit application
     * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
     * Responses:
     *  - 200: OK
     *
     * @param postFixedDepositAccountsRequest 
     * @return [PostFixedDepositAccountsResponse]
     */
    @POST("v1/fixeddepositaccounts")
    suspend fun submitApplication(@Body postFixedDepositAccountsRequest: PostFixedDepositAccountsRequest): Response<PostFixedDepositAccountsResponse>

    /**
     * Retrieve Fixed Deposit Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param groupId groupId (optional)
     * @param productId productId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetFixedDepositAccountsTemplateResponse]
     */
    @GET("v1/fixeddepositaccounts/template")
    suspend fun template12(@Query("clientId") clientId: kotlin.Long? = null, @Query("groupId") groupId: kotlin.Long? = null, @Query("productId") productId: kotlin.Long? = null, @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: kotlin.Boolean? = false): Response<GetFixedDepositAccountsTemplateResponse>

    /**
     * Modify a fixed deposit application
     * Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param putFixedDepositAccountsAccountIdRequest 
     * @return [PutFixedDepositAccountsAccountIdResponse]
     */
    @PUT("v1/fixeddepositaccounts/{accountId}")
    suspend fun update16(@Path("accountId") accountId: kotlin.Long, @Body putFixedDepositAccountsAccountIdRequest: PutFixedDepositAccountsAccountIdRequest): Response<PutFixedDepositAccountsAccountIdResponse>

}
