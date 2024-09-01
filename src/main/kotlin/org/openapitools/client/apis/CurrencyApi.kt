package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetCurrenciesResponse
import org.openapitools.client.models.PutCurrenciesRequest
import org.openapitools.client.models.PutCurrenciesResponse

interface CurrencyApi {
    /**
     * Retrieve Currency Configuration
     * Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions
     * Responses:
     *  - 200: OK
     *
     * @return [GetCurrenciesResponse]
     */
    @GET("v1/currencies")
    suspend fun retrieveCurrencies(): Response<GetCurrenciesResponse>

    /**
     * Update Currency Configuration
     * Updates the list of currencies permitted for use.
     * Responses:
     *  - 200: OK
     *
     * @param putCurrenciesRequest 
     * @return [PutCurrenciesResponse]
     */
    @PUT("v1/currencies")
    suspend fun updateCurrencies(@Body putCurrenciesRequest: PutCurrenciesRequest): Response<PutCurrenciesResponse>

}
