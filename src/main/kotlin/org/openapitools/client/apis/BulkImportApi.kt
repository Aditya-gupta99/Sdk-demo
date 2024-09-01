package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface BulkImportApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param importDocumentId  (optional)
     * @return [Unit]
     */
    @GET("v1/imports/downloadOutputTemplate")
    suspend fun getOutputTemplate(@Query("importDocumentId") importDocumentId: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param entityType  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/imports")
    suspend fun retrieveImportDocuments(@Query("entityType") entityType: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param importDocumentId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/imports/getOutputTemplateLocation")
    suspend fun retriveOutputTemplateLocation(@Query("importDocumentId") importDocumentId: kotlin.String? = null): Response<kotlin.String>

}
