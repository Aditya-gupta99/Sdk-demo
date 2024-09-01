package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface LikelihoodApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param likelihoodId 
     * @param ppiName 
     * @return [kotlin.String]
     */
    @GET("v1/likelihood/{ppiName}/{likelihoodId}")
    suspend fun retrieve(@Path("likelihoodId") likelihoodId: kotlin.Long, @Path("ppiName") ppiName: kotlin.String): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param ppiName 
     * @return [kotlin.String]
     */
    @GET("v1/likelihood/{ppiName}")
    suspend fun retrieveAll11(@Path("ppiName") ppiName: kotlin.String): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param likelihoodId 
     * @param ppiName 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/likelihood/{ppiName}/{likelihoodId}")
    suspend fun update4(@Path("likelihoodId") likelihoodId: kotlin.Long, @Path("ppiName") ppiName: kotlin.String, @Body body: kotlin.String? = null): Response<kotlin.String>

}
