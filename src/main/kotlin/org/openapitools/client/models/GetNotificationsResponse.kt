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
 * GetNotificationsResponse
 *
 * @param pageItems
 * @param totalFilteredRecords
 */

@Serializable
data class GetNotificationsResponse(

    val pageItems: kotlin.collections.List<GetNotification>? = null,

    val totalFilteredRecords: kotlin.Int? = null

)

