package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetPasswordPreferencesTemplateResponse
import org.openapitools.client.models.PutPasswordPreferencesTemplateRequest

interface PasswordPreferencesApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [GetPasswordPreferencesTemplateResponse]
     */
    @GET("v1/passwordpreferences")
    suspend fun retrieve1(): Response<GetPasswordPreferencesTemplateResponse>

    /**
     * List Application Password validation policies
     * ARGUMENTS Example Requests:  passwordpreferences
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetPasswordPreferencesTemplateResponse>]
     */
    @GET("v1/passwordpreferences/template")
    suspend fun template21(): Response<kotlin.collections.List<GetPasswordPreferencesTemplateResponse>>

    /**
     * Update password preferences
     * 
     * Responses:
     *  - 200: OK
     *
     * @param putPasswordPreferencesTemplateRequest 
     * @return [Unit]
     */
    @PUT("v1/passwordpreferences")
    suspend fun update25(@Body putPasswordPreferencesTemplateRequest: PutPasswordPreferencesTemplateRequest): Response<Unit>

}
