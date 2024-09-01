package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetJournalEntriesTransactionIdResponse
import org.openapitools.client.models.JournalEntryCommand
import org.openapitools.client.models.JournalEntryTransactionItem
import org.openapitools.client.models.PostJournalEntriesResponse
import org.openapitools.client.models.PostJournalEntriesTransactionIdRequest
import org.openapitools.client.models.PostJournalEntriesTransactionIdResponse

import okhttp3.MultipartBody

interface JournalEntriesApi {
    /**
     * Create \&quot;Balanced\&quot; Journal Entries
     * Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber
     * Responses:
     *  - 200: OK
     *
     * @param command command (optional)
     * @param journalEntryCommand  (optional)
     * @return [PostJournalEntriesResponse]
     */
    @POST("v1/journalentries")
    suspend fun createGLJournalEntry(@Query("command") command: kotlin.String? = null, @Body journalEntryCommand: JournalEntryCommand? = null): Response<PostJournalEntriesResponse>

    /**
     * Update Running balances for Journal Entries
     * This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId
     * Responses:
     *  - 200: OK
     *
     * @param transactionId transactionId
     * @param command command (optional)
     * @param postJournalEntriesTransactionIdRequest  (optional)
     * @return [PostJournalEntriesTransactionIdResponse]
     */
    @POST("v1/journalentries/{transactionId}")
    suspend fun createReversalJournalEntry(@Path("transactionId") transactionId: kotlin.String, @Query("command") command: kotlin.String? = null, @Body postJournalEntriesTransactionIdRequest: PostJournalEntriesTransactionIdRequest? = null): Response<PostJournalEntriesTransactionIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/journalentries/downloadtemplate")
    suspend fun getJournalEntriesTemplate(@Query("officeId") officeId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/journalentries/uploadtemplate")
    suspend fun postJournalEntriesTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * List Journal Entries
     * The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param glAccountId glAccountId (optional)
     * @param manualEntriesOnly manualEntriesOnly (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @param submittedOnDateFrom submittedOnDateFrom (optional)
     * @param submittedOnDateTo submittedOnDateTo (optional)
     * @param transactionId transactionId (optional)
     * @param entityType entityType (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @param loanId loanId (optional)
     * @param savingsId savingsId (optional)
     * @param runningBalance runningBalance (optional)
     * @param transactionDetails transactionDetails (optional)
     * @return [GetJournalEntriesTransactionIdResponse]
     */
    @GET("v1/journalentries")
    suspend fun retrieveAll1(@Query("officeId") officeId: kotlin.Long? = null, @Query("glAccountId") glAccountId: kotlin.Long? = null, @Query("manualEntriesOnly") manualEntriesOnly: kotlin.Boolean? = null, @Query("fromDate") fromDate: kotlin.Any? = null, @Query("toDate") toDate: kotlin.Any? = null, @Query("submittedOnDateFrom") submittedOnDateFrom: kotlin.Any? = null, @Query("submittedOnDateTo") submittedOnDateTo: kotlin.Any? = null, @Query("transactionId") transactionId: kotlin.String? = null, @Query("entityType") entityType: kotlin.Int? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("locale") locale: kotlin.String? = null, @Query("dateFormat") dateFormat: kotlin.String? = null, @Query("loanId") loanId: kotlin.Long? = null, @Query("savingsId") savingsId: kotlin.Long? = null, @Query("runningBalance") runningBalance: kotlin.Boolean? = null, @Query("transactionDetails") transactionDetails: kotlin.Boolean? = null): Response<GetJournalEntriesTransactionIdResponse>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param offset  (optional)
     * @param limit  (optional)
     * @param entryId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/journalentries/provisioning")
    suspend fun retrieveJournalEntries(@Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("entryId") entryId: kotlin.Long? = null): Response<kotlin.String>

    /**
     * Retrieve a single Entry
     * Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param journalEntryId journalEntryId
     * @param runningBalance runningBalance (optional)
     * @param transactionDetails transactionDetails (optional)
     * @return [JournalEntryTransactionItem]
     */
    @GET("v1/journalentries/{journalEntryId}")
    suspend fun retrieveJournalEntryById(@Path("journalEntryId") journalEntryId: kotlin.Long, @Query("runningBalance") runningBalance: kotlin.Boolean? = null, @Query("transactionDetails") transactionDetails: kotlin.Boolean? = null): Response<JournalEntryTransactionItem>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param currencyCode  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/journalentries/openingbalance")
    suspend fun retrieveOpeningBalance(@Query("officeId") officeId: kotlin.Long? = null, @Query("currencyCode") currencyCode: kotlin.String? = null): Response<kotlin.String>

}
