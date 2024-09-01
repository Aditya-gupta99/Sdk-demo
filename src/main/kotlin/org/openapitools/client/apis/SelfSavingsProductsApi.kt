package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface SelfSavingsProductsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsproducts")
    suspend fun retrieveAll38(@Query("clientId") clientId: kotlin.Long? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsproducts/{productId}")
    suspend fun retrieveOne29(@Path("productId") productId: kotlin.Long, @Query("clientId") clientId: kotlin.Long? = null): Response<kotlin.String>

}
