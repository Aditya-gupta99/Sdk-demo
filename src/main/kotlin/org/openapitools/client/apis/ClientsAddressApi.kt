package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetClientClientIdAddressesResponse
import org.openapitools.client.models.PostClientClientIdAddressesRequest
import org.openapitools.client.models.PostClientClientIdAddressesResponse
import org.openapitools.client.models.PutClientClientIdAddressesRequest
import org.openapitools.client.models.PutClientClientIdAddressesResponse

interface ClientsAddressApi {
    /**
     * Create an address for a Client
     * Mandatory Fields :  type and clientId
     * Responses:
     *  - 200: OK
     *
     * @param clientid clientId
     * @param postClientClientIdAddressesRequest 
     * @param type type (optional)
     * @return [PostClientClientIdAddressesResponse]
     */
    @POST("v1/client/{clientid}/addresses")
    suspend fun addClientAddress(@Path("clientid") clientid: kotlin.Long, @Body postClientClientIdAddressesRequest: PostClientClientIdAddressesRequest, @Query("type") type: kotlin.Long? = null): Response<PostClientClientIdAddressesResponse>

    /**
     * List all addresses for a Client
     * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
     * Responses:
     *  - 200: OK
     *
     * @param clientid clientId
     * @param status status (optional)
     * @param type type (optional)
     * @return [kotlin.collections.List<GetClientClientIdAddressesResponse>]
     */
    @GET("v1/client/{clientid}/addresses")
    suspend fun getAddresses1(@Path("clientid") clientid: kotlin.Long, @Query("status") status: kotlin.String? = null, @Query("type") type: kotlin.Long? = null): Response<kotlin.collections.List<GetClientClientIdAddressesResponse>>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/client/addresses/template")
    suspend fun getAddressesTemplate(): Response<kotlin.String>

    /**
     * Update an address for a Client
     * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
     * Responses:
     *  - 200: OK
     *
     * @param clientid clientId
     * @param putClientClientIdAddressesRequest 
     * @return [PutClientClientIdAddressesResponse]
     */
    @PUT("v1/client/{clientid}/addresses")
    suspend fun updateClientAddress(@Path("clientid") clientid: kotlin.Long, @Body putClientClientIdAddressesRequest: PutClientClientIdAddressesRequest): Response<PutClientClientIdAddressesResponse>

}
