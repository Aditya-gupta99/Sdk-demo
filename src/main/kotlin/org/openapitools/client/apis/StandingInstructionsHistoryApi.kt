package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetStandingInstructionRunHistoryResponse

interface StandingInstructionsHistoryApi {
    /**
     * Standing Instructions Logged History
     * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param transferType transferType (optional)
     * @param clientName clientName (optional)
     * @param clientId clientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @return [GetStandingInstructionRunHistoryResponse]
     */
    @GET("v1/standinginstructionrunhistory")
    suspend fun retrieveAll20(@Query("externalId") externalId: kotlin.String? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("orderBy") orderBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("transferType") transferType: kotlin.Int? = null, @Query("clientName") clientName: kotlin.String? = null, @Query("clientId") clientId: kotlin.Long? = null, @Query("fromAccountId") fromAccountId: kotlin.Long? = null, @Query("fromAccountType") fromAccountType: kotlin.Int? = null, @Query("locale") locale: kotlin.String? = null, @Query("dateFormat") dateFormat: kotlin.String? = null, @Query("fromDate") fromDate: kotlin.Any? = null, @Query("toDate") toDate: kotlin.Any? = null): Response<GetStandingInstructionRunHistoryResponse>

}
