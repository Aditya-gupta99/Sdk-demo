package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface CreditBureauConfigurationApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param organisationCreditBureauId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
    suspend fun addOrganisationCreditBureau(@Path("organisationCreditBureauId") organisationCreditBureauId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param creditBureauId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/CreditBureauConfiguration/configuration/{creditBureauId}")
    suspend fun createCreditBureauConfiguration(@Path("creditBureauId") creditBureauId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param organisationCreditBureauId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/CreditBureauConfiguration/mappings/{organisationCreditBureauId}")
    suspend fun createCreditBureauLoanProductMapping(@Path("organisationCreditBureauId") organisationCreditBureauId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/loanProduct")
    suspend fun fetchLoanProducts(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanProductId 
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/loanProduct/{loanProductId}")
    suspend fun fetchMappingByLoanProductId(@Path("loanProductId") loanProductId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param organisationCreditBureauId 
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/config/{organisationCreditBureauId}")
    suspend fun getConfiguration(@Path("organisationCreditBureauId") organisationCreditBureauId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration")
    suspend fun getCreditBureau(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/mappings")
    suspend fun getCreditBureauLoanProductMapping(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/organisationCreditBureau")
    suspend fun getOrganisationCreditBureau(): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/CreditBureauConfiguration/organisationCreditBureau")
    suspend fun updateCreditBureau(@Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param configurationId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/CreditBureauConfiguration/configuration/{configurationId}")
    suspend fun updateCreditBureauConfiguration(@Path("configurationId") configurationId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/CreditBureauConfiguration/mappings")
    suspend fun updateCreditBureauLoanProductMapping(@Body body: kotlin.String? = null): Response<kotlin.String>

}
