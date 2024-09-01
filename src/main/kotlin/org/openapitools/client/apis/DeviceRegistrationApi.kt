package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface DeviceRegistrationApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param id 
     * @return [kotlin.String]
     */
    @DELETE("v1/self/device/registration/{id}")
    suspend fun delete5(@Path("id") id: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/self/device/registration")
    suspend fun registerDevice(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/self/device/registration")
    suspend fun retrieveAllDeviceRegistrations(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param id 
     * @return [kotlin.String]
     */
    @GET("v1/self/device/registration/{id}")
    suspend fun retrieveDeviceRegiistration(@Path("id") id: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId 
     * @return [kotlin.String]
     */
    @GET("v1/self/device/registration/client/{clientId}")
    suspend fun retrieveDeviceRegistrationByClientId(@Path("clientId") clientId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param id 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/self/device/registration/{id}")
    suspend fun updateDeviceRegistration(@Path("id") id: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
