package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface MixMappingApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/mixmapping")
    suspend fun retrieveTaxonomyMapping(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/mixmapping")
    suspend fun updateTaxonomyMapping(@Body body: kotlin.String? = null): Response<kotlin.String>

}
