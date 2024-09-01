package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.InlineJobRequest
import org.openapitools.client.models.InlineJobResponse

interface InlineJobApi {
    /**
     * Starts an inline Job
     * Starts an inline Job
     * Responses:
     *  - 200: OK
     *  - 400: Request body item size validation error
     *
     * @param jobName jobName
     * @param inlineJobRequest  (optional)
     * @return [InlineJobResponse]
     */
    @POST("v1/jobs/{jobName}/inline")
    suspend fun executeInlineJob(@Path("jobName") jobName: kotlin.String, @Body inlineJobRequest: InlineJobRequest? = null): Response<InlineJobResponse>

}
