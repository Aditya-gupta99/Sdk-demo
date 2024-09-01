package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetTaxesComponentsResponse
import org.openapitools.client.models.PostTaxesComponentsRequest
import org.openapitools.client.models.PostTaxesComponentsResponse
import org.openapitools.client.models.PutTaxesComponentsTaxComponentIdRequest
import org.openapitools.client.models.PutTaxesComponentsTaxComponentIdResponse

interface TaxComponentsApi {
    /**
     * Create a new Tax Component
     * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
     * Responses:
     *  - 200: OK
     *
     * @param postTaxesComponentsRequest 
     * @return [PostTaxesComponentsResponse]
     */
    @POST("v1/taxes/component")
    suspend fun createTaxCompoent(@Body postTaxesComponentsRequest: PostTaxesComponentsRequest): Response<PostTaxesComponentsResponse>

    /**
     * List Tax Components
     * List Tax Components
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetTaxesComponentsResponse>]
     */
    @GET("v1/taxes/component")
    suspend fun retrieveAllTaxComponents(): Response<kotlin.collections.List<GetTaxesComponentsResponse>>

    /**
     * Retrieve Tax Component
     * Retrieve Tax Component
     * Responses:
     *  - 200: OK
     *
     * @param taxComponentId taxComponentId
     * @return [GetTaxesComponentsResponse]
     */
    @GET("v1/taxes/component/{taxComponentId}")
    suspend fun retrieveTaxComponent(@Path("taxComponentId") taxComponentId: kotlin.Long): Response<GetTaxesComponentsResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/taxes/component/template")
    suspend fun retrieveTemplate21(): Response<kotlin.String>

    /**
     * Update Tax Component
     * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
     * Responses:
     *  - 200: OK
     *
     * @param taxComponentId taxComponentId
     * @param putTaxesComponentsTaxComponentIdRequest 
     * @return [PutTaxesComponentsTaxComponentIdResponse]
     */
    @PUT("v1/taxes/component/{taxComponentId}")
    suspend fun updateTaxCompoent(@Path("taxComponentId") taxComponentId: kotlin.Long, @Body putTaxesComponentsTaxComponentIdRequest: PutTaxesComponentsTaxComponentIdRequest): Response<PutTaxesComponentsTaxComponentIdResponse>

}
