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
 * PostTaxesComponentsRequest
 *
 * @param creditAccountType
 * @param creditAcountId
 * @param dateFormat
 * @param locale
 * @param name
 * @param percentage
 * @param startDate
 */

@Serializable
data class PostTaxesComponentsRequest(

    val creditAccountType: kotlin.Int? = null,

    val creditAcountId: kotlin.Int? = null,

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val percentage: kotlin.Float? = null,

    val startDate: kotlin.String? = null

)

