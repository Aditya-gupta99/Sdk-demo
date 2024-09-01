package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ScorecardData

interface SelfScoreCardApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param surveyId 
     * @param scorecardData  (optional)
     * @return [Unit]
     */
    @POST("v1/self/surveys/scorecards/{surveyId}")
    suspend fun createScorecard(@Path("surveyId") surveyId: kotlin.Long, @Body scorecardData: ScorecardData? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId 
     * @return [kotlin.collections.List<ScorecardData>]
     */
    @GET("v1/self/surveys/scorecards/clients/{clientId}")
    suspend fun findByClient(@Path("clientId") clientId: kotlin.Long): Response<kotlin.collections.List<ScorecardData>>

}
