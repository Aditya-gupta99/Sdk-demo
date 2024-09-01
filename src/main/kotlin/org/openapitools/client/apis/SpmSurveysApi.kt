package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.SurveyData

interface SpmSurveysApi {
    /**
     * Deactivate Survey
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param command  (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/{id}")
    suspend fun activateOrDeactivateSurvey(@Path("id") id: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<Unit>

    /**
     * Create a Survey
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description
     * Responses:
     *  - 200: OK
     *
     * @param surveyData Create survey (optional)
     * @return [Unit]
     */
    @POST("v1/surveys")
    suspend fun createSurvey(@Body surveyData: SurveyData? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param id 
     * @param surveyData  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/surveys/{id}")
    suspend fun editSurvey(@Path("id") id: kotlin.Long, @Body surveyData: SurveyData? = null): Response<kotlin.String>

    /**
     * List all Surveys
     * 
     * Responses:
     *  - 200: OK
     *
     * @param isActive  (optional)
     * @return [kotlin.collections.List<SurveyData>]
     */
    @GET("v1/surveys")
    suspend fun fetchAllSurveys1(@Query("isActive") isActive: kotlin.Boolean? = null): Response<kotlin.collections.List<SurveyData>>

    /**
     * Retrieve a Survey
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Enter id
     * @return [SurveyData]
     */
    @GET("v1/surveys/{id}")
    suspend fun findSurvey(@Path("id") id: kotlin.Long): Response<SurveyData>

}
