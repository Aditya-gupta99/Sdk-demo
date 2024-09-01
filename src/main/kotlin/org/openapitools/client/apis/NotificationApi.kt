package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetNotificationsResponse

interface NotificationApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderBy orderBy (optional)
     * @param limit limit (optional)
     * @param offset offset (optional)
     * @param sortOrder sortOrder (optional)
     * @param isRead isRead (optional)
     * @return [GetNotificationsResponse]
     */
    @GET("v1/notifications")
    suspend fun getAllNotifications(@Query("orderBy") orderBy: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = null, @Query("offset") offset: kotlin.Int? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("isRead") isRead: kotlin.Boolean? = null): Response<GetNotificationsResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [Unit]
     */
    @PUT("v1/notifications")
    suspend fun update5(): Response<Unit>

}
