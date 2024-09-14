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
 * PostTaxesGroupRequest
 *
 * @param dateFormat
 * @param locale
 * @param name
 * @param taxComponents
 */

@Serializable
data class PostTaxesGroupRequest(

    val dateFormat: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val taxComponents: kotlin.collections.Set<PostTaxesGroupTaxComponents>? = null

)

