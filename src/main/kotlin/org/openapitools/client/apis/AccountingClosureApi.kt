package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteGlClosuresResponse
import org.openapitools.client.models.GetGlClosureResponse
import org.openapitools.client.models.PostGlClosuresRequest
import org.openapitools.client.models.PostGlClosuresResponse
import org.openapitools.client.models.PutGlClosuresRequest
import org.openapitools.client.models.PutGlClosuresResponse

interface AccountingClosureApi {
    /**
     * Create an Accounting Closure
     * Mandatory Fields officeId,closingDate
     * Responses:
     *  - 200: OK
     *
     * @param postGlClosuresRequest 
     * @return [PostGlClosuresResponse]
     */
    @POST("v1/glclosures")
    suspend fun createGLClosure(@Body postGlClosuresRequest: PostGlClosuresRequest): Response<PostGlClosuresResponse>

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glclosureId
     * @return [DeleteGlClosuresResponse]
     */
    @DELETE("v1/glclosures/{glClosureId}")
    suspend fun deleteGLClosure(@Path("glClosureId") glClosureId: kotlin.Long): Response<DeleteGlClosuresResponse>

    /**
     * Retrieve an Accounting Closure
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glClosureId
     * @return [GetGlClosureResponse]
     */
    @GET("v1/glclosures/{glClosureId}")
    suspend fun retreiveClosure(@Path("glClosureId") glClosureId: kotlin.Long): Response<GetGlClosureResponse>

    /**
     * List Accounting closures
     * Example Requests:  glclosures
     * Responses:
     *  - 200: OK
     *
     * @param officeId  (optional)
     * @return [kotlin.collections.List<GetGlClosureResponse>]
     */
    @GET("v1/glclosures")
    suspend fun retrieveAllClosures(@Query("officeId") officeId: kotlin.Long? = null): Response<kotlin.collections.List<GetGlClosureResponse>>

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glClosureId
     * @param putGlClosuresRequest  (optional)
     * @return [PutGlClosuresResponse]
     */
    @PUT("v1/glclosures/{glClosureId}")
    suspend fun updateGLClosure(@Path("glClosureId") glClosureId: kotlin.Long, @Body putGlClosuresRequest: PutGlClosuresRequest? = null): Response<PutGlClosuresResponse>

}
