package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.PostRunaccrualsRequest

interface PeriodicAccrualAccountingApi {
    /**
     * Executes Periodic Accrual Accounting
     * Mandatory Fields  tillDate 
     * Responses:
     *  - 200: OK
     *
     * @param postRunaccrualsRequest 
     * @return [Unit]
     */
    @POST("v1/runaccruals")
    suspend fun executePeriodicAccrualAccounting(@Body postRunaccrualsRequest: PostRunaccrualsRequest): Response<Unit>

}
