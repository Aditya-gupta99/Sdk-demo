package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.PagedLocalRequestAdvancedQueryRequest
import org.openapitools.client.models.PostSavingsAccountBulkReversalTransactionsRequest
import org.openapitools.client.models.PostSavingsAccountTransactionsRequest
import org.openapitools.client.models.PostSavingsAccountTransactionsResponse
import org.openapitools.client.models.SavingsAccountTransactionsSearchResponse

interface SavingsAccountTransactionsApi {
    /**
     * Undo/Reverse/Modify/Release Amount transaction API
     * Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount
     * Responses:
     *  - 200: OK
     *
     * @param savingsId 
     * @param transactionId 
     * @param postSavingsAccountBulkReversalTransactionsRequest 
     * @param command  (optional)
     * @return [kotlin.collections.List<PostSavingsAccountBulkReversalTransactionsRequest>]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions/{transactionId}")
    suspend fun adjustTransaction1(@Path("savingsId") savingsId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long, @Body postSavingsAccountBulkReversalTransactionsRequest: PostSavingsAccountBulkReversalTransactionsRequest, @Query("command") command: kotlin.String? = null): Response<kotlin.collections.List<PostSavingsAccountBulkReversalTransactionsRequest>>

    /**
     * Advanced search Savings Account Transactions
     * 
     * Responses:
     *  - 200: OK
     *
     * @param savingsId savingsId
     * @param pagedLocalRequestAdvancedQueryRequest  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions/query")
    suspend fun advancedQuery1(@Path("savingsId") savingsId: kotlin.Long, @Body pagedLocalRequestAdvancedQueryRequest: PagedLocalRequestAdvancedQueryRequest? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param savingsId 
     * @param transactionId 
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/{transactionId}")
    suspend fun retrieveOne24(@Path("savingsId") savingsId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param savingsId 
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/template")
    suspend fun retrieveTemplate19(@Path("savingsId") savingsId: kotlin.Long): Response<kotlin.String>


    /**
    * enum for parameter sortOrder
    */
    enum class SortOrderSearchTransactions(val value: kotlin.String) {
        @Json(name = "ASC") ASC("ASC"),
        @Json(name = "DESC") DESC("DESC")
    }

    /**
     * Search Savings Account Transactions
     * 
     * Responses:
     *  - 200: OK
     *
     * @param savingsId savings account id
     * @param fromDate minimum value date (inclusive) (optional)
     * @param toDate maximum value date (inclusive) (optional)
     * @param fromSubmittedDate minimum booking date (inclusive) (optional)
     * @param toSubmittedDate maximum booking date (inclusive) (optional)
     * @param fromAmount minimum transaction amount (inclusive) (optional)
     * @param toAmount maximum transaction amount (inclusive) (optional)
     * @param types transaction types (optional)
     * @param credit credit (optional)
     * @param debit debit (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy sort properties (optional)
     * @param sortOrder sort direction (optional)
     * @param locale locale (optional)
     * @param dateFormat date format (optional)
     * @return [SavingsAccountTransactionsSearchResponse]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/search")
    suspend fun searchTransactions(@Path("savingsId") savingsId: kotlin.Long, @Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("fromSubmittedDate") fromSubmittedDate: kotlin.String? = null, @Query("toSubmittedDate") toSubmittedDate: kotlin.String? = null, @Query("fromAmount") fromAmount: java.math.BigDecimal? = null, @Query("toAmount") toAmount: java.math.BigDecimal? = null, @Query("types") types: kotlin.String? = null, @Query("credit") credit: kotlin.Boolean? = null, @Query("debit") debit: kotlin.Boolean? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrderSearchTransactions? = null, @Query("locale") locale: kotlin.String? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<SavingsAccountTransactionsSearchResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param savingsId 
     * @param postSavingsAccountTransactionsRequest 
     * @param command  (optional)
     * @return [PostSavingsAccountTransactionsResponse]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions")
    suspend fun transaction2(@Path("savingsId") savingsId: kotlin.Long, @Body postSavingsAccountTransactionsRequest: PostSavingsAccountTransactionsRequest, @Query("command") command: kotlin.String? = null): Response<PostSavingsAccountTransactionsResponse>

}
