package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ReportMailingJobRunHistoryData

interface ListReportMailingJobHistoryApi {
    /**
     * List Report Mailing Job History
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     * Responses:
     *  - 200: OK
     *
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [ReportMailingJobRunHistoryData]
     */
    @GET("v1/reportmailingjobrunhistory")
    suspend fun retrieveAllByReportMailingJobId(@Query("reportMailingJobId") reportMailingJobId: kotlin.Long? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<ReportMailingJobRunHistoryData>

}
