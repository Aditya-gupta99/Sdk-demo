package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetSurveyResponse
import org.openapitools.client.models.PostSurveySurveyNameApptableIdRequest
import org.openapitools.client.models.PostSurveySurveyNameApptableIdResponse

interface SurveyApi {
    /**
     * Create an entry in the survey table
     * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://fineract.apache.org/legacy-docs/apiLive.htm#survey_create ] 
     * Responses:
     *  - 200: OK
     *
     * @param surveyName surveyName
     * @param apptableId apptableId
     * @param postSurveySurveyNameApptableIdRequest 
     * @return [PostSurveySurveyNameApptableIdResponse]
     */
    @POST("v1/survey/{surveyName}/{apptableId}")
    suspend fun createDatatableEntry1(@Path("surveyName") surveyName: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Body postSurveySurveyNameApptableIdRequest: PostSurveySurveyNameApptableIdRequest): Response<PostSurveySurveyNameApptableIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param surveyName 
     * @param clientId 
     * @param fulfilledId 
     * @return [kotlin.String]
     */
    @DELETE("v1/survey/{surveyName}/{clientId}/{fulfilledId}")
    suspend fun deleteDatatableEntries1(@Path("surveyName") surveyName: kotlin.String, @Path("clientId") clientId: kotlin.Long, @Path("fulfilledId") fulfilledId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param surveyName 
     * @param clientId 
     * @return [kotlin.String]
     */
    @GET("v1/survey/{surveyName}/{clientId}")
    suspend fun getClientSurveyOverview(@Path("surveyName") surveyName: kotlin.String, @Path("clientId") clientId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param surveyName 
     * @param clientId 
     * @param entryId 
     * @return [kotlin.String]
     */
    @GET("v1/survey/{surveyName}/{clientId}/{entryId}")
    suspend fun getSurveyEntry(@Path("surveyName") surveyName: kotlin.String, @Path("clientId") clientId: kotlin.Long, @Path("entryId") entryId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param surveyName 
     * @param apptable 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/survey/register/{surveyName}/{apptable}")
    suspend fun register(@Path("surveyName") surveyName: kotlin.String, @Path("apptable") apptable: kotlin.String, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * Retrieve survey
     * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
     * Responses:
     *  - 200: OK
     *
     * @param surveyName surveyName
     * @return [GetSurveyResponse]
     */
    @GET("v1/survey/{surveyName}")
    suspend fun retrieveSurvey(@Path("surveyName") surveyName: kotlin.String): Response<GetSurveyResponse>

    /**
     * Retrieve surveys
     * Retrieve surveys. This allows to retrieve the list of survey tables registered .
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetSurveyResponse>]
     */
    @GET("v1/survey")
    suspend fun retrieveSurveys(): Response<kotlin.collections.List<GetSurveyResponse>>

}
