package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteClientsClientIdIdentifiersIdentifierIdResponse
import org.openapitools.client.models.GetClientsClientIdIdentifiersResponse
import org.openapitools.client.models.GetClientsClientIdIdentifiersTemplateResponse
import org.openapitools.client.models.PostClientsClientIdIdentifiersRequest
import org.openapitools.client.models.PostClientsClientIdIdentifiersResponse
import org.openapitools.client.models.PutClientsClientIdIdentifiersIdentifierIdRequest
import org.openapitools.client.models.PutClientsClientIdIdentifiersIdentifierIdResponse

interface ClientIdentifierApi {
    /**
     * Create an Identifier for a Client
     * Mandatory Fields documentKey, documentTypeId 
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param postClientsClientIdIdentifiersRequest 
     * @return [PostClientsClientIdIdentifiersResponse]
     */
    @POST("v1/clients/{clientId}/identifiers")
    suspend fun createClientIdentifier(@Path("clientId") clientId: kotlin.Long, @Body postClientsClientIdIdentifiersRequest: PostClientsClientIdIdentifiersRequest): Response<PostClientsClientIdIdentifiersResponse>

    /**
     * Delete a Client Identifier
     * Deletes a Client Identifier
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param identifierId identifierId
     * @return [DeleteClientsClientIdIdentifiersIdentifierIdResponse]
     */
    @DELETE("v1/clients/{clientId}/identifiers/{identifierId}")
    suspend fun deleteClientIdentifier(@Path("clientId") clientId: kotlin.Long, @Path("identifierId") identifierId: kotlin.Long): Response<DeleteClientsClientIdIdentifiersIdentifierIdResponse>

    /**
     * Retrieve Client Identifier Details Template
     * This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [GetClientsClientIdIdentifiersTemplateResponse]
     */
    @GET("v1/clients/{clientId}/identifiers/template")
    suspend fun newClientIdentifierDetails(@Path("clientId") clientId: kotlin.Long): Response<GetClientsClientIdIdentifiersTemplateResponse>

    /**
     * List all Identifiers for a Client
     * Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [kotlin.collections.List<GetClientsClientIdIdentifiersResponse>]
     */
    @GET("v1/clients/{clientId}/identifiers")
    suspend fun retrieveAllClientIdentifiers(@Path("clientId") clientId: kotlin.Long): Response<kotlin.collections.List<GetClientsClientIdIdentifiersResponse>>

    /**
     * Retrieve a Client Identifier
     * Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param identifierId identifierId
     * @return [GetClientsClientIdIdentifiersResponse]
     */
    @GET("v1/clients/{clientId}/identifiers/{identifierId}")
    suspend fun retrieveClientIdentifiers(@Path("clientId") clientId: kotlin.Long, @Path("identifierId") identifierId: kotlin.Long): Response<GetClientsClientIdIdentifiersResponse>

    /**
     * Update a Client Identifier
     * Updates a Client Identifier
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param identifierId identifierId
     * @param putClientsClientIdIdentifiersIdentifierIdRequest 
     * @return [PutClientsClientIdIdentifiersIdentifierIdResponse]
     */
    @PUT("v1/clients/{clientId}/identifiers/{identifierId}")
    suspend fun updateClientIdentifer(@Path("clientId") clientId: kotlin.Long, @Path("identifierId") identifierId: kotlin.Long, @Body putClientsClientIdIdentifiersIdentifierIdRequest: PutClientsClientIdIdentifiersIdentifierIdRequest): Response<PutClientsClientIdIdentifiersIdentifierIdResponse>

}
