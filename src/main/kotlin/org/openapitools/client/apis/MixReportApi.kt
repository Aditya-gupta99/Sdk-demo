package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface MixReportApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param currency  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/mixreport")
    suspend fun retrieveXBRLReport(@Query("startDate") startDate: java.time.OffsetDateTime? = null, @Query("endDate") endDate: java.time.OffsetDateTime? = null, @Query("currency") currency: kotlin.String? = null): Response<kotlin.String>

}
