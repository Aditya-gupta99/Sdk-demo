package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetProductsTypeProductIdResponse
import org.openapitools.client.models.GetProductsTypeResponse
import org.openapitools.client.models.PostProductsTypeRequest
import org.openapitools.client.models.PostProductsTypeResponse
import org.openapitools.client.models.PutProductsTypeProductIdRequest
import org.openapitools.client.models.PutProductsTypeProductIdResponse

interface ProductsApi {
    /**
     * Create a Share Product
     * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param postProductsTypeRequest 
     * @return [PostProductsTypeResponse]
     */
    @POST("v1/products/{type}")
    suspend fun createProduct(@Path("type") type: kotlin.String, @Body postProductsTypeRequest: PostProductsTypeRequest): Response<PostProductsTypeResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @param productId productId
     * @param command command (optional)
     * @return [kotlin.String]
     */
    @POST("v1/products/{type}/{productId}")
    suspend fun handleCommands3(@Path("type") type: kotlin.String, @Path("productId") productId: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<kotlin.String>

    /**
     * List Share Products
     * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetProductsTypeResponse]
     */
    @GET("v1/products/{type}")
    suspend fun retrieveAllProducts(@Path("type") type: kotlin.String, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<GetProductsTypeResponse>

    /**
     * Retrieve a Share Product
     * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param type type
     * @return [GetProductsTypeProductIdResponse]
     */
    @GET("v1/products/{type}/{productId}")
    suspend fun retrieveProduct(@Path("productId") productId: kotlin.Long, @Path("type") type: kotlin.String): Response<GetProductsTypeProductIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @return [kotlin.String]
     */
    @GET("v1/products/{type}/template")
    suspend fun retrieveTemplate13(@Path("type") type: kotlin.String): Response<kotlin.String>

    /**
     * Update a Share Product
     * Updates a Share Product
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param productId productId
     * @param putProductsTypeProductIdRequest 
     * @return [PutProductsTypeProductIdResponse]
     */
    @PUT("v1/products/{type}/{productId}")
    suspend fun updateProduct(@Path("type") type: kotlin.String, @Path("productId") productId: kotlin.Long, @Body putProductsTypeProductIdRequest: PutProductsTypeProductIdRequest): Response<PutProductsTypeProductIdResponse>

}
