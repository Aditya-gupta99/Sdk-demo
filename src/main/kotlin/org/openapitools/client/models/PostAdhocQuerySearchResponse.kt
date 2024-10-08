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
 * PostAdhocQuerySearchResponse
 *
 * @param loanOutStanding
 * @param loanProductName
 * @param officeName
 * @param percentage
 */

@Serializable
data class PostAdhocQuerySearchResponse(

    val loanOutStanding: kotlin.Long? = null,

    val loanProductName: kotlin.String? = null,

    val officeName: kotlin.String? = null,

    val percentage: kotlin.Long? = null

)

