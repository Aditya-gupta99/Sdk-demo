package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json


import okhttp3.MultipartBody

interface GuarantorsApi {
    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors/accounts/template")
    suspend fun accountsTemplate(@Path("loanId") loanId: kotlin.Long, @Query("clientId") clientId: kotlin.Long? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loans/{loanId}/guarantors")
    suspend fun createGuarantor(@Path("loanId") loanId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param guarantorId 
     * @param guarantorFundingId  (optional)
     * @return [kotlin.String]
     */
    @DELETE("v1/loans/{loanId}/guarantors/{guarantorId}")
    suspend fun deleteGuarantor(@Path("loanId") loanId: kotlin.Long, @Path("guarantorId") guarantorId: kotlin.Long, @Query("guarantorFundingId") guarantorFundingId: kotlin.Long? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/loans/{loanId}/guarantors/downloadtemplate")
    suspend fun getGuarantorTemplate(@Path("loanId") loanId: kotlin.Long, @Query("officeId") officeId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors/template")
    suspend fun newGuarantorTemplate(@Path("loanId") loanId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/loans/{loanId}/guarantors/uploadtemplate")
    suspend fun postGuarantorTemplate(@Path("loanId") loanId: kotlin.Long, @Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors")
    suspend fun retrieveGuarantorDetails(@Path("loanId") loanId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param guarantorId 
     * @return [kotlin.String]
     */
    @GET("v1/loans/{loanId}/guarantors/{guarantorId}")
    suspend fun retrieveGuarantorDetails1(@Path("loanId") loanId: kotlin.Long, @Path("guarantorId") guarantorId: kotlin.Long): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param loanId 
     * @param guarantorId 
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loans/{loanId}/guarantors/{guarantorId}")
    suspend fun updateGuarantor(@Path("loanId") loanId: kotlin.Long, @Path("guarantorId") guarantorId: kotlin.Long, @Body body: kotlin.String? = null): Response<kotlin.String>

}
