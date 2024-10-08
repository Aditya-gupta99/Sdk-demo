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
 * PostLoansLoanIdTransactionsRequest
 *
 * @param accountNumber
 * @param bankNumber
 * @param chargeOffReasonId
 * @param checkNumber
 * @param dateFormat
 * @param dueDate
 * @param externalId
 * @param loanChargeId
 * @param locale
 * @param note
 * @param paymentTypeId
 * @param receiptNumber
 * @param reversalExternalId
 * @param routingCode
 * @param transactionAmount
 * @param transactionDate
 * @param writeoffReasonId
 */

@Serializable
data class PostLoansLoanIdTransactionsRequest(

    val accountNumber: kotlin.String? = null,

    val bankNumber: kotlin.String? = null,

    val chargeOffReasonId: kotlin.Long? = null,

    val checkNumber: kotlin.String? = null,

    val dateFormat: kotlin.String? = null,

    val dueDate: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val loanChargeId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val note: kotlin.String? = null,

    val paymentTypeId: kotlin.Long? = null,

    val receiptNumber: kotlin.String? = null,

    val reversalExternalId: kotlin.String? = null,

    val routingCode: kotlin.String? = null,

    val transactionAmount: kotlin.Double? = null,

    val transactionDate: kotlin.String? = null,

    val writeoffReasonId: kotlin.Long? = null

)

