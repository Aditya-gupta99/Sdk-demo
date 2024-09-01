package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetOfficesResponse
import org.openapitools.client.models.GetOfficesTemplateResponse
import org.openapitools.client.models.PostOfficesRequest
import org.openapitools.client.models.PostOfficesResponse
import org.openapitools.client.models.PutOfficesOfficeIdRequest
import org.openapitools.client.models.PutOfficesOfficeIdResponse

import okhttp3.MultipartBody

interface OfficesApi {
    /**
     * Create an Office
     * Mandatory Fields name, openingDate, parentId
     * Responses:
     *  - 200: OK
     *
     * @param postOfficesRequest 
     * @return [PostOfficesResponse]
     */
    @POST("v1/offices")
    suspend fun createOffice(@Body postOfficesRequest: PostOfficesRequest): Response<PostOfficesResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/offices/downloadtemplate")
    suspend fun getOfficeTemplate(@Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/offices/uploadtemplate")
    suspend fun postOfficeTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * Retrieve an Office
     * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId
     * @return [GetOfficesResponse]
     */
    @GET("v1/offices/{officeId}")
    suspend fun retrieveOffice(@Path("officeId") officeId: kotlin.Long): Response<GetOfficesResponse>

    /**
     * Retrieve an Office using external id
     * Example Requests:  offices/external-id/asd123   offices/external-id/asd123?template&#x3D;true   offices/external-id/asd123?fields&#x3D;id,name,parentName
     * Responses:
     *  - 0: default response
     *
     * @param externalId externalId
     * @return [GetOfficesResponse]
     */
    @GET("v1/offices/external-id/{externalId}")
    suspend fun retrieveOfficeByExternalId(@Path("externalId") externalId: kotlin.String): Response<GetOfficesResponse>

    /**
     * Retrieve Office Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetOfficesTemplateResponse]
     */
    @GET("v1/offices/template")
    suspend fun retrieveOfficeTemplate1(): Response<GetOfficesTemplateResponse>

    /**
     * List Offices
     * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
     * Responses:
     *  - 200: OK
     *
     * @param includeAllOffices includeAllOffices (optional, default to false)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetOfficesResponse>]
     */
    @GET("v1/offices")
    suspend fun retrieveOffices(@Query("includeAllOffices") includeAllOffices: kotlin.Boolean? = false, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<kotlin.collections.List<GetOfficesResponse>>

    /**
     * Update Office
     * 
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId
     * @param putOfficesOfficeIdRequest 
     * @return [PutOfficesOfficeIdResponse]
     */
    @PUT("v1/offices/{officeId}")
    suspend fun updateOffice(@Path("officeId") officeId: kotlin.Long, @Body putOfficesOfficeIdRequest: PutOfficesOfficeIdRequest): Response<PutOfficesOfficeIdResponse>

    /**
     * Update Office
     * 
     * Responses:
     *  - 0: default response
     *
     * @param externalId externalId
     * @param putOfficesOfficeIdRequest 
     * @return [PutOfficesOfficeIdResponse]
     */
    @PUT("v1/offices/external-id/{externalId}")
    suspend fun updateOfficeWithExternalId(@Path("externalId") externalId: kotlin.String, @Body putOfficesOfficeIdRequest: PutOfficesOfficeIdRequest): Response<PutOfficesOfficeIdResponse>

}
