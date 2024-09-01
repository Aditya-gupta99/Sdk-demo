package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface LoanCollateralManagementApi {
    /**
     * Delete Loan Collateral
     * Delete Loan Collateral
     * Responses:
     *  - 0: default response
     *
     * @param loanId loanId
     * @param id loan collateral id
     * @return [kotlin.String]
     */
    @DELETE("v1/loan-collateral-management/{id}")
    suspend fun deleteLoanCollateral(@Path("loanId") loanId: kotlin.Long, @Path("id") id: kotlin.Long): Response<kotlin.String>

    /**
     * Get Loan Collateral Details
     * Get Loan Collateral Details
     * Responses:
     *  - 0: default response
     *
     * @param collateralId collateralId
     * @return [kotlin.String]
     */
    @GET("v1/loan-collateral-management/{collateralId}")
    suspend fun getLoanCollateral(@Path("collateralId") collateralId: kotlin.Long): Response<kotlin.String>

}
