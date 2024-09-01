package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface ProductMixApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loanproducts/{productId}/productmix")
    suspend fun createProductMix(@Path("productId") productId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @return [kotlin.String]
     */
    @DELETE("v1/loanproducts/{productId}/productmix")
    suspend fun deleteProductMix(@Path("productId") productId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @return [kotlin.String]
     */
    @GET("v1/loanproducts/{productId}/productmix")
    suspend fun retrieveTemplate12(@Path("productId") productId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loanproducts/{productId}/productmix")
    suspend fun updateProductMix(@Path("productId") productId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
