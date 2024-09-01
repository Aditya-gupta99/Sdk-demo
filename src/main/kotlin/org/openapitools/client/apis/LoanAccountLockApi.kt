package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetLoanAccountLockResponse

interface LoanAccountLockApi {
    /**
     * List locked loan accounts
     * Returns the locked loan IDs
     * Responses:
     *  - 200: OK
     *
     * @param page  (optional)
     * @param limit  (optional)
     * @return [GetLoanAccountLockResponse]
     */
    @GET("v1/loans/locked")
    suspend fun retrieveLockedAccounts(@Query("page") page: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<GetLoanAccountLockResponse>

}
