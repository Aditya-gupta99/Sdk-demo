package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetMakerCheckerResponse
import org.openapitools.client.models.GetMakerCheckersSearchTemplateResponse
import org.openapitools.client.models.PostMakerCheckersResponse

interface MakerCheckerOr4EyeFunctionalityApi {
    /**
     * Approve Maker Checker Entry | Reject Maker Checker Entry
     * 
     * Responses:
     *  - 200: OK
     *
     * @param auditId auditId
     * @param command command (optional)
     * @return [PostMakerCheckersResponse]
     */
    @POST("v1/makercheckers/{auditId}")
    suspend fun approveMakerCheckerEntry(@Path("auditId") auditId: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<PostMakerCheckersResponse>

    /**
     * Delete Maker Checker Entry
     * 
     * Responses:
     *  - 200: OK
     *
     * @param auditId auditId
     * @return [PostMakerCheckersResponse]
     */
    @DELETE("v1/makercheckers/{auditId}")
    suspend fun deleteMakerCheckerEntry(@Path("auditId") auditId: kotlin.Long): Response<PostMakerCheckersResponse>

    /**
     * Maker Checker Search Template
     * This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames
     * Responses:
     *  - 200: OK
     *
     * @return [GetMakerCheckersSearchTemplateResponse]
     */
    @GET("v1/makercheckers/searchtemplate")
    suspend fun retrieveAuditSearchTemplate1(): Response<GetMakerCheckersSearchTemplateResponse>

    /**
     * List Maker Checker Entries
     * Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param actionName actionName (optional)
     * @param entityName entityName (optional)
     * @param resourceId resourceId (optional)
     * @param makerId makerId (optional)
     * @param makerDateTimeFrom makerDateTimeFrom (optional)
     * @param makerDateTimeTo makerDateTimeTo (optional)
     * @param officeId officeId (optional)
     * @param groupId groupId (optional)
     * @param clientId clientId (optional)
     * @param loanid loanid (optional)
     * @param savingsAccountId savingsAccountId (optional)
     * @return [kotlin.collections.List<GetMakerCheckerResponse>]
     */
    @GET("v1/makercheckers")
    suspend fun retrieveCommands(@Query("actionName") actionName: kotlin.String? = null, @Query("entityName") entityName: kotlin.String? = null, @Query("resourceId") resourceId: kotlin.Long? = null, @Query("makerId") makerId: kotlin.Long? = null, @Query("makerDateTimeFrom") makerDateTimeFrom: kotlin.String? = null, @Query("makerDateTimeTo") makerDateTimeTo: kotlin.String? = null, @Query("officeId") officeId: kotlin.Int? = null, @Query("groupId") groupId: kotlin.Int? = null, @Query("clientId") clientId: kotlin.Int? = null, @Query("loanid") loanid: kotlin.Int? = null, @Query("savingsAccountId") savingsAccountId: kotlin.Int? = null): Response<kotlin.collections.List<GetMakerCheckerResponse>>

}
