package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteTemplatesTemplateIdResponse
import org.openapitools.client.models.GetTemplatesResponse
import org.openapitools.client.models.GetTemplatesTemplateIdResponse
import org.openapitools.client.models.GetTemplatesTemplateResponse
import org.openapitools.client.models.PostTemplatesRequest
import org.openapitools.client.models.PostTemplatesResponse
import org.openapitools.client.models.PutTemplatesTemplateIdRequest
import org.openapitools.client.models.PutTemplatesTemplateIdResponse

interface UserGeneratedDocumentsApi {
    /**
     * Add a UGD
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     * Responses:
     *  - 200: OK
     *
     * @param postTemplatesRequest 
     * @return [PostTemplatesResponse]
     */
    @POST("v1/templates")
    suspend fun createTemplate(@Body postTemplatesRequest: PostTemplatesRequest): Response<PostTemplatesResponse>

    /**
     * Delete a UGD
     * 
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @return [DeleteTemplatesTemplateIdResponse]
     */
    @DELETE("v1/templates/{templateId}")
    suspend fun deleteTemplate(@Path("templateId") templateId: kotlin.Long): Response<DeleteTemplatesTemplateIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param templateId 
     * @return [kotlin.String]
     */
    @GET("v1/templates/{templateId}/template")
    suspend fun getTemplateByTemplate(@Path("templateId") templateId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param templateId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/templates/{templateId}")
    suspend fun mergeTemplate(@Path("templateId") templateId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * Retrieve all UGDs
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     * Responses:
     *  - 200: OK
     *
     * @param typeId typeId (optional, default to -1)
     * @param entityId entityId (optional, default to -1)
     * @return [GetTemplatesResponse]
     */
    @GET("v1/templates")
    suspend fun retrieveAll40(@Query("typeId") typeId: kotlin.Int? = -1, @Query("entityId") entityId: kotlin.Int? = -1): Response<GetTemplatesResponse>

    /**
     * Retrieve a UGD
     * Example Requests:  templates/1
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @return [GetTemplatesTemplateIdResponse]
     */
    @GET("v1/templates/{templateId}")
    suspend fun retrieveOne30(@Path("templateId") templateId: kotlin.Long): Response<GetTemplatesTemplateIdResponse>

    /**
     * Update a UGD
     * 
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @param putTemplatesTemplateIdRequest 
     * @return [PutTemplatesTemplateIdResponse]
     */
    @PUT("v1/templates/{templateId}")
    suspend fun saveTemplate(@Path("templateId") templateId: kotlin.Long, @Body putTemplatesTemplateIdRequest: PutTemplatesTemplateIdRequest): Response<PutTemplatesTemplateIdResponse>

    /**
     * Retrieve UGD Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetTemplatesTemplateResponse]
     */
    @GET("v1/templates/template")
    suspend fun template20(): Response<GetTemplatesTemplateResponse>

}
