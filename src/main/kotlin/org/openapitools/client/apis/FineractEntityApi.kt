package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface FineractEntityApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param relId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/entitytoentitymapping/{relId}")
    suspend fun createMap(@Path("relId") relId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param mapId 
     * @return [kotlin.String]
     */
    @DELETE("v1/entitytoentitymapping/{mapId}")
    suspend fun delete4(@Path("mapId") mapId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param mapId 
     * @param fromId 
     * @param toId 
     * @return [kotlin.String]
     */
    @GET("v1/entitytoentitymapping/{mapId}/{fromId}/{toId}")
    suspend fun getEntityToEntityMappings(@Path("mapId") mapId: kotlin.Long, @Path("fromId") fromId: kotlin.Long, @Path("toId") toId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/entitytoentitymapping")
    suspend fun retrieveAll7(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param mapId 
     * @return [kotlin.String]
     */
    @GET("v1/entitytoentitymapping/{mapId}")
    suspend fun retrieveOne4(@Path("mapId") mapId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param mapId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/entitytoentitymapping/{mapId}")
    suspend fun updateMap(@Path("mapId") mapId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
