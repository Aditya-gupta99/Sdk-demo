package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface ClientFamilyMemberApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/clients/{clientId}/familymembers")
    suspend fun addClientFamilyMembers(@Path("clientId") clientId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId 
     * @param clientId clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @DELETE("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun deleteClientFamilyMembers(@Path("familyMemberId") familyMemberId: kotlin.Long, @Path("clientId") clientId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId 
     * @param clientId clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun getFamilyMember(@Path("familyMemberId") familyMemberId: kotlin.Long, @Path("clientId") clientId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId 
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers")
    suspend fun getFamilyMembers(@Path("clientId") clientId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param clientId 
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers/template")
    suspend fun getTemplate2(@Path("clientId") clientId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId 
     * @param clientId clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun updateClientFamilyMembers(@Path("familyMemberId") familyMemberId: kotlin.Long, @Path("clientId") clientId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
