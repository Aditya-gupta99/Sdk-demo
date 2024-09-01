package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetBusinessJobConfigResponse
import org.openapitools.client.models.GetBusinessStepConfigResponse
import org.openapitools.client.models.UpdateBusinessStepConfigRequest

interface BusinessStepConfigurationApi {
    /**
     * List Business Step Configurations for a Job
     * Returns the available Business Steps for a job
     * Responses:
     *  - 200: OK
     *
     * @param jobName jobName
     * @return [GetBusinessStepConfigResponse]
     */
    @GET("v1/jobs/{jobName}/available-steps")
    suspend fun retrieveAllAvailableBusinessStep(@Path("jobName") jobName: kotlin.String): Response<GetBusinessStepConfigResponse>

    /**
     * List Business Jobs
     * Returns the configured Business Jobs
     * Responses:
     *  - 200: OK
     *
     * @return [GetBusinessJobConfigResponse]
     */
    @GET("v1/jobs/names")
    suspend fun retrieveAllConfiguredBusinessJobs(): Response<GetBusinessJobConfigResponse>

    /**
     * List Business Step Configurations for a Job
     * Returns the configured Business Steps for a job
     * Responses:
     *  - 200: OK
     *
     * @param jobName jobName
     * @return [GetBusinessStepConfigResponse]
     */
    @GET("v1/jobs/{jobName}/steps")
    suspend fun retrieveAllConfiguredBusinessStep(@Path("jobName") jobName: kotlin.String): Response<GetBusinessStepConfigResponse>

    /**
     * List Business Step Configurations for a Job
     * Updates the Business steps execution order for a job
     * Responses:
     *  - 204: NO_CONTENT
     *
     * @param jobName jobName
     * @param updateBusinessStepConfigRequest  (optional)
     * @return [Unit]
     */
    @PUT("v1/jobs/{jobName}/steps")
    suspend fun updateJobBusinessStepConfig(@Path("jobName") jobName: kotlin.String, @Body updateBusinessStepConfigRequest: UpdateBusinessStepConfigRequest? = null): Response<Unit>

}
