package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteReportMailingJobsResponse
import org.openapitools.client.models.GetReportMailingJobsResponse
import org.openapitools.client.models.GetReportMailingJobsTemplate
import org.openapitools.client.models.PostReportMailingJobsRequest
import org.openapitools.client.models.PostReportMailingJobsResponse
import org.openapitools.client.models.PutReportMailingJobsRequest
import org.openapitools.client.models.PutReportMailingJobsResponse

interface ReportMailingJobsApi {
    /**
     * Create a Report Mailing Job
     * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
     * Responses:
     *  - 200: OK
     *
     * @param postReportMailingJobsRequest 
     * @return [PostReportMailingJobsResponse]
     */
    @POST("v1/reportmailingjobs")
    suspend fun createReportMailingJob(@Body postReportMailingJobsRequest: PostReportMailingJobsRequest): Response<PostReportMailingJobsResponse>

    /**
     * Delete a Report Mailing Job
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityId entityId
     * @param body 
     * @return [DeleteReportMailingJobsResponse]
     */
    @DELETE("v1/reportmailingjobs/{entityId}")
    suspend fun deleteReportMailingJob(@Path("entityId") entityId: kotlin.Long, @Body body: kotlin.Any): Response<DeleteReportMailingJobsResponse>

    /**
     * List Report Mailing Jobs
     * Example Requests:  reportmailingjobs
     * Responses:
     *  - 200: OK
     *
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetReportMailingJobsResponse>]
     */
    @GET("v1/reportmailingjobs")
    suspend fun retrieveAllReportMailingJobs(@Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<kotlin.collections.List<GetReportMailingJobsResponse>>

    /**
     * Retrieve a Report Mailing Job
     * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param entityId entityId
     * @return [GetReportMailingJobsResponse]
     */
    @GET("v1/reportmailingjobs/{entityId}")
    suspend fun retrieveReportMailingJob(@Path("entityId") entityId: kotlin.Long): Response<GetReportMailingJobsResponse>

    /**
     * Retrieve Report Mailing Job Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetReportMailingJobsTemplate]
     */
    @GET("v1/reportmailingjobs/template")
    suspend fun retrieveReportMailingJobTemplate(): Response<GetReportMailingJobsTemplate>

    /**
     * Update a Report Mailing Job 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityId entityId
     * @param putReportMailingJobsRequest 
     * @return [PutReportMailingJobsResponse]
     */
    @PUT("v1/reportmailingjobs/{entityId}")
    suspend fun updateReportMailingJob(@Path("entityId") entityId: kotlin.Long, @Body putReportMailingJobsRequest: PutReportMailingJobsRequest): Response<PutReportMailingJobsResponse>

}
