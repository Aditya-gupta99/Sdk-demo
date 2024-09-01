package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetFundsResponse
import org.openapitools.client.models.PostFundsRequest
import org.openapitools.client.models.PostFundsResponse
import org.openapitools.client.models.PutFundsFundIdRequest
import org.openapitools.client.models.PutFundsFundIdResponse

interface FundsApi {
    /**
     * Create a Fund
     * Creates a Fund
     * Responses:
     *  - 200: OK
     *
     * @param postFundsRequest 
     * @return [PostFundsResponse]
     */
    @POST("v1/funds")
    suspend fun createFund(@Body postFundsRequest: PostFundsRequest): Response<PostFundsResponse>

    /**
     * Retrieve a Fund
     * Returns the details of a Fund.  Example Requests:  funds/1
     * Responses:
     *  - 200: OK
     *
     * @param fundId fundId
     * @return [GetFundsResponse]
     */
    @GET("v1/funds/{fundId}")
    suspend fun retrieveFund(@Path("fundId") fundId: kotlin.Long): Response<GetFundsResponse>

    /**
     * Retrieve Funds
     * Returns the list of funds.  Example Requests:  funds
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetFundsResponse>]
     */
    @GET("v1/funds")
    suspend fun retrieveFunds(): Response<kotlin.collections.List<GetFundsResponse>>

    /**
     * Update a Fund
     * Updates the details of a fund.
     * Responses:
     *  - 200: OK
     *
     * @param fundId fundId
     * @param putFundsFundIdRequest 
     * @return [PutFundsFundIdResponse]
     */
    @PUT("v1/funds/{fundId}")
    suspend fun updateFund(@Path("fundId") fundId: kotlin.Long, @Body putFundsFundIdRequest: PutFundsFundIdRequest): Response<PutFundsFundIdResponse>

}
