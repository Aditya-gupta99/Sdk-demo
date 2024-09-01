package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetLoanRescheduleRequestResponse
import org.openapitools.client.models.GetRescheduleReasonsTemplateResponse
import org.openapitools.client.models.PostCreateRescheduleLoansRequest
import org.openapitools.client.models.PostCreateRescheduleLoansResponse
import org.openapitools.client.models.PostUpdateRescheduleLoansRequest
import org.openapitools.client.models.PostUpdateRescheduleLoansResponse

interface RescheduleLoansApi {
    /**
     * Create loan reschedule request
     * Create a loan reschedule request.
     * Responses:
     *  - 200: OK
     *
     * @param postCreateRescheduleLoansRequest 
     * @return [PostCreateRescheduleLoansResponse]
     */
    @POST("v1/rescheduleloans")
    suspend fun createLoanRescheduleRequest(@Body postCreateRescheduleLoansRequest: PostCreateRescheduleLoansRequest): Response<PostCreateRescheduleLoansResponse>

    /**
     * Retrieve loan reschedule request by schedule id
     * Retrieve loan reschedule request by schedule id
     * Responses:
     *  - 200: OK
     *
     * @param scheduleId 
     * @param command  (optional)
     * @return [GetLoanRescheduleRequestResponse]
     */
    @GET("v1/rescheduleloans/{scheduleId}")
    suspend fun readLoanRescheduleRequest(@Path("scheduleId") scheduleId: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<GetLoanRescheduleRequestResponse>

    /**
     * Retrieve all reschedule requests
     * Retrieve all reschedule requests.
     * Responses:
     *  - 200: OK
     *
     * @param command  (optional)
     * @param loanId  (optional)
     * @return [kotlin.collections.List<GetLoanRescheduleRequestResponse>]
     */
    @GET("v1/rescheduleloans")
    suspend fun retrieveAllRescheduleRequest(@Query("command") command: kotlin.String? = null, @Query("loanId") loanId: kotlin.Long? = null): Response<kotlin.collections.List<GetLoanRescheduleRequestResponse>>

    /**
     * Retrieve all reschedule loan reasons
     * Retrieve all reschedule loan reasons as a template
     * Responses:
     *  - 200: OK
     *
     * @return [GetRescheduleReasonsTemplateResponse]
     */
    @GET("v1/rescheduleloans/template")
    suspend fun retrieveTemplate10(): Response<GetRescheduleReasonsTemplateResponse>

    /**
     * Update loan reschedule request
     * Update a loan reschedule request by either approving/rejecting it.
     * Responses:
     *  - 200: OK
     *
     * @param scheduleId 
     * @param postUpdateRescheduleLoansRequest 
     * @param command  (optional)
     * @return [PostUpdateRescheduleLoansResponse]
     */
    @POST("v1/rescheduleloans/{scheduleId}")
    suspend fun updateLoanRescheduleRequest(@Path("scheduleId") scheduleId: kotlin.Long, @Body postUpdateRescheduleLoansRequest: PostUpdateRescheduleLoansRequest, @Query("command") command: kotlin.String? = null): Response<PostUpdateRescheduleLoansResponse>

}
