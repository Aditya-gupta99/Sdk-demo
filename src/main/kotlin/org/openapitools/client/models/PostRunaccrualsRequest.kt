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
 * runaccrualsRequest
 *
 * @param tillDate which specifies periodic accruals should happen till the given Date
 * @param dateFormat
 * @param locale
 */

@Serializable
data class PostRunaccrualsRequest(

    val tillDate: kotlin.String,

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null

)

