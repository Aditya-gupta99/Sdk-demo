package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface TwoFactorApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/twofactor")
    suspend fun getOTPDeliveryMethods(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param deliveryMethod  (optional)
     * @param extendedToken  (optional, default to false)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor")
    suspend fun requestToken(@Query("deliveryMethod") deliveryMethod: kotlin.String? = null, @Query("extendedToken") extendedToken: kotlin.Boolean? = false): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor/invalidate")
    suspend fun updateConfiguration2(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param token  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor/validate")
    suspend fun validate(@Query("token") token: kotlin.String? = null): Response<kotlin.String>

}
