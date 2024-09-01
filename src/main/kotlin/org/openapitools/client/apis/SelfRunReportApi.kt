package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetRunReportResponse

interface SelfRunReportApi {
    /**
     * Running A Report
     * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param reportName reportName
     * @return [GetRunReportResponse]
     */
    @GET("v1/self/runreports/{reportName}")
    suspend fun runReport1(@Path("reportName") reportName: kotlin.String): Response<GetRunReportResponse>

}
