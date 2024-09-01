package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface BulkLoansApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loans/loanreassignment")
    suspend fun loanReassignment(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param fromLoanOfficerId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/loans/loanreassignment/template")
    suspend fun loanReassignmentTemplate(@Query("officeId") officeId: kotlin.Long? = null, @Query("fromLoanOfficerId") fromLoanOfficerId: kotlin.Long? = null): Response<kotlin.String>

}
