package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetWorkingDaysResponse
import org.openapitools.client.models.GetWorkingDaysTemplateResponse
import org.openapitools.client.models.PutWorkingDaysRequest
import org.openapitools.client.models.PutWorkingDaysResponse

interface WorkingDaysApi {
    /**
     * List Working days
     * Example Requests:  workingdays
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetWorkingDaysResponse>]
     */
    @GET("v1/workingdays")
    suspend fun retrieveAll17(): Response<kotlin.collections.List<GetWorkingDaysResponse>>

    /**
     * Working Days Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetWorkingDaysTemplateResponse]
     */
    @GET("v1/workingdays/template")
    suspend fun template4(): Response<GetWorkingDaysTemplateResponse>

    /**
     * Update a Working Day
     * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
     * Responses:
     *  - 200: OK
     *
     * @param putWorkingDaysRequest 
     * @return [PutWorkingDaysResponse]
     */
    @PUT("v1/workingdays")
    suspend fun update8(@Body putWorkingDaysRequest: PutWorkingDaysRequest): Response<PutWorkingDaysResponse>

}
