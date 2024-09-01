package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface SelfShareProductsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/products/share")
    suspend fun retrieveAllProducts1(@Query("clientId") clientId: kotlin.Long? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param type 
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/products/share/{productId}")
    suspend fun retrieveProduct1(@Path("productId") productId: kotlin.Long, @Path("type") type: kotlin.String, @Query("clientId") clientId: kotlin.Long? = null): Response<kotlin.String>

}
