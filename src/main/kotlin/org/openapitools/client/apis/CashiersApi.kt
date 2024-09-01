package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface CashiersApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param tellerId  (optional)
     * @param staffId  (optional)
     * @param date  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/cashiers")
    suspend fun getCashierData(@Query("officeId") officeId: kotlin.Long? = null, @Query("tellerId") tellerId: kotlin.Long? = null, @Query("staffId") staffId: kotlin.Long? = null, @Query("date") date: kotlin.String? = null): Response<kotlin.String>

}
