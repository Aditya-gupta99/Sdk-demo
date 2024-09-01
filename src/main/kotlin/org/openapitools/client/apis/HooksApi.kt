package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteHookResponse
import org.openapitools.client.models.GetHookResponse
import org.openapitools.client.models.GetHookTemplateResponse
import org.openapitools.client.models.PostHookRequest
import org.openapitools.client.models.PostHookResponse
import org.openapitools.client.models.PutHookRequest
import org.openapitools.client.models.PutHookResponse

interface HooksApi {
    /**
     * Create a Hook
     * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
     * Responses:
     *  - 200: OK
     *
     * @param postHookRequest 
     * @return [PostHookResponse]
     */
    @POST("v1/hooks")
    suspend fun createHook(@Body postHookRequest: PostHookRequest): Response<PostHookResponse>

    /**
     * Delete a Hook
     * Deletes a hook.
     * Responses:
     *  - 200: OK
     *
     * @param hookId hookId
     * @return [DeleteHookResponse]
     */
    @DELETE("v1/hooks/{hookId}")
    suspend fun deleteHook(@Path("hookId") hookId: kotlin.Long): Response<DeleteHookResponse>

    /**
     * Retrieve a Hook
     * Returns the details of a Hook.  Example Requests:  hooks/1
     * Responses:
     *  - 200: OK
     *
     * @param hookId hookId
     * @return [GetHookResponse]
     */
    @GET("v1/hooks/{hookId}")
    suspend fun retrieveHook(@Path("hookId") hookId: kotlin.Long): Response<GetHookResponse>

    /**
     * Retrieve Hooks
     * Returns the list of hooks.  Example Requests:  hooks
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetHookResponse>]
     */
    @GET("v1/hooks")
    suspend fun retrieveHooks(): Response<kotlin.collections.List<GetHookResponse>>

    /**
     * Retrieve Hooks Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetHookTemplateResponse]
     */
    @GET("v1/hooks/template")
    suspend fun template3(): Response<GetHookTemplateResponse>

    /**
     * Update a Hook
     * Updates the details of a hook.
     * Responses:
     *  - 200: OK
     *
     * @param hookId hookId
     * @param putHookRequest 
     * @return [PutHookResponse]
     */
    @PUT("v1/hooks/{hookId}")
    suspend fun updateHook(@Path("hookId") hookId: kotlin.Long, @Body putHookRequest: PutHookRequest): Response<PutHookResponse>

}
