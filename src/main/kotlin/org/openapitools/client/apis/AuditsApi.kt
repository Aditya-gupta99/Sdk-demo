package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetMakerCheckerResponse
import org.openapitools.client.models.GetMakerCheckersSearchTemplateResponse

interface AuditsApi {
    /**
     * List Audits
     * Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#39; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param actionName actionName (optional)
     * @param entityName entityName (optional)
     * @param resourceId resourceId (optional)
     * @param makerId makerId (optional)
     * @param makerDateTimeFrom makerDateTimeFrom (optional)
     * @param makerDateTimeTo makerDateTimeTo (optional)
     * @param checkerId checkerId (optional)
     * @param checkerDateTimeFrom checkerDateTimeFrom (optional)
     * @param checkerDateTimeTo checkerDateTimeTo (optional)
     * @param processingResult processingResult (optional)
     * @param officeId officeId (optional)
     * @param groupId groupId (optional)
     * @param clientId clientId (optional)
     * @param loanid loanid (optional)
     * @param savingsAccountId savingsAccountId (optional)
     * @param paged paged (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetMakerCheckerResponse>]
     */
    @GET("v1/audits")
    suspend fun retrieveAuditEntries(@Query("actionName") actionName: kotlin.String? = null, @Query("entityName") entityName: kotlin.String? = null, @Query("resourceId") resourceId: kotlin.Long? = null, @Query("makerId") makerId: kotlin.Long? = null, @Query("makerDateTimeFrom") makerDateTimeFrom: kotlin.String? = null, @Query("makerDateTimeTo") makerDateTimeTo: kotlin.String? = null, @Query("checkerId") checkerId: kotlin.Long? = null, @Query("checkerDateTimeFrom") checkerDateTimeFrom: kotlin.String? = null, @Query("checkerDateTimeTo") checkerDateTimeTo: kotlin.String? = null, @Query("processingResult") processingResult: kotlin.Int? = null, @Query("officeId") officeId: kotlin.Int? = null, @Query("groupId") groupId: kotlin.Int? = null, @Query("clientId") clientId: kotlin.Int? = null, @Query("loanid") loanid: kotlin.Int? = null, @Query("savingsAccountId") savingsAccountId: kotlin.Int? = null, @Query("paged") paged: kotlin.Boolean? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null): Response<kotlin.collections.List<GetMakerCheckerResponse>>

    /**
     * Retrieve an Audit Entry
     * Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult
     * Responses:
     *  - 200: OK
     *
     * @param auditId auditId
     * @return [GetMakerCheckerResponse]
     */
    @GET("v1/audits/{auditId}")
    suspend fun retrieveAuditEntry(@Path("auditId") auditId: kotlin.Long): Response<GetMakerCheckerResponse>

    /**
     * Audit Search Template
     * This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames
     * Responses:
     *  - 200: OK
     *
     * @return [GetMakerCheckersSearchTemplateResponse]
     */
    @GET("v1/audits/searchtemplate")
    suspend fun retrieveAuditSearchTemplate(): Response<GetMakerCheckersSearchTemplateResponse>

}
