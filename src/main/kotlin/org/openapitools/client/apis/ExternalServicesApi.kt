package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ExternalServicesPropertiesData
import org.openapitools.client.models.PutExternalServiceRequest

interface ExternalServicesApi {
    /**
     * Retrieve External Services Configuration
     * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
     * Responses:
     *  - 200: OK
     *
     * @param servicename servicename
     * @return [ExternalServicesPropertiesData]
     */
    @GET("v1/externalservice/{servicename}")
    suspend fun retrieveOne2(@Path("servicename") servicename: kotlin.String): Response<ExternalServicesPropertiesData>

    /**
     * Update External Service
     * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
     * Responses:
     *  - 200: OK
     *
     * @param servicename servicename
     * @param putExternalServiceRequest 
     * @return [Unit]
     */
    @PUT("v1/externalservice/{servicename}")
    suspend fun updateExternalServiceProperties(@Path("servicename") servicename: kotlin.String, @Body putExternalServiceRequest: PutExternalServiceRequest): Response<Unit>

}
