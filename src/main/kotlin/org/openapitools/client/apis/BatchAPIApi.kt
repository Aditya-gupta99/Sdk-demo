package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.BatchRequest
import org.openapitools.client.models.BatchResponse

interface BatchAPIApi {
    /**
     * Batch requests in a single transaction
     * The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.
     * Responses:
     *  - 200: Success
     *
     * @param batchRequest 
     * @param enclosingTransaction enclosingTransaction (optional, default to false)
     * @return [kotlin.collections.List<BatchResponse>]
     */
    @POST("v1/batches")
    suspend fun handleBatchRequests(@Body batchRequest: kotlin.collections.List<BatchRequest>, @Query("enclosingTransaction") enclosingTransaction: kotlin.Boolean? = false): Response<kotlin.collections.List<BatchResponse>>

}
