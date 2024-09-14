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
 *  PostLoansLoanIdChargesRequest
 *
 * @param amount
 * @param chargeId
 * @param dateFormat
 * @param dueDate
 * @param externalId
 * @param locale
 */

@Serializable
data class PostLoansLoanIdChargesRequest(

    val amount: kotlin.Double? = null,

    val chargeId: kotlin.Long? = null,

    val dateFormat: kotlin.String? = null,

    val dueDate: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val locale: kotlin.String? = null

)

