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
 * PostGroupsRequest
 *
 * @param active
 * @param name
 * @param officeId
 */

@Serializable
data class PostGroupsRequest(

    val active: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null

)

