package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface PovertyLineApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param ppiName 
     * @return [kotlin.String]
     */
    @GET("v1/povertyLine/{ppiName}")
    suspend fun retrieveAll12(@Path("ppiName") ppiName: kotlin.String): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param ppiName 
     * @param likelihoodId 
     * @return [kotlin.String]
     */
    @GET("v1/povertyLine/{ppiName}/{likelihoodId}")
    suspend fun retrieveAll13(@Path("ppiName") ppiName: kotlin.String, @Path("likelihoodId") likelihoodId: kotlin.Long): Response<kotlin.String>

}
