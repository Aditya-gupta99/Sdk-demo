package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface SMSApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/sms")
    suspend fun create2(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param resourceId 
     * @return [kotlin.String]
     */
    @DELETE("v1/sms/{resourceId}")
    suspend fun delete6(@Path("resourceId") resourceId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/sms")
    suspend fun retrieveAll10(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param campaignId 
     * @param status  (optional)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param locale  (optional)
     * @param dateFormat  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/sms/{campaignId}/messageByStatus")
    suspend fun retrieveAllSmsByStatus(@Path("campaignId") campaignId: kotlin.Long, @Query("status") status: kotlin.Long? = null, @Query("fromDate") fromDate: kotlin.Any? = null, @Query("toDate") toDate: kotlin.Any? = null, @Query("locale") locale: kotlin.String? = null, @Query("dateFormat") dateFormat: kotlin.String? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param resourceId 
     * @return [kotlin.String]
     */
    @GET("v1/sms/{resourceId}")
    suspend fun retrieveOne6(@Path("resourceId") resourceId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param resourceId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/sms/{resourceId}")
    suspend fun update3(@Path("resourceId") resourceId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
