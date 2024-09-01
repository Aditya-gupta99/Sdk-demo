package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface ProvisioningCategoryApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/provisioningcategory")
    suspend fun createProvisioningCategory(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param categoryId 
     * @return [kotlin.String]
     */
    @DELETE("v1/provisioningcategory/{categoryId}")
    suspend fun deleteProvisioningCategory(@Path("categoryId") categoryId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/provisioningcategory")
    suspend fun retrieveAll15(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param categoryId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/provisioningcategory/{categoryId}")
    suspend fun updateProvisioningCategory(@Path("categoryId") categoryId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
