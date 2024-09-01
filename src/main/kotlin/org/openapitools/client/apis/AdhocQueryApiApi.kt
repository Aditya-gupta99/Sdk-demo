package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface AdhocQueryApiApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/adhocquery")
    suspend fun createAdHocQuery(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param adHocId adHocId
     * @return [kotlin.String]
     */
    @DELETE("v1/adhocquery/{adHocId}")
    suspend fun deleteAdHocQuery(@Path("adHocId") adHocId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param adHocId adHocId
     * @return [kotlin.String]
     */
    @GET("v1/adhocquery/{adHocId}")
    suspend fun retrieveAdHocQuery(@Path("adHocId") adHocId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/adhocquery")
    suspend fun retrieveAll2(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/adhocquery/template")
    suspend fun template(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param adHocId adHocId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/adhocquery/{adHocId}")
    suspend fun update(@Path("adHocId") adHocId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
