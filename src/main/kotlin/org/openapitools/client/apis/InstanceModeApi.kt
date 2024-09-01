package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ChangeInstanceModeRequest

interface InstanceModeApi {
    /**
     * Changes the Fineract instance mode
     * 
     * Responses:
     *  - 200: OK
     *
     * @param changeInstanceModeRequest 
     * @return [Unit]
     */
    @PUT("v1/instance-mode")
    suspend fun changeMode(@Body changeInstanceModeRequest: ChangeInstanceModeRequest): Response<Unit>

}
