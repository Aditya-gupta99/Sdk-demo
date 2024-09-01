package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.SurveyData

interface SelfSpmApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.collections.List<SurveyData>]
     */
    @GET("v1/self/surveys")
    suspend fun fetchAllSurveys(): Response<kotlin.collections.List<SurveyData>>

}
