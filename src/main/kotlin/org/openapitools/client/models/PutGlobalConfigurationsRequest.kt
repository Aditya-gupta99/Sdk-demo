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
 * PutGlobalConfigurationsRequest
 *
 * @param dateFormat
 * @param dateValue
 * @param enabled
 * @param locale
 * @param stringValue
 * @param `value`
 */

@Serializable
data class PutGlobalConfigurationsRequest(

    val dateFormat: kotlin.String? = null,

    val dateValue: kotlin.String? = null,

    val enabled: kotlin.Boolean? = null,

    val locale: kotlin.String? = null,

    val stringValue: kotlin.String? = null,

    val value: kotlin.Long? = null

)

