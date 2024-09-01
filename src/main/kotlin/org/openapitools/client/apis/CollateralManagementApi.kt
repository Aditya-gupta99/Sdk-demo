package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteCollateralProductResponse
import org.openapitools.client.models.GetCollateralManagementsResponse
import org.openapitools.client.models.GetCollateralProductTemplate
import org.openapitools.client.models.PostCollateralManagementProductRequest
import org.openapitools.client.models.PostCollateralManagementProductResponse
import org.openapitools.client.models.PutCollateralProductRequest
import org.openapitools.client.models.PutCollateralProductResponse

interface CollateralManagementApi {
    /**
     * Create a new collateral
     * Collateral Creation
     * Responses:
     *  - 200: OK
     *
     * @param postCollateralManagementProductRequest 
     * @return [PostCollateralManagementProductResponse]
     */
    @POST("v1/collateral-management")
    suspend fun createCollateral1(@Body postCollateralManagementProductRequest: PostCollateralManagementProductRequest): Response<PostCollateralManagementProductResponse>

    /**
     * Delete a Collateral
     * Delete Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @return [DeleteCollateralProductResponse]
     */
    @DELETE("v1/collateral-management/{collateralId}")
    suspend fun deleteCollateral2(@Path("collateralId") collateralId: kotlin.Long): Response<DeleteCollateralProductResponse>

    /**
     * Get All Collaterals
     * Fetch all Collateral Products
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCollateralManagementsResponse>]
     */
    @GET("v1/collateral-management")
    suspend fun getAllCollaterals(): Response<kotlin.collections.List<GetCollateralManagementsResponse>>

    /**
     * Get Collateral
     * Fetch Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @return [GetCollateralManagementsResponse]
     */
    @GET("v1/collateral-management/{collateralId}")
    suspend fun getCollateral(@Path("collateralId") collateralId: kotlin.Long): Response<GetCollateralManagementsResponse>

    /**
     * Get Collateral Template
     * Get Collateral Template
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCollateralProductTemplate>]
     */
    @GET("v1/collateral-management/template")
    suspend fun getCollateralTemplate(): Response<kotlin.collections.List<GetCollateralProductTemplate>>

    /**
     * Update Collateral
     * Update Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @param putCollateralProductRequest 
     * @return [PutCollateralProductResponse]
     */
    @PUT("v1/collateral-management/{collateralId}")
    suspend fun updateCollateral2(@Path("collateralId") collateralId: kotlin.Long, @Body putCollateralProductRequest: PutCollateralProductRequest): Response<PutCollateralProductResponse>

}
