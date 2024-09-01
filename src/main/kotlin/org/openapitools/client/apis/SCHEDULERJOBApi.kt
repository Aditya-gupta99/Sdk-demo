package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ExecuteJobRequest
import org.openapitools.client.models.GetJobsJobIDJobRunHistoryResponse
import org.openapitools.client.models.GetJobsResponse
import org.openapitools.client.models.PutJobsJobIDRequest

interface SCHEDULERJOBApi {
    /**
     * Run a Job
     * Manually Execute Specific Job.
     * Responses:
     *  - 200: POST: jobs/1?command=executeJob
     *
     * @param jobId jobId
     * @param command command (optional)
     * @param executeJobRequest  (optional)
     * @return [Unit]
     */
    @POST("v1/jobs/{jobId}")
    suspend fun executeJob(@Path("jobId") jobId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body executeJobRequest: ExecuteJobRequest? = null): Response<Unit>

    /**
     * Retrieve Scheduler Jobs
     * Returns the list of jobs.  Example Requests:  jobs
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetJobsResponse>]
     */
    @GET("v1/jobs")
    suspend fun retrieveAll8(): Response<kotlin.collections.List<GetJobsResponse>>

    /**
     * Retrieve Job Run History
     * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
     * Responses:
     *  - 200: OK
     *
     * @param jobId jobId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [GetJobsJobIDJobRunHistoryResponse]
     */
    @GET("v1/jobs/{jobId}/runhistory")
    suspend fun retrieveHistory(@Path("jobId") jobId: kotlin.Long, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<GetJobsJobIDJobRunHistoryResponse>

    /**
     * Retrieve a Job
     * Returns the details of a Job.  Example Requests:  jobs/5
     * Responses:
     *  - 200: OK
     *
     * @param jobId jobId
     * @return [GetJobsResponse]
     */
    @GET("v1/jobs/{jobId}")
    suspend fun retrieveOne5(@Path("jobId") jobId: kotlin.Long): Response<GetJobsResponse>

    /**
     * Update a Job
     * Updates the details of a job.
     * Responses:
     *  - 200: OK
     *
     * @param jobId jobId
     * @param putJobsJobIDRequest 
     * @return [Unit]
     */
    @PUT("v1/jobs/{jobId}")
    suspend fun updateJobDetail(@Path("jobId") jobId: kotlin.Long, @Body putJobsJobIDRequest: PutJobsJobIDRequest): Response<Unit>

}
