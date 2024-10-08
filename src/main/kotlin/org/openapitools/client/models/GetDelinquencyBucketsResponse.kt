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
 * GetDelinquencyBucketsResponse
 *
 * @param id
 * @param name
 * @param ranges
 */

@Serializable
data class GetDelinquencyBucketsResponse(

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val ranges: kotlin.collections.List<GetDelinquencyRangesResponse>? = null

)

