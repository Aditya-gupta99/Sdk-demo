package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeletePaymentTypesPaymentTypeIdResponse
import org.openapitools.client.models.GetPaymentTypesPaymentTypeIdResponse
import org.openapitools.client.models.GetPaymentTypesResponse
import org.openapitools.client.models.PostPaymentTypesRequest
import org.openapitools.client.models.PostPaymentTypesResponse
import org.openapitools.client.models.PutPaymentTypesPaymentTypeIdRequest
import org.openapitools.client.models.PutPaymentTypesPaymentTypeIdResponse

interface PaymentTypeApi {
    /**
     * Create a Payment Type
     * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
     * Responses:
     *  - 200: OK
     *
     * @param postPaymentTypesRequest 
     * @return [PostPaymentTypesResponse]
     */
    @POST("v1/paymenttypes")
    suspend fun createPaymentType(@Body postPaymentTypesRequest: PostPaymentTypesRequest): Response<PostPaymentTypesResponse>

    /**
     * Delete a Payment Type
     * Deletes payment type
     * Responses:
     *  - 200: OK
     *
     * @param paymentTypeId paymentTypeId
     * @return [DeletePaymentTypesPaymentTypeIdResponse]
     */
    @DELETE("v1/paymenttypes/{paymentTypeId}")
    suspend fun deleteCode1(@Path("paymentTypeId") paymentTypeId: kotlin.Long): Response<DeletePaymentTypesPaymentTypeIdResponse>

    /**
     * Retrieve all Payment Types
     * Retrieve list of payment types
     * Responses:
     *  - 200: OK
     *
     * @param onlyWithCode onlyWithCode (optional)
     * @return [kotlin.collections.List<GetPaymentTypesResponse>]
     */
    @GET("v1/paymenttypes")
    suspend fun getAllPaymentTypes(@Query("onlyWithCode") onlyWithCode: kotlin.Boolean? = null): Response<kotlin.collections.List<GetPaymentTypesResponse>>

    /**
     * Retrieve a Payment Type
     * Retrieves a payment type
     * Responses:
     *  - 200: OK
     *
     * @param paymentTypeId paymentTypeId
     * @return [GetPaymentTypesPaymentTypeIdResponse]
     */
    @GET("v1/paymenttypes/{paymentTypeId}")
    suspend fun retrieveOnePaymentType(@Path("paymentTypeId") paymentTypeId: kotlin.Long): Response<GetPaymentTypesPaymentTypeIdResponse>

    /**
     * Update a Payment Type
     * Updates a Payment Type
     * Responses:
     *  - 200: OK
     *
     * @param paymentTypeId paymentTypeId
     * @param putPaymentTypesPaymentTypeIdRequest 
     * @return [PutPaymentTypesPaymentTypeIdResponse]
     */
    @PUT("v1/paymenttypes/{paymentTypeId}")
    suspend fun updatePaymentType(@Path("paymentTypeId") paymentTypeId: kotlin.Long, @Body putPaymentTypesPaymentTypeIdRequest: PutPaymentTypesPaymentTypeIdRequest): Response<PutPaymentTypesPaymentTypeIdResponse>

}
