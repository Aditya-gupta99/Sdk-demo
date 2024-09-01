package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface MeetingsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/{entityType}/{entityId}/meetings")
    suspend fun createMeeting(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param meetingId 
     * @return [kotlin.String]
     */
    @DELETE("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun deleteMeeting(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("meetingId") meetingId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param meetingId 
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun performMeetingCommands(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("meetingId") meetingId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param meetingId 
     * @param entityType 
     * @param entityId 
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun retrieveMeeting(@Path("meetingId") meetingId: kotlin.Long, @Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param limit  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings")
    suspend fun retrieveMeetings(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Query("limit") limit: kotlin.Int? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param calendarId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings/template")
    suspend fun template11(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Query("calendarId") calendarId: kotlin.Long? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param meetingId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun updateMeeting(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("meetingId") meetingId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
