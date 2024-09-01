package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface DepositAccountOnHoldFundTransactionsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param savingsId 
     * @param guarantorFundingId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/onholdtransactions")
    suspend fun retrieveAll28(@Path("savingsId") savingsId: kotlin.Long, @Query("guarantorFundingId") guarantorFundingId: kotlin.Long? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<kotlin.String>

}
