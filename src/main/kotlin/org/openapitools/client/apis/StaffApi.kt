package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.CreateStaffResponse
import org.openapitools.client.models.PostStaffRequest
import org.openapitools.client.models.PutStaffRequest
import org.openapitools.client.models.RetrieveOneResponse
import org.openapitools.client.models.UpdateStaffResponse

import okhttp3.MultipartBody

interface StaffApi {
    /**
     * Create a staff member
     * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
     * Responses:
     *  - 200: OK
     *
     * @param postStaffRequest 
     * @return [CreateStaffResponse]
     */
    @POST("v1/staff")
    suspend fun create3(@Body postStaffRequest: PostStaffRequest): Response<CreateStaffResponse>

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
    @GET("v1/staff/downloadtemplate")
    suspend fun getTemplate1(@Query("officeId") officeId: kotlin.Long? = null, @Query("dateFormat") dateFormat: kotlin.String? = null): Response<Unit>

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
    @POST("v1/staff/uploadtemplate")
    suspend fun postTemplate(@Part("dateFormat") dateFormat: kotlin.String? = null, @Part("locale") locale: kotlin.String? = null, @Part uploadedInputStream: MultipartBody.Part? = null): Response<kotlin.String>

    /**
     * Retrieve Staff
     * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param staffInOfficeHierarchy staffInOfficeHierarchy (optional, default to false)
     * @param loanOfficersOnly loanOfficersOnly (optional, default to false)
     * @param status status (optional, default to "active")
     * @return [kotlin.collections.List<RetrieveOneResponse>]
     */
    @GET("v1/staff")
    suspend fun retrieveAll16(@Query("officeId") officeId: kotlin.Long? = null, @Query("staffInOfficeHierarchy") staffInOfficeHierarchy: kotlin.Boolean? = false, @Query("loanOfficersOnly") loanOfficersOnly: kotlin.Boolean? = false, @Query("status") status: kotlin.String? = "active"): Response<kotlin.collections.List<RetrieveOneResponse>>

    /**
     * Retrieve a Staff Member
     * Returns the details of a Staff Member.  Example Requests:  staff/1
     * Responses:
     *  - 200: OK
     *
     * @param staffId staffId
     * @return [RetrieveOneResponse]
     */
    @GET("v1/staff/{staffId}")
    suspend fun retrieveOne8(@Path("staffId") staffId: kotlin.Long): Response<RetrieveOneResponse>

    /**
     * Update a Staff Member
     * Updates the details of a staff member.
     * Responses:
     *  - 200: OK
     *
     * @param staffId staffId
     * @param putStaffRequest 
     * @return [UpdateStaffResponse]
     */
    @PUT("v1/staff/{staffId}")
    suspend fun update7(@Path("staffId") staffId: kotlin.Long, @Body putStaffRequest: PutStaffRequest): Response<UpdateStaffResponse>

}
