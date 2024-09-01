package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteRolesRoleIdResponse
import org.openapitools.client.models.GetRolesResponse
import org.openapitools.client.models.GetRolesRoleIdPermissionsResponse
import org.openapitools.client.models.GetRolesRoleIdResponse
import org.openapitools.client.models.PostRolesRequest
import org.openapitools.client.models.PostRolesResponse
import org.openapitools.client.models.PostRolesRoleIdResponse
import org.openapitools.client.models.PutRolesRoleIdPermissionsRequest
import org.openapitools.client.models.PutRolesRoleIdPermissionsResponse
import org.openapitools.client.models.PutRolesRoleIdRequest
import org.openapitools.client.models.PutRolesRoleIdResponse

interface RolesApi {
    /**
     * Enable Role | Disable Role
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param command command (optional)
     * @return [PostRolesRoleIdResponse]
     */
    @POST("v1/roles/{roleId}")
    suspend fun actionsOnRoles(@Path("roleId") roleId: kotlin.Long, @Query("command") command: kotlin.String? = null): Response<PostRolesRoleIdResponse>

    /**
     * Create a New Role
     * Mandatory Fields name, description
     * Responses:
     *  - 200: OK
     *
     * @param postRolesRequest 
     * @return [PostRolesResponse]
     */
    @POST("v1/roles")
    suspend fun createRole(@Body postRolesRequest: PostRolesRequest): Response<PostRolesResponse>

    /**
     * Delete a Role
     * Description : Delete the role in case role is not associated with any users.
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [DeleteRolesRoleIdResponse]
     */
    @DELETE("v1/roles/{roleId}")
    suspend fun deleteRole(@Path("roleId") roleId: kotlin.Long): Response<DeleteRolesRoleIdResponse>

    /**
     * List Roles
     * Example Requests:  roles   roles?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetRolesResponse>]
     */
    @GET("v1/roles")
    suspend fun retrieveAllRoles(): Response<kotlin.collections.List<GetRolesResponse>>

    /**
     * Retrieve a Role
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [GetRolesRoleIdResponse]
     */
    @GET("v1/roles/{roleId}")
    suspend fun retrieveRole(@Path("roleId") roleId: kotlin.Long): Response<GetRolesRoleIdResponse>

    /**
     * Retrieve a Role&#39;s Permissions
     * Example Requests:  roles/1/permissions
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [GetRolesRoleIdPermissionsResponse]
     */
    @GET("v1/roles/{roleId}/permissions")
    suspend fun retrieveRolePermissions(@Path("roleId") roleId: kotlin.Long): Response<GetRolesRoleIdPermissionsResponse>

    /**
     * Update a Role
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param putRolesRoleIdRequest 
     * @return [PutRolesRoleIdResponse]
     */
    @PUT("v1/roles/{roleId}")
    suspend fun updateRole(@Path("roleId") roleId: kotlin.Long, @Body putRolesRoleIdRequest: PutRolesRoleIdRequest): Response<PutRolesRoleIdResponse>

    /**
     * Update a Role&#39;s Permissions
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param putRolesRoleIdPermissionsRequest 
     * @return [PutRolesRoleIdPermissionsResponse]
     */
    @PUT("v1/roles/{roleId}/permissions")
    suspend fun updateRolePermissions(@Path("roleId") roleId: kotlin.Long, @Body putRolesRoleIdPermissionsRequest: PutRolesRoleIdPermissionsRequest): Response<PutRolesRoleIdPermissionsResponse>

}
