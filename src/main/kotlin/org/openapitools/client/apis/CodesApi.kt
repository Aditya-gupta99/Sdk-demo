package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteCodesResponse
import org.openapitools.client.models.GetCodesResponse
import org.openapitools.client.models.PostCodesRequest
import org.openapitools.client.models.PostCodesResponse
import org.openapitools.client.models.PutCodesRequest
import org.openapitools.client.models.PutCodesResponse

interface CodesApi {
    /**
     * Create a Code
     * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
     * Responses:
     *  - 200: OK
     *
     * @param postCodesRequest 
     * @return [PostCodesResponse]
     */
    @POST("v1/codes")
    suspend fun createCode(@Body postCodesRequest: PostCodesRequest): Response<PostCodesResponse>

    /**
     * Delete a Code
     * Deletes a code if it is not system defined.
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @return [DeleteCodesResponse]
     */
    @DELETE("v1/codes/{codeId}")
    suspend fun deleteCode(@Path("codeId") codeId: kotlin.Long): Response<DeleteCodesResponse>

    /**
     * Retrieve a Code
     * Returns the details of a Code.  Example Requests:  codes/1
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @return [GetCodesResponse]
     */
    @GET("v1/codes/{codeId}")
    suspend fun retrieveCode(@Path("codeId") codeId: kotlin.Long): Response<GetCodesResponse>

    /**
     * Retrieve Codes
     * Returns the list of codes.  Example Requests:  codes
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCodesResponse>]
     */
    @GET("v1/codes")
    suspend fun retrieveCodes(): Response<kotlin.collections.List<GetCodesResponse>>

    /**
     * Update a Code
     * Updates the details of a code if it is not system defined.
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param putCodesRequest 
     * @return [PutCodesResponse]
     */
    @PUT("v1/codes/{codeId}")
    suspend fun updateCode(@Path("codeId") codeId: kotlin.Long, @Body putCodesRequest: PutCodesRequest): Response<PutCodesResponse>

}
