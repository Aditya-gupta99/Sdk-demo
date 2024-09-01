package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetSearchResponse
import org.openapitools.client.models.PostAdhocQuerySearchRequest
import org.openapitools.client.models.PostAdhocQuerySearchResponse

interface SearchAPIApi {
    /**
     * Adhoc query search
     * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
     * Responses:
     *  - 200: OK
     *
     * @param postAdhocQuerySearchRequest 
     * @return [kotlin.collections.List<PostAdhocQuerySearchResponse>]
     */
    @POST("v1/search/advance")
    suspend fun advancedSearch(@Body postAdhocQuerySearchRequest: PostAdhocQuerySearchRequest): Response<kotlin.collections.List<PostAdhocQuerySearchResponse>>

    /**
     * Retrive Adhoc Search query template
     * Mandatory Fields  search?query&#x3D;000000001 
     * Responses:
     *  - 200: OK
     *
     * @return [GetSearchResponse]
     */
    @GET("v1/search/template")
    suspend fun retrieveAdHocSearchQueryTemplate(): Response<GetSearchResponse>

    /**
     * Search Resources
     * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param query query (optional)
     * @param resource resource (optional)
     * @param exactMatch exactMatch (optional, default to false)
     * @return [kotlin.collections.List<GetSearchResponse>]
     */
    @GET("v1/search")
    suspend fun searchData(@Query("query") query: kotlin.String? = null, @Query("resource") resource: kotlin.String? = null, @Query("exactMatch") exactMatch: kotlin.Boolean? = false): Response<kotlin.collections.List<GetSearchResponse>>

}
