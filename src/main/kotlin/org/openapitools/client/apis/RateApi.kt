package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface RateApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/rates")
    suspend fun createRate(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/rates")
    suspend fun getAllRates(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param rateId 
     * @return [kotlin.String]
     */
    @GET("v1/rates/{rateId}")
    suspend fun retrieveRate(@Path("rateId") rateId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param rateId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/rates/{rateId}")
    suspend fun updateRate(@Path("rateId") rateId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
