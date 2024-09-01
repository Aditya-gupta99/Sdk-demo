package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteCodeValueDataResponse
import org.openapitools.client.models.GetCodeValuesDataResponse
import org.openapitools.client.models.PostCodeValueDataResponse
import org.openapitools.client.models.PostCodeValuesDataRequest
import org.openapitools.client.models.PutCodeValueDataResponse
import org.openapitools.client.models.PutCodeValuesDataRequest

interface CodeValuesApi {
    /**
     * Create a Code description
     * 
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param postCodeValuesDataRequest 
     * @return [PostCodeValueDataResponse]
     */
    @POST("v1/codes/{codeId}/codevalues")
    suspend fun createCodeValue(@Path("codeId") codeId: kotlin.Long, @Body postCodeValuesDataRequest: PostCodeValuesDataRequest): Response<PostCodeValueDataResponse>

    /**
     * Delete a Code description
     * Deletes a code description
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param codeValueId codeValueId
     * @return [DeleteCodeValueDataResponse]
     */
    @DELETE("v1/codes/{codeId}/codevalues/{codeValueId}")
    suspend fun deleteCodeValue(@Path("codeId") codeId: kotlin.Long, @Path("codeValueId") codeValueId: kotlin.Long): Response<DeleteCodeValueDataResponse>

    /**
     * List Code Values
     * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
     * Responses:
     *  - 200: A List of code values for a given code
     *
     * @param codeId codeId
     * @return [kotlin.collections.List<GetCodeValuesDataResponse>]
     */
    @GET("v1/codes/{codeId}/codevalues")
    suspend fun retrieveAllCodeValues(@Path("codeId") codeId: kotlin.Long): Response<kotlin.collections.List<GetCodeValuesDataResponse>>

    /**
     * Retrieve a Code description
     * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
     * Responses:
     *  - 200: OK
     *
     * @param codeValueId codeValueId
     * @param codeId codeId
     * @return [GetCodeValuesDataResponse]
     */
    @GET("v1/codes/{codeId}/codevalues/{codeValueId}")
    suspend fun retrieveCodeValue(@Path("codeValueId") codeValueId: kotlin.Long, @Path("codeId") codeId: kotlin.Long): Response<GetCodeValuesDataResponse>

    /**
     * Update a Code description
     * Updates the details of a code description.
     * Responses:
     *  - 200: OK
     *
     * @param codeId codeId
     * @param codeValueId codeValueId
     * @param putCodeValuesDataRequest 
     * @return [PutCodeValueDataResponse]
     */
    @PUT("v1/codes/{codeId}/codevalues/{codeValueId}")
    suspend fun updateCodeValue(@Path("codeId") codeId: kotlin.Long, @Path("codeValueId") codeValueId: kotlin.Long, @Body putCodeValuesDataRequest: PutCodeValuesDataRequest): Response<PutCodeValueDataResponse>

}
