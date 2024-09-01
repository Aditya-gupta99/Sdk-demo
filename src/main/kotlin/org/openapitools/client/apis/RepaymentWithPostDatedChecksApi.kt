package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeletePostDatedCheck
import org.openapitools.client.models.GetPostDatedChecks
import org.openapitools.client.models.UpdatePostDatedCheckRequest
import org.openapitools.client.models.UpdatePostDatedCheckResponse

interface RepaymentWithPostDatedChecksApi {
    /**
     * Delete Post Dated Check
     * Delete Post Dated Check
     * Responses:
     *  - 200: OK
     *
     * @param postDatedCheckId postDatedCheckId
     * @param loanId loanId
     * @return [kotlin.collections.List<DeletePostDatedCheck>]
     */
    @DELETE("v1/loans/{loanId}/postdatedchecks/{postDatedCheckId}")
    suspend fun deletePostDatedCheck(@Path("postDatedCheckId") postDatedCheckId: kotlin.Long, @Path("loanId") loanId: kotlin.Long): Response<kotlin.collections.List<DeletePostDatedCheck>>

    /**
     * Get Post Dated Check
     * Get Post Dated Check
     * Responses:
     *  - 200: OK
     *
     * @param installmentId installmentId
     * @param loanId loanId
     * @return [kotlin.collections.List<GetPostDatedChecks>]
     */
    @GET("v1/loans/{loanId}/postdatedchecks/{installmentId}")
    suspend fun getPostDatedCheck(@Path("installmentId") installmentId: kotlin.Int, @Path("loanId") loanId: kotlin.Long): Response<kotlin.collections.List<GetPostDatedChecks>>

    /**
     * Get All Post Dated Checks
     * Get All Post dated Checks
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetPostDatedChecks>]
     */
    @GET("v1/loans/{loanId}/postdatedchecks")
    suspend fun getPostDatedChecks(@Path("loanId") loanId: kotlin.Long): Response<kotlin.collections.List<GetPostDatedChecks>>

    /**
     * Update Post Dated Check, Bounced Check
     * Update Post Dated Check, Bounced Check
     * Responses:
     *  - 200: OK
     *
     * @param postDatedCheckId postDatedCheckId
     * @param loanId loanId
     * @param updatePostDatedCheckRequest 
     * @param editType editType (optional)
     * @return [kotlin.collections.List<UpdatePostDatedCheckResponse>]
     */
    @PUT("v1/loans/{loanId}/postdatedchecks/{postDatedCheckId}")
    suspend fun updatePostDatedChecks(@Path("postDatedCheckId") postDatedCheckId: kotlin.Long, @Path("loanId") loanId: kotlin.Long, @Body updatePostDatedCheckRequest: UpdatePostDatedCheckRequest, @Query("editType") editType: kotlin.String? = null): Response<kotlin.collections.List<UpdatePostDatedCheckResponse>>

}
