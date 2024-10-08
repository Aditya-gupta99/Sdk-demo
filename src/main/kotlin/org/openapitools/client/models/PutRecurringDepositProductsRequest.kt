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
 * PutRecurringDepositProductsRequest
 *
 * @param description
 * @param locale
 * @param minDepositTerm
 * @param minDepositTermTypeId
 */

@Serializable
data class PutRecurringDepositProductsRequest(

    val description: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermTypeId: kotlin.Int? = null

)

