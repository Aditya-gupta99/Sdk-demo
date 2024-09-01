package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.GetAccountsLinkedToPocketResponse
import org.openapitools.client.models.PostLinkDelinkAccountsToFromPocketResponse

interface PocketApi {
    /**
     * Link/delink accounts to/from pocket
     * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
     * Responses:
     *  - 200: OK
     *
     * @param command command (optional)
     * @param body  (optional)
     * @return [PostLinkDelinkAccountsToFromPocketResponse]
     */
    @POST("v1/self/pockets")
    suspend fun handleCommands8(@Query("command") command: kotlin.String? = null, @Body body: kotlin.String? = null): Response<PostLinkDelinkAccountsToFromPocketResponse>

    /**
     * Retrieve accounts linked to pocket
     * All linked loan  Example Requests:   self/pockets
     * Responses:
     *  - 200: OK
     *
     * @return [GetAccountsLinkedToPocketResponse]
     */
    @GET("v1/self/pockets")
    suspend fun retrieveAll37(): Response<GetAccountsLinkedToPocketResponse>

}
