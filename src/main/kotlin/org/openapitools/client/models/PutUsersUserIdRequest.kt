/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable

/**
 * PutUsersUserIdRequest
 *
 * @param clients
 * @param email
 * @param firstname
 * @param isSelfServiceUser
 * @param lastname
 * @param officeId
 * @param password
 * @param repeatPassword
 * @param roles
 * @param sendPasswordToEmail
 * @param staffId
 */

@Serializable
data class PutUsersUserIdRequest(

    val clients: kotlin.collections.List<kotlin.Long>? = null,

    val email: kotlin.String? = null,

    val firstname: kotlin.String? = null,

    val isSelfServiceUser: kotlin.Boolean? = null,

    val lastname: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val password: kotlin.String? = null,

    val repeatPassword: kotlin.String? = null,

    val roles: kotlin.collections.List<kotlin.Long>? = null,

    val sendPasswordToEmail: kotlin.Boolean? = null,

    val staffId: kotlin.Long? = null

)

