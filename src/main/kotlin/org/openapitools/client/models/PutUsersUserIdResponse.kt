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
 * PutUsersUserIdResponse
 *
 * @param changes
 * @param officeId
 * @param resourceId
 */

@Serializable
data class PutUsersUserIdResponse(

    val changes: PutUsersUserIdResponseChanges? = null,

    val officeId: kotlin.Long? = null,

    val resourceId: kotlin.Long? = null

)

