package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ExternalOwnerJournalEntryData
import org.openapitools.client.models.ExternalOwnerTransferJournalEntryData
import org.openapitools.client.models.ExternalTransferData
import org.openapitools.client.models.PageExternalTransferData
import org.openapitools.client.models.PagedRequestExternalAssetOwnerSearchRequest
import org.openapitools.client.models.PostInitiateTransferRequest
import org.openapitools.client.models.PostInitiateTransferResponse

interface ExternalAssetOwnersApi {
    /**
     * Retrieve Active Asset Owner Transfer
     * Retrieve Active External Asset Owner Transfer by transferExternalId, loanId or loanExternalId
     * Responses:
     *  - 0: default response
     *
     * @param transferExternalId transferExternalId (optional)
     * @param loanId loanId (optional)
     * @param loanExternalId loanExternalId (optional)
     * @return [ExternalTransferData]
     */
    @GET("v1/external-asset-owners/transfers/active-transfer")
    suspend fun getActiveTransfer(@Query("transferExternalId") transferExternalId: kotlin.String? = null, @Query("loanId") loanId: kotlin.Long? = null, @Query("loanExternalId") loanExternalId: kotlin.String? = null): Response<ExternalTransferData>

    /**
     * Retrieve Journal Entries of Owner
     * Retrieve Journal entries of owner by owner externalId
     * Responses:
     *  - 0: default response
     *
     * @param ownerExternalId ownerExternalId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [ExternalOwnerJournalEntryData]
     */
    @GET("v1/external-asset-owners/owners/external-id/{ownerExternalId}/journal-entries")
    suspend fun getJournalEntriesOfOwner(@Path("ownerExternalId") ownerExternalId: kotlin.String, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<ExternalOwnerJournalEntryData>

    /**
     * Retrieve Journal Entries of Transfer
     * Retrieve Journal entries of transfer by transferId
     * Responses:
     *  - 0: default response
     *
     * @param transferId transferId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [ExternalOwnerTransferJournalEntryData]
     */
    @GET("v1/external-asset-owners/transfers/{transferId}/journal-entries")
    suspend fun getJournalEntriesOfTransfer(@Path("transferId") transferId: kotlin.Long, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<ExternalOwnerTransferJournalEntryData>

    /**
     * Retrieve External Asset Owner Transfers
     * Retrieve External Asset Owner Transfer items by transferExternalId, loanId or loanExternalId
     * Responses:
     *  - 0: default response
     *
     * @param transferExternalId transferExternalId (optional)
     * @param loanId loanId (optional)
     * @param loanExternalId loanExternalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [PageExternalTransferData]
     */
    @GET("v1/external-asset-owners/transfers")
    suspend fun getTransfers(@Query("transferExternalId") transferExternalId: kotlin.String? = null, @Query("loanId") loanId: kotlin.Long? = null, @Query("loanExternalId") loanExternalId: kotlin.String? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<PageExternalTransferData>

    /**
     * Search External Asset Owner Transfers by text or date ranges to settlement or effective dates
     * 
     * Responses:
     *  - 0: default response
     *
     * @param pagedRequestExternalAssetOwnerSearchRequest  (optional)
     * @return [PageExternalTransferData]
     */
    @POST("v1/external-asset-owners/search")
    suspend fun searchInvestorData(@Body pagedRequestExternalAssetOwnerSearchRequest: PagedRequestExternalAssetOwnerSearchRequest? = null): Response<PageExternalTransferData>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param id 
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/{id}")
    suspend fun transferRequestWithId(@Path("id") id: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<PostInitiateTransferResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param externalId 
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/external-id/{externalId}")
    suspend fun transferRequestWithId1(@Path("externalId") externalId: kotlin.String, @Query("command") command: kotlin.String? = null): Response<PostInitiateTransferResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param loanExternalId 
     * @param postInitiateTransferRequest 
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/loans/external-id/{loanExternalId}")
    suspend fun transferRequestWithLoanExternalId(@Path("loanExternalId") loanExternalId: kotlin.String, @Body postInitiateTransferRequest: PostInitiateTransferRequest, @Query("command") command: kotlin.String? = null): Response<PostInitiateTransferResponse>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param loanId 
     * @param postInitiateTransferRequest 
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/loans/{loanId}")
    suspend fun transferRequestWithLoanId(@Path("loanId") loanId: kotlin.Long, @Body postInitiateTransferRequest: PostInitiateTransferRequest, @Query("command") command: kotlin.String? = null): Response<PostInitiateTransferResponse>

}
