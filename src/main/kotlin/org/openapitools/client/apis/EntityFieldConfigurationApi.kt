package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetFieldConfigurationEntityResponse

interface EntityFieldConfigurationApi {
    /**
     * Retrieves the Entity Field Configuration
     * It retrieves all the Entity Field Configuration
     * Responses:
     *  - 200: OK
     *
     * @param entity entity
     * @return [kotlin.collections.List<GetFieldConfigurationEntityResponse>]
     */
    @GET("v1/fieldconfiguration/{entity}")
    suspend fun getAddresses(@Path("entity") entity: kotlin.String): Response<kotlin.collections.List<GetFieldConfigurationEntityResponse>>

}
