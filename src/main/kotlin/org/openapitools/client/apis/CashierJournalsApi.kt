package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface CashierJournalsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param tellerId  (optional)
     * @param cashierId  (optional)
     * @param dateRange  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/cashiersjournal")
    suspend fun getJournalData1(@Query("officeId") officeId: kotlin.Long? = null, @Query("tellerId") tellerId: kotlin.Long? = null, @Query("cashierId") cashierId: kotlin.Long? = null, @Query("dateRange") dateRange: kotlin.String? = null): Response<kotlin.String>

}
