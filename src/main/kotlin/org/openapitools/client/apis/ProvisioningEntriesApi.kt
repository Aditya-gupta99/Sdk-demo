package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.LoanProductProvisioningEntryData
import org.openapitools.client.models.PostProvisioningEntriesRequest
import org.openapitools.client.models.PostProvisioningEntriesResponse
import org.openapitools.client.models.ProvisioningEntryData
import org.openapitools.client.models.PutProvisioningEntriesRequest
import org.openapitools.client.models.PutProvisioningEntriesResponse

interface ProvisioningEntriesApi {
    /**
     * Create new Provisioning Entries
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     * Responses:
     *  - 200: OK
     *
     * @param postProvisioningEntriesRequest  (optional)
     * @return [PostProvisioningEntriesResponse]
     */
    @POST("v1/provisioningentries")
    suspend fun createProvisioningEntries(@Body postProvisioningEntriesRequest: PostProvisioningEntriesRequest? = null): Response<PostProvisioningEntriesResponse>

    /**
     * Recreates Provisioning Entry
     * Recreates Provisioning Entry | createjournalentry.
     * Responses:
     *  - 200: OK
     *
     * @param entryId entryId
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param putProvisioningEntriesRequest  (optional)
     * @return [PutProvisioningEntriesResponse]
     */
    @POST("v1/provisioningentries/{entryId}")
    suspend fun modifyProvisioningEntry(@Path("entryId") entryId: kotlin.Long, @Query("command") command: kotlin.String? = null, @Body putProvisioningEntriesRequest: PutProvisioningEntriesRequest? = null): Response<PutProvisioningEntriesResponse>

    /**
     * List all Provisioning Entries
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [kotlin.collections.List<ProvisioningEntryData>]
     */
    @GET("v1/provisioningentries")
    suspend fun retrieveAllProvisioningEntries(@Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Response<kotlin.collections.List<ProvisioningEntryData>>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entryId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param officeId  (optional)
     * @param productId  (optional)
     * @param categoryId  (optional)
     * @return [LoanProductProvisioningEntryData]
     */
    @GET("v1/provisioningentries/entries")
    suspend fun retrieveProviioningEntries(@Query("entryId") entryId: kotlin.Long? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("officeId") officeId: kotlin.Long? = null, @Query("productId") productId: kotlin.Long? = null, @Query("categoryId") categoryId: kotlin.Long? = null): Response<LoanProductProvisioningEntryData>

    /**
     * Retrieves a Provisioning Entry
     * Returns the details of a generated Provisioning Entry.
     * Responses:
     *  - 200: OK
     *
     * @param entryId entryId
     * @return [ProvisioningEntryData]
     */
    @GET("v1/provisioningentries/{entryId}")
    suspend fun retrieveProvisioningEntry(@Path("entryId") entryId: kotlin.Long): Response<ProvisioningEntryData>

}
