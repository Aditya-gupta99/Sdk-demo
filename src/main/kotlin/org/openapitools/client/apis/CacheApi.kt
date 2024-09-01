package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetCachesResponse
import org.openapitools.client.models.PutCachesRequest
import org.openapitools.client.models.PutCachesResponse

interface CacheApi {
    /**
     * Retrieve Cache Types
     * Returns the list of caches.  Example Requests:  caches
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCachesResponse>]
     */
    @GET("v1/caches")
    suspend fun retrieveAll4(): Response<kotlin.collections.List<GetCachesResponse>>

    /**
     * Switch Cache
     * Switches the cache to chosen one.
     * Responses:
     *  - 200: OK
     *
     * @param putCachesRequest 
     * @return [PutCachesResponse]
     */
    @PUT("v1/caches")
    suspend fun switchCache(@Body putCachesRequest: PutCachesRequest): Response<PutCachesResponse>

}
