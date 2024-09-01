package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteSelfBeneficiariesTPTBeneficiaryIdResponse
import org.openapitools.client.models.GetSelfBeneficiariesTPTResponse
import org.openapitools.client.models.GetSelfBeneficiariesTPTTemplateResponse
import org.openapitools.client.models.PostSelfBeneficiariesTPTRequest
import org.openapitools.client.models.PostSelfBeneficiariesTPTResponse
import org.openapitools.client.models.PutSelfBeneficiariesTPTBeneficiaryIdRequest
import org.openapitools.client.models.PutSelfBeneficiariesTPTBeneficiaryIdResponse

interface SelfThirdPartyTransferApi {
    /**
     * Add TPT Beneficiary
     * Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit
     * Responses:
     *  - 200: OK
     *
     * @param postSelfBeneficiariesTPTRequest 
     * @return [PostSelfBeneficiariesTPTResponse]
     */
    @POST("v1/self/beneficiaries/tpt")
    suspend fun add(@Body postSelfBeneficiariesTPTRequest: PostSelfBeneficiariesTPTRequest): Response<PostSelfBeneficiariesTPTResponse>

    /**
     * Delete TPT Beneficiary
     * Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}
     * Responses:
     *  - 200: OK
     *
     * @param beneficiaryId 
     * @return [DeleteSelfBeneficiariesTPTBeneficiaryIdResponse]
     */
    @DELETE("v1/self/beneficiaries/tpt/{beneficiaryId}")
    suspend fun delete22(@Path("beneficiaryId") beneficiaryId: kotlin.Long): Response<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse>

    /**
     * Get All TPT Beneficiary
     * Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetSelfBeneficiariesTPTResponse>]
     */
    @GET("v1/self/beneficiaries/tpt")
    suspend fun retrieveAll35(): Response<kotlin.collections.List<GetSelfBeneficiariesTPTResponse>>

    /**
     * Beneficiary Third Party Transfer Template
     * Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetSelfBeneficiariesTPTTemplateResponse]
     */
    @GET("v1/self/beneficiaries/tpt/template")
    suspend fun template16(): Response<GetSelfBeneficiariesTPTTemplateResponse>

    /**
     * Update TPT Beneficiary
     * Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit
     * Responses:
     *  - 200: OK
     *
     * @param beneficiaryId beneficiaryId
     * @param putSelfBeneficiariesTPTBeneficiaryIdRequest 
     * @return [PutSelfBeneficiariesTPTBeneficiaryIdResponse]
     */
    @PUT("v1/self/beneficiaries/tpt/{beneficiaryId}")
    suspend fun update23(@Path("beneficiaryId") beneficiaryId: kotlin.Long, @Body putSelfBeneficiariesTPTBeneficiaryIdRequest: PutSelfBeneficiariesTPTBeneficiaryIdRequest): Response<PutSelfBeneficiariesTPTBeneficiaryIdResponse>

}
