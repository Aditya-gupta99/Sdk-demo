package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.GetExternalEventConfigurationsResponse
import org.openapitools.client.models.PutExternalEventConfigurationsRequest

interface ExternalEventConfigurationApi {
    /**
     * List all external event configurations
     * 
     * Responses:
     *  - 200: List of all external event configurations
     *
     * @return [GetExternalEventConfigurationsResponse]
     */
    @GET("v1/externalevents/configuration")
    suspend fun retrieveExternalEventConfiguration(): Response<GetExternalEventConfigurationsResponse>

    /**
     * Enable/Disable external events posting
     * 
     * Responses:
     *  - 200: OK
     *
     * @param putExternalEventConfigurationsRequest 
     * @return [CommandProcessingResult]
     */
    @PUT("v1/externalevents/configuration")
    suspend fun updateExternalEventConfigurationsDetails(@Body putExternalEventConfigurationsRequest: PutExternalEventConfigurationsRequest): Response<CommandProcessingResult>

}
