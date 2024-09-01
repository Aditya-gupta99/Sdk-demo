package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.PostAuthenticationRequest
import org.openapitools.client.models.PostAuthenticationResponse

interface AuthenticationHTTPBasicApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.
     * Responses:
     *  - 200: OK
     *  - 400: Unauthenticated. Please login
     *
     * @param postAuthenticationRequest 
     * @param returnClientList  (optional, default to false)
     * @return [PostAuthenticationResponse]
     */
    @POST("v1/authentication")
    suspend fun authenticate(@Body postAuthenticationRequest: PostAuthenticationRequest, @Query("returnClientList") returnClientList: kotlin.Boolean? = false): Response<PostAuthenticationResponse>

}
