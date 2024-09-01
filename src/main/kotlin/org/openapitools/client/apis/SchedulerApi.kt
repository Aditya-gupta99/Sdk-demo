package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetSchedulerResponse

interface SchedulerApi {
    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     * Activates the scheduler job service. | Suspends the scheduler job service.
     * Responses:
     *  - 200: POST :  scheduler?command=start   POST : scheduler?command=stop
     *
     * @param command command (optional)
     * @return [Unit]
     */
    @POST("v1/scheduler")
    suspend fun changeSchedulerStatus(@Query("command") command: kotlin.String? = null): Response<Unit>

    /**
     * Retrieve Scheduler Status
     * Returns the scheduler status.  Example Requests:  scheduler
     * Responses:
     *  - 200: OK
     *
     * @return [GetSchedulerResponse]
     */
    @GET("v1/scheduler")
    suspend fun retrieveStatus(): Response<GetSchedulerResponse>

}
