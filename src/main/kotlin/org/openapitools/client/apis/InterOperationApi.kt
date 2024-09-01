package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.InteropAccountData
import org.openapitools.client.models.InteropIdentifierAccountResponseData
import org.openapitools.client.models.InteropIdentifierRequestData
import org.openapitools.client.models.InteropIdentifiersResponseData
import org.openapitools.client.models.InteropKycResponseData
import org.openapitools.client.models.InteropQuoteRequestData
import org.openapitools.client.models.InteropQuoteResponseData
import org.openapitools.client.models.InteropTransactionRequestData
import org.openapitools.client.models.InteropTransactionRequestResponseData
import org.openapitools.client.models.InteropTransactionsData
import org.openapitools.client.models.InteropTransferRequestData
import org.openapitools.client.models.InteropTransferResponseData

interface InterOperationApi {
    /**
     * Calculate Interoperation Quote
     * 
     * Responses:
     *  - 200: OK
     *
     * @param interopQuoteRequestData 
     * @return [InteropQuoteResponseData]
     */
    @POST("v1/interoperation/quotes")
    suspend fun createQuote(@Body interopQuoteRequestData: InteropQuoteRequestData): Response<InteropQuoteResponseData>

    /**
     * Allow Interoperation Transaction Request
     * 
     * Responses:
     *  - 200: OK
     *
     * @param interopTransactionRequestData 
     * @return [InteropTransactionRequestResponseData]
     */
    @POST("v1/interoperation/requests")
    suspend fun createTransactionRequest(@Body interopTransactionRequestData: InteropTransactionRequestData): Response<InteropTransactionRequestResponseData>


    /**
    * enum for parameter idType
    */
    enum class IdTypeDeleteAccountIdentifier(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS")
    }

    /**
     * Allow Interoperation Identifier registration
     * 
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param interopIdentifierRequestData 
     * @return [InteropIdentifierAccountResponseData]
     */
    @DELETE("v1/interoperation/parties/{idType}/{idValue}")
    suspend fun deleteAccountIdentifier(@Path("idType") idType: kotlin.String, @Path("idValue") idValue: kotlin.String, @Body interopIdentifierRequestData: InteropIdentifierRequestData): Response<InteropIdentifierAccountResponseData>


    /**
    * enum for parameter idType
    */
    enum class IdTypeDeleteAccountIdentifier1(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS")
    }

