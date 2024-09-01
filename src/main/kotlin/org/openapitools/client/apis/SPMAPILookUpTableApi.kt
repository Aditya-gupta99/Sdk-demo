package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.LookupTableData

interface SPMAPILookUpTableApi {
    /**
     * Create a Lookup Table entry
     * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param lookupTableData  (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/{surveyId}/lookuptables")
    suspend fun createLookupTable(@Path("surveyId") surveyId: kotlin.Long, @Body lookupTableData: LookupTableData? = null): Response<Unit>

    /**
     * List all Lookup Table entries
     * List all Lookup Table entries for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @return [kotlin.collections.List<LookupTableData>]
     */
    @GET("v1/surveys/{surveyId}/lookuptables")
    suspend fun fetchLookupTables(@Path("surveyId") surveyId: kotlin.Long): Response<kotlin.collections.List<LookupTableData>>

    /**
     * Retrieve a Lookup Table entry
     * Retrieve a Lookup Table entry for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param key Enter key
     * @return [LookupTableData]
     */
    @GET("v1/surveys/{surveyId}/lookuptables/{key}")
    suspend fun findLookupTable(@Path("surveyId") surveyId: kotlin.Long, @Path("key") key: kotlin.String): Response<LookupTableData>

}
