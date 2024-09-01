package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface FixedDepositAccountTransactionsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId 
     * @param transactionId 
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
    suspend fun adjustTransaction(@Path("fixedDepositAccountId") fixedDepositAccountId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId 
     * @param transactionId 
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
    suspend fun retrieveOne18(@Path("fixedDepositAccountId") fixedDepositAccountId: kotlin.Long, @Path("transactionId") transactionId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId 
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
    suspend fun retrieveTemplate14(@Path("fixedDepositAccountId") fixedDepositAccountId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId 
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions")
    suspend fun transaction(@Path("fixedDepositAccountId") fixedDepositAccountId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<kotlin.String>

}
