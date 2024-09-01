package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetSelfSavingsAccountsAccountIdChargesResponse
import org.openapitools.client.models.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse
import org.openapitools.client.models.GetSelfSavingsAccountsResponse

interface SelfSavingsAccountApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param accountId 
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/self/savingsaccounts/{accountId}")
    suspend fun modifySavingsAccountApplication(@Path("accountId") accountId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [kotlin.collections.List<GetSelfSavingsAccountsAccountIdChargesResponse>]
     */
    @GET("v1/self/savingsaccounts/{accountId}/charges")
    suspend fun retrieveAllSavingsAccountCharges1(@Path("accountId") accountId: kotlin.Long, @Query("chargeStatus") chargeStatus: kotlin.String? = "all"): Response<kotlin.collections.List<GetSelfSavingsAccountsAccountIdChargesResponse>>

    /**
     * Retrieve a savings account
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetSelfSavingsAccountsResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}")
    suspend fun retrieveSavings(@Path("accountId") accountId: kotlin.Long, @Query("chargeStatus") chargeStatus: kotlin.String? = "all"): Response<GetSelfSavingsAccountsResponse>

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param savingsAccountChargeId savingsAccountChargeId
     * @return [GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId}")
    suspend fun retrieveSavingsAccountCharge1(@Path("accountId") accountId: kotlin.Long, @Path("savingsAccountChargeId") savingsAccountChargeId: kotlin.Long): Response<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse>

    /**
     * Retrieve Savings Account Transaction
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param transactionId transactionId
     * @return [GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse]
     */
    @GET("v1/self/savingsaccounts/{accountId}/transactions/{transactionId}")
    suspend fun retrieveSavingsTransaction(@Path("accountId") accountId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long): Response<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/self/savingsaccounts")
    suspend fun submitSavingsAccountApplication(@Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @param productId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsaccounts/template")
    suspend fun template18(@Query("clientId") clientId: kotlin.Long? = null, @Query("productId") productId: kotlin.Long? = null): Response<kotlin.String>

}