    /**
     * Allow Interoperation Identifier registration
     * 
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param subIdOrType subIdOrType
     * @param interopIdentifierRequestData 
     * @return [InteropIdentifierAccountResponseData]
     */
    @DELETE("v1/interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    suspend fun deleteAccountIdentifier1(@Path("idType") idType: kotlin.String, @Path("idValue") idValue: kotlin.String, @Path("subIdOrType") subIdOrType: kotlin.String, @Body interopIdentifierRequestData: InteropIdentifierRequestData): Response<InteropIdentifierAccountResponseData>

    /**
     * Disburse Loan by Account Id
     * 
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @return [kotlin.String]
     */
    @POST("v1/interoperation/transactions/{accountId}/disburse")
    suspend fun disburseLoan(@Path("accountId") accountId: kotlin.String): Response<kotlin.String>


    /**
    * enum for parameter idType
    */
    enum class IdTypeGetAccountByIdentifier(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS")
    }

    /**
     * Query Interoperation Account by secondary identifier
     * 
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @return [InteropIdentifierAccountResponseData]
     */
    @GET("v1/interoperation/parties/{idType}/{idValue}")
    suspend fun getAccountByIdentifier(@Path("idType") idType: kotlin.String, @Path("idValue") idValue: kotlin.String): Response<InteropIdentifierAccountResponseData>


    /**
    * enum for parameter idType
    */
    enum class IdTypeGetAccountByIdentifier1(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS")
    }

    /**
     * Query Interoperation Account by secondary identifier
     * 
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param subIdOrType subIdOrType
     * @return [InteropIdentifierAccountResponseData]
     */
    @GET("v1/interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    suspend fun getAccountByIdentifier1(@Path("idType") idType: kotlin.String, @Path("idValue") idValue: kotlin.String, @Path("subIdOrType") subIdOrType: kotlin.String): Response<InteropIdentifierAccountResponseData>

    /**
     * Query Interoperation Account details
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [InteropAccountData]
     */
    @GET("v1/interoperation/accounts/{accountId}")
    suspend fun getAccountDetails(@Path("accountId") accountId: kotlin.String): Response<InteropAccountData>

    /**
     * Query Interoperation secondary identifiers by Account Id
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [InteropIdentifiersResponseData]
     */
    @GET("v1/interoperation/accounts/{accountId}/identifiers")
    suspend fun getAccountIdentifiers(@Path("accountId") accountId: kotlin.String): Response<InteropIdentifiersResponseData>

    /**
     * Query transactions by Account Id
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param debit debit (optional, default to true)
     * @param credit credit (optional, default to false)
     * @param fromBookingDateTime fromBookingDateTime (optional)
     * @param toBookingDateTime toBookingDateTime (optional)
     * @return [InteropTransactionsData]
     */
    @GET("v1/interoperation/accounts/{accountId}/transactions")
    suspend fun getAccountTransactions(@Path("accountId") accountId: kotlin.String, @Query("debit") debit: kotlin.Boolean? = true, @Query("credit") credit: kotlin.Boolean? = false, @Query("fromBookingDateTime") fromBookingDateTime: kotlin.String? = null, @Query("toBookingDateTime") toBookingDateTime: kotlin.String? = null): Response<InteropTransactionsData>

    /**
     * Query KYC by Account Id
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [InteropKycResponseData]
     */
    @GET("v1/interoperation/accounts/{accountId}/kyc")
    suspend fun getClientKyc(@Path("accountId") accountId: kotlin.String): Response<InteropKycResponseData>

    /**
     * Query Interoperation Quote
     * 
     * Responses:
     *  - 200: OK
     *
     * @param transactionCode transactionCode
     * @param quoteCode quoteCode
     * @return [InteropQuoteResponseData]
     */
    @GET("v1/interoperation/transactions/{transactionCode}/quotes/{quoteCode}")
    suspend fun getQuote(@Path("transactionCode") transactionCode: kotlin.String, @Path("quoteCode") quoteCode: kotlin.String): Response<InteropQuoteResponseData>

    /**
     * Query Interoperation Transaction Request
     * 
     * Responses:
     *  - 200: OK
     *
     * @param transactionCode transactionCode
     * @param requestCode requestCode
     * @return [InteropTransactionRequestResponseData]
     */
    @GET("v1/interoperation/transactions/{transactionCode}/requests/{requestCode}")
    suspend fun getTransactionRequest(@Path("transactionCode") transactionCode: kotlin.String, @Path("requestCode") requestCode: kotlin.String): Response<InteropTransactionRequestResponseData>

    /**
     * Query Interoperation Transfer
     * 
     * Responses:
     *  - 200: OK
     *
     * @param transactionCode transactionCode
     * @param transferCode transferCode
     * @return [InteropTransferResponseData]
     */
    @GET("v1/interoperation/transactions/{transactionCode}/transfers/{transferCode}")
    suspend fun getTransfer(@Path("transactionCode") transactionCode: kotlin.String, @Path("transferCode") transferCode: kotlin.String): Response<InteropTransferResponseData>

    /**
     * Query Interoperation Health Request
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Unit]
     */
    @GET("v1/interoperation/health")
    suspend fun health(): Response<Unit>

    /**
     * Disburse Loan by Account Id
     * 
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @return [kotlin.String]
     */
    @POST("v1/interoperation/transactions/{accountId}/loanrepayment")
    suspend fun loanRepayment(@Path("accountId") accountId: kotlin.String): Response<kotlin.String>

    /**
     * Prepare Interoperation Transfer
     * 
     * Responses:
     *  - 200: OK
     *
     * @param interopTransferRequestData 
     * @param action action (optional)
     * @return [InteropTransferResponseData]
     */
    @POST("v1/interoperation/transfers")
    suspend fun performTransfer(@Body interopTransferRequestData: InteropTransferRequestData, @Query("action") action: kotlin.String? = null): Response<InteropTransferResponseData>


    /**
    * enum for parameter idType
    */
    enum class IdTypeRegisterAccountIdentifier(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS")
    }

    /**
     * Interoperation Identifier registration
     * 
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param interopIdentifierRequestData 
     * @return [InteropIdentifierAccountResponseData]
     */
    @POST("v1/interoperation/parties/{idType}/{idValue}")
    suspend fun registerAccountIdentifier(@Path("idType") idType: kotlin.String, @Path("idValue") idValue: kotlin.String, @Body interopIdentifierRequestData: InteropIdentifierRequestData): Response<InteropIdentifierAccountResponseData>


    /**
    * enum for parameter idType
    */
    enum class IdTypeRegisterAccountIdentifier1(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS")
    }

    /**
     * Interoperation Identifier registration
     * 
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param subIdOrType subIdOrType
     * @param interopIdentifierRequestData 
     * @return [InteropIdentifierAccountResponseData]
     */
    @POST("v1/interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    suspend fun registerAccountIdentifier1(@Path("idType") idType: kotlin.String, @Path("idValue") idValue: kotlin.String, @Path("subIdOrType") subIdOrType: kotlin.String, @Body interopIdentifierRequestData: InteropIdentifierRequestData): Response<InteropIdentifierAccountResponseData>

}
