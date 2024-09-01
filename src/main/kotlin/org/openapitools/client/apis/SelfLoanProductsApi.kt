package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface SelfLoanProductsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/loanproducts")
    suspend fun retrieveAllLoanProducts1(@Query("clientId") clientId: kotlin.Long? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param productId 
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/loanproducts/{productId}")
    suspend fun retrieveLoanProductDetails2(@Path("productId") productId: kotlin.Long, @Query("clientId") clientId: kotlin.Long? = null): Response<kotlin.String>

}
