package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.BusinessDateRequest
import org.openapitools.client.models.BusinessDateResponse

interface BusinessDateManagementApi {
    /**
     * Retrieve a specific Business date
     * 
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @return [BusinessDateResponse]
     */
    @GET("v1/businessdate/{type}")
    suspend fun getBusinessDate(@Path("type") type: kotlin.String): Response<BusinessDateResponse>

    /**
     * List all business dates
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<BusinessDateResponse>]
     */
    @GET("v1/businessdate")
    suspend fun getBusinessDates(): Response<kotlin.collections.List<BusinessDateResponse>>

    /**
     * Update Business Date
     * 
     * Responses:
     *  - 200: OK
     *
     * @param businessDateRequest 
     * @return [BusinessDateResponse]
     */
    @POST("v1/businessdate")
    suspend fun updateBusinessDate(@Body businessDateRequest: BusinessDateRequest): Response<BusinessDateResponse>

}
