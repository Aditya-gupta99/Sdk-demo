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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountNumber
 * @param accountingRuleId
 * @param amount
 * @param bankNumber
 * @param checkNumber
 * @param comments
 * @param credits
 * @param currencyCode
 * @param debits
 * @param officeId
 * @param paymentTypeId
 * @param receiptNumber
 * @param referenceNumber
 * @param routingCode
 * @param transactionDate
 */

@Serializable
data class JournalEntryCommand(

    val accountNumber: kotlin.String? = null,

    val accountingRuleId: kotlin.Long? = null,

    @Contextual
    val amount: java.math.BigDecimal? = null,

    val bankNumber: kotlin.String? = null,

    val checkNumber: kotlin.String? = null,

    val comments: kotlin.String? = null,

    val credits: kotlin.collections.List<SingleDebitOrCreditEntryCommand>? = null,

    val currencyCode: kotlin.String? = null,

    val debits: kotlin.collections.List<SingleDebitOrCreditEntryCommand>? = null,

    val officeId: kotlin.Long? = null,

    val paymentTypeId: kotlin.Long? = null,

    val receiptNumber: kotlin.String? = null,

    val referenceNumber: kotlin.String? = null,

    val routingCode: kotlin.String? = null,

    @Contextual
    val transactionDate: java.time.LocalDate? = null

)

