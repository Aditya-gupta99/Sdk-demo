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
 *
 *
 * @param code
 * @param deposit
 * @param description
 * @param feeDeduction
 * @param id
 * @param interestPosting
 * @param withdrawal
 */

@Serializable
data class GetSelfSavingsTransactionType(

    val code: kotlin.String? = null,

    val deposit: kotlin.Boolean? = null,

    val description: kotlin.String? = null,

    val feeDeduction: kotlin.Boolean? = null,

    val id: kotlin.Int? = null,

    val interestPosting: kotlin.Boolean? = null,

    val withdrawal: kotlin.Boolean? = null

)

