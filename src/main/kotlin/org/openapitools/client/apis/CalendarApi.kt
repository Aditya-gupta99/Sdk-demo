package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface CalendarApi {
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
    @POST("v1/{entityType}/{entityId}/calendars")
    suspend fun createCalendar(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param calendarId 
     * @return [kotlin.String]
     */
    @DELETE("v1/{entityType}/{entityId}/calendars/{calendarId}")
    suspend fun deleteCalendar(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("calendarId") calendarId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param calendarId 
     * @param entityType 
     * @param entityId 
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/calendars/{calendarId}")
    suspend fun retrieveCalendar(@Path("calendarId") calendarId: kotlin.Long, @Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param calendarType  (optional, default to "all")
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/calendars")
    suspend fun retrieveCalendarsByEntity(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Query("calendarType") calendarType: kotlin.String? = "all"): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/calendars/template")
    suspend fun retrieveNewCalendarDetails(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType 
     * @param entityId 
     * @param calendarId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/{entityType}/{entityId}/calendars/{calendarId}")
    suspend fun updateCalendar(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("calendarId") calendarId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
