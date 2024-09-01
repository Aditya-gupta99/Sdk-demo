package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetAccountTransferTemplateResponse
import org.openapitools.client.models.PostNewTransferResponse

interface SelfAccountTransferApi {
    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional, default to "")
     * @param body  (optional)
     * @return [kotlin.collections.List<PostNewTransferResponse>]
     */
    @POST("v1/self/accounttransfers")
    suspend fun create14(@Query("type") type: kotlin.String? = "", @Body body: kotlin.String? = null): Response<kotlin.collections.List<PostNewTransferResponse>>

    /**
     * Retrieve Account Transfer Template
     * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional, default to "")
     * @return [kotlin.collections.List<GetAccountTransferTemplateResponse>]
     */
    @GET("v1/self/accounttransfers/template")
    suspend fun template15(@Query("type") type: kotlin.String? = ""): Response<kotlin.collections.List<GetAccountTransferTemplateResponse>>

}
