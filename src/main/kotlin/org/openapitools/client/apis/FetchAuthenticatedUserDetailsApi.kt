package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetUserDetailsResponse

interface FetchAuthenticatedUserDetailsApi {
    /**
     * Fetch authenticated user details 
     * checks the Authentication and returns the set roles and permissions allowed.
     * Responses:
     *  - 200: OK
     *
     * @return [GetUserDetailsResponse]
     */
    @GET("v1/userdetails")
    suspend fun fetchAuthenticatedUserData(): Response<GetUserDetailsResponse>

}
