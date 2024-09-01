package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface LoanDisbursementDetailsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loans/{loanId}/disbursements/editDisbursements")
    suspend fun addAndDeleteDisbursementDetail(@Path("loanId") loanId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param disbursementId 
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/disbursements/{disbursementId}")
    suspend fun retriveDetail(@Path("loanId") loanId: kotlin.Long, @Path("disbursementId") disbursementId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param disbursementId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loans/{loanId}/disbursements/{disbursementId}")
    suspend fun updateDisbursementDate(@Path("loanId") loanId: kotlin.Long, @Path("disbursementId") disbursementId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
