package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.GetPermissionsResponse
import org.openapitools.client.models.PutPermissionsRequest

interface PermissionsApi {
    /**
     * List Application Permissions
     * ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetPermissionsResponse>]
     */
    @GET("v1/permissions")
    suspend fun retrieveAllPermissions(): Response<kotlin.collections.List<GetPermissionsResponse>>

    /**
     * Enable/Disable Permissions for Maker Checker
     * 
     * Responses:
     *  - 200: OK
     *
     * @param putPermissionsRequest 
     * @return [CommandProcessingResult]
     */
    @PUT("v1/permissions")
    suspend fun updatePermissionsDetails(@Body putPermissionsRequest: PutPermissionsRequest): Response<CommandProcessingResult>

}
