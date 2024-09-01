package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteEntityTypeEntityIdDocumentsResponse
import org.openapitools.client.models.GetEntityTypeEntityIdDocumentsResponse
import org.openapitools.client.models.PostEntityTypeEntityIdDocumentsResponse
import org.openapitools.client.models.PutEntityTypeEntityIdDocumentsResponse

import okhttp3.MultipartBody

interface DocumentsApi {
    /**
     * Create a Document
     * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
     * Responses:
     *  - 200: Not Shown (multi-part form data)
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param contentLength Content-Length (optional)
     * @param dateFormat  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param name  (optional)
     * @param uploadedInputStream  (optional)
     * @return [PostEntityTypeEntityIdDocumentsResponse]
     */
    @Multipart
    @POST("v1/{entityType}/{entityId}/documents")
    suspend fun createDocument(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Header("Content-Length") contentLength: kotlin.Long? = null, @Part("dateFormat") dateFormat: kotlin.String? = null, @Part("description") description: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part("name") name: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<PostEntityTypeEntityIdDocumentsResponse>

    /**
     * Remove a Document
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [DeleteEntityTypeEntityIdDocumentsResponse]
     */
    @DELETE("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun deleteDocument(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("documentId") documentId: kotlin.Long): Response<DeleteEntityTypeEntityIdDocumentsResponse>

    /**
     * Retrieve Binary File associated with Document
     * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
     * Responses:
     *  - 200: Not Shown: The corresponding Binary file
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [Unit]
     */
    @GET("v1/{entityType}/{entityId}/documents/{documentId}/attachment")
    suspend fun downloadFile(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("documentId") documentId: kotlin.Long): Response<Unit>

    /**
     * Retrieve a Document
     * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [GetEntityTypeEntityIdDocumentsResponse]
     */
    @GET("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun getDocument(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("documentId") documentId: kotlin.Long): Response<GetEntityTypeEntityIdDocumentsResponse>

    /**
     * List documents
     * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @return [kotlin.collections.List<GetEntityTypeEntityIdDocumentsResponse>]
     */
    @GET("v1/{entityType}/{entityId}/documents")
    suspend fun retrieveAllDocuments(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long): Response<kotlin.collections.List<GetEntityTypeEntityIdDocumentsResponse>>

    /**
     * Update a Document
     * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
     * Responses:
     *  - 200: Not Shown (multi-part form data)
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @param contentLength Content-Length (optional)
     * @param dateFormat  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param name  (optional)
     * @param uploadedInputStream  (optional)
     * @return [PutEntityTypeEntityIdDocumentsResponse]
     */
    @Multipart
    @PUT("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun updateDocument(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.Long, @Path("documentId") documentId: kotlin.Long, @Header("Content-Length") contentLength: kotlin.Long? = null, @Part("dateFormat") dateFormat: kotlin.String? = null, @Part("description") description: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part("name") name: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<PutEntityTypeEntityIdDocumentsResponse>

}
